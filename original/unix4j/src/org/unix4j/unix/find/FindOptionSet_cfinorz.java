package org.unix4j.unix.find;

import org.unix4j.option.Option;
import org.unix4j.unix.Find;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Option sets for the {@link Find find} command with
 * the following options: {@link #i i}, {@link #z z}, {@link #r r}, {@link #c c}, {@link #n n}, {@link #o o}, {@link #f f}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Find#Options} should be used instead to specify command
 * options. See also {@link org.unix4j.unix.find.FindOptions} for more information.
 */
public enum FindOptionSet_cfinorz implements FindOptions {
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_cfinorz(
        /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_cfinorz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_cfinor(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cfinorz, /*print0:*/Active_cfinorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_cfinor_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cfinorz, /*print0:*/Active_cfinorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_cfinrz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cfinorz, /*timeOlder:*/Active_cfinorz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_cfinrz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cfinorz, /*timeOlder:*/Active_cfinorz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_cfiorz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cfinorz, /*timeNewer:*/Active_cfinorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_cfiorz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cfinorz, /*timeNewer:*/Active_cfinorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_cfnorz(
		/*i:*/Active_cfinorz, /*ignoreCase:*/Active_cfinorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_cfnorz_long(
		/*i:*/Active_cfinorz, /*ignoreCase:*/Active_cfinorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_cfinoz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cfinorz, /*regex:*/Active_cfinorz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_cfinoz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cfinorz, /*regex:*/Active_cfinorz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_cfinr(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cfinrz, /*print0:*/Active_cfinrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cfinor, /*timeOlder:*/Active_cfinor_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_cfinr_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cfinrz, /*print0:*/Active_cfinrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cfinor, /*timeOlder:*/Active_cfinor_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_cfior(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cfiorz, /*print0:*/Active_cfiorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cfinor, /*timeNewer:*/Active_cfinor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_cfior_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cfiorz, /*print0:*/Active_cfiorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cfinor, /*timeNewer:*/Active_cfinor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #typeFile f}.
     */
    Active_cfirz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cfinrz, /*timeNewer:*/Active_cfinrz_long, /*o:*/Active_cfiorz, /*timeOlder:*/Active_cfiorz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #typeFile f}.
     */
    Active_cfirz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cfinrz, /*timeNewer:*/Active_cfinrz_long, /*o:*/Active_cfiorz, /*timeOlder:*/Active_cfiorz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_cfnor(
		/*i:*/Active_cfinor, /*ignoreCase:*/Active_cfinor_long, /*z:*/Active_cfnorz, /*print0:*/Active_cfnorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_cfnor_long(
		/*i:*/Active_cfinor, /*ignoreCase:*/Active_cfinor_long, /*z:*/Active_cfnorz, /*print0:*/Active_cfnorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_cfnrz(
		/*i:*/Active_cfinrz, /*ignoreCase:*/Active_cfinrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cfnorz, /*timeOlder:*/Active_cfnorz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_cfnrz_long(
		/*i:*/Active_cfinrz, /*ignoreCase:*/Active_cfinrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cfnorz, /*timeOlder:*/Active_cfnorz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_cforz(
		/*i:*/Active_cfiorz, /*ignoreCase:*/Active_cfiorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cfnorz, /*timeNewer:*/Active_cfnorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_cforz_long(
		/*i:*/Active_cfiorz, /*ignoreCase:*/Active_cfiorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cfnorz, /*timeNewer:*/Active_cfnorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_cfino(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cfinoz, /*print0:*/Active_cfinoz_long, /*r:*/Active_cfinor, /*regex:*/Active_cfinor_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_cfino_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cfinoz, /*print0:*/Active_cfinoz_long, /*r:*/Active_cfinor, /*regex:*/Active_cfinor_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_cfinz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cfinrz, /*regex:*/Active_cfinrz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cfinoz, /*timeOlder:*/Active_cfinoz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_cfinz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cfinrz, /*regex:*/Active_cfinrz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cfinoz, /*timeOlder:*/Active_cfinoz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_cfioz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cfiorz, /*regex:*/Active_cfiorz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cfinoz, /*timeNewer:*/Active_cfinoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_cfioz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cfiorz, /*regex:*/Active_cfiorz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cfinoz, /*timeNewer:*/Active_cfinoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_cfnoz(
		/*i:*/Active_cfinoz, /*ignoreCase:*/Active_cfinoz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cfnorz, /*regex:*/Active_cfnorz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_cfnoz_long(
		/*i:*/Active_cfinoz, /*ignoreCase:*/Active_cfinoz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cfnorz, /*regex:*/Active_cfnorz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeCreate c}, {@link #typeFile f}.
     */
    Active_cfir(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cfirz, /*print0:*/Active_cfirz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cfinr, /*timeNewer:*/Active_cfinr_long, /*o:*/Active_cfior, /*timeOlder:*/Active_cfior_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeCreate, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeCreate c}, {@link #typeFile f}.
     */
    Active_cfir_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cfirz, /*print0:*/Active_cfirz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cfinr, /*timeNewer:*/Active_cfinr_long, /*o:*/Active_cfior, /*timeOlder:*/Active_cfior_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeCreate, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_cfnr(
		/*i:*/Active_cfinr, /*ignoreCase:*/Active_cfinr_long, /*z:*/Active_cfnrz, /*print0:*/Active_cfnrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cfnor, /*timeOlder:*/Active_cfnor_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_cfnr_long(
		/*i:*/Active_cfinr, /*ignoreCase:*/Active_cfinr_long, /*z:*/Active_cfnrz, /*print0:*/Active_cfnrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cfnor, /*timeOlder:*/Active_cfnor_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_cfor(
		/*i:*/Active_cfior, /*ignoreCase:*/Active_cfior_long, /*z:*/Active_cforz, /*print0:*/Active_cforz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cfnor, /*timeNewer:*/Active_cfnor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.regex, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_cfor_long(
		/*i:*/Active_cfior, /*ignoreCase:*/Active_cfior_long, /*z:*/Active_cforz, /*print0:*/Active_cforz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cfnor, /*timeNewer:*/Active_cfnor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.regex, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #typeFile f}.
     */
    Active_cfrz(
		/*i:*/Active_cfirz, /*ignoreCase:*/Active_cfirz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cfnrz, /*timeNewer:*/Active_cfnrz_long, /*o:*/Active_cforz, /*timeOlder:*/Active_cforz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #typeFile f}.
     */
    Active_cfrz_long(
		/*i:*/Active_cfirz, /*ignoreCase:*/Active_cfirz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cfnrz, /*timeNewer:*/Active_cfnrz_long, /*o:*/Active_cforz, /*timeOlder:*/Active_cforz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_cfin(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cfinz, /*print0:*/Active_cfinz_long, /*r:*/Active_cfinr, /*regex:*/Active_cfinr_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cfino, /*timeOlder:*/Active_cfino_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_cfin_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cfinz, /*print0:*/Active_cfinz_long, /*r:*/Active_cfinr, /*regex:*/Active_cfinr_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cfino, /*timeOlder:*/Active_cfino_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_cfio(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cfioz, /*print0:*/Active_cfioz_long, /*r:*/Active_cfior, /*regex:*/Active_cfior_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cfino, /*timeNewer:*/Active_cfino_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_cfio_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cfioz, /*print0:*/Active_cfioz_long, /*r:*/Active_cfior, /*regex:*/Active_cfior_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cfino, /*timeNewer:*/Active_cfino_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeCreate c}, {@link #typeFile f}.
     */
    Active_cfiz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cfirz, /*regex:*/Active_cfirz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cfinz, /*timeNewer:*/Active_cfinz_long, /*o:*/Active_cfioz, /*timeOlder:*/Active_cfioz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeCreate, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeCreate c}, {@link #typeFile f}.
     */
    Active_cfiz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cfirz, /*regex:*/Active_cfirz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cfinz, /*timeNewer:*/Active_cfinz_long, /*o:*/Active_cfioz, /*timeOlder:*/Active_cfioz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeCreate, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_cfno(
		/*i:*/Active_cfino, /*ignoreCase:*/Active_cfino_long, /*z:*/Active_cfnoz, /*print0:*/Active_cfnoz_long, /*r:*/Active_cfnor, /*regex:*/Active_cfnor_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_cfno_long(
		/*i:*/Active_cfino, /*ignoreCase:*/Active_cfino_long, /*z:*/Active_cfnoz, /*print0:*/Active_cfnoz_long, /*r:*/Active_cfnor, /*regex:*/Active_cfnor_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_cfnz(
		/*i:*/Active_cfinz, /*ignoreCase:*/Active_cfinz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cfnrz, /*regex:*/Active_cfnrz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cfnoz, /*timeOlder:*/Active_cfnoz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_cfnz_long(
		/*i:*/Active_cfinz, /*ignoreCase:*/Active_cfinz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cfnrz, /*regex:*/Active_cfnrz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cfnoz, /*timeOlder:*/Active_cfnoz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_cfoz(
		/*i:*/Active_cfioz, /*ignoreCase:*/Active_cfioz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cforz, /*regex:*/Active_cforz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cfnoz, /*timeNewer:*/Active_cfnoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_cfoz_long(
		/*i:*/Active_cfioz, /*ignoreCase:*/Active_cfioz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cforz, /*regex:*/Active_cforz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cfnoz, /*timeNewer:*/Active_cfnoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeCreate c}, {@link #typeFile f}.
     */
    Active_cfr(
		/*i:*/Active_cfir, /*ignoreCase:*/Active_cfir_long, /*z:*/Active_cfrz, /*print0:*/Active_cfrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cfnr, /*timeNewer:*/Active_cfnr_long, /*o:*/Active_cfor, /*timeOlder:*/Active_cfor_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.regex, FindOption.timeCreate, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeCreate c}, {@link #typeFile f}.
     */
    Active_cfr_long(
		/*i:*/Active_cfir, /*ignoreCase:*/Active_cfir_long, /*z:*/Active_cfrz, /*print0:*/Active_cfrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cfnr, /*timeNewer:*/Active_cfnr_long, /*o:*/Active_cfor, /*timeOlder:*/Active_cfor_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.regex, FindOption.timeCreate, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeCreate c}, {@link #typeFile f}.
     */
    Active_cfi(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cfiz, /*print0:*/Active_cfiz_long, /*r:*/Active_cfir, /*regex:*/Active_cfir_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cfin, /*timeNewer:*/Active_cfin_long, /*o:*/Active_cfio, /*timeOlder:*/Active_cfio_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeCreate, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeCreate c}, {@link #typeFile f}.
     */
    Active_cfi_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cfiz, /*print0:*/Active_cfiz_long, /*r:*/Active_cfir, /*regex:*/Active_cfir_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cfin, /*timeNewer:*/Active_cfin_long, /*o:*/Active_cfio, /*timeOlder:*/Active_cfio_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeCreate, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_cfn(
		/*i:*/Active_cfin, /*ignoreCase:*/Active_cfin_long, /*z:*/Active_cfnz, /*print0:*/Active_cfnz_long, /*r:*/Active_cfnr, /*regex:*/Active_cfnr_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cfno, /*timeOlder:*/Active_cfno_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.timeCreate, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeFile f}.
     */
    Active_cfn_long(
		/*i:*/Active_cfin, /*ignoreCase:*/Active_cfin_long, /*z:*/Active_cfnz, /*print0:*/Active_cfnz_long, /*r:*/Active_cfnr, /*regex:*/Active_cfnr_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cfno, /*timeOlder:*/Active_cfno_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.timeCreate, FindOption.timeNewer, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_cfo(
		/*i:*/Active_cfio, /*ignoreCase:*/Active_cfio_long, /*z:*/Active_cfoz, /*print0:*/Active_cfoz_long, /*r:*/Active_cfor, /*regex:*/Active_cfor_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cfno, /*timeNewer:*/Active_cfno_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.timeCreate, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeFile f}.
     */
    Active_cfo_long(
		/*i:*/Active_cfio, /*ignoreCase:*/Active_cfio_long, /*z:*/Active_cfoz, /*print0:*/Active_cfoz_long, /*r:*/Active_cfor, /*regex:*/Active_cfor_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cfno, /*timeNewer:*/Active_cfno_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.timeCreate, FindOption.timeOlder, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeCreate c}, {@link #typeFile f}.
     */
    Active_cfz(
		/*i:*/Active_cfiz, /*ignoreCase:*/Active_cfiz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cfrz, /*regex:*/Active_cfrz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cfnz, /*timeNewer:*/Active_cfnz_long, /*o:*/Active_cfoz, /*timeOlder:*/Active_cfoz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.timeCreate, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeCreate c}, {@link #typeFile f}.
     */
    Active_cfz_long(
		/*i:*/Active_cfiz, /*ignoreCase:*/Active_cfiz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cfrz, /*regex:*/Active_cfrz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cfnz, /*timeNewer:*/Active_cfnz_long, /*o:*/Active_cfoz, /*timeOlder:*/Active_cfoz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.timeCreate, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #timeCreate c}, {@link #typeFile f}.
     */
    Active_cf(
		/*i:*/Active_cfi, /*ignoreCase:*/Active_cfi_long, /*z:*/Active_cfz, /*print0:*/Active_cfz_long, /*r:*/Active_cfr, /*regex:*/Active_cfr_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cfn, /*timeNewer:*/Active_cfn_long, /*o:*/Active_cfo, /*timeOlder:*/Active_cfo_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            true,
		/*active:*/FindOption.timeCreate, FindOption.typeFile
    ),
    /**
     * Option set with the following active options: {@link #timeCreate c}, {@link #typeFile f}.
     */
    Active_cf_long(
		/*i:*/Active_cfi, /*ignoreCase:*/Active_cfi_long, /*z:*/Active_cfz, /*print0:*/Active_cfz_long, /*r:*/Active_cfr, /*regex:*/Active_cfr_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cfn, /*timeNewer:*/Active_cfn_long, /*o:*/Active_cfo, /*timeOlder:*/Active_cfo_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/,
            false,
		/*active:*/FindOption.timeCreate, FindOption.typeFile
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
    public final FindOptionSet_cfinorz i;
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
    public final FindOptionSet_cfinorz ignoreCase;
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
    public final FindOptionSet_cfinorz z;
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
    public final FindOptionSet_cfinorz print0;
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
    public final FindOptionSet_cfinorz r;
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
    public final FindOptionSet_cfinorz regex;
    /**
     * Option {@code "-c"}: The time operand refers to the creation time of the file
     * <p>
     * (This option is ignored if no time operand is specified).
     * <p>
     * The option {@code "-c"} is equivalent to the {@code "--}{@link #timeCreate timeCreate}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-c"}. If the option {@code "-c"}
     * is already set, the field {@code c} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final FindOptionSet_cfinorz c;
    /**
     * Option {@code "--timeCreate"}: The time operand refers to the creation time of the file
     * <p>
     * (This option is ignored if no time operand is specified).
     * <p>
     * The option {@code "--timeCreate"} is equivalent to the {@code "-}{@link #c c}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--timeCreate"}. If the option {@code "--timeCreate"}
     * is already set, the field {@code timeCreate} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final FindOptionSet_cfinorz timeCreate;
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
    public final FindOptionSet_cfinorz n;
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
    public final FindOptionSet_cfinorz timeNewer;
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
    public final FindOptionSet_cfinorz o;
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
    public final FindOptionSet_cfinorz timeOlder;
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
    public final FindOptionSet_cfinorz f;
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
    public final FindOptionSet_cfinorz typeFile;
    private final boolean useAcronym;
    private final EnumSet<FindOption> options;
    private FindOptionSet_cfinorz(
            FindOptionSet_cfinorz i, FindOptionSet_cfinorz ignoreCase, FindOptionSet_cfinorz z, FindOptionSet_cfinorz print0, FindOptionSet_cfinorz r, FindOptionSet_cfinorz regex, FindOptionSet_cfinorz c, FindOptionSet_cfinorz timeCreate, FindOptionSet_cfinorz n, FindOptionSet_cfinorz timeNewer, FindOptionSet_cfinorz o, FindOptionSet_cfinorz timeOlder, FindOptionSet_cfinorz f, FindOptionSet_cfinorz typeFile,
            boolean useAcronym,
            FindOption... activeOptions
    ) {
        this.i = i == null ? this : i;
        this.ignoreCase = ignoreCase == null ? this : ignoreCase;
        this.z = z == null ? this : z;
        this.print0 = print0 == null ? this : print0;
        this.r = r == null ? this : r;
        this.regex = regex == null ? this : regex;
        this.c = c == null ? this : c;
        this.timeCreate = timeCreate == null ? this : timeCreate;
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
     *    FindOptionSet_cfinorz.ignoreCase.z;
     * </pre>
     * uses acronyms, that is, this method always returns true for the above
     * set.
     * <p>
     * On the other hand, long option names are used and this method always
     * returns false for the set
     * <pre>
     *    FindOptionSet_cfinorz.i.print0;
     * </pre>
     * <p>
     * Note that a repeated option is <i>not</i> treated as the last set option.
     * For instance, the first and last option of the following set are
     * equivalent and acronyms are used:
     * <pre>
     *    FindOptionSet_cfinorz.i.z.ignoreCase;
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
