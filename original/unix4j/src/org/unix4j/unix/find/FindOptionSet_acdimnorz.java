package org.unix4j.unix.find;

import org.unix4j.option.Option;
import org.unix4j.unix.Find;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Option sets for the {@link Find find} command with
 * the following options: {@link #i i}, {@link #z z}, {@link #r r}, {@link #a a}, {@link #c c}, {@link #m m}, {@link #n n}, {@link #o o}, {@link #d d}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Find#Options} should be used instead to specify command
 * options. See also {@link org.unix4j.unix.find.FindOptions} for more information.
 */
public enum FindOptionSet_acdimnorz implements FindOptions {
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_dinorz(
        /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adinorz.Active_adinorz, /*timeAccess:*/FindOptionSet_adinorz.Active_adinorz_long, /*c:*/FindOptionSet_cdinorz.Active_cdinorz, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdinorz_long, /*m:*/FindOptionSet_dimnorz.Active_dimnorz, /*timeModified:*/FindOptionSet_dimnorz.Active_dimnorz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
        /*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_dinorz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adinorz.Active_adinorz, /*timeAccess:*/FindOptionSet_adinorz.Active_adinorz_long, /*c:*/FindOptionSet_cdinorz.Active_cdinorz, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdinorz_long, /*m:*/FindOptionSet_dimnorz.Active_dimnorz, /*timeModified:*/FindOptionSet_dimnorz.Active_dimnorz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_dinor(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_dinorz, /*print0:*/Active_dinorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adinorz.Active_adinor, /*timeAccess:*/FindOptionSet_adinorz.Active_adinor_long, /*c:*/FindOptionSet_cdinorz.Active_cdinor, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdinor_long, /*m:*/FindOptionSet_dimnorz.Active_dimnor, /*timeModified:*/FindOptionSet_dimnorz.Active_dimnor_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_dinor_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_dinorz, /*print0:*/Active_dinorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adinorz.Active_adinor, /*timeAccess:*/FindOptionSet_adinorz.Active_adinor_long, /*c:*/FindOptionSet_cdinorz.Active_cdinor, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdinor_long, /*m:*/FindOptionSet_dimnorz.Active_dimnor, /*timeModified:*/FindOptionSet_dimnorz.Active_dimnor_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_dinrz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adinorz.Active_adinrz, /*timeAccess:*/FindOptionSet_adinorz.Active_adinrz_long, /*c:*/FindOptionSet_cdinorz.Active_cdinrz, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdinrz_long, /*m:*/FindOptionSet_dimnorz.Active_dimnrz, /*timeModified:*/FindOptionSet_dimnorz.Active_dimnrz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_dinorz, /*timeOlder:*/Active_dinorz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_dinrz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adinorz.Active_adinrz, /*timeAccess:*/FindOptionSet_adinorz.Active_adinrz_long, /*c:*/FindOptionSet_cdinorz.Active_cdinrz, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdinrz_long, /*m:*/FindOptionSet_dimnorz.Active_dimnrz, /*timeModified:*/FindOptionSet_dimnorz.Active_dimnrz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_dinorz, /*timeOlder:*/Active_dinorz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_diorz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adinorz.Active_adiorz, /*timeAccess:*/FindOptionSet_adinorz.Active_adiorz_long, /*c:*/FindOptionSet_cdinorz.Active_cdiorz, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdiorz_long, /*m:*/FindOptionSet_dimnorz.Active_dimorz, /*timeModified:*/FindOptionSet_dimnorz.Active_dimorz_long, /*n:*/Active_dinorz, /*timeNewer:*/Active_dinorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_diorz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adinorz.Active_adiorz, /*timeAccess:*/FindOptionSet_adinorz.Active_adiorz_long, /*c:*/FindOptionSet_cdinorz.Active_cdiorz, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdiorz_long, /*m:*/FindOptionSet_dimnorz.Active_dimorz, /*timeModified:*/FindOptionSet_dimnorz.Active_dimorz_long, /*n:*/Active_dinorz, /*timeNewer:*/Active_dinorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_dnorz(
		/*i:*/Active_dinorz, /*ignoreCase:*/Active_dinorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adinorz.Active_adnorz, /*timeAccess:*/FindOptionSet_adinorz.Active_adnorz_long, /*c:*/FindOptionSet_cdinorz.Active_cdnorz, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdnorz_long, /*m:*/FindOptionSet_dimnorz.Active_dmnorz, /*timeModified:*/FindOptionSet_dimnorz.Active_dmnorz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_dnorz_long(
		/*i:*/Active_dinorz, /*ignoreCase:*/Active_dinorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adinorz.Active_adnorz, /*timeAccess:*/FindOptionSet_adinorz.Active_adnorz_long, /*c:*/FindOptionSet_cdinorz.Active_cdnorz, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdnorz_long, /*m:*/FindOptionSet_dimnorz.Active_dmnorz, /*timeModified:*/FindOptionSet_dimnorz.Active_dmnorz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_dinoz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_dinorz, /*regex:*/Active_dinorz_long, /*a:*/FindOptionSet_adinorz.Active_adinoz, /*timeAccess:*/FindOptionSet_adinorz.Active_adinoz_long, /*c:*/FindOptionSet_cdinorz.Active_cdinoz, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdinoz_long, /*m:*/FindOptionSet_dimnorz.Active_dimnoz, /*timeModified:*/FindOptionSet_dimnorz.Active_dimnoz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_dinoz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_dinorz, /*regex:*/Active_dinorz_long, /*a:*/FindOptionSet_adinorz.Active_adinoz, /*timeAccess:*/FindOptionSet_adinorz.Active_adinoz_long, /*c:*/FindOptionSet_cdinorz.Active_cdinoz, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdinoz_long, /*m:*/FindOptionSet_dimnorz.Active_dimnoz, /*timeModified:*/FindOptionSet_dimnorz.Active_dimnoz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_dinr(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_dinrz, /*print0:*/Active_dinrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adinorz.Active_adinr, /*timeAccess:*/FindOptionSet_adinorz.Active_adinr_long, /*c:*/FindOptionSet_cdinorz.Active_cdinr, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdinr_long, /*m:*/FindOptionSet_dimnorz.Active_dimnr, /*timeModified:*/FindOptionSet_dimnorz.Active_dimnr_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_dinor, /*timeOlder:*/Active_dinor_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_dinr_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_dinrz, /*print0:*/Active_dinrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adinorz.Active_adinr, /*timeAccess:*/FindOptionSet_adinorz.Active_adinr_long, /*c:*/FindOptionSet_cdinorz.Active_cdinr, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdinr_long, /*m:*/FindOptionSet_dimnorz.Active_dimnr, /*timeModified:*/FindOptionSet_dimnorz.Active_dimnr_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_dinor, /*timeOlder:*/Active_dinor_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_dior(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_diorz, /*print0:*/Active_diorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adinorz.Active_adior, /*timeAccess:*/FindOptionSet_adinorz.Active_adior_long, /*c:*/FindOptionSet_cdinorz.Active_cdior, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdior_long, /*m:*/FindOptionSet_dimnorz.Active_dimor, /*timeModified:*/FindOptionSet_dimnorz.Active_dimor_long, /*n:*/Active_dinor, /*timeNewer:*/Active_dinor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_dior_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_diorz, /*print0:*/Active_diorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adinorz.Active_adior, /*timeAccess:*/FindOptionSet_adinorz.Active_adior_long, /*c:*/FindOptionSet_cdinorz.Active_cdior, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdior_long, /*m:*/FindOptionSet_dimnorz.Active_dimor, /*timeModified:*/FindOptionSet_dimnorz.Active_dimor_long, /*n:*/Active_dinor, /*timeNewer:*/Active_dinor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #typeDirectory d}.
     */
    Active_dirz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adinorz.Active_adirz, /*timeAccess:*/FindOptionSet_adinorz.Active_adirz_long, /*c:*/FindOptionSet_cdinorz.Active_cdirz, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdirz_long, /*m:*/FindOptionSet_dimnorz.Active_dimrz, /*timeModified:*/FindOptionSet_dimnorz.Active_dimrz_long, /*n:*/Active_dinrz, /*timeNewer:*/Active_dinrz_long, /*o:*/Active_diorz, /*timeOlder:*/Active_diorz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #typeDirectory d}.
     */
    Active_dirz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adinorz.Active_adirz, /*timeAccess:*/FindOptionSet_adinorz.Active_adirz_long, /*c:*/FindOptionSet_cdinorz.Active_cdirz, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdirz_long, /*m:*/FindOptionSet_dimnorz.Active_dimrz, /*timeModified:*/FindOptionSet_dimnorz.Active_dimrz_long, /*n:*/Active_dinrz, /*timeNewer:*/Active_dinrz_long, /*o:*/Active_diorz, /*timeOlder:*/Active_diorz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_dnor(
		/*i:*/Active_dinor, /*ignoreCase:*/Active_dinor_long, /*z:*/Active_dnorz, /*print0:*/Active_dnorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adinorz.Active_adnor, /*timeAccess:*/FindOptionSet_adinorz.Active_adnor_long, /*c:*/FindOptionSet_cdinorz.Active_cdnor, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdnor_long, /*m:*/FindOptionSet_dimnorz.Active_dmnor, /*timeModified:*/FindOptionSet_dimnorz.Active_dmnor_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.regex, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_dnor_long(
		/*i:*/Active_dinor, /*ignoreCase:*/Active_dinor_long, /*z:*/Active_dnorz, /*print0:*/Active_dnorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adinorz.Active_adnor, /*timeAccess:*/FindOptionSet_adinorz.Active_adnor_long, /*c:*/FindOptionSet_cdinorz.Active_cdnor, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdnor_long, /*m:*/FindOptionSet_dimnorz.Active_dmnor, /*timeModified:*/FindOptionSet_dimnorz.Active_dmnor_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.regex, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_dnrz(
		/*i:*/Active_dinrz, /*ignoreCase:*/Active_dinrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adinorz.Active_adnrz, /*timeAccess:*/FindOptionSet_adinorz.Active_adnrz_long, /*c:*/FindOptionSet_cdinorz.Active_cdnrz, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdnrz_long, /*m:*/FindOptionSet_dimnorz.Active_dmnrz, /*timeModified:*/FindOptionSet_dimnorz.Active_dmnrz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_dnorz, /*timeOlder:*/Active_dnorz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_dnrz_long(
		/*i:*/Active_dinrz, /*ignoreCase:*/Active_dinrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adinorz.Active_adnrz, /*timeAccess:*/FindOptionSet_adinorz.Active_adnrz_long, /*c:*/FindOptionSet_cdinorz.Active_cdnrz, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdnrz_long, /*m:*/FindOptionSet_dimnorz.Active_dmnrz, /*timeModified:*/FindOptionSet_dimnorz.Active_dmnrz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_dnorz, /*timeOlder:*/Active_dnorz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_dorz(
		/*i:*/Active_diorz, /*ignoreCase:*/Active_diorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adinorz.Active_adorz, /*timeAccess:*/FindOptionSet_adinorz.Active_adorz_long, /*c:*/FindOptionSet_cdinorz.Active_cdorz, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdorz_long, /*m:*/FindOptionSet_dimnorz.Active_dmorz, /*timeModified:*/FindOptionSet_dimnorz.Active_dmorz_long, /*n:*/Active_dnorz, /*timeNewer:*/Active_dnorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_dorz_long(
		/*i:*/Active_diorz, /*ignoreCase:*/Active_diorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adinorz.Active_adorz, /*timeAccess:*/FindOptionSet_adinorz.Active_adorz_long, /*c:*/FindOptionSet_cdinorz.Active_cdorz, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdorz_long, /*m:*/FindOptionSet_dimnorz.Active_dmorz, /*timeModified:*/FindOptionSet_dimnorz.Active_dmorz_long, /*n:*/Active_dnorz, /*timeNewer:*/Active_dnorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_dino(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_dinoz, /*print0:*/Active_dinoz_long, /*r:*/Active_dinor, /*regex:*/Active_dinor_long, /*a:*/FindOptionSet_adinorz.Active_adino, /*timeAccess:*/FindOptionSet_adinorz.Active_adino_long, /*c:*/FindOptionSet_cdinorz.Active_cdino, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdino_long, /*m:*/FindOptionSet_dimnorz.Active_dimno, /*timeModified:*/FindOptionSet_dimnorz.Active_dimno_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_dino_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_dinoz, /*print0:*/Active_dinoz_long, /*r:*/Active_dinor, /*regex:*/Active_dinor_long, /*a:*/FindOptionSet_adinorz.Active_adino, /*timeAccess:*/FindOptionSet_adinorz.Active_adino_long, /*c:*/FindOptionSet_cdinorz.Active_cdino, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdino_long, /*m:*/FindOptionSet_dimnorz.Active_dimno, /*timeModified:*/FindOptionSet_dimnorz.Active_dimno_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_dinz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_dinrz, /*regex:*/Active_dinrz_long, /*a:*/FindOptionSet_adinorz.Active_adinz, /*timeAccess:*/FindOptionSet_adinorz.Active_adinz_long, /*c:*/FindOptionSet_cdinorz.Active_cdinz, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdinz_long, /*m:*/FindOptionSet_dimnorz.Active_dimnz, /*timeModified:*/FindOptionSet_dimnorz.Active_dimnz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_dinoz, /*timeOlder:*/Active_dinoz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_dinz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_dinrz, /*regex:*/Active_dinrz_long, /*a:*/FindOptionSet_adinorz.Active_adinz, /*timeAccess:*/FindOptionSet_adinorz.Active_adinz_long, /*c:*/FindOptionSet_cdinorz.Active_cdinz, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdinz_long, /*m:*/FindOptionSet_dimnorz.Active_dimnz, /*timeModified:*/FindOptionSet_dimnorz.Active_dimnz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_dinoz, /*timeOlder:*/Active_dinoz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_dioz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_diorz, /*regex:*/Active_diorz_long, /*a:*/FindOptionSet_adinorz.Active_adioz, /*timeAccess:*/FindOptionSet_adinorz.Active_adioz_long, /*c:*/FindOptionSet_cdinorz.Active_cdioz, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdioz_long, /*m:*/FindOptionSet_dimnorz.Active_dimoz, /*timeModified:*/FindOptionSet_dimnorz.Active_dimoz_long, /*n:*/Active_dinoz, /*timeNewer:*/Active_dinoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_dioz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_diorz, /*regex:*/Active_diorz_long, /*a:*/FindOptionSet_adinorz.Active_adioz, /*timeAccess:*/FindOptionSet_adinorz.Active_adioz_long, /*c:*/FindOptionSet_cdinorz.Active_cdioz, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdioz_long, /*m:*/FindOptionSet_dimnorz.Active_dimoz, /*timeModified:*/FindOptionSet_dimnorz.Active_dimoz_long, /*n:*/Active_dinoz, /*timeNewer:*/Active_dinoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_dnoz(
		/*i:*/Active_dinoz, /*ignoreCase:*/Active_dinoz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_dnorz, /*regex:*/Active_dnorz_long, /*a:*/FindOptionSet_adinorz.Active_adnoz, /*timeAccess:*/FindOptionSet_adinorz.Active_adnoz_long, /*c:*/FindOptionSet_cdinorz.Active_cdnoz, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdnoz_long, /*m:*/FindOptionSet_dimnorz.Active_dmnoz, /*timeModified:*/FindOptionSet_dimnorz.Active_dmnoz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_dnoz_long(
		/*i:*/Active_dinoz, /*ignoreCase:*/Active_dinoz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_dnorz, /*regex:*/Active_dnorz_long, /*a:*/FindOptionSet_adinorz.Active_adnoz, /*timeAccess:*/FindOptionSet_adinorz.Active_adnoz_long, /*c:*/FindOptionSet_cdinorz.Active_cdnoz, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdnoz_long, /*m:*/FindOptionSet_dimnorz.Active_dmnoz, /*timeModified:*/FindOptionSet_dimnorz.Active_dmnoz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #typeDirectory d}.
     */
    Active_dir(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_dirz, /*print0:*/Active_dirz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adinorz.Active_adir, /*timeAccess:*/FindOptionSet_adinorz.Active_adir_long, /*c:*/FindOptionSet_cdinorz.Active_cdir, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdir_long, /*m:*/FindOptionSet_dimnorz.Active_dimr, /*timeModified:*/FindOptionSet_dimnorz.Active_dimr_long, /*n:*/Active_dinr, /*timeNewer:*/Active_dinr_long, /*o:*/Active_dior, /*timeOlder:*/Active_dior_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #typeDirectory d}.
     */
    Active_dir_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_dirz, /*print0:*/Active_dirz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adinorz.Active_adir, /*timeAccess:*/FindOptionSet_adinorz.Active_adir_long, /*c:*/FindOptionSet_cdinorz.Active_cdir, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdir_long, /*m:*/FindOptionSet_dimnorz.Active_dimr, /*timeModified:*/FindOptionSet_dimnorz.Active_dimr_long, /*n:*/Active_dinr, /*timeNewer:*/Active_dinr_long, /*o:*/Active_dior, /*timeOlder:*/Active_dior_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_dnr(
		/*i:*/Active_dinr, /*ignoreCase:*/Active_dinr_long, /*z:*/Active_dnrz, /*print0:*/Active_dnrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adinorz.Active_adnr, /*timeAccess:*/FindOptionSet_adinorz.Active_adnr_long, /*c:*/FindOptionSet_cdinorz.Active_cdnr, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdnr_long, /*m:*/FindOptionSet_dimnorz.Active_dmnr, /*timeModified:*/FindOptionSet_dimnorz.Active_dmnr_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_dnor, /*timeOlder:*/Active_dnor_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.regex, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_dnr_long(
		/*i:*/Active_dinr, /*ignoreCase:*/Active_dinr_long, /*z:*/Active_dnrz, /*print0:*/Active_dnrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adinorz.Active_adnr, /*timeAccess:*/FindOptionSet_adinorz.Active_adnr_long, /*c:*/FindOptionSet_cdinorz.Active_cdnr, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdnr_long, /*m:*/FindOptionSet_dimnorz.Active_dmnr, /*timeModified:*/FindOptionSet_dimnorz.Active_dmnr_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_dnor, /*timeOlder:*/Active_dnor_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.regex, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_dor(
		/*i:*/Active_dior, /*ignoreCase:*/Active_dior_long, /*z:*/Active_dorz, /*print0:*/Active_dorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adinorz.Active_ador, /*timeAccess:*/FindOptionSet_adinorz.Active_ador_long, /*c:*/FindOptionSet_cdinorz.Active_cdor, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdor_long, /*m:*/FindOptionSet_dimnorz.Active_dmor, /*timeModified:*/FindOptionSet_dimnorz.Active_dmor_long, /*n:*/Active_dnor, /*timeNewer:*/Active_dnor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.regex, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_dor_long(
		/*i:*/Active_dior, /*ignoreCase:*/Active_dior_long, /*z:*/Active_dorz, /*print0:*/Active_dorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adinorz.Active_ador, /*timeAccess:*/FindOptionSet_adinorz.Active_ador_long, /*c:*/FindOptionSet_cdinorz.Active_cdor, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdor_long, /*m:*/FindOptionSet_dimnorz.Active_dmor, /*timeModified:*/FindOptionSet_dimnorz.Active_dmor_long, /*n:*/Active_dnor, /*timeNewer:*/Active_dnor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.regex, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #typeDirectory d}.
     */
    Active_drz(
		/*i:*/Active_dirz, /*ignoreCase:*/Active_dirz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adinorz.Active_adrz, /*timeAccess:*/FindOptionSet_adinorz.Active_adrz_long, /*c:*/FindOptionSet_cdinorz.Active_cdrz, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdrz_long, /*m:*/FindOptionSet_dimnorz.Active_dmrz, /*timeModified:*/FindOptionSet_dimnorz.Active_dmrz_long, /*n:*/Active_dnrz, /*timeNewer:*/Active_dnrz_long, /*o:*/Active_dorz, /*timeOlder:*/Active_dorz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #typeDirectory d}.
     */
    Active_drz_long(
		/*i:*/Active_dirz, /*ignoreCase:*/Active_dirz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adinorz.Active_adrz, /*timeAccess:*/FindOptionSet_adinorz.Active_adrz_long, /*c:*/FindOptionSet_cdinorz.Active_cdrz, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdrz_long, /*m:*/FindOptionSet_dimnorz.Active_dmrz, /*timeModified:*/FindOptionSet_dimnorz.Active_dmrz_long, /*n:*/Active_dnrz, /*timeNewer:*/Active_dnrz_long, /*o:*/Active_dorz, /*timeOlder:*/Active_dorz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_din(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_dinz, /*print0:*/Active_dinz_long, /*r:*/Active_dinr, /*regex:*/Active_dinr_long, /*a:*/FindOptionSet_adinorz.Active_adin, /*timeAccess:*/FindOptionSet_adinorz.Active_adin_long, /*c:*/FindOptionSet_cdinorz.Active_cdin, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdin_long, /*m:*/FindOptionSet_dimnorz.Active_dimn, /*timeModified:*/FindOptionSet_dimnorz.Active_dimn_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_dino, /*timeOlder:*/Active_dino_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_din_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_dinz, /*print0:*/Active_dinz_long, /*r:*/Active_dinr, /*regex:*/Active_dinr_long, /*a:*/FindOptionSet_adinorz.Active_adin, /*timeAccess:*/FindOptionSet_adinorz.Active_adin_long, /*c:*/FindOptionSet_cdinorz.Active_cdin, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdin_long, /*m:*/FindOptionSet_dimnorz.Active_dimn, /*timeModified:*/FindOptionSet_dimnorz.Active_dimn_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_dino, /*timeOlder:*/Active_dino_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_dio(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_dioz, /*print0:*/Active_dioz_long, /*r:*/Active_dior, /*regex:*/Active_dior_long, /*a:*/FindOptionSet_adinorz.Active_adio, /*timeAccess:*/FindOptionSet_adinorz.Active_adio_long, /*c:*/FindOptionSet_cdinorz.Active_cdio, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdio_long, /*m:*/FindOptionSet_dimnorz.Active_dimo, /*timeModified:*/FindOptionSet_dimnorz.Active_dimo_long, /*n:*/Active_dino, /*timeNewer:*/Active_dino_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_dio_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_dioz, /*print0:*/Active_dioz_long, /*r:*/Active_dior, /*regex:*/Active_dior_long, /*a:*/FindOptionSet_adinorz.Active_adio, /*timeAccess:*/FindOptionSet_adinorz.Active_adio_long, /*c:*/FindOptionSet_cdinorz.Active_cdio, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdio_long, /*m:*/FindOptionSet_dimnorz.Active_dimo, /*timeModified:*/FindOptionSet_dimnorz.Active_dimo_long, /*n:*/Active_dino, /*timeNewer:*/Active_dino_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #typeDirectory d}.
     */
    Active_diz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_dirz, /*regex:*/Active_dirz_long, /*a:*/FindOptionSet_adinorz.Active_adiz, /*timeAccess:*/FindOptionSet_adinorz.Active_adiz_long, /*c:*/FindOptionSet_cdinorz.Active_cdiz, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdiz_long, /*m:*/FindOptionSet_dimnorz.Active_dimz, /*timeModified:*/FindOptionSet_dimnorz.Active_dimz_long, /*n:*/Active_dinz, /*timeNewer:*/Active_dinz_long, /*o:*/Active_dioz, /*timeOlder:*/Active_dioz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #typeDirectory d}.
     */
    Active_diz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_dirz, /*regex:*/Active_dirz_long, /*a:*/FindOptionSet_adinorz.Active_adiz, /*timeAccess:*/FindOptionSet_adinorz.Active_adiz_long, /*c:*/FindOptionSet_cdinorz.Active_cdiz, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdiz_long, /*m:*/FindOptionSet_dimnorz.Active_dimz, /*timeModified:*/FindOptionSet_dimnorz.Active_dimz_long, /*n:*/Active_dinz, /*timeNewer:*/Active_dinz_long, /*o:*/Active_dioz, /*timeOlder:*/Active_dioz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_dno(
		/*i:*/Active_dino, /*ignoreCase:*/Active_dino_long, /*z:*/Active_dnoz, /*print0:*/Active_dnoz_long, /*r:*/Active_dnor, /*regex:*/Active_dnor_long, /*a:*/FindOptionSet_adinorz.Active_adno, /*timeAccess:*/FindOptionSet_adinorz.Active_adno_long, /*c:*/FindOptionSet_cdinorz.Active_cdno, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdno_long, /*m:*/FindOptionSet_dimnorz.Active_dmno, /*timeModified:*/FindOptionSet_dimnorz.Active_dmno_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_dno_long(
		/*i:*/Active_dino, /*ignoreCase:*/Active_dino_long, /*z:*/Active_dnoz, /*print0:*/Active_dnoz_long, /*r:*/Active_dnor, /*regex:*/Active_dnor_long, /*a:*/FindOptionSet_adinorz.Active_adno, /*timeAccess:*/FindOptionSet_adinorz.Active_adno_long, /*c:*/FindOptionSet_cdinorz.Active_cdno, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdno_long, /*m:*/FindOptionSet_dimnorz.Active_dmno, /*timeModified:*/FindOptionSet_dimnorz.Active_dmno_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_dnz(
		/*i:*/Active_dinz, /*ignoreCase:*/Active_dinz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_dnrz, /*regex:*/Active_dnrz_long, /*a:*/FindOptionSet_adinorz.Active_adnz, /*timeAccess:*/FindOptionSet_adinorz.Active_adnz_long, /*c:*/FindOptionSet_cdinorz.Active_cdnz, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdnz_long, /*m:*/FindOptionSet_dimnorz.Active_dmnz, /*timeModified:*/FindOptionSet_dimnorz.Active_dmnz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_dnoz, /*timeOlder:*/Active_dnoz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_dnz_long(
		/*i:*/Active_dinz, /*ignoreCase:*/Active_dinz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_dnrz, /*regex:*/Active_dnrz_long, /*a:*/FindOptionSet_adinorz.Active_adnz, /*timeAccess:*/FindOptionSet_adinorz.Active_adnz_long, /*c:*/FindOptionSet_cdinorz.Active_cdnz, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdnz_long, /*m:*/FindOptionSet_dimnorz.Active_dmnz, /*timeModified:*/FindOptionSet_dimnorz.Active_dmnz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_dnoz, /*timeOlder:*/Active_dnoz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_doz(
		/*i:*/Active_dioz, /*ignoreCase:*/Active_dioz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_dorz, /*regex:*/Active_dorz_long, /*a:*/FindOptionSet_adinorz.Active_adoz, /*timeAccess:*/FindOptionSet_adinorz.Active_adoz_long, /*c:*/FindOptionSet_cdinorz.Active_cdoz, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdoz_long, /*m:*/FindOptionSet_dimnorz.Active_dmoz, /*timeModified:*/FindOptionSet_dimnorz.Active_dmoz_long, /*n:*/Active_dnoz, /*timeNewer:*/Active_dnoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_doz_long(
		/*i:*/Active_dioz, /*ignoreCase:*/Active_dioz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_dorz, /*regex:*/Active_dorz_long, /*a:*/FindOptionSet_adinorz.Active_adoz, /*timeAccess:*/FindOptionSet_adinorz.Active_adoz_long, /*c:*/FindOptionSet_cdinorz.Active_cdoz, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdoz_long, /*m:*/FindOptionSet_dimnorz.Active_dmoz, /*timeModified:*/FindOptionSet_dimnorz.Active_dmoz_long, /*n:*/Active_dnoz, /*timeNewer:*/Active_dnoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #typeDirectory d}.
     */
    Active_dr(
		/*i:*/Active_dir, /*ignoreCase:*/Active_dir_long, /*z:*/Active_drz, /*print0:*/Active_drz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adinorz.Active_adr, /*timeAccess:*/FindOptionSet_adinorz.Active_adr_long, /*c:*/FindOptionSet_cdinorz.Active_cdr, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdr_long, /*m:*/FindOptionSet_dimnorz.Active_dmr, /*timeModified:*/FindOptionSet_dimnorz.Active_dmr_long, /*n:*/Active_dnr, /*timeNewer:*/Active_dnr_long, /*o:*/Active_dor, /*timeOlder:*/Active_dor_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.regex, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #typeDirectory d}.
     */
    Active_dr_long(
		/*i:*/Active_dir, /*ignoreCase:*/Active_dir_long, /*z:*/Active_drz, /*print0:*/Active_drz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adinorz.Active_adr, /*timeAccess:*/FindOptionSet_adinorz.Active_adr_long, /*c:*/FindOptionSet_cdinorz.Active_cdr, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdr_long, /*m:*/FindOptionSet_dimnorz.Active_dmr, /*timeModified:*/FindOptionSet_dimnorz.Active_dmr_long, /*n:*/Active_dnr, /*timeNewer:*/Active_dnr_long, /*o:*/Active_dor, /*timeOlder:*/Active_dor_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.regex, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #typeDirectory d}.
     */
    Active_di(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_diz, /*print0:*/Active_diz_long, /*r:*/Active_dir, /*regex:*/Active_dir_long, /*a:*/FindOptionSet_adinorz.Active_adi, /*timeAccess:*/FindOptionSet_adinorz.Active_adi_long, /*c:*/FindOptionSet_cdinorz.Active_cdi, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdi_long, /*m:*/FindOptionSet_dimnorz.Active_dim, /*timeModified:*/FindOptionSet_dimnorz.Active_dim_long, /*n:*/Active_din, /*timeNewer:*/Active_din_long, /*o:*/Active_dio, /*timeOlder:*/Active_dio_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #typeDirectory d}.
     */
    Active_di_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_diz, /*print0:*/Active_diz_long, /*r:*/Active_dir, /*regex:*/Active_dir_long, /*a:*/FindOptionSet_adinorz.Active_adi, /*timeAccess:*/FindOptionSet_adinorz.Active_adi_long, /*c:*/FindOptionSet_cdinorz.Active_cdi, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdi_long, /*m:*/FindOptionSet_dimnorz.Active_dim, /*timeModified:*/FindOptionSet_dimnorz.Active_dim_long, /*n:*/Active_din, /*timeNewer:*/Active_din_long, /*o:*/Active_dio, /*timeOlder:*/Active_dio_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_dn(
		/*i:*/Active_din, /*ignoreCase:*/Active_din_long, /*z:*/Active_dnz, /*print0:*/Active_dnz_long, /*r:*/Active_dnr, /*regex:*/Active_dnr_long, /*a:*/FindOptionSet_adinorz.Active_adn, /*timeAccess:*/FindOptionSet_adinorz.Active_adn_long, /*c:*/FindOptionSet_cdinorz.Active_cdn, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdn_long, /*m:*/FindOptionSet_dimnorz.Active_dmn, /*timeModified:*/FindOptionSet_dimnorz.Active_dmn_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_dno, /*timeOlder:*/Active_dno_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #timeNewer n}, {@link #typeDirectory d}.
     */
    Active_dn_long(
		/*i:*/Active_din, /*ignoreCase:*/Active_din_long, /*z:*/Active_dnz, /*print0:*/Active_dnz_long, /*r:*/Active_dnr, /*regex:*/Active_dnr_long, /*a:*/FindOptionSet_adinorz.Active_adn, /*timeAccess:*/FindOptionSet_adinorz.Active_adn_long, /*c:*/FindOptionSet_cdinorz.Active_cdn, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdn_long, /*m:*/FindOptionSet_dimnorz.Active_dmn, /*timeModified:*/FindOptionSet_dimnorz.Active_dmn_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_dno, /*timeOlder:*/Active_dno_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.timeNewer, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_do(
		/*i:*/Active_dio, /*ignoreCase:*/Active_dio_long, /*z:*/Active_doz, /*print0:*/Active_doz_long, /*r:*/Active_dor, /*regex:*/Active_dor_long, /*a:*/FindOptionSet_adinorz.Active_ado, /*timeAccess:*/FindOptionSet_adinorz.Active_ado_long, /*c:*/FindOptionSet_cdinorz.Active_cdo, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdo_long, /*m:*/FindOptionSet_dimnorz.Active_dmo, /*timeModified:*/FindOptionSet_dimnorz.Active_dmo_long, /*n:*/Active_dno, /*timeNewer:*/Active_dno_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #timeOlder o}, {@link #typeDirectory d}.
     */
    Active_do_long(
		/*i:*/Active_dio, /*ignoreCase:*/Active_dio_long, /*z:*/Active_doz, /*print0:*/Active_doz_long, /*r:*/Active_dor, /*regex:*/Active_dor_long, /*a:*/FindOptionSet_adinorz.Active_ado, /*timeAccess:*/FindOptionSet_adinorz.Active_ado_long, /*c:*/FindOptionSet_cdinorz.Active_cdo, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdo_long, /*m:*/FindOptionSet_dimnorz.Active_dmo, /*timeModified:*/FindOptionSet_dimnorz.Active_dmo_long, /*n:*/Active_dno, /*timeNewer:*/Active_dno_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.timeOlder, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #typeDirectory d}.
     */
    Active_dz(
		/*i:*/Active_diz, /*ignoreCase:*/Active_diz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_drz, /*regex:*/Active_drz_long, /*a:*/FindOptionSet_adinorz.Active_adz, /*timeAccess:*/FindOptionSet_adinorz.Active_adz_long, /*c:*/FindOptionSet_cdinorz.Active_cdz, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdz_long, /*m:*/FindOptionSet_dimnorz.Active_dmz, /*timeModified:*/FindOptionSet_dimnorz.Active_dmz_long, /*n:*/Active_dnz, /*timeNewer:*/Active_dnz_long, /*o:*/Active_doz, /*timeOlder:*/Active_doz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #typeDirectory d}.
     */
    Active_dz_long(
		/*i:*/Active_diz, /*ignoreCase:*/Active_diz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_drz, /*regex:*/Active_drz_long, /*a:*/FindOptionSet_adinorz.Active_adz, /*timeAccess:*/FindOptionSet_adinorz.Active_adz_long, /*c:*/FindOptionSet_cdinorz.Active_cdz, /*timeCreate:*/FindOptionSet_cdinorz.Active_cdz_long, /*m:*/FindOptionSet_dimnorz.Active_dmz, /*timeModified:*/FindOptionSet_dimnorz.Active_dmz_long, /*n:*/Active_dnz, /*timeNewer:*/Active_dnz_long, /*o:*/Active_doz, /*timeOlder:*/Active_doz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #typeDirectory d}.
     */
    Active_d(
		/*i:*/Active_di, /*ignoreCase:*/Active_di_long, /*z:*/Active_dz, /*print0:*/Active_dz_long, /*r:*/Active_dr, /*regex:*/Active_dr_long, /*a:*/FindOptionSet_adinorz.Active_ad, /*timeAccess:*/FindOptionSet_adinorz.Active_ad_long, /*c:*/FindOptionSet_cdinorz.Active_cd, /*timeCreate:*/FindOptionSet_cdinorz.Active_cd_long, /*m:*/FindOptionSet_dimnorz.Active_dm, /*timeModified:*/FindOptionSet_dimnorz.Active_dm_long, /*n:*/Active_dn, /*timeNewer:*/Active_dn_long, /*o:*/Active_do, /*timeOlder:*/Active_do_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            true,
		/*active:*/FindOption.typeDirectory
    ),
    /**
     * Option set with the following active options: {@link #typeDirectory d}.
     */
    Active_d_long(
		/*i:*/Active_di, /*ignoreCase:*/Active_di_long, /*z:*/Active_dz, /*print0:*/Active_dz_long, /*r:*/Active_dr, /*regex:*/Active_dr_long, /*a:*/FindOptionSet_adinorz.Active_ad, /*timeAccess:*/FindOptionSet_adinorz.Active_ad_long, /*c:*/FindOptionSet_cdinorz.Active_cd, /*timeCreate:*/FindOptionSet_cdinorz.Active_cd_long, /*m:*/FindOptionSet_dimnorz.Active_dm, /*timeModified:*/FindOptionSet_dimnorz.Active_dm_long, /*n:*/Active_dn, /*timeNewer:*/Active_dn_long, /*o:*/Active_do, /*timeOlder:*/Active_do_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/,
            false,
		/*active:*/FindOption.typeDirectory
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
    public final FindOptionSet_acdimnorz i;
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
    public final FindOptionSet_acdimnorz ignoreCase;
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
    public final FindOptionSet_acdimnorz z;
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
    public final FindOptionSet_acdimnorz print0;
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
    public final FindOptionSet_acdimnorz r;
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
    public final FindOptionSet_acdimnorz regex;
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
    public final FindOptionSet_dimnorz m;
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
    public final FindOptionSet_dimnorz timeModified;
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
    public final FindOptionSet_acdimnorz n;
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
    public final FindOptionSet_acdimnorz timeNewer;
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
    public final FindOptionSet_acdimnorz o;
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
    public final FindOptionSet_acdimnorz timeOlder;
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
    public final FindOptionSet_acdimnorz d;
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
    public final FindOptionSet_acdimnorz typeDirectory;
    private final boolean useAcronym;
    private final EnumSet<FindOption> options;

    private FindOptionSet_acdimnorz(
            FindOptionSet_acdimnorz i, FindOptionSet_acdimnorz ignoreCase, FindOptionSet_acdimnorz z, FindOptionSet_acdimnorz print0, FindOptionSet_acdimnorz r, FindOptionSet_acdimnorz regex, FindOptionSet_adinorz a, FindOptionSet_adinorz timeAccess, FindOptionSet_cdinorz c, FindOptionSet_cdinorz timeCreate, FindOptionSet_dimnorz m, FindOptionSet_dimnorz timeModified, FindOptionSet_acdimnorz n, FindOptionSet_acdimnorz timeNewer, FindOptionSet_acdimnorz o, FindOptionSet_acdimnorz timeOlder, FindOptionSet_acdimnorz d, FindOptionSet_acdimnorz typeDirectory,
            boolean useAcronym,
            FindOption... activeOptions
    ) {
        this.i = i == null ? this : i;
        this.ignoreCase = ignoreCase == null ? this : ignoreCase;
        this.z = z == null ? this : z;
        this.print0 = print0 == null ? this : print0;
        this.r = r == null ? this : r;
        this.regex = regex == null ? this : regex;
        this.a = notNull(a);
        this.timeAccess = notNull(timeAccess);
        this.c = notNull(c);
        this.timeCreate = notNull(timeCreate);
        this.m = notNull(m);
        this.timeModified = notNull(timeModified);
        this.n = n == null ? this : n;
        this.timeNewer = timeNewer == null ? this : timeNewer;
        this.o = o == null ? this : o;
        this.timeOlder = timeOlder == null ? this : timeOlder;
        this.d = d == null ? this : d;
        this.typeDirectory = typeDirectory == null ? this : typeDirectory;
        this.useAcronym = useAcronym;
        this.options = activeOptions.length == 0 ? EnumSet.noneOf(FindOption.class) : EnumSet.copyOf(Arrays.asList(activeOptions));
    }

    /**
     * Checks that the given {@code value} is not null and throws an exception
     * otherwise.
     *
     * @param the value to check
     * @return the given {@code value} if it is not null
     * @throws NullPointerException if {@code value==null}
     */
    private static <T> T notNull(T value) {
        if(value != null) {
            return value;
        }
        throw new NullPointerException();
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
     *    FindOptionSet_acdimnorz.ignoreCase.z;
     * </pre>
     * uses acronyms, that is, this method always returns true for the above
     * set.
     * <p>
     * On the other hand, long option names are used and this method always
     * returns false for the set
     * <pre>
     *    FindOptionSet_acdimnorz.i.print0;
     * </pre>
     * <p>
     * Note that a repeated option is <i>not</i> treated as the last set option.
     * For instance, the first and last option of the following set are
     * equivalent and acronyms are used:
     * <pre>
     *    FindOptionSet_acdimnorz.i.z.ignoreCase;
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
