package org.unix4j.unix.find;

import org.unix4j.option.Option;
import org.unix4j.unix.Find;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Option sets for the {@link Find find} command with
 * the following options: {@link #i i}, {@link #z z}, {@link #r r}, {@link #m m}, {@link #n n}, {@link #o o}, {@link #d d}, {@link #f f}, {@link #x x}, {@link #l l}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Find#Options} should be used instead to specify command
 * options. See also {@link org.unix4j.unix.find.FindOptions} for more information.
 */
public enum FindOptionSet_dfilmnorxz implements FindOptions {
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_imnorz(
        /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_dimnorz.Active_dimnorz, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dimnorz_long, /*f:*/FindOptionSet_fimnorz.Active_fimnorz, /*typeFile:*/FindOptionSet_fimnorz.Active_fimnorz_long, /*x:*/FindOptionSet_imnorxz.Active_imnorxz, /*typeOther:*/FindOptionSet_imnorxz.Active_imnorxz_long, /*l:*/FindOptionSet_ilmnorz.Active_ilmnorz, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_ilmnorz_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_imnorz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_dimnorz.Active_dimnorz, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dimnorz_long, /*f:*/FindOptionSet_fimnorz.Active_fimnorz, /*typeFile:*/FindOptionSet_fimnorz.Active_fimnorz_long, /*x:*/FindOptionSet_imnorxz.Active_imnorxz, /*typeOther:*/FindOptionSet_imnorxz.Active_imnorxz_long, /*l:*/FindOptionSet_ilmnorz.Active_ilmnorz, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_ilmnorz_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_imnor(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_imnorz, /*print0:*/Active_imnorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_dimnorz.Active_dimnor, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dimnor_long, /*f:*/FindOptionSet_fimnorz.Active_fimnor, /*typeFile:*/FindOptionSet_fimnorz.Active_fimnor_long, /*x:*/FindOptionSet_imnorxz.Active_imnorx, /*typeOther:*/FindOptionSet_imnorxz.Active_imnorx_long, /*l:*/FindOptionSet_ilmnorz.Active_ilmnor, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_ilmnor_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_imnor_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_imnorz, /*print0:*/Active_imnorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_dimnorz.Active_dimnor, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dimnor_long, /*f:*/FindOptionSet_fimnorz.Active_fimnor, /*typeFile:*/FindOptionSet_fimnorz.Active_fimnor_long, /*x:*/FindOptionSet_imnorxz.Active_imnorx, /*typeOther:*/FindOptionSet_imnorxz.Active_imnorx_long, /*l:*/FindOptionSet_ilmnorz.Active_ilmnor, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_ilmnor_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}.
     */
    Active_imnrz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_imnorz, /*timeOlder:*/Active_imnorz_long, /*d:*/FindOptionSet_dimnorz.Active_dimnrz, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dimnrz_long, /*f:*/FindOptionSet_fimnorz.Active_fimnrz, /*typeFile:*/FindOptionSet_fimnorz.Active_fimnrz_long, /*x:*/FindOptionSet_imnorxz.Active_imnrxz, /*typeOther:*/FindOptionSet_imnorxz.Active_imnrxz_long, /*l:*/FindOptionSet_ilmnorz.Active_ilmnrz, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_ilmnrz_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}.
     */
    Active_imnrz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_imnorz, /*timeOlder:*/Active_imnorz_long, /*d:*/FindOptionSet_dimnorz.Active_dimnrz, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dimnrz_long, /*f:*/FindOptionSet_fimnorz.Active_fimnrz, /*typeFile:*/FindOptionSet_fimnorz.Active_fimnrz_long, /*x:*/FindOptionSet_imnorxz.Active_imnrxz, /*typeOther:*/FindOptionSet_imnorxz.Active_imnrxz_long, /*l:*/FindOptionSet_ilmnorz.Active_ilmnrz, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_ilmnrz_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeOlder o}.
     */
    Active_imorz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_imnorz, /*timeNewer:*/Active_imnorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_dimnorz.Active_dimorz, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dimorz_long, /*f:*/FindOptionSet_fimnorz.Active_fimorz, /*typeFile:*/FindOptionSet_fimnorz.Active_fimorz_long, /*x:*/FindOptionSet_imnorxz.Active_imorxz, /*typeOther:*/FindOptionSet_imnorxz.Active_imorxz_long, /*l:*/FindOptionSet_ilmnorz.Active_ilmorz, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_ilmorz_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeOlder o}.
     */
    Active_imorz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_imnorz, /*timeNewer:*/Active_imnorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_dimnorz.Active_dimorz, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dimorz_long, /*f:*/FindOptionSet_fimnorz.Active_fimorz, /*typeFile:*/FindOptionSet_fimnorz.Active_fimorz_long, /*x:*/FindOptionSet_imnorxz.Active_imorxz, /*typeOther:*/FindOptionSet_imnorxz.Active_imorxz_long, /*l:*/FindOptionSet_ilmnorz.Active_ilmorz, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_ilmorz_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_mnorz(
		/*i:*/Active_imnorz, /*ignoreCase:*/Active_imnorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_dimnorz.Active_dmnorz, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dmnorz_long, /*f:*/FindOptionSet_fimnorz.Active_fmnorz, /*typeFile:*/FindOptionSet_fimnorz.Active_fmnorz_long, /*x:*/FindOptionSet_imnorxz.Active_mnorxz, /*typeOther:*/FindOptionSet_imnorxz.Active_mnorxz_long, /*l:*/FindOptionSet_ilmnorz.Active_lmnorz, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_lmnorz_long,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_mnorz_long(
		/*i:*/Active_imnorz, /*ignoreCase:*/Active_imnorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_dimnorz.Active_dmnorz, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dmnorz_long, /*f:*/FindOptionSet_fimnorz.Active_fmnorz, /*typeFile:*/FindOptionSet_fimnorz.Active_fmnorz_long, /*x:*/FindOptionSet_imnorxz.Active_mnorxz, /*typeOther:*/FindOptionSet_imnorxz.Active_mnorxz_long, /*l:*/FindOptionSet_ilmnorz.Active_lmnorz, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_lmnorz_long,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_imnoz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_imnorz, /*regex:*/Active_imnorz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_dimnorz.Active_dimnoz, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dimnoz_long, /*f:*/FindOptionSet_fimnorz.Active_fimnoz, /*typeFile:*/FindOptionSet_fimnorz.Active_fimnoz_long, /*x:*/FindOptionSet_imnorxz.Active_imnoxz, /*typeOther:*/FindOptionSet_imnorxz.Active_imnoxz_long, /*l:*/FindOptionSet_ilmnorz.Active_ilmnoz, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_ilmnoz_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_imnoz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_imnorz, /*regex:*/Active_imnorz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_dimnorz.Active_dimnoz, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dimnoz_long, /*f:*/FindOptionSet_fimnorz.Active_fimnoz, /*typeFile:*/FindOptionSet_fimnorz.Active_fimnoz_long, /*x:*/FindOptionSet_imnorxz.Active_imnoxz, /*typeOther:*/FindOptionSet_imnorxz.Active_imnoxz_long, /*l:*/FindOptionSet_ilmnorz.Active_ilmnoz, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_ilmnoz_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}.
     */
    Active_imnr(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_imnrz, /*print0:*/Active_imnrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_imnor, /*timeOlder:*/Active_imnor_long, /*d:*/FindOptionSet_dimnorz.Active_dimnr, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dimnr_long, /*f:*/FindOptionSet_fimnorz.Active_fimnr, /*typeFile:*/FindOptionSet_fimnorz.Active_fimnr_long, /*x:*/FindOptionSet_imnorxz.Active_imnrx, /*typeOther:*/FindOptionSet_imnorxz.Active_imnrx_long, /*l:*/FindOptionSet_ilmnorz.Active_ilmnr, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_ilmnr_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeModified, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}.
     */
    Active_imnr_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_imnrz, /*print0:*/Active_imnrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_imnor, /*timeOlder:*/Active_imnor_long, /*d:*/FindOptionSet_dimnorz.Active_dimnr, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dimnr_long, /*f:*/FindOptionSet_fimnorz.Active_fimnr, /*typeFile:*/FindOptionSet_fimnorz.Active_fimnr_long, /*x:*/FindOptionSet_imnorxz.Active_imnrx, /*typeOther:*/FindOptionSet_imnorxz.Active_imnrx_long, /*l:*/FindOptionSet_ilmnorz.Active_ilmnr, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_ilmnr_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeModified, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeModified m}, {@link #timeOlder o}.
     */
    Active_imor(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_imorz, /*print0:*/Active_imorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_imnor, /*timeNewer:*/Active_imnor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_dimnorz.Active_dimor, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dimor_long, /*f:*/FindOptionSet_fimnorz.Active_fimor, /*typeFile:*/FindOptionSet_fimnorz.Active_fimor_long, /*x:*/FindOptionSet_imnorxz.Active_imorx, /*typeOther:*/FindOptionSet_imnorxz.Active_imorx_long, /*l:*/FindOptionSet_ilmnorz.Active_ilmor, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_ilmor_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeModified, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeModified m}, {@link #timeOlder o}.
     */
    Active_imor_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_imorz, /*print0:*/Active_imorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_imnor, /*timeNewer:*/Active_imnor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_dimnorz.Active_dimor, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dimor_long, /*f:*/FindOptionSet_fimnorz.Active_fimor, /*typeFile:*/FindOptionSet_fimnorz.Active_fimor_long, /*x:*/FindOptionSet_imnorxz.Active_imorx, /*typeOther:*/FindOptionSet_imnorxz.Active_imorx_long, /*l:*/FindOptionSet_ilmnorz.Active_ilmor, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_ilmor_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeModified, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeModified m}.
     */
    Active_imrz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_imnrz, /*timeNewer:*/Active_imnrz_long, /*o:*/Active_imorz, /*timeOlder:*/Active_imorz_long, /*d:*/FindOptionSet_dimnorz.Active_dimrz, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dimrz_long, /*f:*/FindOptionSet_fimnorz.Active_fimrz, /*typeFile:*/FindOptionSet_fimnorz.Active_fimrz_long, /*x:*/FindOptionSet_imnorxz.Active_imrxz, /*typeOther:*/FindOptionSet_imnorxz.Active_imrxz_long, /*l:*/FindOptionSet_ilmnorz.Active_ilmrz, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_ilmrz_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeModified
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeModified m}.
     */
    Active_imrz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_imnrz, /*timeNewer:*/Active_imnrz_long, /*o:*/Active_imorz, /*timeOlder:*/Active_imorz_long, /*d:*/FindOptionSet_dimnorz.Active_dimrz, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dimrz_long, /*f:*/FindOptionSet_fimnorz.Active_fimrz, /*typeFile:*/FindOptionSet_fimnorz.Active_fimrz_long, /*x:*/FindOptionSet_imnorxz.Active_imrxz, /*typeOther:*/FindOptionSet_imnorxz.Active_imrxz_long, /*l:*/FindOptionSet_ilmnorz.Active_ilmrz, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_ilmrz_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeModified
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_mnor(
		/*i:*/Active_imnor, /*ignoreCase:*/Active_imnor_long, /*z:*/Active_mnorz, /*print0:*/Active_mnorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_dimnorz.Active_dmnor, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dmnor_long, /*f:*/FindOptionSet_fimnorz.Active_fmnor, /*typeFile:*/FindOptionSet_fimnorz.Active_fmnor_long, /*x:*/FindOptionSet_imnorxz.Active_mnorx, /*typeOther:*/FindOptionSet_imnorxz.Active_mnorx_long, /*l:*/FindOptionSet_ilmnorz.Active_lmnor, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_lmnor_long,
            true,
		/*active:*/FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_mnor_long(
		/*i:*/Active_imnor, /*ignoreCase:*/Active_imnor_long, /*z:*/Active_mnorz, /*print0:*/Active_mnorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_dimnorz.Active_dmnor, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dmnor_long, /*f:*/FindOptionSet_fimnorz.Active_fmnor, /*typeFile:*/FindOptionSet_fimnorz.Active_fmnor_long, /*x:*/FindOptionSet_imnorxz.Active_mnorx, /*typeOther:*/FindOptionSet_imnorxz.Active_mnorx_long, /*l:*/FindOptionSet_ilmnorz.Active_lmnor, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_lmnor_long,
            false,
		/*active:*/FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}.
     */
    Active_mnrz(
		/*i:*/Active_imnrz, /*ignoreCase:*/Active_imnrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_mnorz, /*timeOlder:*/Active_mnorz_long, /*d:*/FindOptionSet_dimnorz.Active_dmnrz, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dmnrz_long, /*f:*/FindOptionSet_fimnorz.Active_fmnrz, /*typeFile:*/FindOptionSet_fimnorz.Active_fmnrz_long, /*x:*/FindOptionSet_imnorxz.Active_mnrxz, /*typeOther:*/FindOptionSet_imnorxz.Active_mnrxz_long, /*l:*/FindOptionSet_ilmnorz.Active_lmnrz, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_lmnrz_long,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}.
     */
    Active_mnrz_long(
		/*i:*/Active_imnrz, /*ignoreCase:*/Active_imnrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_mnorz, /*timeOlder:*/Active_mnorz_long, /*d:*/FindOptionSet_dimnorz.Active_dmnrz, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dmnrz_long, /*f:*/FindOptionSet_fimnorz.Active_fmnrz, /*typeFile:*/FindOptionSet_fimnorz.Active_fmnrz_long, /*x:*/FindOptionSet_imnorxz.Active_mnrxz, /*typeOther:*/FindOptionSet_imnorxz.Active_mnrxz_long, /*l:*/FindOptionSet_ilmnorz.Active_lmnrz, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_lmnrz_long,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeOlder o}.
     */
    Active_morz(
		/*i:*/Active_imorz, /*ignoreCase:*/Active_imorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_mnorz, /*timeNewer:*/Active_mnorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_dimnorz.Active_dmorz, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dmorz_long, /*f:*/FindOptionSet_fimnorz.Active_fmorz, /*typeFile:*/FindOptionSet_fimnorz.Active_fmorz_long, /*x:*/FindOptionSet_imnorxz.Active_morxz, /*typeOther:*/FindOptionSet_imnorxz.Active_morxz_long, /*l:*/FindOptionSet_ilmnorz.Active_lmorz, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_lmorz_long,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeOlder o}.
     */
    Active_morz_long(
		/*i:*/Active_imorz, /*ignoreCase:*/Active_imorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_mnorz, /*timeNewer:*/Active_mnorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_dimnorz.Active_dmorz, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dmorz_long, /*f:*/FindOptionSet_fimnorz.Active_fmorz, /*typeFile:*/FindOptionSet_fimnorz.Active_fmorz_long, /*x:*/FindOptionSet_imnorxz.Active_morxz, /*typeOther:*/FindOptionSet_imnorxz.Active_morxz_long, /*l:*/FindOptionSet_ilmnorz.Active_lmorz, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_lmorz_long,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_imno(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_imnoz, /*print0:*/Active_imnoz_long, /*r:*/Active_imnor, /*regex:*/Active_imnor_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_dimnorz.Active_dimno, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dimno_long, /*f:*/FindOptionSet_fimnorz.Active_fimno, /*typeFile:*/FindOptionSet_fimnorz.Active_fimno_long, /*x:*/FindOptionSet_imnorxz.Active_imnox, /*typeOther:*/FindOptionSet_imnorxz.Active_imnox_long, /*l:*/FindOptionSet_ilmnorz.Active_ilmno, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_ilmno_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_imno_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_imnoz, /*print0:*/Active_imnoz_long, /*r:*/Active_imnor, /*regex:*/Active_imnor_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_dimnorz.Active_dimno, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dimno_long, /*f:*/FindOptionSet_fimnorz.Active_fimno, /*typeFile:*/FindOptionSet_fimnorz.Active_fimno_long, /*x:*/FindOptionSet_imnorxz.Active_imnox, /*typeOther:*/FindOptionSet_imnorxz.Active_imnox_long, /*l:*/FindOptionSet_ilmnorz.Active_ilmno, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_ilmno_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeModified m}, {@link #timeNewer n}.
     */
    Active_imnz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_imnrz, /*regex:*/Active_imnrz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_imnoz, /*timeOlder:*/Active_imnoz_long, /*d:*/FindOptionSet_dimnorz.Active_dimnz, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dimnz_long, /*f:*/FindOptionSet_fimnorz.Active_fimnz, /*typeFile:*/FindOptionSet_fimnorz.Active_fimnz_long, /*x:*/FindOptionSet_imnorxz.Active_imnxz, /*typeOther:*/FindOptionSet_imnorxz.Active_imnxz_long, /*l:*/FindOptionSet_ilmnorz.Active_ilmnz, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_ilmnz_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeModified, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeModified m}, {@link #timeNewer n}.
     */
    Active_imnz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_imnrz, /*regex:*/Active_imnrz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_imnoz, /*timeOlder:*/Active_imnoz_long, /*d:*/FindOptionSet_dimnorz.Active_dimnz, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dimnz_long, /*f:*/FindOptionSet_fimnorz.Active_fimnz, /*typeFile:*/FindOptionSet_fimnorz.Active_fimnz_long, /*x:*/FindOptionSet_imnorxz.Active_imnxz, /*typeOther:*/FindOptionSet_imnorxz.Active_imnxz_long, /*l:*/FindOptionSet_ilmnorz.Active_ilmnz, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_ilmnz_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeModified, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeModified m}, {@link #timeOlder o}.
     */
    Active_imoz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_imorz, /*regex:*/Active_imorz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_imnoz, /*timeNewer:*/Active_imnoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_dimnorz.Active_dimoz, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dimoz_long, /*f:*/FindOptionSet_fimnorz.Active_fimoz, /*typeFile:*/FindOptionSet_fimnorz.Active_fimoz_long, /*x:*/FindOptionSet_imnorxz.Active_imoxz, /*typeOther:*/FindOptionSet_imnorxz.Active_imoxz_long, /*l:*/FindOptionSet_ilmnorz.Active_ilmoz, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_ilmoz_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeModified, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeModified m}, {@link #timeOlder o}.
     */
    Active_imoz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_imorz, /*regex:*/Active_imorz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_imnoz, /*timeNewer:*/Active_imnoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_dimnorz.Active_dimoz, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dimoz_long, /*f:*/FindOptionSet_fimnorz.Active_fimoz, /*typeFile:*/FindOptionSet_fimnorz.Active_fimoz_long, /*x:*/FindOptionSet_imnorxz.Active_imoxz, /*typeOther:*/FindOptionSet_imnorxz.Active_imoxz_long, /*l:*/FindOptionSet_ilmnorz.Active_ilmoz, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_ilmoz_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeModified, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_mnoz(
		/*i:*/Active_imnoz, /*ignoreCase:*/Active_imnoz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_mnorz, /*regex:*/Active_mnorz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_dimnorz.Active_dmnoz, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dmnoz_long, /*f:*/FindOptionSet_fimnorz.Active_fmnoz, /*typeFile:*/FindOptionSet_fimnorz.Active_fmnoz_long, /*x:*/FindOptionSet_imnorxz.Active_mnoxz, /*typeOther:*/FindOptionSet_imnorxz.Active_mnoxz_long, /*l:*/FindOptionSet_ilmnorz.Active_lmnoz, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_lmnoz_long,
            true,
		/*active:*/FindOption.print0, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_mnoz_long(
		/*i:*/Active_imnoz, /*ignoreCase:*/Active_imnoz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_mnorz, /*regex:*/Active_mnorz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_dimnorz.Active_dmnoz, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dmnoz_long, /*f:*/FindOptionSet_fimnorz.Active_fmnoz, /*typeFile:*/FindOptionSet_fimnorz.Active_fmnoz_long, /*x:*/FindOptionSet_imnorxz.Active_mnoxz, /*typeOther:*/FindOptionSet_imnorxz.Active_mnoxz_long, /*l:*/FindOptionSet_ilmnorz.Active_lmnoz, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_lmnoz_long,
            false,
		/*active:*/FindOption.print0, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeModified m}.
     */
    Active_imr(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_imrz, /*print0:*/Active_imrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_imnr, /*timeNewer:*/Active_imnr_long, /*o:*/Active_imor, /*timeOlder:*/Active_imor_long, /*d:*/FindOptionSet_dimnorz.Active_dimr, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dimr_long, /*f:*/FindOptionSet_fimnorz.Active_fimr, /*typeFile:*/FindOptionSet_fimnorz.Active_fimr_long, /*x:*/FindOptionSet_imnorxz.Active_imrx, /*typeOther:*/FindOptionSet_imnorxz.Active_imrx_long, /*l:*/FindOptionSet_ilmnorz.Active_ilmr, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_ilmr_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeModified
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeModified m}.
     */
    Active_imr_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_imrz, /*print0:*/Active_imrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_imnr, /*timeNewer:*/Active_imnr_long, /*o:*/Active_imor, /*timeOlder:*/Active_imor_long, /*d:*/FindOptionSet_dimnorz.Active_dimr, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dimr_long, /*f:*/FindOptionSet_fimnorz.Active_fimr, /*typeFile:*/FindOptionSet_fimnorz.Active_fimr_long, /*x:*/FindOptionSet_imnorxz.Active_imrx, /*typeOther:*/FindOptionSet_imnorxz.Active_imrx_long, /*l:*/FindOptionSet_ilmnorz.Active_ilmr, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_ilmr_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeModified
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}.
     */
    Active_mnr(
		/*i:*/Active_imnr, /*ignoreCase:*/Active_imnr_long, /*z:*/Active_mnrz, /*print0:*/Active_mnrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_mnor, /*timeOlder:*/Active_mnor_long, /*d:*/FindOptionSet_dimnorz.Active_dmnr, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dmnr_long, /*f:*/FindOptionSet_fimnorz.Active_fmnr, /*typeFile:*/FindOptionSet_fimnorz.Active_fmnr_long, /*x:*/FindOptionSet_imnorxz.Active_mnrx, /*typeOther:*/FindOptionSet_imnorxz.Active_mnrx_long, /*l:*/FindOptionSet_ilmnorz.Active_lmnr, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_lmnr_long,
            true,
		/*active:*/FindOption.regex, FindOption.timeModified, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}.
     */
    Active_mnr_long(
		/*i:*/Active_imnr, /*ignoreCase:*/Active_imnr_long, /*z:*/Active_mnrz, /*print0:*/Active_mnrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_mnor, /*timeOlder:*/Active_mnor_long, /*d:*/FindOptionSet_dimnorz.Active_dmnr, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dmnr_long, /*f:*/FindOptionSet_fimnorz.Active_fmnr, /*typeFile:*/FindOptionSet_fimnorz.Active_fmnr_long, /*x:*/FindOptionSet_imnorxz.Active_mnrx, /*typeOther:*/FindOptionSet_imnorxz.Active_mnrx_long, /*l:*/FindOptionSet_ilmnorz.Active_lmnr, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_lmnr_long,
            false,
		/*active:*/FindOption.regex, FindOption.timeModified, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeModified m}, {@link #timeOlder o}.
     */
    Active_mor(
		/*i:*/Active_imor, /*ignoreCase:*/Active_imor_long, /*z:*/Active_morz, /*print0:*/Active_morz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_mnor, /*timeNewer:*/Active_mnor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_dimnorz.Active_dmor, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dmor_long, /*f:*/FindOptionSet_fimnorz.Active_fmor, /*typeFile:*/FindOptionSet_fimnorz.Active_fmor_long, /*x:*/FindOptionSet_imnorxz.Active_morx, /*typeOther:*/FindOptionSet_imnorxz.Active_morx_long, /*l:*/FindOptionSet_ilmnorz.Active_lmor, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_lmor_long,
            true,
		/*active:*/FindOption.regex, FindOption.timeModified, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeModified m}, {@link #timeOlder o}.
     */
    Active_mor_long(
		/*i:*/Active_imor, /*ignoreCase:*/Active_imor_long, /*z:*/Active_morz, /*print0:*/Active_morz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_mnor, /*timeNewer:*/Active_mnor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_dimnorz.Active_dmor, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dmor_long, /*f:*/FindOptionSet_fimnorz.Active_fmor, /*typeFile:*/FindOptionSet_fimnorz.Active_fmor_long, /*x:*/FindOptionSet_imnorxz.Active_morx, /*typeOther:*/FindOptionSet_imnorxz.Active_morx_long, /*l:*/FindOptionSet_ilmnorz.Active_lmor, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_lmor_long,
            false,
		/*active:*/FindOption.regex, FindOption.timeModified, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeModified m}.
     */
    Active_mrz(
		/*i:*/Active_imrz, /*ignoreCase:*/Active_imrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_mnrz, /*timeNewer:*/Active_mnrz_long, /*o:*/Active_morz, /*timeOlder:*/Active_morz_long, /*d:*/FindOptionSet_dimnorz.Active_dmrz, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dmrz_long, /*f:*/FindOptionSet_fimnorz.Active_fmrz, /*typeFile:*/FindOptionSet_fimnorz.Active_fmrz_long, /*x:*/FindOptionSet_imnorxz.Active_mrxz, /*typeOther:*/FindOptionSet_imnorxz.Active_mrxz_long, /*l:*/FindOptionSet_ilmnorz.Active_lmrz, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_lmrz_long,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeModified
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeModified m}.
     */
    Active_mrz_long(
		/*i:*/Active_imrz, /*ignoreCase:*/Active_imrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_mnrz, /*timeNewer:*/Active_mnrz_long, /*o:*/Active_morz, /*timeOlder:*/Active_morz_long, /*d:*/FindOptionSet_dimnorz.Active_dmrz, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dmrz_long, /*f:*/FindOptionSet_fimnorz.Active_fmrz, /*typeFile:*/FindOptionSet_fimnorz.Active_fmrz_long, /*x:*/FindOptionSet_imnorxz.Active_mrxz, /*typeOther:*/FindOptionSet_imnorxz.Active_mrxz_long, /*l:*/FindOptionSet_ilmnorz.Active_lmrz, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_lmrz_long,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeModified
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeModified m}, {@link #timeNewer n}.
     */
    Active_imn(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_imnz, /*print0:*/Active_imnz_long, /*r:*/Active_imnr, /*regex:*/Active_imnr_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_imno, /*timeOlder:*/Active_imno_long, /*d:*/FindOptionSet_dimnorz.Active_dimn, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dimn_long, /*f:*/FindOptionSet_fimnorz.Active_fimn, /*typeFile:*/FindOptionSet_fimnorz.Active_fimn_long, /*x:*/FindOptionSet_imnorxz.Active_imnx, /*typeOther:*/FindOptionSet_imnorxz.Active_imnx_long, /*l:*/FindOptionSet_ilmnorz.Active_ilmn, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_ilmn_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeModified, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeModified m}, {@link #timeNewer n}.
     */
    Active_imn_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_imnz, /*print0:*/Active_imnz_long, /*r:*/Active_imnr, /*regex:*/Active_imnr_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_imno, /*timeOlder:*/Active_imno_long, /*d:*/FindOptionSet_dimnorz.Active_dimn, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dimn_long, /*f:*/FindOptionSet_fimnorz.Active_fimn, /*typeFile:*/FindOptionSet_fimnorz.Active_fimn_long, /*x:*/FindOptionSet_imnorxz.Active_imnx, /*typeOther:*/FindOptionSet_imnorxz.Active_imnx_long, /*l:*/FindOptionSet_ilmnorz.Active_ilmn, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_ilmn_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeModified, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeModified m}, {@link #timeOlder o}.
     */
    Active_imo(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_imoz, /*print0:*/Active_imoz_long, /*r:*/Active_imor, /*regex:*/Active_imor_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_imno, /*timeNewer:*/Active_imno_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_dimnorz.Active_dimo, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dimo_long, /*f:*/FindOptionSet_fimnorz.Active_fimo, /*typeFile:*/FindOptionSet_fimnorz.Active_fimo_long, /*x:*/FindOptionSet_imnorxz.Active_imox, /*typeOther:*/FindOptionSet_imnorxz.Active_imox_long, /*l:*/FindOptionSet_ilmnorz.Active_ilmo, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_ilmo_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeModified, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeModified m}, {@link #timeOlder o}.
     */
    Active_imo_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_imoz, /*print0:*/Active_imoz_long, /*r:*/Active_imor, /*regex:*/Active_imor_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_imno, /*timeNewer:*/Active_imno_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_dimnorz.Active_dimo, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dimo_long, /*f:*/FindOptionSet_fimnorz.Active_fimo, /*typeFile:*/FindOptionSet_fimnorz.Active_fimo_long, /*x:*/FindOptionSet_imnorxz.Active_imox, /*typeOther:*/FindOptionSet_imnorxz.Active_imox_long, /*l:*/FindOptionSet_ilmnorz.Active_ilmo, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_ilmo_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeModified, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeModified m}.
     */
    Active_imz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_imrz, /*regex:*/Active_imrz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_imnz, /*timeNewer:*/Active_imnz_long, /*o:*/Active_imoz, /*timeOlder:*/Active_imoz_long, /*d:*/FindOptionSet_dimnorz.Active_dimz, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dimz_long, /*f:*/FindOptionSet_fimnorz.Active_fimz, /*typeFile:*/FindOptionSet_fimnorz.Active_fimz_long, /*x:*/FindOptionSet_imnorxz.Active_imxz, /*typeOther:*/FindOptionSet_imnorxz.Active_imxz_long, /*l:*/FindOptionSet_ilmnorz.Active_ilmz, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_ilmz_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeModified
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeModified m}.
     */
    Active_imz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_imrz, /*regex:*/Active_imrz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_imnz, /*timeNewer:*/Active_imnz_long, /*o:*/Active_imoz, /*timeOlder:*/Active_imoz_long, /*d:*/FindOptionSet_dimnorz.Active_dimz, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dimz_long, /*f:*/FindOptionSet_fimnorz.Active_fimz, /*typeFile:*/FindOptionSet_fimnorz.Active_fimz_long, /*x:*/FindOptionSet_imnorxz.Active_imxz, /*typeOther:*/FindOptionSet_imnorxz.Active_imxz_long, /*l:*/FindOptionSet_ilmnorz.Active_ilmz, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_ilmz_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeModified
    ),
    /**
     * Option set with the following active options: {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_mno(
		/*i:*/Active_imno, /*ignoreCase:*/Active_imno_long, /*z:*/Active_mnoz, /*print0:*/Active_mnoz_long, /*r:*/Active_mnor, /*regex:*/Active_mnor_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_dimnorz.Active_dmno, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dmno_long, /*f:*/FindOptionSet_fimnorz.Active_fmno, /*typeFile:*/FindOptionSet_fimnorz.Active_fmno_long, /*x:*/FindOptionSet_imnorxz.Active_mnox, /*typeOther:*/FindOptionSet_imnorxz.Active_mnox_long, /*l:*/FindOptionSet_ilmnorz.Active_lmno, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_lmno_long,
            true,
		/*active:*/FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}.
     */
    Active_mno_long(
		/*i:*/Active_imno, /*ignoreCase:*/Active_imno_long, /*z:*/Active_mnoz, /*print0:*/Active_mnoz_long, /*r:*/Active_mnor, /*regex:*/Active_mnor_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_dimnorz.Active_dmno, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dmno_long, /*f:*/FindOptionSet_fimnorz.Active_fmno, /*typeFile:*/FindOptionSet_fimnorz.Active_fmno_long, /*x:*/FindOptionSet_imnorxz.Active_mnox, /*typeOther:*/FindOptionSet_imnorxz.Active_mnox_long, /*l:*/FindOptionSet_ilmnorz.Active_lmno, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_lmno_long,
            false,
		/*active:*/FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeModified m}, {@link #timeNewer n}.
     */
    Active_mnz(
		/*i:*/Active_imnz, /*ignoreCase:*/Active_imnz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_mnrz, /*regex:*/Active_mnrz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_mnoz, /*timeOlder:*/Active_mnoz_long, /*d:*/FindOptionSet_dimnorz.Active_dmnz, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dmnz_long, /*f:*/FindOptionSet_fimnorz.Active_fmnz, /*typeFile:*/FindOptionSet_fimnorz.Active_fmnz_long, /*x:*/FindOptionSet_imnorxz.Active_mnxz, /*typeOther:*/FindOptionSet_imnorxz.Active_mnxz_long, /*l:*/FindOptionSet_ilmnorz.Active_lmnz, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_lmnz_long,
            true,
		/*active:*/FindOption.print0, FindOption.timeModified, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeModified m}, {@link #timeNewer n}.
     */
    Active_mnz_long(
		/*i:*/Active_imnz, /*ignoreCase:*/Active_imnz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_mnrz, /*regex:*/Active_mnrz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_mnoz, /*timeOlder:*/Active_mnoz_long, /*d:*/FindOptionSet_dimnorz.Active_dmnz, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dmnz_long, /*f:*/FindOptionSet_fimnorz.Active_fmnz, /*typeFile:*/FindOptionSet_fimnorz.Active_fmnz_long, /*x:*/FindOptionSet_imnorxz.Active_mnxz, /*typeOther:*/FindOptionSet_imnorxz.Active_mnxz_long, /*l:*/FindOptionSet_ilmnorz.Active_lmnz, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_lmnz_long,
            false,
		/*active:*/FindOption.print0, FindOption.timeModified, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeModified m}, {@link #timeOlder o}.
     */
    Active_moz(
		/*i:*/Active_imoz, /*ignoreCase:*/Active_imoz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_morz, /*regex:*/Active_morz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_mnoz, /*timeNewer:*/Active_mnoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_dimnorz.Active_dmoz, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dmoz_long, /*f:*/FindOptionSet_fimnorz.Active_fmoz, /*typeFile:*/FindOptionSet_fimnorz.Active_fmoz_long, /*x:*/FindOptionSet_imnorxz.Active_moxz, /*typeOther:*/FindOptionSet_imnorxz.Active_moxz_long, /*l:*/FindOptionSet_ilmnorz.Active_lmoz, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_lmoz_long,
            true,
		/*active:*/FindOption.print0, FindOption.timeModified, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeModified m}, {@link #timeOlder o}.
     */
    Active_moz_long(
		/*i:*/Active_imoz, /*ignoreCase:*/Active_imoz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_morz, /*regex:*/Active_morz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_mnoz, /*timeNewer:*/Active_mnoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_dimnorz.Active_dmoz, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dmoz_long, /*f:*/FindOptionSet_fimnorz.Active_fmoz, /*typeFile:*/FindOptionSet_fimnorz.Active_fmoz_long, /*x:*/FindOptionSet_imnorxz.Active_moxz, /*typeOther:*/FindOptionSet_imnorxz.Active_moxz_long, /*l:*/FindOptionSet_ilmnorz.Active_lmoz, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_lmoz_long,
            false,
		/*active:*/FindOption.print0, FindOption.timeModified, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeModified m}.
     */
    Active_mr(
		/*i:*/Active_imr, /*ignoreCase:*/Active_imr_long, /*z:*/Active_mrz, /*print0:*/Active_mrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_mnr, /*timeNewer:*/Active_mnr_long, /*o:*/Active_mor, /*timeOlder:*/Active_mor_long, /*d:*/FindOptionSet_dimnorz.Active_dmr, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dmr_long, /*f:*/FindOptionSet_fimnorz.Active_fmr, /*typeFile:*/FindOptionSet_fimnorz.Active_fmr_long, /*x:*/FindOptionSet_imnorxz.Active_mrx, /*typeOther:*/FindOptionSet_imnorxz.Active_mrx_long, /*l:*/FindOptionSet_ilmnorz.Active_lmr, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_lmr_long,
            true,
		/*active:*/FindOption.regex, FindOption.timeModified
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeModified m}.
     */
    Active_mr_long(
		/*i:*/Active_imr, /*ignoreCase:*/Active_imr_long, /*z:*/Active_mrz, /*print0:*/Active_mrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_mnr, /*timeNewer:*/Active_mnr_long, /*o:*/Active_mor, /*timeOlder:*/Active_mor_long, /*d:*/FindOptionSet_dimnorz.Active_dmr, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dmr_long, /*f:*/FindOptionSet_fimnorz.Active_fmr, /*typeFile:*/FindOptionSet_fimnorz.Active_fmr_long, /*x:*/FindOptionSet_imnorxz.Active_mrx, /*typeOther:*/FindOptionSet_imnorxz.Active_mrx_long, /*l:*/FindOptionSet_ilmnorz.Active_lmr, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_lmr_long,
            false,
		/*active:*/FindOption.regex, FindOption.timeModified
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeModified m}.
     */
    Active_im(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_imz, /*print0:*/Active_imz_long, /*r:*/Active_imr, /*regex:*/Active_imr_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_imn, /*timeNewer:*/Active_imn_long, /*o:*/Active_imo, /*timeOlder:*/Active_imo_long, /*d:*/FindOptionSet_dimnorz.Active_dim, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dim_long, /*f:*/FindOptionSet_fimnorz.Active_fim, /*typeFile:*/FindOptionSet_fimnorz.Active_fim_long, /*x:*/FindOptionSet_imnorxz.Active_imx, /*typeOther:*/FindOptionSet_imnorxz.Active_imx_long, /*l:*/FindOptionSet_ilmnorz.Active_ilm, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_ilm_long,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeModified
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeModified m}.
     */
    Active_im_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_imz, /*print0:*/Active_imz_long, /*r:*/Active_imr, /*regex:*/Active_imr_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_imn, /*timeNewer:*/Active_imn_long, /*o:*/Active_imo, /*timeOlder:*/Active_imo_long, /*d:*/FindOptionSet_dimnorz.Active_dim, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dim_long, /*f:*/FindOptionSet_fimnorz.Active_fim, /*typeFile:*/FindOptionSet_fimnorz.Active_fim_long, /*x:*/FindOptionSet_imnorxz.Active_imx, /*typeOther:*/FindOptionSet_imnorxz.Active_imx_long, /*l:*/FindOptionSet_ilmnorz.Active_ilm, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_ilm_long,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeModified
    ),
    /**
     * Option set with the following active options: {@link #timeModified m}, {@link #timeNewer n}.
     */
    Active_mn(
		/*i:*/Active_imn, /*ignoreCase:*/Active_imn_long, /*z:*/Active_mnz, /*print0:*/Active_mnz_long, /*r:*/Active_mnr, /*regex:*/Active_mnr_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_mno, /*timeOlder:*/Active_mno_long, /*d:*/FindOptionSet_dimnorz.Active_dmn, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dmn_long, /*f:*/FindOptionSet_fimnorz.Active_fmn, /*typeFile:*/FindOptionSet_fimnorz.Active_fmn_long, /*x:*/FindOptionSet_imnorxz.Active_mnx, /*typeOther:*/FindOptionSet_imnorxz.Active_mnx_long, /*l:*/FindOptionSet_ilmnorz.Active_lmn, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_lmn_long,
            true,
		/*active:*/FindOption.timeModified, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #timeModified m}, {@link #timeNewer n}.
     */
    Active_mn_long(
		/*i:*/Active_imn, /*ignoreCase:*/Active_imn_long, /*z:*/Active_mnz, /*print0:*/Active_mnz_long, /*r:*/Active_mnr, /*regex:*/Active_mnr_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_mno, /*timeOlder:*/Active_mno_long, /*d:*/FindOptionSet_dimnorz.Active_dmn, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dmn_long, /*f:*/FindOptionSet_fimnorz.Active_fmn, /*typeFile:*/FindOptionSet_fimnorz.Active_fmn_long, /*x:*/FindOptionSet_imnorxz.Active_mnx, /*typeOther:*/FindOptionSet_imnorxz.Active_mnx_long, /*l:*/FindOptionSet_ilmnorz.Active_lmn, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_lmn_long,
            false,
		/*active:*/FindOption.timeModified, FindOption.timeNewer
    ),
    /**
     * Option set with the following active options: {@link #timeModified m}, {@link #timeOlder o}.
     */
    Active_mo(
		/*i:*/Active_imo, /*ignoreCase:*/Active_imo_long, /*z:*/Active_moz, /*print0:*/Active_moz_long, /*r:*/Active_mor, /*regex:*/Active_mor_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_mno, /*timeNewer:*/Active_mno_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_dimnorz.Active_dmo, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dmo_long, /*f:*/FindOptionSet_fimnorz.Active_fmo, /*typeFile:*/FindOptionSet_fimnorz.Active_fmo_long, /*x:*/FindOptionSet_imnorxz.Active_mox, /*typeOther:*/FindOptionSet_imnorxz.Active_mox_long, /*l:*/FindOptionSet_ilmnorz.Active_lmo, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_lmo_long,
            true,
		/*active:*/FindOption.timeModified, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #timeModified m}, {@link #timeOlder o}.
     */
    Active_mo_long(
		/*i:*/Active_imo, /*ignoreCase:*/Active_imo_long, /*z:*/Active_moz, /*print0:*/Active_moz_long, /*r:*/Active_mor, /*regex:*/Active_mor_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_mno, /*timeNewer:*/Active_mno_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_dimnorz.Active_dmo, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dmo_long, /*f:*/FindOptionSet_fimnorz.Active_fmo, /*typeFile:*/FindOptionSet_fimnorz.Active_fmo_long, /*x:*/FindOptionSet_imnorxz.Active_mox, /*typeOther:*/FindOptionSet_imnorxz.Active_mox_long, /*l:*/FindOptionSet_ilmnorz.Active_lmo, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_lmo_long,
            false,
		/*active:*/FindOption.timeModified, FindOption.timeOlder
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeModified m}.
     */
    Active_mz(
		/*i:*/Active_imz, /*ignoreCase:*/Active_imz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_mrz, /*regex:*/Active_mrz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_mnz, /*timeNewer:*/Active_mnz_long, /*o:*/Active_moz, /*timeOlder:*/Active_moz_long, /*d:*/FindOptionSet_dimnorz.Active_dmz, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dmz_long, /*f:*/FindOptionSet_fimnorz.Active_fmz, /*typeFile:*/FindOptionSet_fimnorz.Active_fmz_long, /*x:*/FindOptionSet_imnorxz.Active_mxz, /*typeOther:*/FindOptionSet_imnorxz.Active_mxz_long, /*l:*/FindOptionSet_ilmnorz.Active_lmz, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_lmz_long,
            true,
		/*active:*/FindOption.print0, FindOption.timeModified
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeModified m}.
     */
    Active_mz_long(
		/*i:*/Active_imz, /*ignoreCase:*/Active_imz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_mrz, /*regex:*/Active_mrz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_mnz, /*timeNewer:*/Active_mnz_long, /*o:*/Active_moz, /*timeOlder:*/Active_moz_long, /*d:*/FindOptionSet_dimnorz.Active_dmz, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dmz_long, /*f:*/FindOptionSet_fimnorz.Active_fmz, /*typeFile:*/FindOptionSet_fimnorz.Active_fmz_long, /*x:*/FindOptionSet_imnorxz.Active_mxz, /*typeOther:*/FindOptionSet_imnorxz.Active_mxz_long, /*l:*/FindOptionSet_ilmnorz.Active_lmz, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_lmz_long,
            false,
		/*active:*/FindOption.print0, FindOption.timeModified
    ),
    /**
     * Option set with the following active options: {@link #timeModified m}.
     */
    Active_m(
		/*i:*/Active_im, /*ignoreCase:*/Active_im_long, /*z:*/Active_mz, /*print0:*/Active_mz_long, /*r:*/Active_mr, /*regex:*/Active_mr_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_mn, /*timeNewer:*/Active_mn_long, /*o:*/Active_mo, /*timeOlder:*/Active_mo_long, /*d:*/FindOptionSet_dimnorz.Active_dm, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dm_long, /*f:*/FindOptionSet_fimnorz.Active_fm, /*typeFile:*/FindOptionSet_fimnorz.Active_fm_long, /*x:*/FindOptionSet_imnorxz.Active_mx, /*typeOther:*/FindOptionSet_imnorxz.Active_mx_long, /*l:*/FindOptionSet_ilmnorz.Active_lm, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_lm_long,
            true,
		/*active:*/FindOption.timeModified
    ),
    /**
     * Option set with the following active options: {@link #timeModified m}.
     */
    Active_m_long(
		/*i:*/Active_im, /*ignoreCase:*/Active_im_long, /*z:*/Active_mz, /*print0:*/Active_mz_long, /*r:*/Active_mr, /*regex:*/Active_mr_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_mn, /*timeNewer:*/Active_mn_long, /*o:*/Active_mo, /*timeOlder:*/Active_mo_long, /*d:*/FindOptionSet_dimnorz.Active_dm, /*typeDirectory:*/FindOptionSet_dimnorz.Active_dm_long, /*f:*/FindOptionSet_fimnorz.Active_fm, /*typeFile:*/FindOptionSet_fimnorz.Active_fm_long, /*x:*/FindOptionSet_imnorxz.Active_mx, /*typeOther:*/FindOptionSet_imnorxz.Active_mx_long, /*l:*/FindOptionSet_ilmnorz.Active_lm, /*typeSymlink:*/FindOptionSet_ilmnorz.Active_lm_long,
            false,
		/*active:*/FindOption.timeModified
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
    public final FindOptionSet_dfilmnorxz i;
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
    public final FindOptionSet_dfilmnorxz ignoreCase;
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
    public final FindOptionSet_dfilmnorxz z;
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
    public final FindOptionSet_dfilmnorxz print0;
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
    public final FindOptionSet_dfilmnorxz r;
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
    public final FindOptionSet_dfilmnorxz regex;
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
    public final FindOptionSet_dfilmnorxz m;
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
    public final FindOptionSet_dfilmnorxz timeModified;
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
    public final FindOptionSet_dfilmnorxz n;
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
    public final FindOptionSet_dfilmnorxz timeNewer;
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
    public final FindOptionSet_dfilmnorxz o;
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
    public final FindOptionSet_dfilmnorxz timeOlder;
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
    public final FindOptionSet_dimnorz d;
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
    public final FindOptionSet_dimnorz typeDirectory;
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
    public final FindOptionSet_imnorxz x;
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
    public final FindOptionSet_imnorxz typeOther;
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
    private FindOptionSet_dfilmnorxz(
            FindOptionSet_dfilmnorxz i, FindOptionSet_dfilmnorxz ignoreCase, FindOptionSet_dfilmnorxz z, FindOptionSet_dfilmnorxz print0, FindOptionSet_dfilmnorxz r, FindOptionSet_dfilmnorxz regex, FindOptionSet_dfilmnorxz m, FindOptionSet_dfilmnorxz timeModified, FindOptionSet_dfilmnorxz n, FindOptionSet_dfilmnorxz timeNewer, FindOptionSet_dfilmnorxz o, FindOptionSet_dfilmnorxz timeOlder, FindOptionSet_dimnorz d, FindOptionSet_dimnorz typeDirectory, FindOptionSet_fimnorz f, FindOptionSet_fimnorz typeFile, FindOptionSet_imnorxz x, FindOptionSet_imnorxz typeOther, FindOptionSet_ilmnorz l, FindOptionSet_ilmnorz typeSymlink,
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
     *    FindOptionSet_dfilmnorxz.ignoreCase.z;
     * </pre>
     * uses acronyms, that is, this method always returns true for the above
     * set.
     * <p>
     * On the other hand, long option names are used and this method always
     * returns false for the set
     * <pre>
     *    FindOptionSet_dfilmnorxz.i.print0;
     * </pre>
     * <p>
     * Note that a repeated option is <i>not</i> treated as the last set option.
     * For instance, the first and last option of the following set are
     * equivalent and acronyms are used:
     * <pre>
     *    FindOptionSet_dfilmnorxz.i.z.ignoreCase;
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
