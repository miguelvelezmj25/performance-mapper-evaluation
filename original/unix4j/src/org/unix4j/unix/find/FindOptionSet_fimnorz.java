package org.unix4j.unix.find;

import org.unix4j.option.Option;
import org.unix4j.unix.Find;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Option sets for the {@link Find find} command with
 * the following options: {@link #i i}, {@link #z z}, {@link #r r}, {@link #m m}, {@link #n n}, {@link #o o}, {@link #f f}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Find#Options} should be used instead to specify command
 * options. See also {@link org.unix4j.unix.find.FindOptions} for more information.
 */
public enum FindOptionSet_fimnorz implements FindOptions {
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_fimnorz(
        /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
        /*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_fimnorz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_fimnor(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_fimnorz, /*print0:*/Active_fimnorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_fimnor_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_fimnorz, /*print0:*/Active_fimnorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_fimnrz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_fimnorz, /*timeOlder:*/Active_fimnorz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_fimnrz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_fimnorz, /*timeOlder:*/Active_fimnorz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_fimorz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_fimnorz, /*timeNewer:*/Active_fimnorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_fimorz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_fimnorz, /*timeNewer:*/Active_fimnorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_fmnorz(
		/*i:*/Active_fimnorz, /*ignoreCase:*/Active_fimnorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_fmnorz_long(
		/*i:*/Active_fimnorz, /*ignoreCase:*/Active_fimnorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_fimnoz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_fimnorz, /*regex:*/Active_fimnorz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_fimnoz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_fimnorz, /*regex:*/Active_fimnorz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_fimnr(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_fimnrz, /*print0:*/Active_fimnrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_fimnor, /*timeOlder:*/Active_fimnor_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_fimnr_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_fimnrz, /*print0:*/Active_fimnrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_fimnor, /*timeOlder:*/Active_fimnor_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_fimor(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_fimorz, /*print0:*/Active_fimorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_fimnor, /*timeNewer:*/Active_fimnor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeModified, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_fimor_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_fimorz, /*print0:*/Active_fimorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_fimnor, /*timeNewer:*/Active_fimnor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeModified, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #typeFile f}.
     */
    Active_fimrz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_fimnrz, /*timeNewer:*/Active_fimnrz_long, /*o:*/Active_fimorz, /*timeOlder:*/Active_fimorz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #typeFile f}.
     */
    Active_fimrz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_fimnrz, /*timeNewer:*/Active_fimnrz_long, /*o:*/Active_fimorz, /*timeOlder:*/Active_fimorz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_fmnor(
		/*i:*/Active_fimnor, /*ignoreCase:*/Active_fimnor_long, /*z:*/Active_fmnorz, /*print0:*/Active_fmnorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_fmnor_long(
		/*i:*/Active_fimnor, /*ignoreCase:*/Active_fimnor_long, /*z:*/Active_fmnorz, /*print0:*/Active_fmnorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_fmnrz(
		/*i:*/Active_fimnrz, /*ignoreCase:*/Active_fimnrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_fmnorz, /*timeOlder:*/Active_fmnorz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_fmnrz_long(
		/*i:*/Active_fimnrz, /*ignoreCase:*/Active_fimnrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_fmnorz, /*timeOlder:*/Active_fmnorz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_fmorz(
		/*i:*/Active_fimorz, /*ignoreCase:*/Active_fimorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_fmnorz, /*timeNewer:*/Active_fmnorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_fmorz_long(
		/*i:*/Active_fimorz, /*ignoreCase:*/Active_fimorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_fmnorz, /*timeNewer:*/Active_fmnorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_fimno(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_fimnoz, /*print0:*/Active_fimnoz_long, /*r:*/Active_fimnor, /*regex:*/Active_fimnor_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_fimno_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_fimnoz, /*print0:*/Active_fimnoz_long, /*r:*/Active_fimnor, /*regex:*/Active_fimnor_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_fimnz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_fimnrz, /*regex:*/Active_fimnrz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_fimnoz, /*timeOlder:*/Active_fimnoz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeModified, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_fimnz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_fimnrz, /*regex:*/Active_fimnrz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_fimnoz, /*timeOlder:*/Active_fimnoz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeModified, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_fimoz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_fimorz, /*regex:*/Active_fimorz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_fimnoz, /*timeNewer:*/Active_fimnoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeModified, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_fimoz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_fimorz, /*regex:*/Active_fimorz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_fimnoz, /*timeNewer:*/Active_fimnoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeModified, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_fmnoz(
		/*i:*/Active_fimnoz, /*ignoreCase:*/Active_fimnoz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_fmnorz, /*regex:*/Active_fmnorz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_fmnoz_long(
		/*i:*/Active_fimnoz, /*ignoreCase:*/Active_fimnoz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_fmnorz, /*regex:*/Active_fmnorz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeModified m}, {@link #typeFile f}.
     */
    Active_fimr(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_fimrz, /*print0:*/Active_fimrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_fimnr, /*timeNewer:*/Active_fimnr_long, /*o:*/Active_fimor, /*timeOlder:*/Active_fimor_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeModified, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeModified m}, {@link #typeFile f}.
     */
    Active_fimr_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_fimrz, /*print0:*/Active_fimrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_fimnr, /*timeNewer:*/Active_fimnr_long, /*o:*/Active_fimor, /*timeOlder:*/Active_fimor_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeModified, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_fmnr(
		/*i:*/Active_fimnr, /*ignoreCase:*/Active_fimnr_long, /*z:*/Active_fmnrz, /*print0:*/Active_fmnrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_fmnor, /*timeOlder:*/Active_fmnor_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_fmnr_long(
		/*i:*/Active_fimnr, /*ignoreCase:*/Active_fimnr_long, /*z:*/Active_fmnrz, /*print0:*/Active_fmnrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_fmnor, /*timeOlder:*/Active_fmnor_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_fmor(
		/*i:*/Active_fimor, /*ignoreCase:*/Active_fimor_long, /*z:*/Active_fmorz, /*print0:*/Active_fmorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_fmnor, /*timeNewer:*/Active_fmnor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.regex, FindOption.timeModified, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_fmor_long(
		/*i:*/Active_fimor, /*ignoreCase:*/Active_fimor_long, /*z:*/Active_fmorz, /*print0:*/Active_fmorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_fmnor, /*timeNewer:*/Active_fmnor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.regex, FindOption.timeModified, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #typeFile f}.
     */
    Active_fmrz(
		/*i:*/Active_fimrz, /*ignoreCase:*/Active_fimrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_fmnrz, /*timeNewer:*/Active_fmnrz_long, /*o:*/Active_fmorz, /*timeOlder:*/Active_fmorz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #typeFile f}.
     */
    Active_fmrz_long(
		/*i:*/Active_fimrz, /*ignoreCase:*/Active_fimrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_fmnrz, /*timeNewer:*/Active_fmnrz_long, /*o:*/Active_fmorz, /*timeOlder:*/Active_fmorz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_fimn(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_fimnz, /*print0:*/Active_fimnz_long, /*r:*/Active_fimnr, /*regex:*/Active_fimnr_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_fimno, /*timeOlder:*/Active_fimno_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeModified, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_fimn_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_fimnz, /*print0:*/Active_fimnz_long, /*r:*/Active_fimnr, /*regex:*/Active_fimnr_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_fimno, /*timeOlder:*/Active_fimno_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeModified, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_fimo(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_fimoz, /*print0:*/Active_fimoz_long, /*r:*/Active_fimor, /*regex:*/Active_fimor_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_fimno, /*timeNewer:*/Active_fimno_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeModified, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_fimo_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_fimoz, /*print0:*/Active_fimoz_long, /*r:*/Active_fimor, /*regex:*/Active_fimor_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_fimno, /*timeNewer:*/Active_fimno_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeModified, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeModified m}, {@link #typeFile f}.
     */
    Active_fimz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_fimrz, /*regex:*/Active_fimrz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_fimnz, /*timeNewer:*/Active_fimnz_long, /*o:*/Active_fimoz, /*timeOlder:*/Active_fimoz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeModified, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeModified m}, {@link #typeFile f}.
     */
    Active_fimz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_fimrz, /*regex:*/Active_fimrz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_fimnz, /*timeNewer:*/Active_fimnz_long, /*o:*/Active_fimoz, /*timeOlder:*/Active_fimoz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeModified, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_fmno(
		/*i:*/Active_fimno, /*ignoreCase:*/Active_fimno_long, /*z:*/Active_fmnoz, /*print0:*/Active_fmnoz_long, /*r:*/Active_fmnor, /*regex:*/Active_fmnor_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_fmno_long(
		/*i:*/Active_fimno, /*ignoreCase:*/Active_fimno_long, /*z:*/Active_fmnoz, /*print0:*/Active_fmnoz_long, /*r:*/Active_fmnor, /*regex:*/Active_fmnor_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_fmnz(
		/*i:*/Active_fimnz, /*ignoreCase:*/Active_fimnz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_fmnrz, /*regex:*/Active_fmnrz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_fmnoz, /*timeOlder:*/Active_fmnoz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.timeModified, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_fmnz_long(
		/*i:*/Active_fimnz, /*ignoreCase:*/Active_fimnz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_fmnrz, /*regex:*/Active_fmnrz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_fmnoz, /*timeOlder:*/Active_fmnoz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.timeModified, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_fmoz(
		/*i:*/Active_fimoz, /*ignoreCase:*/Active_fimoz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_fmorz, /*regex:*/Active_fmorz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_fmnoz, /*timeNewer:*/Active_fmnoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.timeModified, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_fmoz_long(
		/*i:*/Active_fimoz, /*ignoreCase:*/Active_fimoz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_fmorz, /*regex:*/Active_fmorz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_fmnoz, /*timeNewer:*/Active_fmnoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.timeModified, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeModified m}, {@link #typeFile f}.
     */
    Active_fmr(
		/*i:*/Active_fimr, /*ignoreCase:*/Active_fimr_long, /*z:*/Active_fmrz, /*print0:*/Active_fmrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_fmnr, /*timeNewer:*/Active_fmnr_long, /*o:*/Active_fmor, /*timeOlder:*/Active_fmor_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.regex, FindOption.timeModified, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeModified m}, {@link #typeFile f}.
     */
    Active_fmr_long(
		/*i:*/Active_fimr, /*ignoreCase:*/Active_fimr_long, /*z:*/Active_fmrz, /*print0:*/Active_fmrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_fmnr, /*timeNewer:*/Active_fmnr_long, /*o:*/Active_fmor, /*timeOlder:*/Active_fmor_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.regex, FindOption.timeModified, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeModified m}, {@link #typeFile f}.
     */
    Active_fim(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_fimz, /*print0:*/Active_fimz_long, /*r:*/Active_fimr, /*regex:*/Active_fimr_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_fimn, /*timeNewer:*/Active_fimn_long, /*o:*/Active_fimo, /*timeOlder:*/Active_fimo_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeModified, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeModified m}, {@link #typeFile f}.
     */
    Active_fim_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_fimz, /*print0:*/Active_fimz_long, /*r:*/Active_fimr, /*regex:*/Active_fimr_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_fimn, /*timeNewer:*/Active_fimn_long, /*o:*/Active_fimo, /*timeOlder:*/Active_fimo_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeModified, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #timeModified m}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_fmn(
		/*i:*/Active_fimn, /*ignoreCase:*/Active_fimn_long, /*z:*/Active_fmnz, /*print0:*/Active_fmnz_long, /*r:*/Active_fmnr, /*regex:*/Active_fmnr_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_fmno, /*timeOlder:*/Active_fmno_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.timeModified, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #timeModified m}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_fmn_long(
		/*i:*/Active_fimn, /*ignoreCase:*/Active_fimn_long, /*z:*/Active_fmnz, /*print0:*/Active_fmnz_long, /*r:*/Active_fmnr, /*regex:*/Active_fmnr_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_fmno, /*timeOlder:*/Active_fmno_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.timeModified, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #timeModified m}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_fmo(
		/*i:*/Active_fimo, /*ignoreCase:*/Active_fimo_long, /*z:*/Active_fmoz, /*print0:*/Active_fmoz_long, /*r:*/Active_fmor, /*regex:*/Active_fmor_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_fmno, /*timeNewer:*/Active_fmno_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.timeModified, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #timeModified m}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_fmo_long(
		/*i:*/Active_fimo, /*ignoreCase:*/Active_fimo_long, /*z:*/Active_fmoz, /*print0:*/Active_fmoz_long, /*r:*/Active_fmor, /*regex:*/Active_fmor_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_fmno, /*timeNewer:*/Active_fmno_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.timeModified, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeModified m}, {@link #typeFile f}.
     */
    Active_fmz(
		/*i:*/Active_fimz, /*ignoreCase:*/Active_fimz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_fmrz, /*regex:*/Active_fmrz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_fmnz, /*timeNewer:*/Active_fmnz_long, /*o:*/Active_fmoz, /*timeOlder:*/Active_fmoz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.timeModified, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeModified m}, {@link #typeFile f}.
     */
    Active_fmz_long(
		/*i:*/Active_fimz, /*ignoreCase:*/Active_fimz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_fmrz, /*regex:*/Active_fmrz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_fmnz, /*timeNewer:*/Active_fmnz_long, /*o:*/Active_fmoz, /*timeOlder:*/Active_fmoz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.timeModified, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #timeModified m}, {@link #typeFile f}.
     */
    Active_fm(
		/*i:*/Active_fim, /*ignoreCase:*/Active_fim_long, /*z:*/Active_fmz, /*print0:*/Active_fmz_long, /*r:*/Active_fmr, /*regex:*/Active_fmr_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_fmn, /*timeNewer:*/Active_fmn_long, /*o:*/Active_fmo, /*timeOlder:*/Active_fmo_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.timeModified, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #timeModified m}, {@link #typeFile f}.
     */
    Active_fm_long(
		/*i:*/Active_fim, /*ignoreCase:*/Active_fim_long, /*z:*/Active_fmz, /*print0:*/Active_fmz_long, /*r:*/Active_fmr, /*regex:*/Active_fmr_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_fmn, /*timeNewer:*/Active_fmn_long, /*o:*/Active_fmo, /*timeOlder:*/Active_fmo_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.timeModified, FindOption.typeFile
    );

    /**
     * Option {@code "-i"}: Use case insensitive matching when applying the file name pattern
     * specified by the name operand
     * <p>
     * (This option is ignored if no name operand is specified).
     * <p>
     * The option {@code "-i"} is equivalent to the {@code "--}{@link #ignoreCase ignoreCase}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-i"}. If the option {@code "-i"}
     * is already set, the field {@code i} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final FindOptionSet_fimnorz i;
    /**
     * Option {@code "--ignoreCase"}: Use case insensitive matching when applying the file name pattern
     * specified by the name operand
     * <p>
     * (This option is ignored if no name operand is specified).
     * <p>
     * The option {@code "--ignoreCase"} is equivalent to the {@code "-}{@link #i i}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--ignoreCase"}. If the option {@code "--ignoreCase"}
     * is already set, the field {@code ignoreCase} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final FindOptionSet_fimnorz ignoreCase;
    /**
     * Option {@code "-z"}: Print the full file name on the standard output, followed by a null
     * character (instead of the newline character used by default). This
     * allows file names that contain newlines or other types of white
     * space to be correctly interpreted by programs that process the find
     * output. This option corresponds to the --delimiter0 option of xargs.
     * <p>
     * The option {@code "-z"} is equivalent to the {@code "--}{@link #print0 print0}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-z"}. If the option {@code "-z"}
     * is already set, the field {@code z} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final FindOptionSet_fimnorz z;
    /**
     * Option {@code "--print0"}: Print the full file name on the standard output, followed by a null
     * character (instead of the newline character used by default). This
     * allows file names that contain newlines or other types of white
     * space to be correctly interpreted by programs that process the find
     * output. This option corresponds to the --delimiter0 option of xargs.
     * <p>
     * The option {@code "--print0"} is equivalent to the {@code "-}{@link #z z}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--print0"}. If the option {@code "--print0"}
     * is already set, the field {@code print0} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final FindOptionSet_fimnorz print0;
    /**
     * Option {@code "-r"}: Use full regular expression syntax for the patterns specified by the
     * name operand
     * <p>
     * (This option is ignored if no name operand is specified).
     * <p>
     * The option {@code "-r"} is equivalent to the {@code "--}{@link #regex regex}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-r"}. If the option {@code "-r"}
     * is already set, the field {@code r} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final FindOptionSet_fimnorz r;
    /**
     * Option {@code "--regex"}: Use full regular expression syntax for the patterns specified by the
     * name operand
     * <p>
     * (This option is ignored if no name operand is specified).
     * <p>
     * The option {@code "--regex"} is equivalent to the {@code "-}{@link #r r}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--regex"}. If the option {@code "--regex"}
     * is already set, the field {@code regex} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final FindOptionSet_fimnorz regex;
    /**
     * Option {@code "-m"}: The time operand refers to the last modification time of the file
     * (the default)
     * <p>
     * (This option is ignored if no time operand is specified).
     * <p>
     * The option {@code "-m"} is equivalent to the {@code "--}{@link #timeModified timeModified}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-m"}. If the option {@code "-m"}
     * is already set, the field {@code m} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final FindOptionSet_fimnorz m;
    /**
     * Option {@code "--timeModified"}: The time operand refers to the last modification time of the file
     * (the default)
     * <p>
     * (This option is ignored if no time operand is specified).
     * <p>
     * The option {@code "--timeModified"} is equivalent to the {@code "-}{@link #m m}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--timeModified"}. If the option {@code "--timeModified"}
     * is already set, the field {@code timeModified} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final FindOptionSet_fimnorz timeModified;
    /**
     * Option {@code "-n"}: Consider only files that have been created, modified or accessed
     * after or at the time specified by the time operand (the default)
     * <p>
     * (This option is ignored if no time operand is specified).
     * <p>
     * The option {@code "-n"} is equivalent to the {@code "--}{@link #timeNewer timeNewer}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-n"}. If the option {@code "-n"}
     * is already set, the field {@code n} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final FindOptionSet_fimnorz n;
    /**
     * Option {@code "--timeNewer"}: Consider only files that have been created, modified or accessed
     * after or at the time specified by the time operand (the default)
     * <p>
     * (This option is ignored if no time operand is specified).
     * <p>
     * The option {@code "--timeNewer"} is equivalent to the {@code "-}{@link #n n}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--timeNewer"}. If the option {@code "--timeNewer"}
     * is already set, the field {@code timeNewer} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final FindOptionSet_fimnorz timeNewer;
    /**
     * Option {@code "-o"}: Consider only files that have been created, modified or accessed
     * before or at the time specified by the time operand
     * <p>
     * (This option is ignored if no time operand is specified).
     * <p>
     * The option {@code "-o"} is equivalent to the {@code "--}{@link #timeOlder timeOlder}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-o"}. If the option {@code "-o"}
     * is already set, the field {@code o} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final FindOptionSet_fimnorz o;
    /**
     * Option {@code "--timeOlder"}: Consider only files that have been created, modified or accessed
     * before or at the time specified by the time operand
     * <p>
     * (This option is ignored if no time operand is specified).
     * <p>
     * The option {@code "--timeOlder"} is equivalent to the {@code "-}{@link #o o}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--timeOlder"}. If the option {@code "--timeOlder"}
     * is already set, the field {@code timeOlder} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final FindOptionSet_fimnorz timeOlder;
    /**
     * Option {@code "-f"}: Consider only regular files
     * <p>
     * The option {@code "-f"} is equivalent to the {@code "--}{@link #typeFile typeFile}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-f"}. If the option {@code "-f"}
     * is already set, the field {@code f} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final FindOptionSet_fimnorz f;
    /**
     * Option {@code "--typeFile"}: Consider only regular files
     * <p>
     * The option {@code "--typeFile"} is equivalent to the {@code "-}{@link #f f}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--typeFile"}. If the option {@code "--typeFile"}
     * is already set, the field {@code typeFile} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final FindOptionSet_fimnorz typeFile;
    private final boolean useAcronym;
    private final EnumSet<FindOption> options;

    private FindOptionSet_fimnorz(
            FindOptionSet_fimnorz i, FindOptionSet_fimnorz ignoreCase, FindOptionSet_fimnorz z, FindOptionSet_fimnorz print0, FindOptionSet_fimnorz r, FindOptionSet_fimnorz regex, FindOptionSet_fimnorz m, FindOptionSet_fimnorz timeModified, FindOptionSet_fimnorz n, FindOptionSet_fimnorz timeNewer, FindOptionSet_fimnorz o, FindOptionSet_fimnorz timeOlder, FindOptionSet_fimnorz f, FindOptionSet_fimnorz typeFile,
            boolean useAcronym,
            FindOption... activeOptions
    ) {
        this.i = i == null ? this : i;
        this.ignoreCase = ignoreCase == null ? this : ignoreCase;
        this.z = z == null ? this : z;
        this.print0 = print0 == null ? this : print0;
        this.r = r == null ? this : r;
        this.regex = regex == null ? this : regex;
        this.m = m == null ? this : m;
        this.timeModified = timeModified == null ? this : timeModified;
        this.n = n == null ? this : n;
        this.timeNewer = timeNewer == null ? this : timeNewer;
        this.o = o == null ? this : o;
        this.timeOlder = timeOlder == null ? this : timeOlder;
        this.f = f == null ? this : f;
        this.typeFile = typeFile == null ? this : typeFile;
        this.useAcronym = useAcronym;
        this.options = activeOptions.length == 0 ? EnumSet.noneOf(FindOption.class) : EnumSet.copyOf(Arrays.asList(activeOptions));
    }

    //inherit javadoc
    @Override
    public Class<FindOption> optionType() {
        return FindOption.class;
    }

    //inherit javadoc
    @Override
    public boolean isSet(FindOption option) {
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
    public EnumSet<FindOption> asSet() {
        return EnumSet.copyOf(options);
    }

    /**
     * Returns an immutable iterator with the active options of this option set.
     *
     * @return an immutable iterator for over the active options
     */
    @Override
    public Iterator<FindOption> iterator() {
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
     *    FindOptionSet_fimnorz.ignoreCase.z;
     * </pre>
     * uses acronyms, that is, this method always returns true for the above
     * set.
     * <p>
     * On the other hand, long option names are used and this method always
     * returns false for the set
     * <pre>
     *    FindOptionSet_fimnorz.i.print0;
     * </pre>
     * <p>
     * Note that a repeated option is <i>not</i> treated as the last set option.
     * For instance, the first and last option of the following set are
     * equivalent and acronyms are used:
     * <pre>
     *    FindOptionSet_fimnorz.i.z.ignoreCase;
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
    public boolean useAcronymFor(FindOption option) {
        return useAcronym;
    }
}
