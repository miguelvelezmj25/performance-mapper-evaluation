package org.unix4j.unix.find;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import org.unix4j.option.Option;

import org.unix4j.unix.Find;

/**
 * Option sets for the {@link Find find} command with 
 * the following options: {@link #i i}, {@link #z z}, {@link #r r}, {@link #a a}, {@link #c c}, {@link #m m}, {@link #n n}, {@link #o o}, {@link #d d}, {@link #f f}, {@link #x x}, {@link #l l}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Find#Options} should be used instead to specify command 
 * options. See also {@link org.unix4j.unix.find.FindOptions} for more information.
 */
public enum FindOptionSet_acdfilmnorxz implements FindOptions {
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeNewer n}, {@link #timeOlder o}.*/
	Active_inorz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adfilnorxz.Active_ainorz, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_ainorz_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cinorz, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cinorz_long, /*m:*/FindOptionSet_dfilmnorxz.Active_imnorz, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_imnorz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_acdimnorz.Active_dinorz, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dinorz_long, /*f:*/FindOptionSet_acfimnorz.Active_finorz, /*typeFile:*/FindOptionSet_acfimnorz.Active_finorz_long, /*x:*/FindOptionSet_acimnorxz.Active_inorxz, /*typeOther:*/FindOptionSet_acimnorxz.Active_inorxz_long, /*l:*/FindOptionSet_acilmnorz.Active_ilnorz, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_ilnorz_long, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeNewer, FindOption.timeOlder
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeNewer n}, {@link #timeOlder o}.*/
	Active_inorz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adfilnorxz.Active_ainorz, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_ainorz_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cinorz, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cinorz_long, /*m:*/FindOptionSet_dfilmnorxz.Active_imnorz, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_imnorz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_acdimnorz.Active_dinorz, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dinorz_long, /*f:*/FindOptionSet_acfimnorz.Active_finorz, /*typeFile:*/FindOptionSet_acfimnorz.Active_finorz_long, /*x:*/FindOptionSet_acimnorxz.Active_inorxz, /*typeOther:*/FindOptionSet_acimnorxz.Active_inorxz_long, /*l:*/FindOptionSet_acilmnorz.Active_ilnorz, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_ilnorz_long, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeNewer, FindOption.timeOlder
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeNewer n}, {@link #timeOlder o}.*/
	Active_inor(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_inorz, /*print0:*/Active_inorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adfilnorxz.Active_ainor, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_ainor_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cinor, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cinor_long, /*m:*/FindOptionSet_dfilmnorxz.Active_imnor, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_imnor_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_acdimnorz.Active_dinor, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dinor_long, /*f:*/FindOptionSet_acfimnorz.Active_finor, /*typeFile:*/FindOptionSet_acfimnorz.Active_finor_long, /*x:*/FindOptionSet_acimnorxz.Active_inorx, /*typeOther:*/FindOptionSet_acimnorxz.Active_inorx_long, /*l:*/FindOptionSet_acilmnorz.Active_ilnor, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_ilnor_long, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeNewer, FindOption.timeOlder
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeNewer n}, {@link #timeOlder o}.*/
	Active_inor_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_inorz, /*print0:*/Active_inorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adfilnorxz.Active_ainor, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_ainor_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cinor, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cinor_long, /*m:*/FindOptionSet_dfilmnorxz.Active_imnor, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_imnor_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_acdimnorz.Active_dinor, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dinor_long, /*f:*/FindOptionSet_acfimnorz.Active_finor, /*typeFile:*/FindOptionSet_acfimnorz.Active_finor_long, /*x:*/FindOptionSet_acimnorxz.Active_inorx, /*typeOther:*/FindOptionSet_acimnorxz.Active_inorx_long, /*l:*/FindOptionSet_acilmnorz.Active_ilnor, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_ilnor_long, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeNewer, FindOption.timeOlder
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeNewer n}.*/
	Active_inrz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adfilnorxz.Active_ainrz, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_ainrz_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cinrz, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cinrz_long, /*m:*/FindOptionSet_dfilmnorxz.Active_imnrz, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_imnrz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_inorz, /*timeOlder:*/Active_inorz_long, /*d:*/FindOptionSet_acdimnorz.Active_dinrz, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dinrz_long, /*f:*/FindOptionSet_acfimnorz.Active_finrz, /*typeFile:*/FindOptionSet_acfimnorz.Active_finrz_long, /*x:*/FindOptionSet_acimnorxz.Active_inrxz, /*typeOther:*/FindOptionSet_acimnorxz.Active_inrxz_long, /*l:*/FindOptionSet_acilmnorz.Active_ilnrz, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_ilnrz_long, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeNewer
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeNewer n}.*/
	Active_inrz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adfilnorxz.Active_ainrz, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_ainrz_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cinrz, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cinrz_long, /*m:*/FindOptionSet_dfilmnorxz.Active_imnrz, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_imnrz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_inorz, /*timeOlder:*/Active_inorz_long, /*d:*/FindOptionSet_acdimnorz.Active_dinrz, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dinrz_long, /*f:*/FindOptionSet_acfimnorz.Active_finrz, /*typeFile:*/FindOptionSet_acfimnorz.Active_finrz_long, /*x:*/FindOptionSet_acimnorxz.Active_inrxz, /*typeOther:*/FindOptionSet_acimnorxz.Active_inrxz_long, /*l:*/FindOptionSet_acilmnorz.Active_ilnrz, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_ilnrz_long, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeNewer
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeOlder o}.*/
	Active_iorz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adfilnorxz.Active_aiorz, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_aiorz_long, /*c:*/FindOptionSet_cdfilnorxz.Active_ciorz, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_ciorz_long, /*m:*/FindOptionSet_dfilmnorxz.Active_imorz, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_imorz_long, /*n:*/Active_inorz, /*timeNewer:*/Active_inorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_acdimnorz.Active_diorz, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_diorz_long, /*f:*/FindOptionSet_acfimnorz.Active_fiorz, /*typeFile:*/FindOptionSet_acfimnorz.Active_fiorz_long, /*x:*/FindOptionSet_acimnorxz.Active_iorxz, /*typeOther:*/FindOptionSet_acimnorxz.Active_iorxz_long, /*l:*/FindOptionSet_acilmnorz.Active_ilorz, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_ilorz_long, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeOlder
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeOlder o}.*/
	Active_iorz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adfilnorxz.Active_aiorz, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_aiorz_long, /*c:*/FindOptionSet_cdfilnorxz.Active_ciorz, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_ciorz_long, /*m:*/FindOptionSet_dfilmnorxz.Active_imorz, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_imorz_long, /*n:*/Active_inorz, /*timeNewer:*/Active_inorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_acdimnorz.Active_diorz, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_diorz_long, /*f:*/FindOptionSet_acfimnorz.Active_fiorz, /*typeFile:*/FindOptionSet_acfimnorz.Active_fiorz_long, /*x:*/FindOptionSet_acimnorxz.Active_iorxz, /*typeOther:*/FindOptionSet_acimnorxz.Active_iorxz_long, /*l:*/FindOptionSet_acilmnorz.Active_ilorz, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_ilorz_long, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeOlder
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeNewer n}, {@link #timeOlder o}.*/
	Active_norz(
		/*i:*/Active_inorz, /*ignoreCase:*/Active_inorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adfilnorxz.Active_anorz, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_anorz_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cnorz, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cnorz_long, /*m:*/FindOptionSet_dfilmnorxz.Active_mnorz, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_mnorz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_acdimnorz.Active_dnorz, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dnorz_long, /*f:*/FindOptionSet_acfimnorz.Active_fnorz, /*typeFile:*/FindOptionSet_acfimnorz.Active_fnorz_long, /*x:*/FindOptionSet_acimnorxz.Active_norxz, /*typeOther:*/FindOptionSet_acimnorxz.Active_norxz_long, /*l:*/FindOptionSet_acilmnorz.Active_lnorz, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_lnorz_long, 
		true, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeNewer, FindOption.timeOlder
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeNewer n}, {@link #timeOlder o}.*/
	Active_norz_long(
		/*i:*/Active_inorz, /*ignoreCase:*/Active_inorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adfilnorxz.Active_anorz, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_anorz_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cnorz, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cnorz_long, /*m:*/FindOptionSet_dfilmnorxz.Active_mnorz, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_mnorz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_acdimnorz.Active_dnorz, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dnorz_long, /*f:*/FindOptionSet_acfimnorz.Active_fnorz, /*typeFile:*/FindOptionSet_acfimnorz.Active_fnorz_long, /*x:*/FindOptionSet_acimnorxz.Active_norxz, /*typeOther:*/FindOptionSet_acimnorxz.Active_norxz_long, /*l:*/FindOptionSet_acilmnorz.Active_lnorz, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_lnorz_long, 
		false, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeNewer, FindOption.timeOlder
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeNewer n}, {@link #timeOlder o}.*/
	Active_inoz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_inorz, /*regex:*/Active_inorz_long, /*a:*/FindOptionSet_adfilnorxz.Active_ainoz, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_ainoz_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cinoz, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cinoz_long, /*m:*/FindOptionSet_dfilmnorxz.Active_imnoz, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_imnoz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_acdimnorz.Active_dinoz, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dinoz_long, /*f:*/FindOptionSet_acfimnorz.Active_finoz, /*typeFile:*/FindOptionSet_acfimnorz.Active_finoz_long, /*x:*/FindOptionSet_acimnorxz.Active_inoxz, /*typeOther:*/FindOptionSet_acimnorxz.Active_inoxz_long, /*l:*/FindOptionSet_acilmnorz.Active_ilnoz, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_ilnoz_long, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeNewer, FindOption.timeOlder
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeNewer n}, {@link #timeOlder o}.*/
	Active_inoz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_inorz, /*regex:*/Active_inorz_long, /*a:*/FindOptionSet_adfilnorxz.Active_ainoz, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_ainoz_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cinoz, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cinoz_long, /*m:*/FindOptionSet_dfilmnorxz.Active_imnoz, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_imnoz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_acdimnorz.Active_dinoz, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dinoz_long, /*f:*/FindOptionSet_acfimnorz.Active_finoz, /*typeFile:*/FindOptionSet_acfimnorz.Active_finoz_long, /*x:*/FindOptionSet_acimnorxz.Active_inoxz, /*typeOther:*/FindOptionSet_acimnorxz.Active_inoxz_long, /*l:*/FindOptionSet_acilmnorz.Active_ilnoz, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_ilnoz_long, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeNewer, FindOption.timeOlder
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeNewer n}.*/
	Active_inr(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_inrz, /*print0:*/Active_inrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adfilnorxz.Active_ainr, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_ainr_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cinr, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cinr_long, /*m:*/FindOptionSet_dfilmnorxz.Active_imnr, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_imnr_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_inor, /*timeOlder:*/Active_inor_long, /*d:*/FindOptionSet_acdimnorz.Active_dinr, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dinr_long, /*f:*/FindOptionSet_acfimnorz.Active_finr, /*typeFile:*/FindOptionSet_acfimnorz.Active_finr_long, /*x:*/FindOptionSet_acimnorxz.Active_inrx, /*typeOther:*/FindOptionSet_acimnorxz.Active_inrx_long, /*l:*/FindOptionSet_acilmnorz.Active_ilnr, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_ilnr_long, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeNewer
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeNewer n}.*/
	Active_inr_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_inrz, /*print0:*/Active_inrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adfilnorxz.Active_ainr, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_ainr_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cinr, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cinr_long, /*m:*/FindOptionSet_dfilmnorxz.Active_imnr, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_imnr_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_inor, /*timeOlder:*/Active_inor_long, /*d:*/FindOptionSet_acdimnorz.Active_dinr, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dinr_long, /*f:*/FindOptionSet_acfimnorz.Active_finr, /*typeFile:*/FindOptionSet_acfimnorz.Active_finr_long, /*x:*/FindOptionSet_acimnorxz.Active_inrx, /*typeOther:*/FindOptionSet_acimnorxz.Active_inrx_long, /*l:*/FindOptionSet_acilmnorz.Active_ilnr, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_ilnr_long, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeNewer
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeOlder o}.*/
	Active_ior(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_iorz, /*print0:*/Active_iorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adfilnorxz.Active_aior, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_aior_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cior, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cior_long, /*m:*/FindOptionSet_dfilmnorxz.Active_imor, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_imor_long, /*n:*/Active_inor, /*timeNewer:*/Active_inor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_acdimnorz.Active_dior, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dior_long, /*f:*/FindOptionSet_acfimnorz.Active_fior, /*typeFile:*/FindOptionSet_acfimnorz.Active_fior_long, /*x:*/FindOptionSet_acimnorxz.Active_iorx, /*typeOther:*/FindOptionSet_acimnorxz.Active_iorx_long, /*l:*/FindOptionSet_acilmnorz.Active_ilor, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_ilor_long, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeOlder
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeOlder o}.*/
	Active_ior_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_iorz, /*print0:*/Active_iorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adfilnorxz.Active_aior, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_aior_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cior, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cior_long, /*m:*/FindOptionSet_dfilmnorxz.Active_imor, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_imor_long, /*n:*/Active_inor, /*timeNewer:*/Active_inor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_acdimnorz.Active_dior, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dior_long, /*f:*/FindOptionSet_acfimnorz.Active_fior, /*typeFile:*/FindOptionSet_acfimnorz.Active_fior_long, /*x:*/FindOptionSet_acimnorxz.Active_iorx, /*typeOther:*/FindOptionSet_acimnorxz.Active_iorx_long, /*l:*/FindOptionSet_acilmnorz.Active_ilor, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_ilor_long, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeOlder
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}.*/
	Active_irz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adfilnorxz.Active_airz, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_airz_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cirz, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cirz_long, /*m:*/FindOptionSet_dfilmnorxz.Active_imrz, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_imrz_long, /*n:*/Active_inrz, /*timeNewer:*/Active_inrz_long, /*o:*/Active_iorz, /*timeOlder:*/Active_iorz_long, /*d:*/FindOptionSet_acdimnorz.Active_dirz, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dirz_long, /*f:*/FindOptionSet_acfimnorz.Active_firz, /*typeFile:*/FindOptionSet_acfimnorz.Active_firz_long, /*x:*/FindOptionSet_acimnorxz.Active_irxz, /*typeOther:*/FindOptionSet_acimnorxz.Active_irxz_long, /*l:*/FindOptionSet_acilmnorz.Active_ilrz, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_ilrz_long, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}.*/
	Active_irz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adfilnorxz.Active_airz, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_airz_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cirz, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cirz_long, /*m:*/FindOptionSet_dfilmnorxz.Active_imrz, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_imrz_long, /*n:*/Active_inrz, /*timeNewer:*/Active_inrz_long, /*o:*/Active_iorz, /*timeOlder:*/Active_iorz_long, /*d:*/FindOptionSet_acdimnorz.Active_dirz, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dirz_long, /*f:*/FindOptionSet_acfimnorz.Active_firz, /*typeFile:*/FindOptionSet_acfimnorz.Active_firz_long, /*x:*/FindOptionSet_acimnorxz.Active_irxz, /*typeOther:*/FindOptionSet_acimnorxz.Active_irxz_long, /*l:*/FindOptionSet_acilmnorz.Active_ilrz, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_ilrz_long, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeNewer n}, {@link #timeOlder o}.*/
	Active_nor(
		/*i:*/Active_inor, /*ignoreCase:*/Active_inor_long, /*z:*/Active_norz, /*print0:*/Active_norz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adfilnorxz.Active_anor, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_anor_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cnor, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cnor_long, /*m:*/FindOptionSet_dfilmnorxz.Active_mnor, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_mnor_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_acdimnorz.Active_dnor, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dnor_long, /*f:*/FindOptionSet_acfimnorz.Active_fnor, /*typeFile:*/FindOptionSet_acfimnorz.Active_fnor_long, /*x:*/FindOptionSet_acimnorxz.Active_norx, /*typeOther:*/FindOptionSet_acimnorxz.Active_norx_long, /*l:*/FindOptionSet_acilmnorz.Active_lnor, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_lnor_long, 
		true, 
		/*active:*/FindOption.regex, FindOption.timeNewer, FindOption.timeOlder
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeNewer n}, {@link #timeOlder o}.*/
	Active_nor_long(
		/*i:*/Active_inor, /*ignoreCase:*/Active_inor_long, /*z:*/Active_norz, /*print0:*/Active_norz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adfilnorxz.Active_anor, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_anor_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cnor, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cnor_long, /*m:*/FindOptionSet_dfilmnorxz.Active_mnor, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_mnor_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_acdimnorz.Active_dnor, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dnor_long, /*f:*/FindOptionSet_acfimnorz.Active_fnor, /*typeFile:*/FindOptionSet_acfimnorz.Active_fnor_long, /*x:*/FindOptionSet_acimnorxz.Active_norx, /*typeOther:*/FindOptionSet_acimnorxz.Active_norx_long, /*l:*/FindOptionSet_acilmnorz.Active_lnor, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_lnor_long, 
		false, 
		/*active:*/FindOption.regex, FindOption.timeNewer, FindOption.timeOlder
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeNewer n}.*/
	Active_nrz(
		/*i:*/Active_inrz, /*ignoreCase:*/Active_inrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adfilnorxz.Active_anrz, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_anrz_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cnrz, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cnrz_long, /*m:*/FindOptionSet_dfilmnorxz.Active_mnrz, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_mnrz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_norz, /*timeOlder:*/Active_norz_long, /*d:*/FindOptionSet_acdimnorz.Active_dnrz, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dnrz_long, /*f:*/FindOptionSet_acfimnorz.Active_fnrz, /*typeFile:*/FindOptionSet_acfimnorz.Active_fnrz_long, /*x:*/FindOptionSet_acimnorxz.Active_nrxz, /*typeOther:*/FindOptionSet_acimnorxz.Active_nrxz_long, /*l:*/FindOptionSet_acilmnorz.Active_lnrz, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_lnrz_long, 
		true, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeNewer
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeNewer n}.*/
	Active_nrz_long(
		/*i:*/Active_inrz, /*ignoreCase:*/Active_inrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adfilnorxz.Active_anrz, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_anrz_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cnrz, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cnrz_long, /*m:*/FindOptionSet_dfilmnorxz.Active_mnrz, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_mnrz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_norz, /*timeOlder:*/Active_norz_long, /*d:*/FindOptionSet_acdimnorz.Active_dnrz, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dnrz_long, /*f:*/FindOptionSet_acfimnorz.Active_fnrz, /*typeFile:*/FindOptionSet_acfimnorz.Active_fnrz_long, /*x:*/FindOptionSet_acimnorxz.Active_nrxz, /*typeOther:*/FindOptionSet_acimnorxz.Active_nrxz_long, /*l:*/FindOptionSet_acilmnorz.Active_lnrz, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_lnrz_long, 
		false, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeNewer
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeOlder o}.*/
	Active_orz(
		/*i:*/Active_iorz, /*ignoreCase:*/Active_iorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adfilnorxz.Active_aorz, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_aorz_long, /*c:*/FindOptionSet_cdfilnorxz.Active_corz, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_corz_long, /*m:*/FindOptionSet_dfilmnorxz.Active_morz, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_morz_long, /*n:*/Active_norz, /*timeNewer:*/Active_norz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_acdimnorz.Active_dorz, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dorz_long, /*f:*/FindOptionSet_acfimnorz.Active_forz, /*typeFile:*/FindOptionSet_acfimnorz.Active_forz_long, /*x:*/FindOptionSet_acimnorxz.Active_orxz, /*typeOther:*/FindOptionSet_acimnorxz.Active_orxz_long, /*l:*/FindOptionSet_acilmnorz.Active_lorz, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_lorz_long, 
		true, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeOlder
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeOlder o}.*/
	Active_orz_long(
		/*i:*/Active_iorz, /*ignoreCase:*/Active_iorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adfilnorxz.Active_aorz, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_aorz_long, /*c:*/FindOptionSet_cdfilnorxz.Active_corz, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_corz_long, /*m:*/FindOptionSet_dfilmnorxz.Active_morz, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_morz_long, /*n:*/Active_norz, /*timeNewer:*/Active_norz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_acdimnorz.Active_dorz, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dorz_long, /*f:*/FindOptionSet_acfimnorz.Active_forz, /*typeFile:*/FindOptionSet_acfimnorz.Active_forz_long, /*x:*/FindOptionSet_acimnorxz.Active_orxz, /*typeOther:*/FindOptionSet_acimnorxz.Active_orxz_long, /*l:*/FindOptionSet_acilmnorz.Active_lorz, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_lorz_long, 
		false, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeOlder
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeNewer n}, {@link #timeOlder o}.*/
	Active_ino(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_inoz, /*print0:*/Active_inoz_long, /*r:*/Active_inor, /*regex:*/Active_inor_long, /*a:*/FindOptionSet_adfilnorxz.Active_aino, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_aino_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cino, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cino_long, /*m:*/FindOptionSet_dfilmnorxz.Active_imno, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_imno_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_acdimnorz.Active_dino, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dino_long, /*f:*/FindOptionSet_acfimnorz.Active_fino, /*typeFile:*/FindOptionSet_acfimnorz.Active_fino_long, /*x:*/FindOptionSet_acimnorxz.Active_inox, /*typeOther:*/FindOptionSet_acimnorxz.Active_inox_long, /*l:*/FindOptionSet_acilmnorz.Active_ilno, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_ilno_long, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.timeNewer, FindOption.timeOlder
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeNewer n}, {@link #timeOlder o}.*/
	Active_ino_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_inoz, /*print0:*/Active_inoz_long, /*r:*/Active_inor, /*regex:*/Active_inor_long, /*a:*/FindOptionSet_adfilnorxz.Active_aino, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_aino_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cino, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cino_long, /*m:*/FindOptionSet_dfilmnorxz.Active_imno, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_imno_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_acdimnorz.Active_dino, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dino_long, /*f:*/FindOptionSet_acfimnorz.Active_fino, /*typeFile:*/FindOptionSet_acfimnorz.Active_fino_long, /*x:*/FindOptionSet_acimnorxz.Active_inox, /*typeOther:*/FindOptionSet_acimnorxz.Active_inox_long, /*l:*/FindOptionSet_acilmnorz.Active_ilno, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_ilno_long, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.timeNewer, FindOption.timeOlder
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeNewer n}.*/
	Active_inz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_inrz, /*regex:*/Active_inrz_long, /*a:*/FindOptionSet_adfilnorxz.Active_ainz, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_ainz_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cinz, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cinz_long, /*m:*/FindOptionSet_dfilmnorxz.Active_imnz, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_imnz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_inoz, /*timeOlder:*/Active_inoz_long, /*d:*/FindOptionSet_acdimnorz.Active_dinz, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dinz_long, /*f:*/FindOptionSet_acfimnorz.Active_finz, /*typeFile:*/FindOptionSet_acfimnorz.Active_finz_long, /*x:*/FindOptionSet_acimnorxz.Active_inxz, /*typeOther:*/FindOptionSet_acimnorxz.Active_inxz_long, /*l:*/FindOptionSet_acilmnorz.Active_ilnz, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_ilnz_long, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeNewer
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeNewer n}.*/
	Active_inz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_inrz, /*regex:*/Active_inrz_long, /*a:*/FindOptionSet_adfilnorxz.Active_ainz, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_ainz_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cinz, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cinz_long, /*m:*/FindOptionSet_dfilmnorxz.Active_imnz, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_imnz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_inoz, /*timeOlder:*/Active_inoz_long, /*d:*/FindOptionSet_acdimnorz.Active_dinz, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dinz_long, /*f:*/FindOptionSet_acfimnorz.Active_finz, /*typeFile:*/FindOptionSet_acfimnorz.Active_finz_long, /*x:*/FindOptionSet_acimnorxz.Active_inxz, /*typeOther:*/FindOptionSet_acimnorxz.Active_inxz_long, /*l:*/FindOptionSet_acilmnorz.Active_ilnz, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_ilnz_long, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeNewer
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeOlder o}.*/
	Active_ioz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_iorz, /*regex:*/Active_iorz_long, /*a:*/FindOptionSet_adfilnorxz.Active_aioz, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_aioz_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cioz, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cioz_long, /*m:*/FindOptionSet_dfilmnorxz.Active_imoz, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_imoz_long, /*n:*/Active_inoz, /*timeNewer:*/Active_inoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_acdimnorz.Active_dioz, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dioz_long, /*f:*/FindOptionSet_acfimnorz.Active_fioz, /*typeFile:*/FindOptionSet_acfimnorz.Active_fioz_long, /*x:*/FindOptionSet_acimnorxz.Active_ioxz, /*typeOther:*/FindOptionSet_acimnorxz.Active_ioxz_long, /*l:*/FindOptionSet_acilmnorz.Active_iloz, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_iloz_long, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeOlder
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeOlder o}.*/
	Active_ioz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_iorz, /*regex:*/Active_iorz_long, /*a:*/FindOptionSet_adfilnorxz.Active_aioz, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_aioz_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cioz, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cioz_long, /*m:*/FindOptionSet_dfilmnorxz.Active_imoz, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_imoz_long, /*n:*/Active_inoz, /*timeNewer:*/Active_inoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_acdimnorz.Active_dioz, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dioz_long, /*f:*/FindOptionSet_acfimnorz.Active_fioz, /*typeFile:*/FindOptionSet_acfimnorz.Active_fioz_long, /*x:*/FindOptionSet_acimnorxz.Active_ioxz, /*typeOther:*/FindOptionSet_acimnorxz.Active_ioxz_long, /*l:*/FindOptionSet_acilmnorz.Active_iloz, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_iloz_long, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeOlder
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeNewer n}, {@link #timeOlder o}.*/
	Active_noz(
		/*i:*/Active_inoz, /*ignoreCase:*/Active_inoz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_norz, /*regex:*/Active_norz_long, /*a:*/FindOptionSet_adfilnorxz.Active_anoz, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_anoz_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cnoz, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cnoz_long, /*m:*/FindOptionSet_dfilmnorxz.Active_mnoz, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_mnoz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_acdimnorz.Active_dnoz, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dnoz_long, /*f:*/FindOptionSet_acfimnorz.Active_fnoz, /*typeFile:*/FindOptionSet_acfimnorz.Active_fnoz_long, /*x:*/FindOptionSet_acimnorxz.Active_noxz, /*typeOther:*/FindOptionSet_acimnorxz.Active_noxz_long, /*l:*/FindOptionSet_acilmnorz.Active_lnoz, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_lnoz_long, 
		true, 
		/*active:*/FindOption.print0, FindOption.timeNewer, FindOption.timeOlder
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeNewer n}, {@link #timeOlder o}.*/
	Active_noz_long(
		/*i:*/Active_inoz, /*ignoreCase:*/Active_inoz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_norz, /*regex:*/Active_norz_long, /*a:*/FindOptionSet_adfilnorxz.Active_anoz, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_anoz_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cnoz, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cnoz_long, /*m:*/FindOptionSet_dfilmnorxz.Active_mnoz, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_mnoz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_acdimnorz.Active_dnoz, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dnoz_long, /*f:*/FindOptionSet_acfimnorz.Active_fnoz, /*typeFile:*/FindOptionSet_acfimnorz.Active_fnoz_long, /*x:*/FindOptionSet_acimnorxz.Active_noxz, /*typeOther:*/FindOptionSet_acimnorxz.Active_noxz_long, /*l:*/FindOptionSet_acilmnorz.Active_lnoz, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_lnoz_long, 
		false, 
		/*active:*/FindOption.print0, FindOption.timeNewer, FindOption.timeOlder
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}.*/
	Active_ir(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_irz, /*print0:*/Active_irz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adfilnorxz.Active_air, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_air_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cir, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cir_long, /*m:*/FindOptionSet_dfilmnorxz.Active_imr, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_imr_long, /*n:*/Active_inr, /*timeNewer:*/Active_inr_long, /*o:*/Active_ior, /*timeOlder:*/Active_ior_long, /*d:*/FindOptionSet_acdimnorz.Active_dir, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dir_long, /*f:*/FindOptionSet_acfimnorz.Active_fir, /*typeFile:*/FindOptionSet_acfimnorz.Active_fir_long, /*x:*/FindOptionSet_acimnorxz.Active_irx, /*typeOther:*/FindOptionSet_acimnorxz.Active_irx_long, /*l:*/FindOptionSet_acilmnorz.Active_ilr, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_ilr_long, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.regex
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}.*/
	Active_ir_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_irz, /*print0:*/Active_irz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adfilnorxz.Active_air, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_air_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cir, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cir_long, /*m:*/FindOptionSet_dfilmnorxz.Active_imr, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_imr_long, /*n:*/Active_inr, /*timeNewer:*/Active_inr_long, /*o:*/Active_ior, /*timeOlder:*/Active_ior_long, /*d:*/FindOptionSet_acdimnorz.Active_dir, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dir_long, /*f:*/FindOptionSet_acfimnorz.Active_fir, /*typeFile:*/FindOptionSet_acfimnorz.Active_fir_long, /*x:*/FindOptionSet_acimnorxz.Active_irx, /*typeOther:*/FindOptionSet_acimnorxz.Active_irx_long, /*l:*/FindOptionSet_acilmnorz.Active_ilr, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_ilr_long, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.regex
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeNewer n}.*/
	Active_nr(
		/*i:*/Active_inr, /*ignoreCase:*/Active_inr_long, /*z:*/Active_nrz, /*print0:*/Active_nrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adfilnorxz.Active_anr, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_anr_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cnr, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cnr_long, /*m:*/FindOptionSet_dfilmnorxz.Active_mnr, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_mnr_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_nor, /*timeOlder:*/Active_nor_long, /*d:*/FindOptionSet_acdimnorz.Active_dnr, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dnr_long, /*f:*/FindOptionSet_acfimnorz.Active_fnr, /*typeFile:*/FindOptionSet_acfimnorz.Active_fnr_long, /*x:*/FindOptionSet_acimnorxz.Active_nrx, /*typeOther:*/FindOptionSet_acimnorxz.Active_nrx_long, /*l:*/FindOptionSet_acilmnorz.Active_lnr, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_lnr_long, 
		true, 
		/*active:*/FindOption.regex, FindOption.timeNewer
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeNewer n}.*/
	Active_nr_long(
		/*i:*/Active_inr, /*ignoreCase:*/Active_inr_long, /*z:*/Active_nrz, /*print0:*/Active_nrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adfilnorxz.Active_anr, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_anr_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cnr, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cnr_long, /*m:*/FindOptionSet_dfilmnorxz.Active_mnr, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_mnr_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_nor, /*timeOlder:*/Active_nor_long, /*d:*/FindOptionSet_acdimnorz.Active_dnr, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dnr_long, /*f:*/FindOptionSet_acfimnorz.Active_fnr, /*typeFile:*/FindOptionSet_acfimnorz.Active_fnr_long, /*x:*/FindOptionSet_acimnorxz.Active_nrx, /*typeOther:*/FindOptionSet_acimnorxz.Active_nrx_long, /*l:*/FindOptionSet_acilmnorz.Active_lnr, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_lnr_long, 
		false, 
		/*active:*/FindOption.regex, FindOption.timeNewer
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeOlder o}.*/
	Active_or(
		/*i:*/Active_ior, /*ignoreCase:*/Active_ior_long, /*z:*/Active_orz, /*print0:*/Active_orz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adfilnorxz.Active_aor, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_aor_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cor, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cor_long, /*m:*/FindOptionSet_dfilmnorxz.Active_mor, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_mor_long, /*n:*/Active_nor, /*timeNewer:*/Active_nor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_acdimnorz.Active_dor, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dor_long, /*f:*/FindOptionSet_acfimnorz.Active_for, /*typeFile:*/FindOptionSet_acfimnorz.Active_for_long, /*x:*/FindOptionSet_acimnorxz.Active_orx, /*typeOther:*/FindOptionSet_acimnorxz.Active_orx_long, /*l:*/FindOptionSet_acilmnorz.Active_lor, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_lor_long, 
		true, 
		/*active:*/FindOption.regex, FindOption.timeOlder
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeOlder o}.*/
	Active_or_long(
		/*i:*/Active_ior, /*ignoreCase:*/Active_ior_long, /*z:*/Active_orz, /*print0:*/Active_orz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adfilnorxz.Active_aor, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_aor_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cor, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cor_long, /*m:*/FindOptionSet_dfilmnorxz.Active_mor, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_mor_long, /*n:*/Active_nor, /*timeNewer:*/Active_nor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_acdimnorz.Active_dor, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dor_long, /*f:*/FindOptionSet_acfimnorz.Active_for, /*typeFile:*/FindOptionSet_acfimnorz.Active_for_long, /*x:*/FindOptionSet_acimnorxz.Active_orx, /*typeOther:*/FindOptionSet_acimnorxz.Active_orx_long, /*l:*/FindOptionSet_acilmnorz.Active_lor, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_lor_long, 
		false, 
		/*active:*/FindOption.regex, FindOption.timeOlder
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}.*/
	Active_rz(
		/*i:*/Active_irz, /*ignoreCase:*/Active_irz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adfilnorxz.Active_arz, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_arz_long, /*c:*/FindOptionSet_cdfilnorxz.Active_crz, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_crz_long, /*m:*/FindOptionSet_dfilmnorxz.Active_mrz, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_mrz_long, /*n:*/Active_nrz, /*timeNewer:*/Active_nrz_long, /*o:*/Active_orz, /*timeOlder:*/Active_orz_long, /*d:*/FindOptionSet_acdimnorz.Active_drz, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_drz_long, /*f:*/FindOptionSet_acfimnorz.Active_frz, /*typeFile:*/FindOptionSet_acfimnorz.Active_frz_long, /*x:*/FindOptionSet_acimnorxz.Active_rxz, /*typeOther:*/FindOptionSet_acimnorxz.Active_rxz_long, /*l:*/FindOptionSet_acilmnorz.Active_lrz, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_lrz_long, 
		true, 
		/*active:*/FindOption.print0, FindOption.regex
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}.*/
	Active_rz_long(
		/*i:*/Active_irz, /*ignoreCase:*/Active_irz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adfilnorxz.Active_arz, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_arz_long, /*c:*/FindOptionSet_cdfilnorxz.Active_crz, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_crz_long, /*m:*/FindOptionSet_dfilmnorxz.Active_mrz, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_mrz_long, /*n:*/Active_nrz, /*timeNewer:*/Active_nrz_long, /*o:*/Active_orz, /*timeOlder:*/Active_orz_long, /*d:*/FindOptionSet_acdimnorz.Active_drz, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_drz_long, /*f:*/FindOptionSet_acfimnorz.Active_frz, /*typeFile:*/FindOptionSet_acfimnorz.Active_frz_long, /*x:*/FindOptionSet_acimnorxz.Active_rxz, /*typeOther:*/FindOptionSet_acimnorxz.Active_rxz_long, /*l:*/FindOptionSet_acilmnorz.Active_lrz, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_lrz_long, 
		false, 
		/*active:*/FindOption.print0, FindOption.regex
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeNewer n}.*/
	Active_in(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_inz, /*print0:*/Active_inz_long, /*r:*/Active_inr, /*regex:*/Active_inr_long, /*a:*/FindOptionSet_adfilnorxz.Active_ain, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_ain_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cin, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cin_long, /*m:*/FindOptionSet_dfilmnorxz.Active_imn, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_imn_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_ino, /*timeOlder:*/Active_ino_long, /*d:*/FindOptionSet_acdimnorz.Active_din, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_din_long, /*f:*/FindOptionSet_acfimnorz.Active_fin, /*typeFile:*/FindOptionSet_acfimnorz.Active_fin_long, /*x:*/FindOptionSet_acimnorxz.Active_inx, /*typeOther:*/FindOptionSet_acimnorxz.Active_inx_long, /*l:*/FindOptionSet_acilmnorz.Active_iln, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_iln_long, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.timeNewer
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeNewer n}.*/
	Active_in_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_inz, /*print0:*/Active_inz_long, /*r:*/Active_inr, /*regex:*/Active_inr_long, /*a:*/FindOptionSet_adfilnorxz.Active_ain, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_ain_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cin, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cin_long, /*m:*/FindOptionSet_dfilmnorxz.Active_imn, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_imn_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_ino, /*timeOlder:*/Active_ino_long, /*d:*/FindOptionSet_acdimnorz.Active_din, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_din_long, /*f:*/FindOptionSet_acfimnorz.Active_fin, /*typeFile:*/FindOptionSet_acfimnorz.Active_fin_long, /*x:*/FindOptionSet_acimnorxz.Active_inx, /*typeOther:*/FindOptionSet_acimnorxz.Active_inx_long, /*l:*/FindOptionSet_acilmnorz.Active_iln, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_iln_long, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.timeNewer
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeOlder o}.*/
	Active_io(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ioz, /*print0:*/Active_ioz_long, /*r:*/Active_ior, /*regex:*/Active_ior_long, /*a:*/FindOptionSet_adfilnorxz.Active_aio, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_aio_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cio, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cio_long, /*m:*/FindOptionSet_dfilmnorxz.Active_imo, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_imo_long, /*n:*/Active_ino, /*timeNewer:*/Active_ino_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_acdimnorz.Active_dio, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dio_long, /*f:*/FindOptionSet_acfimnorz.Active_fio, /*typeFile:*/FindOptionSet_acfimnorz.Active_fio_long, /*x:*/FindOptionSet_acimnorxz.Active_iox, /*typeOther:*/FindOptionSet_acimnorxz.Active_iox_long, /*l:*/FindOptionSet_acilmnorz.Active_ilo, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_ilo_long, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.timeOlder
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeOlder o}.*/
	Active_io_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ioz, /*print0:*/Active_ioz_long, /*r:*/Active_ior, /*regex:*/Active_ior_long, /*a:*/FindOptionSet_adfilnorxz.Active_aio, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_aio_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cio, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cio_long, /*m:*/FindOptionSet_dfilmnorxz.Active_imo, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_imo_long, /*n:*/Active_ino, /*timeNewer:*/Active_ino_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_acdimnorz.Active_dio, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dio_long, /*f:*/FindOptionSet_acfimnorz.Active_fio, /*typeFile:*/FindOptionSet_acfimnorz.Active_fio_long, /*x:*/FindOptionSet_acimnorxz.Active_iox, /*typeOther:*/FindOptionSet_acimnorxz.Active_iox_long, /*l:*/FindOptionSet_acilmnorz.Active_ilo, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_ilo_long, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.timeOlder
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}.*/
	Active_iz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_irz, /*regex:*/Active_irz_long, /*a:*/FindOptionSet_adfilnorxz.Active_aiz, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_aiz_long, /*c:*/FindOptionSet_cdfilnorxz.Active_ciz, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_ciz_long, /*m:*/FindOptionSet_dfilmnorxz.Active_imz, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_imz_long, /*n:*/Active_inz, /*timeNewer:*/Active_inz_long, /*o:*/Active_ioz, /*timeOlder:*/Active_ioz_long, /*d:*/FindOptionSet_acdimnorz.Active_diz, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_diz_long, /*f:*/FindOptionSet_acfimnorz.Active_fiz, /*typeFile:*/FindOptionSet_acfimnorz.Active_fiz_long, /*x:*/FindOptionSet_acimnorxz.Active_ixz, /*typeOther:*/FindOptionSet_acimnorxz.Active_ixz_long, /*l:*/FindOptionSet_acilmnorz.Active_ilz, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_ilz_long, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}.*/
	Active_iz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_irz, /*regex:*/Active_irz_long, /*a:*/FindOptionSet_adfilnorxz.Active_aiz, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_aiz_long, /*c:*/FindOptionSet_cdfilnorxz.Active_ciz, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_ciz_long, /*m:*/FindOptionSet_dfilmnorxz.Active_imz, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_imz_long, /*n:*/Active_inz, /*timeNewer:*/Active_inz_long, /*o:*/Active_ioz, /*timeOlder:*/Active_ioz_long, /*d:*/FindOptionSet_acdimnorz.Active_diz, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_diz_long, /*f:*/FindOptionSet_acfimnorz.Active_fiz, /*typeFile:*/FindOptionSet_acfimnorz.Active_fiz_long, /*x:*/FindOptionSet_acimnorxz.Active_ixz, /*typeOther:*/FindOptionSet_acimnorxz.Active_ixz_long, /*l:*/FindOptionSet_acilmnorz.Active_ilz, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_ilz_long, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0
	),
	/** Option set with the following active options: {@link #timeNewer n}, {@link #timeOlder o}.*/
	Active_no(
		/*i:*/Active_ino, /*ignoreCase:*/Active_ino_long, /*z:*/Active_noz, /*print0:*/Active_noz_long, /*r:*/Active_nor, /*regex:*/Active_nor_long, /*a:*/FindOptionSet_adfilnorxz.Active_ano, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_ano_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cno, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cno_long, /*m:*/FindOptionSet_dfilmnorxz.Active_mno, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_mno_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_acdimnorz.Active_dno, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dno_long, /*f:*/FindOptionSet_acfimnorz.Active_fno, /*typeFile:*/FindOptionSet_acfimnorz.Active_fno_long, /*x:*/FindOptionSet_acimnorxz.Active_nox, /*typeOther:*/FindOptionSet_acimnorxz.Active_nox_long, /*l:*/FindOptionSet_acilmnorz.Active_lno, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_lno_long, 
		true, 
		/*active:*/FindOption.timeNewer, FindOption.timeOlder
	),
	/** Option set with the following active options: {@link #timeNewer n}, {@link #timeOlder o}.*/
	Active_no_long(
		/*i:*/Active_ino, /*ignoreCase:*/Active_ino_long, /*z:*/Active_noz, /*print0:*/Active_noz_long, /*r:*/Active_nor, /*regex:*/Active_nor_long, /*a:*/FindOptionSet_adfilnorxz.Active_ano, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_ano_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cno, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cno_long, /*m:*/FindOptionSet_dfilmnorxz.Active_mno, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_mno_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_acdimnorz.Active_dno, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dno_long, /*f:*/FindOptionSet_acfimnorz.Active_fno, /*typeFile:*/FindOptionSet_acfimnorz.Active_fno_long, /*x:*/FindOptionSet_acimnorxz.Active_nox, /*typeOther:*/FindOptionSet_acimnorxz.Active_nox_long, /*l:*/FindOptionSet_acilmnorz.Active_lno, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_lno_long, 
		false, 
		/*active:*/FindOption.timeNewer, FindOption.timeOlder
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeNewer n}.*/
	Active_nz(
		/*i:*/Active_inz, /*ignoreCase:*/Active_inz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_nrz, /*regex:*/Active_nrz_long, /*a:*/FindOptionSet_adfilnorxz.Active_anz, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_anz_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cnz, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cnz_long, /*m:*/FindOptionSet_dfilmnorxz.Active_mnz, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_mnz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_noz, /*timeOlder:*/Active_noz_long, /*d:*/FindOptionSet_acdimnorz.Active_dnz, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dnz_long, /*f:*/FindOptionSet_acfimnorz.Active_fnz, /*typeFile:*/FindOptionSet_acfimnorz.Active_fnz_long, /*x:*/FindOptionSet_acimnorxz.Active_nxz, /*typeOther:*/FindOptionSet_acimnorxz.Active_nxz_long, /*l:*/FindOptionSet_acilmnorz.Active_lnz, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_lnz_long, 
		true, 
		/*active:*/FindOption.print0, FindOption.timeNewer
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeNewer n}.*/
	Active_nz_long(
		/*i:*/Active_inz, /*ignoreCase:*/Active_inz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_nrz, /*regex:*/Active_nrz_long, /*a:*/FindOptionSet_adfilnorxz.Active_anz, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_anz_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cnz, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cnz_long, /*m:*/FindOptionSet_dfilmnorxz.Active_mnz, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_mnz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_noz, /*timeOlder:*/Active_noz_long, /*d:*/FindOptionSet_acdimnorz.Active_dnz, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dnz_long, /*f:*/FindOptionSet_acfimnorz.Active_fnz, /*typeFile:*/FindOptionSet_acfimnorz.Active_fnz_long, /*x:*/FindOptionSet_acimnorxz.Active_nxz, /*typeOther:*/FindOptionSet_acimnorxz.Active_nxz_long, /*l:*/FindOptionSet_acilmnorz.Active_lnz, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_lnz_long, 
		false, 
		/*active:*/FindOption.print0, FindOption.timeNewer
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeOlder o}.*/
	Active_oz(
		/*i:*/Active_ioz, /*ignoreCase:*/Active_ioz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_orz, /*regex:*/Active_orz_long, /*a:*/FindOptionSet_adfilnorxz.Active_aoz, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_aoz_long, /*c:*/FindOptionSet_cdfilnorxz.Active_coz, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_coz_long, /*m:*/FindOptionSet_dfilmnorxz.Active_moz, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_moz_long, /*n:*/Active_noz, /*timeNewer:*/Active_noz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_acdimnorz.Active_doz, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_doz_long, /*f:*/FindOptionSet_acfimnorz.Active_foz, /*typeFile:*/FindOptionSet_acfimnorz.Active_foz_long, /*x:*/FindOptionSet_acimnorxz.Active_oxz, /*typeOther:*/FindOptionSet_acimnorxz.Active_oxz_long, /*l:*/FindOptionSet_acilmnorz.Active_loz, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_loz_long, 
		true, 
		/*active:*/FindOption.print0, FindOption.timeOlder
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeOlder o}.*/
	Active_oz_long(
		/*i:*/Active_ioz, /*ignoreCase:*/Active_ioz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_orz, /*regex:*/Active_orz_long, /*a:*/FindOptionSet_adfilnorxz.Active_aoz, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_aoz_long, /*c:*/FindOptionSet_cdfilnorxz.Active_coz, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_coz_long, /*m:*/FindOptionSet_dfilmnorxz.Active_moz, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_moz_long, /*n:*/Active_noz, /*timeNewer:*/Active_noz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_acdimnorz.Active_doz, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_doz_long, /*f:*/FindOptionSet_acfimnorz.Active_foz, /*typeFile:*/FindOptionSet_acfimnorz.Active_foz_long, /*x:*/FindOptionSet_acimnorxz.Active_oxz, /*typeOther:*/FindOptionSet_acimnorxz.Active_oxz_long, /*l:*/FindOptionSet_acilmnorz.Active_loz, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_loz_long, 
		false, 
		/*active:*/FindOption.print0, FindOption.timeOlder
	),
	/** Option set with the following active options: {@link #regex r}.*/
	Active_r(
		/*i:*/Active_ir, /*ignoreCase:*/Active_ir_long, /*z:*/Active_rz, /*print0:*/Active_rz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adfilnorxz.Active_ar, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_ar_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cr, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cr_long, /*m:*/FindOptionSet_dfilmnorxz.Active_mr, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_mr_long, /*n:*/Active_nr, /*timeNewer:*/Active_nr_long, /*o:*/Active_or, /*timeOlder:*/Active_or_long, /*d:*/FindOptionSet_acdimnorz.Active_dr, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dr_long, /*f:*/FindOptionSet_acfimnorz.Active_fr, /*typeFile:*/FindOptionSet_acfimnorz.Active_fr_long, /*x:*/FindOptionSet_acimnorxz.Active_rx, /*typeOther:*/FindOptionSet_acimnorxz.Active_rx_long, /*l:*/FindOptionSet_acilmnorz.Active_lr, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_lr_long, 
		true, 
		/*active:*/FindOption.regex
	),
	/** Option set with the following active options: {@link #regex r}.*/
	Active_r_long(
		/*i:*/Active_ir, /*ignoreCase:*/Active_ir_long, /*z:*/Active_rz, /*print0:*/Active_rz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_adfilnorxz.Active_ar, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_ar_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cr, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cr_long, /*m:*/FindOptionSet_dfilmnorxz.Active_mr, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_mr_long, /*n:*/Active_nr, /*timeNewer:*/Active_nr_long, /*o:*/Active_or, /*timeOlder:*/Active_or_long, /*d:*/FindOptionSet_acdimnorz.Active_dr, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dr_long, /*f:*/FindOptionSet_acfimnorz.Active_fr, /*typeFile:*/FindOptionSet_acfimnorz.Active_fr_long, /*x:*/FindOptionSet_acimnorxz.Active_rx, /*typeOther:*/FindOptionSet_acimnorxz.Active_rx_long, /*l:*/FindOptionSet_acilmnorz.Active_lr, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_lr_long, 
		false, 
		/*active:*/FindOption.regex
	),
	/** Option set with the following active options: {@link #ignoreCase i}.*/
	Active_i(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_iz, /*print0:*/Active_iz_long, /*r:*/Active_ir, /*regex:*/Active_ir_long, /*a:*/FindOptionSet_adfilnorxz.Active_ai, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_ai_long, /*c:*/FindOptionSet_cdfilnorxz.Active_ci, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_ci_long, /*m:*/FindOptionSet_dfilmnorxz.Active_im, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_im_long, /*n:*/Active_in, /*timeNewer:*/Active_in_long, /*o:*/Active_io, /*timeOlder:*/Active_io_long, /*d:*/FindOptionSet_acdimnorz.Active_di, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_di_long, /*f:*/FindOptionSet_acfimnorz.Active_fi, /*typeFile:*/FindOptionSet_acfimnorz.Active_fi_long, /*x:*/FindOptionSet_acimnorxz.Active_ix, /*typeOther:*/FindOptionSet_acimnorxz.Active_ix_long, /*l:*/FindOptionSet_acilmnorz.Active_il, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_il_long, 
		true, 
		/*active:*/FindOption.ignoreCase
	),
	/** Option set with the following active options: {@link #ignoreCase i}.*/
	Active_i_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_iz, /*print0:*/Active_iz_long, /*r:*/Active_ir, /*regex:*/Active_ir_long, /*a:*/FindOptionSet_adfilnorxz.Active_ai, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_ai_long, /*c:*/FindOptionSet_cdfilnorxz.Active_ci, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_ci_long, /*m:*/FindOptionSet_dfilmnorxz.Active_im, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_im_long, /*n:*/Active_in, /*timeNewer:*/Active_in_long, /*o:*/Active_io, /*timeOlder:*/Active_io_long, /*d:*/FindOptionSet_acdimnorz.Active_di, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_di_long, /*f:*/FindOptionSet_acfimnorz.Active_fi, /*typeFile:*/FindOptionSet_acfimnorz.Active_fi_long, /*x:*/FindOptionSet_acimnorxz.Active_ix, /*typeOther:*/FindOptionSet_acimnorxz.Active_ix_long, /*l:*/FindOptionSet_acilmnorz.Active_il, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_il_long, 
		false, 
		/*active:*/FindOption.ignoreCase
	),
	/** Option set with the following active options: {@link #timeNewer n}.*/
	Active_n(
		/*i:*/Active_in, /*ignoreCase:*/Active_in_long, /*z:*/Active_nz, /*print0:*/Active_nz_long, /*r:*/Active_nr, /*regex:*/Active_nr_long, /*a:*/FindOptionSet_adfilnorxz.Active_an, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_an_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cn, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cn_long, /*m:*/FindOptionSet_dfilmnorxz.Active_mn, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_mn_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_no, /*timeOlder:*/Active_no_long, /*d:*/FindOptionSet_acdimnorz.Active_dn, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dn_long, /*f:*/FindOptionSet_acfimnorz.Active_fn, /*typeFile:*/FindOptionSet_acfimnorz.Active_fn_long, /*x:*/FindOptionSet_acimnorxz.Active_nx, /*typeOther:*/FindOptionSet_acimnorxz.Active_nx_long, /*l:*/FindOptionSet_acilmnorz.Active_ln, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_ln_long, 
		true, 
		/*active:*/FindOption.timeNewer
	),
	/** Option set with the following active options: {@link #timeNewer n}.*/
	Active_n_long(
		/*i:*/Active_in, /*ignoreCase:*/Active_in_long, /*z:*/Active_nz, /*print0:*/Active_nz_long, /*r:*/Active_nr, /*regex:*/Active_nr_long, /*a:*/FindOptionSet_adfilnorxz.Active_an, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_an_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cn, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cn_long, /*m:*/FindOptionSet_dfilmnorxz.Active_mn, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_mn_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_no, /*timeOlder:*/Active_no_long, /*d:*/FindOptionSet_acdimnorz.Active_dn, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dn_long, /*f:*/FindOptionSet_acfimnorz.Active_fn, /*typeFile:*/FindOptionSet_acfimnorz.Active_fn_long, /*x:*/FindOptionSet_acimnorxz.Active_nx, /*typeOther:*/FindOptionSet_acimnorxz.Active_nx_long, /*l:*/FindOptionSet_acilmnorz.Active_ln, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_ln_long, 
		false, 
		/*active:*/FindOption.timeNewer
	),
	/** Option set with the following active options: {@link #timeOlder o}.*/
	Active_o(
		/*i:*/Active_io, /*ignoreCase:*/Active_io_long, /*z:*/Active_oz, /*print0:*/Active_oz_long, /*r:*/Active_or, /*regex:*/Active_or_long, /*a:*/FindOptionSet_adfilnorxz.Active_ao, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_ao_long, /*c:*/FindOptionSet_cdfilnorxz.Active_co, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_co_long, /*m:*/FindOptionSet_dfilmnorxz.Active_mo, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_mo_long, /*n:*/Active_no, /*timeNewer:*/Active_no_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_acdimnorz.Active_do, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_do_long, /*f:*/FindOptionSet_acfimnorz.Active_fo, /*typeFile:*/FindOptionSet_acfimnorz.Active_fo_long, /*x:*/FindOptionSet_acimnorxz.Active_ox, /*typeOther:*/FindOptionSet_acimnorxz.Active_ox_long, /*l:*/FindOptionSet_acilmnorz.Active_lo, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_lo_long, 
		true, 
		/*active:*/FindOption.timeOlder
	),
	/** Option set with the following active options: {@link #timeOlder o}.*/
	Active_o_long(
		/*i:*/Active_io, /*ignoreCase:*/Active_io_long, /*z:*/Active_oz, /*print0:*/Active_oz_long, /*r:*/Active_or, /*regex:*/Active_or_long, /*a:*/FindOptionSet_adfilnorxz.Active_ao, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_ao_long, /*c:*/FindOptionSet_cdfilnorxz.Active_co, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_co_long, /*m:*/FindOptionSet_dfilmnorxz.Active_mo, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_mo_long, /*n:*/Active_no, /*timeNewer:*/Active_no_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/FindOptionSet_acdimnorz.Active_do, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_do_long, /*f:*/FindOptionSet_acfimnorz.Active_fo, /*typeFile:*/FindOptionSet_acfimnorz.Active_fo_long, /*x:*/FindOptionSet_acimnorxz.Active_ox, /*typeOther:*/FindOptionSet_acimnorxz.Active_ox_long, /*l:*/FindOptionSet_acilmnorz.Active_lo, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_lo_long, 
		false, 
		/*active:*/FindOption.timeOlder
	),
	/** Option set with the following active options: {@link #print0 z}.*/
	Active_z(
		/*i:*/Active_iz, /*ignoreCase:*/Active_iz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_rz, /*regex:*/Active_rz_long, /*a:*/FindOptionSet_adfilnorxz.Active_az, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_az_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cz, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cz_long, /*m:*/FindOptionSet_dfilmnorxz.Active_mz, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_mz_long, /*n:*/Active_nz, /*timeNewer:*/Active_nz_long, /*o:*/Active_oz, /*timeOlder:*/Active_oz_long, /*d:*/FindOptionSet_acdimnorz.Active_dz, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dz_long, /*f:*/FindOptionSet_acfimnorz.Active_fz, /*typeFile:*/FindOptionSet_acfimnorz.Active_fz_long, /*x:*/FindOptionSet_acimnorxz.Active_xz, /*typeOther:*/FindOptionSet_acimnorxz.Active_xz_long, /*l:*/FindOptionSet_acilmnorz.Active_lz, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_lz_long, 
		true, 
		/*active:*/FindOption.print0
	),
	/** Option set with the following active options: {@link #print0 z}.*/
	Active_z_long(
		/*i:*/Active_iz, /*ignoreCase:*/Active_iz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_rz, /*regex:*/Active_rz_long, /*a:*/FindOptionSet_adfilnorxz.Active_az, /*timeAccess:*/FindOptionSet_adfilnorxz.Active_az_long, /*c:*/FindOptionSet_cdfilnorxz.Active_cz, /*timeCreate:*/FindOptionSet_cdfilnorxz.Active_cz_long, /*m:*/FindOptionSet_dfilmnorxz.Active_mz, /*timeModified:*/FindOptionSet_dfilmnorxz.Active_mz_long, /*n:*/Active_nz, /*timeNewer:*/Active_nz_long, /*o:*/Active_oz, /*timeOlder:*/Active_oz_long, /*d:*/FindOptionSet_acdimnorz.Active_dz, /*typeDirectory:*/FindOptionSet_acdimnorz.Active_dz_long, /*f:*/FindOptionSet_acfimnorz.Active_fz, /*typeFile:*/FindOptionSet_acfimnorz.Active_fz_long, /*x:*/FindOptionSet_acimnorxz.Active_xz, /*typeOther:*/FindOptionSet_acimnorxz.Active_xz_long, /*l:*/FindOptionSet_acilmnorz.Active_lz, /*typeSymlink:*/FindOptionSet_acilmnorz.Active_lz_long, 
		false, 
		/*active:*/FindOption.print0
	);
	private FindOptionSet_acdfilmnorxz(
		FindOptionSet_acdfilmnorxz i, FindOptionSet_acdfilmnorxz ignoreCase, FindOptionSet_acdfilmnorxz z, FindOptionSet_acdfilmnorxz print0, FindOptionSet_acdfilmnorxz r, FindOptionSet_acdfilmnorxz regex, FindOptionSet_adfilnorxz a, FindOptionSet_adfilnorxz timeAccess, FindOptionSet_cdfilnorxz c, FindOptionSet_cdfilnorxz timeCreate, FindOptionSet_dfilmnorxz m, FindOptionSet_dfilmnorxz timeModified, FindOptionSet_acdfilmnorxz n, FindOptionSet_acdfilmnorxz timeNewer, FindOptionSet_acdfilmnorxz o, FindOptionSet_acdfilmnorxz timeOlder, FindOptionSet_acdimnorz d, FindOptionSet_acdimnorz typeDirectory, FindOptionSet_acfimnorz f, FindOptionSet_acfimnorz typeFile, FindOptionSet_acimnorxz x, FindOptionSet_acimnorxz typeOther, FindOptionSet_acilmnorz l, FindOptionSet_acilmnorz typeSymlink, 
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
	private final boolean useAcronym;
	/**
	 * Option {@code "-i"}: Use case insensitive matching when applying the file name pattern
			specified by the name operand
<p>
			(This option is ignored if no name operand is specified).
	 * <p>
	 * The option {@code "-i"} is equivalent to the {@code "--}{@link #ignoreCase ignoreCase}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "-i"}. If the option {@code "-i"}
	 * is already set, the field {@code i} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final FindOptionSet_acdfilmnorxz i;
	/**
	 * Option {@code "--ignoreCase"}: Use case insensitive matching when applying the file name pattern
			specified by the name operand
<p>
			(This option is ignored if no name operand is specified).
	 * <p>
	 * The option {@code "--ignoreCase"} is equivalent to the {@code "-}{@link #i i}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "--ignoreCase"}. If the option {@code "--ignoreCase"}
	 * is already set, the field {@code ignoreCase} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final FindOptionSet_acdfilmnorxz ignoreCase;
	/**
	 * Option {@code "-z"}: Print the full file name on the standard output, followed by a null 
			character (instead of the newline character used by default). This
			allows file names that contain newlines or other types of white 
			space to be correctly interpreted by programs that process the find 
			output. This option corresponds to the --delimiter0 option of xargs.
	 * <p>
	 * The option {@code "-z"} is equivalent to the {@code "--}{@link #print0 print0}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "-z"}. If the option {@code "-z"}
	 * is already set, the field {@code z} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final FindOptionSet_acdfilmnorxz z;
	/**
	 * Option {@code "--print0"}: Print the full file name on the standard output, followed by a null 
			character (instead of the newline character used by default). This
			allows file names that contain newlines or other types of white 
			space to be correctly interpreted by programs that process the find 
			output. This option corresponds to the --delimiter0 option of xargs.
	 * <p>
	 * The option {@code "--print0"} is equivalent to the {@code "-}{@link #z z}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "--print0"}. If the option {@code "--print0"}
	 * is already set, the field {@code print0} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final FindOptionSet_acdfilmnorxz print0;
	/**
	 * Option {@code "-r"}: Use full regular expression syntax for the patterns specified by the
			name operand
<p>
			(This option is ignored if no name operand is specified).
	 * <p>
	 * The option {@code "-r"} is equivalent to the {@code "--}{@link #regex regex}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "-r"}. If the option {@code "-r"}
	 * is already set, the field {@code r} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final FindOptionSet_acdfilmnorxz r;
	/**
	 * Option {@code "--regex"}: Use full regular expression syntax for the patterns specified by the
			name operand
<p>
			(This option is ignored if no name operand is specified).
	 * <p>
	 * The option {@code "--regex"} is equivalent to the {@code "-}{@link #r r}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "--regex"}. If the option {@code "--regex"}
	 * is already set, the field {@code regex} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final FindOptionSet_acdfilmnorxz regex;
	/**
	 * Option {@code "-a"}: The time operand refers to the last access time of the file
			<p>
			(This option is ignored if no time operand is specified).
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
			<p>
			(This option is ignored if no time operand is specified).
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
	 * Option {@code "-c"}: The time operand refers to the creation time of the file
			<p>
			(This option is ignored if no time operand is specified).
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
			<p>
			(This option is ignored if no time operand is specified).
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
	 * Option {@code "-m"}: The time operand refers to the last modification time of the file
			(the default)
			<p>
			(This option is ignored if no time operand is specified).
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
			(the default)
			<p>
			(This option is ignored if no time operand is specified).
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
			after or at the time specified by the time operand (the default)
			<p>
			(This option is ignored if no time operand is specified).
	 * <p>
	 * The option {@code "-n"} is equivalent to the {@code "--}{@link #timeNewer timeNewer}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "-n"}. If the option {@code "-n"}
	 * is already set, the field {@code n} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final FindOptionSet_acdfilmnorxz n;
	/**
	 * Option {@code "--timeNewer"}: Consider only files that have been created, modified or accessed
			after or at the time specified by the time operand (the default)
			<p>
			(This option is ignored if no time operand is specified).
	 * <p>
	 * The option {@code "--timeNewer"} is equivalent to the {@code "-}{@link #n n}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "--timeNewer"}. If the option {@code "--timeNewer"}
	 * is already set, the field {@code timeNewer} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final FindOptionSet_acdfilmnorxz timeNewer;
	/**
	 * Option {@code "-o"}: Consider only files that have been created, modified or accessed
			before or at the time specified by the time operand
			<p>
			(This option is ignored if no time operand is specified).
	 * <p>
	 * The option {@code "-o"} is equivalent to the {@code "--}{@link #timeOlder timeOlder}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "-o"}. If the option {@code "-o"}
	 * is already set, the field {@code o} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final FindOptionSet_acdfilmnorxz o;
	/**
	 * Option {@code "--timeOlder"}: Consider only files that have been created, modified or accessed
			before or at the time specified by the time operand
			<p>
			(This option is ignored if no time operand is specified).
	 * <p>
	 * The option {@code "--timeOlder"} is equivalent to the {@code "-}{@link #o o}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "--timeOlder"}. If the option {@code "--timeOlder"}
	 * is already set, the field {@code timeOlder} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final FindOptionSet_acdfilmnorxz timeOlder;
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
	public final FindOptionSet_acfimnorz f;
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
	public final FindOptionSet_acfimnorz typeFile;
	/**
	 * Option {@code "-x"}: Consider only files that are neither of directory (d), 
			regular file (f) or symlink (l).
	 * <p>
	 * The option {@code "-x"} is equivalent to the {@code "--}{@link #typeOther typeOther}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "-x"}. If the option {@code "-x"}
	 * is already set, the field {@code x} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final FindOptionSet_acimnorxz x;
	/**
	 * Option {@code "--typeOther"}: Consider only files that are neither of directory (d), 
			regular file (f) or symlink (l).
	 * <p>
	 * The option {@code "--typeOther"} is equivalent to the {@code "-}{@link #x x}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "--typeOther"}. If the option {@code "--typeOther"}
	 * is already set, the field {@code typeOther} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final FindOptionSet_acimnorxz typeOther;
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
	public final FindOptionSet_acilmnorz l;
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
	public final FindOptionSet_acilmnorz typeSymlink;
	private final EnumSet<FindOption> options;
	
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
	 * Checks that the given {@code value} is not null and throws an exception 
	 * otherwise.
	 * 
	 * @param the value to check
	 * @return the given {@code value} if it is not null
	 * @throws NullPointerException if {@code value==null} 
	 */
	private static <T> T notNull(T value) {
		if (value != null) return value;
		throw new NullPointerException();
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
	 *    FindOptionSet_acdfilmnorxz.ignoreCase.z;
	 * </pre>
	 * uses acronyms, that is, this method always returns true for the above 
	 * set. 
	 * <p>
	 * On the other hand, long option names are used and this method always 
	 * returns false for the set
	 * <pre>
	 *    FindOptionSet_acdfilmnorxz.i.print0;
	 * </pre>
	 * <p>
	 * Note that a repeated option is <i>not</i> treated as the last set option.
	 * For instance, the first and last option of the following set are 
	 * equivalent and acronyms are used:
	 * <pre>
	 *    FindOptionSet_acdfilmnorxz.i.z.ignoreCase;
	 * </pre>
	 * <p>
	 * This method always returns true for the empty set with no active options.
	 *  
	 * @param option
	 *            the option of interest, has no impact on the result returned
	 *            by this method
	 * @return true if option acronyms should be used for string representations
	 *         of any option of this option set
	 */
	@Override
	public boolean useAcronymFor(FindOption option) {
		return useAcronym;
	}
}
