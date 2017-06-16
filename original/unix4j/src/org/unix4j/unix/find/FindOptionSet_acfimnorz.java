package org.unix4j.unix.find;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import org.unix4j.option.Option;

import org.unix4j.unix.Find;

/**
 * Option sets for the {@link Find find} command with 
 * the following options: {@link #i i}, {@link #z z}, {@link #r r}, {@link #a a}, {@link #c c}, {@link #m m}, {@link #n n}, {@link #o o}, {@link #f f}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Find#Options} should be used instead to specify command 
 * options. See also {@link org.unix4j.unix.find.FindOptions} for more information.
 */
public enum FindOptionSet_acfimnorz implements FindOptions {
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.*/
	Active_finorz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_afinorz.Active_afinorz, /*timeAccess:*/FindOptionSet_afinorz.Active_afinorz_long, /*c:*/FindOptionSet_cfinorz.Active_cfinorz, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfinorz_long, /*m:*/FindOptionSet_fimnorz.Active_fimnorz, /*timeModified:*/FindOptionSet_fimnorz.Active_fimnorz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.*/
	Active_finorz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_afinorz.Active_afinorz, /*timeAccess:*/FindOptionSet_afinorz.Active_afinorz_long, /*c:*/FindOptionSet_cfinorz.Active_cfinorz, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfinorz_long, /*m:*/FindOptionSet_fimnorz.Active_fimnorz, /*timeModified:*/FindOptionSet_fimnorz.Active_fimnorz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.*/
	Active_finor(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_finorz, /*print0:*/Active_finorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_afinorz.Active_afinor, /*timeAccess:*/FindOptionSet_afinorz.Active_afinor_long, /*c:*/FindOptionSet_cfinorz.Active_cfinor, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfinor_long, /*m:*/FindOptionSet_fimnorz.Active_fimnor, /*timeModified:*/FindOptionSet_fimnorz.Active_fimnor_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.*/
	Active_finor_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_finorz, /*print0:*/Active_finorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_afinorz.Active_afinor, /*timeAccess:*/FindOptionSet_afinorz.Active_afinor_long, /*c:*/FindOptionSet_cfinorz.Active_cfinor, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfinor_long, /*m:*/FindOptionSet_fimnorz.Active_fimnor, /*timeModified:*/FindOptionSet_fimnorz.Active_fimnor_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeNewer n}, {@link #typeFile f}.*/
	Active_finrz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_afinorz.Active_afinrz, /*timeAccess:*/FindOptionSet_afinorz.Active_afinrz_long, /*c:*/FindOptionSet_cfinorz.Active_cfinrz, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfinrz_long, /*m:*/FindOptionSet_fimnorz.Active_fimnrz, /*timeModified:*/FindOptionSet_fimnorz.Active_fimnrz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_finorz, /*timeOlder:*/Active_finorz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeNewer, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeNewer n}, {@link #typeFile f}.*/
	Active_finrz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_afinorz.Active_afinrz, /*timeAccess:*/FindOptionSet_afinorz.Active_afinrz_long, /*c:*/FindOptionSet_cfinorz.Active_cfinrz, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfinrz_long, /*m:*/FindOptionSet_fimnorz.Active_fimnrz, /*timeModified:*/FindOptionSet_fimnorz.Active_fimnrz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_finorz, /*timeOlder:*/Active_finorz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeNewer, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeOlder o}, {@link #typeFile f}.*/
	Active_fiorz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_afinorz.Active_afiorz, /*timeAccess:*/FindOptionSet_afinorz.Active_afiorz_long, /*c:*/FindOptionSet_cfinorz.Active_cfiorz, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfiorz_long, /*m:*/FindOptionSet_fimnorz.Active_fimorz, /*timeModified:*/FindOptionSet_fimnorz.Active_fimorz_long, /*n:*/Active_finorz, /*timeNewer:*/Active_finorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeOlder, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeOlder o}, {@link #typeFile f}.*/
	Active_fiorz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_afinorz.Active_afiorz, /*timeAccess:*/FindOptionSet_afinorz.Active_afiorz_long, /*c:*/FindOptionSet_cfinorz.Active_cfiorz, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfiorz_long, /*m:*/FindOptionSet_fimnorz.Active_fimorz, /*timeModified:*/FindOptionSet_fimnorz.Active_fimorz_long, /*n:*/Active_finorz, /*timeNewer:*/Active_finorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeOlder, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.*/
	Active_fnorz(
		/*i:*/Active_finorz, /*ignoreCase:*/Active_finorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_afinorz.Active_afnorz, /*timeAccess:*/FindOptionSet_afinorz.Active_afnorz_long, /*c:*/FindOptionSet_cfinorz.Active_cfnorz, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfnorz_long, /*m:*/FindOptionSet_fimnorz.Active_fmnorz, /*timeModified:*/FindOptionSet_fimnorz.Active_fmnorz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.*/
	Active_fnorz_long(
		/*i:*/Active_finorz, /*ignoreCase:*/Active_finorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_afinorz.Active_afnorz, /*timeAccess:*/FindOptionSet_afinorz.Active_afnorz_long, /*c:*/FindOptionSet_cfinorz.Active_cfnorz, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfnorz_long, /*m:*/FindOptionSet_fimnorz.Active_fmnorz, /*timeModified:*/FindOptionSet_fimnorz.Active_fmnorz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.*/
	Active_finoz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_finorz, /*regex:*/Active_finorz_long, /*a:*/FindOptionSet_afinorz.Active_afinoz, /*timeAccess:*/FindOptionSet_afinorz.Active_afinoz_long, /*c:*/FindOptionSet_cfinorz.Active_cfinoz, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfinoz_long, /*m:*/FindOptionSet_fimnorz.Active_fimnoz, /*timeModified:*/FindOptionSet_fimnorz.Active_fimnoz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.*/
	Active_finoz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_finorz, /*regex:*/Active_finorz_long, /*a:*/FindOptionSet_afinorz.Active_afinoz, /*timeAccess:*/FindOptionSet_afinorz.Active_afinoz_long, /*c:*/FindOptionSet_cfinorz.Active_cfinoz, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfinoz_long, /*m:*/FindOptionSet_fimnorz.Active_fimnoz, /*timeModified:*/FindOptionSet_fimnorz.Active_fimnoz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeNewer n}, {@link #typeFile f}.*/
	Active_finr(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_finrz, /*print0:*/Active_finrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_afinorz.Active_afinr, /*timeAccess:*/FindOptionSet_afinorz.Active_afinr_long, /*c:*/FindOptionSet_cfinorz.Active_cfinr, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfinr_long, /*m:*/FindOptionSet_fimnorz.Active_fimnr, /*timeModified:*/FindOptionSet_fimnorz.Active_fimnr_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_finor, /*timeOlder:*/Active_finor_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeNewer, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeNewer n}, {@link #typeFile f}.*/
	Active_finr_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_finrz, /*print0:*/Active_finrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_afinorz.Active_afinr, /*timeAccess:*/FindOptionSet_afinorz.Active_afinr_long, /*c:*/FindOptionSet_cfinorz.Active_cfinr, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfinr_long, /*m:*/FindOptionSet_fimnorz.Active_fimnr, /*timeModified:*/FindOptionSet_fimnorz.Active_fimnr_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_finor, /*timeOlder:*/Active_finor_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeNewer, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeOlder o}, {@link #typeFile f}.*/
	Active_fior(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_fiorz, /*print0:*/Active_fiorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_afinorz.Active_afior, /*timeAccess:*/FindOptionSet_afinorz.Active_afior_long, /*c:*/FindOptionSet_cfinorz.Active_cfior, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfior_long, /*m:*/FindOptionSet_fimnorz.Active_fimor, /*timeModified:*/FindOptionSet_fimnorz.Active_fimor_long, /*n:*/Active_finor, /*timeNewer:*/Active_finor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeOlder, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeOlder o}, {@link #typeFile f}.*/
	Active_fior_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_fiorz, /*print0:*/Active_fiorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_afinorz.Active_afior, /*timeAccess:*/FindOptionSet_afinorz.Active_afior_long, /*c:*/FindOptionSet_cfinorz.Active_cfior, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfior_long, /*m:*/FindOptionSet_fimnorz.Active_fimor, /*timeModified:*/FindOptionSet_fimnorz.Active_fimor_long, /*n:*/Active_finor, /*timeNewer:*/Active_finor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeOlder, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #typeFile f}.*/
	Active_firz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_afinorz.Active_afirz, /*timeAccess:*/FindOptionSet_afinorz.Active_afirz_long, /*c:*/FindOptionSet_cfinorz.Active_cfirz, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfirz_long, /*m:*/FindOptionSet_fimnorz.Active_fimrz, /*timeModified:*/FindOptionSet_fimnorz.Active_fimrz_long, /*n:*/Active_finrz, /*timeNewer:*/Active_finrz_long, /*o:*/Active_fiorz, /*timeOlder:*/Active_fiorz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #typeFile f}.*/
	Active_firz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_afinorz.Active_afirz, /*timeAccess:*/FindOptionSet_afinorz.Active_afirz_long, /*c:*/FindOptionSet_cfinorz.Active_cfirz, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfirz_long, /*m:*/FindOptionSet_fimnorz.Active_fimrz, /*timeModified:*/FindOptionSet_fimnorz.Active_fimrz_long, /*n:*/Active_finrz, /*timeNewer:*/Active_finrz_long, /*o:*/Active_fiorz, /*timeOlder:*/Active_fiorz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.*/
	Active_fnor(
		/*i:*/Active_finor, /*ignoreCase:*/Active_finor_long, /*z:*/Active_fnorz, /*print0:*/Active_fnorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_afinorz.Active_afnor, /*timeAccess:*/FindOptionSet_afinorz.Active_afnor_long, /*c:*/FindOptionSet_cfinorz.Active_cfnor, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfnor_long, /*m:*/FindOptionSet_fimnorz.Active_fmnor, /*timeModified:*/FindOptionSet_fimnorz.Active_fmnor_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.regex, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.*/
	Active_fnor_long(
		/*i:*/Active_finor, /*ignoreCase:*/Active_finor_long, /*z:*/Active_fnorz, /*print0:*/Active_fnorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_afinorz.Active_afnor, /*timeAccess:*/FindOptionSet_afinorz.Active_afnor_long, /*c:*/FindOptionSet_cfinorz.Active_cfnor, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfnor_long, /*m:*/FindOptionSet_fimnorz.Active_fmnor, /*timeModified:*/FindOptionSet_fimnorz.Active_fmnor_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.regex, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeNewer n}, {@link #typeFile f}.*/
	Active_fnrz(
		/*i:*/Active_finrz, /*ignoreCase:*/Active_finrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_afinorz.Active_afnrz, /*timeAccess:*/FindOptionSet_afinorz.Active_afnrz_long, /*c:*/FindOptionSet_cfinorz.Active_cfnrz, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfnrz_long, /*m:*/FindOptionSet_fimnorz.Active_fmnrz, /*timeModified:*/FindOptionSet_fimnorz.Active_fmnrz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_fnorz, /*timeOlder:*/Active_fnorz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeNewer, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeNewer n}, {@link #typeFile f}.*/
	Active_fnrz_long(
		/*i:*/Active_finrz, /*ignoreCase:*/Active_finrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_afinorz.Active_afnrz, /*timeAccess:*/FindOptionSet_afinorz.Active_afnrz_long, /*c:*/FindOptionSet_cfinorz.Active_cfnrz, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfnrz_long, /*m:*/FindOptionSet_fimnorz.Active_fmnrz, /*timeModified:*/FindOptionSet_fimnorz.Active_fmnrz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_fnorz, /*timeOlder:*/Active_fnorz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeNewer, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeOlder o}, {@link #typeFile f}.*/
	Active_forz(
		/*i:*/Active_fiorz, /*ignoreCase:*/Active_fiorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_afinorz.Active_aforz, /*timeAccess:*/FindOptionSet_afinorz.Active_aforz_long, /*c:*/FindOptionSet_cfinorz.Active_cforz, /*timeCreate:*/FindOptionSet_cfinorz.Active_cforz_long, /*m:*/FindOptionSet_fimnorz.Active_fmorz, /*timeModified:*/FindOptionSet_fimnorz.Active_fmorz_long, /*n:*/Active_fnorz, /*timeNewer:*/Active_fnorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeOlder, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeOlder o}, {@link #typeFile f}.*/
	Active_forz_long(
		/*i:*/Active_fiorz, /*ignoreCase:*/Active_fiorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_afinorz.Active_aforz, /*timeAccess:*/FindOptionSet_afinorz.Active_aforz_long, /*c:*/FindOptionSet_cfinorz.Active_cforz, /*timeCreate:*/FindOptionSet_cfinorz.Active_cforz_long, /*m:*/FindOptionSet_fimnorz.Active_fmorz, /*timeModified:*/FindOptionSet_fimnorz.Active_fmorz_long, /*n:*/Active_fnorz, /*timeNewer:*/Active_fnorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeOlder, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.*/
	Active_fino(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_finoz, /*print0:*/Active_finoz_long, /*r:*/Active_finor, /*regex:*/Active_finor_long, /*a:*/FindOptionSet_afinorz.Active_afino, /*timeAccess:*/FindOptionSet_afinorz.Active_afino_long, /*c:*/FindOptionSet_cfinorz.Active_cfino, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfino_long, /*m:*/FindOptionSet_fimnorz.Active_fimno, /*timeModified:*/FindOptionSet_fimnorz.Active_fimno_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.*/
	Active_fino_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_finoz, /*print0:*/Active_finoz_long, /*r:*/Active_finor, /*regex:*/Active_finor_long, /*a:*/FindOptionSet_afinorz.Active_afino, /*timeAccess:*/FindOptionSet_afinorz.Active_afino_long, /*c:*/FindOptionSet_cfinorz.Active_cfino, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfino_long, /*m:*/FindOptionSet_fimnorz.Active_fimno, /*timeModified:*/FindOptionSet_fimnorz.Active_fimno_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeNewer n}, {@link #typeFile f}.*/
	Active_finz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_finrz, /*regex:*/Active_finrz_long, /*a:*/FindOptionSet_afinorz.Active_afinz, /*timeAccess:*/FindOptionSet_afinorz.Active_afinz_long, /*c:*/FindOptionSet_cfinorz.Active_cfinz, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfinz_long, /*m:*/FindOptionSet_fimnorz.Active_fimnz, /*timeModified:*/FindOptionSet_fimnorz.Active_fimnz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_finoz, /*timeOlder:*/Active_finoz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeNewer, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeNewer n}, {@link #typeFile f}.*/
	Active_finz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_finrz, /*regex:*/Active_finrz_long, /*a:*/FindOptionSet_afinorz.Active_afinz, /*timeAccess:*/FindOptionSet_afinorz.Active_afinz_long, /*c:*/FindOptionSet_cfinorz.Active_cfinz, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfinz_long, /*m:*/FindOptionSet_fimnorz.Active_fimnz, /*timeModified:*/FindOptionSet_fimnorz.Active_fimnz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_finoz, /*timeOlder:*/Active_finoz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeNewer, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeOlder o}, {@link #typeFile f}.*/
	Active_fioz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_fiorz, /*regex:*/Active_fiorz_long, /*a:*/FindOptionSet_afinorz.Active_afioz, /*timeAccess:*/FindOptionSet_afinorz.Active_afioz_long, /*c:*/FindOptionSet_cfinorz.Active_cfioz, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfioz_long, /*m:*/FindOptionSet_fimnorz.Active_fimoz, /*timeModified:*/FindOptionSet_fimnorz.Active_fimoz_long, /*n:*/Active_finoz, /*timeNewer:*/Active_finoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeOlder, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeOlder o}, {@link #typeFile f}.*/
	Active_fioz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_fiorz, /*regex:*/Active_fiorz_long, /*a:*/FindOptionSet_afinorz.Active_afioz, /*timeAccess:*/FindOptionSet_afinorz.Active_afioz_long, /*c:*/FindOptionSet_cfinorz.Active_cfioz, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfioz_long, /*m:*/FindOptionSet_fimnorz.Active_fimoz, /*timeModified:*/FindOptionSet_fimnorz.Active_fimoz_long, /*n:*/Active_finoz, /*timeNewer:*/Active_finoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeOlder, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.*/
	Active_fnoz(
		/*i:*/Active_finoz, /*ignoreCase:*/Active_finoz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_fnorz, /*regex:*/Active_fnorz_long, /*a:*/FindOptionSet_afinorz.Active_afnoz, /*timeAccess:*/FindOptionSet_afinorz.Active_afnoz_long, /*c:*/FindOptionSet_cfinorz.Active_cfnoz, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfnoz_long, /*m:*/FindOptionSet_fimnorz.Active_fmnoz, /*timeModified:*/FindOptionSet_fimnorz.Active_fmnoz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.*/
	Active_fnoz_long(
		/*i:*/Active_finoz, /*ignoreCase:*/Active_finoz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_fnorz, /*regex:*/Active_fnorz_long, /*a:*/FindOptionSet_afinorz.Active_afnoz, /*timeAccess:*/FindOptionSet_afinorz.Active_afnoz_long, /*c:*/FindOptionSet_cfinorz.Active_cfnoz, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfnoz_long, /*m:*/FindOptionSet_fimnorz.Active_fmnoz, /*timeModified:*/FindOptionSet_fimnorz.Active_fmnoz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #typeFile f}.*/
	Active_fir(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_firz, /*print0:*/Active_firz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_afinorz.Active_afir, /*timeAccess:*/FindOptionSet_afinorz.Active_afir_long, /*c:*/FindOptionSet_cfinorz.Active_cfir, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfir_long, /*m:*/FindOptionSet_fimnorz.Active_fimr, /*timeModified:*/FindOptionSet_fimnorz.Active_fimr_long, /*n:*/Active_finr, /*timeNewer:*/Active_finr_long, /*o:*/Active_fior, /*timeOlder:*/Active_fior_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #typeFile f}.*/
	Active_fir_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_firz, /*print0:*/Active_firz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_afinorz.Active_afir, /*timeAccess:*/FindOptionSet_afinorz.Active_afir_long, /*c:*/FindOptionSet_cfinorz.Active_cfir, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfir_long, /*m:*/FindOptionSet_fimnorz.Active_fimr, /*timeModified:*/FindOptionSet_fimnorz.Active_fimr_long, /*n:*/Active_finr, /*timeNewer:*/Active_finr_long, /*o:*/Active_fior, /*timeOlder:*/Active_fior_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeNewer n}, {@link #typeFile f}.*/
	Active_fnr(
		/*i:*/Active_finr, /*ignoreCase:*/Active_finr_long, /*z:*/Active_fnrz, /*print0:*/Active_fnrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_afinorz.Active_afnr, /*timeAccess:*/FindOptionSet_afinorz.Active_afnr_long, /*c:*/FindOptionSet_cfinorz.Active_cfnr, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfnr_long, /*m:*/FindOptionSet_fimnorz.Active_fmnr, /*timeModified:*/FindOptionSet_fimnorz.Active_fmnr_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_fnor, /*timeOlder:*/Active_fnor_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.regex, FindOption.timeNewer, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeNewer n}, {@link #typeFile f}.*/
	Active_fnr_long(
		/*i:*/Active_finr, /*ignoreCase:*/Active_finr_long, /*z:*/Active_fnrz, /*print0:*/Active_fnrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_afinorz.Active_afnr, /*timeAccess:*/FindOptionSet_afinorz.Active_afnr_long, /*c:*/FindOptionSet_cfinorz.Active_cfnr, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfnr_long, /*m:*/FindOptionSet_fimnorz.Active_fmnr, /*timeModified:*/FindOptionSet_fimnorz.Active_fmnr_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_fnor, /*timeOlder:*/Active_fnor_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.regex, FindOption.timeNewer, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeOlder o}, {@link #typeFile f}.*/
	Active_for(
		/*i:*/Active_fior, /*ignoreCase:*/Active_fior_long, /*z:*/Active_forz, /*print0:*/Active_forz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_afinorz.Active_afor, /*timeAccess:*/FindOptionSet_afinorz.Active_afor_long, /*c:*/FindOptionSet_cfinorz.Active_cfor, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfor_long, /*m:*/FindOptionSet_fimnorz.Active_fmor, /*timeModified:*/FindOptionSet_fimnorz.Active_fmor_long, /*n:*/Active_fnor, /*timeNewer:*/Active_fnor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.regex, FindOption.timeOlder, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeOlder o}, {@link #typeFile f}.*/
	Active_for_long(
		/*i:*/Active_fior, /*ignoreCase:*/Active_fior_long, /*z:*/Active_forz, /*print0:*/Active_forz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_afinorz.Active_afor, /*timeAccess:*/FindOptionSet_afinorz.Active_afor_long, /*c:*/FindOptionSet_cfinorz.Active_cfor, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfor_long, /*m:*/FindOptionSet_fimnorz.Active_fmor, /*timeModified:*/FindOptionSet_fimnorz.Active_fmor_long, /*n:*/Active_fnor, /*timeNewer:*/Active_fnor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.regex, FindOption.timeOlder, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #typeFile f}.*/
	Active_frz(
		/*i:*/Active_firz, /*ignoreCase:*/Active_firz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_afinorz.Active_afrz, /*timeAccess:*/FindOptionSet_afinorz.Active_afrz_long, /*c:*/FindOptionSet_cfinorz.Active_cfrz, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfrz_long, /*m:*/FindOptionSet_fimnorz.Active_fmrz, /*timeModified:*/FindOptionSet_fimnorz.Active_fmrz_long, /*n:*/Active_fnrz, /*timeNewer:*/Active_fnrz_long, /*o:*/Active_forz, /*timeOlder:*/Active_forz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #typeFile f}.*/
	Active_frz_long(
		/*i:*/Active_firz, /*ignoreCase:*/Active_firz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_afinorz.Active_afrz, /*timeAccess:*/FindOptionSet_afinorz.Active_afrz_long, /*c:*/FindOptionSet_cfinorz.Active_cfrz, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfrz_long, /*m:*/FindOptionSet_fimnorz.Active_fmrz, /*timeModified:*/FindOptionSet_fimnorz.Active_fmrz_long, /*n:*/Active_fnrz, /*timeNewer:*/Active_fnrz_long, /*o:*/Active_forz, /*timeOlder:*/Active_forz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeNewer n}, {@link #typeFile f}.*/
	Active_fin(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_finz, /*print0:*/Active_finz_long, /*r:*/Active_finr, /*regex:*/Active_finr_long, /*a:*/FindOptionSet_afinorz.Active_afin, /*timeAccess:*/FindOptionSet_afinorz.Active_afin_long, /*c:*/FindOptionSet_cfinorz.Active_cfin, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfin_long, /*m:*/FindOptionSet_fimnorz.Active_fimn, /*timeModified:*/FindOptionSet_fimnorz.Active_fimn_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_fino, /*timeOlder:*/Active_fino_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.timeNewer, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeNewer n}, {@link #typeFile f}.*/
	Active_fin_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_finz, /*print0:*/Active_finz_long, /*r:*/Active_finr, /*regex:*/Active_finr_long, /*a:*/FindOptionSet_afinorz.Active_afin, /*timeAccess:*/FindOptionSet_afinorz.Active_afin_long, /*c:*/FindOptionSet_cfinorz.Active_cfin, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfin_long, /*m:*/FindOptionSet_fimnorz.Active_fimn, /*timeModified:*/FindOptionSet_fimnorz.Active_fimn_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_fino, /*timeOlder:*/Active_fino_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.timeNewer, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeOlder o}, {@link #typeFile f}.*/
	Active_fio(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_fioz, /*print0:*/Active_fioz_long, /*r:*/Active_fior, /*regex:*/Active_fior_long, /*a:*/FindOptionSet_afinorz.Active_afio, /*timeAccess:*/FindOptionSet_afinorz.Active_afio_long, /*c:*/FindOptionSet_cfinorz.Active_cfio, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfio_long, /*m:*/FindOptionSet_fimnorz.Active_fimo, /*timeModified:*/FindOptionSet_fimnorz.Active_fimo_long, /*n:*/Active_fino, /*timeNewer:*/Active_fino_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.timeOlder, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeOlder o}, {@link #typeFile f}.*/
	Active_fio_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_fioz, /*print0:*/Active_fioz_long, /*r:*/Active_fior, /*regex:*/Active_fior_long, /*a:*/FindOptionSet_afinorz.Active_afio, /*timeAccess:*/FindOptionSet_afinorz.Active_afio_long, /*c:*/FindOptionSet_cfinorz.Active_cfio, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfio_long, /*m:*/FindOptionSet_fimnorz.Active_fimo, /*timeModified:*/FindOptionSet_fimnorz.Active_fimo_long, /*n:*/Active_fino, /*timeNewer:*/Active_fino_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.timeOlder, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #typeFile f}.*/
	Active_fiz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_firz, /*regex:*/Active_firz_long, /*a:*/FindOptionSet_afinorz.Active_afiz, /*timeAccess:*/FindOptionSet_afinorz.Active_afiz_long, /*c:*/FindOptionSet_cfinorz.Active_cfiz, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfiz_long, /*m:*/FindOptionSet_fimnorz.Active_fimz, /*timeModified:*/FindOptionSet_fimnorz.Active_fimz_long, /*n:*/Active_finz, /*timeNewer:*/Active_finz_long, /*o:*/Active_fioz, /*timeOlder:*/Active_fioz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #typeFile f}.*/
	Active_fiz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_firz, /*regex:*/Active_firz_long, /*a:*/FindOptionSet_afinorz.Active_afiz, /*timeAccess:*/FindOptionSet_afinorz.Active_afiz_long, /*c:*/FindOptionSet_cfinorz.Active_cfiz, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfiz_long, /*m:*/FindOptionSet_fimnorz.Active_fimz, /*timeModified:*/FindOptionSet_fimnorz.Active_fimz_long, /*n:*/Active_finz, /*timeNewer:*/Active_finz_long, /*o:*/Active_fioz, /*timeOlder:*/Active_fioz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.*/
	Active_fno(
		/*i:*/Active_fino, /*ignoreCase:*/Active_fino_long, /*z:*/Active_fnoz, /*print0:*/Active_fnoz_long, /*r:*/Active_fnor, /*regex:*/Active_fnor_long, /*a:*/FindOptionSet_afinorz.Active_afno, /*timeAccess:*/FindOptionSet_afinorz.Active_afno_long, /*c:*/FindOptionSet_cfinorz.Active_cfno, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfno_long, /*m:*/FindOptionSet_fimnorz.Active_fmno, /*timeModified:*/FindOptionSet_fimnorz.Active_fmno_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeFile f}.*/
	Active_fno_long(
		/*i:*/Active_fino, /*ignoreCase:*/Active_fino_long, /*z:*/Active_fnoz, /*print0:*/Active_fnoz_long, /*r:*/Active_fnor, /*regex:*/Active_fnor_long, /*a:*/FindOptionSet_afinorz.Active_afno, /*timeAccess:*/FindOptionSet_afinorz.Active_afno_long, /*c:*/FindOptionSet_cfinorz.Active_cfno, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfno_long, /*m:*/FindOptionSet_fimnorz.Active_fmno, /*timeModified:*/FindOptionSet_fimnorz.Active_fmno_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.timeNewer, FindOption.timeOlder, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeNewer n}, {@link #typeFile f}.*/
	Active_fnz(
		/*i:*/Active_finz, /*ignoreCase:*/Active_finz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_fnrz, /*regex:*/Active_fnrz_long, /*a:*/FindOptionSet_afinorz.Active_afnz, /*timeAccess:*/FindOptionSet_afinorz.Active_afnz_long, /*c:*/FindOptionSet_cfinorz.Active_cfnz, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfnz_long, /*m:*/FindOptionSet_fimnorz.Active_fmnz, /*timeModified:*/FindOptionSet_fimnorz.Active_fmnz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_fnoz, /*timeOlder:*/Active_fnoz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.timeNewer, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeNewer n}, {@link #typeFile f}.*/
	Active_fnz_long(
		/*i:*/Active_finz, /*ignoreCase:*/Active_finz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_fnrz, /*regex:*/Active_fnrz_long, /*a:*/FindOptionSet_afinorz.Active_afnz, /*timeAccess:*/FindOptionSet_afinorz.Active_afnz_long, /*c:*/FindOptionSet_cfinorz.Active_cfnz, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfnz_long, /*m:*/FindOptionSet_fimnorz.Active_fmnz, /*timeModified:*/FindOptionSet_fimnorz.Active_fmnz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_fnoz, /*timeOlder:*/Active_fnoz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.timeNewer, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeOlder o}, {@link #typeFile f}.*/
	Active_foz(
		/*i:*/Active_fioz, /*ignoreCase:*/Active_fioz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_forz, /*regex:*/Active_forz_long, /*a:*/FindOptionSet_afinorz.Active_afoz, /*timeAccess:*/FindOptionSet_afinorz.Active_afoz_long, /*c:*/FindOptionSet_cfinorz.Active_cfoz, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfoz_long, /*m:*/FindOptionSet_fimnorz.Active_fmoz, /*timeModified:*/FindOptionSet_fimnorz.Active_fmoz_long, /*n:*/Active_fnoz, /*timeNewer:*/Active_fnoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.timeOlder, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeOlder o}, {@link #typeFile f}.*/
	Active_foz_long(
		/*i:*/Active_fioz, /*ignoreCase:*/Active_fioz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_forz, /*regex:*/Active_forz_long, /*a:*/FindOptionSet_afinorz.Active_afoz, /*timeAccess:*/FindOptionSet_afinorz.Active_afoz_long, /*c:*/FindOptionSet_cfinorz.Active_cfoz, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfoz_long, /*m:*/FindOptionSet_fimnorz.Active_fmoz, /*timeModified:*/FindOptionSet_fimnorz.Active_fmoz_long, /*n:*/Active_fnoz, /*timeNewer:*/Active_fnoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.timeOlder, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #regex r}, {@link #typeFile f}.*/
	Active_fr(
		/*i:*/Active_fir, /*ignoreCase:*/Active_fir_long, /*z:*/Active_frz, /*print0:*/Active_frz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_afinorz.Active_afr, /*timeAccess:*/FindOptionSet_afinorz.Active_afr_long, /*c:*/FindOptionSet_cfinorz.Active_cfr, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfr_long, /*m:*/FindOptionSet_fimnorz.Active_fmr, /*timeModified:*/FindOptionSet_fimnorz.Active_fmr_long, /*n:*/Active_fnr, /*timeNewer:*/Active_fnr_long, /*o:*/Active_for, /*timeOlder:*/Active_for_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.regex, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #regex r}, {@link #typeFile f}.*/
	Active_fr_long(
		/*i:*/Active_fir, /*ignoreCase:*/Active_fir_long, /*z:*/Active_frz, /*print0:*/Active_frz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_afinorz.Active_afr, /*timeAccess:*/FindOptionSet_afinorz.Active_afr_long, /*c:*/FindOptionSet_cfinorz.Active_cfr, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfr_long, /*m:*/FindOptionSet_fimnorz.Active_fmr, /*timeModified:*/FindOptionSet_fimnorz.Active_fmr_long, /*n:*/Active_fnr, /*timeNewer:*/Active_fnr_long, /*o:*/Active_for, /*timeOlder:*/Active_for_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.regex, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #typeFile f}.*/
	Active_fi(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_fiz, /*print0:*/Active_fiz_long, /*r:*/Active_fir, /*regex:*/Active_fir_long, /*a:*/FindOptionSet_afinorz.Active_afi, /*timeAccess:*/FindOptionSet_afinorz.Active_afi_long, /*c:*/FindOptionSet_cfinorz.Active_cfi, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfi_long, /*m:*/FindOptionSet_fimnorz.Active_fim, /*timeModified:*/FindOptionSet_fimnorz.Active_fim_long, /*n:*/Active_fin, /*timeNewer:*/Active_fin_long, /*o:*/Active_fio, /*timeOlder:*/Active_fio_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #typeFile f}.*/
	Active_fi_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_fiz, /*print0:*/Active_fiz_long, /*r:*/Active_fir, /*regex:*/Active_fir_long, /*a:*/FindOptionSet_afinorz.Active_afi, /*timeAccess:*/FindOptionSet_afinorz.Active_afi_long, /*c:*/FindOptionSet_cfinorz.Active_cfi, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfi_long, /*m:*/FindOptionSet_fimnorz.Active_fim, /*timeModified:*/FindOptionSet_fimnorz.Active_fim_long, /*n:*/Active_fin, /*timeNewer:*/Active_fin_long, /*o:*/Active_fio, /*timeOlder:*/Active_fio_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #timeNewer n}, {@link #typeFile f}.*/
	Active_fn(
		/*i:*/Active_fin, /*ignoreCase:*/Active_fin_long, /*z:*/Active_fnz, /*print0:*/Active_fnz_long, /*r:*/Active_fnr, /*regex:*/Active_fnr_long, /*a:*/FindOptionSet_afinorz.Active_afn, /*timeAccess:*/FindOptionSet_afinorz.Active_afn_long, /*c:*/FindOptionSet_cfinorz.Active_cfn, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfn_long, /*m:*/FindOptionSet_fimnorz.Active_fmn, /*timeModified:*/FindOptionSet_fimnorz.Active_fmn_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_fno, /*timeOlder:*/Active_fno_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.timeNewer, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #timeNewer n}, {@link #typeFile f}.*/
	Active_fn_long(
		/*i:*/Active_fin, /*ignoreCase:*/Active_fin_long, /*z:*/Active_fnz, /*print0:*/Active_fnz_long, /*r:*/Active_fnr, /*regex:*/Active_fnr_long, /*a:*/FindOptionSet_afinorz.Active_afn, /*timeAccess:*/FindOptionSet_afinorz.Active_afn_long, /*c:*/FindOptionSet_cfinorz.Active_cfn, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfn_long, /*m:*/FindOptionSet_fimnorz.Active_fmn, /*timeModified:*/FindOptionSet_fimnorz.Active_fmn_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_fno, /*timeOlder:*/Active_fno_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.timeNewer, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #timeOlder o}, {@link #typeFile f}.*/
	Active_fo(
		/*i:*/Active_fio, /*ignoreCase:*/Active_fio_long, /*z:*/Active_foz, /*print0:*/Active_foz_long, /*r:*/Active_for, /*regex:*/Active_for_long, /*a:*/FindOptionSet_afinorz.Active_afo, /*timeAccess:*/FindOptionSet_afinorz.Active_afo_long, /*c:*/FindOptionSet_cfinorz.Active_cfo, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfo_long, /*m:*/FindOptionSet_fimnorz.Active_fmo, /*timeModified:*/FindOptionSet_fimnorz.Active_fmo_long, /*n:*/Active_fno, /*timeNewer:*/Active_fno_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.timeOlder, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #timeOlder o}, {@link #typeFile f}.*/
	Active_fo_long(
		/*i:*/Active_fio, /*ignoreCase:*/Active_fio_long, /*z:*/Active_foz, /*print0:*/Active_foz_long, /*r:*/Active_for, /*regex:*/Active_for_long, /*a:*/FindOptionSet_afinorz.Active_afo, /*timeAccess:*/FindOptionSet_afinorz.Active_afo_long, /*c:*/FindOptionSet_cfinorz.Active_cfo, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfo_long, /*m:*/FindOptionSet_fimnorz.Active_fmo, /*timeModified:*/FindOptionSet_fimnorz.Active_fmo_long, /*n:*/Active_fno, /*timeNewer:*/Active_fno_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.timeOlder, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #typeFile f}.*/
	Active_fz(
		/*i:*/Active_fiz, /*ignoreCase:*/Active_fiz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_frz, /*regex:*/Active_frz_long, /*a:*/FindOptionSet_afinorz.Active_afz, /*timeAccess:*/FindOptionSet_afinorz.Active_afz_long, /*c:*/FindOptionSet_cfinorz.Active_cfz, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfz_long, /*m:*/FindOptionSet_fimnorz.Active_fmz, /*timeModified:*/FindOptionSet_fimnorz.Active_fmz_long, /*n:*/Active_fnz, /*timeNewer:*/Active_fnz_long, /*o:*/Active_foz, /*timeOlder:*/Active_foz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #typeFile f}.*/
	Active_fz_long(
		/*i:*/Active_fiz, /*ignoreCase:*/Active_fiz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_frz, /*regex:*/Active_frz_long, /*a:*/FindOptionSet_afinorz.Active_afz, /*timeAccess:*/FindOptionSet_afinorz.Active_afz_long, /*c:*/FindOptionSet_cfinorz.Active_cfz, /*timeCreate:*/FindOptionSet_cfinorz.Active_cfz_long, /*m:*/FindOptionSet_fimnorz.Active_fmz, /*timeModified:*/FindOptionSet_fimnorz.Active_fmz_long, /*n:*/Active_fnz, /*timeNewer:*/Active_fnz_long, /*o:*/Active_foz, /*timeOlder:*/Active_foz_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.typeFile
	),
	/** Option set with the following active options: {@link #typeFile f}.*/
	Active_f(
		/*i:*/Active_fi, /*ignoreCase:*/Active_fi_long, /*z:*/Active_fz, /*print0:*/Active_fz_long, /*r:*/Active_fr, /*regex:*/Active_fr_long, /*a:*/FindOptionSet_afinorz.Active_af, /*timeAccess:*/FindOptionSet_afinorz.Active_af_long, /*c:*/FindOptionSet_cfinorz.Active_cf, /*timeCreate:*/FindOptionSet_cfinorz.Active_cf_long, /*m:*/FindOptionSet_fimnorz.Active_fm, /*timeModified:*/FindOptionSet_fimnorz.Active_fm_long, /*n:*/Active_fn, /*timeNewer:*/Active_fn_long, /*o:*/Active_fo, /*timeOlder:*/Active_fo_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.typeFile
	),
	/** Option set with the following active options: {@link #typeFile f}.*/
	Active_f_long(
		/*i:*/Active_fi, /*ignoreCase:*/Active_fi_long, /*z:*/Active_fz, /*print0:*/Active_fz_long, /*r:*/Active_fr, /*regex:*/Active_fr_long, /*a:*/FindOptionSet_afinorz.Active_af, /*timeAccess:*/FindOptionSet_afinorz.Active_af_long, /*c:*/FindOptionSet_cfinorz.Active_cf, /*timeCreate:*/FindOptionSet_cfinorz.Active_cf_long, /*m:*/FindOptionSet_fimnorz.Active_fm, /*timeModified:*/FindOptionSet_fimnorz.Active_fm_long, /*n:*/Active_fn, /*timeNewer:*/Active_fn_long, /*o:*/Active_fo, /*timeOlder:*/Active_fo_long, /*f:*/null /*already set*/, /*typeFile:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.typeFile
	);
	private FindOptionSet_acfimnorz(
		FindOptionSet_acfimnorz i, FindOptionSet_acfimnorz ignoreCase, FindOptionSet_acfimnorz z, FindOptionSet_acfimnorz print0, FindOptionSet_acfimnorz r, FindOptionSet_acfimnorz regex, FindOptionSet_afinorz a, FindOptionSet_afinorz timeAccess, FindOptionSet_cfinorz c, FindOptionSet_cfinorz timeCreate, FindOptionSet_fimnorz m, FindOptionSet_fimnorz timeModified, FindOptionSet_acfimnorz n, FindOptionSet_acfimnorz timeNewer, FindOptionSet_acfimnorz o, FindOptionSet_acfimnorz timeOlder, FindOptionSet_acfimnorz f, FindOptionSet_acfimnorz typeFile, 
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
		this.f = f == null ? this : f;
		this.typeFile = typeFile == null ? this : typeFile;
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
	public final FindOptionSet_acfimnorz i;
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
	public final FindOptionSet_acfimnorz ignoreCase;
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
	public final FindOptionSet_acfimnorz z;
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
	public final FindOptionSet_acfimnorz print0;
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
	public final FindOptionSet_acfimnorz r;
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
	public final FindOptionSet_acfimnorz regex;
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
	public final FindOptionSet_afinorz a;
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
	public final FindOptionSet_afinorz timeAccess;
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
	public final FindOptionSet_cfinorz c;
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
	public final FindOptionSet_cfinorz timeCreate;
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
	public final FindOptionSet_fimnorz m;
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
	public final FindOptionSet_fimnorz timeModified;
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
	public final FindOptionSet_acfimnorz n;
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
	public final FindOptionSet_acfimnorz timeNewer;
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
	public final FindOptionSet_acfimnorz o;
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
	public final FindOptionSet_acfimnorz timeOlder;
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
	 *    FindOptionSet_acfimnorz.ignoreCase.z;
	 * </pre>
	 * uses acronyms, that is, this method always returns true for the above 
	 * set. 
	 * <p>
	 * On the other hand, long option names are used and this method always 
	 * returns false for the set
	 * <pre>
	 *    FindOptionSet_acfimnorz.i.print0;
	 * </pre>
	 * <p>
	 * Note that a repeated option is <i>not</i> treated as the last set option.
	 * For instance, the first and last option of the following set are 
	 * equivalent and acronyms are used:
	 * <pre>
	 *    FindOptionSet_acfimnorz.i.z.ignoreCase;
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
