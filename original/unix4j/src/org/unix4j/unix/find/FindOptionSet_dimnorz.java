package org.unix4j.unix.find;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import org.unix4j.option.Option;

import org.unix4j.unix.Find;

/**
 * Option sets for the {@link Find find} command with 
 * the following options: {@link #i i}, {@link #z z}, {@link #r r}, {@link #m m}, {@link #n n}, {@link #o o}, {@link #d d}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Find#Options} should be used instead to specify command 
 * options. See also {@link org.unix4j.unix.find.FindOptions} for more information.
 */
public enum FindOptionSet_dimnorz implements FindOptions {
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.*/
	Active_dimnorz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.*/
	Active_dimnorz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.*/
	Active_dimnor(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_dimnorz, /*print0:*/Active_dimnorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.*/
	Active_dimnor_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_dimnorz, /*print0:*/Active_dimnorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeDirectory d}.*/
	Active_dimnrz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_dimnorz, /*timeOlder:*/Active_dimnorz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeDirectory d}.*/
	Active_dimnrz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_dimnorz, /*timeOlder:*/Active_dimnorz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeDirectory d}.*/
	Active_dimorz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_dimnorz, /*timeNewer:*/Active_dimnorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeOlder, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeDirectory d}.*/
	Active_dimorz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_dimnorz, /*timeNewer:*/Active_dimnorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeOlder, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.*/
	Active_dmnorz(
		/*i:*/Active_dimnorz, /*ignoreCase:*/Active_dimnorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.*/
	Active_dmnorz_long(
		/*i:*/Active_dimnorz, /*ignoreCase:*/Active_dimnorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.*/
	Active_dimnoz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_dimnorz, /*regex:*/Active_dimnorz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.*/
	Active_dimnoz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_dimnorz, /*regex:*/Active_dimnorz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeDirectory d}.*/
	Active_dimnr(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_dimnrz, /*print0:*/Active_dimnrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_dimnor, /*timeOlder:*/Active_dimnor_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeDirectory d}.*/
	Active_dimnr_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_dimnrz, /*print0:*/Active_dimnrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_dimnor, /*timeOlder:*/Active_dimnor_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeDirectory d}.*/
	Active_dimor(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_dimorz, /*print0:*/Active_dimorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_dimnor, /*timeNewer:*/Active_dimnor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeModified, FindOption.timeOlder, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeDirectory d}.*/
	Active_dimor_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_dimorz, /*print0:*/Active_dimorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_dimnor, /*timeNewer:*/Active_dimnor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeModified, FindOption.timeOlder, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #typeDirectory d}.*/
	Active_dimrz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_dimnrz, /*timeNewer:*/Active_dimnrz_long, /*o:*/Active_dimorz, /*timeOlder:*/Active_dimorz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #typeDirectory d}.*/
	Active_dimrz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_dimnrz, /*timeNewer:*/Active_dimnrz_long, /*o:*/Active_dimorz, /*timeOlder:*/Active_dimorz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.*/
	Active_dmnor(
		/*i:*/Active_dimnor, /*ignoreCase:*/Active_dimnor_long, /*z:*/Active_dmnorz, /*print0:*/Active_dmnorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.*/
	Active_dmnor_long(
		/*i:*/Active_dimnor, /*ignoreCase:*/Active_dimnor_long, /*z:*/Active_dmnorz, /*print0:*/Active_dmnorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeDirectory d}.*/
	Active_dmnrz(
		/*i:*/Active_dimnrz, /*ignoreCase:*/Active_dimnrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_dmnorz, /*timeOlder:*/Active_dmnorz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeDirectory d}.*/
	Active_dmnrz_long(
		/*i:*/Active_dimnrz, /*ignoreCase:*/Active_dimnrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_dmnorz, /*timeOlder:*/Active_dmnorz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeDirectory d}.*/
	Active_dmorz(
		/*i:*/Active_dimorz, /*ignoreCase:*/Active_dimorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_dmnorz, /*timeNewer:*/Active_dmnorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeOlder, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeDirectory d}.*/
	Active_dmorz_long(
		/*i:*/Active_dimorz, /*ignoreCase:*/Active_dimorz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_dmnorz, /*timeNewer:*/Active_dmnorz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeOlder, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.*/
	Active_dimno(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_dimnoz, /*print0:*/Active_dimnoz_long, /*r:*/Active_dimnor, /*regex:*/Active_dimnor_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.*/
	Active_dimno_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_dimnoz, /*print0:*/Active_dimnoz_long, /*r:*/Active_dimnor, /*regex:*/Active_dimnor_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeDirectory d}.*/
	Active_dimnz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_dimnrz, /*regex:*/Active_dimnrz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_dimnoz, /*timeOlder:*/Active_dimnoz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeModified, FindOption.timeNewer, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeDirectory d}.*/
	Active_dimnz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_dimnrz, /*regex:*/Active_dimnrz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_dimnoz, /*timeOlder:*/Active_dimnoz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeModified, FindOption.timeNewer, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeDirectory d}.*/
	Active_dimoz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_dimorz, /*regex:*/Active_dimorz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_dimnoz, /*timeNewer:*/Active_dimnoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeModified, FindOption.timeOlder, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeDirectory d}.*/
	Active_dimoz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_dimorz, /*regex:*/Active_dimorz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_dimnoz, /*timeNewer:*/Active_dimnoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeModified, FindOption.timeOlder, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.*/
	Active_dmnoz(
		/*i:*/Active_dimnoz, /*ignoreCase:*/Active_dimnoz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_dmnorz, /*regex:*/Active_dmnorz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.*/
	Active_dmnoz_long(
		/*i:*/Active_dimnoz, /*ignoreCase:*/Active_dimnoz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_dmnorz, /*regex:*/Active_dmnorz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeModified m}, {@link #typeDirectory d}.*/
	Active_dimr(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_dimrz, /*print0:*/Active_dimrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_dimnr, /*timeNewer:*/Active_dimnr_long, /*o:*/Active_dimor, /*timeOlder:*/Active_dimor_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeModified, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeModified m}, {@link #typeDirectory d}.*/
	Active_dimr_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_dimrz, /*print0:*/Active_dimrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_dimnr, /*timeNewer:*/Active_dimnr_long, /*o:*/Active_dimor, /*timeOlder:*/Active_dimor_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeModified, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeDirectory d}.*/
	Active_dmnr(
		/*i:*/Active_dimnr, /*ignoreCase:*/Active_dimnr_long, /*z:*/Active_dmnrz, /*print0:*/Active_dmnrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_dmnor, /*timeOlder:*/Active_dmnor_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeDirectory d}.*/
	Active_dmnr_long(
		/*i:*/Active_dimnr, /*ignoreCase:*/Active_dimnr_long, /*z:*/Active_dmnrz, /*print0:*/Active_dmnrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_dmnor, /*timeOlder:*/Active_dmnor_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeDirectory d}.*/
	Active_dmor(
		/*i:*/Active_dimor, /*ignoreCase:*/Active_dimor_long, /*z:*/Active_dmorz, /*print0:*/Active_dmorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_dmnor, /*timeNewer:*/Active_dmnor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.regex, FindOption.timeModified, FindOption.timeOlder, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeDirectory d}.*/
	Active_dmor_long(
		/*i:*/Active_dimor, /*ignoreCase:*/Active_dimor_long, /*z:*/Active_dmorz, /*print0:*/Active_dmorz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_dmnor, /*timeNewer:*/Active_dmnor_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.regex, FindOption.timeModified, FindOption.timeOlder, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #typeDirectory d}.*/
	Active_dmrz(
		/*i:*/Active_dimrz, /*ignoreCase:*/Active_dimrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_dmnrz, /*timeNewer:*/Active_dmnrz_long, /*o:*/Active_dmorz, /*timeOlder:*/Active_dmorz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #typeDirectory d}.*/
	Active_dmrz_long(
		/*i:*/Active_dimrz, /*ignoreCase:*/Active_dimrz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_dmnrz, /*timeNewer:*/Active_dmnrz_long, /*o:*/Active_dmorz, /*timeOlder:*/Active_dmorz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeDirectory d}.*/
	Active_dimn(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_dimnz, /*print0:*/Active_dimnz_long, /*r:*/Active_dimnr, /*regex:*/Active_dimnr_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_dimno, /*timeOlder:*/Active_dimno_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.timeModified, FindOption.timeNewer, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeDirectory d}.*/
	Active_dimn_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_dimnz, /*print0:*/Active_dimnz_long, /*r:*/Active_dimnr, /*regex:*/Active_dimnr_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_dimno, /*timeOlder:*/Active_dimno_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.timeModified, FindOption.timeNewer, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeDirectory d}.*/
	Active_dimo(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_dimoz, /*print0:*/Active_dimoz_long, /*r:*/Active_dimor, /*regex:*/Active_dimor_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_dimno, /*timeNewer:*/Active_dimno_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.timeModified, FindOption.timeOlder, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeDirectory d}.*/
	Active_dimo_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_dimoz, /*print0:*/Active_dimoz_long, /*r:*/Active_dimor, /*regex:*/Active_dimor_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_dimno, /*timeNewer:*/Active_dimno_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.timeModified, FindOption.timeOlder, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeModified m}, {@link #typeDirectory d}.*/
	Active_dimz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_dimrz, /*regex:*/Active_dimrz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_dimnz, /*timeNewer:*/Active_dimnz_long, /*o:*/Active_dimoz, /*timeOlder:*/Active_dimoz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeModified, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeModified m}, {@link #typeDirectory d}.*/
	Active_dimz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_dimrz, /*regex:*/Active_dimrz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_dimnz, /*timeNewer:*/Active_dimnz_long, /*o:*/Active_dimoz, /*timeOlder:*/Active_dimoz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeModified, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.*/
	Active_dmno(
		/*i:*/Active_dimno, /*ignoreCase:*/Active_dimno_long, /*z:*/Active_dmnoz, /*print0:*/Active_dmnoz_long, /*r:*/Active_dmnor, /*regex:*/Active_dmnor_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeDirectory d}.*/
	Active_dmno_long(
		/*i:*/Active_dimno, /*ignoreCase:*/Active_dimno_long, /*z:*/Active_dmnoz, /*print0:*/Active_dmnoz_long, /*r:*/Active_dmnor, /*regex:*/Active_dmnor_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeDirectory d}.*/
	Active_dmnz(
		/*i:*/Active_dimnz, /*ignoreCase:*/Active_dimnz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_dmnrz, /*regex:*/Active_dmnrz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_dmnoz, /*timeOlder:*/Active_dmnoz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.timeModified, FindOption.timeNewer, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeDirectory d}.*/
	Active_dmnz_long(
		/*i:*/Active_dimnz, /*ignoreCase:*/Active_dimnz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_dmnrz, /*regex:*/Active_dmnrz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_dmnoz, /*timeOlder:*/Active_dmnoz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.timeModified, FindOption.timeNewer, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeDirectory d}.*/
	Active_dmoz(
		/*i:*/Active_dimoz, /*ignoreCase:*/Active_dimoz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_dmorz, /*regex:*/Active_dmorz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_dmnoz, /*timeNewer:*/Active_dmnoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.timeModified, FindOption.timeOlder, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeDirectory d}.*/
	Active_dmoz_long(
		/*i:*/Active_dimoz, /*ignoreCase:*/Active_dimoz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_dmorz, /*regex:*/Active_dmorz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_dmnoz, /*timeNewer:*/Active_dmnoz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.timeModified, FindOption.timeOlder, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeModified m}, {@link #typeDirectory d}.*/
	Active_dmr(
		/*i:*/Active_dimr, /*ignoreCase:*/Active_dimr_long, /*z:*/Active_dmrz, /*print0:*/Active_dmrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_dmnr, /*timeNewer:*/Active_dmnr_long, /*o:*/Active_dmor, /*timeOlder:*/Active_dmor_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.regex, FindOption.timeModified, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeModified m}, {@link #typeDirectory d}.*/
	Active_dmr_long(
		/*i:*/Active_dimr, /*ignoreCase:*/Active_dimr_long, /*z:*/Active_dmrz, /*print0:*/Active_dmrz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_dmnr, /*timeNewer:*/Active_dmnr_long, /*o:*/Active_dmor, /*timeOlder:*/Active_dmor_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.regex, FindOption.timeModified, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeModified m}, {@link #typeDirectory d}.*/
	Active_dim(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_dimz, /*print0:*/Active_dimz_long, /*r:*/Active_dimr, /*regex:*/Active_dimr_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_dimn, /*timeNewer:*/Active_dimn_long, /*o:*/Active_dimo, /*timeOlder:*/Active_dimo_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.timeModified, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeModified m}, {@link #typeDirectory d}.*/
	Active_dim_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_dimz, /*print0:*/Active_dimz_long, /*r:*/Active_dimr, /*regex:*/Active_dimr_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_dimn, /*timeNewer:*/Active_dimn_long, /*o:*/Active_dimo, /*timeOlder:*/Active_dimo_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.timeModified, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #timeModified m}, {@link #timeNewer n}, {@link #typeDirectory d}.*/
	Active_dmn(
		/*i:*/Active_dimn, /*ignoreCase:*/Active_dimn_long, /*z:*/Active_dmnz, /*print0:*/Active_dmnz_long, /*r:*/Active_dmnr, /*regex:*/Active_dmnr_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_dmno, /*timeOlder:*/Active_dmno_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.timeModified, FindOption.timeNewer, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #timeModified m}, {@link #timeNewer n}, {@link #typeDirectory d}.*/
	Active_dmn_long(
		/*i:*/Active_dimn, /*ignoreCase:*/Active_dimn_long, /*z:*/Active_dmnz, /*print0:*/Active_dmnz_long, /*r:*/Active_dmnr, /*regex:*/Active_dmnr_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_dmno, /*timeOlder:*/Active_dmno_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.timeModified, FindOption.timeNewer, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #timeModified m}, {@link #timeOlder o}, {@link #typeDirectory d}.*/
	Active_dmo(
		/*i:*/Active_dimo, /*ignoreCase:*/Active_dimo_long, /*z:*/Active_dmoz, /*print0:*/Active_dmoz_long, /*r:*/Active_dmor, /*regex:*/Active_dmor_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_dmno, /*timeNewer:*/Active_dmno_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.timeModified, FindOption.timeOlder, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #timeModified m}, {@link #timeOlder o}, {@link #typeDirectory d}.*/
	Active_dmo_long(
		/*i:*/Active_dimo, /*ignoreCase:*/Active_dimo_long, /*z:*/Active_dmoz, /*print0:*/Active_dmoz_long, /*r:*/Active_dmor, /*regex:*/Active_dmor_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_dmno, /*timeNewer:*/Active_dmno_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.timeModified, FindOption.timeOlder, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeModified m}, {@link #typeDirectory d}.*/
	Active_dmz(
		/*i:*/Active_dimz, /*ignoreCase:*/Active_dimz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_dmrz, /*regex:*/Active_dmrz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_dmnz, /*timeNewer:*/Active_dmnz_long, /*o:*/Active_dmoz, /*timeOlder:*/Active_dmoz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.timeModified, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeModified m}, {@link #typeDirectory d}.*/
	Active_dmz_long(
		/*i:*/Active_dimz, /*ignoreCase:*/Active_dimz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_dmrz, /*regex:*/Active_dmrz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_dmnz, /*timeNewer:*/Active_dmnz_long, /*o:*/Active_dmoz, /*timeOlder:*/Active_dmoz_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.timeModified, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #timeModified m}, {@link #typeDirectory d}.*/
	Active_dm(
		/*i:*/Active_dim, /*ignoreCase:*/Active_dim_long, /*z:*/Active_dmz, /*print0:*/Active_dmz_long, /*r:*/Active_dmr, /*regex:*/Active_dmr_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_dmn, /*timeNewer:*/Active_dmn_long, /*o:*/Active_dmo, /*timeOlder:*/Active_dmo_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.timeModified, FindOption.typeDirectory
	),
	/** Option set with the following active options: {@link #timeModified m}, {@link #typeDirectory d}.*/
	Active_dm_long(
		/*i:*/Active_dim, /*ignoreCase:*/Active_dim_long, /*z:*/Active_dmz, /*print0:*/Active_dmz_long, /*r:*/Active_dmr, /*regex:*/Active_dmr_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_dmn, /*timeNewer:*/Active_dmn_long, /*o:*/Active_dmo, /*timeOlder:*/Active_dmo_long, /*d:*/null /*already set*/, /*typeDirectory:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.timeModified, FindOption.typeDirectory
	);
	private FindOptionSet_dimnorz(
		FindOptionSet_dimnorz i, FindOptionSet_dimnorz ignoreCase, FindOptionSet_dimnorz z, FindOptionSet_dimnorz print0, FindOptionSet_dimnorz r, FindOptionSet_dimnorz regex, FindOptionSet_dimnorz m, FindOptionSet_dimnorz timeModified, FindOptionSet_dimnorz n, FindOptionSet_dimnorz timeNewer, FindOptionSet_dimnorz o, FindOptionSet_dimnorz timeOlder, FindOptionSet_dimnorz d, FindOptionSet_dimnorz typeDirectory, 
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
		this.d = d == null ? this : d;
		this.typeDirectory = typeDirectory == null ? this : typeDirectory;
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
	public final FindOptionSet_dimnorz i;
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
	public final FindOptionSet_dimnorz ignoreCase;
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
	public final FindOptionSet_dimnorz z;
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
	public final FindOptionSet_dimnorz print0;
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
	public final FindOptionSet_dimnorz r;
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
	public final FindOptionSet_dimnorz regex;
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
	public final FindOptionSet_dimnorz m;
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
	public final FindOptionSet_dimnorz timeModified;
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
	public final FindOptionSet_dimnorz n;
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
	public final FindOptionSet_dimnorz timeNewer;
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
	public final FindOptionSet_dimnorz o;
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
	public final FindOptionSet_dimnorz timeOlder;
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
	 *    FindOptionSet_dimnorz.ignoreCase.z;
	 * </pre>
	 * uses acronyms, that is, this method always returns true for the above 
	 * set. 
	 * <p>
	 * On the other hand, long option names are used and this method always 
	 * returns false for the set
	 * <pre>
	 *    FindOptionSet_dimnorz.i.print0;
	 * </pre>
	 * <p>
	 * Note that a repeated option is <i>not</i> treated as the last set option.
	 * For instance, the first and last option of the following set are 
	 * equivalent and acronyms are used:
	 * <pre>
	 *    FindOptionSet_dimnorz.i.z.ignoreCase;
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
