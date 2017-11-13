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

package berkeley.com.sleepycat.je;

/**
 * Thrown by {@link Sequence#get Sequence.get} if the sequence record has been
 * deleted.
 * <p>
 * <p>The {@link Transaction} handle is <em>not</em> invalidated as a result of
 * this exception.</p>
 *
 * @since 4.0
 */
public class SequenceIntegrityException extends OperationFailureException {

    private static final long serialVersionUID = 1;

    /**
     * For internal use only.
     *
     * @hidden
     */
    public SequenceIntegrityException(String message) {
        super(null /*locker*/, false /*abortOnly*/, message, null /*cause*/);
    }

    /**
     * For internal use only.
     *
     * @hidden
     */
    private SequenceIntegrityException(String message,
                                       SequenceIntegrityException cause) {
        super(message, cause);
    }

    /**
     * For internal use only.
     *
     * @hidden
     */
    @Override
    public OperationFailureException wrapSelf(String msg) {
        return new SequenceIntegrityException(msg, this);
    }
}
