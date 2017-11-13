/*-
 * Copyright (C) 2002, 2017, Oracle and/or its affiliates. All rights reserved.
 *
 * This file was distributed by Oracle as part of a version of Oracle Berkeley
 * DB Java Edition made available at:
 *
 * http://www.oracle.com/technetwork/database/database-technologies/berkeleydb/downloads/index.html
 *
 * Please see the LICENSE file included in the top-level directory of the
 * appropriate version of Oracle Berkeley DB Java Edition for a copy of the
 * license and additional information.
 */

package berkeley.com.sleepycat.persist.impl;

import berkeley.com.sleepycat.bind.tuple.TupleBase;
import berkeley.com.sleepycat.compat.DbCompat;
import berkeley.com.sleepycat.je.DatabaseEntry;
import berkeley.com.sleepycat.je.DatabaseException;
import berkeley.com.sleepycat.je.Sequence;

/**
 * Assigns primary keys from a Sequence.
 * <p>
 * This class is used directly by PrimaryIndex, not via an interface.  To avoid
 * making a public interface, the PersistEntityBinding contains a reference to
 * a PersistKeyAssigner, and the PrimaryIndex gets the key assigner from the
 * binding.  See the PrimaryIndex constructor for more information.
 *
 * @author Mark Hayes
 */
public class PersistKeyAssigner {

    private final boolean rawAccess;
    private final Sequence sequence;
    /* See Store.refresh for an explanation of the use of volatile fields. */
    private volatile Catalog catalog;
    private volatile Format keyFieldFormat;
    private volatile Format entityFormat;

    PersistKeyAssigner(PersistKeyBinding keyBinding,
                       PersistEntityBinding entityBinding,
                       Sequence sequence) {
        catalog = keyBinding.catalog;
        /* getSequenceKeyFormat will validate the field type for a sequence. */
        keyFieldFormat = keyBinding.keyFormat.getSequenceKeyFormat();
        entityFormat = entityBinding.entityFormat;
        rawAccess = entityBinding.rawAccess;
        this.sequence = sequence;
    }

    public boolean assignPrimaryKey(Object entity, DatabaseEntry key)
            throws DatabaseException {

        try {
            return assignPrimaryKeyInternal(entity, key);
        } catch(RefreshException e) {
            e.refresh();
            try {
                return assignPrimaryKeyInternal(entity, key);
            } catch(RefreshException e2) {
                throw DbCompat.unexpectedException(e2);
            }
        }
    }

    private boolean assignPrimaryKeyInternal(Object entity, DatabaseEntry key)
            throws DatabaseException, RefreshException {
            
        /*
         * The keyFieldFormat is the format of a simple integer field.  For a
         * composite key class it is the contained integer field.  By writing
         * the Long sequence value using that format, the output data can then
         * be read to construct the actual key instance, whether it is a simple
         * or composite key class, and assign it to the primary key field in
         * the entity object.
         */
        if(entityFormat.isPriKeyNullOrZero(entity, rawAccess)) {
            Long value = sequence.get(null, 1);
            RecordOutput output = new RecordOutput(catalog, rawAccess);
            keyFieldFormat.writeObject(value, output, rawAccess);
            TupleBase.outputToEntry(output, key);
            EntityInput input = new RecordInput
                    (catalog, rawAccess, null, 0,
                            key.getData(), key.getOffset(), key.getSize());
            entityFormat.getReader().readPriKey(entity, input, rawAccess);
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * See Store.refresh.
     */
    void refresh(final PersistCatalog newCatalog) {
        catalog = newCatalog;
        entityFormat = catalog.getFormat(entityFormat.getClassName());
        keyFieldFormat = catalog.getFormat(keyFieldFormat.getClassName());
    }
}
