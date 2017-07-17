package org.unix4j.unix.find;

import org.unix4j.option.Option;
import org.unix4j.unix.Find;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Option sets for the {@link Find find} command with
 * the following options: {@link #i i}, {@link #z z}, {@link #r r}, {@link #c c}, {@link #n n}, {@link #o o}, {@link #d d}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Find#Options} should be used instead to specify command
 * options. See also {@link org.unix4j.unix.find.FindOptions} for more information.
 */
public enum FindOptionSet_cdinorz implements FindOptions {
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_cdinorz(
        /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_cdinorz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_cdinor(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cdinorz, /*print0:*/Active_cdinorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_cdinor_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cdinorz, /*print0:*/Active_cdinorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_cdinrz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cdinorz, /*timeOlder:*/Active_cdinorz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_cdinrz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cdinorz, /*timeOlder:*/Active_cdinorz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_cdiorz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cdinorz, /*timeNewer:*/Active_cdinorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_cdiorz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cdinorz, /*timeNewer:*/Active_cdinorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_cdnorz(
		/*i:*/Active_cdinorz, /*ignoreCase:*/Active_cdinorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_cdnorz_long(
		/*i:*/Active_cdinorz, /*ignoreCase:*/Active_cdinorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_cdinoz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cdinorz, /*regex:*/Active_cdinorz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_cdinoz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cdinorz, /*regex:*/Active_cdinorz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_cdinr(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cdinrz, /*print0:*/Active_cdinrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cdinor, /*timeOlder:*/Active_cdinor_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_cdinr_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cdinrz, /*print0:*/Active_cdinrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cdinor, /*timeOlder:*/Active_cdinor_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_cdior(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cdiorz, /*print0:*/Active_cdiorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cdinor, /*timeNewer:*/Active_cdinor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_cdior_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cdiorz, /*print0:*/Active_cdiorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cdinor, /*timeNewer:*/Active_cdinor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #typeDirectory d}.
     */
    Active_cdirz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cdinrz, /*timeNewer:*/Active_cdinrz_long, /*o:*/Active_cdiorz, /*timeOlder:*/Active_cdiorz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #typeDirectory d}.
     */
    Active_cdirz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cdinrz, /*timeNewer:*/Active_cdinrz_long, /*o:*/Active_cdiorz, /*timeOlder:*/Active_cdiorz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_cdnor(
		/*i:*/Active_cdinor, /*ignoreCase:*/Active_cdinor_long, /*z:*/Active_cdnorz, /*print0:*/Active_cdnorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_cdnor_long(
		/*i:*/Active_cdinor, /*ignoreCase:*/Active_cdinor_long, /*z:*/Active_cdnorz, /*print0:*/Active_cdnorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_cdnrz(
		/*i:*/Active_cdinrz, /*ignoreCase:*/Active_cdinrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cdnorz, /*timeOlder:*/Active_cdnorz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_cdnrz_long(
		/*i:*/Active_cdinrz, /*ignoreCase:*/Active_cdinrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cdnorz, /*timeOlder:*/Active_cdnorz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_cdorz(
		/*i:*/Active_cdiorz, /*ignoreCase:*/Active_cdiorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cdnorz, /*timeNewer:*/Active_cdnorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_cdorz_long(
		/*i:*/Active_cdiorz, /*ignoreCase:*/Active_cdiorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cdnorz, /*timeNewer:*/Active_cdnorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_cdino(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cdinoz, /*print0:*/Active_cdinoz_long, /*r:*/Active_cdinor, /*regex:*/Active_cdinor_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_cdino_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cdinoz, /*print0:*/Active_cdinoz_long, /*r:*/Active_cdinor, /*regex:*/Active_cdinor_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_cdinz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cdinrz, /*regex:*/Active_cdinrz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cdinoz, /*timeOlder:*/Active_cdinoz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_cdinz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cdinrz, /*regex:*/Active_cdinrz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cdinoz, /*timeOlder:*/Active_cdinoz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_cdioz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cdiorz, /*regex:*/Active_cdiorz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cdinoz, /*timeNewer:*/Active_cdinoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_cdioz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cdiorz, /*regex:*/Active_cdiorz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cdinoz, /*timeNewer:*/Active_cdinoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_cdnoz(
		/*i:*/Active_cdinoz, /*ignoreCase:*/Active_cdinoz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cdnorz, /*regex:*/Active_cdnorz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_cdnoz_long(
		/*i:*/Active_cdinoz, /*ignoreCase:*/Active_cdinoz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cdnorz, /*regex:*/Active_cdnorz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeCreate c}, {@link #typeDirectory d}.
     */
    Active_cdir(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cdirz, /*print0:*/Active_cdirz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cdinr, /*timeNewer:*/Active_cdinr_long, /*o:*/Active_cdior, /*timeOlder:*/Active_cdior_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeCreate, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeCreate c}, {@link #typeDirectory d}.
     */
    Active_cdir_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cdirz, /*print0:*/Active_cdirz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cdinr, /*timeNewer:*/Active_cdinr_long, /*o:*/Active_cdior, /*timeOlder:*/Active_cdior_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeCreate, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_cdnr(
		/*i:*/Active_cdinr, /*ignoreCase:*/Active_cdinr_long, /*z:*/Active_cdnrz, /*print0:*/Active_cdnrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cdnor, /*timeOlder:*/Active_cdnor_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_cdnr_long(
		/*i:*/Active_cdinr, /*ignoreCase:*/Active_cdinr_long, /*z:*/Active_cdnrz, /*print0:*/Active_cdnrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cdnor, /*timeOlder:*/Active_cdnor_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_cdor(
		/*i:*/Active_cdior, /*ignoreCase:*/Active_cdior_long, /*z:*/Active_cdorz, /*print0:*/Active_cdorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cdnor, /*timeNewer:*/Active_cdnor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.regex, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_cdor_long(
		/*i:*/Active_cdior, /*ignoreCase:*/Active_cdior_long, /*z:*/Active_cdorz, /*print0:*/Active_cdorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cdnor, /*timeNewer:*/Active_cdnor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.regex, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #typeDirectory d}.
     */
    Active_cdrz(
		/*i:*/Active_cdirz, /*ignoreCase:*/Active_cdirz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cdnrz, /*timeNewer:*/Active_cdnrz_long, /*o:*/Active_cdorz, /*timeOlder:*/Active_cdorz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #typeDirectory d}.
     */
    Active_cdrz_long(
		/*i:*/Active_cdirz, /*ignoreCase:*/Active_cdirz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cdnrz, /*timeNewer:*/Active_cdnrz_long, /*o:*/Active_cdorz, /*timeOlder:*/Active_cdorz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_cdin(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cdinz, /*print0:*/Active_cdinz_long, /*r:*/Active_cdinr, /*regex:*/Active_cdinr_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cdino, /*timeOlder:*/Active_cdino_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_cdin_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cdinz, /*print0:*/Active_cdinz_long, /*r:*/Active_cdinr, /*regex:*/Active_cdinr_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cdino, /*timeOlder:*/Active_cdino_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_cdio(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cdioz, /*print0:*/Active_cdioz_long, /*r:*/Active_cdior, /*regex:*/Active_cdior_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cdino, /*timeNewer:*/Active_cdino_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_cdio_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cdioz, /*print0:*/Active_cdioz_long, /*r:*/Active_cdior, /*regex:*/Active_cdior_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cdino, /*timeNewer:*/Active_cdino_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeCreate c}, {@link #typeDirectory d}.
     */
    Active_cdiz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cdirz, /*regex:*/Active_cdirz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cdinz, /*timeNewer:*/Active_cdinz_long, /*o:*/Active_cdioz, /*timeOlder:*/Active_cdioz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeCreate, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeCreate c}, {@link #typeDirectory d}.
     */
    Active_cdiz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cdirz, /*regex:*/Active_cdirz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cdinz, /*timeNewer:*/Active_cdinz_long, /*o:*/Active_cdioz, /*timeOlder:*/Active_cdioz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeCreate, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_cdno(
		/*i:*/Active_cdino, /*ignoreCase:*/Active_cdino_long, /*z:*/Active_cdnoz, /*print0:*/Active_cdnoz_long, /*r:*/Active_cdnor, /*regex:*/Active_cdnor_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_cdno_long(
		/*i:*/Active_cdino, /*ignoreCase:*/Active_cdino_long, /*z:*/Active_cdnoz, /*print0:*/Active_cdnoz_long, /*r:*/Active_cdnor, /*regex:*/Active_cdnor_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_cdnz(
		/*i:*/Active_cdinz, /*ignoreCase:*/Active_cdinz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cdnrz, /*regex:*/Active_cdnrz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cdnoz, /*timeOlder:*/Active_cdnoz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_cdnz_long(
		/*i:*/Active_cdinz, /*ignoreCase:*/Active_cdinz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cdnrz, /*regex:*/Active_cdnrz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cdnoz, /*timeOlder:*/Active_cdnoz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_cdoz(
		/*i:*/Active_cdioz, /*ignoreCase:*/Active_cdioz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cdorz, /*regex:*/Active_cdorz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cdnoz, /*timeNewer:*/Active_cdnoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_cdoz_long(
		/*i:*/Active_cdioz, /*ignoreCase:*/Active_cdioz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cdorz, /*regex:*/Active_cdorz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cdnoz, /*timeNewer:*/Active_cdnoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeCreate c}, {@link #typeDirectory d}.
     */
    Active_cdr(
		/*i:*/Active_cdir, /*ignoreCase:*/Active_cdir_long, /*z:*/Active_cdrz, /*print0:*/Active_cdrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cdnr, /*timeNewer:*/Active_cdnr_long, /*o:*/Active_cdor, /*timeOlder:*/Active_cdor_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.regex, FindOption.timeCreate, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeCreate c}, {@link #typeDirectory d}.
     */
    Active_cdr_long(
		/*i:*/Active_cdir, /*ignoreCase:*/Active_cdir_long, /*z:*/Active_cdrz, /*print0:*/Active_cdrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cdnr, /*timeNewer:*/Active_cdnr_long, /*o:*/Active_cdor, /*timeOlder:*/Active_cdor_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.regex, FindOption.timeCreate, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeCreate c}, {@link #typeDirectory d}.
     */
    Active_cdi(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cdiz, /*print0:*/Active_cdiz_long, /*r:*/Active_cdir, /*regex:*/Active_cdir_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cdin, /*timeNewer:*/Active_cdin_long, /*o:*/Active_cdio, /*timeOlder:*/Active_cdio_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeCreate, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeCreate c}, {@link #typeDirectory d}.
     */
    Active_cdi_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cdiz, /*print0:*/Active_cdiz_long, /*r:*/Active_cdir, /*regex:*/Active_cdir_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cdin, /*timeNewer:*/Active_cdin_long, /*o:*/Active_cdio, /*timeOlder:*/Active_cdio_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeCreate, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_cdn(
		/*i:*/Active_cdin, /*ignoreCase:*/Active_cdin_long, /*z:*/Active_cdnz, /*print0:*/Active_cdnz_long, /*r:*/Active_cdnr, /*regex:*/Active_cdnr_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cdno, /*timeOlder:*/Active_cdno_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.timeCreate, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_cdn_long(
		/*i:*/Active_cdin, /*ignoreCase:*/Active_cdin_long, /*z:*/Active_cdnz, /*print0:*/Active_cdnz_long, /*r:*/Active_cdnr, /*regex:*/Active_cdnr_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cdno, /*timeOlder:*/Active_cdno_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.timeCreate, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_cdo(
		/*i:*/Active_cdio, /*ignoreCase:*/Active_cdio_long, /*z:*/Active_cdoz, /*print0:*/Active_cdoz_long, /*r:*/Active_cdor, /*regex:*/Active_cdor_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cdno, /*timeNewer:*/Active_cdno_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.timeCreate, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_cdo_long(
		/*i:*/Active_cdio, /*ignoreCase:*/Active_cdio_long, /*z:*/Active_cdoz, /*print0:*/Active_cdoz_long, /*r:*/Active_cdor, /*regex:*/Active_cdor_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cdno, /*timeNewer:*/Active_cdno_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.timeCreate, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeCreate c}, {@link #typeDirectory d}.
     */
    Active_cdz(
		/*i:*/Active_cdiz, /*ignoreCase:*/Active_cdiz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cdrz, /*regex:*/Active_cdrz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cdnz, /*timeNewer:*/Active_cdnz_long, /*o:*/Active_cdoz, /*timeOlder:*/Active_cdoz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.timeCreate, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeCreate c}, {@link #typeDirectory d}.
     */
    Active_cdz_long(
		/*i:*/Active_cdiz, /*ignoreCase:*/Active_cdiz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cdrz, /*regex:*/Active_cdrz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cdnz, /*timeNewer:*/Active_cdnz_long, /*o:*/Active_cdoz, /*timeOlder:*/Active_cdoz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.timeCreate, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #timeCreate c}, {@link #typeDirectory d}.
     */
    Active_cd(
		/*i:*/Active_cdi, /*ignoreCase:*/Active_cdi_long, /*z:*/Active_cdz, /*print0:*/Active_cdz_long, /*r:*/Active_cdr, /*regex:*/Active_cdr_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cdn, /*timeNewer:*/Active_cdn_long, /*o:*/Active_cdo, /*timeOlder:*/Active_cdo_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.timeCreate, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #timeCreate c}, {@link #typeDirectory d}.
     */
    Active_cd_long(
		/*i:*/Active_cdi, /*ignoreCase:*/Active_cdi_long, /*z:*/Active_cdz, /*print0:*/Active_cdz_long, /*r:*/Active_cdr, /*regex:*/Active_cdr_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cdn, /*timeNewer:*/Active_cdn_long, /*o:*/Active_cdo, /*timeOlder:*/Active_cdo_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.timeCreate, FindOption.typeDirectory
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
    public final FindOptionSet_cdinorz i;
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
    public final FindOptionSet_cdinorz ignoreCase;
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
    public final FindOptionSet_cdinorz z;
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
    public final FindOptionSet_cdinorz print0;
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
    public final FindOptionSet_cdinorz r;
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
    public final FindOptionSet_cdinorz regex;
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
    public final FindOptionSet_cdinorz c;
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
    public final FindOptionSet_cdinorz timeCreate;
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
    public final FindOptionSet_cdinorz n;
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
    public final FindOptionSet_cdinorz timeNewer;
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
    public final FindOptionSet_cdinorz o;
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
    public final FindOptionSet_cdinorz timeOlder;
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
    public final FindOptionSet_cdinorz d;
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
    public final FindOptionSet_cdinorz typeDirectory;
    private final boolean useAcronym;
    private final EnumSet<FindOption> options;
    private FindOptionSet_cdinorz(
            FindOptionSet_cdinorz i, FindOptionSet_cdinorz ignoreCase, FindOptionSet_cdinorz z, FindOptionSet_cdinorz print0, FindOptionSet_cdinorz r, FindOptionSet_cdinorz regex, FindOptionSet_cdinorz c, FindOptionSet_cdinorz timeCreate, FindOptionSet_cdinorz n, FindOptionSet_cdinorz timeNewer, FindOptionSet_cdinorz o, FindOptionSet_cdinorz timeOlder, FindOptionSet_cdinorz d, FindOptionSet_cdinorz typeDirectory,
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
     *    FindOptionSet_cdinorz.ignoreCase.z;
     * </pre>
     * uses acronyms, that is, this method always returns true for the above
     * set.
     * <p>
     * On the other hand, long option names are used and this method always
     * returns false for the set
     * <pre>
     *    FindOptionSet_cdinorz.i.print0;
     * </pre>
     * <p>
     * Note that a repeated option is <i>not</i> treated as the last set option.
     * For instance, the first and last option of the following set are
     * equivalent and acronyms are used:
     * <pre>
     *    FindOptionSet_cdinorz.i.z.ignoreCase;
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
