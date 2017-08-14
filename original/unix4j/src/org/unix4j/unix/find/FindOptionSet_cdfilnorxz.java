package org.unix4j.unix.find;

import org.unix4j.option.Option;
import org.unix4j.unix.Find;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Option sets for the {@link Find find} command with
 * the following options: {@link #i i}, {@link #z z}, {@link #r r}, {@link #c c}, {@link #n n}, {@link #o o}, {@link #d d}, {@link #f f}, {@link #x x}, {@link #l l}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Find#Options} should be used instead to specify command
 * options. See also {@link org.unix4j.unix.find.FindOptions} for more information.
 */
public enum FindOptionSet_cdfilnorxz implements FindOptions {
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_cinorz(
        /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_cdinorz.Active_cdinorz, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdinorz_long, /*f:*/FindOptionSet_cfinorz.Active_cfinorz, /*typeFile:*/FindOptionSet_cfinorz.Active_cfinorz_long, /*x:*/FindOptionSet_cinorxz.Active_cinorxz, /*typeOther:*/FindOptionSet_cinorxz.Active_cinorxz_long, /*l:*/FindOptionSet_cilnorz.Active_cilnorz, /*typeSymlink:*/FindOptionSet_cilnorz.Active_cilnorz_long,
            true,
        /*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_cinorz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_cdinorz.Active_cdinorz, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdinorz_long, /*f:*/FindOptionSet_cfinorz.Active_cfinorz, /*typeFile:*/FindOptionSet_cfinorz.Active_cfinorz_long, /*x:*/FindOptionSet_cinorxz.Active_cinorxz, /*typeOther:*/FindOptionSet_cinorxz.Active_cinorxz_long, /*l:*/FindOptionSet_cilnorz.Active_cilnorz, /*typeSymlink:*/FindOptionSet_cilnorz.Active_cilnorz_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_cinor(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cinorz, /*print0:*/Active_cinorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_cdinorz.Active_cdinor, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdinor_long, /*f:*/FindOptionSet_cfinorz.Active_cfinor, /*typeFile:*/FindOptionSet_cfinorz.Active_cfinor_long, /*x:*/FindOptionSet_cinorxz.Active_cinorx, /*typeOther:*/FindOptionSet_cinorxz.Active_cinorx_long, /*l:*/FindOptionSet_cilnorz.Active_cilnor, /*typeSymlink:*/FindOptionSet_cilnorz.Active_cilnor_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_cinor_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cinorz, /*print0:*/Active_cinorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_cdinorz.Active_cdinor, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdinor_long, /*f:*/FindOptionSet_cfinorz.Active_cfinor, /*typeFile:*/FindOptionSet_cfinorz.Active_cfinor_long, /*x:*/FindOptionSet_cinorxz.Active_cinorx, /*typeOther:*/FindOptionSet_cinorxz.Active_cinorx_long, /*l:*/FindOptionSet_cilnorz.Active_cilnor, /*typeSymlink:*/FindOptionSet_cilnorz.Active_cilnor_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}.
     */
    Active_cinrz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cinorz, /*timeOlder:*/Active_cinorz_long, /*d:*/FindOptionSet_cdinorz.Active_cdinrz, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdinrz_long, /*f:*/FindOptionSet_cfinorz.Active_cfinrz, /*typeFile:*/FindOptionSet_cfinorz.Active_cfinrz_long, /*x:*/FindOptionSet_cinorxz.Active_cinrxz, /*typeOther:*/FindOptionSet_cinorxz.Active_cinrxz_long, /*l:*/FindOptionSet_cilnorz.Active_cilnrz, /*typeSymlink:*/FindOptionSet_cilnorz.Active_cilnrz_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}.
     */
    Active_cinrz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cinorz, /*timeOlder:*/Active_cinorz_long, /*d:*/FindOptionSet_cdinorz.Active_cdinrz, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdinrz_long, /*f:*/FindOptionSet_cfinorz.Active_cfinrz, /*typeFile:*/FindOptionSet_cfinorz.Active_cfinrz_long, /*x:*/FindOptionSet_cinorxz.Active_cinrxz, /*typeOther:*/FindOptionSet_cinorxz.Active_cinrxz_long, /*l:*/FindOptionSet_cilnorz.Active_cilnrz, /*typeSymlink:*/FindOptionSet_cilnorz.Active_cilnrz_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeOlder o}.
     */
    Active_ciorz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cinorz, /*timeNewer:*/Active_cinorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_cdinorz.Active_cdiorz, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdiorz_long, /*f:*/FindOptionSet_cfinorz.Active_cfiorz, /*typeFile:*/FindOptionSet_cfinorz.Active_cfiorz_long, /*x:*/FindOptionSet_cinorxz.Active_ciorxz, /*typeOther:*/FindOptionSet_cinorxz.Active_ciorxz_long, /*l:*/FindOptionSet_cilnorz.Active_cilorz, /*typeSymlink:*/FindOptionSet_cilnorz.Active_cilorz_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeOlder o}.
     */
    Active_ciorz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cinorz, /*timeNewer:*/Active_cinorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_cdinorz.Active_cdiorz, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdiorz_long, /*f:*/FindOptionSet_cfinorz.Active_cfiorz, /*typeFile:*/FindOptionSet_cfinorz.Active_cfiorz_long, /*x:*/FindOptionSet_cinorxz.Active_ciorxz, /*typeOther:*/FindOptionSet_cinorxz.Active_ciorxz_long, /*l:*/FindOptionSet_cilnorz.Active_cilorz, /*typeSymlink:*/FindOptionSet_cilnorz.Active_cilorz_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_cnorz(
		/*i:*/Active_cinorz, /*ignoreCase:*/Active_cinorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_cdinorz.Active_cdnorz, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdnorz_long, /*f:*/FindOptionSet_cfinorz.Active_cfnorz, /*typeFile:*/FindOptionSet_cfinorz.Active_cfnorz_long, /*x:*/FindOptionSet_cinorxz.Active_cnorxz, /*typeOther:*/FindOptionSet_cinorxz.Active_cnorxz_long, /*l:*/FindOptionSet_cilnorz.Active_clnorz, /*typeSymlink:*/FindOptionSet_cilnorz.Active_clnorz_long,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_cnorz_long(
		/*i:*/Active_cinorz, /*ignoreCase:*/Active_cinorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_cdinorz.Active_cdnorz, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdnorz_long, /*f:*/FindOptionSet_cfinorz.Active_cfnorz, /*typeFile:*/FindOptionSet_cfinorz.Active_cfnorz_long, /*x:*/FindOptionSet_cinorxz.Active_cnorxz, /*typeOther:*/FindOptionSet_cinorxz.Active_cnorxz_long, /*l:*/FindOptionSet_cilnorz.Active_clnorz, /*typeSymlink:*/FindOptionSet_cilnorz.Active_clnorz_long,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_cinoz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cinorz, /*regex:*/Active_cinorz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_cdinorz.Active_cdinoz, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdinoz_long, /*f:*/FindOptionSet_cfinorz.Active_cfinoz, /*typeFile:*/FindOptionSet_cfinorz.Active_cfinoz_long, /*x:*/FindOptionSet_cinorxz.Active_cinoxz, /*typeOther:*/FindOptionSet_cinorxz.Active_cinoxz_long, /*l:*/FindOptionSet_cilnorz.Active_cilnoz, /*typeSymlink:*/FindOptionSet_cilnorz.Active_cilnoz_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_cinoz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cinorz, /*regex:*/Active_cinorz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_cdinorz.Active_cdinoz, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdinoz_long, /*f:*/FindOptionSet_cfinorz.Active_cfinoz, /*typeFile:*/FindOptionSet_cfinorz.Active_cfinoz_long, /*x:*/FindOptionSet_cinorxz.Active_cinoxz, /*typeOther:*/FindOptionSet_cinorxz.Active_cinoxz_long, /*l:*/FindOptionSet_cilnorz.Active_cilnoz, /*typeSymlink:*/FindOptionSet_cilnorz.Active_cilnoz_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}.
     */
    Active_cinr(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cinrz, /*print0:*/Active_cinrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cinor, /*timeOlder:*/Active_cinor_long, /*d:*/FindOptionSet_cdinorz.Active_cdinr, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdinr_long, /*f:*/FindOptionSet_cfinorz.Active_cfinr, /*typeFile:*/FindOptionSet_cfinorz.Active_cfinr_long, /*x:*/FindOptionSet_cinorxz.Active_cinrx, /*typeOther:*/FindOptionSet_cinorxz.Active_cinrx_long, /*l:*/FindOptionSet_cilnorz.Active_cilnr, /*typeSymlink:*/FindOptionSet_cilnorz.Active_cilnr_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}.
     */
    Active_cinr_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cinrz, /*print0:*/Active_cinrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cinor, /*timeOlder:*/Active_cinor_long, /*d:*/FindOptionSet_cdinorz.Active_cdinr, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdinr_long, /*f:*/FindOptionSet_cfinorz.Active_cfinr, /*typeFile:*/FindOptionSet_cfinorz.Active_cfinr_long, /*x:*/FindOptionSet_cinorxz.Active_cinrx, /*typeOther:*/FindOptionSet_cinorxz.Active_cinrx_long, /*l:*/FindOptionSet_cilnorz.Active_cilnr, /*typeSymlink:*/FindOptionSet_cilnorz.Active_cilnr_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeCreate c}, {@link #timeOlder o}.
     */
    Active_cior(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ciorz, /*print0:*/Active_ciorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cinor, /*timeNewer:*/Active_cinor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_cdinorz.Active_cdior, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdior_long, /*f:*/FindOptionSet_cfinorz.Active_cfior, /*typeFile:*/FindOptionSet_cfinorz.Active_cfior_long, /*x:*/FindOptionSet_cinorxz.Active_ciorx, /*typeOther:*/FindOptionSet_cinorxz.Active_ciorx_long, /*l:*/FindOptionSet_cilnorz.Active_cilor, /*typeSymlink:*/FindOptionSet_cilnorz.Active_cilor_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeCreate, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeCreate c}, {@link #timeOlder o}.
     */
    Active_cior_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ciorz, /*print0:*/Active_ciorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cinor, /*timeNewer:*/Active_cinor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_cdinorz.Active_cdior, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdior_long, /*f:*/FindOptionSet_cfinorz.Active_cfior, /*typeFile:*/FindOptionSet_cfinorz.Active_cfior_long, /*x:*/FindOptionSet_cinorxz.Active_ciorx, /*typeOther:*/FindOptionSet_cinorxz.Active_ciorx_long, /*l:*/FindOptionSet_cilnorz.Active_cilor, /*typeSymlink:*/FindOptionSet_cilnorz.Active_cilor_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeCreate, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}.
     */
    Active_cirz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cinrz, /*timeNewer:*/Active_cinrz_long, /*o:*/Active_ciorz, /*timeOlder:*/Active_ciorz_long, /*d:*/FindOptionSet_cdinorz.Active_cdirz, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdirz_long, /*f:*/FindOptionSet_cfinorz.Active_cfirz, /*typeFile:*/FindOptionSet_cfinorz.Active_cfirz_long, /*x:*/FindOptionSet_cinorxz.Active_cirxz, /*typeOther:*/FindOptionSet_cinorxz.Active_cirxz_long, /*l:*/FindOptionSet_cilnorz.Active_cilrz, /*typeSymlink:*/FindOptionSet_cilnorz.Active_cilrz_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeCreate
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}.
     */
    Active_cirz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cinrz, /*timeNewer:*/Active_cinrz_long, /*o:*/Active_ciorz, /*timeOlder:*/Active_ciorz_long, /*d:*/FindOptionSet_cdinorz.Active_cdirz, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdirz_long, /*f:*/FindOptionSet_cfinorz.Active_cfirz, /*typeFile:*/FindOptionSet_cfinorz.Active_cfirz_long, /*x:*/FindOptionSet_cinorxz.Active_cirxz, /*typeOther:*/FindOptionSet_cinorxz.Active_cirxz_long, /*l:*/FindOptionSet_cilnorz.Active_cilrz, /*typeSymlink:*/FindOptionSet_cilnorz.Active_cilrz_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeCreate
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_cnor(
		/*i:*/Active_cinor, /*ignoreCase:*/Active_cinor_long, /*z:*/Active_cnorz, /*print0:*/Active_cnorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_cdinorz.Active_cdnor, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdnor_long, /*f:*/FindOptionSet_cfinorz.Active_cfnor, /*typeFile:*/FindOptionSet_cfinorz.Active_cfnor_long, /*x:*/FindOptionSet_cinorxz.Active_cnorx, /*typeOther:*/FindOptionSet_cinorxz.Active_cnorx_long, /*l:*/FindOptionSet_cilnorz.Active_clnor, /*typeSymlink:*/FindOptionSet_cilnorz.Active_clnor_long,
            true,
		/*active:*/FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_cnor_long(
		/*i:*/Active_cinor, /*ignoreCase:*/Active_cinor_long, /*z:*/Active_cnorz, /*print0:*/Active_cnorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_cdinorz.Active_cdnor, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdnor_long, /*f:*/FindOptionSet_cfinorz.Active_cfnor, /*typeFile:*/FindOptionSet_cfinorz.Active_cfnor_long, /*x:*/FindOptionSet_cinorxz.Active_cnorx, /*typeOther:*/FindOptionSet_cinorxz.Active_cnorx_long, /*l:*/FindOptionSet_cilnorz.Active_clnor, /*typeSymlink:*/FindOptionSet_cilnorz.Active_clnor_long,
            false,
		/*active:*/FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}.
     */
    Active_cnrz(
		/*i:*/Active_cinrz, /*ignoreCase:*/Active_cinrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cnorz, /*timeOlder:*/Active_cnorz_long, /*d:*/FindOptionSet_cdinorz.Active_cdnrz, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdnrz_long, /*f:*/FindOptionSet_cfinorz.Active_cfnrz, /*typeFile:*/FindOptionSet_cfinorz.Active_cfnrz_long, /*x:*/FindOptionSet_cinorxz.Active_cnrxz, /*typeOther:*/FindOptionSet_cinorxz.Active_cnrxz_long, /*l:*/FindOptionSet_cilnorz.Active_clnrz, /*typeSymlink:*/FindOptionSet_cilnorz.Active_clnrz_long,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}.
     */
    Active_cnrz_long(
		/*i:*/Active_cinrz, /*ignoreCase:*/Active_cinrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cnorz, /*timeOlder:*/Active_cnorz_long, /*d:*/FindOptionSet_cdinorz.Active_cdnrz, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdnrz_long, /*f:*/FindOptionSet_cfinorz.Active_cfnrz, /*typeFile:*/FindOptionSet_cfinorz.Active_cfnrz_long, /*x:*/FindOptionSet_cinorxz.Active_cnrxz, /*typeOther:*/FindOptionSet_cinorxz.Active_cnrxz_long, /*l:*/FindOptionSet_cilnorz.Active_clnrz, /*typeSymlink:*/FindOptionSet_cilnorz.Active_clnrz_long,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeOlder o}.
     */
    Active_corz(
		/*i:*/Active_ciorz, /*ignoreCase:*/Active_ciorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cnorz, /*timeNewer:*/Active_cnorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_cdinorz.Active_cdorz, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdorz_long, /*f:*/FindOptionSet_cfinorz.Active_cforz, /*typeFile:*/FindOptionSet_cfinorz.Active_cforz_long, /*x:*/FindOptionSet_cinorxz.Active_corxz, /*typeOther:*/FindOptionSet_cinorxz.Active_corxz_long, /*l:*/FindOptionSet_cilnorz.Active_clorz, /*typeSymlink:*/FindOptionSet_cilnorz.Active_clorz_long,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeOlder o}.
     */
    Active_corz_long(
		/*i:*/Active_ciorz, /*ignoreCase:*/Active_ciorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cnorz, /*timeNewer:*/Active_cnorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_cdinorz.Active_cdorz, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdorz_long, /*f:*/FindOptionSet_cfinorz.Active_cforz, /*typeFile:*/FindOptionSet_cfinorz.Active_cforz_long, /*x:*/FindOptionSet_cinorxz.Active_corxz, /*typeOther:*/FindOptionSet_cinorxz.Active_corxz_long, /*l:*/FindOptionSet_cilnorz.Active_clorz, /*typeSymlink:*/FindOptionSet_cilnorz.Active_clorz_long,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_cino(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cinoz, /*print0:*/Active_cinoz_long, /*r:*/Active_cinor, /*regex:*/Active_cinor_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_cdinorz.Active_cdino, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdino_long, /*f:*/FindOptionSet_cfinorz.Active_cfino, /*typeFile:*/FindOptionSet_cfinorz.Active_cfino_long, /*x:*/FindOptionSet_cinorxz.Active_cinox, /*typeOther:*/FindOptionSet_cinorxz.Active_cinox_long, /*l:*/FindOptionSet_cilnorz.Active_cilno, /*typeSymlink:*/FindOptionSet_cilnorz.Active_cilno_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_cino_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cinoz, /*print0:*/Active_cinoz_long, /*r:*/Active_cinor, /*regex:*/Active_cinor_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_cdinorz.Active_cdino, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdino_long, /*f:*/FindOptionSet_cfinorz.Active_cfino, /*typeFile:*/FindOptionSet_cfinorz.Active_cfino_long, /*x:*/FindOptionSet_cinorxz.Active_cinox, /*typeOther:*/FindOptionSet_cinorxz.Active_cinox_long, /*l:*/FindOptionSet_cilnorz.Active_cilno, /*typeSymlink:*/FindOptionSet_cilnorz.Active_cilno_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeCreate c}, {@link #timeNewer n}.
     */
    Active_cinz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cinrz, /*regex:*/Active_cinrz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cinoz, /*timeOlder:*/Active_cinoz_long, /*d:*/FindOptionSet_cdinorz.Active_cdinz, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdinz_long, /*f:*/FindOptionSet_cfinorz.Active_cfinz, /*typeFile:*/FindOptionSet_cfinorz.Active_cfinz_long, /*x:*/FindOptionSet_cinorxz.Active_cinxz, /*typeOther:*/FindOptionSet_cinorxz.Active_cinxz_long, /*l:*/FindOptionSet_cilnorz.Active_cilnz, /*typeSymlink:*/FindOptionSet_cilnorz.Active_cilnz_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeCreate, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeCreate c}, {@link #timeNewer n}.
     */
    Active_cinz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cinrz, /*regex:*/Active_cinrz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cinoz, /*timeOlder:*/Active_cinoz_long, /*d:*/FindOptionSet_cdinorz.Active_cdinz, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdinz_long, /*f:*/FindOptionSet_cfinorz.Active_cfinz, /*typeFile:*/FindOptionSet_cfinorz.Active_cfinz_long, /*x:*/FindOptionSet_cinorxz.Active_cinxz, /*typeOther:*/FindOptionSet_cinorxz.Active_cinxz_long, /*l:*/FindOptionSet_cilnorz.Active_cilnz, /*typeSymlink:*/FindOptionSet_cilnorz.Active_cilnz_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeCreate, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeCreate c}, {@link #timeOlder o}.
     */
    Active_cioz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_ciorz, /*regex:*/Active_ciorz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cinoz, /*timeNewer:*/Active_cinoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_cdinorz.Active_cdioz, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdioz_long, /*f:*/FindOptionSet_cfinorz.Active_cfioz, /*typeFile:*/FindOptionSet_cfinorz.Active_cfioz_long, /*x:*/FindOptionSet_cinorxz.Active_cioxz, /*typeOther:*/FindOptionSet_cinorxz.Active_cioxz_long, /*l:*/FindOptionSet_cilnorz.Active_ciloz, /*typeSymlink:*/FindOptionSet_cilnorz.Active_ciloz_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeCreate, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeCreate c}, {@link #timeOlder o}.
     */
    Active_cioz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_ciorz, /*regex:*/Active_ciorz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cinoz, /*timeNewer:*/Active_cinoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_cdinorz.Active_cdioz, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdioz_long, /*f:*/FindOptionSet_cfinorz.Active_cfioz, /*typeFile:*/FindOptionSet_cfinorz.Active_cfioz_long, /*x:*/FindOptionSet_cinorxz.Active_cioxz, /*typeOther:*/FindOptionSet_cinorxz.Active_cioxz_long, /*l:*/FindOptionSet_cilnorz.Active_ciloz, /*typeSymlink:*/FindOptionSet_cilnorz.Active_ciloz_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeCreate, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_cnoz(
		/*i:*/Active_cinoz, /*ignoreCase:*/Active_cinoz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cnorz, /*regex:*/Active_cnorz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_cdinorz.Active_cdnoz, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdnoz_long, /*f:*/FindOptionSet_cfinorz.Active_cfnoz, /*typeFile:*/FindOptionSet_cfinorz.Active_cfnoz_long, /*x:*/FindOptionSet_cinorxz.Active_cnoxz, /*typeOther:*/FindOptionSet_cinorxz.Active_cnoxz_long, /*l:*/FindOptionSet_cilnorz.Active_clnoz, /*typeSymlink:*/FindOptionSet_cilnorz.Active_clnoz_long,
            true,
		/*active:*/FindOption.print0, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_cnoz_long(
		/*i:*/Active_cinoz, /*ignoreCase:*/Active_cinoz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cnorz, /*regex:*/Active_cnorz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_cdinorz.Active_cdnoz, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdnoz_long, /*f:*/FindOptionSet_cfinorz.Active_cfnoz, /*typeFile:*/FindOptionSet_cfinorz.Active_cfnoz_long, /*x:*/FindOptionSet_cinorxz.Active_cnoxz, /*typeOther:*/FindOptionSet_cinorxz.Active_cnoxz_long, /*l:*/FindOptionSet_cilnorz.Active_clnoz, /*typeSymlink:*/FindOptionSet_cilnorz.Active_clnoz_long,
            false,
		/*active:*/FindOption.print0, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeCreate c}.
     */
    Active_cir(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cirz, /*print0:*/Active_cirz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cinr, /*timeNewer:*/Active_cinr_long, /*o:*/Active_cior, /*timeOlder:*/Active_cior_long, /*d:*/FindOptionSet_cdinorz.Active_cdir, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdir_long, /*f:*/FindOptionSet_cfinorz.Active_cfir, /*typeFile:*/FindOptionSet_cfinorz.Active_cfir_long, /*x:*/FindOptionSet_cinorxz.Active_cirx, /*typeOther:*/FindOptionSet_cinorxz.Active_cirx_long, /*l:*/FindOptionSet_cilnorz.Active_cilr, /*typeSymlink:*/FindOptionSet_cilnorz.Active_cilr_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeCreate
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeCreate c}.
     */
    Active_cir_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cirz, /*print0:*/Active_cirz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cinr, /*timeNewer:*/Active_cinr_long, /*o:*/Active_cior, /*timeOlder:*/Active_cior_long, /*d:*/FindOptionSet_cdinorz.Active_cdir, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdir_long, /*f:*/FindOptionSet_cfinorz.Active_cfir, /*typeFile:*/FindOptionSet_cfinorz.Active_cfir_long, /*x:*/FindOptionSet_cinorxz.Active_cirx, /*typeOther:*/FindOptionSet_cinorxz.Active_cirx_long, /*l:*/FindOptionSet_cilnorz.Active_cilr, /*typeSymlink:*/FindOptionSet_cilnorz.Active_cilr_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeCreate
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}.
     */
    Active_cnr(
		/*i:*/Active_cinr, /*ignoreCase:*/Active_cinr_long, /*z:*/Active_cnrz, /*print0:*/Active_cnrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cnor, /*timeOlder:*/Active_cnor_long, /*d:*/FindOptionSet_cdinorz.Active_cdnr, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdnr_long, /*f:*/FindOptionSet_cfinorz.Active_cfnr, /*typeFile:*/FindOptionSet_cfinorz.Active_cfnr_long, /*x:*/FindOptionSet_cinorxz.Active_cnrx, /*typeOther:*/FindOptionSet_cinorxz.Active_cnrx_long, /*l:*/FindOptionSet_cilnorz.Active_clnr, /*typeSymlink:*/FindOptionSet_cilnorz.Active_clnr_long,
            true,
		/*active:*/FindOption.regex, FindOption.timeCreate, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}.
     */
    Active_cnr_long(
		/*i:*/Active_cinr, /*ignoreCase:*/Active_cinr_long, /*z:*/Active_cnrz, /*print0:*/Active_cnrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cnor, /*timeOlder:*/Active_cnor_long, /*d:*/FindOptionSet_cdinorz.Active_cdnr, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdnr_long, /*f:*/FindOptionSet_cfinorz.Active_cfnr, /*typeFile:*/FindOptionSet_cfinorz.Active_cfnr_long, /*x:*/FindOptionSet_cinorxz.Active_cnrx, /*typeOther:*/FindOptionSet_cinorxz.Active_cnrx_long, /*l:*/FindOptionSet_cilnorz.Active_clnr, /*typeSymlink:*/FindOptionSet_cilnorz.Active_clnr_long,
            false,
		/*active:*/FindOption.regex, FindOption.timeCreate, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeCreate c}, {@link #timeOlder o}.
     */
    Active_cor(
		/*i:*/Active_cior, /*ignoreCase:*/Active_cior_long, /*z:*/Active_corz, /*print0:*/Active_corz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cnor, /*timeNewer:*/Active_cnor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_cdinorz.Active_cdor, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdor_long, /*f:*/FindOptionSet_cfinorz.Active_cfor, /*typeFile:*/FindOptionSet_cfinorz.Active_cfor_long, /*x:*/FindOptionSet_cinorxz.Active_corx, /*typeOther:*/FindOptionSet_cinorxz.Active_corx_long, /*l:*/FindOptionSet_cilnorz.Active_clor, /*typeSymlink:*/FindOptionSet_cilnorz.Active_clor_long,
            true,
		/*active:*/FindOption.regex, FindOption.timeCreate, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeCreate c}, {@link #timeOlder o}.
     */
    Active_cor_long(
		/*i:*/Active_cior, /*ignoreCase:*/Active_cior_long, /*z:*/Active_corz, /*print0:*/Active_corz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cnor, /*timeNewer:*/Active_cnor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_cdinorz.Active_cdor, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdor_long, /*f:*/FindOptionSet_cfinorz.Active_cfor, /*typeFile:*/FindOptionSet_cfinorz.Active_cfor_long, /*x:*/FindOptionSet_cinorxz.Active_corx, /*typeOther:*/FindOptionSet_cinorxz.Active_corx_long, /*l:*/FindOptionSet_cilnorz.Active_clor, /*typeSymlink:*/FindOptionSet_cilnorz.Active_clor_long,
            false,
		/*active:*/FindOption.regex, FindOption.timeCreate, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}.
     */
    Active_crz(
		/*i:*/Active_cirz, /*ignoreCase:*/Active_cirz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cnrz, /*timeNewer:*/Active_cnrz_long, /*o:*/Active_corz, /*timeOlder:*/Active_corz_long, /*d:*/FindOptionSet_cdinorz.Active_cdrz, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdrz_long, /*f:*/FindOptionSet_cfinorz.Active_cfrz, /*typeFile:*/FindOptionSet_cfinorz.Active_cfrz_long, /*x:*/FindOptionSet_cinorxz.Active_crxz, /*typeOther:*/FindOptionSet_cinorxz.Active_crxz_long, /*l:*/FindOptionSet_cilnorz.Active_clrz, /*typeSymlink:*/FindOptionSet_cilnorz.Active_clrz_long,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeCreate
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}.
     */
    Active_crz_long(
		/*i:*/Active_cirz, /*ignoreCase:*/Active_cirz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cnrz, /*timeNewer:*/Active_cnrz_long, /*o:*/Active_corz, /*timeOlder:*/Active_corz_long, /*d:*/FindOptionSet_cdinorz.Active_cdrz, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdrz_long, /*f:*/FindOptionSet_cfinorz.Active_cfrz, /*typeFile:*/FindOptionSet_cfinorz.Active_cfrz_long, /*x:*/FindOptionSet_cinorxz.Active_crxz, /*typeOther:*/FindOptionSet_cinorxz.Active_crxz_long, /*l:*/FindOptionSet_cilnorz.Active_clrz, /*typeSymlink:*/FindOptionSet_cilnorz.Active_clrz_long,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeCreate
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeCreate c}, {@link #timeNewer n}.
     */
    Active_cin(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cinz, /*print0:*/Active_cinz_long, /*r:*/Active_cinr, /*regex:*/Active_cinr_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cino, /*timeOlder:*/Active_cino_long, /*d:*/FindOptionSet_cdinorz.Active_cdin, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdin_long, /*f:*/FindOptionSet_cfinorz.Active_cfin, /*typeFile:*/FindOptionSet_cfinorz.Active_cfin_long, /*x:*/FindOptionSet_cinorxz.Active_cinx, /*typeOther:*/FindOptionSet_cinorxz.Active_cinx_long, /*l:*/FindOptionSet_cilnorz.Active_ciln, /*typeSymlink:*/FindOptionSet_cilnorz.Active_ciln_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeCreate, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeCreate c}, {@link #timeNewer n}.
     */
    Active_cin_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cinz, /*print0:*/Active_cinz_long, /*r:*/Active_cinr, /*regex:*/Active_cinr_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cino, /*timeOlder:*/Active_cino_long, /*d:*/FindOptionSet_cdinorz.Active_cdin, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdin_long, /*f:*/FindOptionSet_cfinorz.Active_cfin, /*typeFile:*/FindOptionSet_cfinorz.Active_cfin_long, /*x:*/FindOptionSet_cinorxz.Active_cinx, /*typeOther:*/FindOptionSet_cinorxz.Active_cinx_long, /*l:*/FindOptionSet_cilnorz.Active_ciln, /*typeSymlink:*/FindOptionSet_cilnorz.Active_ciln_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeCreate, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeCreate c}, {@link #timeOlder o}.
     */
    Active_cio(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cioz, /*print0:*/Active_cioz_long, /*r:*/Active_cior, /*regex:*/Active_cior_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cino, /*timeNewer:*/Active_cino_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_cdinorz.Active_cdio, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdio_long, /*f:*/FindOptionSet_cfinorz.Active_cfio, /*typeFile:*/FindOptionSet_cfinorz.Active_cfio_long, /*x:*/FindOptionSet_cinorxz.Active_ciox, /*typeOther:*/FindOptionSet_cinorxz.Active_ciox_long, /*l:*/FindOptionSet_cilnorz.Active_cilo, /*typeSymlink:*/FindOptionSet_cilnorz.Active_cilo_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeCreate, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeCreate c}, {@link #timeOlder o}.
     */
    Active_cio_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cioz, /*print0:*/Active_cioz_long, /*r:*/Active_cior, /*regex:*/Active_cior_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cino, /*timeNewer:*/Active_cino_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_cdinorz.Active_cdio, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdio_long, /*f:*/FindOptionSet_cfinorz.Active_cfio, /*typeFile:*/FindOptionSet_cfinorz.Active_cfio_long, /*x:*/FindOptionSet_cinorxz.Active_ciox, /*typeOther:*/FindOptionSet_cinorxz.Active_ciox_long, /*l:*/FindOptionSet_cilnorz.Active_cilo, /*typeSymlink:*/FindOptionSet_cilnorz.Active_cilo_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeCreate, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeCreate c}.
     */
    Active_ciz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cirz, /*regex:*/Active_cirz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cinz, /*timeNewer:*/Active_cinz_long, /*o:*/Active_cioz, /*timeOlder:*/Active_cioz_long, /*d:*/FindOptionSet_cdinorz.Active_cdiz, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdiz_long, /*f:*/FindOptionSet_cfinorz.Active_cfiz, /*typeFile:*/FindOptionSet_cfinorz.Active_cfiz_long, /*x:*/FindOptionSet_cinorxz.Active_cixz, /*typeOther:*/FindOptionSet_cinorxz.Active_cixz_long, /*l:*/FindOptionSet_cilnorz.Active_cilz, /*typeSymlink:*/FindOptionSet_cilnorz.Active_cilz_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeCreate
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeCreate c}.
     */
    Active_ciz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cirz, /*regex:*/Active_cirz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cinz, /*timeNewer:*/Active_cinz_long, /*o:*/Active_cioz, /*timeOlder:*/Active_cioz_long, /*d:*/FindOptionSet_cdinorz.Active_cdiz, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdiz_long, /*f:*/FindOptionSet_cfinorz.Active_cfiz, /*typeFile:*/FindOptionSet_cfinorz.Active_cfiz_long, /*x:*/FindOptionSet_cinorxz.Active_cixz, /*typeOther:*/FindOptionSet_cinorxz.Active_cixz_long, /*l:*/FindOptionSet_cilnorz.Active_cilz, /*typeSymlink:*/FindOptionSet_cilnorz.Active_cilz_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeCreate
    ),
    /**
     * Option set with the following active options: {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_cno(
		/*i:*/Active_cino, /*ignoreCase:*/Active_cino_long, /*z:*/Active_cnoz, /*print0:*/Active_cnoz_long, /*r:*/Active_cnor, /*regex:*/Active_cnor_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_cdinorz.Active_cdno, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdno_long, /*f:*/FindOptionSet_cfinorz.Active_cfno, /*typeFile:*/FindOptionSet_cfinorz.Active_cfno_long, /*x:*/FindOptionSet_cinorxz.Active_cnox, /*typeOther:*/FindOptionSet_cinorxz.Active_cnox_long, /*l:*/FindOptionSet_cilnorz.Active_clno, /*typeSymlink:*/FindOptionSet_cilnorz.Active_clno_long,
            true,
		/*active:*/FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_cno_long(
		/*i:*/Active_cino, /*ignoreCase:*/Active_cino_long, /*z:*/Active_cnoz, /*print0:*/Active_cnoz_long, /*r:*/Active_cnor, /*regex:*/Active_cnor_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_cdinorz.Active_cdno, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdno_long, /*f:*/FindOptionSet_cfinorz.Active_cfno, /*typeFile:*/FindOptionSet_cfinorz.Active_cfno_long, /*x:*/FindOptionSet_cinorxz.Active_cnox, /*typeOther:*/FindOptionSet_cinorxz.Active_cnox_long, /*l:*/FindOptionSet_cilnorz.Active_clno, /*typeSymlink:*/FindOptionSet_cilnorz.Active_clno_long,
            false,
		/*active:*/FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeCreate c}, {@link #timeNewer n}.
     */
    Active_cnz(
		/*i:*/Active_cinz, /*ignoreCase:*/Active_cinz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cnrz, /*regex:*/Active_cnrz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cnoz, /*timeOlder:*/Active_cnoz_long, /*d:*/FindOptionSet_cdinorz.Active_cdnz, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdnz_long, /*f:*/FindOptionSet_cfinorz.Active_cfnz, /*typeFile:*/FindOptionSet_cfinorz.Active_cfnz_long, /*x:*/FindOptionSet_cinorxz.Active_cnxz, /*typeOther:*/FindOptionSet_cinorxz.Active_cnxz_long, /*l:*/FindOptionSet_cilnorz.Active_clnz, /*typeSymlink:*/FindOptionSet_cilnorz.Active_clnz_long,
            true,
		/*active:*/FindOption.print0, FindOption.timeCreate, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeCreate c}, {@link #timeNewer n}.
     */
    Active_cnz_long(
		/*i:*/Active_cinz, /*ignoreCase:*/Active_cinz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cnrz, /*regex:*/Active_cnrz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cnoz, /*timeOlder:*/Active_cnoz_long, /*d:*/FindOptionSet_cdinorz.Active_cdnz, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdnz_long, /*f:*/FindOptionSet_cfinorz.Active_cfnz, /*typeFile:*/FindOptionSet_cfinorz.Active_cfnz_long, /*x:*/FindOptionSet_cinorxz.Active_cnxz, /*typeOther:*/FindOptionSet_cinorxz.Active_cnxz_long, /*l:*/FindOptionSet_cilnorz.Active_clnz, /*typeSymlink:*/FindOptionSet_cilnorz.Active_clnz_long,
            false,
		/*active:*/FindOption.print0, FindOption.timeCreate, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeCreate c}, {@link #timeOlder o}.
     */
    Active_coz(
		/*i:*/Active_cioz, /*ignoreCase:*/Active_cioz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_corz, /*regex:*/Active_corz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cnoz, /*timeNewer:*/Active_cnoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_cdinorz.Active_cdoz, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdoz_long, /*f:*/FindOptionSet_cfinorz.Active_cfoz, /*typeFile:*/FindOptionSet_cfinorz.Active_cfoz_long, /*x:*/FindOptionSet_cinorxz.Active_coxz, /*typeOther:*/FindOptionSet_cinorxz.Active_coxz_long, /*l:*/FindOptionSet_cilnorz.Active_cloz, /*typeSymlink:*/FindOptionSet_cilnorz.Active_cloz_long,
            true,
		/*active:*/FindOption.print0, FindOption.timeCreate, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeCreate c}, {@link #timeOlder o}.
     */
    Active_coz_long(
		/*i:*/Active_cioz, /*ignoreCase:*/Active_cioz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_corz, /*regex:*/Active_corz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cnoz, /*timeNewer:*/Active_cnoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_cdinorz.Active_cdoz, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdoz_long, /*f:*/FindOptionSet_cfinorz.Active_cfoz, /*typeFile:*/FindOptionSet_cfinorz.Active_cfoz_long, /*x:*/FindOptionSet_cinorxz.Active_coxz, /*typeOther:*/FindOptionSet_cinorxz.Active_coxz_long, /*l:*/FindOptionSet_cilnorz.Active_cloz, /*typeSymlink:*/FindOptionSet_cilnorz.Active_cloz_long,
            false,
		/*active:*/FindOption.print0, FindOption.timeCreate, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeCreate c}.
     */
    Active_cr(
		/*i:*/Active_cir, /*ignoreCase:*/Active_cir_long, /*z:*/Active_crz, /*print0:*/Active_crz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cnr, /*timeNewer:*/Active_cnr_long, /*o:*/Active_cor, /*timeOlder:*/Active_cor_long, /*d:*/FindOptionSet_cdinorz.Active_cdr, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdr_long, /*f:*/FindOptionSet_cfinorz.Active_cfr, /*typeFile:*/FindOptionSet_cfinorz.Active_cfr_long, /*x:*/FindOptionSet_cinorxz.Active_crx, /*typeOther:*/FindOptionSet_cinorxz.Active_crx_long, /*l:*/FindOptionSet_cilnorz.Active_clr, /*typeSymlink:*/FindOptionSet_cilnorz.Active_clr_long,
            true,
		/*active:*/FindOption.regex, FindOption.timeCreate
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeCreate c}.
     */
    Active_cr_long(
		/*i:*/Active_cir, /*ignoreCase:*/Active_cir_long, /*z:*/Active_crz, /*print0:*/Active_crz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cnr, /*timeNewer:*/Active_cnr_long, /*o:*/Active_cor, /*timeOlder:*/Active_cor_long, /*d:*/FindOptionSet_cdinorz.Active_cdr, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdr_long, /*f:*/FindOptionSet_cfinorz.Active_cfr, /*typeFile:*/FindOptionSet_cfinorz.Active_cfr_long, /*x:*/FindOptionSet_cinorxz.Active_crx, /*typeOther:*/FindOptionSet_cinorxz.Active_crx_long, /*l:*/FindOptionSet_cilnorz.Active_clr, /*typeSymlink:*/FindOptionSet_cilnorz.Active_clr_long,
            false,
		/*active:*/FindOption.regex, FindOption.timeCreate
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeCreate c}.
     */
    Active_ci(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ciz, /*print0:*/Active_ciz_long, /*r:*/Active_cir, /*regex:*/Active_cir_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cin, /*timeNewer:*/Active_cin_long, /*o:*/Active_cio, /*timeOlder:*/Active_cio_long, /*d:*/FindOptionSet_cdinorz.Active_cdi, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdi_long, /*f:*/FindOptionSet_cfinorz.Active_cfi, /*typeFile:*/FindOptionSet_cfinorz.Active_cfi_long, /*x:*/FindOptionSet_cinorxz.Active_cix, /*typeOther:*/FindOptionSet_cinorxz.Active_cix_long, /*l:*/FindOptionSet_cilnorz.Active_cil, /*typeSymlink:*/FindOptionSet_cilnorz.Active_cil_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeCreate
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeCreate c}.
     */
    Active_ci_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ciz, /*print0:*/Active_ciz_long, /*r:*/Active_cir, /*regex:*/Active_cir_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cin, /*timeNewer:*/Active_cin_long, /*o:*/Active_cio, /*timeOlder:*/Active_cio_long, /*d:*/FindOptionSet_cdinorz.Active_cdi, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdi_long, /*f:*/FindOptionSet_cfinorz.Active_cfi, /*typeFile:*/FindOptionSet_cfinorz.Active_cfi_long, /*x:*/FindOptionSet_cinorxz.Active_cix, /*typeOther:*/FindOptionSet_cinorxz.Active_cix_long, /*l:*/FindOptionSet_cilnorz.Active_cil, /*typeSymlink:*/FindOptionSet_cilnorz.Active_cil_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeCreate
    ),
    /**
     * Option set with the following active options: {@link #timeCreate c}, {@link #timeNewer n}.
     */
    Active_cn(
		/*i:*/Active_cin, /*ignoreCase:*/Active_cin_long, /*z:*/Active_cnz, /*print0:*/Active_cnz_long, /*r:*/Active_cnr, /*regex:*/Active_cnr_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cno, /*timeOlder:*/Active_cno_long, /*d:*/FindOptionSet_cdinorz.Active_cdn, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdn_long, /*f:*/FindOptionSet_cfinorz.Active_cfn, /*typeFile:*/FindOptionSet_cfinorz.Active_cfn_long, /*x:*/FindOptionSet_cinorxz.Active_cnx, /*typeOther:*/FindOptionSet_cinorxz.Active_cnx_long, /*l:*/FindOptionSet_cilnorz.Active_cln, /*typeSymlink:*/FindOptionSet_cilnorz.Active_cln_long,
            true,
		/*active:*/FindOption.timeCreate, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #timeCreate c}, {@link #timeNewer n}.
     */
    Active_cn_long(
		/*i:*/Active_cin, /*ignoreCase:*/Active_cin_long, /*z:*/Active_cnz, /*print0:*/Active_cnz_long, /*r:*/Active_cnr, /*regex:*/Active_cnr_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cno, /*timeOlder:*/Active_cno_long, /*d:*/FindOptionSet_cdinorz.Active_cdn, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdn_long, /*f:*/FindOptionSet_cfinorz.Active_cfn, /*typeFile:*/FindOptionSet_cfinorz.Active_cfn_long, /*x:*/FindOptionSet_cinorxz.Active_cnx, /*typeOther:*/FindOptionSet_cinorxz.Active_cnx_long, /*l:*/FindOptionSet_cilnorz.Active_cln, /*typeSymlink:*/FindOptionSet_cilnorz.Active_cln_long,
            false,
		/*active:*/FindOption.timeCreate, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #timeCreate c}, {@link #timeOlder o}.
     */
    Active_co(
		/*i:*/Active_cio, /*ignoreCase:*/Active_cio_long, /*z:*/Active_coz, /*print0:*/Active_coz_long, /*r:*/Active_cor, /*regex:*/Active_cor_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cno, /*timeNewer:*/Active_cno_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_cdinorz.Active_cdo, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdo_long, /*f:*/FindOptionSet_cfinorz.Active_cfo, /*typeFile:*/FindOptionSet_cfinorz.Active_cfo_long, /*x:*/FindOptionSet_cinorxz.Active_cox, /*typeOther:*/FindOptionSet_cinorxz.Active_cox_long, /*l:*/FindOptionSet_cilnorz.Active_clo, /*typeSymlink:*/FindOptionSet_cilnorz.Active_clo_long,
            true,
		/*active:*/FindOption.timeCreate, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #timeCreate c}, {@link #timeOlder o}.
     */
    Active_co_long(
		/*i:*/Active_cio, /*ignoreCase:*/Active_cio_long, /*z:*/Active_coz, /*print0:*/Active_coz_long, /*r:*/Active_cor, /*regex:*/Active_cor_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cno, /*timeNewer:*/Active_cno_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_cdinorz.Active_cdo, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdo_long, /*f:*/FindOptionSet_cfinorz.Active_cfo, /*typeFile:*/FindOptionSet_cfinorz.Active_cfo_long, /*x:*/FindOptionSet_cinorxz.Active_cox, /*typeOther:*/FindOptionSet_cinorxz.Active_cox_long, /*l:*/FindOptionSet_cilnorz.Active_clo, /*typeSymlink:*/FindOptionSet_cilnorz.Active_clo_long,
            false,
		/*active:*/FindOption.timeCreate, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeCreate c}.
     */
    Active_cz(
		/*i:*/Active_ciz, /*ignoreCase:*/Active_ciz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_crz, /*regex:*/Active_crz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cnz, /*timeNewer:*/Active_cnz_long, /*o:*/Active_coz, /*timeOlder:*/Active_coz_long, /*d:*/FindOptionSet_cdinorz.Active_cdz, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdz_long, /*f:*/FindOptionSet_cfinorz.Active_cfz, /*typeFile:*/FindOptionSet_cfinorz.Active_cfz_long, /*x:*/FindOptionSet_cinorxz.Active_cxz, /*typeOther:*/FindOptionSet_cinorxz.Active_cxz_long, /*l:*/FindOptionSet_cilnorz.Active_clz, /*typeSymlink:*/FindOptionSet_cilnorz.Active_clz_long,
            true,
		/*active:*/FindOption.print0, FindOption.timeCreate
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeCreate c}.
     */
    Active_cz_long(
		/*i:*/Active_ciz, /*ignoreCase:*/Active_ciz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_crz, /*regex:*/Active_crz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cnz, /*timeNewer:*/Active_cnz_long, /*o:*/Active_coz, /*timeOlder:*/Active_coz_long, /*d:*/FindOptionSet_cdinorz.Active_cdz, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cdz_long, /*f:*/FindOptionSet_cfinorz.Active_cfz, /*typeFile:*/FindOptionSet_cfinorz.Active_cfz_long, /*x:*/FindOptionSet_cinorxz.Active_cxz, /*typeOther:*/FindOptionSet_cinorxz.Active_cxz_long, /*l:*/FindOptionSet_cilnorz.Active_clz, /*typeSymlink:*/FindOptionSet_cilnorz.Active_clz_long,
            false,
		/*active:*/FindOption.print0, FindOption.timeCreate
    ),
    /**
     * Option set with the following active options: {@link #timeCreate c}.
     */
    Active_c(
		/*i:*/Active_ci, /*ignoreCase:*/Active_ci_long, /*z:*/Active_cz, /*print0:*/Active_cz_long, /*r:*/Active_cr, /*regex:*/Active_cr_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cn, /*timeNewer:*/Active_cn_long, /*o:*/Active_co, /*timeOlder:*/Active_co_long, /*d:*/FindOptionSet_cdinorz.Active_cd, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cd_long, /*f:*/FindOptionSet_cfinorz.Active_cf, /*typeFile:*/FindOptionSet_cfinorz.Active_cf_long, /*x:*/FindOptionSet_cinorxz.Active_cx, /*typeOther:*/FindOptionSet_cinorxz.Active_cx_long, /*l:*/FindOptionSet_cilnorz.Active_cl, /*typeSymlink:*/FindOptionSet_cilnorz.Active_cl_long,
            true,
		/*active:*/FindOption.timeCreate
    ),
    /**
     * Option set with the following active options: {@link #timeCreate c}.
     */
    Active_c_long(
		/*i:*/Active_ci, /*ignoreCase:*/Active_ci_long, /*z:*/Active_cz, /*print0:*/Active_cz_long, /*r:*/Active_cr, /*regex:*/Active_cr_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cn, /*timeNewer:*/Active_cn_long, /*o:*/Active_co, /*timeOlder:*/Active_co_long, /*d:*/FindOptionSet_cdinorz.Active_cd, /*typeDirectory:*/FindOptionSet_cdinorz.Active_cd_long, /*f:*/FindOptionSet_cfinorz.Active_cf, /*typeFile:*/FindOptionSet_cfinorz.Active_cf_long, /*x:*/FindOptionSet_cinorxz.Active_cx, /*typeOther:*/FindOptionSet_cinorxz.Active_cx_long, /*l:*/FindOptionSet_cilnorz.Active_cl, /*typeSymlink:*/FindOptionSet_cilnorz.Active_cl_long,
            false,
		/*active:*/FindOption.timeCreate
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
    public final FindOptionSet_cdfilnorxz i;
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
    public final FindOptionSet_cdfilnorxz ignoreCase;
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
    public final FindOptionSet_cdfilnorxz z;
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
    public final FindOptionSet_cdfilnorxz print0;
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
    public final FindOptionSet_cdfilnorxz r;
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
    public final FindOptionSet_cdfilnorxz regex;
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
    public final FindOptionSet_cdfilnorxz c;
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
    public final FindOptionSet_cdfilnorxz timeCreate;
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
    public final FindOptionSet_cdfilnorxz n;
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
    public final FindOptionSet_cdfilnorxz timeNewer;
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
    public final FindOptionSet_cdfilnorxz o;
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
    public final FindOptionSet_cdfilnorxz timeOlder;
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
    public final FindOptionSet_cinorxz x;
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
    public final FindOptionSet_cinorxz typeOther;
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
    public final FindOptionSet_cilnorz l;
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
    public final FindOptionSet_cilnorz typeSymlink;
    private final boolean useAcronym;
    private final EnumSet<FindOption> options;

    private FindOptionSet_cdfilnorxz(
            FindOptionSet_cdfilnorxz i, FindOptionSet_cdfilnorxz ignoreCase, FindOptionSet_cdfilnorxz z, FindOptionSet_cdfilnorxz print0, FindOptionSet_cdfilnorxz r, FindOptionSet_cdfilnorxz regex, FindOptionSet_cdfilnorxz c, FindOptionSet_cdfilnorxz timeCreate, FindOptionSet_cdfilnorxz n, FindOptionSet_cdfilnorxz timeNewer, FindOptionSet_cdfilnorxz o, FindOptionSet_cdfilnorxz timeOlder, FindOptionSet_cdinorz d, FindOptionSet_cdinorz typeDirectory, FindOptionSet_cfinorz f, FindOptionSet_cfinorz typeFile, FindOptionSet_cinorxz x, FindOptionSet_cinorxz typeOther, FindOptionSet_cilnorz l, FindOptionSet_cilnorz typeSymlink,
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
     *    FindOptionSet_cdfilnorxz.ignoreCase.z;
     * </pre>
     * uses acronyms, that is, this method always returns true for the above
     * set.
     * <p>
     * On the other hand, long option names are used and this method always
     * returns false for the set
     * <pre>
     *    FindOptionSet_cdfilnorxz.i.print0;
     * </pre>
     * <p>
     * Note that a repeated option is <i>not</i> treated as the last set option.
     * For instance, the first and last option of the following set are
     * equivalent and acronyms are used:
     * <pre>
     *    FindOptionSet_cdfilnorxz.i.z.ignoreCase;
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
