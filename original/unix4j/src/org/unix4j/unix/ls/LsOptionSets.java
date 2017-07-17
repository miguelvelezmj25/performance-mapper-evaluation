package org.unix4j.unix.ls;

import org.unix4j.unix.Ls;

/**
 * Options for the {@link Ls ls} command with the
 * the following options:
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -a}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --allFiles}</td><td>&nbsp;</td><td>Lists all files in the given directory, including hidden files
 * (those whose names start with \".\" in Unix). By default, these
 * files are excluded from the list.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -h}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --humanReadable}</td><td>&nbsp;</td><td>Print sizes in human readable format. (e.g., 1K, 234M, 2G, etc.)</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -l}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --longFormat}</td><td>&nbsp;</td><td>Long format, displaying file types, permissions, number of hard
 * links, owner, group, size, date, and filename.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -R}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --recurseSubdirs}</td><td>&nbsp;</td><td>Recursively lists subdirectories encountered.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -r}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --reverseOrder}</td><td>&nbsp;</td><td>Reverses the order of the sort to get reverse collating sequence or
 * oldest first.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -t}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --timeSorted}</td><td>&nbsp;</td><td>Sorts with the primary key being time modified (most recently
 * modified first) and the secondary key being filename in the
 * collating sequence.</td></tr>
 * </table>
 * <p>
 * This class serves as entry point to every possible set of {@code ls} options
 * defined as an enum constant. With this explicit expansion of all possible
 * option combinations, options can be passed to the command in a very compact
 * form, such as:
 * <pre>
 * ls(Ls.Options.a, ...);
 * ls(Ls.Options.a.h, ...);
 * ...
 * ls(Ls.Options.a.h.l.R.r.t, ...);
 * </pre>
 */
public final class LsOptionSets {
    /**
     * The singleton instance.
     */
    public static final LsOptionSets INSTANCE = new LsOptionSets();

    /**
     * Option {@code "-a"}: Lists all files in the given directory, including hidden files
     * (those whose names start with \".\" in Unix). By default, these
     * files are excluded from the list.
     * <p>
     * The option {@code "-a"} is equivalent to the {@code "--}{@link #allFiles allFiles}{@code "} option.
     */
    public final LsOptionSet_Rahlrt a = LsOptionSet_Rahlrt.Active_a;
    /**
     * Option {@code "--allFiles"}: Lists all files in the given directory, including hidden files
     * (those whose names start with \".\" in Unix). By default, these
     * files are excluded from the list.
     * <p>
     * The option {@code "--allFiles"} is equivalent to the {@code "-}{@link #a a}{@code "} option.
     */
    public final LsOptionSet_Rahlrt allFiles = LsOptionSet_Rahlrt.Active_a_long;
    /**
     * Option {@code "-h"}: Print sizes in human readable format. (e.g., 1K, 234M, 2G, etc.)
     * <p>
     * The option {@code "-h"} is equivalent to the {@code "--}{@link #humanReadable humanReadable}{@code "} option.
     */
    public final LsOptionSet_Rahlrt h = LsOptionSet_Rahlrt.Active_h;
    /**
     * Option {@code "--humanReadable"}: Print sizes in human readable format. (e.g., 1K, 234M, 2G, etc.)
     * <p>
     * The option {@code "--humanReadable"} is equivalent to the {@code "-}{@link #h h}{@code "} option.
     */
    public final LsOptionSet_Rahlrt humanReadable = LsOptionSet_Rahlrt.Active_h_long;
    /**
     * Option {@code "-l"}: Long format, displaying file types, permissions, number of hard
     * links, owner, group, size, date, and filename.
     * <p>
     * The option {@code "-l"} is equivalent to the {@code "--}{@link #longFormat longFormat}{@code "} option.
     */
    public final LsOptionSet_Rahlrt l = LsOptionSet_Rahlrt.Active_l;
    /**
     * Option {@code "--longFormat"}: Long format, displaying file types, permissions, number of hard
     * links, owner, group, size, date, and filename.
     * <p>
     * The option {@code "--longFormat"} is equivalent to the {@code "-}{@link #l l}{@code "} option.
     */
    public final LsOptionSet_Rahlrt longFormat = LsOptionSet_Rahlrt.Active_l_long;
    /**
     * Option {@code "-R"}: Recursively lists subdirectories encountered.
     * <p>
     * The option {@code "-R"} is equivalent to the {@code "--}{@link #recurseSubdirs recurseSubdirs}{@code "} option.
     */
    public final LsOptionSet_Rahlrt R = LsOptionSet_Rahlrt.Active_R;
    /**
     * Option {@code "--recurseSubdirs"}: Recursively lists subdirectories encountered.
     * <p>
     * The option {@code "--recurseSubdirs"} is equivalent to the {@code "-}{@link #R R}{@code "} option.
     */
    public final LsOptionSet_Rahlrt recurseSubdirs = LsOptionSet_Rahlrt.Active_R_long;
    /**
     * Option {@code "-r"}: Reverses the order of the sort to get reverse collating sequence or
     * oldest first.
     * <p>
     * The option {@code "-r"} is equivalent to the {@code "--}{@link #reverseOrder reverseOrder}{@code "} option.
     */
    public final LsOptionSet_Rahlrt r = LsOptionSet_Rahlrt.Active_r;
    /**
     * Option {@code "--reverseOrder"}: Reverses the order of the sort to get reverse collating sequence or
     * oldest first.
     * <p>
     * The option {@code "--reverseOrder"} is equivalent to the {@code "-}{@link #r r}{@code "} option.
     */
    public final LsOptionSet_Rahlrt reverseOrder = LsOptionSet_Rahlrt.Active_r_long;
    /**
     * Option {@code "-t"}: Sorts with the primary key being time modified (most recently
     * modified first) and the secondary key being filename in the
     * collating sequence.
     * <p>
     * The option {@code "-t"} is equivalent to the {@code "--}{@link #timeSorted timeSorted}{@code "} option.
     */
    public final LsOptionSet_Rahlrt t = LsOptionSet_Rahlrt.Active_t;
    /**
     * Option {@code "--timeSorted"}: Sorts with the primary key being time modified (most recently
     * modified first) and the secondary key being filename in the
     * collating sequence.
     * <p>
     * The option {@code "--timeSorted"} is equivalent to the {@code "-}{@link #t t}{@code "} option.
     */
    public final LsOptionSet_Rahlrt timeSorted = LsOptionSet_Rahlrt.Active_t_long;

}
