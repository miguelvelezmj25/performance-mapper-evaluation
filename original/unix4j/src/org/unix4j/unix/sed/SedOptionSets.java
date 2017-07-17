package org.unix4j.unix.sed;

import org.unix4j.unix.Sed;

/**
 * Options for the {@link Sed sed} command with the
 * the following options:
 * <p>
 * <table>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -n}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --quiet}</td><td>&nbsp;</td><td>Suppress the default output (in which each line, after it is
 * examined for editing, is written to standard output). Only lines
 * explicitly selected for output are written.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -g}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --global}</td><td>&nbsp;</td><td>Globally substitute for all non-overlapping instances of the regexp
 * rather than just the first one.
 * <p>
 * (This option is ignored if the occurrence operand is specified).</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -p}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --print}</td><td>&nbsp;</td><td>Write the matched line to standard output.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -l}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --lineNumber}</td><td>&nbsp;</td><td>Writes the current line number on a separate line to the standard
 * output.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -I}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --ignoreCase}</td><td>&nbsp;</td><td>Use case insensitive pattern matching.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -s}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --substitute}</td><td>&nbsp;</td><td>Substitutes the replacement string for instances of the regexp in
 * the matched line.
 * <p>
 * An ampersand ('&') appearing in the replacement is be replaced
 * by the line matching the regexp. The characters "\n", where n is a
 * digit, are replaced by the text matched by the corresponding
 * backreference expression.  The special meaning of '&' and "\n"
 * in this context can be suppressed by preceding it by a backslash.
 * <p>
 * A line can be split by substituting a newline ('\n') into it.
 * <p>
 * A substitution is considered to have been performed even if the
 * replacement string is identical to the string that it replaces.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -a}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --append}</td><td>&nbsp;</td><td>Append string2 as a separate line after the matched line.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -i}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --insert}</td><td>&nbsp;</td><td>Insert string2 as a separate line before the matched line.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -c}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --change}</td><td>&nbsp;</td><td>Write string2 as a separate line instead of the matched line.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -d}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --delete}</td><td>&nbsp;</td><td>Delete the matched line.</td></tr>
 * <tr valign="top"><td width="10px"></td><td nowrap="nowrap">{@code -y}</td><td>&nbsp;&nbsp;</td><td nowrap="nowrap">{@code --translate}</td><td>&nbsp;</td><td>Replace all occurrences of characters in string1 with the
 * corresponding characters in string2. If the number of characters in
 * the two strings are not equal, or if any of the characters in
 * string1 appear more than once, the results are undefined.</td></tr>
 * </table>
 * <p>
 * This class serves as entry point to every possible set of {@code sed} options
 * defined as an enum constant. With this explicit expansion of all possible
 * option combinations, options can be passed to the command in a very compact
 * form, such as:
 * <pre>
 * sed(Sed.Options.n, ...);
 * sed(Sed.Options.n.g, ...);
 * ...
 * sed(Sed.Options.n.g.p.l.I.s.a.i.c.d.y, ...);
 * </pre>
 */
public final class SedOptionSets {
    /**
     * The singleton instance.
     */
    public static final SedOptionSets INSTANCE = new SedOptionSets();

