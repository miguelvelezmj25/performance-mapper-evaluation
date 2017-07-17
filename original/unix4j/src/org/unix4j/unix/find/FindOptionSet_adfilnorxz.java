package org.unix4j.unix.find;

import org.unix4j.option.Option;
import org.unix4j.unix.Find;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Option sets for the {@link Find find} command with
 * the following options: {@link #i i}, {@link #z z}, {@link #r r}, {@link #a a}, {@link #n n}, {@link #o o}, {@link #d d}, {@link #f f}, {@link #x x}, {@link #l l}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Find#Options} should be used instead to specify command
 * options. See also {@link org.unix4j.unix.find.FindOptions} for more information.
 */
public enum FindOptionSet_adfilnorxz implements FindOptions {
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_ainorz(
        /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_adinorz.Active_adinorz, /*typeDirectory:*/FindOptionSet_adinorz.Active_adinorz_long, /*f:*/FindOptionSet_afinorz.Active_afinorz, /*typeFile:*/FindOptionSet_afinorz.Active_afinorz_long, /*x:*/FindOptionSet_ainorxz.Active_ainorxz, /*typeOther:*/FindOptionSet_ainorxz.Active_ainorxz_long, /*l:*/FindOptionSet_ailnorz.Active_ailnorz, /*typeSymlink:*/FindOptionSet_ailnorz.Active_ailnorz_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_ainorz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_adinorz.Active_adinorz, /*typeDirectory:*/FindOptionSet_adinorz.Active_adinorz_long, /*f:*/FindOptionSet_afinorz.Active_afinorz, /*typeFile:*/FindOptionSet_afinorz.Active_afinorz_long, /*x:*/FindOptionSet_ainorxz.Active_ainorxz, /*typeOther:*/FindOptionSet_ainorxz.Active_ainorxz_long, /*l:*/FindOptionSet_ailnorz.Active_ailnorz, /*typeSymlink:*/FindOptionSet_ailnorz.Active_ailnorz_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_ainor(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ainorz, /*print0:*/Active_ainorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_adinorz.Active_adinor, /*typeDirectory:*/FindOptionSet_adinorz.Active_adinor_long, /*f:*/FindOptionSet_afinorz.Active_afinor, /*typeFile:*/FindOptionSet_afinorz.Active_afinor_long, /*x:*/FindOptionSet_ainorxz.Active_ainorx, /*typeOther:*/FindOptionSet_ainorxz.Active_ainorx_long, /*l:*/FindOptionSet_ailnorz.Active_ailnor, /*typeSymlink:*/FindOptionSet_ailnorz.Active_ailnor_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_ainor_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ainorz, /*print0:*/Active_ainorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_adinorz.Active_adinor, /*typeDirectory:*/FindOptionSet_adinorz.Active_adinor_long, /*f:*/FindOptionSet_afinorz.Active_afinor, /*typeFile:*/FindOptionSet_afinorz.Active_afinor_long, /*x:*/FindOptionSet_ainorxz.Active_ainorx, /*typeOther:*/FindOptionSet_ainorxz.Active_ainorx_long, /*l:*/FindOptionSet_ailnorz.Active_ailnor, /*typeSymlink:*/FindOptionSet_ailnorz.Active_ailnor_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}.
     */
    Active_ainrz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_ainorz, /*timeOlder:*/Active_ainorz_long, /*d:*/FindOptionSet_adinorz.Active_adinrz, /*typeDirectory:*/FindOptionSet_adinorz.Active_adinrz_long, /*f:*/FindOptionSet_afinorz.Active_afinrz, /*typeFile:*/FindOptionSet_afinorz.Active_afinrz_long, /*x:*/FindOptionSet_ainorxz.Active_ainrxz, /*typeOther:*/FindOptionSet_ainorxz.Active_ainrxz_long, /*l:*/FindOptionSet_ailnorz.Active_ailnrz, /*typeSymlink:*/FindOptionSet_ailnorz.Active_ailnrz_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}.
     */
    Active_ainrz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_ainorz, /*timeOlder:*/Active_ainorz_long, /*d:*/FindOptionSet_adinorz.Active_adinrz, /*typeDirectory:*/FindOptionSet_adinorz.Active_adinrz_long, /*f:*/FindOptionSet_afinorz.Active_afinrz, /*typeFile:*/FindOptionSet_afinorz.Active_afinrz_long, /*x:*/FindOptionSet_ainorxz.Active_ainrxz, /*typeOther:*/FindOptionSet_ainorxz.Active_ainrxz_long, /*l:*/FindOptionSet_ailnorz.Active_ailnrz, /*typeSymlink:*/FindOptionSet_ailnorz.Active_ailnrz_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeOlder o}.
     */
    Active_aiorz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ainorz, /*timeNewer:*/Active_ainorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_adinorz.Active_adiorz, /*typeDirectory:*/FindOptionSet_adinorz.Active_adiorz_long, /*f:*/FindOptionSet_afinorz.Active_afiorz, /*typeFile:*/FindOptionSet_afinorz.Active_afiorz_long, /*x:*/FindOptionSet_ainorxz.Active_aiorxz, /*typeOther:*/FindOptionSet_ainorxz.Active_aiorxz_long, /*l:*/FindOptionSet_ailnorz.Active_ailorz, /*typeSymlink:*/FindOptionSet_ailnorz.Active_ailorz_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeOlder o}.
     */
    Active_aiorz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ainorz, /*timeNewer:*/Active_ainorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_adinorz.Active_adiorz, /*typeDirectory:*/FindOptionSet_adinorz.Active_adiorz_long, /*f:*/FindOptionSet_afinorz.Active_afiorz, /*typeFile:*/FindOptionSet_afinorz.Active_afiorz_long, /*x:*/FindOptionSet_ainorxz.Active_aiorxz, /*typeOther:*/FindOptionSet_ainorxz.Active_aiorxz_long, /*l:*/FindOptionSet_ailnorz.Active_ailorz, /*typeSymlink:*/FindOptionSet_ailnorz.Active_ailorz_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_anorz(
		/*i:*/Active_ainorz, /*ignoreCase:*/Active_ainorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_adinorz.Active_adnorz, /*typeDirectory:*/FindOptionSet_adinorz.Active_adnorz_long, /*f:*/FindOptionSet_afinorz.Active_afnorz, /*typeFile:*/FindOptionSet_afinorz.Active_afnorz_long, /*x:*/FindOptionSet_ainorxz.Active_anorxz, /*typeOther:*/FindOptionSet_ainorxz.Active_anorxz_long, /*l:*/FindOptionSet_ailnorz.Active_alnorz, /*typeSymlink:*/FindOptionSet_ailnorz.Active_alnorz_long,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_anorz_long(
		/*i:*/Active_ainorz, /*ignoreCase:*/Active_ainorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_adinorz.Active_adnorz, /*typeDirectory:*/FindOptionSet_adinorz.Active_adnorz_long, /*f:*/FindOptionSet_afinorz.Active_afnorz, /*typeFile:*/FindOptionSet_afinorz.Active_afnorz_long, /*x:*/FindOptionSet_ainorxz.Active_anorxz, /*typeOther:*/FindOptionSet_ainorxz.Active_anorxz_long, /*l:*/FindOptionSet_ailnorz.Active_alnorz, /*typeSymlink:*/FindOptionSet_ailnorz.Active_alnorz_long,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_ainoz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_ainorz, /*regex:*/Active_ainorz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_adinorz.Active_adinoz, /*typeDirectory:*/FindOptionSet_adinorz.Active_adinoz_long, /*f:*/FindOptionSet_afinorz.Active_afinoz, /*typeFile:*/FindOptionSet_afinorz.Active_afinoz_long, /*x:*/FindOptionSet_ainorxz.Active_ainoxz, /*typeOther:*/FindOptionSet_ainorxz.Active_ainoxz_long, /*l:*/FindOptionSet_ailnorz.Active_ailnoz, /*typeSymlink:*/FindOptionSet_ailnorz.Active_ailnoz_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_ainoz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_ainorz, /*regex:*/Active_ainorz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_adinorz.Active_adinoz, /*typeDirectory:*/FindOptionSet_adinorz.Active_adinoz_long, /*f:*/FindOptionSet_afinorz.Active_afinoz, /*typeFile:*/FindOptionSet_afinorz.Active_afinoz_long, /*x:*/FindOptionSet_ainorxz.Active_ainoxz, /*typeOther:*/FindOptionSet_ainorxz.Active_ainoxz_long, /*l:*/FindOptionSet_ailnorz.Active_ailnoz, /*typeSymlink:*/FindOptionSet_ailnorz.Active_ailnoz_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}.
     */
    Active_ainr(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ainrz, /*print0:*/Active_ainrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_ainor, /*timeOlder:*/Active_ainor_long, /*d:*/FindOptionSet_adinorz.Active_adinr, /*typeDirectory:*/FindOptionSet_adinorz.Active_adinr_long, /*f:*/FindOptionSet_afinorz.Active_afinr, /*typeFile:*/FindOptionSet_afinorz.Active_afinr_long, /*x:*/FindOptionSet_ainorxz.Active_ainrx, /*typeOther:*/FindOptionSet_ainorxz.Active_ainrx_long, /*l:*/FindOptionSet_ailnorz.Active_ailnr, /*typeSymlink:*/FindOptionSet_ailnorz.Active_ailnr_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}.
     */
    Active_ainr_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ainrz, /*print0:*/Active_ainrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_ainor, /*timeOlder:*/Active_ainor_long, /*d:*/FindOptionSet_adinorz.Active_adinr, /*typeDirectory:*/FindOptionSet_adinorz.Active_adinr_long, /*f:*/FindOptionSet_afinorz.Active_afinr, /*typeFile:*/FindOptionSet_afinorz.Active_afinr_long, /*x:*/FindOptionSet_ainorxz.Active_ainrx, /*typeOther:*/FindOptionSet_ainorxz.Active_ainrx_long, /*l:*/FindOptionSet_ailnorz.Active_ailnr, /*typeSymlink:*/FindOptionSet_ailnorz.Active_ailnr_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeAccess a}, {@link #timeOlder o}.
     */
    Active_aior(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_aiorz, /*print0:*/Active_aiorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ainor, /*timeNewer:*/Active_ainor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_adinorz.Active_adior, /*typeDirectory:*/FindOptionSet_adinorz.Active_adior_long, /*f:*/FindOptionSet_afinorz.Active_afior, /*typeFile:*/FindOptionSet_afinorz.Active_afior_long, /*x:*/FindOptionSet_ainorxz.Active_aiorx, /*typeOther:*/FindOptionSet_ainorxz.Active_aiorx_long, /*l:*/FindOptionSet_ailnorz.Active_ailor, /*typeSymlink:*/FindOptionSet_ailnorz.Active_ailor_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeAccess, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeAccess a}, {@link #timeOlder o}.
     */
    Active_aior_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_aiorz, /*print0:*/Active_aiorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ainor, /*timeNewer:*/Active_ainor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_adinorz.Active_adior, /*typeDirectory:*/FindOptionSet_adinorz.Active_adior_long, /*f:*/FindOptionSet_afinorz.Active_afior, /*typeFile:*/FindOptionSet_afinorz.Active_afior_long, /*x:*/FindOptionSet_ainorxz.Active_aiorx, /*typeOther:*/FindOptionSet_ainorxz.Active_aiorx_long, /*l:*/FindOptionSet_ailnorz.Active_ailor, /*typeSymlink:*/FindOptionSet_ailnorz.Active_ailor_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeAccess, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}.
     */
    Active_airz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ainrz, /*timeNewer:*/Active_ainrz_long, /*o:*/Active_aiorz, /*timeOlder:*/Active_aiorz_long, /*d:*/FindOptionSet_adinorz.Active_adirz, /*typeDirectory:*/FindOptionSet_adinorz.Active_adirz_long, /*f:*/FindOptionSet_afinorz.Active_afirz, /*typeFile:*/FindOptionSet_afinorz.Active_afirz_long, /*x:*/FindOptionSet_ainorxz.Active_airxz, /*typeOther:*/FindOptionSet_ainorxz.Active_airxz_long, /*l:*/FindOptionSet_ailnorz.Active_ailrz, /*typeSymlink:*/FindOptionSet_ailnorz.Active_ailrz_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeAccess
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}.
     */
    Active_airz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ainrz, /*timeNewer:*/Active_ainrz_long, /*o:*/Active_aiorz, /*timeOlder:*/Active_aiorz_long, /*d:*/FindOptionSet_adinorz.Active_adirz, /*typeDirectory:*/FindOptionSet_adinorz.Active_adirz_long, /*f:*/FindOptionSet_afinorz.Active_afirz, /*typeFile:*/FindOptionSet_afinorz.Active_afirz_long, /*x:*/FindOptionSet_ainorxz.Active_airxz, /*typeOther:*/FindOptionSet_ainorxz.Active_airxz_long, /*l:*/FindOptionSet_ailnorz.Active_ailrz, /*typeSymlink:*/FindOptionSet_ailnorz.Active_ailrz_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeAccess
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_anor(
		/*i:*/Active_ainor, /*ignoreCase:*/Active_ainor_long, /*z:*/Active_anorz, /*print0:*/Active_anorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_adinorz.Active_adnor, /*typeDirectory:*/FindOptionSet_adinorz.Active_adnor_long, /*f:*/FindOptionSet_afinorz.Active_afnor, /*typeFile:*/FindOptionSet_afinorz.Active_afnor_long, /*x:*/FindOptionSet_ainorxz.Active_anorx, /*typeOther:*/FindOptionSet_ainorxz.Active_anorx_long, /*l:*/FindOptionSet_ailnorz.Active_alnor, /*typeSymlink:*/FindOptionSet_ailnorz.Active_alnor_long,
            true,
		/*active:*/FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_anor_long(
		/*i:*/Active_ainor, /*ignoreCase:*/Active_ainor_long, /*z:*/Active_anorz, /*print0:*/Active_anorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_adinorz.Active_adnor, /*typeDirectory:*/FindOptionSet_adinorz.Active_adnor_long, /*f:*/FindOptionSet_afinorz.Active_afnor, /*typeFile:*/FindOptionSet_afinorz.Active_afnor_long, /*x:*/FindOptionSet_ainorxz.Active_anorx, /*typeOther:*/FindOptionSet_ainorxz.Active_anorx_long, /*l:*/FindOptionSet_ailnorz.Active_alnor, /*typeSymlink:*/FindOptionSet_ailnorz.Active_alnor_long,
            false,
		/*active:*/FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}.
     */
    Active_anrz(
		/*i:*/Active_ainrz, /*ignoreCase:*/Active_ainrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_anorz, /*timeOlder:*/Active_anorz_long, /*d:*/FindOptionSet_adinorz.Active_adnrz, /*typeDirectory:*/FindOptionSet_adinorz.Active_adnrz_long, /*f:*/FindOptionSet_afinorz.Active_afnrz, /*typeFile:*/FindOptionSet_afinorz.Active_afnrz_long, /*x:*/FindOptionSet_ainorxz.Active_anrxz, /*typeOther:*/FindOptionSet_ainorxz.Active_anrxz_long, /*l:*/FindOptionSet_ailnorz.Active_alnrz, /*typeSymlink:*/FindOptionSet_ailnorz.Active_alnrz_long,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}.
     */
    Active_anrz_long(
		/*i:*/Active_ainrz, /*ignoreCase:*/Active_ainrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_anorz, /*timeOlder:*/Active_anorz_long, /*d:*/FindOptionSet_adinorz.Active_adnrz, /*typeDirectory:*/FindOptionSet_adinorz.Active_adnrz_long, /*f:*/FindOptionSet_afinorz.Active_afnrz, /*typeFile:*/FindOptionSet_afinorz.Active_afnrz_long, /*x:*/FindOptionSet_ainorxz.Active_anrxz, /*typeOther:*/FindOptionSet_ainorxz.Active_anrxz_long, /*l:*/FindOptionSet_ailnorz.Active_alnrz, /*typeSymlink:*/FindOptionSet_ailnorz.Active_alnrz_long,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeOlder o}.
     */
    Active_aorz(
		/*i:*/Active_aiorz, /*ignoreCase:*/Active_aiorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_anorz, /*timeNewer:*/Active_anorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_adinorz.Active_adorz, /*typeDirectory:*/FindOptionSet_adinorz.Active_adorz_long, /*f:*/FindOptionSet_afinorz.Active_aforz, /*typeFile:*/FindOptionSet_afinorz.Active_aforz_long, /*x:*/FindOptionSet_ainorxz.Active_aorxz, /*typeOther:*/FindOptionSet_ainorxz.Active_aorxz_long, /*l:*/FindOptionSet_ailnorz.Active_alorz, /*typeSymlink:*/FindOptionSet_ailnorz.Active_alorz_long,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeOlder o}.
     */
    Active_aorz_long(
		/*i:*/Active_aiorz, /*ignoreCase:*/Active_aiorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_anorz, /*timeNewer:*/Active_anorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_adinorz.Active_adorz, /*typeDirectory:*/FindOptionSet_adinorz.Active_adorz_long, /*f:*/FindOptionSet_afinorz.Active_aforz, /*typeFile:*/FindOptionSet_afinorz.Active_aforz_long, /*x:*/FindOptionSet_ainorxz.Active_aorxz, /*typeOther:*/FindOptionSet_ainorxz.Active_aorxz_long, /*l:*/FindOptionSet_ailnorz.Active_alorz, /*typeSymlink:*/FindOptionSet_ailnorz.Active_alorz_long,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_aino(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ainoz, /*print0:*/Active_ainoz_long, /*r:*/Active_ainor, /*regex:*/Active_ainor_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_adinorz.Active_adino, /*typeDirectory:*/FindOptionSet_adinorz.Active_adino_long, /*f:*/FindOptionSet_afinorz.Active_afino, /*typeFile:*/FindOptionSet_afinorz.Active_afino_long, /*x:*/FindOptionSet_ainorxz.Active_ainox, /*typeOther:*/FindOptionSet_ainorxz.Active_ainox_long, /*l:*/FindOptionSet_ailnorz.Active_ailno, /*typeSymlink:*/FindOptionSet_ailnorz.Active_ailno_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_aino_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ainoz, /*print0:*/Active_ainoz_long, /*r:*/Active_ainor, /*regex:*/Active_ainor_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_adinorz.Active_adino, /*typeDirectory:*/FindOptionSet_adinorz.Active_adino_long, /*f:*/FindOptionSet_afinorz.Active_afino, /*typeFile:*/FindOptionSet_afinorz.Active_afino_long, /*x:*/FindOptionSet_ainorxz.Active_ainox, /*typeOther:*/FindOptionSet_ainorxz.Active_ainox_long, /*l:*/FindOptionSet_ailnorz.Active_ailno, /*typeSymlink:*/FindOptionSet_ailnorz.Active_ailno_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeAccess a}, {@link #timeNewer n}.
     */
    Active_ainz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_ainrz, /*regex:*/Active_ainrz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_ainoz, /*timeOlder:*/Active_ainoz_long, /*d:*/FindOptionSet_adinorz.Active_adinz, /*typeDirectory:*/FindOptionSet_adinorz.Active_adinz_long, /*f:*/FindOptionSet_afinorz.Active_afinz, /*typeFile:*/FindOptionSet_afinorz.Active_afinz_long, /*x:*/FindOptionSet_ainorxz.Active_ainxz, /*typeOther:*/FindOptionSet_ainorxz.Active_ainxz_long, /*l:*/FindOptionSet_ailnorz.Active_ailnz, /*typeSymlink:*/FindOptionSet_ailnorz.Active_ailnz_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeAccess, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeAccess a}, {@link #timeNewer n}.
     */
    Active_ainz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_ainrz, /*regex:*/Active_ainrz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_ainoz, /*timeOlder:*/Active_ainoz_long, /*d:*/FindOptionSet_adinorz.Active_adinz, /*typeDirectory:*/FindOptionSet_adinorz.Active_adinz_long, /*f:*/FindOptionSet_afinorz.Active_afinz, /*typeFile:*/FindOptionSet_afinorz.Active_afinz_long, /*x:*/FindOptionSet_ainorxz.Active_ainxz, /*typeOther:*/FindOptionSet_ainorxz.Active_ainxz_long, /*l:*/FindOptionSet_ailnorz.Active_ailnz, /*typeSymlink:*/FindOptionSet_ailnorz.Active_ailnz_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeAccess, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeAccess a}, {@link #timeOlder o}.
     */
    Active_aioz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_aiorz, /*regex:*/Active_aiorz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ainoz, /*timeNewer:*/Active_ainoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_adinorz.Active_adioz, /*typeDirectory:*/FindOptionSet_adinorz.Active_adioz_long, /*f:*/FindOptionSet_afinorz.Active_afioz, /*typeFile:*/FindOptionSet_afinorz.Active_afioz_long, /*x:*/FindOptionSet_ainorxz.Active_aioxz, /*typeOther:*/FindOptionSet_ainorxz.Active_aioxz_long, /*l:*/FindOptionSet_ailnorz.Active_ailoz, /*typeSymlink:*/FindOptionSet_ailnorz.Active_ailoz_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeAccess, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeAccess a}, {@link #timeOlder o}.
     */
    Active_aioz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_aiorz, /*regex:*/Active_aiorz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ainoz, /*timeNewer:*/Active_ainoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_adinorz.Active_adioz, /*typeDirectory:*/FindOptionSet_adinorz.Active_adioz_long, /*f:*/FindOptionSet_afinorz.Active_afioz, /*typeFile:*/FindOptionSet_afinorz.Active_afioz_long, /*x:*/FindOptionSet_ainorxz.Active_aioxz, /*typeOther:*/FindOptionSet_ainorxz.Active_aioxz_long, /*l:*/FindOptionSet_ailnorz.Active_ailoz, /*typeSymlink:*/FindOptionSet_ailnorz.Active_ailoz_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeAccess, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_anoz(
		/*i:*/Active_ainoz, /*ignoreCase:*/Active_ainoz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_anorz, /*regex:*/Active_anorz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_adinorz.Active_adnoz, /*typeDirectory:*/FindOptionSet_adinorz.Active_adnoz_long, /*f:*/FindOptionSet_afinorz.Active_afnoz, /*typeFile:*/FindOptionSet_afinorz.Active_afnoz_long, /*x:*/FindOptionSet_ainorxz.Active_anoxz, /*typeOther:*/FindOptionSet_ainorxz.Active_anoxz_long, /*l:*/FindOptionSet_ailnorz.Active_alnoz, /*typeSymlink:*/FindOptionSet_ailnorz.Active_alnoz_long,
            true,
		/*active:*/FindOption.print0, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_anoz_long(
		/*i:*/Active_ainoz, /*ignoreCase:*/Active_ainoz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_anorz, /*regex:*/Active_anorz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_adinorz.Active_adnoz, /*typeDirectory:*/FindOptionSet_adinorz.Active_adnoz_long, /*f:*/FindOptionSet_afinorz.Active_afnoz, /*typeFile:*/FindOptionSet_afinorz.Active_afnoz_long, /*x:*/FindOptionSet_ainorxz.Active_anoxz, /*typeOther:*/FindOptionSet_ainorxz.Active_anoxz_long, /*l:*/FindOptionSet_ailnorz.Active_alnoz, /*typeSymlink:*/FindOptionSet_ailnorz.Active_alnoz_long,
            false,
		/*active:*/FindOption.print0, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeAccess a}.
     */
    Active_air(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_airz, /*print0:*/Active_airz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ainr, /*timeNewer:*/Active_ainr_long, /*o:*/Active_aior, /*timeOlder:*/Active_aior_long, /*d:*/FindOptionSet_adinorz.Active_adir, /*typeDirectory:*/FindOptionSet_adinorz.Active_adir_long, /*f:*/FindOptionSet_afinorz.Active_afir, /*typeFile:*/FindOptionSet_afinorz.Active_afir_long, /*x:*/FindOptionSet_ainorxz.Active_airx, /*typeOther:*/FindOptionSet_ainorxz.Active_airx_long, /*l:*/FindOptionSet_ailnorz.Active_ailr, /*typeSymlink:*/FindOptionSet_ailnorz.Active_ailr_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeAccess
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeAccess a}.
     */
    Active_air_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_airz, /*print0:*/Active_airz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ainr, /*timeNewer:*/Active_ainr_long, /*o:*/Active_aior, /*timeOlder:*/Active_aior_long, /*d:*/FindOptionSet_adinorz.Active_adir, /*typeDirectory:*/FindOptionSet_adinorz.Active_adir_long, /*f:*/FindOptionSet_afinorz.Active_afir, /*typeFile:*/FindOptionSet_afinorz.Active_afir_long, /*x:*/FindOptionSet_ainorxz.Active_airx, /*typeOther:*/FindOptionSet_ainorxz.Active_airx_long, /*l:*/FindOptionSet_ailnorz.Active_ailr, /*typeSymlink:*/FindOptionSet_ailnorz.Active_ailr_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeAccess
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}.
     */
    Active_anr(
		/*i:*/Active_ainr, /*ignoreCase:*/Active_ainr_long, /*z:*/Active_anrz, /*print0:*/Active_anrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_anor, /*timeOlder:*/Active_anor_long, /*d:*/FindOptionSet_adinorz.Active_adnr, /*typeDirectory:*/FindOptionSet_adinorz.Active_adnr_long, /*f:*/FindOptionSet_afinorz.Active_afnr, /*typeFile:*/FindOptionSet_afinorz.Active_afnr_long, /*x:*/FindOptionSet_ainorxz.Active_anrx, /*typeOther:*/FindOptionSet_ainorxz.Active_anrx_long, /*l:*/FindOptionSet_ailnorz.Active_alnr, /*typeSymlink:*/FindOptionSet_ailnorz.Active_alnr_long,
            true,
		/*active:*/FindOption.regex, FindOption.timeAccess, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}.
     */
    Active_anr_long(
		/*i:*/Active_ainr, /*ignoreCase:*/Active_ainr_long, /*z:*/Active_anrz, /*print0:*/Active_anrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_anor, /*timeOlder:*/Active_anor_long, /*d:*/FindOptionSet_adinorz.Active_adnr, /*typeDirectory:*/FindOptionSet_adinorz.Active_adnr_long, /*f:*/FindOptionSet_afinorz.Active_afnr, /*typeFile:*/FindOptionSet_afinorz.Active_afnr_long, /*x:*/FindOptionSet_ainorxz.Active_anrx, /*typeOther:*/FindOptionSet_ainorxz.Active_anrx_long, /*l:*/FindOptionSet_ailnorz.Active_alnr, /*typeSymlink:*/FindOptionSet_ailnorz.Active_alnr_long,
            false,
		/*active:*/FindOption.regex, FindOption.timeAccess, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeAccess a}, {@link #timeOlder o}.
     */
    Active_aor(
		/*i:*/Active_aior, /*ignoreCase:*/Active_aior_long, /*z:*/Active_aorz, /*print0:*/Active_aorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_anor, /*timeNewer:*/Active_anor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_adinorz.Active_ador, /*typeDirectory:*/FindOptionSet_adinorz.Active_ador_long, /*f:*/FindOptionSet_afinorz.Active_afor, /*typeFile:*/FindOptionSet_afinorz.Active_afor_long, /*x:*/FindOptionSet_ainorxz.Active_aorx, /*typeOther:*/FindOptionSet_ainorxz.Active_aorx_long, /*l:*/FindOptionSet_ailnorz.Active_alor, /*typeSymlink:*/FindOptionSet_ailnorz.Active_alor_long,
            true,
		/*active:*/FindOption.regex, FindOption.timeAccess, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeAccess a}, {@link #timeOlder o}.
     */
    Active_aor_long(
		/*i:*/Active_aior, /*ignoreCase:*/Active_aior_long, /*z:*/Active_aorz, /*print0:*/Active_aorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_anor, /*timeNewer:*/Active_anor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_adinorz.Active_ador, /*typeDirectory:*/FindOptionSet_adinorz.Active_ador_long, /*f:*/FindOptionSet_afinorz.Active_afor, /*typeFile:*/FindOptionSet_afinorz.Active_afor_long, /*x:*/FindOptionSet_ainorxz.Active_aorx, /*typeOther:*/FindOptionSet_ainorxz.Active_aorx_long, /*l:*/FindOptionSet_ailnorz.Active_alor, /*typeSymlink:*/FindOptionSet_ailnorz.Active_alor_long,
            false,
		/*active:*/FindOption.regex, FindOption.timeAccess, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}.
     */
    Active_arz(
		/*i:*/Active_airz, /*ignoreCase:*/Active_airz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_anrz, /*timeNewer:*/Active_anrz_long, /*o:*/Active_aorz, /*timeOlder:*/Active_aorz_long, /*d:*/FindOptionSet_adinorz.Active_adrz, /*typeDirectory:*/FindOptionSet_adinorz.Active_adrz_long, /*f:*/FindOptionSet_afinorz.Active_afrz, /*typeFile:*/FindOptionSet_afinorz.Active_afrz_long, /*x:*/FindOptionSet_ainorxz.Active_arxz, /*typeOther:*/FindOptionSet_ainorxz.Active_arxz_long, /*l:*/FindOptionSet_ailnorz.Active_alrz, /*typeSymlink:*/FindOptionSet_ailnorz.Active_alrz_long,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeAccess
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}.
     */
    Active_arz_long(
		/*i:*/Active_airz, /*ignoreCase:*/Active_airz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_anrz, /*timeNewer:*/Active_anrz_long, /*o:*/Active_aorz, /*timeOlder:*/Active_aorz_long, /*d:*/FindOptionSet_adinorz.Active_adrz, /*typeDirectory:*/FindOptionSet_adinorz.Active_adrz_long, /*f:*/FindOptionSet_afinorz.Active_afrz, /*typeFile:*/FindOptionSet_afinorz.Active_afrz_long, /*x:*/FindOptionSet_ainorxz.Active_arxz, /*typeOther:*/FindOptionSet_ainorxz.Active_arxz_long, /*l:*/FindOptionSet_ailnorz.Active_alrz, /*typeSymlink:*/FindOptionSet_ailnorz.Active_alrz_long,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeAccess
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeAccess a}, {@link #timeNewer n}.
     */
    Active_ain(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ainz, /*print0:*/Active_ainz_long, /*r:*/Active_ainr, /*regex:*/Active_ainr_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_aino, /*timeOlder:*/Active_aino_long, /*d:*/FindOptionSet_adinorz.Active_adin, /*typeDirectory:*/FindOptionSet_adinorz.Active_adin_long, /*f:*/FindOptionSet_afinorz.Active_afin, /*typeFile:*/FindOptionSet_afinorz.Active_afin_long, /*x:*/FindOptionSet_ainorxz.Active_ainx, /*typeOther:*/FindOptionSet_ainorxz.Active_ainx_long, /*l:*/FindOptionSet_ailnorz.Active_ailn, /*typeSymlink:*/FindOptionSet_ailnorz.Active_ailn_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeAccess, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeAccess a}, {@link #timeNewer n}.
     */
    Active_ain_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ainz, /*print0:*/Active_ainz_long, /*r:*/Active_ainr, /*regex:*/Active_ainr_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_aino, /*timeOlder:*/Active_aino_long, /*d:*/FindOptionSet_adinorz.Active_adin, /*typeDirectory:*/FindOptionSet_adinorz.Active_adin_long, /*f:*/FindOptionSet_afinorz.Active_afin, /*typeFile:*/FindOptionSet_afinorz.Active_afin_long, /*x:*/FindOptionSet_ainorxz.Active_ainx, /*typeOther:*/FindOptionSet_ainorxz.Active_ainx_long, /*l:*/FindOptionSet_ailnorz.Active_ailn, /*typeSymlink:*/FindOptionSet_ailnorz.Active_ailn_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeAccess, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeAccess a}, {@link #timeOlder o}.
     */
    Active_aio(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_aioz, /*print0:*/Active_aioz_long, /*r:*/Active_aior, /*regex:*/Active_aior_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_aino, /*timeNewer:*/Active_aino_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_adinorz.Active_adio, /*typeDirectory:*/FindOptionSet_adinorz.Active_adio_long, /*f:*/FindOptionSet_afinorz.Active_afio, /*typeFile:*/FindOptionSet_afinorz.Active_afio_long, /*x:*/FindOptionSet_ainorxz.Active_aiox, /*typeOther:*/FindOptionSet_ainorxz.Active_aiox_long, /*l:*/FindOptionSet_ailnorz.Active_ailo, /*typeSymlink:*/FindOptionSet_ailnorz.Active_ailo_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeAccess, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeAccess a}, {@link #timeOlder o}.
     */
    Active_aio_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_aioz, /*print0:*/Active_aioz_long, /*r:*/Active_aior, /*regex:*/Active_aior_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_aino, /*timeNewer:*/Active_aino_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_adinorz.Active_adio, /*typeDirectory:*/FindOptionSet_adinorz.Active_adio_long, /*f:*/FindOptionSet_afinorz.Active_afio, /*typeFile:*/FindOptionSet_afinorz.Active_afio_long, /*x:*/FindOptionSet_ainorxz.Active_aiox, /*typeOther:*/FindOptionSet_ainorxz.Active_aiox_long, /*l:*/FindOptionSet_ailnorz.Active_ailo, /*typeSymlink:*/FindOptionSet_ailnorz.Active_ailo_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeAccess, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeAccess a}.
     */
    Active_aiz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_airz, /*regex:*/Active_airz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ainz, /*timeNewer:*/Active_ainz_long, /*o:*/Active_aioz, /*timeOlder:*/Active_aioz_long, /*d:*/FindOptionSet_adinorz.Active_adiz, /*typeDirectory:*/FindOptionSet_adinorz.Active_adiz_long, /*f:*/FindOptionSet_afinorz.Active_afiz, /*typeFile:*/FindOptionSet_afinorz.Active_afiz_long, /*x:*/FindOptionSet_ainorxz.Active_aixz, /*typeOther:*/FindOptionSet_ainorxz.Active_aixz_long, /*l:*/FindOptionSet_ailnorz.Active_ailz, /*typeSymlink:*/FindOptionSet_ailnorz.Active_ailz_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeAccess
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeAccess a}.
     */
    Active_aiz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_airz, /*regex:*/Active_airz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ainz, /*timeNewer:*/Active_ainz_long, /*o:*/Active_aioz, /*timeOlder:*/Active_aioz_long, /*d:*/FindOptionSet_adinorz.Active_adiz, /*typeDirectory:*/FindOptionSet_adinorz.Active_adiz_long, /*f:*/FindOptionSet_afinorz.Active_afiz, /*typeFile:*/FindOptionSet_afinorz.Active_afiz_long, /*x:*/FindOptionSet_ainorxz.Active_aixz, /*typeOther:*/FindOptionSet_ainorxz.Active_aixz_long, /*l:*/FindOptionSet_ailnorz.Active_ailz, /*typeSymlink:*/FindOptionSet_ailnorz.Active_ailz_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeAccess
    ),
    /**
     * Option set with the following active options: {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_ano(
		/*i:*/Active_aino, /*ignoreCase:*/Active_aino_long, /*z:*/Active_anoz, /*print0:*/Active_anoz_long, /*r:*/Active_anor, /*regex:*/Active_anor_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_adinorz.Active_adno, /*typeDirectory:*/FindOptionSet_adinorz.Active_adno_long, /*f:*/FindOptionSet_afinorz.Active_afno, /*typeFile:*/FindOptionSet_afinorz.Active_afno_long, /*x:*/FindOptionSet_ainorxz.Active_anox, /*typeOther:*/FindOptionSet_ainorxz.Active_anox_long, /*l:*/FindOptionSet_ailnorz.Active_alno, /*typeSymlink:*/FindOptionSet_ailnorz.Active_alno_long,
            true,
		/*active:*/FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_ano_long(
		/*i:*/Active_aino, /*ignoreCase:*/Active_aino_long, /*z:*/Active_anoz, /*print0:*/Active_anoz_long, /*r:*/Active_anor, /*regex:*/Active_anor_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_adinorz.Active_adno, /*typeDirectory:*/FindOptionSet_adinorz.Active_adno_long, /*f:*/FindOptionSet_afinorz.Active_afno, /*typeFile:*/FindOptionSet_afinorz.Active_afno_long, /*x:*/FindOptionSet_ainorxz.Active_anox, /*typeOther:*/FindOptionSet_ainorxz.Active_anox_long, /*l:*/FindOptionSet_ailnorz.Active_alno, /*typeSymlink:*/FindOptionSet_ailnorz.Active_alno_long,
            false,
		/*active:*/FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeAccess a}, {@link #timeNewer n}.
     */
    Active_anz(
		/*i:*/Active_ainz, /*ignoreCase:*/Active_ainz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_anrz, /*regex:*/Active_anrz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_anoz, /*timeOlder:*/Active_anoz_long, /*d:*/FindOptionSet_adinorz.Active_adnz, /*typeDirectory:*/FindOptionSet_adinorz.Active_adnz_long, /*f:*/FindOptionSet_afinorz.Active_afnz, /*typeFile:*/FindOptionSet_afinorz.Active_afnz_long, /*x:*/FindOptionSet_ainorxz.Active_anxz, /*typeOther:*/FindOptionSet_ainorxz.Active_anxz_long, /*l:*/FindOptionSet_ailnorz.Active_alnz, /*typeSymlink:*/FindOptionSet_ailnorz.Active_alnz_long,
            true,
		/*active:*/FindOption.print0, FindOption.timeAccess, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeAccess a}, {@link #timeNewer n}.
     */
    Active_anz_long(
		/*i:*/Active_ainz, /*ignoreCase:*/Active_ainz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_anrz, /*regex:*/Active_anrz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_anoz, /*timeOlder:*/Active_anoz_long, /*d:*/FindOptionSet_adinorz.Active_adnz, /*typeDirectory:*/FindOptionSet_adinorz.Active_adnz_long, /*f:*/FindOptionSet_afinorz.Active_afnz, /*typeFile:*/FindOptionSet_afinorz.Active_afnz_long, /*x:*/FindOptionSet_ainorxz.Active_anxz, /*typeOther:*/FindOptionSet_ainorxz.Active_anxz_long, /*l:*/FindOptionSet_ailnorz.Active_alnz, /*typeSymlink:*/FindOptionSet_ailnorz.Active_alnz_long,
            false,
		/*active:*/FindOption.print0, FindOption.timeAccess, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeAccess a}, {@link #timeOlder o}.
     */
    Active_aoz(
		/*i:*/Active_aioz, /*ignoreCase:*/Active_aioz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_aorz, /*regex:*/Active_aorz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_anoz, /*timeNewer:*/Active_anoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_adinorz.Active_adoz, /*typeDirectory:*/FindOptionSet_adinorz.Active_adoz_long, /*f:*/FindOptionSet_afinorz.Active_afoz, /*typeFile:*/FindOptionSet_afinorz.Active_afoz_long, /*x:*/FindOptionSet_ainorxz.Active_aoxz, /*typeOther:*/FindOptionSet_ainorxz.Active_aoxz_long, /*l:*/FindOptionSet_ailnorz.Active_aloz, /*typeSymlink:*/FindOptionSet_ailnorz.Active_aloz_long,
            true,
		/*active:*/FindOption.print0, FindOption.timeAccess, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeAccess a}, {@link #timeOlder o}.
     */
    Active_aoz_long(
		/*i:*/Active_aioz, /*ignoreCase:*/Active_aioz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_aorz, /*regex:*/Active_aorz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_anoz, /*timeNewer:*/Active_anoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_adinorz.Active_adoz, /*typeDirectory:*/FindOptionSet_adinorz.Active_adoz_long, /*f:*/FindOptionSet_afinorz.Active_afoz, /*typeFile:*/FindOptionSet_afinorz.Active_afoz_long, /*x:*/FindOptionSet_ainorxz.Active_aoxz, /*typeOther:*/FindOptionSet_ainorxz.Active_aoxz_long, /*l:*/FindOptionSet_ailnorz.Active_aloz, /*typeSymlink:*/FindOptionSet_ailnorz.Active_aloz_long,
            false,
		/*active:*/FindOption.print0, FindOption.timeAccess, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeAccess a}.
     */
    Active_ar(
		/*i:*/Active_air, /*ignoreCase:*/Active_air_long, /*z:*/Active_arz, /*print0:*/Active_arz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_anr, /*timeNewer:*/Active_anr_long, /*o:*/Active_aor, /*timeOlder:*/Active_aor_long, /*d:*/FindOptionSet_adinorz.Active_adr, /*typeDirectory:*/FindOptionSet_adinorz.Active_adr_long, /*f:*/FindOptionSet_afinorz.Active_afr, /*typeFile:*/FindOptionSet_afinorz.Active_afr_long, /*x:*/FindOptionSet_ainorxz.Active_arx, /*typeOther:*/FindOptionSet_ainorxz.Active_arx_long, /*l:*/FindOptionSet_ailnorz.Active_alr, /*typeSymlink:*/FindOptionSet_ailnorz.Active_alr_long,
            true,
		/*active:*/FindOption.regex, FindOption.timeAccess
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeAccess a}.
     */
    Active_ar_long(
		/*i:*/Active_air, /*ignoreCase:*/Active_air_long, /*z:*/Active_arz, /*print0:*/Active_arz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_anr, /*timeNewer:*/Active_anr_long, /*o:*/Active_aor, /*timeOlder:*/Active_aor_long, /*d:*/FindOptionSet_adinorz.Active_adr, /*typeDirectory:*/FindOptionSet_adinorz.Active_adr_long, /*f:*/FindOptionSet_afinorz.Active_afr, /*typeFile:*/FindOptionSet_afinorz.Active_afr_long, /*x:*/FindOptionSet_ainorxz.Active_arx, /*typeOther:*/FindOptionSet_ainorxz.Active_arx_long, /*l:*/FindOptionSet_ailnorz.Active_alr, /*typeSymlink:*/FindOptionSet_ailnorz.Active_alr_long,
            false,
		/*active:*/FindOption.regex, FindOption.timeAccess
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeAccess a}.
     */
    Active_ai(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_aiz, /*print0:*/Active_aiz_long, /*r:*/Active_air, /*regex:*/Active_air_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ain, /*timeNewer:*/Active_ain_long, /*o:*/Active_aio, /*timeOlder:*/Active_aio_long, /*d:*/FindOptionSet_adinorz.Active_adi, /*typeDirectory:*/FindOptionSet_adinorz.Active_adi_long, /*f:*/FindOptionSet_afinorz.Active_afi, /*typeFile:*/FindOptionSet_afinorz.Active_afi_long, /*x:*/FindOptionSet_ainorxz.Active_aix, /*typeOther:*/FindOptionSet_ainorxz.Active_aix_long, /*l:*/FindOptionSet_ailnorz.Active_ail, /*typeSymlink:*/FindOptionSet_ailnorz.Active_ail_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeAccess
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeAccess a}.
     */
    Active_ai_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_aiz, /*print0:*/Active_aiz_long, /*r:*/Active_air, /*regex:*/Active_air_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ain, /*timeNewer:*/Active_ain_long, /*o:*/Active_aio, /*timeOlder:*/Active_aio_long, /*d:*/FindOptionSet_adinorz.Active_adi, /*typeDirectory:*/FindOptionSet_adinorz.Active_adi_long, /*f:*/FindOptionSet_afinorz.Active_afi, /*typeFile:*/FindOptionSet_afinorz.Active_afi_long, /*x:*/FindOptionSet_ainorxz.Active_aix, /*typeOther:*/FindOptionSet_ainorxz.Active_aix_long, /*l:*/FindOptionSet_ailnorz.Active_ail, /*typeSymlink:*/FindOptionSet_ailnorz.Active_ail_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeAccess
    ),
    /**
     * Option set with the following active options: {@link #timeAccess a}, {@link #timeNewer n}.
     */
    Active_an(
		/*i:*/Active_ain, /*ignoreCase:*/Active_ain_long, /*z:*/Active_anz, /*print0:*/Active_anz_long, /*r:*/Active_anr, /*regex:*/Active_anr_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_ano, /*timeOlder:*/Active_ano_long, /*d:*/FindOptionSet_adinorz.Active_adn, /*typeDirectory:*/FindOptionSet_adinorz.Active_adn_long, /*f:*/FindOptionSet_afinorz.Active_afn, /*typeFile:*/FindOptionSet_afinorz.Active_afn_long, /*x:*/FindOptionSet_ainorxz.Active_anx, /*typeOther:*/FindOptionSet_ainorxz.Active_anx_long, /*l:*/FindOptionSet_ailnorz.Active_aln, /*typeSymlink:*/FindOptionSet_ailnorz.Active_aln_long,
            true,
		/*active:*/FindOption.timeAccess, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #timeAccess a}, {@link #timeNewer n}.
     */
    Active_an_long(
		/*i:*/Active_ain, /*ignoreCase:*/Active_ain_long, /*z:*/Active_anz, /*print0:*/Active_anz_long, /*r:*/Active_anr, /*regex:*/Active_anr_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_ano, /*timeOlder:*/Active_ano_long, /*d:*/FindOptionSet_adinorz.Active_adn, /*typeDirectory:*/FindOptionSet_adinorz.Active_adn_long, /*f:*/FindOptionSet_afinorz.Active_afn, /*typeFile:*/FindOptionSet_afinorz.Active_afn_long, /*x:*/FindOptionSet_ainorxz.Active_anx, /*typeOther:*/FindOptionSet_ainorxz.Active_anx_long, /*l:*/FindOptionSet_ailnorz.Active_aln, /*typeSymlink:*/FindOptionSet_ailnorz.Active_aln_long,
            false,
		/*active:*/FindOption.timeAccess, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #timeAccess a}, {@link #timeOlder o}.
     */
    Active_ao(
		/*i:*/Active_aio, /*ignoreCase:*/Active_aio_long, /*z:*/Active_aoz, /*print0:*/Active_aoz_long, /*r:*/Active_aor, /*regex:*/Active_aor_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ano, /*timeNewer:*/Active_ano_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_adinorz.Active_ado, /*typeDirectory:*/FindOptionSet_adinorz.Active_ado_long, /*f:*/FindOptionSet_afinorz.Active_afo, /*typeFile:*/FindOptionSet_afinorz.Active_afo_long, /*x:*/FindOptionSet_ainorxz.Active_aox, /*typeOther:*/FindOptionSet_ainorxz.Active_aox_long, /*l:*/FindOptionSet_ailnorz.Active_alo, /*typeSymlink:*/FindOptionSet_ailnorz.Active_alo_long,
            true,
		/*active:*/FindOption.timeAccess, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #timeAccess a}, {@link #timeOlder o}.
     */
    Active_ao_long(
		/*i:*/Active_aio, /*ignoreCase:*/Active_aio_long, /*z:*/Active_aoz, /*print0:*/Active_aoz_long, /*r:*/Active_aor, /*regex:*/Active_aor_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ano, /*timeNewer:*/Active_ano_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_adinorz.Active_ado, /*typeDirectory:*/FindOptionSet_adinorz.Active_ado_long, /*f:*/FindOptionSet_afinorz.Active_afo, /*typeFile:*/FindOptionSet_afinorz.Active_afo_long, /*x:*/FindOptionSet_ainorxz.Active_aox, /*typeOther:*/FindOptionSet_ainorxz.Active_aox_long, /*l:*/FindOptionSet_ailnorz.Active_alo, /*typeSymlink:*/FindOptionSet_ailnorz.Active_alo_long,
            false,
		/*active:*/FindOption.timeAccess, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeAccess a}.
     */
    Active_az(
		/*i:*/Active_aiz, /*ignoreCase:*/Active_aiz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_arz, /*regex:*/Active_arz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_anz, /*timeNewer:*/Active_anz_long, /*o:*/Active_aoz, /*timeOlder:*/Active_aoz_long, /*d:*/FindOptionSet_adinorz.Active_adz, /*typeDirectory:*/FindOptionSet_adinorz.Active_adz_long, /*f:*/FindOptionSet_afinorz.Active_afz, /*typeFile:*/FindOptionSet_afinorz.Active_afz_long, /*x:*/FindOptionSet_ainorxz.Active_axz, /*typeOther:*/FindOptionSet_ainorxz.Active_axz_long, /*l:*/FindOptionSet_ailnorz.Active_alz, /*typeSymlink:*/FindOptionSet_ailnorz.Active_alz_long,
            true,
		/*active:*/FindOption.print0, FindOption.timeAccess
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeAccess a}.
     */
    Active_az_long(
		/*i:*/Active_aiz, /*ignoreCase:*/Active_aiz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_arz, /*regex:*/Active_arz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_anz, /*timeNewer:*/Active_anz_long, /*o:*/Active_aoz, /*timeOlder:*/Active_aoz_long, /*d:*/FindOptionSet_adinorz.Active_adz, /*typeDirectory:*/FindOptionSet_adinorz.Active_adz_long, /*f:*/FindOptionSet_afinorz.Active_afz, /*typeFile:*/FindOptionSet_afinorz.Active_afz_long, /*x:*/FindOptionSet_ainorxz.Active_axz, /*typeOther:*/FindOptionSet_ainorxz.Active_axz_long, /*l:*/FindOptionSet_ailnorz.Active_alz, /*typeSymlink:*/FindOptionSet_ailnorz.Active_alz_long,
            false,
		/*active:*/FindOption.print0, FindOption.timeAccess
    ),
    /**
     * Option set with the following active options: {@link #timeAccess a}.
     */
    Active_a(
		/*i:*/Active_ai, /*ignoreCase:*/Active_ai_long, /*z:*/Active_az, /*print0:*/Active_az_long, /*r:*/Active_ar, /*regex:*/Active_ar_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_an, /*timeNewer:*/Active_an_long, /*o:*/Active_ao, /*timeOlder:*/Active_ao_long, /*d:*/FindOptionSet_adinorz.Active_ad, /*typeDirectory:*/FindOptionSet_adinorz.Active_ad_long, /*f:*/FindOptionSet_afinorz.Active_af, /*typeFile:*/FindOptionSet_afinorz.Active_af_long, /*x:*/FindOptionSet_ainorxz.Active_ax, /*typeOther:*/FindOptionSet_ainorxz.Active_ax_long, /*l:*/FindOptionSet_ailnorz.Active_al, /*typeSymlink:*/FindOptionSet_ailnorz.Active_al_long,
            true,
		/*active:*/FindOption.timeAccess
    ),
    /**
     * Option set with the following active options: {@link #timeAccess a}.
     */
    Active_a_long(
		/*i:*/Active_ai, /*ignoreCase:*/Active_ai_long, /*z:*/Active_az, /*print0:*/Active_az_long, /*r:*/Active_ar, /*regex:*/Active_ar_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_an, /*timeNewer:*/Active_an_long, /*o:*/Active_ao, /*timeOlder:*/Active_ao_long, /*d:*/FindOptionSet_adinorz.Active_ad, /*typeDirectory:*/FindOptionSet_adinorz.Active_ad_long, /*f:*/FindOptionSet_afinorz.Active_af, /*typeFile:*/FindOptionSet_afinorz.Active_af_long, /*x:*/FindOptionSet_ainorxz.Active_ax, /*typeOther:*/FindOptionSet_ainorxz.Active_ax_long, /*l:*/FindOptionSet_ailnorz.Active_al, /*typeSymlink:*/FindOptionSet_ailnorz.Active_al_long,
            false,
		/*active:*/FindOption.timeAccess
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
    public final FindOptionSet_adfilnorxz i;
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
    public final FindOptionSet_adfilnorxz ignoreCase;
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
    public final FindOptionSet_adfilnorxz z;
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
    public final FindOptionSet_adfilnorxz print0;
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
    public final FindOptionSet_adfilnorxz r;
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
    public final FindOptionSet_adfilnorxz regex;
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
    public final FindOptionSet_adfilnorxz a;
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
    public final FindOptionSet_adfilnorxz timeAccess;
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
    public final FindOptionSet_adfilnorxz n;
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
    public final FindOptionSet_adfilnorxz timeNewer;
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
    public final FindOptionSet_adfilnorxz o;
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
    public final FindOptionSet_adfilnorxz timeOlder;
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
    /**
     * Option {@code "-x"}: Consider only files that are neither of directory (d),
     * regular file (f) or symlink (l).
     * <p>
     * The option {@code "-x"} is equivalent to the {@code "--}{@link #typeOther typeOther}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-x"}. If the option {@code "-x"}
     * is already set, the field {@code x} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final FindOptionSet_ainorxz x;
    /**
     * Option {@code "--typeOther"}: Consider only files that are neither of directory (d),
     * regular file (f) or symlink (l).
     * <p>
     * The option {@code "--typeOther"} is equivalent to the {@code "-}{@link #x x}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--typeOther"}. If the option {@code "--typeOther"}
     * is already set, the field {@code typeOther} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final FindOptionSet_ainorxz typeOther;
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
    private FindOptionSet_adfilnorxz(
            FindOptionSet_adfilnorxz i, FindOptionSet_adfilnorxz ignoreCase, FindOptionSet_adfilnorxz z, FindOptionSet_adfilnorxz print0, FindOptionSet_adfilnorxz r, FindOptionSet_adfilnorxz regex, FindOptionSet_adfilnorxz a, FindOptionSet_adfilnorxz timeAccess, FindOptionSet_adfilnorxz n, FindOptionSet_adfilnorxz timeNewer, FindOptionSet_adfilnorxz o, FindOptionSet_adfilnorxz timeOlder, FindOptionSet_adinorz d, FindOptionSet_adinorz typeDirectory, FindOptionSet_afinorz f, FindOptionSet_afinorz typeFile, FindOptionSet_ainorxz x, FindOptionSet_ainorxz typeOther, FindOptionSet_ailnorz l, FindOptionSet_ailnorz typeSymlink,
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
        this.d = notNull(d);
        this.typeDirectory = notNull(typeDirectory);
        this.f = notNull(f);
        this.typeFile = notNull(typeFile);
        this.x = notNull(x);
        this.typeOther = notNull(typeOther);
        this.l = notNull(l);
        this.typeSymlink = notNull(typeSymlink);
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
     *    FindOptionSet_adfilnorxz.ignoreCase.z;
     * </pre>
     * uses acronyms, that is, this method always returns true for the above
     * set.
     * <p>
     * On the other hand, long option names are used and this method always
     * returns false for the set
     * <pre>
     *    FindOptionSet_adfilnorxz.i.print0;
     * </pre>
     * <p>
     * Note that a repeated option is <i>not</i> treated as the last set option.
     * For instance, the first and last option of the following set are
     * equivalent and acronyms are used:
     * <pre>
     *    FindOptionSet_adfilnorxz.i.z.ignoreCase;
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
