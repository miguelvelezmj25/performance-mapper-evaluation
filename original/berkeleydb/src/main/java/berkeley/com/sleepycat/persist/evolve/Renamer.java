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
 * A mutation for renaming a class or field without changing the instance or
 * field value.  For example:
 * <pre class="code">
 *  package my.package;
 *
 *  // The old class.  Version 0 is implied.
 *  //
 *  {@literal @Entity}
 *  class Person {
 *      String name;
 *  }
 *
 *  // The new class.  A new version number must be assigned.
 *  //
 *  {@literal @Entity(version=1)}
 *  class Human {
 *      String fullName;
 *  }
 *
 *  // Add the mutations.
 *  //
 *  Mutations mutations = new Mutations();
 *
 *  mutations.addRenamer(new Renamer("my.package.Person", 0,
 *                                   Human.class.getName()));
 *
 *  mutations.addRenamer(new Renamer("my.package.Person", 0,
 *                                   "name", "fullName"));
 *
 *  // Configure the mutations as described {@link Mutations here}.</pre>
 *
 * <!-- begin JE only -->
 * <p>In a replicated environment, renaming an entity class or secondary key
 * field may require handling the {@link
 * com.sleepycat.je.rep.DatabasePreemptedException} during the upgrade process.
 * See
 * <a href="package-summary.html#repUpgrade">Upgrading a Replication Group</a>
 * for more information.</p>
 * <!-- end JE only -->
 *
 * @see com.sleepycat.persist.evolve Class Evolution
 * @author Mark Hayes
 */
public class Renamer extends Mutation {

    private static final long serialVersionUID = 2238151684405810427L;

    private String newName;

    /**
     * Creates a mutation for renaming the class of all instances of the given
     * class version.
     *
     * @param fromClass the class to rename.
     * @param fromVersion the class version to rename.
     * @param toClass the new class name.
     */
    public Renamer(String fromClass, int fromVersion, String toClass) {
        super(fromClass, fromVersion, null);
        newName = toClass;
    }

    /**
     * Creates a mutation for renaming the given field for all instances of the
     * given class version.
     *
     * @param declaringClass the class to which this mutation applies.
     * @param declaringClassVersion the class version to which this mutation
     * applies.
     * @param fromField field name in the given class version.
     * @param toField the new field name.
     */
    public Renamer(String declaringClass, int declaringClassVersion,
                   String fromField, String toField) {
        super(declaringClass, declaringClassVersion, fromField);
        newName = toField;
    }

    /**
     * Returns the new class or field name specified in the constructor.
     *
     * @return the new name.
     */
    public String getNewName() {
        return newName;
    }

    /**
     * Returns true if the new class name is equal in this object and given
     * object, and if the {@link Mutation#equals} method returns true.
     */
    @Override
    public boolean equals(Object other) {
        if (other instanceof Renamer) {
            Renamer o = (Renamer) other;
            return newName.equals(o.newName) &&
                   super.equals(other);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return newName.hashCode() + super.hashCode();
    }

    @Override
    public String toString() {
        return "[Renamer " + super.toString() +
               " NewName: " + newName + ']';
    }
}
