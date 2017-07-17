package org.unix4j.unix.find;

import org.unix4j.option.Option;
import org.unix4j.unix.Find;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Option sets for the {@link Find find} command with
 * the following options: {@link #i i}, {@link #z z}, {@link #r r}, {@link #a a}, {@link #n n}, {@link #o o}, {@link #d d}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Find#Options} should be used instead to specify command
 * options. See also {@link org.unix4j.unix.find.FindOptions} for more information.
 */
public enum FindOptionSet_adinorz implements FindOptions {
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_adinorz(
        /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_adinorz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_adinor(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_adinorz, /*print0:*/Active_adinorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_adinor_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_adinorz, /*print0:*/Active_adinorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_adinrz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_adinorz, /*timeOlder:*/Active_adinorz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_adinrz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_adinorz, /*timeOlder:*/Active_adinorz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_adiorz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_adinorz, /*timeNewer:*/Active_adinorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_adiorz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_adinorz, /*timeNewer:*/Active_adinorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_adnorz(
		/*i:*/Active_adinorz, /*ignoreCase:*/Active_adinorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_adnorz_long(
		/*i:*/Active_adinorz, /*ignoreCase:*/Active_adinorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_adinoz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_adinorz, /*regex:*/Active_adinorz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_adinoz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_adinorz, /*regex:*/Active_adinorz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_adinr(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_adinrz, /*print0:*/Active_adinrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_adinor, /*timeOlder:*/Active_adinor_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_adinr_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_adinrz, /*print0:*/Active_adinrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_adinor, /*timeOlder:*/Active_adinor_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_adior(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_adiorz, /*print0:*/Active_adiorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_adinor, /*timeNewer:*/Active_adinor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_adior_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_adiorz, /*print0:*/Active_adiorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_adinor, /*timeNewer:*/Active_adinor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #typeDirectory d}.
     */
    Active_adirz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_adinrz, /*timeNewer:*/Active_adinrz_long, /*o:*/Active_adiorz, /*timeOlder:*/Active_adiorz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #typeDirectory d}.
     */
    Active_adirz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_adinrz, /*timeNewer:*/Active_adinrz_long, /*o:*/Active_adiorz, /*timeOlder:*/Active_adiorz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_adnor(
		/*i:*/Active_adinor, /*ignoreCase:*/Active_adinor_long, /*z:*/Active_adnorz, /*print0:*/Active_adnorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_adnor_long(
		/*i:*/Active_adinor, /*ignoreCase:*/Active_adinor_long, /*z:*/Active_adnorz, /*print0:*/Active_adnorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_adnrz(
		/*i:*/Active_adinrz, /*ignoreCase:*/Active_adinrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_adnorz, /*timeOlder:*/Active_adnorz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_adnrz_long(
		/*i:*/Active_adinrz, /*ignoreCase:*/Active_adinrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_adnorz, /*timeOlder:*/Active_adnorz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_adorz(
		/*i:*/Active_adiorz, /*ignoreCase:*/Active_adiorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_adnorz, /*timeNewer:*/Active_adnorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_adorz_long(
		/*i:*/Active_adiorz, /*ignoreCase:*/Active_adiorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_adnorz, /*timeNewer:*/Active_adnorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_adino(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_adinoz, /*print0:*/Active_adinoz_long, /*r:*/Active_adinor, /*regex:*/Active_adinor_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_adino_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_adinoz, /*print0:*/Active_adinoz_long, /*r:*/Active_adinor, /*regex:*/Active_adinor_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_adinz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_adinrz, /*regex:*/Active_adinrz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_adinoz, /*timeOlder:*/Active_adinoz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_adinz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_adinrz, /*regex:*/Active_adinrz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_adinoz, /*timeOlder:*/Active_adinoz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_adioz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_adiorz, /*regex:*/Active_adiorz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_adinoz, /*timeNewer:*/Active_adinoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_adioz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_adiorz, /*regex:*/Active_adiorz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_adinoz, /*timeNewer:*/Active_adinoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_adnoz(
		/*i:*/Active_adinoz, /*ignoreCase:*/Active_adinoz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_adnorz, /*regex:*/Active_adnorz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_adnoz_long(
		/*i:*/Active_adinoz, /*ignoreCase:*/Active_adinoz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_adnorz, /*regex:*/Active_adnorz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeAccess a}, {@link #typeDirectory d}.
     */
    Active_adir(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_adirz, /*print0:*/Active_adirz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_adinr, /*timeNewer:*/Active_adinr_long, /*o:*/Active_adior, /*timeOlder:*/Active_adior_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeAccess, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeAccess a}, {@link #typeDirectory d}.
     */
    Active_adir_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_adirz, /*print0:*/Active_adirz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_adinr, /*timeNewer:*/Active_adinr_long, /*o:*/Active_adior, /*timeOlder:*/Active_adior_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeAccess, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_adnr(
		/*i:*/Active_adinr, /*ignoreCase:*/Active_adinr_long, /*z:*/Active_adnrz, /*print0:*/Active_adnrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_adnor, /*timeOlder:*/Active_adnor_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_adnr_long(
		/*i:*/Active_adinr, /*ignoreCase:*/Active_adinr_long, /*z:*/Active_adnrz, /*print0:*/Active_adnrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_adnor, /*timeOlder:*/Active_adnor_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_ador(
		/*i:*/Active_adior, /*ignoreCase:*/Active_adior_long, /*z:*/Active_adorz, /*print0:*/Active_adorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_adnor, /*timeNewer:*/Active_adnor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.regex, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_ador_long(
		/*i:*/Active_adior, /*ignoreCase:*/Active_adior_long, /*z:*/Active_adorz, /*print0:*/Active_adorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_adnor, /*timeNewer:*/Active_adnor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.regex, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #typeDirectory d}.
     */
    Active_adrz(
		/*i:*/Active_adirz, /*ignoreCase:*/Active_adirz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_adnrz, /*timeNewer:*/Active_adnrz_long, /*o:*/Active_adorz, /*timeOlder:*/Active_adorz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #typeDirectory d}.
     */
    Active_adrz_long(
		/*i:*/Active_adirz, /*ignoreCase:*/Active_adirz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_adnrz, /*timeNewer:*/Active_adnrz_long, /*o:*/Active_adorz, /*timeOlder:*/Active_adorz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_adin(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_adinz, /*print0:*/Active_adinz_long, /*r:*/Active_adinr, /*regex:*/Active_adinr_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_adino, /*timeOlder:*/Active_adino_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_adin_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_adinz, /*print0:*/Active_adinz_long, /*r:*/Active_adinr, /*regex:*/Active_adinr_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_adino, /*timeOlder:*/Active_adino_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_adio(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_adioz, /*print0:*/Active_adioz_long, /*r:*/Active_adior, /*regex:*/Active_adior_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_adino, /*timeNewer:*/Active_adino_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_adio_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_adioz, /*print0:*/Active_adioz_long, /*r:*/Active_adior, /*regex:*/Active_adior_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_adino, /*timeNewer:*/Active_adino_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeAccess a}, {@link #typeDirectory d}.
     */
    Active_adiz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_adirz, /*regex:*/Active_adirz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_adinz, /*timeNewer:*/Active_adinz_long, /*o:*/Active_adioz, /*timeOlder:*/Active_adioz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeAccess, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeAccess a}, {@link #typeDirectory d}.
     */
    Active_adiz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_adirz, /*regex:*/Active_adirz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_adinz, /*timeNewer:*/Active_adinz_long, /*o:*/Active_adioz, /*timeOlder:*/Active_adioz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeAccess, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_adno(
		/*i:*/Active_adino, /*ignoreCase:*/Active_adino_long, /*z:*/Active_adnoz, /*print0:*/Active_adnoz_long, /*r:*/Active_adnor, /*regex:*/Active_adnor_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_adno_long(
		/*i:*/Active_adino, /*ignoreCase:*/Active_adino_long, /*z:*/Active_adnoz, /*print0:*/Active_adnoz_long, /*r:*/Active_adnor, /*regex:*/Active_adnor_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_adnz(
		/*i:*/Active_adinz, /*ignoreCase:*/Active_adinz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_adnrz, /*regex:*/Active_adnrz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_adnoz, /*timeOlder:*/Active_adnoz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_adnz_long(
		/*i:*/Active_adinz, /*ignoreCase:*/Active_adinz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_adnrz, /*regex:*/Active_adnrz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_adnoz, /*timeOlder:*/Active_adnoz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_adoz(
		/*i:*/Active_adioz, /*ignoreCase:*/Active_adioz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_adorz, /*regex:*/Active_adorz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_adnoz, /*timeNewer:*/Active_adnoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_adoz_long(
		/*i:*/Active_adioz, /*ignoreCase:*/Active_adioz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_adorz, /*regex:*/Active_adorz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_adnoz, /*timeNewer:*/Active_adnoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeAccess a}, {@link #typeDirectory d}.
     */
    Active_adr(
		/*i:*/Active_adir, /*ignoreCase:*/Active_adir_long, /*z:*/Active_adrz, /*print0:*/Active_adrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_adnr, /*timeNewer:*/Active_adnr_long, /*o:*/Active_ador, /*timeOlder:*/Active_ador_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.regex, FindOption.timeAccess, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeAccess a}, {@link #typeDirectory d}.
     */
    Active_adr_long(
		/*i:*/Active_adir, /*ignoreCase:*/Active_adir_long, /*z:*/Active_adrz, /*print0:*/Active_adrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_adnr, /*timeNewer:*/Active_adnr_long, /*o:*/Active_ador, /*timeOlder:*/Active_ador_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.regex, FindOption.timeAccess, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeAccess a}, {@link #typeDirectory d}.
     */
    Active_adi(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_adiz, /*print0:*/Active_adiz_long, /*r:*/Active_adir, /*regex:*/Active_adir_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_adin, /*timeNewer:*/Active_adin_long, /*o:*/Active_adio, /*timeOlder:*/Active_adio_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeAccess, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeAccess a}, {@link #typeDirectory d}.
     */
    Active_adi_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_adiz, /*print0:*/Active_adiz_long, /*r:*/Active_adir, /*regex:*/Active_adir_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_adin, /*timeNewer:*/Active_adin_long, /*o:*/Active_adio, /*timeOlder:*/Active_adio_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeAccess, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_adn(
		/*i:*/Active_adin, /*ignoreCase:*/Active_adin_long, /*z:*/Active_adnz, /*print0:*/Active_adnz_long, /*r:*/Active_adnr, /*regex:*/Active_adnr_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_adno, /*timeOlder:*/Active_adno_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.timeAccess, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_adn_long(
		/*i:*/Active_adin, /*ignoreCase:*/Active_adin_long, /*z:*/Active_adnz, /*print0:*/Active_adnz_long, /*r:*/Active_adnr, /*regex:*/Active_adnr_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_adno, /*timeOlder:*/Active_adno_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.timeAccess, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_ado(
		/*i:*/Active_adio, /*ignoreCase:*/Active_adio_long, /*z:*/Active_adoz, /*print0:*/Active_adoz_long, /*r:*/Active_ador, /*regex:*/Active_ador_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_adno, /*timeNewer:*/Active_adno_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.timeAccess, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_ado_long(
		/*i:*/Active_adio, /*ignoreCase:*/Active_adio_long, /*z:*/Active_adoz, /*print0:*/Active_adoz_long, /*r:*/Active_ador, /*regex:*/Active_ador_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_adno, /*timeNewer:*/Active_adno_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.timeAccess, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeAccess a}, {@link #typeDirectory d}.
     */
    Active_adz(
		/*i:*/Active_adiz, /*ignoreCase:*/Active_adiz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_adrz, /*regex:*/Active_adrz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_adnz, /*timeNewer:*/Active_adnz_long, /*o:*/Active_adoz, /*timeOlder:*/Active_adoz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.timeAccess, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeAccess a}, {@link #typeDirectory d}.
     */
    Active_adz_long(
		/*i:*/Active_adiz, /*ignoreCase:*/Active_adiz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_adrz, /*regex:*/Active_adrz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_adnz, /*timeNewer:*/Active_adnz_long, /*o:*/Active_adoz, /*timeOlder:*/Active_adoz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.timeAccess, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #timeAccess a}, {@link #typeDirectory d}.
     */
    Active_ad(
		/*i:*/Active_adi, /*ignoreCase:*/Active_adi_long, /*z:*/Active_adz, /*print0:*/Active_adz_long, /*r:*/Active_adr, /*regex:*/Active_adr_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_adn, /*timeNewer:*/Active_adn_long, /*o:*/Active_ado, /*timeOlder:*/Active_ado_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.timeAccess, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #timeAccess a}, {@link #typeDirectory d}.
     */
    Active_ad_long(
		/*i:*/Active_adi, /*ignoreCase:*/Active_adi_long, /*z:*/Active_adz, /*print0:*/Active_adz_long, /*r:*/Active_adr, /*regex:*/Active_adr_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_adn, /*timeNewer:*/Active_adn_long, /*o:*/Active_ado, /*timeOlder:*/Active_ado_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.timeAccess, FindOption.typeDirectory
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
    public final FindOptionSet_adinorz i;
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
    public final FindOptionSet_adinorz ignoreCase;
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
    public final FindOptionSet_adinorz z;
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
    public final FindOptionSet_adinorz print0;
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
    public final FindOptionSet_adinorz r;
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
    public final FindOptionSet_adinorz regex;
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
    public final FindOptionSet_adinorz a;
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
    public final FindOptionSet_adinorz timeAccess;
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
    public final FindOptionSet_adinorz n;
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
    public final FindOptionSet_adinorz timeNewer;
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
    public final FindOptionSet_adinorz o;
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
    public final FindOptionSet_adinorz timeOlder;
    /**
     * Option {@code "-d"}: Consider only directories
     * <p>
     * The option {@code "-d"} is equivalent to the {@code "--}{@link #typeDirectory typeDirectory}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-d"}. If the option {@code "-d"}
     * is already set, the field {@code d} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final FindOptionSet_adinorz d;
    /**
     * Option {@code "--typeDirectory"}: Consider only directories
     * <p>
     * The option {@code "--typeDirectory"} is equivalent to the {@code "-}{@link #d d}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--typeDirectory"}. If the option {@code "--typeDirectory"}
     * is already set, the field {@code typeDirectory} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final FindOptionSet_adinorz typeDirectory;
    private final boolean useAcronym;
    private final EnumSet<FindOption> options;
    private FindOptionSet_adinorz(
            FindOptionSet_adinorz i, FindOptionSet_adinorz ignoreCase, FindOptionSet_adinorz z, FindOptionSet_adinorz print0, FindOptionSet_adinorz r, FindOptionSet_adinorz regex, FindOptionSet_adinorz a, FindOptionSet_adinorz timeAccess, FindOptionSet_adinorz n, FindOptionSet_adinorz timeNewer, FindOptionSet_adinorz o, FindOptionSet_adinorz timeOlder, FindOptionSet_adinorz d, FindOptionSet_adinorz typeDirectory,
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
        this.d = d == null ? this : d;
        this.typeDirectory = typeDirectory == null ? this : typeDirectory;
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
     *    FindOptionSet_adinorz.ignoreCase.z;
     * </pre>
     * uses acronyms, that is, this method always returns true for the above
     * set.
     * <p>
     * On the other hand, long option names are used and this method always
     * returns false for the set
     * <pre>
     *    FindOptionSet_adinorz.i.print0;
     * </pre>
     * <p>
     * Note that a repeated option is <i>not</i> treated as the last set option.
     * For instance, the first and last option of the following set are
     * equivalent and acronyms are used:
     * <pre>
     *    FindOptionSet_adinorz.i.z.ignoreCase;
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
