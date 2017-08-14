package org.unix4j.unix.find;

import org.unix4j.option.Option;
import org.unix4j.unix.Find;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Option sets for the {@link Find find} command with
 * the following options: {@link #i i}, {@link #z z}, {@link #r r}, {@link #a a}, {@link #n n}, {@link #o o}, {@link #f f}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Find#Options} should be used instead to specify command
 * options. See also {@link org.unix4j.unix.find.FindOptions} for more information.
 */
public enum FindOptionSet_afinorz implements FindOptions {
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_afinorz(
        /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
        /*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_afinorz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_afinor(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_afinorz, /*print0:*/Active_afinorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_afinor_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_afinorz, /*print0:*/Active_afinorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_afinrz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_afinorz, /*timeOlder:*/Active_afinorz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_afinrz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_afinorz, /*timeOlder:*/Active_afinorz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_afiorz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_afinorz, /*timeNewer:*/Active_afinorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_afiorz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_afinorz, /*timeNewer:*/Active_afinorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_afnorz(
		/*i:*/Active_afinorz, /*ignoreCase:*/Active_afinorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_afnorz_long(
		/*i:*/Active_afinorz, /*ignoreCase:*/Active_afinorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_afinoz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_afinorz, /*regex:*/Active_afinorz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_afinoz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_afinorz, /*regex:*/Active_afinorz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_afinr(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_afinrz, /*print0:*/Active_afinrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_afinor, /*timeOlder:*/Active_afinor_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_afinr_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_afinrz, /*print0:*/Active_afinrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_afinor, /*timeOlder:*/Active_afinor_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_afior(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_afiorz, /*print0:*/Active_afiorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_afinor, /*timeNewer:*/Active_afinor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_afior_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_afiorz, /*print0:*/Active_afiorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_afinor, /*timeNewer:*/Active_afinor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #typeFile f}.
     */
    Active_afirz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_afinrz, /*timeNewer:*/Active_afinrz_long, /*o:*/Active_afiorz, /*timeOlder:*/Active_afiorz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #typeFile f}.
     */
    Active_afirz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_afinrz, /*timeNewer:*/Active_afinrz_long, /*o:*/Active_afiorz, /*timeOlder:*/Active_afiorz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_afnor(
		/*i:*/Active_afinor, /*ignoreCase:*/Active_afinor_long, /*z:*/Active_afnorz, /*print0:*/Active_afnorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_afnor_long(
		/*i:*/Active_afinor, /*ignoreCase:*/Active_afinor_long, /*z:*/Active_afnorz, /*print0:*/Active_afnorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_afnrz(
		/*i:*/Active_afinrz, /*ignoreCase:*/Active_afinrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_afnorz, /*timeOlder:*/Active_afnorz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_afnrz_long(
		/*i:*/Active_afinrz, /*ignoreCase:*/Active_afinrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_afnorz, /*timeOlder:*/Active_afnorz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_aforz(
		/*i:*/Active_afiorz, /*ignoreCase:*/Active_afiorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_afnorz, /*timeNewer:*/Active_afnorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_aforz_long(
		/*i:*/Active_afiorz, /*ignoreCase:*/Active_afiorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_afnorz, /*timeNewer:*/Active_afnorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_afino(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_afinoz, /*print0:*/Active_afinoz_long, /*r:*/Active_afinor, /*regex:*/Active_afinor_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_afino_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_afinoz, /*print0:*/Active_afinoz_long, /*r:*/Active_afinor, /*regex:*/Active_afinor_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_afinz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_afinrz, /*regex:*/Active_afinrz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_afinoz, /*timeOlder:*/Active_afinoz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_afinz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_afinrz, /*regex:*/Active_afinrz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_afinoz, /*timeOlder:*/Active_afinoz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_afioz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_afiorz, /*regex:*/Active_afiorz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_afinoz, /*timeNewer:*/Active_afinoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_afioz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_afiorz, /*regex:*/Active_afiorz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_afinoz, /*timeNewer:*/Active_afinoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_afnoz(
		/*i:*/Active_afinoz, /*ignoreCase:*/Active_afinoz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_afnorz, /*regex:*/Active_afnorz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_afnoz_long(
		/*i:*/Active_afinoz, /*ignoreCase:*/Active_afinoz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_afnorz, /*regex:*/Active_afnorz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeAccess a}, {@link #typeFile f}.
     */
    Active_afir(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_afirz, /*print0:*/Active_afirz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_afinr, /*timeNewer:*/Active_afinr_long, /*o:*/Active_afior, /*timeOlder:*/Active_afior_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeAccess, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeAccess a}, {@link #typeFile f}.
     */
    Active_afir_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_afirz, /*print0:*/Active_afirz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_afinr, /*timeNewer:*/Active_afinr_long, /*o:*/Active_afior, /*timeOlder:*/Active_afior_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeAccess, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_afnr(
		/*i:*/Active_afinr, /*ignoreCase:*/Active_afinr_long, /*z:*/Active_afnrz, /*print0:*/Active_afnrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_afnor, /*timeOlder:*/Active_afnor_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_afnr_long(
		/*i:*/Active_afinr, /*ignoreCase:*/Active_afinr_long, /*z:*/Active_afnrz, /*print0:*/Active_afnrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_afnor, /*timeOlder:*/Active_afnor_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_afor(
		/*i:*/Active_afior, /*ignoreCase:*/Active_afior_long, /*z:*/Active_aforz, /*print0:*/Active_aforz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_afnor, /*timeNewer:*/Active_afnor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.regex, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_afor_long(
		/*i:*/Active_afior, /*ignoreCase:*/Active_afior_long, /*z:*/Active_aforz, /*print0:*/Active_aforz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_afnor, /*timeNewer:*/Active_afnor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.regex, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #typeFile f}.
     */
    Active_afrz(
		/*i:*/Active_afirz, /*ignoreCase:*/Active_afirz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_afnrz, /*timeNewer:*/Active_afnrz_long, /*o:*/Active_aforz, /*timeOlder:*/Active_aforz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #typeFile f}.
     */
    Active_afrz_long(
		/*i:*/Active_afirz, /*ignoreCase:*/Active_afirz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_afnrz, /*timeNewer:*/Active_afnrz_long, /*o:*/Active_aforz, /*timeOlder:*/Active_aforz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_afin(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_afinz, /*print0:*/Active_afinz_long, /*r:*/Active_afinr, /*regex:*/Active_afinr_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_afino, /*timeOlder:*/Active_afino_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_afin_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_afinz, /*print0:*/Active_afinz_long, /*r:*/Active_afinr, /*regex:*/Active_afinr_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_afino, /*timeOlder:*/Active_afino_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_afio(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_afioz, /*print0:*/Active_afioz_long, /*r:*/Active_afior, /*regex:*/Active_afior_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_afino, /*timeNewer:*/Active_afino_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_afio_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_afioz, /*print0:*/Active_afioz_long, /*r:*/Active_afior, /*regex:*/Active_afior_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_afino, /*timeNewer:*/Active_afino_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeAccess a}, {@link #typeFile f}.
     */
    Active_afiz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_afirz, /*regex:*/Active_afirz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_afinz, /*timeNewer:*/Active_afinz_long, /*o:*/Active_afioz, /*timeOlder:*/Active_afioz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeAccess, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeAccess a}, {@link #typeFile f}.
     */
    Active_afiz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_afirz, /*regex:*/Active_afirz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_afinz, /*timeNewer:*/Active_afinz_long, /*o:*/Active_afioz, /*timeOlder:*/Active_afioz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeAccess, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_afno(
		/*i:*/Active_afino, /*ignoreCase:*/Active_afino_long, /*z:*/Active_afnoz, /*print0:*/Active_afnoz_long, /*r:*/Active_afnor, /*regex:*/Active_afnor_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_afno_long(
		/*i:*/Active_afino, /*ignoreCase:*/Active_afino_long, /*z:*/Active_afnoz, /*print0:*/Active_afnoz_long, /*r:*/Active_afnor, /*regex:*/Active_afnor_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_afnz(
		/*i:*/Active_afinz, /*ignoreCase:*/Active_afinz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_afnrz, /*regex:*/Active_afnrz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_afnoz, /*timeOlder:*/Active_afnoz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_afnz_long(
		/*i:*/Active_afinz, /*ignoreCase:*/Active_afinz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_afnrz, /*regex:*/Active_afnrz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_afnoz, /*timeOlder:*/Active_afnoz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_afoz(
		/*i:*/Active_afioz, /*ignoreCase:*/Active_afioz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_aforz, /*regex:*/Active_aforz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_afnoz, /*timeNewer:*/Active_afnoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_afoz_long(
		/*i:*/Active_afioz, /*ignoreCase:*/Active_afioz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_aforz, /*regex:*/Active_aforz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_afnoz, /*timeNewer:*/Active_afnoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeAccess a}, {@link #typeFile f}.
     */
    Active_afr(
		/*i:*/Active_afir, /*ignoreCase:*/Active_afir_long, /*z:*/Active_afrz, /*print0:*/Active_afrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_afnr, /*timeNewer:*/Active_afnr_long, /*o:*/Active_afor, /*timeOlder:*/Active_afor_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.regex, FindOption.timeAccess, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeAccess a}, {@link #typeFile f}.
     */
    Active_afr_long(
		/*i:*/Active_afir, /*ignoreCase:*/Active_afir_long, /*z:*/Active_afrz, /*print0:*/Active_afrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_afnr, /*timeNewer:*/Active_afnr_long, /*o:*/Active_afor, /*timeOlder:*/Active_afor_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.regex, FindOption.timeAccess, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeAccess a}, {@link #typeFile f}.
     */
    Active_afi(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_afiz, /*print0:*/Active_afiz_long, /*r:*/Active_afir, /*regex:*/Active_afir_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_afin, /*timeNewer:*/Active_afin_long, /*o:*/Active_afio, /*timeOlder:*/Active_afio_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeAccess, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeAccess a}, {@link #typeFile f}.
     */
    Active_afi_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_afiz, /*print0:*/Active_afiz_long, /*r:*/Active_afir, /*regex:*/Active_afir_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_afin, /*timeNewer:*/Active_afin_long, /*o:*/Active_afio, /*timeOlder:*/Active_afio_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeAccess, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_afn(
		/*i:*/Active_afin, /*ignoreCase:*/Active_afin_long, /*z:*/Active_afnz, /*print0:*/Active_afnz_long, /*r:*/Active_afnr, /*regex:*/Active_afnr_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_afno, /*timeOlder:*/Active_afno_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.timeAccess, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_afn_long(
		/*i:*/Active_afin, /*ignoreCase:*/Active_afin_long, /*z:*/Active_afnz, /*print0:*/Active_afnz_long, /*r:*/Active_afnr, /*regex:*/Active_afnr_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_afno, /*timeOlder:*/Active_afno_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.timeAccess, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_afo(
		/*i:*/Active_afio, /*ignoreCase:*/Active_afio_long, /*z:*/Active_afoz, /*print0:*/Active_afoz_long, /*r:*/Active_afor, /*regex:*/Active_afor_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_afno, /*timeNewer:*/Active_afno_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.timeAccess, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_afo_long(
		/*i:*/Active_afio, /*ignoreCase:*/Active_afio_long, /*z:*/Active_afoz, /*print0:*/Active_afoz_long, /*r:*/Active_afor, /*regex:*/Active_afor_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_afno, /*timeNewer:*/Active_afno_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.timeAccess, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeAccess a}, {@link #typeFile f}.
     */
    Active_afz(
		/*i:*/Active_afiz, /*ignoreCase:*/Active_afiz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_afrz, /*regex:*/Active_afrz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_afnz, /*timeNewer:*/Active_afnz_long, /*o:*/Active_afoz, /*timeOlder:*/Active_afoz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.timeAccess, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeAccess a}, {@link #typeFile f}.
     */
    Active_afz_long(
		/*i:*/Active_afiz, /*ignoreCase:*/Active_afiz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_afrz, /*regex:*/Active_afrz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_afnz, /*timeNewer:*/Active_afnz_long, /*o:*/Active_afoz, /*timeOlder:*/Active_afoz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.timeAccess, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #timeAccess a}, {@link #typeFile f}.
     */
    Active_af(
		/*i:*/Active_afi, /*ignoreCase:*/Active_afi_long, /*z:*/Active_afz, /*print0:*/Active_afz_long, /*r:*/Active_afr, /*regex:*/Active_afr_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_afn, /*timeNewer:*/Active_afn_long, /*o:*/Active_afo, /*timeOlder:*/Active_afo_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.timeAccess, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #timeAccess a}, {@link #typeFile f}.
     */
    Active_af_long(
		/*i:*/Active_afi, /*ignoreCase:*/Active_afi_long, /*z:*/Active_afz, /*print0:*/Active_afz_long, /*r:*/Active_afr, /*regex:*/Active_afr_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_afn, /*timeNewer:*/Active_afn_long, /*o:*/Active_afo, /*timeOlder:*/Active_afo_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.timeAccess, FindOption.typeFile
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
    public final FindOptionSet_afinorz i;
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
    public final FindOptionSet_afinorz ignoreCase;
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
    public final FindOptionSet_afinorz z;
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
    public final FindOptionSet_afinorz print0;
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
    public final FindOptionSet_afinorz r;
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
    public final FindOptionSet_afinorz regex;
    /**
     * Option {@code "-a"}: The time operand refers to the last access time of the file
     * <p>
     * (This option is ignored if no time operand is specified).
     * <p>
     * The option {@code "-a"} is equivalent to the {@code "--}{@link #timeAccess timeAccess}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-a"}. If the option {@code "-a"}
     * is already set, the field {@code a} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final FindOptionSet_afinorz a;
    /**
     * Option {@code "--timeAccess"}: The time operand refers to the last access time of the file
     * <p>
     * (This option is ignored if no time operand is specified).
     * <p>
     * The option {@code "--timeAccess"} is equivalent to the {@code "-}{@link #a a}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--timeAccess"}. If the option {@code "--timeAccess"}
     * is already set, the field {@code timeAccess} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final FindOptionSet_afinorz timeAccess;
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
    public final FindOptionSet_afinorz n;
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
    public final FindOptionSet_afinorz timeNewer;
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
    public final FindOptionSet_afinorz o;
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
    public final FindOptionSet_afinorz timeOlder;
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
    public final FindOptionSet_afinorz f;
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
    public final FindOptionSet_afinorz typeFile;
    private final boolean useAcronym;
    private final EnumSet<FindOption> options;

    private FindOptionSet_afinorz(
            FindOptionSet_afinorz i, FindOptionSet_afinorz ignoreCase, FindOptionSet_afinorz z, FindOptionSet_afinorz print0, FindOptionSet_afinorz r, FindOptionSet_afinorz regex, FindOptionSet_afinorz a, FindOptionSet_afinorz timeAccess, FindOptionSet_afinorz n, FindOptionSet_afinorz timeNewer, FindOptionSet_afinorz o, FindOptionSet_afinorz timeOlder, FindOptionSet_afinorz f, FindOptionSet_afinorz typeFile,
            boolean useAcronym,
            FindOption... activeOptions
    ) {
        this.i = i == null ? this : i;
        this.ignoreCase = ignoreCase == null ? this : ignoreCase;
        this.z = z == null ? this : z;
        this.print0 = print0 == null ? this : print0;
        this.r = r == null ? this : r;
        this.regex = regex == null ? this : regex;
        this.a = a == null ? this : a;
        this.timeAccess = timeAccess == null ? this : timeAccess;
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
     *    FindOptionSet_afinorz.ignoreCase.z;
     * </pre>
     * uses acronyms, that is, this method always returns true for the above
     * set.
     * <p>
     * On the other hand, long option names are used and this method always
     * returns false for the set
     * <pre>
     *    FindOptionSet_afinorz.i.print0;
     * </pre>
     * <p>
     * Note that a repeated option is <i>not</i> treated as the last set option.
     * For instance, the first and last option of the following set are
     * equivalent and acronyms are used:
     * <pre>
     *    FindOptionSet_afinorz.i.z.ignoreCase;
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