    /**
     * Option {@code "-a"}: Append string2 as a separate line after the matched line.
     * <p>
     * The option {@code "-a"} is equivalent to the {@code "--}{@link #append append}{@code "} option.
     */
    public final SedOptionSet_Iaglnp a = SedOptionSet_Iaglnp.Active_a;
    /**
     * Option {@code "--append"}: Append string2 as a separate line after the matched line.
     * <p>
     * The option {@code "--append"} is equivalent to the {@code "-}{@link #a a}{@code "} option.
     */
    public final SedOptionSet_Iaglnp append = SedOptionSet_Iaglnp.Active_a_long;
    /**
     * Option {@code "-c"}: Write string2 as a separate line instead of the matched line.
     * <p>
     * The option {@code "-c"} is equivalent to the {@code "--}{@link #change change}{@code "} option.
     */
    public final SedOptionSet_Icglnp c = SedOptionSet_Icglnp.Active_c;
    /**
     * Option {@code "--change"}: Write string2 as a separate line instead of the matched line.
     * <p>
     * The option {@code "--change"} is equivalent to the {@code "-}{@link #c c}{@code "} option.
     */
    public final SedOptionSet_Icglnp change = SedOptionSet_Icglnp.Active_c_long;
    /**
     * Option {@code "-d"}: Delete the matched line.
     * <p>
     * The option {@code "-d"} is equivalent to the {@code "--}{@link #delete delete}{@code "} option.
     */
    public final SedOptionSet_Idglnp d = SedOptionSet_Idglnp.Active_d;
    /**
     * Option {@code "--delete"}: Delete the matched line.
     * <p>
     * The option {@code "--delete"} is equivalent to the {@code "-}{@link #d d}{@code "} option.
     */
    public final SedOptionSet_Idglnp delete = SedOptionSet_Idglnp.Active_d_long;
    /**
     * Option {@code "-g"}: Globally substitute for all non-overlapping instances of the regexp
     * rather than just the first one.
     * <p>
     * (This option is ignored if the occurrence operand is specified).
     * <p>
     * The option {@code "-g"} is equivalent to the {@code "--}{@link #global global}{@code "} option.
     */
    public final SedOptionSet_Iacdgilnpsy g = SedOptionSet_Iacdgilnpsy.Active_g;
    /**
     * Option {@code "--global"}: Globally substitute for all non-overlapping instances of the regexp
     * rather than just the first one.
     * <p>
     * (This option is ignored if the occurrence operand is specified).
     * <p>
     * The option {@code "--global"} is equivalent to the {@code "-}{@link #g g}{@code "} option.
     */
    public final SedOptionSet_Iacdgilnpsy global = SedOptionSet_Iacdgilnpsy.Active_g_long;
    /**
     * Option {@code "-I"}: Use case insensitive pattern matching.
     * <p>
     * The option {@code "-I"} is equivalent to the {@code "--}{@link #ignoreCase ignoreCase}{@code "} option.
     */
    public final SedOptionSet_Iacdgilnpsy I = SedOptionSet_Iacdgilnpsy.Active_I;
    /**
     * Option {@code "--ignoreCase"}: Use case insensitive pattern matching.
     * <p>
     * The option {@code "--ignoreCase"} is equivalent to the {@code "-}{@link #I I}{@code "} option.
     */
    public final SedOptionSet_Iacdgilnpsy ignoreCase = SedOptionSet_Iacdgilnpsy.Active_I_long;
    /**
     * Option {@code "-i"}: Insert string2 as a separate line before the matched line.
     * <p>
     * The option {@code "-i"} is equivalent to the {@code "--}{@link #insert insert}{@code "} option.
     */
    public final SedOptionSet_Igilnp i = SedOptionSet_Igilnp.Active_i;
    /**
     * Option {@code "--insert"}: Insert string2 as a separate line before the matched line.
     * <p>
     * The option {@code "--insert"} is equivalent to the {@code "-}{@link #i i}{@code "} option.
     */
    public final SedOptionSet_Igilnp insert = SedOptionSet_Igilnp.Active_i_long;
    /**
     * Option {@code "-l"}: Writes the current line number on a separate line to the standard
     * output.
     * <p>
     * The option {@code "-l"} is equivalent to the {@code "--}{@link #lineNumber lineNumber}{@code "} option.
     */
    public final SedOptionSet_Iacdgilnpsy l = SedOptionSet_Iacdgilnpsy.Active_l;
    /**
     * Option {@code "--lineNumber"}: Writes the current line number on a separate line to the standard
     * output.
     * <p>
     * The option {@code "--lineNumber"} is equivalent to the {@code "-}{@link #l l}{@code "} option.
     */
    public final SedOptionSet_Iacdgilnpsy lineNumber = SedOptionSet_Iacdgilnpsy.Active_l_long;
    /**
     * Option {@code "-p"}: Write the matched line to standard output.
     * <p>
     * The option {@code "-p"} is equivalent to the {@code "--}{@link #print print}{@code "} option.
     */
    public final SedOptionSet_Iacdgilnpsy p = SedOptionSet_Iacdgilnpsy.Active_p;
    /**
     * Option {@code "--print"}: Write the matched line to standard output.
     * <p>
     * The option {@code "--print"} is equivalent to the {@code "-}{@link #p p}{@code "} option.
     */
    public final SedOptionSet_Iacdgilnpsy print = SedOptionSet_Iacdgilnpsy.Active_p_long;
    /**
     * Option {@code "-n"}: Suppress the default output (in which each line, after it is
     * examined for editing, is written to standard output). Only lines
     * explicitly selected for output are written.
     * <p>
     * The option {@code "-n"} is equivalent to the {@code "--}{@link #quiet quiet}{@code "} option.
     */
    public final SedOptionSet_Iacdgilnpsy n = SedOptionSet_Iacdgilnpsy.Active_n;
    /**
     * Option {@code "--quiet"}: Suppress the default output (in which each line, after it is
     * examined for editing, is written to standard output). Only lines
     * explicitly selected for output are written.
     * <p>
     * The option {@code "--quiet"} is equivalent to the {@code "-}{@link #n n}{@code "} option.
     */
    public final SedOptionSet_Iacdgilnpsy quiet = SedOptionSet_Iacdgilnpsy.Active_n_long;
    /**
     * Option {@code "-s"}: Substitutes the replacement string for instances of the regexp in
     * the matched line.
     * <p>
     * An ampersand ('&') appearing in the replacement is be replaced
     * by the line matching the regexp. The characters "\n", where n is a
     * digit, are replaced by the text matched by the corresponding
     * backreference expression.  The special meaning of '&' and "\n"
     * in this context can be suppressed by preceding it by a backslash.
     * <p>
     * A line can be split by substituting a newline ('\n') into it.
     * <p>
     * A substitution is considered to have been performed even if the
     * replacement string is identical to the string that it replaces.
     * <p>
     * The option {@code "-s"} is equivalent to the {@code "--}{@link #substitute substitute}{@code "} option.
     */
    public final SedOptionSet_Iglnps s = SedOptionSet_Iglnps.Active_s;
    /**
     * Option {@code "--substitute"}: Substitutes the replacement string for instances of the regexp in
     * the matched line.
     * <p>
     * An ampersand ('&') appearing in the replacement is be replaced
     * by the line matching the regexp. The characters "\n", where n is a
     * digit, are replaced by the text matched by the corresponding
     * backreference expression.  The special meaning of '&' and "\n"
     * in this context can be suppressed by preceding it by a backslash.
     * <p>
     * A line can be split by substituting a newline ('\n') into it.
     * <p>
     * A substitution is considered to have been performed even if the
     * replacement string is identical to the string that it replaces.
     * <p>
     * The option {@code "--substitute"} is equivalent to the {@code "-}{@link #s s}{@code "} option.
     */
    public final SedOptionSet_Iglnps substitute = SedOptionSet_Iglnps.Active_s_long;
    /**
     * Option {@code "-y"}: Replace all occurrences of characters in string1 with the
     * corresponding characters in string2. If the number of characters in
     * the two strings are not equal, or if any of the characters in
     * string1 appear more than once, the results are undefined.
     * <p>
     * The option {@code "-y"} is equivalent to the {@code "--}{@link #translate translate}{@code "} option.
     */
    public final SedOptionSet_Iglnpy y = SedOptionSet_Iglnpy.Active_y;
    /**
     * Option {@code "--translate"}: Replace all occurrences of characters in string1 with the
     * corresponding characters in string2. If the number of characters in
     * the two strings are not equal, or if any of the characters in
     * string1 appear more than once, the results are undefined.
     * <p>
     * The option {@code "--translate"} is equivalent to the {@code "-}{@link #y y}{@code "} option.
     */
    public final SedOptionSet_Iglnpy translate = SedOptionSet_Iglnpy.Active_y_long;

}
