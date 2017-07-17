package org.unix4j.unix.find;

import org.unix4j.option.Option;
import org.unix4j.unix.Find;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Option sets for the {@link Find find} command with
 * the following options: {@link #i i}, {@link #z z}, {@link #r r}, {@link #a a}, {@link #n n}, {@link #o o}, {@link #l l}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Find#Options} should be used instead to specify command
 * options. See also {@link org.unix4j.unix.find.FindOptions} for more information.
 */
public enum FindOptionSet_ailnorz implements FindOptions {
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_ailnorz(
        /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_ailnorz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_ailnor(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ailnorz, /*print0:*/Active_ailnorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_ailnor_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ailnorz, /*print0:*/Active_ailnorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeSymlink l}.
     */
    Active_ailnrz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_ailnorz, /*timeOlder:*/Active_ailnorz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeSymlink l}.
     */
    Active_ailnrz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_ailnorz, /*timeOlder:*/Active_ailnorz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_ailorz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ailnorz, /*timeNewer:*/Active_ailnorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_ailorz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ailnorz, /*timeNewer:*/Active_ailnorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_alnorz(
		/*i:*/Active_ailnorz, /*ignoreCase:*/Active_ailnorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_alnorz_long(
		/*i:*/Active_ailnorz, /*ignoreCase:*/Active_ailnorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_ailnoz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_ailnorz, /*regex:*/Active_ailnorz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_ailnoz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_ailnorz, /*regex:*/Active_ailnorz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeSymlink l}.
     */
    Active_ailnr(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ailnrz, /*print0:*/Active_ailnrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_ailnor, /*timeOlder:*/Active_ailnor_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeSymlink l}.
     */
    Active_ailnr_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ailnrz, /*print0:*/Active_ailnrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_ailnor, /*timeOlder:*/Active_ailnor_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_ailor(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ailorz, /*print0:*/Active_ailorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ailnor, /*timeNewer:*/Active_ailnor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_ailor_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ailorz, /*print0:*/Active_ailorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ailnor, /*timeNewer:*/Active_ailnor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #typeSymlink l}.
     */
    Active_ailrz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ailnrz, /*timeNewer:*/Active_ailnrz_long, /*o:*/Active_ailorz, /*timeOlder:*/Active_ailorz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #typeSymlink l}.
     */
    Active_ailrz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ailnrz, /*timeNewer:*/Active_ailnrz_long, /*o:*/Active_ailorz, /*timeOlder:*/Active_ailorz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_alnor(
		/*i:*/Active_ailnor, /*ignoreCase:*/Active_ailnor_long, /*z:*/Active_alnorz, /*print0:*/Active_alnorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_alnor_long(
		/*i:*/Active_ailnor, /*ignoreCase:*/Active_ailnor_long, /*z:*/Active_alnorz, /*print0:*/Active_alnorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeSymlink l}.
     */
    Active_alnrz(
		/*i:*/Active_ailnrz, /*ignoreCase:*/Active_ailnrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_alnorz, /*timeOlder:*/Active_alnorz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeSymlink l}.
     */
    Active_alnrz_long(
		/*i:*/Active_ailnrz, /*ignoreCase:*/Active_ailnrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_alnorz, /*timeOlder:*/Active_alnorz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_alorz(
		/*i:*/Active_ailorz, /*ignoreCase:*/Active_ailorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_alnorz, /*timeNewer:*/Active_alnorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_alorz_long(
		/*i:*/Active_ailorz, /*ignoreCase:*/Active_ailorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_alnorz, /*timeNewer:*/Active_alnorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_ailno(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ailnoz, /*print0:*/Active_ailnoz_long, /*r:*/Active_ailnor, /*regex:*/Active_ailnor_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_ailno_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ailnoz, /*print0:*/Active_ailnoz_long, /*r:*/Active_ailnor, /*regex:*/Active_ailnor_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeSymlink l}.
     */
    Active_ailnz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_ailnrz, /*regex:*/Active_ailnrz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_ailnoz, /*timeOlder:*/Active_ailnoz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeSymlink l}.
     */
    Active_ailnz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_ailnrz, /*regex:*/Active_ailnrz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_ailnoz, /*timeOlder:*/Active_ailnoz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_ailoz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_ailorz, /*regex:*/Active_ailorz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ailnoz, /*timeNewer:*/Active_ailnoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_ailoz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_ailorz, /*regex:*/Active_ailorz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ailnoz, /*timeNewer:*/Active_ailnoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_alnoz(
		/*i:*/Active_ailnoz, /*ignoreCase:*/Active_ailnoz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_alnorz, /*regex:*/Active_alnorz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_alnoz_long(
		/*i:*/Active_ailnoz, /*ignoreCase:*/Active_ailnoz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_alnorz, /*regex:*/Active_alnorz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeAccess a}, {@link #typeSymlink l}.
     */
    Active_ailr(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ailrz, /*print0:*/Active_ailrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ailnr, /*timeNewer:*/Active_ailnr_long, /*o:*/Active_ailor, /*timeOlder:*/Active_ailor_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeAccess, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeAccess a}, {@link #typeSymlink l}.
     */
    Active_ailr_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ailrz, /*print0:*/Active_ailrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ailnr, /*timeNewer:*/Active_ailnr_long, /*o:*/Active_ailor, /*timeOlder:*/Active_ailor_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeAccess, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeSymlink l}.
     */
    Active_alnr(
		/*i:*/Active_ailnr, /*ignoreCase:*/Active_ailnr_long, /*z:*/Active_alnrz, /*print0:*/Active_alnrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_alnor, /*timeOlder:*/Active_alnor_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeSymlink l}.
     */
    Active_alnr_long(
		/*i:*/Active_ailnr, /*ignoreCase:*/Active_ailnr_long, /*z:*/Active_alnrz, /*print0:*/Active_alnrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_alnor, /*timeOlder:*/Active_alnor_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_alor(
		/*i:*/Active_ailor, /*ignoreCase:*/Active_ailor_long, /*z:*/Active_alorz, /*print0:*/Active_alorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_alnor, /*timeNewer:*/Active_alnor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.regex, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_alor_long(
		/*i:*/Active_ailor, /*ignoreCase:*/Active_ailor_long, /*z:*/Active_alorz, /*print0:*/Active_alorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_alnor, /*timeNewer:*/Active_alnor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.regex, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #typeSymlink l}.
     */
    Active_alrz(
		/*i:*/Active_ailrz, /*ignoreCase:*/Active_ailrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_alnrz, /*timeNewer:*/Active_alnrz_long, /*o:*/Active_alorz, /*timeOlder:*/Active_alorz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #typeSymlink l}.
     */
    Active_alrz_long(
		/*i:*/Active_ailrz, /*ignoreCase:*/Active_ailrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_alnrz, /*timeNewer:*/Active_alnrz_long, /*o:*/Active_alorz, /*timeOlder:*/Active_alorz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeSymlink l}.
     */
    Active_ailn(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ailnz, /*print0:*/Active_ailnz_long, /*r:*/Active_ailnr, /*regex:*/Active_ailnr_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_ailno, /*timeOlder:*/Active_ailno_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeSymlink l}.
     */
    Active_ailn_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ailnz, /*print0:*/Active_ailnz_long, /*r:*/Active_ailnr, /*regex:*/Active_ailnr_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_ailno, /*timeOlder:*/Active_ailno_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_ailo(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ailoz, /*print0:*/Active_ailoz_long, /*r:*/Active_ailor, /*regex:*/Active_ailor_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ailno, /*timeNewer:*/Active_ailno_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_ailo_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ailoz, /*print0:*/Active_ailoz_long, /*r:*/Active_ailor, /*regex:*/Active_ailor_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ailno, /*timeNewer:*/Active_ailno_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeAccess a}, {@link #typeSymlink l}.
     */
    Active_ailz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_ailrz, /*regex:*/Active_ailrz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ailnz, /*timeNewer:*/Active_ailnz_long, /*o:*/Active_ailoz, /*timeOlder:*/Active_ailoz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeAccess, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeAccess a}, {@link #typeSymlink l}.
     */
    Active_ailz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_ailrz, /*regex:*/Active_ailrz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ailnz, /*timeNewer:*/Active_ailnz_long, /*o:*/Active_ailoz, /*timeOlder:*/Active_ailoz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeAccess, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_alno(
		/*i:*/Active_ailno, /*ignoreCase:*/Active_ailno_long, /*z:*/Active_alnoz, /*print0:*/Active_alnoz_long, /*r:*/Active_alnor, /*regex:*/Active_alnor_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_alno_long(
		/*i:*/Active_ailno, /*ignoreCase:*/Active_ailno_long, /*z:*/Active_alnoz, /*print0:*/Active_alnoz_long, /*r:*/Active_alnor, /*regex:*/Active_alnor_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeSymlink l}.
     */
    Active_alnz(
		/*i:*/Active_ailnz, /*ignoreCase:*/Active_ailnz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_alnrz, /*regex:*/Active_alnrz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_alnoz, /*timeOlder:*/Active_alnoz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeSymlink l}.
     */
    Active_alnz_long(
		/*i:*/Active_ailnz, /*ignoreCase:*/Active_ailnz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_alnrz, /*regex:*/Active_alnrz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_alnoz, /*timeOlder:*/Active_alnoz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_aloz(
		/*i:*/Active_ailoz, /*ignoreCase:*/Active_ailoz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_alorz, /*regex:*/Active_alorz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_alnoz, /*timeNewer:*/Active_alnoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_aloz_long(
		/*i:*/Active_ailoz, /*ignoreCase:*/Active_ailoz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_alorz, /*regex:*/Active_alorz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_alnoz, /*timeNewer:*/Active_alnoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeAccess a}, {@link #typeSymlink l}.
     */
    Active_alr(
		/*i:*/Active_ailr, /*ignoreCase:*/Active_ailr_long, /*z:*/Active_alrz, /*print0:*/Active_alrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_alnr, /*timeNewer:*/Active_alnr_long, /*o:*/Active_alor, /*timeOlder:*/Active_alor_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.regex, FindOption.timeAccess, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeAccess a}, {@link #typeSymlink l}.
     */
    Active_alr_long(
		/*i:*/Active_ailr, /*ignoreCase:*/Active_ailr_long, /*z:*/Active_alrz, /*print0:*/Active_alrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_alnr, /*timeNewer:*/Active_alnr_long, /*o:*/Active_alor, /*timeOlder:*/Active_alor_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.regex, FindOption.timeAccess, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeAccess a}, {@link #typeSymlink l}.
     */
    Active_ail(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ailz, /*print0:*/Active_ailz_long, /*r:*/Active_ailr, /*regex:*/Active_ailr_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ailn, /*timeNewer:*/Active_ailn_long, /*o:*/Active_ailo, /*timeOlder:*/Active_ailo_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeAccess, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeAccess a}, {@link #typeSymlink l}.
     */
    Active_ail_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ailz, /*print0:*/Active_ailz_long, /*r:*/Active_ailr, /*regex:*/Active_ailr_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ailn, /*timeNewer:*/Active_ailn_long, /*o:*/Active_ailo, /*timeOlder:*/Active_ailo_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeAccess, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeSymlink l}.
     */
    Active_aln(
		/*i:*/Active_ailn, /*ignoreCase:*/Active_ailn_long, /*z:*/Active_alnz, /*print0:*/Active_alnz_long, /*r:*/Active_alnr, /*regex:*/Active_alnr_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_alno, /*timeOlder:*/Active_alno_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.timeAccess, FindOption.timeNewer, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeSymlink l}.
     */
    Active_aln_long(
		/*i:*/Active_ailn, /*ignoreCase:*/Active_ailn_long, /*z:*/Active_alnz, /*print0:*/Active_alnz_long, /*r:*/Active_alnr, /*regex:*/Active_alnr_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_alno, /*timeOlder:*/Active_alno_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.timeAccess, FindOption.timeNewer, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_alo(
		/*i:*/Active_ailo, /*ignoreCase:*/Active_ailo_long, /*z:*/Active_aloz, /*print0:*/Active_aloz_long, /*r:*/Active_alor, /*regex:*/Active_alor_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_alno, /*timeNewer:*/Active_alno_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.timeAccess, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeSymlink l}.
     */
    Active_alo_long(
		/*i:*/Active_ailo, /*ignoreCase:*/Active_ailo_long, /*z:*/Active_aloz, /*print0:*/Active_aloz_long, /*r:*/Active_alor, /*regex:*/Active_alor_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_alno, /*timeNewer:*/Active_alno_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.timeAccess, FindOption.timeOlder, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeAccess a}, {@link #typeSymlink l}.
     */
    Active_alz(
		/*i:*/Active_ailz, /*ignoreCase:*/Active_ailz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_alrz, /*regex:*/Active_alrz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_alnz, /*timeNewer:*/Active_alnz_long, /*o:*/Active_aloz, /*timeOlder:*/Active_aloz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.timeAccess, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeAccess a}, {@link #typeSymlink l}.
     */
    Active_alz_long(
		/*i:*/Active_ailz, /*ignoreCase:*/Active_ailz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_alrz, /*regex:*/Active_alrz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_alnz, /*timeNewer:*/Active_alnz_long, /*o:*/Active_aloz, /*timeOlder:*/Active_aloz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.timeAccess, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #timeAccess a}, {@link #typeSymlink l}.
     */
    Active_al(
		/*i:*/Active_ail, /*ignoreCase:*/Active_ail_long, /*z:*/Active_alz, /*print0:*/Active_alz_long, /*r:*/Active_alr, /*regex:*/Active_alr_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_aln, /*timeNewer:*/Active_aln_long, /*o:*/Active_alo, /*timeOlder:*/Active_alo_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            true,
		/*active:*/FindOption.timeAccess, FindOption.typeSymlink
    ),
    /**
     * Option set with the following active options: {@link #timeAccess a}, {@link #typeSymlink l}.
     */
    Active_al_long(
		/*i:*/Active_ail, /*ignoreCase:*/Active_ail_long, /*z:*/Active_alz, /*print0:*/Active_alz_long, /*r:*/Active_alr, /*regex:*/Active_alr_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_aln, /*timeNewer:*/Active_aln_long, /*o:*/Active_alo, /*timeOlder:*/Active_alo_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/,
            false,
		/*active:*/FindOption.timeAccess, FindOption.typeSymlink
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
    public final FindOptionSet_ailnorz i;
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
    public final FindOptionSet_ailnorz ignoreCase;
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
    public final FindOptionSet_ailnorz z;
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
    public final FindOptionSet_ailnorz print0;
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
    public final FindOptionSet_ailnorz r;
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
    public final FindOptionSet_ailnorz regex;
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
    public final FindOptionSet_ailnorz a;
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
    public final FindOptionSet_ailnorz timeAccess;
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
    public final FindOptionSet_ailnorz n;
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
    public final FindOptionSet_ailnorz timeNewer;
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
    public final FindOptionSet_ailnorz o;
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
    public final FindOptionSet_ailnorz timeOlder;
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
    public final FindOptionSet_ailnorz l;
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
    public final FindOptionSet_ailnorz typeSymlink;
    private final boolean useAcronym;
    private final EnumSet<FindOption> options;
    private FindOptionSet_ailnorz(
            FindOptionSet_ailnorz i, FindOptionSet_ailnorz ignoreCase, FindOptionSet_ailnorz z, FindOptionSet_ailnorz print0, FindOptionSet_ailnorz r, FindOptionSet_ailnorz regex, FindOptionSet_ailnorz a, FindOptionSet_ailnorz timeAccess, FindOptionSet_ailnorz n, FindOptionSet_ailnorz timeNewer, FindOptionSet_ailnorz o, FindOptionSet_ailnorz timeOlder, FindOptionSet_ailnorz l, FindOptionSet_ailnorz typeSymlink,
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
     *    FindOptionSet_ailnorz.ignoreCase.z;
     * </pre>
     * uses acronyms, that is, this method always returns true for the above
     * set.
     * <p>
     * On the other hand, long option names are used and this method always
     * returns false for the set
     * <pre>
     *    FindOptionSet_ailnorz.i.print0;
     * </pre>
     * <p>
     * Note that a repeated option is <i>not</i> treated as the last set option.
     * For instance, the first and last option of the following set are
     * equivalent and acronyms are used:
     * <pre>
     *    FindOptionSet_ailnorz.i.z.ignoreCase;
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
