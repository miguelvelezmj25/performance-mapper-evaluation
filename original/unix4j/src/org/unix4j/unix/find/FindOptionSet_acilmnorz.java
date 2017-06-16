package org.unix4j.unix.find;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import org.unix4j.option.Option;

import org.unix4j.unix.Find;

/**
 * Option sets for the {@link Find find} command with 
 * the following options: {@link #i i}, {@link #z z}, {@link #r r}, {@link #a a}, {@link #c c}, {@link #m m}, {@link #n n}, {@link #o o}, {@link #l l}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Find#Options} should be used instead to specify command 
 * options. See also {@link org.unix4j.unix.find.FindOptions} for more information.
 */
public enum FindOptionSet_acilmnorz implements FindOptions {
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_ilnorz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ailnorz.Active_ailnorz, /*timeAccess:*/FindOptionSet_ailnorz.Active_ailnorz_long, /*c:*/FindOptionSet_cilnorz.Active_cilnorz, /*timeCreate:*/FindOptionSet_cilnorz.Active_cilnorz_long, /*m:*/FindOptionSet_ilmnorz.Active_ilmnorz, /*timeModified:*/FindOptionSet_ilmnorz.Active_ilmnorz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_ilnorz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ailnorz.Active_ailnorz, /*timeAccess:*/FindOptionSet_ailnorz.Active_ailnorz_long, /*c:*/FindOptionSet_cilnorz.Active_cilnorz, /*timeCreate:*/FindOptionSet_cilnorz.Active_cilnorz_long, /*m:*/FindOptionSet_ilmnorz.Active_ilmnorz, /*timeModified:*/FindOptionSet_ilmnorz.Active_ilmnorz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_ilnor(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ilnorz, /*print0:*/Active_ilnorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ailnorz.Active_ailnor, /*timeAccess:*/FindOptionSet_ailnorz.Active_ailnor_long, /*c:*/FindOptionSet_cilnorz.Active_cilnor, /*timeCreate:*/FindOptionSet_cilnorz.Active_cilnor_long, /*m:*/FindOptionSet_ilmnorz.Active_ilmnor, /*timeModified:*/FindOptionSet_ilmnorz.Active_ilmnor_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_ilnor_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ilnorz, /*print0:*/Active_ilnorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ailnorz.Active_ailnor, /*timeAccess:*/FindOptionSet_ailnorz.Active_ailnor_long, /*c:*/FindOptionSet_cilnorz.Active_cilnor, /*timeCreate:*/FindOptionSet_cilnorz.Active_cilnor_long, /*m:*/FindOptionSet_ilmnorz.Active_ilmnor, /*timeModified:*/FindOptionSet_ilmnorz.Active_ilmnor_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeNewer n}, {@link #typeSymlink l}.*/
	Active_ilnrz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ailnorz.Active_ailnrz, /*timeAccess:*/FindOptionSet_ailnorz.Active_ailnrz_long, /*c:*/FindOptionSet_cilnorz.Active_cilnrz, /*timeCreate:*/FindOptionSet_cilnorz.Active_cilnrz_long, /*m:*/FindOptionSet_ilmnorz.Active_ilmnrz, /*timeModified:*/FindOptionSet_ilmnorz.Active_ilmnrz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_ilnorz, /*timeOlder:*/Active_ilnorz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeNewer, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeNewer n}, {@link #typeSymlink l}.*/
	Active_ilnrz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ailnorz.Active_ailnrz, /*timeAccess:*/FindOptionSet_ailnorz.Active_ailnrz_long, /*c:*/FindOptionSet_cilnorz.Active_cilnrz, /*timeCreate:*/FindOptionSet_cilnorz.Active_cilnrz_long, /*m:*/FindOptionSet_ilmnorz.Active_ilmnrz, /*timeModified:*/FindOptionSet_ilmnorz.Active_ilmnrz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_ilnorz, /*timeOlder:*/Active_ilnorz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeNewer, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_ilorz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ailnorz.Active_ailorz, /*timeAccess:*/FindOptionSet_ailnorz.Active_ailorz_long, /*c:*/FindOptionSet_cilnorz.Active_cilorz, /*timeCreate:*/FindOptionSet_cilnorz.Active_cilorz_long, /*m:*/FindOptionSet_ilmnorz.Active_ilmorz, /*timeModified:*/FindOptionSet_ilmnorz.Active_ilmorz_long, /*n:*/Active_ilnorz, /*timeNewer:*/Active_ilnorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_ilorz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ailnorz.Active_ailorz, /*timeAccess:*/FindOptionSet_ailnorz.Active_ailorz_long, /*c:*/FindOptionSet_cilnorz.Active_cilorz, /*timeCreate:*/FindOptionSet_cilnorz.Active_cilorz_long, /*m:*/FindOptionSet_ilmnorz.Active_ilmorz, /*timeModified:*/FindOptionSet_ilmnorz.Active_ilmorz_long, /*n:*/Active_ilnorz, /*timeNewer:*/Active_ilnorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_lnorz(
		/*i:*/Active_ilnorz, /*ignoreCase:*/Active_ilnorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ailnorz.Active_alnorz, /*timeAccess:*/FindOptionSet_ailnorz.Active_alnorz_long, /*c:*/FindOptionSet_cilnorz.Active_clnorz, /*timeCreate:*/FindOptionSet_cilnorz.Active_clnorz_long, /*m:*/FindOptionSet_ilmnorz.Active_lmnorz, /*timeModified:*/FindOptionSet_ilmnorz.Active_lmnorz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_lnorz_long(
		/*i:*/Active_ilnorz, /*ignoreCase:*/Active_ilnorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ailnorz.Active_alnorz, /*timeAccess:*/FindOptionSet_ailnorz.Active_alnorz_long, /*c:*/FindOptionSet_cilnorz.Active_clnorz, /*timeCreate:*/FindOptionSet_cilnorz.Active_clnorz_long, /*m:*/FindOptionSet_ilmnorz.Active_lmnorz, /*timeModified:*/FindOptionSet_ilmnorz.Active_lmnorz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_ilnoz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_ilnorz, /*regex:*/Active_ilnorz_long, /*a:*/FindOptionSet_ailnorz.Active_ailnoz, /*timeAccess:*/FindOptionSet_ailnorz.Active_ailnoz_long, /*c:*/FindOptionSet_cilnorz.Active_cilnoz, /*timeCreate:*/FindOptionSet_cilnorz.Active_cilnoz_long, /*m:*/FindOptionSet_ilmnorz.Active_ilmnoz, /*timeModified:*/FindOptionSet_ilmnorz.Active_ilmnoz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_ilnoz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_ilnorz, /*regex:*/Active_ilnorz_long, /*a:*/FindOptionSet_ailnorz.Active_ailnoz, /*timeAccess:*/FindOptionSet_ailnorz.Active_ailnoz_long, /*c:*/FindOptionSet_cilnorz.Active_cilnoz, /*timeCreate:*/FindOptionSet_cilnorz.Active_cilnoz_long, /*m:*/FindOptionSet_ilmnorz.Active_ilmnoz, /*timeModified:*/FindOptionSet_ilmnorz.Active_ilmnoz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeNewer n}, {@link #typeSymlink l}.*/
	Active_ilnr(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ilnrz, /*print0:*/Active_ilnrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ailnorz.Active_ailnr, /*timeAccess:*/FindOptionSet_ailnorz.Active_ailnr_long, /*c:*/FindOptionSet_cilnorz.Active_cilnr, /*timeCreate:*/FindOptionSet_cilnorz.Active_cilnr_long, /*m:*/FindOptionSet_ilmnorz.Active_ilmnr, /*timeModified:*/FindOptionSet_ilmnorz.Active_ilmnr_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_ilnor, /*timeOlder:*/Active_ilnor_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeNewer, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeNewer n}, {@link #typeSymlink l}.*/
	Active_ilnr_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ilnrz, /*print0:*/Active_ilnrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ailnorz.Active_ailnr, /*timeAccess:*/FindOptionSet_ailnorz.Active_ailnr_long, /*c:*/FindOptionSet_cilnorz.Active_cilnr, /*timeCreate:*/FindOptionSet_cilnorz.Active_cilnr_long, /*m:*/FindOptionSet_ilmnorz.Active_ilmnr, /*timeModified:*/FindOptionSet_ilmnorz.Active_ilmnr_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_ilnor, /*timeOlder:*/Active_ilnor_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeNewer, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_ilor(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ilorz, /*print0:*/Active_ilorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ailnorz.Active_ailor, /*timeAccess:*/FindOptionSet_ailnorz.Active_ailor_long, /*c:*/FindOptionSet_cilnorz.Active_cilor, /*timeCreate:*/FindOptionSet_cilnorz.Active_cilor_long, /*m:*/FindOptionSet_ilmnorz.Active_ilmor, /*timeModified:*/FindOptionSet_ilmnorz.Active_ilmor_long, /*n:*/Active_ilnor, /*timeNewer:*/Active_ilnor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_ilor_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ilorz, /*print0:*/Active_ilorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ailnorz.Active_ailor, /*timeAccess:*/FindOptionSet_ailnorz.Active_ailor_long, /*c:*/FindOptionSet_cilnorz.Active_cilor, /*timeCreate:*/FindOptionSet_cilnorz.Active_cilor_long, /*m:*/FindOptionSet_ilmnorz.Active_ilmor, /*timeModified:*/FindOptionSet_ilmnorz.Active_ilmor_long, /*n:*/Active_ilnor, /*timeNewer:*/Active_ilnor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #typeSymlink l}.*/
	Active_ilrz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ailnorz.Active_ailrz, /*timeAccess:*/FindOptionSet_ailnorz.Active_ailrz_long, /*c:*/FindOptionSet_cilnorz.Active_cilrz, /*timeCreate:*/FindOptionSet_cilnorz.Active_cilrz_long, /*m:*/FindOptionSet_ilmnorz.Active_ilmrz, /*timeModified:*/FindOptionSet_ilmnorz.Active_ilmrz_long, /*n:*/Active_ilnrz, /*timeNewer:*/Active_ilnrz_long, /*o:*/Active_ilorz, /*timeOlder:*/Active_ilorz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #typeSymlink l}.*/
	Active_ilrz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ailnorz.Active_ailrz, /*timeAccess:*/FindOptionSet_ailnorz.Active_ailrz_long, /*c:*/FindOptionSet_cilnorz.Active_cilrz, /*timeCreate:*/FindOptionSet_cilnorz.Active_cilrz_long, /*m:*/FindOptionSet_ilmnorz.Active_ilmrz, /*timeModified:*/FindOptionSet_ilmnorz.Active_ilmrz_long, /*n:*/Active_ilnrz, /*timeNewer:*/Active_ilnrz_long, /*o:*/Active_ilorz, /*timeOlder:*/Active_ilorz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_lnor(
		/*i:*/Active_ilnor, /*ignoreCase:*/Active_ilnor_long, /*z:*/Active_lnorz, /*print0:*/Active_lnorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ailnorz.Active_alnor, /*timeAccess:*/FindOptionSet_ailnorz.Active_alnor_long, /*c:*/FindOptionSet_cilnorz.Active_clnor, /*timeCreate:*/FindOptionSet_cilnorz.Active_clnor_long, /*m:*/FindOptionSet_ilmnorz.Active_lmnor, /*timeModified:*/FindOptionSet_ilmnorz.Active_lmnor_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.regex, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_lnor_long(
		/*i:*/Active_ilnor, /*ignoreCase:*/Active_ilnor_long, /*z:*/Active_lnorz, /*print0:*/Active_lnorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ailnorz.Active_alnor, /*timeAccess:*/FindOptionSet_ailnorz.Active_alnor_long, /*c:*/FindOptionSet_cilnorz.Active_clnor, /*timeCreate:*/FindOptionSet_cilnorz.Active_clnor_long, /*m:*/FindOptionSet_ilmnorz.Active_lmnor, /*timeModified:*/FindOptionSet_ilmnorz.Active_lmnor_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.regex, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeNewer n}, {@link #typeSymlink l}.*/
	Active_lnrz(
		/*i:*/Active_ilnrz, /*ignoreCase:*/Active_ilnrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ailnorz.Active_alnrz, /*timeAccess:*/FindOptionSet_ailnorz.Active_alnrz_long, /*c:*/FindOptionSet_cilnorz.Active_clnrz, /*timeCreate:*/FindOptionSet_cilnorz.Active_clnrz_long, /*m:*/FindOptionSet_ilmnorz.Active_lmnrz, /*timeModified:*/FindOptionSet_ilmnorz.Active_lmnrz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_lnorz, /*timeOlder:*/Active_lnorz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeNewer, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeNewer n}, {@link #typeSymlink l}.*/
	Active_lnrz_long(
		/*i:*/Active_ilnrz, /*ignoreCase:*/Active_ilnrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ailnorz.Active_alnrz, /*timeAccess:*/FindOptionSet_ailnorz.Active_alnrz_long, /*c:*/FindOptionSet_cilnorz.Active_clnrz, /*timeCreate:*/FindOptionSet_cilnorz.Active_clnrz_long, /*m:*/FindOptionSet_ilmnorz.Active_lmnrz, /*timeModified:*/FindOptionSet_ilmnorz.Active_lmnrz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_lnorz, /*timeOlder:*/Active_lnorz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeNewer, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_lorz(
		/*i:*/Active_ilorz, /*ignoreCase:*/Active_ilorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ailnorz.Active_alorz, /*timeAccess:*/FindOptionSet_ailnorz.Active_alorz_long, /*c:*/FindOptionSet_cilnorz.Active_clorz, /*timeCreate:*/FindOptionSet_cilnorz.Active_clorz_long, /*m:*/FindOptionSet_ilmnorz.Active_lmorz, /*timeModified:*/FindOptionSet_ilmnorz.Active_lmorz_long, /*n:*/Active_lnorz, /*timeNewer:*/Active_lnorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_lorz_long(
		/*i:*/Active_ilorz, /*ignoreCase:*/Active_ilorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ailnorz.Active_alorz, /*timeAccess:*/FindOptionSet_ailnorz.Active_alorz_long, /*c:*/FindOptionSet_cilnorz.Active_clorz, /*timeCreate:*/FindOptionSet_cilnorz.Active_clorz_long, /*m:*/FindOptionSet_ilmnorz.Active_lmorz, /*timeModified:*/FindOptionSet_ilmnorz.Active_lmorz_long, /*n:*/Active_lnorz, /*timeNewer:*/Active_lnorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_ilno(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ilnoz, /*print0:*/Active_ilnoz_long, /*r:*/Active_ilnor, /*regex:*/Active_ilnor_long, /*a:*/FindOptionSet_ailnorz.Active_ailno, /*timeAccess:*/FindOptionSet_ailnorz.Active_ailno_long, /*c:*/FindOptionSet_cilnorz.Active_cilno, /*timeCreate:*/FindOptionSet_cilnorz.Active_cilno_long, /*m:*/FindOptionSet_ilmnorz.Active_ilmno, /*timeModified:*/FindOptionSet_ilmnorz.Active_ilmno_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_ilno_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ilnoz, /*print0:*/Active_ilnoz_long, /*r:*/Active_ilnor, /*regex:*/Active_ilnor_long, /*a:*/FindOptionSet_ailnorz.Active_ailno, /*timeAccess:*/FindOptionSet_ailnorz.Active_ailno_long, /*c:*/FindOptionSet_cilnorz.Active_cilno, /*timeCreate:*/FindOptionSet_cilnorz.Active_cilno_long, /*m:*/FindOptionSet_ilmnorz.Active_ilmno, /*timeModified:*/FindOptionSet_ilmnorz.Active_ilmno_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeNewer n}, {@link #typeSymlink l}.*/
	Active_ilnz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_ilnrz, /*regex:*/Active_ilnrz_long, /*a:*/FindOptionSet_ailnorz.Active_ailnz, /*timeAccess:*/FindOptionSet_ailnorz.Active_ailnz_long, /*c:*/FindOptionSet_cilnorz.Active_cilnz, /*timeCreate:*/FindOptionSet_cilnorz.Active_cilnz_long, /*m:*/FindOptionSet_ilmnorz.Active_ilmnz, /*timeModified:*/FindOptionSet_ilmnorz.Active_ilmnz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_ilnoz, /*timeOlder:*/Active_ilnoz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeNewer, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeNewer n}, {@link #typeSymlink l}.*/
	Active_ilnz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_ilnrz, /*regex:*/Active_ilnrz_long, /*a:*/FindOptionSet_ailnorz.Active_ailnz, /*timeAccess:*/FindOptionSet_ailnorz.Active_ailnz_long, /*c:*/FindOptionSet_cilnorz.Active_cilnz, /*timeCreate:*/FindOptionSet_cilnorz.Active_cilnz_long, /*m:*/FindOptionSet_ilmnorz.Active_ilmnz, /*timeModified:*/FindOptionSet_ilmnorz.Active_ilmnz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_ilnoz, /*timeOlder:*/Active_ilnoz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeNewer, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_iloz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_ilorz, /*regex:*/Active_ilorz_long, /*a:*/FindOptionSet_ailnorz.Active_ailoz, /*timeAccess:*/FindOptionSet_ailnorz.Active_ailoz_long, /*c:*/FindOptionSet_cilnorz.Active_ciloz, /*timeCreate:*/FindOptionSet_cilnorz.Active_ciloz_long, /*m:*/FindOptionSet_ilmnorz.Active_ilmoz, /*timeModified:*/FindOptionSet_ilmnorz.Active_ilmoz_long, /*n:*/Active_ilnoz, /*timeNewer:*/Active_ilnoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_iloz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_ilorz, /*regex:*/Active_ilorz_long, /*a:*/FindOptionSet_ailnorz.Active_ailoz, /*timeAccess:*/FindOptionSet_ailnorz.Active_ailoz_long, /*c:*/FindOptionSet_cilnorz.Active_ciloz, /*timeCreate:*/FindOptionSet_cilnorz.Active_ciloz_long, /*m:*/FindOptionSet_ilmnorz.Active_ilmoz, /*timeModified:*/FindOptionSet_ilmnorz.Active_ilmoz_long, /*n:*/Active_ilnoz, /*timeNewer:*/Active_ilnoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_lnoz(
		/*i:*/Active_ilnoz, /*ignoreCase:*/Active_ilnoz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_lnorz, /*regex:*/Active_lnorz_long, /*a:*/FindOptionSet_ailnorz.Active_alnoz, /*timeAccess:*/FindOptionSet_ailnorz.Active_alnoz_long, /*c:*/FindOptionSet_cilnorz.Active_clnoz, /*timeCreate:*/FindOptionSet_cilnorz.Active_clnoz_long, /*m:*/FindOptionSet_ilmnorz.Active_lmnoz, /*timeModified:*/FindOptionSet_ilmnorz.Active_lmnoz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_lnoz_long(
		/*i:*/Active_ilnoz, /*ignoreCase:*/Active_ilnoz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_lnorz, /*regex:*/Active_lnorz_long, /*a:*/FindOptionSet_ailnorz.Active_alnoz, /*timeAccess:*/FindOptionSet_ailnorz.Active_alnoz_long, /*c:*/FindOptionSet_cilnorz.Active_clnoz, /*timeCreate:*/FindOptionSet_cilnorz.Active_clnoz_long, /*m:*/FindOptionSet_ilmnorz.Active_lmnoz, /*timeModified:*/FindOptionSet_ilmnorz.Active_lmnoz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #typeSymlink l}.*/
	Active_ilr(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ilrz, /*print0:*/Active_ilrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ailnorz.Active_ailr, /*timeAccess:*/FindOptionSet_ailnorz.Active_ailr_long, /*c:*/FindOptionSet_cilnorz.Active_cilr, /*timeCreate:*/FindOptionSet_cilnorz.Active_cilr_long, /*m:*/FindOptionSet_ilmnorz.Active_ilmr, /*timeModified:*/FindOptionSet_ilmnorz.Active_ilmr_long, /*n:*/Active_ilnr, /*timeNewer:*/Active_ilnr_long, /*o:*/Active_ilor, /*timeOlder:*/Active_ilor_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #typeSymlink l}.*/
	Active_ilr_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ilrz, /*print0:*/Active_ilrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ailnorz.Active_ailr, /*timeAccess:*/FindOptionSet_ailnorz.Active_ailr_long, /*c:*/FindOptionSet_cilnorz.Active_cilr, /*timeCreate:*/FindOptionSet_cilnorz.Active_cilr_long, /*m:*/FindOptionSet_ilmnorz.Active_ilmr, /*timeModified:*/FindOptionSet_ilmnorz.Active_ilmr_long, /*n:*/Active_ilnr, /*timeNewer:*/Active_ilnr_long, /*o:*/Active_ilor, /*timeOlder:*/Active_ilor_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeNewer n}, {@link #typeSymlink l}.*/
	Active_lnr(
		/*i:*/Active_ilnr, /*ignoreCase:*/Active_ilnr_long, /*z:*/Active_lnrz, /*print0:*/Active_lnrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ailnorz.Active_alnr, /*timeAccess:*/FindOptionSet_ailnorz.Active_alnr_long, /*c:*/FindOptionSet_cilnorz.Active_clnr, /*timeCreate:*/FindOptionSet_cilnorz.Active_clnr_long, /*m:*/FindOptionSet_ilmnorz.Active_lmnr, /*timeModified:*/FindOptionSet_ilmnorz.Active_lmnr_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_lnor, /*timeOlder:*/Active_lnor_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.regex, FindOption.timeNewer, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeNewer n}, {@link #typeSymlink l}.*/
	Active_lnr_long(
		/*i:*/Active_ilnr, /*ignoreCase:*/Active_ilnr_long, /*z:*/Active_lnrz, /*print0:*/Active_lnrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ailnorz.Active_alnr, /*timeAccess:*/FindOptionSet_ailnorz.Active_alnr_long, /*c:*/FindOptionSet_cilnorz.Active_clnr, /*timeCreate:*/FindOptionSet_cilnorz.Active_clnr_long, /*m:*/FindOptionSet_ilmnorz.Active_lmnr, /*timeModified:*/FindOptionSet_ilmnorz.Active_lmnr_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_lnor, /*timeOlder:*/Active_lnor_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.regex, FindOption.timeNewer, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_lor(
		/*i:*/Active_ilor, /*ignoreCase:*/Active_ilor_long, /*z:*/Active_lorz, /*print0:*/Active_lorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ailnorz.Active_alor, /*timeAccess:*/FindOptionSet_ailnorz.Active_alor_long, /*c:*/FindOptionSet_cilnorz.Active_clor, /*timeCreate:*/FindOptionSet_cilnorz.Active_clor_long, /*m:*/FindOptionSet_ilmnorz.Active_lmor, /*timeModified:*/FindOptionSet_ilmnorz.Active_lmor_long, /*n:*/Active_lnor, /*timeNewer:*/Active_lnor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.regex, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_lor_long(
		/*i:*/Active_ilor, /*ignoreCase:*/Active_ilor_long, /*z:*/Active_lorz, /*print0:*/Active_lorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ailnorz.Active_alor, /*timeAccess:*/FindOptionSet_ailnorz.Active_alor_long, /*c:*/FindOptionSet_cilnorz.Active_clor, /*timeCreate:*/FindOptionSet_cilnorz.Active_clor_long, /*m:*/FindOptionSet_ilmnorz.Active_lmor, /*timeModified:*/FindOptionSet_ilmnorz.Active_lmor_long, /*n:*/Active_lnor, /*timeNewer:*/Active_lnor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.regex, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #typeSymlink l}.*/
	Active_lrz(
		/*i:*/Active_ilrz, /*ignoreCase:*/Active_ilrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ailnorz.Active_alrz, /*timeAccess:*/FindOptionSet_ailnorz.Active_alrz_long, /*c:*/FindOptionSet_cilnorz.Active_clrz, /*timeCreate:*/FindOptionSet_cilnorz.Active_clrz_long, /*m:*/FindOptionSet_ilmnorz.Active_lmrz, /*timeModified:*/FindOptionSet_ilmnorz.Active_lmrz_long, /*n:*/Active_lnrz, /*timeNewer:*/Active_lnrz_long, /*o:*/Active_lorz, /*timeOlder:*/Active_lorz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #typeSymlink l}.*/
	Active_lrz_long(
		/*i:*/Active_ilrz, /*ignoreCase:*/Active_ilrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ailnorz.Active_alrz, /*timeAccess:*/FindOptionSet_ailnorz.Active_alrz_long, /*c:*/FindOptionSet_cilnorz.Active_clrz, /*timeCreate:*/FindOptionSet_cilnorz.Active_clrz_long, /*m:*/FindOptionSet_ilmnorz.Active_lmrz, /*timeModified:*/FindOptionSet_ilmnorz.Active_lmrz_long, /*n:*/Active_lnrz, /*timeNewer:*/Active_lnrz_long, /*o:*/Active_lorz, /*timeOlder:*/Active_lorz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeNewer n}, {@link #typeSymlink l}.*/
	Active_iln(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ilnz, /*print0:*/Active_ilnz_long, /*r:*/Active_ilnr, /*regex:*/Active_ilnr_long, /*a:*/FindOptionSet_ailnorz.Active_ailn, /*timeAccess:*/FindOptionSet_ailnorz.Active_ailn_long, /*c:*/FindOptionSet_cilnorz.Active_ciln, /*timeCreate:*/FindOptionSet_cilnorz.Active_ciln_long, /*m:*/FindOptionSet_ilmnorz.Active_ilmn, /*timeModified:*/FindOptionSet_ilmnorz.Active_ilmn_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_ilno, /*timeOlder:*/Active_ilno_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.timeNewer, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeNewer n}, {@link #typeSymlink l}.*/
	Active_iln_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ilnz, /*print0:*/Active_ilnz_long, /*r:*/Active_ilnr, /*regex:*/Active_ilnr_long, /*a:*/FindOptionSet_ailnorz.Active_ailn, /*timeAccess:*/FindOptionSet_ailnorz.Active_ailn_long, /*c:*/FindOptionSet_cilnorz.Active_ciln, /*timeCreate:*/FindOptionSet_cilnorz.Active_ciln_long, /*m:*/FindOptionSet_ilmnorz.Active_ilmn, /*timeModified:*/FindOptionSet_ilmnorz.Active_ilmn_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_ilno, /*timeOlder:*/Active_ilno_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.timeNewer, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_ilo(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_iloz, /*print0:*/Active_iloz_long, /*r:*/Active_ilor, /*regex:*/Active_ilor_long, /*a:*/FindOptionSet_ailnorz.Active_ailo, /*timeAccess:*/FindOptionSet_ailnorz.Active_ailo_long, /*c:*/FindOptionSet_cilnorz.Active_cilo, /*timeCreate:*/FindOptionSet_cilnorz.Active_cilo_long, /*m:*/FindOptionSet_ilmnorz.Active_ilmo, /*timeModified:*/FindOptionSet_ilmnorz.Active_ilmo_long, /*n:*/Active_ilno, /*timeNewer:*/Active_ilno_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_ilo_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_iloz, /*print0:*/Active_iloz_long, /*r:*/Active_ilor, /*regex:*/Active_ilor_long, /*a:*/FindOptionSet_ailnorz.Active_ailo, /*timeAccess:*/FindOptionSet_ailnorz.Active_ailo_long, /*c:*/FindOptionSet_cilnorz.Active_cilo, /*timeCreate:*/FindOptionSet_cilnorz.Active_cilo_long, /*m:*/FindOptionSet_ilmnorz.Active_ilmo, /*timeModified:*/FindOptionSet_ilmnorz.Active_ilmo_long, /*n:*/Active_ilno, /*timeNewer:*/Active_ilno_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #typeSymlink l}.*/
	Active_ilz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_ilrz, /*regex:*/Active_ilrz_long, /*a:*/FindOptionSet_ailnorz.Active_ailz, /*timeAccess:*/FindOptionSet_ailnorz.Active_ailz_long, /*c:*/FindOptionSet_cilnorz.Active_cilz, /*timeCreate:*/FindOptionSet_cilnorz.Active_cilz_long, /*m:*/FindOptionSet_ilmnorz.Active_ilmz, /*timeModified:*/FindOptionSet_ilmnorz.Active_ilmz_long, /*n:*/Active_ilnz, /*timeNewer:*/Active_ilnz_long, /*o:*/Active_iloz, /*timeOlder:*/Active_iloz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #typeSymlink l}.*/
	Active_ilz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_ilrz, /*regex:*/Active_ilrz_long, /*a:*/FindOptionSet_ailnorz.Active_ailz, /*timeAccess:*/FindOptionSet_ailnorz.Active_ailz_long, /*c:*/FindOptionSet_cilnorz.Active_cilz, /*timeCreate:*/FindOptionSet_cilnorz.Active_cilz_long, /*m:*/FindOptionSet_ilmnorz.Active_ilmz, /*timeModified:*/FindOptionSet_ilmnorz.Active_ilmz_long, /*n:*/Active_ilnz, /*timeNewer:*/Active_ilnz_long, /*o:*/Active_iloz, /*timeOlder:*/Active_iloz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_lno(
		/*i:*/Active_ilno, /*ignoreCase:*/Active_ilno_long, /*z:*/Active_lnoz, /*print0:*/Active_lnoz_long, /*r:*/Active_lnor, /*regex:*/Active_lnor_long, /*a:*/FindOptionSet_ailnorz.Active_alno, /*timeAccess:*/FindOptionSet_ailnorz.Active_alno_long, /*c:*/FindOptionSet_cilnorz.Active_clno, /*timeCreate:*/FindOptionSet_cilnorz.Active_clno_long, /*m:*/FindOptionSet_ilmnorz.Active_lmno, /*timeModified:*/FindOptionSet_ilmnorz.Active_lmno_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_lno_long(
		/*i:*/Active_ilno, /*ignoreCase:*/Active_ilno_long, /*z:*/Active_lnoz, /*print0:*/Active_lnoz_long, /*r:*/Active_lnor, /*regex:*/Active_lnor_long, /*a:*/FindOptionSet_ailnorz.Active_alno, /*timeAccess:*/FindOptionSet_ailnorz.Active_alno_long, /*c:*/FindOptionSet_cilnorz.Active_clno, /*timeCreate:*/FindOptionSet_cilnorz.Active_clno_long, /*m:*/FindOptionSet_ilmnorz.Active_lmno, /*timeModified:*/FindOptionSet_ilmnorz.Active_lmno_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeNewer n}, {@link #typeSymlink l}.*/
	Active_lnz(
		/*i:*/Active_ilnz, /*ignoreCase:*/Active_ilnz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_lnrz, /*regex:*/Active_lnrz_long, /*a:*/FindOptionSet_ailnorz.Active_alnz, /*timeAccess:*/FindOptionSet_ailnorz.Active_alnz_long, /*c:*/FindOptionSet_cilnorz.Active_clnz, /*timeCreate:*/FindOptionSet_cilnorz.Active_clnz_long, /*m:*/FindOptionSet_ilmnorz.Active_lmnz, /*timeModified:*/FindOptionSet_ilmnorz.Active_lmnz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_lnoz, /*timeOlder:*/Active_lnoz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.timeNewer, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeNewer n}, {@link #typeSymlink l}.*/
	Active_lnz_long(
		/*i:*/Active_ilnz, /*ignoreCase:*/Active_ilnz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_lnrz, /*regex:*/Active_lnrz_long, /*a:*/FindOptionSet_ailnorz.Active_alnz, /*timeAccess:*/FindOptionSet_ailnorz.Active_alnz_long, /*c:*/FindOptionSet_cilnorz.Active_clnz, /*timeCreate:*/FindOptionSet_cilnorz.Active_clnz_long, /*m:*/FindOptionSet_ilmnorz.Active_lmnz, /*timeModified:*/FindOptionSet_ilmnorz.Active_lmnz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_lnoz, /*timeOlder:*/Active_lnoz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.timeNewer, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_loz(
		/*i:*/Active_iloz, /*ignoreCase:*/Active_iloz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_lorz, /*regex:*/Active_lorz_long, /*a:*/FindOptionSet_ailnorz.Active_aloz, /*timeAccess:*/FindOptionSet_ailnorz.Active_aloz_long, /*c:*/FindOptionSet_cilnorz.Active_cloz, /*timeCreate:*/FindOptionSet_cilnorz.Active_cloz_long, /*m:*/FindOptionSet_ilmnorz.Active_lmoz, /*timeModified:*/FindOptionSet_ilmnorz.Active_lmoz_long, /*n:*/Active_lnoz, /*timeNewer:*/Active_lnoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_loz_long(
		/*i:*/Active_iloz, /*ignoreCase:*/Active_iloz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_lorz, /*regex:*/Active_lorz_long, /*a:*/FindOptionSet_ailnorz.Active_aloz, /*timeAccess:*/FindOptionSet_ailnorz.Active_aloz_long, /*c:*/FindOptionSet_cilnorz.Active_cloz, /*timeCreate:*/FindOptionSet_cilnorz.Active_cloz_long, /*m:*/FindOptionSet_ilmnorz.Active_lmoz, /*timeModified:*/FindOptionSet_ilmnorz.Active_lmoz_long, /*n:*/Active_lnoz, /*timeNewer:*/Active_lnoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #regex r}, {@link #typeSymlink l}.*/
	Active_lr(
		/*i:*/Active_ilr, /*ignoreCase:*/Active_ilr_long, /*z:*/Active_lrz, /*print0:*/Active_lrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ailnorz.Active_alr, /*timeAccess:*/FindOptionSet_ailnorz.Active_alr_long, /*c:*/FindOptionSet_cilnorz.Active_clr, /*timeCreate:*/FindOptionSet_cilnorz.Active_clr_long, /*m:*/FindOptionSet_ilmnorz.Active_lmr, /*timeModified:*/FindOptionSet_ilmnorz.Active_lmr_long, /*n:*/Active_lnr, /*timeNewer:*/Active_lnr_long, /*o:*/Active_lor, /*timeOlder:*/Active_lor_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.regex, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #regex r}, {@link #typeSymlink l}.*/
	Active_lr_long(
		/*i:*/Active_ilr, /*ignoreCase:*/Active_ilr_long, /*z:*/Active_lrz, /*print0:*/Active_lrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ailnorz.Active_alr, /*timeAccess:*/FindOptionSet_ailnorz.Active_alr_long, /*c:*/FindOptionSet_cilnorz.Active_clr, /*timeCreate:*/FindOptionSet_cilnorz.Active_clr_long, /*m:*/FindOptionSet_ilmnorz.Active_lmr, /*timeModified:*/FindOptionSet_ilmnorz.Active_lmr_long, /*n:*/Active_lnr, /*timeNewer:*/Active_lnr_long, /*o:*/Active_lor, /*timeOlder:*/Active_lor_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.regex, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #typeSymlink l}.*/
	Active_il(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ilz, /*print0:*/Active_ilz_long, /*r:*/Active_ilr, /*regex:*/Active_ilr_long, /*a:*/FindOptionSet_ailnorz.Active_ail, /*timeAccess:*/FindOptionSet_ailnorz.Active_ail_long, /*c:*/FindOptionSet_cilnorz.Active_cil, /*timeCreate:*/FindOptionSet_cilnorz.Active_cil_long, /*m:*/FindOptionSet_ilmnorz.Active_ilm, /*timeModified:*/FindOptionSet_ilmnorz.Active_ilm_long, /*n:*/Active_iln, /*timeNewer:*/Active_iln_long, /*o:*/Active_ilo, /*timeOlder:*/Active_ilo_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #typeSymlink l}.*/
	Active_il_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ilz, /*print0:*/Active_ilz_long, /*r:*/Active_ilr, /*regex:*/Active_ilr_long, /*a:*/FindOptionSet_ailnorz.Active_ail, /*timeAccess:*/FindOptionSet_ailnorz.Active_ail_long, /*c:*/FindOptionSet_cilnorz.Active_cil, /*timeCreate:*/FindOptionSet_cilnorz.Active_cil_long, /*m:*/FindOptionSet_ilmnorz.Active_ilm, /*timeModified:*/FindOptionSet_ilmnorz.Active_ilm_long, /*n:*/Active_iln, /*timeNewer:*/Active_iln_long, /*o:*/Active_ilo, /*timeOlder:*/Active_ilo_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #timeNewer n}, {@link #typeSymlink l}.*/
	Active_ln(
		/*i:*/Active_iln, /*ignoreCase:*/Active_iln_long, /*z:*/Active_lnz, /*print0:*/Active_lnz_long, /*r:*/Active_lnr, /*regex:*/Active_lnr_long, /*a:*/FindOptionSet_ailnorz.Active_aln, /*timeAccess:*/FindOptionSet_ailnorz.Active_aln_long, /*c:*/FindOptionSet_cilnorz.Active_cln, /*timeCreate:*/FindOptionSet_cilnorz.Active_cln_long, /*m:*/FindOptionSet_ilmnorz.Active_lmn, /*timeModified:*/FindOptionSet_ilmnorz.Active_lmn_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_lno, /*timeOlder:*/Active_lno_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.timeNewer, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #timeNewer n}, {@link #typeSymlink l}.*/
	Active_ln_long(
		/*i:*/Active_iln, /*ignoreCase:*/Active_iln_long, /*z:*/Active_lnz, /*print0:*/Active_lnz_long, /*r:*/Active_lnr, /*regex:*/Active_lnr_long, /*a:*/FindOptionSet_ailnorz.Active_aln, /*timeAccess:*/FindOptionSet_ailnorz.Active_aln_long, /*c:*/FindOptionSet_cilnorz.Active_cln, /*timeCreate:*/FindOptionSet_cilnorz.Active_cln_long, /*m:*/FindOptionSet_ilmnorz.Active_lmn, /*timeModified:*/FindOptionSet_ilmnorz.Active_lmn_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_lno, /*timeOlder:*/Active_lno_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.timeNewer, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_lo(
		/*i:*/Active_ilo, /*ignoreCase:*/Active_ilo_long, /*z:*/Active_loz, /*print0:*/Active_loz_long, /*r:*/Active_lor, /*regex:*/Active_lor_long, /*a:*/FindOptionSet_ailnorz.Active_alo, /*timeAccess:*/FindOptionSet_ailnorz.Active_alo_long, /*c:*/FindOptionSet_cilnorz.Active_clo, /*timeCreate:*/FindOptionSet_cilnorz.Active_clo_long, /*m:*/FindOptionSet_ilmnorz.Active_lmo, /*timeModified:*/FindOptionSet_ilmnorz.Active_lmo_long, /*n:*/Active_lno, /*timeNewer:*/Active_lno_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_lo_long(
		/*i:*/Active_ilo, /*ignoreCase:*/Active_ilo_long, /*z:*/Active_loz, /*print0:*/Active_loz_long, /*r:*/Active_lor, /*regex:*/Active_lor_long, /*a:*/FindOptionSet_ailnorz.Active_alo, /*timeAccess:*/FindOptionSet_ailnorz.Active_alo_long, /*c:*/FindOptionSet_cilnorz.Active_clo, /*timeCreate:*/FindOptionSet_cilnorz.Active_clo_long, /*m:*/FindOptionSet_ilmnorz.Active_lmo, /*timeModified:*/FindOptionSet_ilmnorz.Active_lmo_long, /*n:*/Active_lno, /*timeNewer:*/Active_lno_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #typeSymlink l}.*/
	Active_lz(
		/*i:*/Active_ilz, /*ignoreCase:*/Active_ilz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_lrz, /*regex:*/Active_lrz_long, /*a:*/FindOptionSet_ailnorz.Active_alz, /*timeAccess:*/FindOptionSet_ailnorz.Active_alz_long, /*c:*/FindOptionSet_cilnorz.Active_clz, /*timeCreate:*/FindOptionSet_cilnorz.Active_clz_long, /*m:*/FindOptionSet_ilmnorz.Active_lmz, /*timeModified:*/FindOptionSet_ilmnorz.Active_lmz_long, /*n:*/Active_lnz, /*timeNewer:*/Active_lnz_long, /*o:*/Active_loz, /*timeOlder:*/Active_loz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #typeSymlink l}.*/
	Active_lz_long(
		/*i:*/Active_ilz, /*ignoreCase:*/Active_ilz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_lrz, /*regex:*/Active_lrz_long, /*a:*/FindOptionSet_ailnorz.Active_alz, /*timeAccess:*/FindOptionSet_ailnorz.Active_alz_long, /*c:*/FindOptionSet_cilnorz.Active_clz, /*timeCreate:*/FindOptionSet_cilnorz.Active_clz_long, /*m:*/FindOptionSet_ilmnorz.Active_lmz, /*timeModified:*/FindOptionSet_ilmnorz.Active_lmz_long, /*n:*/Active_lnz, /*timeNewer:*/Active_lnz_long, /*o:*/Active_loz, /*timeOlder:*/Active_loz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #typeSymlink l}.*/
	Active_l(
		/*i:*/Active_il, /*ignoreCase:*/Active_il_long, /*z:*/Active_lz, /*print0:*/Active_lz_long, /*r:*/Active_lr, /*regex:*/Active_lr_long, /*a:*/FindOptionSet_ailnorz.Active_al, /*timeAccess:*/FindOptionSet_ailnorz.Active_al_long, /*c:*/FindOptionSet_cilnorz.Active_cl, /*timeCreate:*/FindOptionSet_cilnorz.Active_cl_long, /*m:*/FindOptionSet_ilmnorz.Active_lm, /*timeModified:*/FindOptionSet_ilmnorz.Active_lm_long, /*n:*/Active_ln, /*timeNewer:*/Active_ln_long, /*o:*/Active_lo, /*timeOlder:*/Active_lo_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #typeSymlink l}.*/
	Active_l_long(
		/*i:*/Active_il, /*ignoreCase:*/Active_il_long, /*z:*/Active_lz, /*print0:*/Active_lz_long, /*r:*/Active_lr, /*regex:*/Active_lr_long, /*a:*/FindOptionSet_ailnorz.Active_al, /*timeAccess:*/FindOptionSet_ailnorz.Active_al_long, /*c:*/FindOptionSet_cilnorz.Active_cl, /*timeCreate:*/FindOptionSet_cilnorz.Active_cl_long, /*m:*/FindOptionSet_ilmnorz.Active_lm, /*timeModified:*/FindOptionSet_ilmnorz.Active_lm_long, /*n:*/Active_ln, /*timeNewer:*/Active_ln_long, /*o:*/Active_lo, /*timeOlder:*/Active_lo_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.typeSymlink
	);
	private FindOptionSet_acilmnorz(
		FindOptionSet_acilmnorz i, FindOptionSet_acilmnorz ignoreCase, FindOptionSet_acilmnorz z, FindOptionSet_acilmnorz print0, FindOptionSet_acilmnorz r, FindOptionSet_acilmnorz regex, FindOptionSet_ailnorz a, FindOptionSet_ailnorz timeAccess, FindOptionSet_cilnorz c, FindOptionSet_cilnorz timeCreate, FindOptionSet_ilmnorz m, FindOptionSet_ilmnorz timeModified, FindOptionSet_acilmnorz n, FindOptionSet_acilmnorz timeNewer, FindOptionSet_acilmnorz o, FindOptionSet_acilmnorz timeOlder, FindOptionSet_acilmnorz l, FindOptionSet_acilmnorz typeSymlink, 
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
		this.l = l == null ? this : l;
		this.typeSymlink = typeSymlink == null ? this : typeSymlink;
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
	public final FindOptionSet_acilmnorz i;
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
	public final FindOptionSet_acilmnorz ignoreCase;
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
	public final FindOptionSet_acilmnorz z;
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
	public final FindOptionSet_acilmnorz print0;
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
	public final FindOptionSet_acilmnorz r;
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
	public final FindOptionSet_acilmnorz regex;
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
	public final FindOptionSet_ailnorz a;
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
	public final FindOptionSet_ailnorz timeAccess;
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
	public final FindOptionSet_cilnorz c;
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
	public final FindOptionSet_cilnorz timeCreate;
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
	public final FindOptionSet_ilmnorz m;
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
	public final FindOptionSet_ilmnorz timeModified;
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
	public final FindOptionSet_acilmnorz n;
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
	public final FindOptionSet_acilmnorz timeNewer;
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
	public final FindOptionSet_acilmnorz o;
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
	public final FindOptionSet_acilmnorz timeOlder;
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
	 *    FindOptionSet_acilmnorz.ignoreCase.z;
	 * </pre>
	 * uses acronyms, that is, this method always returns true for the above 
	 * set. 
	 * <p>
	 * On the other hand, long option names are used and this method always 
	 * returns false for the set
	 * <pre>
	 *    FindOptionSet_acilmnorz.i.print0;
	 * </pre>
	 * <p>
	 * Note that a repeated option is <i>not</i> treated as the last set option.
	 * For instance, the first and last option of the following set are 
	 * equivalent and acronyms are used:
	 * <pre>
	 *    FindOptionSet_acilmnorz.i.z.ignoreCase;
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
