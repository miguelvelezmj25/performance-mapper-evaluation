package org.unix4j.unix.xargs;

import org.unix4j.option.Option;
import org.unix4j.unix.Xargs;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Option sets for the {@link Xargs xargs} command with
 * the following options: {@link #z z}, {@link #x x}, {@link #r r}, {@link #t t}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Xargs#Options} should be used instead to specify command
 * options. See also {@link org.unix4j.unix.xargs.XargsOptions} for more information.
 */
public enum XargsOptionSet_rtxz implements XargsOptions {
    /**
     * Option set with the following active options: {@link #delimiter0 z}, {@link #exactArgs x}, {@link #noRunIfEmpty r}, {@link #verbose t}.
     */
    Active_rtxz(
        /*z:*/null /*already set*/, /*delimiter0:*/null /*already set*/, /*x:*/null /*already set*/, /*exactArgs:*/null /*already set*/, /*r:*/null /*already set*/, /*noRunIfEmpty:*/null /*already set*/, /*t:*/null /*already set*/, /*verbose:*/null /*already set*/,
            true,
        /*active:*/XargsOption.delimiter0, XargsOption.exactArgs, XargsOption.noRunIfEmpty, XargsOption.verbose
    ),
    /**
     * Option set with the following active options: {@link #delimiter0 z}, {@link #exactArgs x}, {@link #noRunIfEmpty r}, {@link #verbose t}.
     */
    Active_rtxz_long(
		/*z:*/null /*already set*/, /*delimiter0:*/null /*already set*/, /*x:*/null /*already set*/, /*exactArgs:*/null /*already set*/, /*r:*/null /*already set*/, /*noRunIfEmpty:*/null /*already set*/, /*t:*/null /*already set*/, /*verbose:*/null /*already set*/,
            false,
		/*active:*/XargsOption.delimiter0, XargsOption.exactArgs, XargsOption.noRunIfEmpty, XargsOption.verbose
    ),
    /**
     * Option set with the following active options: {@link #delimiter0 z}, {@link #exactArgs x}, {@link #noRunIfEmpty r}.
     */
    Active_rxz(
		/*z:*/null /*already set*/, /*delimiter0:*/null /*already set*/, /*x:*/null /*already set*/, /*exactArgs:*/null /*already set*/, /*r:*/null /*already set*/, /*noRunIfEmpty:*/null /*already set*/, /*t:*/Active_rtxz, /*verbose:*/Active_rtxz_long,
            true,
		/*active:*/XargsOption.delimiter0, XargsOption.exactArgs, XargsOption.noRunIfEmpty
    ),
    /**
     * Option set with the following active options: {@link #delimiter0 z}, {@link #exactArgs x}, {@link #noRunIfEmpty r}.
     */
    Active_rxz_long(
		/*z:*/null /*already set*/, /*delimiter0:*/null /*already set*/, /*x:*/null /*already set*/, /*exactArgs:*/null /*already set*/, /*r:*/null /*already set*/, /*noRunIfEmpty:*/null /*already set*/, /*t:*/Active_rtxz, /*verbose:*/Active_rtxz_long,
            false,
		/*active:*/XargsOption.delimiter0, XargsOption.exactArgs, XargsOption.noRunIfEmpty
    ),
    /**
     * Option set with the following active options: {@link #delimiter0 z}, {@link #exactArgs x}, {@link #verbose t}.
     */
    Active_txz(
		/*z:*/null /*already set*/, /*delimiter0:*/null /*already set*/, /*x:*/null /*already set*/, /*exactArgs:*/null /*already set*/, /*r:*/Active_rtxz, /*noRunIfEmpty:*/Active_rtxz_long, /*t:*/null /*already set*/, /*verbose:*/null /*already set*/,
            true,
		/*active:*/XargsOption.delimiter0, XargsOption.exactArgs, XargsOption.verbose
    ),
    /**
     * Option set with the following active options: {@link #delimiter0 z}, {@link #exactArgs x}, {@link #verbose t}.
     */
    Active_txz_long(
		/*z:*/null /*already set*/, /*delimiter0:*/null /*already set*/, /*x:*/null /*already set*/, /*exactArgs:*/null /*already set*/, /*r:*/Active_rtxz, /*noRunIfEmpty:*/Active_rtxz_long, /*t:*/null /*already set*/, /*verbose:*/null /*already set*/,
            false,
		/*active:*/XargsOption.delimiter0, XargsOption.exactArgs, XargsOption.verbose
    ),
    /**
     * Option set with the following active options: {@link #delimiter0 z}, {@link #noRunIfEmpty r}, {@link #verbose t}.
     */
    Active_rtz(
		/*z:*/null /*already set*/, /*delimiter0:*/null /*already set*/, /*x:*/Active_rtxz, /*exactArgs:*/Active_rtxz_long, /*r:*/null /*already set*/, /*noRunIfEmpty:*/null /*already set*/, /*t:*/null /*already set*/, /*verbose:*/null /*already set*/,
            true,
		/*active:*/XargsOption.delimiter0, XargsOption.noRunIfEmpty, XargsOption.verbose
    ),
    /**
     * Option set with the following active options: {@link #delimiter0 z}, {@link #noRunIfEmpty r}, {@link #verbose t}.
     */
    Active_rtz_long(
		/*z:*/null /*already set*/, /*delimiter0:*/null /*already set*/, /*x:*/Active_rtxz, /*exactArgs:*/Active_rtxz_long, /*r:*/null /*already set*/, /*noRunIfEmpty:*/null /*already set*/, /*t:*/null /*already set*/, /*verbose:*/null /*already set*/,
            false,
		/*active:*/XargsOption.delimiter0, XargsOption.noRunIfEmpty, XargsOption.verbose
    ),
    /**
     * Option set with the following active options: {@link #exactArgs x}, {@link #noRunIfEmpty r}, {@link #verbose t}.
     */
    Active_rtx(
		/*z:*/Active_rtxz, /*delimiter0:*/Active_rtxz_long, /*x:*/null /*already set*/, /*exactArgs:*/null /*already set*/, /*r:*/null /*already set*/, /*noRunIfEmpty:*/null /*already set*/, /*t:*/null /*already set*/, /*verbose:*/null /*already set*/,
            true,
		/*active:*/XargsOption.exactArgs, XargsOption.noRunIfEmpty, XargsOption.verbose
    ),
    /**
     * Option set with the following active options: {@link #exactArgs x}, {@link #noRunIfEmpty r}, {@link #verbose t}.
     */
    Active_rtx_long(
		/*z:*/Active_rtxz, /*delimiter0:*/Active_rtxz_long, /*x:*/null /*already set*/, /*exactArgs:*/null /*already set*/, /*r:*/null /*already set*/, /*noRunIfEmpty:*/null /*already set*/, /*t:*/null /*already set*/, /*verbose:*/null /*already set*/,
            false,
		/*active:*/XargsOption.exactArgs, XargsOption.noRunIfEmpty, XargsOption.verbose
    ),
    /**
     * Option set with the following active options: {@link #delimiter0 z}, {@link #exactArgs x}.
     */
    Active_xz(
		/*z:*/null /*already set*/, /*delimiter0:*/null /*already set*/, /*x:*/null /*already set*/, /*exactArgs:*/null /*already set*/, /*r:*/Active_rxz, /*noRunIfEmpty:*/Active_rxz_long, /*t:*/Active_txz, /*verbose:*/Active_txz_long,
            true,
		/*active:*/XargsOption.delimiter0, XargsOption.exactArgs
    ),
    /**
     * Option set with the following active options: {@link #delimiter0 z}, {@link #exactArgs x}.
     */
    Active_xz_long(
		/*z:*/null /*already set*/, /*delimiter0:*/null /*already set*/, /*x:*/null /*already set*/, /*exactArgs:*/null /*already set*/, /*r:*/Active_rxz, /*noRunIfEmpty:*/Active_rxz_long, /*t:*/Active_txz, /*verbose:*/Active_txz_long,
            false,
		/*active:*/XargsOption.delimiter0, XargsOption.exactArgs
    ),
    /**
     * Option set with the following active options: {@link #delimiter0 z}, {@link #noRunIfEmpty r}.
     */
    Active_rz(
		/*z:*/null /*already set*/, /*delimiter0:*/null /*already set*/, /*x:*/Active_rxz, /*exactArgs:*/Active_rxz_long, /*r:*/null /*already set*/, /*noRunIfEmpty:*/null /*already set*/, /*t:*/Active_rtz, /*verbose:*/Active_rtz_long,
            true,
		/*active:*/XargsOption.delimiter0, XargsOption.noRunIfEmpty
    ),
    /**
     * Option set with the following active options: {@link #delimiter0 z}, {@link #noRunIfEmpty r}.
     */
    Active_rz_long(
		/*z:*/null /*already set*/, /*delimiter0:*/null /*already set*/, /*x:*/Active_rxz, /*exactArgs:*/Active_rxz_long, /*r:*/null /*already set*/, /*noRunIfEmpty:*/null /*already set*/, /*t:*/Active_rtz, /*verbose:*/Active_rtz_long,
            false,
		/*active:*/XargsOption.delimiter0, XargsOption.noRunIfEmpty
    ),
    /**
     * Option set with the following active options: {@link #delimiter0 z}, {@link #verbose t}.
     */
    Active_tz(
		/*z:*/null /*already set*/, /*delimiter0:*/null /*already set*/, /*x:*/Active_txz, /*exactArgs:*/Active_txz_long, /*r:*/Active_rtz, /*noRunIfEmpty:*/Active_rtz_long, /*t:*/null /*already set*/, /*verbose:*/null /*already set*/,
            true,
		/*active:*/XargsOption.delimiter0, XargsOption.verbose
    ),
    /**
     * Option set with the following active options: {@link #delimiter0 z}, {@link #verbose t}.
     */
    Active_tz_long(
		/*z:*/null /*already set*/, /*delimiter0:*/null /*already set*/, /*x:*/Active_txz, /*exactArgs:*/Active_txz_long, /*r:*/Active_rtz, /*noRunIfEmpty:*/Active_rtz_long, /*t:*/null /*already set*/, /*verbose:*/null /*already set*/,
            false,
		/*active:*/XargsOption.delimiter0, XargsOption.verbose
    ),
    /**
     * Option set with the following active options: {@link #exactArgs x}, {@link #noRunIfEmpty r}.
     */
    Active_rx(
		/*z:*/Active_rxz, /*delimiter0:*/Active_rxz_long, /*x:*/null /*already set*/, /*exactArgs:*/null /*already set*/, /*r:*/null /*already set*/, /*noRunIfEmpty:*/null /*already set*/, /*t:*/Active_rtx, /*verbose:*/Active_rtx_long,
            true,
		/*active:*/XargsOption.exactArgs, XargsOption.noRunIfEmpty
    ),
    /**
     * Option set with the following active options: {@link #exactArgs x}, {@link #noRunIfEmpty r}.
     */
    Active_rx_long(
		/*z:*/Active_rxz, /*delimiter0:*/Active_rxz_long, /*x:*/null /*already set*/, /*exactArgs:*/null /*already set*/, /*r:*/null /*already set*/, /*noRunIfEmpty:*/null /*already set*/, /*t:*/Active_rtx, /*verbose:*/Active_rtx_long,
            false,
		/*active:*/XargsOption.exactArgs, XargsOption.noRunIfEmpty
    ),
    /**
     * Option set with the following active options: {@link #exactArgs x}, {@link #verbose t}.
     */
    Active_tx(
		/*z:*/Active_txz, /*delimiter0:*/Active_txz_long, /*x:*/null /*already set*/, /*exactArgs:*/null /*already set*/, /*r:*/Active_rtx, /*noRunIfEmpty:*/Active_rtx_long, /*t:*/null /*already set*/, /*verbose:*/null /*already set*/,
            true,
		/*active:*/XargsOption.exactArgs, XargsOption.verbose
    ),
    /**
     * Option set with the following active options: {@link #exactArgs x}, {@link #verbose t}.
     */
    Active_tx_long(
		/*z:*/Active_txz, /*delimiter0:*/Active_txz_long, /*x:*/null /*already set*/, /*exactArgs:*/null /*already set*/, /*r:*/Active_rtx, /*noRunIfEmpty:*/Active_rtx_long, /*t:*/null /*already set*/, /*verbose:*/null /*already set*/,
            false,
		/*active:*/XargsOption.exactArgs, XargsOption.verbose
    ),
    /**
     * Option set with the following active options: {@link #noRunIfEmpty r}, {@link #verbose t}.
     */
    Active_rt(
		/*z:*/Active_rtz, /*delimiter0:*/Active_rtz_long, /*x:*/Active_rtx, /*exactArgs:*/Active_rtx_long, /*r:*/null /*already set*/, /*noRunIfEmpty:*/null /*already set*/, /*t:*/null /*already set*/, /*verbose:*/null /*already set*/,
            true,
		/*active:*/XargsOption.noRunIfEmpty, XargsOption.verbose
    ),
    /**
     * Option set with the following active options: {@link #noRunIfEmpty r}, {@link #verbose t}.
     */
    Active_rt_long(
		/*z:*/Active_rtz, /*delimiter0:*/Active_rtz_long, /*x:*/Active_rtx, /*exactArgs:*/Active_rtx_long, /*r:*/null /*already set*/, /*noRunIfEmpty:*/null /*already set*/, /*t:*/null /*already set*/, /*verbose:*/null /*already set*/,
            false,
		/*active:*/XargsOption.noRunIfEmpty, XargsOption.verbose
    ),
    /**
     * Option set with the following active options: {@link #delimiter0 z}.
     */
    Active_z(
		/*z:*/null /*already set*/, /*delimiter0:*/null /*already set*/, /*x:*/Active_xz, /*exactArgs:*/Active_xz_long, /*r:*/Active_rz, /*noRunIfEmpty:*/Active_rz_long, /*t:*/Active_tz, /*verbose:*/Active_tz_long,
            true,
		/*active:*/XargsOption.delimiter0
    ),
    /**
     * Option set with the following active options: {@link #delimiter0 z}.
     */
    Active_z_long(
		/*z:*/null /*already set*/, /*delimiter0:*/null /*already set*/, /*x:*/Active_xz, /*exactArgs:*/Active_xz_long, /*r:*/Active_rz, /*noRunIfEmpty:*/Active_rz_long, /*t:*/Active_tz, /*verbose:*/Active_tz_long,
            false,
		/*active:*/XargsOption.delimiter0
    ),
    /**
     * Option set with the following active options: {@link #exactArgs x}.
     */
    Active_x(
		/*z:*/Active_xz, /*delimiter0:*/Active_xz_long, /*x:*/null /*already set*/, /*exactArgs:*/null /*already set*/, /*r:*/Active_rx, /*noRunIfEmpty:*/Active_rx_long, /*t:*/Active_tx, /*verbose:*/Active_tx_long,
            true,
		/*active:*/XargsOption.exactArgs
    ),
    /**
     * Option set with the following active options: {@link #exactArgs x}.
     */
    Active_x_long(
		/*z:*/Active_xz, /*delimiter0:*/Active_xz_long, /*x:*/null /*already set*/, /*exactArgs:*/null /*already set*/, /*r:*/Active_rx, /*noRunIfEmpty:*/Active_rx_long, /*t:*/Active_tx, /*verbose:*/Active_tx_long,
            false,
		/*active:*/XargsOption.exactArgs
    ),
    /**
     * Option set with the following active options: {@link #noRunIfEmpty r}.
     */
    Active_r(
		/*z:*/Active_rz, /*delimiter0:*/Active_rz_long, /*x:*/Active_rx, /*exactArgs:*/Active_rx_long, /*r:*/null /*already set*/, /*noRunIfEmpty:*/null /*already set*/, /*t:*/Active_rt, /*verbose:*/Active_rt_long,
            true,
		/*active:*/XargsOption.noRunIfEmpty
    ),
    /**
     * Option set with the following active options: {@link #noRunIfEmpty r}.
     */
    Active_r_long(
		/*z:*/Active_rz, /*delimiter0:*/Active_rz_long, /*x:*/Active_rx, /*exactArgs:*/Active_rx_long, /*r:*/null /*already set*/, /*noRunIfEmpty:*/null /*already set*/, /*t:*/Active_rt, /*verbose:*/Active_rt_long,
            false,
		/*active:*/XargsOption.noRunIfEmpty
    ),
    /**
     * Option set with the following active options: {@link #verbose t}.
     */
    Active_t(
		/*z:*/Active_tz, /*delimiter0:*/Active_tz_long, /*x:*/Active_tx, /*exactArgs:*/Active_tx_long, /*r:*/Active_rt, /*noRunIfEmpty:*/Active_rt_long, /*t:*/null /*already set*/, /*verbose:*/null /*already set*/,
            true,
		/*active:*/XargsOption.verbose
    ),
    /**
     * Option set with the following active options: {@link #verbose t}.
     */
    Active_t_long(
		/*z:*/Active_tz, /*delimiter0:*/Active_tz_long, /*x:*/Active_tx, /*exactArgs:*/Active_tx_long, /*r:*/Active_rt, /*noRunIfEmpty:*/Active_rt_long, /*t:*/null /*already set*/, /*verbose:*/null /*already set*/,
            false,
		/*active:*/XargsOption.verbose
    );

    /**
     * Option {@code "-z"}: Input items are terminated by a null character instead of by
     * whitespace, and the quotes and backslash are not special (every
     * character is taken literally). Disables the end of file string,
     * which is treated like any other argument. Useful when input items
     * might contain white space, quote marks, or backslashes. The find
     * --print0 option produces input suitable for this mode.
     * <p>
     * (This option is ignored if an explicit delimiter operand is specified).
     * <p>
     * The option {@code "-z"} is equivalent to the {@code "--}{@link #delimiter0 delimiter0}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-z"}. If the option {@code "-z"}
     * is already set, the field {@code z} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final XargsOptionSet_rtxz z;
    /**
     * Option {@code "--delimiter0"}: Input items are terminated by a null character instead of by
     * whitespace, and the quotes and backslash are not special (every
     * character is taken literally). Disables the end of file string,
     * which is treated like any other argument. Useful when input items
     * might contain white space, quote marks, or backslashes. The find
     * --print0 option produces input suitable for this mode.
     * <p>
     * (This option is ignored if an explicit delimiter operand is specified).
     * <p>
     * The option {@code "--delimiter0"} is equivalent to the {@code "-}{@link #z z}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--delimiter0"}. If the option {@code "--delimiter0"}
     * is already set, the field {@code delimiter0} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final XargsOptionSet_rtxz delimiter0;
    /**
     * Option {@code "-x"}: Terminate immediately if {@code maxArgs} is specified but the found
     * number of variable items is less than {@code maxArgs}.
     * <p>
     * (This option is ignored if no {@code maxArgs} operand is specified).
     * <p>
     * The option {@code "-x"} is equivalent to the {@code "--}{@link #exactArgs exactArgs}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-x"}. If the option {@code "-x"}
     * is already set, the field {@code x} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final XargsOptionSet_rtxz x;
    /**
     * Option {@code "--exactArgs"}: Terminate immediately if {@code maxArgs} is specified but the found
     * number of variable items is less than {@code maxArgs}.
     * <p>
     * (This option is ignored if no {@code maxArgs} operand is specified).
     * <p>
     * The option {@code "--exactArgs"} is equivalent to the {@code "-}{@link #x x}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--exactArgs"}. If the option {@code "--exactArgs"}
     * is already set, the field {@code exactArgs} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final XargsOptionSet_rtxz exactArgs;
    /**
     * Option {@code "-r"}: If the standard input does not contain any nonblanks, do not run the
     * command. Normally, the command is run once even if there is no
     * input.
     * <p>
     * The option {@code "-r"} is equivalent to the {@code "--}{@link #noRunIfEmpty noRunIfEmpty}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-r"}. If the option {@code "-r"}
     * is already set, the field {@code r} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final XargsOptionSet_rtxz r;
    /**
     * Option {@code "--noRunIfEmpty"}: If the standard input does not contain any nonblanks, do not run the
     * command. Normally, the command is run once even if there is no
     * input.
     * <p>
     * The option {@code "--noRunIfEmpty"} is equivalent to the {@code "-}{@link #r r}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--noRunIfEmpty"}. If the option {@code "--noRunIfEmpty"}
     * is already set, the field {@code noRunIfEmpty} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final XargsOptionSet_rtxz noRunIfEmpty;
    /**
     * Option {@code "-t"}: Print the command line on the standard error output before executing
     * it.
     * <p>
     * The option {@code "-t"} is equivalent to the {@code "--}{@link #verbose verbose}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-t"}. If the option {@code "-t"}
     * is already set, the field {@code t} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final XargsOptionSet_rtxz t;
    /**
     * Option {@code "--verbose"}: Print the command line on the standard error output before executing
     * it.
     * <p>
     * The option {@code "--verbose"} is equivalent to the {@code "-}{@link #t t}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--verbose"}. If the option {@code "--verbose"}
     * is already set, the field {@code verbose} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final XargsOptionSet_rtxz verbose;
    private final boolean useAcronym;
    private final EnumSet<XargsOption> options;

    private XargsOptionSet_rtxz(
            XargsOptionSet_rtxz z, XargsOptionSet_rtxz delimiter0, XargsOptionSet_rtxz x, XargsOptionSet_rtxz exactArgs, XargsOptionSet_rtxz r, XargsOptionSet_rtxz noRunIfEmpty, XargsOptionSet_rtxz t, XargsOptionSet_rtxz verbose,
            boolean useAcronym,
            XargsOption... activeOptions
    ) {
        this.z = z == null ? this : z;
        this.delimiter0 = delimiter0 == null ? this : delimiter0;
        this.x = x == null ? this : x;
        this.exactArgs = exactArgs == null ? this : exactArgs;
        this.r = r == null ? this : r;
        this.noRunIfEmpty = noRunIfEmpty == null ? this : noRunIfEmpty;
        this.t = t == null ? this : t;
        this.verbose = verbose == null ? this : verbose;
        this.useAcronym = useAcronym;
        this.options = activeOptions.length == 0 ? EnumSet.noneOf(XargsOption.class) : EnumSet.copyOf(Arrays.asList(activeOptions));
    }

    //inherit javadoc
    @Override
    public Class<XargsOption> optionType() {
        return XargsOption.class;
    }

    //inherit javadoc
    @Override
    public boolean isSet(XargsOption option) {
        return options.contains(option);
    }

    //inherit javadoc
    @Override
    public int size() {
        return options.size();
    }

    /**
     * Returns the set with the active options. The returned set a new defensive
     * copy instance created when this method is called, modifications of this
     * set will therefore not alter {@code this} option set.
     *
     * @return a copy of the set with the active options.
     */
    @Override
    public EnumSet<XargsOption> asSet() {
        return EnumSet.copyOf(options);
    }

    /**
     * Returns an immutable iterator with the active options of this option set.
     *
     * @return an immutable iterator for over the active options
     */
    @Override
    public Iterator<XargsOption> iterator() {
        return Collections.unmodifiableSet(options).iterator();
    }

    /**
     * Returns true if the {@link Option#acronym() acronym} should be used in
     * for the specified {@code option} string representations.
     * <p>
     * In particular and independent from the {@code option} argument, this
     * option set returns true if the last option added to this set was an
     * acronym, and false if it was a long option name.
     * <p>
     * For instance, the set defined as
     * <pre>
     *    XargsOptionSet_rtxz.delimiter0.x;
     * </pre>
     * uses acronyms, that is, this method always returns true for the above
     * set.
     * <p>
     * On the other hand, long option names are used and this method always
     * returns false for the set
     * <pre>
     *    XargsOptionSet_rtxz.z.exactArgs;
     * </pre>
     * <p>
     * Note that a repeated option is <i>not</i> treated as the last set option.
     * For instance, the first and last option of the following set are
     * equivalent and acronyms are used:
     * <pre>
     *    XargsOptionSet_rtxz.z.x.delimiter0;
     * </pre>
     * <p>
     * This method always returns true for the empty set with no active options.
     *
     * @param option the option of interest, has no impact on the result returned
     *               by this method
     * @return true if option acronyms should be used for string representations
     * of any option of this option set
     */
    @Override
    public boolean useAcronymFor(XargsOption option) {
        return useAcronym;
    }
}
