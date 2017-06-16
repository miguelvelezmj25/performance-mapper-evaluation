package org.unix4j.unix.find;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import org.unix4j.option.Option;

import org.unix4j.unix.Find;

/**
 * Option sets for the {@link Find find} command with 
 * the following options: {@link #i i}, {@link #z z}, {@link #r r}, {@link #c c}, {@link #n n}, {@link #o o}, {@link #l l}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Find#Options} should be used instead to specify command 
 * options. See also {@link org.unix4j.unix.find.FindOptions} for more information.
 */
public enum FindOptionSet_cilnorz implements FindOptions {
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_cilnorz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_cilnorz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_cilnor(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cilnorz, /*print0:*/Active_cilnorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_cilnor_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cilnorz, /*print0:*/Active_cilnorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeSymlink l}.*/
	Active_cilnrz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cilnorz, /*timeOlder:*/Active_cilnorz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeSymlink l}.*/
	Active_cilnrz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cilnorz, /*timeOlder:*/Active_cilnorz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_cilorz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cilnorz, /*timeNewer:*/Active_cilnorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_cilorz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cilnorz, /*timeNewer:*/Active_cilnorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_clnorz(
		/*i:*/Active_cilnorz, /*ignoreCase:*/Active_cilnorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_clnorz_long(
		/*i:*/Active_cilnorz, /*ignoreCase:*/Active_cilnorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_cilnoz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cilnorz, /*regex:*/Active_cilnorz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_cilnoz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cilnorz, /*regex:*/Active_cilnorz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeSymlink l}.*/
	Active_cilnr(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cilnrz, /*print0:*/Active_cilnrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cilnor, /*timeOlder:*/Active_cilnor_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeSymlink l}.*/
	Active_cilnr_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cilnrz, /*print0:*/Active_cilnrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cilnor, /*timeOlder:*/Active_cilnor_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_cilor(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cilorz, /*print0:*/Active_cilorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cilnor, /*timeNewer:*/Active_cilnor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_cilor_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cilorz, /*print0:*/Active_cilorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cilnor, /*timeNewer:*/Active_cilnor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #typeSymlink l}.*/
	Active_cilrz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cilnrz, /*timeNewer:*/Active_cilnrz_long, /*o:*/Active_cilorz, /*timeOlder:*/Active_cilorz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #typeSymlink l}.*/
	Active_cilrz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cilnrz, /*timeNewer:*/Active_cilnrz_long, /*o:*/Active_cilorz, /*timeOlder:*/Active_cilorz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_clnor(
		/*i:*/Active_cilnor, /*ignoreCase:*/Active_cilnor_long, /*z:*/Active_clnorz, /*print0:*/Active_clnorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_clnor_long(
		/*i:*/Active_cilnor, /*ignoreCase:*/Active_cilnor_long, /*z:*/Active_clnorz, /*print0:*/Active_clnorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeSymlink l}.*/
	Active_clnrz(
		/*i:*/Active_cilnrz, /*ignoreCase:*/Active_cilnrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_clnorz, /*timeOlder:*/Active_clnorz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeSymlink l}.*/
	Active_clnrz_long(
		/*i:*/Active_cilnrz, /*ignoreCase:*/Active_cilnrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_clnorz, /*timeOlder:*/Active_clnorz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_clorz(
		/*i:*/Active_cilorz, /*ignoreCase:*/Active_cilorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_clnorz, /*timeNewer:*/Active_clnorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_clorz_long(
		/*i:*/Active_cilorz, /*ignoreCase:*/Active_cilorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_clnorz, /*timeNewer:*/Active_clnorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_cilno(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cilnoz, /*print0:*/Active_cilnoz_long, /*r:*/Active_cilnor, /*regex:*/Active_cilnor_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_cilno_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cilnoz, /*print0:*/Active_cilnoz_long, /*r:*/Active_cilnor, /*regex:*/Active_cilnor_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeSymlink l}.*/
	Active_cilnz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cilnrz, /*regex:*/Active_cilnrz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cilnoz, /*timeOlder:*/Active_cilnoz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeSymlink l}.*/
	Active_cilnz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cilnrz, /*regex:*/Active_cilnrz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cilnoz, /*timeOlder:*/Active_cilnoz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_ciloz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cilorz, /*regex:*/Active_cilorz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cilnoz, /*timeNewer:*/Active_cilnoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_ciloz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cilorz, /*regex:*/Active_cilorz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cilnoz, /*timeNewer:*/Active_cilnoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_clnoz(
		/*i:*/Active_cilnoz, /*ignoreCase:*/Active_cilnoz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_clnorz, /*regex:*/Active_clnorz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_clnoz_long(
		/*i:*/Active_cilnoz, /*ignoreCase:*/Active_cilnoz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_clnorz, /*regex:*/Active_clnorz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeCreate c}, {@link #typeSymlink l}.*/
	Active_cilr(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cilrz, /*print0:*/Active_cilrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cilnr, /*timeNewer:*/Active_cilnr_long, /*o:*/Active_cilor, /*timeOlder:*/Active_cilor_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeCreate, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeCreate c}, {@link #typeSymlink l}.*/
	Active_cilr_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cilrz, /*print0:*/Active_cilrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cilnr, /*timeNewer:*/Active_cilnr_long, /*o:*/Active_cilor, /*timeOlder:*/Active_cilor_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeCreate, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeSymlink l}.*/
	Active_clnr(
		/*i:*/Active_cilnr, /*ignoreCase:*/Active_cilnr_long, /*z:*/Active_clnrz, /*print0:*/Active_clnrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_clnor, /*timeOlder:*/Active_clnor_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeSymlink l}.*/
	Active_clnr_long(
		/*i:*/Active_cilnr, /*ignoreCase:*/Active_cilnr_long, /*z:*/Active_clnrz, /*print0:*/Active_clnrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_clnor, /*timeOlder:*/Active_clnor_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_clor(
		/*i:*/Active_cilor, /*ignoreCase:*/Active_cilor_long, /*z:*/Active_clorz, /*print0:*/Active_clorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_clnor, /*timeNewer:*/Active_clnor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.regex, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_clor_long(
		/*i:*/Active_cilor, /*ignoreCase:*/Active_cilor_long, /*z:*/Active_clorz, /*print0:*/Active_clorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_clnor, /*timeNewer:*/Active_clnor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.regex, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #typeSymlink l}.*/
	Active_clrz(
		/*i:*/Active_cilrz, /*ignoreCase:*/Active_cilrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_clnrz, /*timeNewer:*/Active_clnrz_long, /*o:*/Active_clorz, /*timeOlder:*/Active_clorz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #typeSymlink l}.*/
	Active_clrz_long(
		/*i:*/Active_cilrz, /*ignoreCase:*/Active_cilrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_clnrz, /*timeNewer:*/Active_clnrz_long, /*o:*/Active_clorz, /*timeOlder:*/Active_clorz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeSymlink l}.*/
	Active_ciln(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cilnz, /*print0:*/Active_cilnz_long, /*r:*/Active_cilnr, /*regex:*/Active_cilnr_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cilno, /*timeOlder:*/Active_cilno_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeSymlink l}.*/
	Active_ciln_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cilnz, /*print0:*/Active_cilnz_long, /*r:*/Active_cilnr, /*regex:*/Active_cilnr_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cilno, /*timeOlder:*/Active_cilno_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_cilo(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ciloz, /*print0:*/Active_ciloz_long, /*r:*/Active_cilor, /*regex:*/Active_cilor_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cilno, /*timeNewer:*/Active_cilno_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_cilo_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ciloz, /*print0:*/Active_ciloz_long, /*r:*/Active_cilor, /*regex:*/Active_cilor_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cilno, /*timeNewer:*/Active_cilno_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeCreate c}, {@link #typeSymlink l}.*/
	Active_cilz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cilrz, /*regex:*/Active_cilrz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cilnz, /*timeNewer:*/Active_cilnz_long, /*o:*/Active_ciloz, /*timeOlder:*/Active_ciloz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeCreate, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeCreate c}, {@link #typeSymlink l}.*/
	Active_cilz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cilrz, /*regex:*/Active_cilrz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cilnz, /*timeNewer:*/Active_cilnz_long, /*o:*/Active_ciloz, /*timeOlder:*/Active_ciloz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeCreate, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_clno(
		/*i:*/Active_cilno, /*ignoreCase:*/Active_cilno_long, /*z:*/Active_clnoz, /*print0:*/Active_clnoz_long, /*r:*/Active_clnor, /*regex:*/Active_clnor_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_clno_long(
		/*i:*/Active_cilno, /*ignoreCase:*/Active_cilno_long, /*z:*/Active_clnoz, /*print0:*/Active_clnoz_long, /*r:*/Active_clnor, /*regex:*/Active_clnor_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeSymlink l}.*/
	Active_clnz(
		/*i:*/Active_cilnz, /*ignoreCase:*/Active_cilnz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_clnrz, /*regex:*/Active_clnrz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_clnoz, /*timeOlder:*/Active_clnoz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeSymlink l}.*/
	Active_clnz_long(
		/*i:*/Active_cilnz, /*ignoreCase:*/Active_cilnz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_clnrz, /*regex:*/Active_clnrz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_clnoz, /*timeOlder:*/Active_clnoz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_cloz(
		/*i:*/Active_ciloz, /*ignoreCase:*/Active_ciloz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_clorz, /*regex:*/Active_clorz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_clnoz, /*timeNewer:*/Active_clnoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_cloz_long(
		/*i:*/Active_ciloz, /*ignoreCase:*/Active_ciloz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_clorz, /*regex:*/Active_clorz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_clnoz, /*timeNewer:*/Active_clnoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeCreate c}, {@link #typeSymlink l}.*/
	Active_clr(
		/*i:*/Active_cilr, /*ignoreCase:*/Active_cilr_long, /*z:*/Active_clrz, /*print0:*/Active_clrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_clnr, /*timeNewer:*/Active_clnr_long, /*o:*/Active_clor, /*timeOlder:*/Active_clor_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.regex, FindOption.timeCreate, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeCreate c}, {@link #typeSymlink l}.*/
	Active_clr_long(
		/*i:*/Active_cilr, /*ignoreCase:*/Active_cilr_long, /*z:*/Active_clrz, /*print0:*/Active_clrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_clnr, /*timeNewer:*/Active_clnr_long, /*o:*/Active_clor, /*timeOlder:*/Active_clor_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.regex, FindOption.timeCreate, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeCreate c}, {@link #typeSymlink l}.*/
	Active_cil(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cilz, /*print0:*/Active_cilz_long, /*r:*/Active_cilr, /*regex:*/Active_cilr_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_ciln, /*timeNewer:*/Active_ciln_long, /*o:*/Active_cilo, /*timeOlder:*/Active_cilo_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.timeCreate, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeCreate c}, {@link #typeSymlink l}.*/
	Active_cil_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cilz, /*print0:*/Active_cilz_long, /*r:*/Active_cilr, /*regex:*/Active_cilr_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_ciln, /*timeNewer:*/Active_ciln_long, /*o:*/Active_cilo, /*timeOlder:*/Active_cilo_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.timeCreate, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeSymlink l}.*/
	Active_cln(
		/*i:*/Active_ciln, /*ignoreCase:*/Active_ciln_long, /*z:*/Active_clnz, /*print0:*/Active_clnz_long, /*r:*/Active_clnr, /*regex:*/Active_clnr_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_clno, /*timeOlder:*/Active_clno_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.timeCreate, FindOption.timeNewer, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeSymlink l}.*/
	Active_cln_long(
		/*i:*/Active_ciln, /*ignoreCase:*/Active_ciln_long, /*z:*/Active_clnz, /*print0:*/Active_clnz_long, /*r:*/Active_clnr, /*regex:*/Active_clnr_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_clno, /*timeOlder:*/Active_clno_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.timeCreate, FindOption.timeNewer, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_clo(
		/*i:*/Active_cilo, /*ignoreCase:*/Active_cilo_long, /*z:*/Active_cloz, /*print0:*/Active_cloz_long, /*r:*/Active_clor, /*regex:*/Active_clor_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_clno, /*timeNewer:*/Active_clno_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.timeCreate, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeSymlink l}.*/
	Active_clo_long(
		/*i:*/Active_cilo, /*ignoreCase:*/Active_cilo_long, /*z:*/Active_cloz, /*print0:*/Active_cloz_long, /*r:*/Active_clor, /*regex:*/Active_clor_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_clno, /*timeNewer:*/Active_clno_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.timeCreate, FindOption.timeOlder, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeCreate c}, {@link #typeSymlink l}.*/
	Active_clz(
		/*i:*/Active_cilz, /*ignoreCase:*/Active_cilz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_clrz, /*regex:*/Active_clrz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_clnz, /*timeNewer:*/Active_clnz_long, /*o:*/Active_cloz, /*timeOlder:*/Active_cloz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.timeCreate, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeCreate c}, {@link #typeSymlink l}.*/
	Active_clz_long(
		/*i:*/Active_cilz, /*ignoreCase:*/Active_cilz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_clrz, /*regex:*/Active_clrz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_clnz, /*timeNewer:*/Active_clnz_long, /*o:*/Active_cloz, /*timeOlder:*/Active_cloz_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.timeCreate, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #timeCreate c}, {@link #typeSymlink l}.*/
	Active_cl(
		/*i:*/Active_cil, /*ignoreCase:*/Active_cil_long, /*z:*/Active_clz, /*print0:*/Active_clz_long, /*r:*/Active_clr, /*regex:*/Active_clr_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cln, /*timeNewer:*/Active_cln_long, /*o:*/Active_clo, /*timeOlder:*/Active_clo_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.timeCreate, FindOption.typeSymlink
	),
	/** Option set with the following active options: {@link #timeCreate c}, {@link #typeSymlink l}.*/
	Active_cl_long(
		/*i:*/Active_cil, /*ignoreCase:*/Active_cil_long, /*z:*/Active_clz, /*print0:*/Active_clz_long, /*r:*/Active_clr, /*regex:*/Active_clr_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cln, /*timeNewer:*/Active_cln_long, /*o:*/Active_clo, /*timeOlder:*/Active_clo_long, /*l:*/null /*already set*/, /*typeSymlink:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.timeCreate, FindOption.typeSymlink
	);
	private FindOptionSet_cilnorz(
		FindOptionSet_cilnorz i, FindOptionSet_cilnorz ignoreCase, FindOptionSet_cilnorz z, FindOptionSet_cilnorz print0, FindOptionSet_cilnorz r, FindOptionSet_cilnorz regex, FindOptionSet_cilnorz c, FindOptionSet_cilnorz timeCreate, FindOptionSet_cilnorz n, FindOptionSet_cilnorz timeNewer, FindOptionSet_cilnorz o, FindOptionSet_cilnorz timeOlder, FindOptionSet_cilnorz l, FindOptionSet_cilnorz typeSymlink, 
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
	public final FindOptionSet_cilnorz i;
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
	public final FindOptionSet_cilnorz ignoreCase;
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
	public final FindOptionSet_cilnorz z;
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
	public final FindOptionSet_cilnorz print0;
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
	public final FindOptionSet_cilnorz r;
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
	public final FindOptionSet_cilnorz regex;
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
	public final FindOptionSet_cilnorz n;
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
	public final FindOptionSet_cilnorz timeNewer;
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
	public final FindOptionSet_cilnorz o;
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
	public final FindOptionSet_cilnorz timeOlder;
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
	 *    FindOptionSet_cilnorz.ignoreCase.z;
	 * </pre>
	 * uses acronyms, that is, this method always returns true for the above 
	 * set. 
	 * <p>
	 * On the other hand, long option names are used and this method always 
	 * returns false for the set
	 * <pre>
	 *    FindOptionSet_cilnorz.i.print0;
	 * </pre>
	 * <p>
	 * Note that a repeated option is <i>not</i> treated as the last set option.
	 * For instance, the first and last option of the following set are 
	 * equivalent and acronyms are used:
	 * <pre>
	 *    FindOptionSet_cilnorz.i.z.ignoreCase;
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
