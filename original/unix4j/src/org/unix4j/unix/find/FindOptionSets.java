package org.unix4j.unix.find;

import org.unix4j.unix.Find;

/**
 * Options for the {@link Find find} command with the
 * the following options:
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
 * <p>
 * This class serves as entry point to every possible set of {@code find} options
 * defined as an enum constant. With this explicit expansion of all possible
 * option combinations, options can be passed to the command in a very compact
 * form, such as:
 * <pre>
 * find(Find.Options.d, ...);
 * find(Find.Options.d.f, ...);
 * ...
 * find(Find.Options.d.f.l.x.r.i.n.o.c.a.m.z, ...);
 * </pre>
 */
public final class FindOptionSets {
    /**
     * The singleton instance.
     */
    public static final FindOptionSets INSTANCE = new FindOptionSets();

    /**
     * Option {@code "-i"}: Use case insensitive matching when applying the file name pattern
     * specified by the name operand
     * <p>
     * (This option is ignored if no name operand is specified).
     * <p>
     * The option {@code "-i"} is equivalent to the {@code "--}{@link #ignoreCase ignoreCase}{@code "} option.
     */
    public final FindOptionSet_acdfilmnorxz i = FindOptionSet_acdfilmnorxz.Active_i;
    /**
     * Option {@code "--ignoreCase"}: Use case insensitive matching when applying the file name pattern
     * specified by the name operand
     * <p>
     * (This option is ignored if no name operand is specified).
     * <p>
     * The option {@code "--ignoreCase"} is equivalent to the {@code "-}{@link #i i}{@code "} option.
     */
    public final FindOptionSet_acdfilmnorxz ignoreCase = FindOptionSet_acdfilmnorxz.Active_i_long;
    /**
     * Option {@code "-z"}: Print the full file name on the standard output, followed by a null
     * character (instead of the newline character used by default). This
     * allows file names that contain newlines or other types of white
     * space to be correctly interpreted by programs that process the find
     * output. This option corresponds to the --delimiter0 option of xargs.
     * <p>
     * The option {@code "-z"} is equivalent to the {@code "--}{@link #print0 print0}{@code "} option.
     */
    public final FindOptionSet_acdfilmnorxz z = FindOptionSet_acdfilmnorxz.Active_z;
    /**
     * Option {@code "--print0"}: Print the full file name on the standard output, followed by a null
     * character (instead of the newline character used by default). This
     * allows file names that contain newlines or other types of white
     * space to be correctly interpreted by programs that process the find
     * output. This option corresponds to the --delimiter0 option of xargs.
     * <p>
     * The option {@code "--print0"} is equivalent to the {@code "-}{@link #z z}{@code "} option.
     */
    public final FindOptionSet_acdfilmnorxz print0 = FindOptionSet_acdfilmnorxz.Active_z_long;
    /**
     * Option {@code "-r"}: Use full regular expression syntax for the patterns specified by the
     * name operand
     * <p>
     * (This option is ignored if no name operand is specified).
     * <p>
     * The option {@code "-r"} is equivalent to the {@code "--}{@link #regex regex}{@code "} option.
     */
    public final FindOptionSet_acdfilmnorxz r = FindOptionSet_acdfilmnorxz.Active_r;
    /**
     * Option {@code "--regex"}: Use full regular expression syntax for the patterns specified by the
     * name operand
     * <p>
     * (This option is ignored if no name operand is specified).
     * <p>
     * The option {@code "--regex"} is equivalent to the {@code "-}{@link #r r}{@code "} option.
     */
    public final FindOptionSet_acdfilmnorxz regex = FindOptionSet_acdfilmnorxz.Active_r_long;
    /**
     * Option {@code "-a"}: The time operand refers to the last access time of the file
     * <p>
     * (This option is ignored if no time operand is specified).
     * <p>
     * The option {@code "-a"} is equivalent to the {@code "--}{@link #timeAccess timeAccess}{@code "} option.
     */
    public final FindOptionSet_adfilnorxz a = FindOptionSet_adfilnorxz.Active_a;
    /**
     * Option {@code "--timeAccess"}: The time operand refers to the last access time of the file
     * <p>
     * (This option is ignored if no time operand is specified).
     * <p>
     * The option {@code "--timeAccess"} is equivalent to the {@code "-}{@link #a a}{@code "} option.
     */
    public final FindOptionSet_adfilnorxz timeAccess = FindOptionSet_adfilnorxz.Active_a_long;
    /**
     * Option {@code "-c"}: The time operand refers to the creation time of the file
     * <p>
     * (This option is ignored if no time operand is specified).
     * <p>
     * The option {@code "-c"} is equivalent to the {@code "--}{@link #timeCreate timeCreate}{@code "} option.
     */
    public final FindOptionSet_cdfilnorxz c = FindOptionSet_cdfilnorxz.Active_c;
    /**
     * Option {@code "--timeCreate"}: The time operand refers to the creation time of the file
     * <p>
     * (This option is ignored if no time operand is specified).
     * <p>
     * The option {@code "--timeCreate"} is equivalent to the {@code "-}{@link #c c}{@code "} option.
     */
    public final FindOptionSet_cdfilnorxz timeCreate = FindOptionSet_cdfilnorxz.Active_c_long;
    /**
     * Option {@code "-m"}: The time operand refers to the last modification time of the file
     * (the default)
     * <p>
     * (This option is ignored if no time operand is specified).
     * <p>
     * The option {@code "-m"} is equivalent to the {@code "--}{@link #timeModified timeModified}{@code "} option.
     */
    public final FindOptionSet_dfilmnorxz m = FindOptionSet_dfilmnorxz.Active_m;
    /**
     * Option {@code "--timeModified"}: The time operand refers to the last modification time of the file
     * (the default)
     * <p>
     * (This option is ignored if no time operand is specified).
     * <p>
     * The option {@code "--timeModified"} is equivalent to the {@code "-}{@link #m m}{@code "} option.
     */
    public final FindOptionSet_dfilmnorxz timeModified = FindOptionSet_dfilmnorxz.Active_m_long;
    /**
     * Option {@code "-n"}: Consider only files that have been created, modified or accessed
     * after or at the time specified by the time operand (the default)
     * <p>
     * (This option is ignored if no time operand is specified).
     * <p>
     * The option {@code "-n"} is equivalent to the {@code "--}{@link #timeNewer timeNewer}{@code "} option.
     */
    public final FindOptionSet_acdfilmnorxz n = FindOptionSet_acdfilmnorxz.Active_n;
    /**
     * Option {@code "--timeNewer"}: Consider only files that have been created, modified or accessed
     * after or at the time specified by the time operand (the default)
     * <p>
     * (This option is ignored if no time operand is specified).
     * <p>
     * The option {@code "--timeNewer"} is equivalent to the {@code "-}{@link #n n}{@code "} option.
     */
    public final FindOptionSet_acdfilmnorxz timeNewer = FindOptionSet_acdfilmnorxz.Active_n_long;
    /**
     * Option {@code "-o"}: Consider only files that have been created, modified or accessed
     * before or at the time specified by the time operand
     * <p>
     * (This option is ignored if no time operand is specified).
     * <p>
     * The option {@code "-o"} is equivalent to the {@code "--}{@link #timeOlder timeOlder}{@code "} option.
     */
    public final FindOptionSet_acdfilmnorxz o = FindOptionSet_acdfilmnorxz.Active_o;
    /**
     * Option {@code "--timeOlder"}: Consider only files that have been created, modified or accessed
     * before or at the time specified by the time operand
     * <p>
     * (This option is ignored if no time operand is specified).
     * <p>
     * The option {@code "--timeOlder"} is equivalent to the {@code "-}{@link #o o}{@code "} option.
     */
    public final FindOptionSet_acdfilmnorxz timeOlder = FindOptionSet_acdfilmnorxz.Active_o_long;
    /**
     * Option {@code "-d"}: Consider only directories
     * <p>
     * The option {@code "-d"} is equivalent to the {@code "--}{@link #typeDirectory typeDirectory}{@code "} option.
     */
    public final FindOptionSet_acdimnorz d = FindOptionSet_acdimnorz.Active_d;
    /**
     * Option {@code "--typeDirectory"}: Consider only directories
     * <p>
     * The option {@code "--typeDirectory"} is equivalent to the {@code "-}{@link #d d}{@code "} option.
     */
    public final FindOptionSet_acdimnorz typeDirectory = FindOptionSet_acdimnorz.Active_d_long;
    /**
     * Option {@code "-f"}: Consider only regular files
     * <p>
     * The option {@code "-f"} is equivalent to the {@code "--}{@link #typeFile typeFile}{@code "} option.
     */
    public final FindOptionSet_acfimnorz f = FindOptionSet_acfimnorz.Active_f;
    /**
     * Option {@code "--typeFile"}: Consider only regular files
     * <p>
     * The option {@code "--typeFile"} is equivalent to the {@code "-}{@link #f f}{@code "} option.
     */
    public final FindOptionSet_acfimnorz typeFile = FindOptionSet_acfimnorz.Active_f_long;
    /**
     * Option {@code "-x"}: Consider only files that are neither of directory (d),
     * regular file (f) or symlink (l).
     * <p>
     * The option {@code "-x"} is equivalent to the {@code "--}{@link #typeOther typeOther}{@code "} option.
     */
    public final FindOptionSet_acimnorxz x = FindOptionSet_acimnorxz.Active_x;
    /**
     * Option {@code "--typeOther"}: Consider only files that are neither of directory (d),
     * regular file (f) or symlink (l).
     * <p>
     * The option {@code "--typeOther"} is equivalent to the {@code "-}{@link #x x}{@code "} option.
     */
    public final FindOptionSet_acimnorxz typeOther = FindOptionSet_acimnorxz.Active_x_long;
    /**
     * Option {@code "-l"}: Consider only symbolic links
     * <p>
     * The option {@code "-l"} is equivalent to the {@code "--}{@link #typeSymlink typeSymlink}{@code "} option.
     */
    public final FindOptionSet_acilmnorz l = FindOptionSet_acilmnorz.Active_l;
    /**
     * Option {@code "--typeSymlink"}: Consider only symbolic links
     * <p>
     * The option {@code "--typeSymlink"} is equivalent to the {@code "-}{@link #l l}{@code "} option.
     */
    public final FindOptionSet_acilmnorz typeSymlink = FindOptionSet_acilmnorz.Active_l_long;

}
