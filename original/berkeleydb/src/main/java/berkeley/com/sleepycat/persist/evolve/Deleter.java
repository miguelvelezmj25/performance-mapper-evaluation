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

package berkeley.com.sleepycat.persist.evolve;

/**
 * A mutation for deleting an entity class or field.
 * <p>
 * <p><strong>WARNING:</strong> The data for the deleted class or field will be
 * destroyed and will be recoverable only by restoring from backup.  If you
 * wish to convert the instance data to a different type or format, use a
 * {@link Conversion} mutation instead.</p>
 * <p>
 * <p>For example, to delete a field:</p>
 * <p>
 * <pre class="code">
 * package my.package;
 * <p>
 * // The old class.  Version 0 is implied.
 * //
 * {@literal @Entity}
 * class Person {
 * String name;
 * String favoriteColors;
 * }
 * <p>
 * // The new class.  A new version number must be assigned.
 * //
 * {@literal @Entity(version=1)}
 * class Person {
 * String name;
 * }
 * <p>
 * // Add the mutation for deleting a field.
 * //
 * Mutations mutations = new Mutations();
 * <p>
 * mutations.addDeleter(new Deleter(Person.class.getName(), 0,
 * "favoriteColors");
 * <p>
 * // Configure the mutations as described {@link Mutations here}.</pre>
 * <p>
 * <p>To delete an entity class:</p>
 * <p>
 * <pre class="code">
 * package my.package;
 * <p>
 * // The old class.  Version 0 is implied.
 * //
 * {@literal @Entity}
 * class Statistics {
 * ...
 * }
 * <p>
 * // Add the mutation for deleting a class.
 * //
 * Mutations mutations = new Mutations();
 * <p>
 * mutations.addDeleter(new Deleter("my.package.Statistics", 0));
 * <p>
 * // Configure the mutations as described {@link Mutations here}.</pre>
 *
 * @author Mark Hayes
 * @see com.sleepycat.persist.evolve Class Evolution
 */
public class Deleter extends Mutation {

    private static final long serialVersionUID = 446348511871654947L;

    /**
     * Creates a mutation for deleting an entity class.
     *
     * @param className    the class to which this mutation applies.
     * @param classVersion the class version to which this mutation applies.
     */
    public Deleter(String className, int classVersion) {
        super(className, classVersion, null);
    }

    /**
     * Creates a mutation for deleting the given field from all instances of
     * the given class version.
     *
     * @param declaringClass        the class to which this mutation applies.
     * @param declaringClassVersion the class version to which this mutation
     *                              applies.
     * @param fieldName             field name to which this mutation applies.
     */
    public Deleter(String declaringClass, int declaringClassVersion,
                   String fieldName) {
        super(declaringClass, declaringClassVersion, fieldName);
    }

    @Override
    public String toString() {
        return "[Deleter " + super.toString() + ']';
    }
}
