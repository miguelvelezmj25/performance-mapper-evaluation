package org.unix4j.unix.find;

import org.unix4j.option.Option;
import org.unix4j.unix.Find;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Option sets for the {@link Find find} command with
 * the following options: {@link #i i}, {@link #z z}, {@link #r r}, {@link #m m}, {@link #n n}, {@link #o o}, {@link #l l}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Find#Options} should be used instead to specify command
 * options. See also {@link org.unix4j.unix.find.FindOptions} for more information.
 */
public enum FindOptionSet_ilmnorz implements FindOptions {
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_ilmnorz(
        /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_ilmnorz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_ilmnor(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ilmnorz, /*print0:*/Active_ilmnorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_ilmnor_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ilmnorz, /*print0:*/Active_ilmnorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeSymlink l}.
     */
    Active_ilmnrz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_ilmnorz, /*timeOlder:*/Active_ilmnorz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeSymlink l}.
     */
    Active_ilmnrz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_ilmnorz, /*timeOlder:*/Active_ilmnorz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_ilmorz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_ilmnorz, /*timeNewer:*/Active_ilmnorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_ilmorz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_ilmnorz, /*timeNewer:*/Active_ilmnorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_lmnorz(
		/*i:*/Active_ilmnorz, /*ignoreCase:*/Active_ilmnorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_lmnorz_long(
		/*i:*/Active_ilmnorz, /*ignoreCase:*/Active_ilmnorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_ilmnoz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_ilmnorz, /*regex:*/Active_ilmnorz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_ilmnoz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_ilmnorz, /*regex:*/Active_ilmnorz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeSymlink l}.
     */
    Active_ilmnr(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ilmnrz, /*print0:*/Active_ilmnrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_ilmnor, /*timeOlder:*/Active_ilmnor_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeSymlink l}.
     */
    Active_ilmnr_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ilmnrz, /*print0:*/Active_ilmnrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_ilmnor, /*timeOlder:*/Active_ilmnor_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_ilmor(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ilmorz, /*print0:*/Active_ilmorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_ilmnor, /*timeNewer:*/Active_ilmnor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeModified, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_ilmor_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ilmorz, /*print0:*/Active_ilmorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_ilmnor, /*timeNewer:*/Active_ilmnor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeModified, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #typeSymlink l}.
     */
    Active_ilmrz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_ilmnrz, /*timeNewer:*/Active_ilmnrz_long, /*o:*/Active_ilmorz, /*timeOlder:*/Active_ilmorz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #typeSymlink l}.
     */
    Active_ilmrz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_ilmnrz, /*timeNewer:*/Active_ilmnrz_long, /*o:*/Active_ilmorz, /*timeOlder:*/Active_ilmorz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_lmnor(
		/*i:*/Active_ilmnor, /*ignoreCase:*/Active_ilmnor_long, /*z:*/Active_lmnorz, /*print0:*/Active_lmnorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_lmnor_long(
		/*i:*/Active_ilmnor, /*ignoreCase:*/Active_ilmnor_long, /*z:*/Active_lmnorz, /*print0:*/Active_lmnorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeSymlink l}.
     */
    Active_lmnrz(
		/*i:*/Active_ilmnrz, /*ignoreCase:*/Active_ilmnrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_lmnorz, /*timeOlder:*/Active_lmnorz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeSymlink l}.
     */
    Active_lmnrz_long(
		/*i:*/Active_ilmnrz, /*ignoreCase:*/Active_ilmnrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_lmnorz, /*timeOlder:*/Active_lmnorz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_lmorz(
		/*i:*/Active_ilmorz, /*ignoreCase:*/Active_ilmorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_lmnorz, /*timeNewer:*/Active_lmnorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_lmorz_long(
		/*i:*/Active_ilmorz, /*ignoreCase:*/Active_ilmorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_lmnorz, /*timeNewer:*/Active_lmnorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_ilmno(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ilmnoz, /*print0:*/Active_ilmnoz_long, /*r:*/Active_ilmnor, /*regex:*/Active_ilmnor_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_ilmno_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ilmnoz, /*print0:*/Active_ilmnoz_long, /*r:*/Active_ilmnor, /*regex:*/Active_ilmnor_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeSymlink l}.
     */
    Active_ilmnz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_ilmnrz, /*regex:*/Active_ilmnrz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_ilmnoz, /*timeOlder:*/Active_ilmnoz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeModified, FindOption.timeNewer, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeSymlink l}.
     */
    Active_ilmnz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_ilmnrz, /*regex:*/Active_ilmnrz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_ilmnoz, /*timeOlder:*/Active_ilmnoz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeModified, FindOption.timeNewer, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_ilmoz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_ilmorz, /*regex:*/Active_ilmorz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_ilmnoz, /*timeNewer:*/Active_ilmnoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeModified, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_ilmoz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_ilmorz, /*regex:*/Active_ilmorz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_ilmnoz, /*timeNewer:*/Active_ilmnoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeModified, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_lmnoz(
		/*i:*/Active_ilmnoz, /*ignoreCase:*/Active_ilmnoz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_lmnorz, /*regex:*/Active_lmnorz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_lmnoz_long(
		/*i:*/Active_ilmnoz, /*ignoreCase:*/Active_ilmnoz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_lmnorz, /*regex:*/Active_lmnorz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeModified m}, {@link #typeSymlink l}.
     */
    Active_ilmr(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ilmrz, /*print0:*/Active_ilmrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_ilmnr, /*timeNewer:*/Active_ilmnr_long, /*o:*/Active_ilmor, /*timeOlder:*/Active_ilmor_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeModified, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeModified m}, {@link #typeSymlink l}.
     */
    Active_ilmr_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ilmrz, /*print0:*/Active_ilmrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_ilmnr, /*timeNewer:*/Active_ilmnr_long, /*o:*/Active_ilmor, /*timeOlder:*/Active_ilmor_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeModified, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeSymlink l}.
     */
    Active_lmnr(
		/*i:*/Active_ilmnr, /*ignoreCase:*/Active_ilmnr_long, /*z:*/Active_lmnrz, /*print0:*/Active_lmnrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_lmnor, /*timeOlder:*/Active_lmnor_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeSymlink l}.
     */
    Active_lmnr_long(
		/*i:*/Active_ilmnr, /*ignoreCase:*/Active_ilmnr_long, /*z:*/Active_lmnrz, /*print0:*/Active_lmnrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_lmnor, /*timeOlder:*/Active_lmnor_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_lmor(
		/*i:*/Active_ilmor, /*ignoreCase:*/Active_ilmor_long, /*z:*/Active_lmorz, /*print0:*/Active_lmorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_lmnor, /*timeNewer:*/Active_lmnor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.regex, FindOption.timeModified, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_lmor_long(
		/*i:*/Active_ilmor, /*ignoreCase:*/Active_ilmor_long, /*z:*/Active_lmorz, /*print0:*/Active_lmorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_lmnor, /*timeNewer:*/Active_lmnor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.regex, FindOption.timeModified, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #typeSymlink l}.
     */
    Active_lmrz(
		/*i:*/Active_ilmrz, /*ignoreCase:*/Active_ilmrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_lmnrz, /*timeNewer:*/Active_lmnrz_long, /*o:*/Active_lmorz, /*timeOlder:*/Active_lmorz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #typeSymlink l}.
     */
    Active_lmrz_long(
		/*i:*/Active_ilmrz, /*ignoreCase:*/Active_ilmrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_lmnrz, /*timeNewer:*/Active_lmnrz_long, /*o:*/Active_lmorz, /*timeOlder:*/Active_lmorz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeSymlink l}.
     */
    Active_ilmn(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ilmnz, /*print0:*/Active_ilmnz_long, /*r:*/Active_ilmnr, /*regex:*/Active_ilmnr_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_ilmno, /*timeOlder:*/Active_ilmno_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeModified, FindOption.timeNewer, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeSymlink l}.
     */
    Active_ilmn_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ilmnz, /*print0:*/Active_ilmnz_long, /*r:*/Active_ilmnr, /*regex:*/Active_ilmnr_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_ilmno, /*timeOlder:*/Active_ilmno_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeModified, FindOption.timeNewer, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_ilmo(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ilmoz, /*print0:*/Active_ilmoz_long, /*r:*/Active_ilmor, /*regex:*/Active_ilmor_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_ilmno, /*timeNewer:*/Active_ilmno_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeModified, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_ilmo_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ilmoz, /*print0:*/Active_ilmoz_long, /*r:*/Active_ilmor, /*regex:*/Active_ilmor_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_ilmno, /*timeNewer:*/Active_ilmno_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeModified, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeModified m}, {@link #typeSymlink l}.
     */
    Active_ilmz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_ilmrz, /*regex:*/Active_ilmrz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_ilmnz, /*timeNewer:*/Active_ilmnz_long, /*o:*/Active_ilmoz, /*timeOlder:*/Active_ilmoz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeModified, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeModified m}, {@link #typeSymlink l}.
     */
    Active_ilmz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_ilmrz, /*regex:*/Active_ilmrz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_ilmnz, /*timeNewer:*/Active_ilmnz_long, /*o:*/Active_ilmoz, /*timeOlder:*/Active_ilmoz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeModified, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_lmno(
		/*i:*/Active_ilmno, /*ignoreCase:*/Active_ilmno_long, /*z:*/Active_lmnoz, /*print0:*/Active_lmnoz_long, /*r:*/Active_lmnor, /*regex:*/Active_lmnor_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_lmno_long(
		/*i:*/Active_ilmno, /*ignoreCase:*/Active_ilmno_long, /*z:*/Active_lmnoz, /*print0:*/Active_lmnoz_long, /*r:*/Active_lmnor, /*regex:*/Active_lmnor_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeSymlink l}.
     */
    Active_lmnz(
		/*i:*/Active_ilmnz, /*ignoreCase:*/Active_ilmnz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_lmnrz, /*regex:*/Active_lmnrz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_lmnoz, /*timeOlder:*/Active_lmnoz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.timeModified, FindOption.timeNewer, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeSymlink l}.
     */
    Active_lmnz_long(
		/*i:*/Active_ilmnz, /*ignoreCase:*/Active_ilmnz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_lmnrz, /*regex:*/Active_lmnrz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_lmnoz, /*timeOlder:*/Active_lmnoz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.timeModified, FindOption.timeNewer, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_lmoz(
		/*i:*/Active_ilmoz, /*ignoreCase:*/Active_ilmoz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_lmorz, /*regex:*/Active_lmorz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_lmnoz, /*timeNewer:*/Active_lmnoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.timeModified, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_lmoz_long(
		/*i:*/Active_ilmoz, /*ignoreCase:*/Active_ilmoz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_lmorz, /*regex:*/Active_lmorz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_lmnoz, /*timeNewer:*/Active_lmnoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.timeModified, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeModified m}, {@link #typeSymlink l}.
     */
    Active_lmr(
		/*i:*/Active_ilmr, /*ignoreCase:*/Active_ilmr_long, /*z:*/Active_lmrz, /*print0:*/Active_lmrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_lmnr, /*timeNewer:*/Active_lmnr_long, /*o:*/Active_lmor, /*timeOlder:*/Active_lmor_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.regex, FindOption.timeModified, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeModified m}, {@link #typeSymlink l}.
     */
    Active_lmr_long(
		/*i:*/Active_ilmr, /*ignoreCase:*/Active_ilmr_long, /*z:*/Active_lmrz, /*print0:*/Active_lmrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_lmnr, /*timeNewer:*/Active_lmnr_long, /*o:*/Active_lmor, /*timeOlder:*/Active_lmor_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.regex, FindOption.timeModified, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeModified m}, {@link #typeSymlink l}.
     */
    Active_ilm(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ilmz, /*print0:*/Active_ilmz_long, /*r:*/Active_ilmr, /*regex:*/Active_ilmr_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_ilmn, /*timeNewer:*/Active_ilmn_long, /*o:*/Active_ilmo, /*timeOlder:*/Active_ilmo_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeModified, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeModified m}, {@link #typeSymlink l}.
     */
    Active_ilm_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ilmz, /*print0:*/Active_ilmz_long, /*r:*/Active_ilmr, /*regex:*/Active_ilmr_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_ilmn, /*timeNewer:*/Active_ilmn_long, /*o:*/Active_ilmo, /*timeOlder:*/Active_ilmo_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeModified, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #timeModified m}, {@link #timeNewer n}, {@link #typeSymlink l}.
     */
    Active_lmn(
		/*i:*/Active_ilmn, /*ignoreCase:*/Active_ilmn_long, /*z:*/Active_lmnz, /*print0:*/Active_lmnz_long, /*r:*/Active_lmnr, /*regex:*/Active_lmnr_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_lmno, /*timeOlder:*/Active_lmno_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.timeModified, FindOption.timeNewer, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #timeModified m}, {@link #timeNewer n}, {@link #typeSymlink l}.
     */
    Active_lmn_long(
		/*i:*/Active_ilmn, /*ignoreCase:*/Active_ilmn_long, /*z:*/Active_lmnz, /*print0:*/Active_lmnz_long, /*r:*/Active_lmnr, /*regex:*/Active_lmnr_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_lmno, /*timeOlder:*/Active_lmno_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.timeModified, FindOption.timeNewer, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #timeModified m}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_lmo(
		/*i:*/Active_ilmo, /*ignoreCase:*/Active_ilmo_long, /*z:*/Active_lmoz, /*print0:*/Active_lmoz_long, /*r:*/Active_lmor, /*regex:*/Active_lmor_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_lmno, /*timeNewer:*/Active_lmno_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.timeModified, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #timeModified m}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_lmo_long(
		/*i:*/Active_ilmo, /*ignoreCase:*/Active_ilmo_long, /*z:*/Active_lmoz, /*print0:*/Active_lmoz_long, /*r:*/Active_lmor, /*regex:*/Active_lmor_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_lmno, /*timeNewer:*/Active_lmno_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.timeModified, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeModified m}, {@link #typeSymlink l}.
     */
    Active_lmz(
		/*i:*/Active_ilmz, /*ignoreCase:*/Active_ilmz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_lmrz, /*regex:*/Active_lmrz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_lmnz, /*timeNewer:*/Active_lmnz_long, /*o:*/Active_lmoz, /*timeOlder:*/Active_lmoz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.timeModified, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeModified m}, {@link #typeSymlink l}.
     */
    Active_lmz_long(
		/*i:*/Active_ilmz, /*ignoreCase:*/Active_ilmz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_lmrz, /*regex:*/Active_lmrz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_lmnz, /*timeNewer:*/Active_lmnz_long, /*o:*/Active_lmoz, /*timeOlder:*/Active_lmoz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.timeModified, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #timeModified m}, {@link #typeSymlink l}.
     */
    Active_lm(
		/*i:*/Active_ilm, /*ignoreCase:*/Active_ilm_long, /*z:*/Active_lmz, /*print0:*/Active_lmz_long, /*r:*/Active_lmr, /*regex:*/Active_lmr_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_lmn, /*timeNewer:*/Active_lmn_long, /*o:*/Active_lmo, /*timeOlder:*/Active_lmo_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.timeModified, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #timeModified m}, {@link #typeSymlink l}.
     */
    Active_lm_long(
		/*i:*/Active_ilm, /*ignoreCase:*/Active_ilm_long, /*z:*/Active_lmz, /*print0:*/Active_lmz_long, /*r:*/Active_lmr, /*regex:*/Active_lmr_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_lmn, /*timeNewer:*/Active_lmn_long, /*o:*/Active_lmo, /*timeOlder:*/Active_lmo_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.timeModified, FindOption.typeSymlink
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
    public final FindOptionSet_ilmnorz i;
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
    public final FindOptionSet_ilmnorz ignoreCase;
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
    public final FindOptionSet_ilmnorz z;
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
    public final FindOptionSet_ilmnorz print0;
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
    public final FindOptionSet_ilmnorz r;
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
    public final FindOptionSet_ilmnorz regex;
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
    public final FindOptionSet_ilmnorz m;
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
    public final FindOptionSet_ilmnorz timeModified;
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
    public final FindOptionSet_ilmnorz n;
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
    public final FindOptionSet_ilmnorz timeNewer;
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
    public final FindOptionSet_ilmnorz o;
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
    public final FindOptionSet_ilmnorz timeOlder;
    /**
     * Option {@code "-l"}: Consider only symbolic links
     * <p>
     * The option {@code "-l"} is equivalent to the {@code "--}{@link #typeSymlink typeSymlink}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-l"}. If the option {@code "-l"}
     * is already set, the field {@code l} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final FindOptionSet_ilmnorz l;
    /**
     * Option {@code "--typeSymlink"}: Consider only symbolic links
     * <p>
     * The option {@code "--typeSymlink"} is equivalent to the {@code "-}{@link #l l}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--typeSymlink"}. If the option {@code "--typeSymlink"}
     * is already set, the field {@code typeSymlink} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final FindOptionSet_ilmnorz typeSymlink;
    private final boolean useAcronym;
    private final EnumSet<FindOption> options;
    private FindOptionSet_ilmnorz(
            FindOptionSet_ilmnorz i, FindOptionSet_ilmnorz ignoreCase, FindOptionSet_ilmnorz z, FindOptionSet_ilmnorz print0, FindOptionSet_ilmnorz r, FindOptionSet_ilmnorz regex, FindOptionSet_ilmnorz m, FindOptionSet_ilmnorz timeModified, FindOptionSet_ilmnorz n, FindOptionSet_ilmnorz timeNewer, FindOptionSet_ilmnorz o, FindOptionSet_ilmnorz timeOlder, FindOptionSet_ilmnorz l, FindOptionSet_ilmnorz typeSymlink,
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
        this.l = l == null ? this : l;
        this.typeSymlink = typeSymlink == null ? this : typeSymlink;
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
     *    FindOptionSet_ilmnorz.ignoreCase.z;
     * </pre>
     * uses acronyms, that is, this method always returns true for the above
     * set.
     * <p>
     * On the other hand, long option names are used and this method always
     * returns false for the set
     * <pre>
     *    FindOptionSet_ilmnorz.i.print0;
     * </pre>
     * <p>
     * Note that a repeated option is <i>not</i> treated as the last set option.
     * For instance, the first and last option of the following set are
     * equivalent and acronyms are used:
     * <pre>
     *    FindOptionSet_ilmnorz.i.z.ignoreCase;
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
