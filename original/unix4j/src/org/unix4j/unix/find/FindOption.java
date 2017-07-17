package org.unix4j.unix.find;

import org.unix4j.option.Option;
import org.unix4j.unix.Find;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Options for the {@link Find find} command.
 * <p>
 * For most applications, it may be more convenient to use {@link Find#Options}
 * instead of the option constants defined here.
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -d}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --typeDirectory}</td><td>&nbsp;</td><td>Consider only directories</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -f}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --typeFile}</td><td>&nbsp;</td><td>Consider only regular files</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -l}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --typeSymlink}</td><td>&nbsp;</td><td>Consider only symbolic links</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -x}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --typeOther}</td><td>&nbsp;</td><td>Consider only files that are neither of directory (d),
 * regular file (f) or symlink (l).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -r}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --regex}</td><td>&nbsp;</td><td>Use full regular expression syntax for the patterns specified by the
 * name operand
 * <p>
 * (This option is ignored if no name operand is specified).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -i}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --ignoreCase}</td><td>&nbsp;</td><td>Use case insensitive matching when applying the file name pattern
 * specified by the name operand
 * <p>
 * (This option is ignored if no name operand is specified).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -n}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --timeNewer}</td><td>&nbsp;</td><td>Consider only files that have been created, modified or accessed
 * after or at the time specified by the time operand (the default)
 * <p>
 * (This option is ignored if no time operand is specified).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -o}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --timeOlder}</td><td>&nbsp;</td><td>Consider only files that have been created, modified or accessed
 * before or at the time specified by the time operand
 * <p>
 * (This option is ignored if no time operand is specified).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -c}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --timeCreate}</td><td>&nbsp;</td><td>The time operand refers to the creation time of the file
 * <p>
 * (This option is ignored if no time operand is specified).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -a}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --timeAccess}</td><td>&nbsp;</td><td>The time operand refers to the last access time of the file
 * <p>
 * (This option is ignored if no time operand is specified).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -m}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --timeModified}</td><td>&nbsp;</td><td>The time operand refers to the last modification time of the file
 * (the default)
 * <p>
 * (This option is ignored if no time operand is specified).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -z}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --print0}</td><td>&nbsp;</td><td>Print the full file name on the standard output, followed by a null
 * character (instead of the newline character used by default). This
 * allows file names that contain newlines or other types of white
 * space to be correctly interpreted by programs that process the find
 * output. This option corresponds to the --delimiter0 option of xargs.</td></tr>
 * </table>
 */
public enum FindOption implements Option, FindOptions {
    /**
     * Option <b>{@code --typeDirectory}</b>, <b>{@code -d}</b>:
     * Consider only directories
     */
    typeDirectory('d'),
    /**
     * Option <b>{@code --typeFile}</b>, <b>{@code -f}</b>:
     * Consider only regular files
     */
    typeFile('f'),
    /**
     * Option <b>{@code --typeSymlink}</b>, <b>{@code -l}</b>:
     * Consider only symbolic links
     */
    typeSymlink('l'),
    /**
     * Option <b>{@code --typeOther}</b>, <b>{@code -x}</b>:
     * Consider only files that are neither of directory (d),
     * regular file (f) or symlink (l).
     */
    typeOther('x'),
    /**
     * Option <b>{@code --regex}</b>, <b>{@code -r}</b>:
     * Use full regular expression syntax for the patterns specified by the
     * name operand
     * <p>
     * (This option is ignored if no name operand is specified).
     */
    regex('r'),
    /**
     * Option <b>{@code --ignoreCase}</b>, <b>{@code -i}</b>:
     * Use case insensitive matching when applying the file name pattern
     * specified by the name operand
     * <p>
     * (This option is ignored if no name operand is specified).
     */
    ignoreCase('i'),
    /**
     * Option <b>{@code --timeNewer}</b>, <b>{@code -n}</b>:
     * Consider only files that have been created, modified or accessed
     * after or at the time specified by the time operand (the default)
     * <p>
     * (This option is ignored if no time operand is specified).
     */
    timeNewer('n'),
    /**
     * Option <b>{@code --timeOlder}</b>, <b>{@code -o}</b>:
     * Consider only files that have been created, modified or accessed
     * before or at the time specified by the time operand
     * <p>
     * (This option is ignored if no time operand is specified).
     */
    timeOlder('o'),
    /**
     * Option <b>{@code --timeCreate}</b>, <b>{@code -c}</b>:
     * The time operand refers to the creation time of the file
     * <p>
     * (This option is ignored if no time operand is specified).
     */
    timeCreate('c'),
    /**
     * Option <b>{@code --timeAccess}</b>, <b>{@code -a}</b>:
     * The time operand refers to the last access time of the file
     * <p>
     * (This option is ignored if no time operand is specified).
     */
    timeAccess('a'),
    /**
     * Option <b>{@code --timeModified}</b>, <b>{@code -m}</b>:
     * The time operand refers to the last modification time of the file
     * (the default)
     * <p>
     * (This option is ignored if no time operand is specified).
     */
    timeModified('m'),
    /**
     * Option <b>{@code --print0}</b>, <b>{@code -z}</b>:
     * Print the full file name on the standard output, followed by a null
     * character (instead of the newline character used by default). This
     * allows file names that contain newlines or other types of white
     * space to be correctly interpreted by programs that process the find
     * output. This option corresponds to the --delimiter0 option of xargs.
     */
    print0('z');

    private final char acronym;

    private FindOption(char acronym) {
        this.acronym = acronym;
    }

    /**
     * Returns the option with the given {@code acronym}, or {@code null} if no
     * such option is found.
     *
     * @param acronym the option {@link #acronym() acronym}
     * @return the option with the given {@code acronym} or {@code null} if it
     * is not found
     */
    public static FindOption findByAcronym(char acronym) {
        for(final FindOption opt : values()) {
            if(opt.acronym() == acronym) {
                return opt;
            }
        }
        return null;
    }

    @Override
    public Class<FindOption> optionType() {
        return FindOption.class;
    }

    @Override
    public char acronym() {
        return acronym;
    }

    @Override
    public boolean isSet(FindOption option) {
        return equals(option);
    }

    /**
     * Returns a new set with {@code this} active option.
     *
     * @return a new set containing this option
     */
    @Override
    public EnumSet<FindOption> asSet() {
        return EnumSet.of(this);
    }

    /**
     * Returns an immutable iterator returning o single element: {@code this}
     * option.
     *
     * @return an immutable iterator with {@code this} active option.
     */
    @Override
    public Iterator<FindOption> iterator() {
        return Collections.singleton(this).iterator();
    }

    /**
     * Returns 1 as this is a set with a single element: {@code this} option
     *
     * @return one
     */
    @Override
    public int size() {
        return 1;
    }

    /**
     * Returns true if the {@link Option#acronym() acronym} should be used for
     * the specified {@code option} in string representations.
     * <p>
     * This method returns always true for all options.
     *
     * @param option the option of interest
     * @return always true indicating that option acronyms should be used in
     * string representations for all options
     */
    @Override
    public boolean useAcronymFor(FindOption option) {
        return true;
    }
}
