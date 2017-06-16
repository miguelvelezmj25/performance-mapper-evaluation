package org.unix4j.unix.find;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import org.unix4j.option.Option;

import org.unix4j.unix.Find;

/**
 * Option sets for the {@link Find find} command with 
 * the following options: {@link #i i}, {@link #z z}, {@link #r r}, {@link #a a}, {@link #n n}, {@link #o o}, {@link #x x}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Find#Options} should be used instead to specify command 
 * options. See also {@link org.unix4j.unix.find.FindOptions} for more information.
 */
public enum FindOptionSet_ainorxz implements FindOptions {
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_ainorxz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_ainorxz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_ainorx(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ainorxz, /*print0:*/Active_ainorxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_ainorx_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ainorxz, /*print0:*/Active_ainorxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeOther x}.*/
	Active_ainrxz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_ainorxz, /*timeOlder:*/Active_ainorxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeOther x}.*/
	Active_ainrxz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_ainorxz, /*timeOlder:*/Active_ainorxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_aiorxz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ainorxz, /*timeNewer:*/Active_ainorxz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_aiorxz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ainorxz, /*timeNewer:*/Active_ainorxz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_anorxz(
		/*i:*/Active_ainorxz, /*ignoreCase:*/Active_ainorxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_anorxz_long(
		/*i:*/Active_ainorxz, /*ignoreCase:*/Active_ainorxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_ainoxz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_ainorxz, /*regex:*/Active_ainorxz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_ainoxz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_ainorxz, /*regex:*/Active_ainorxz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeOther x}.*/
	Active_ainrx(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ainrxz, /*print0:*/Active_ainrxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_ainorx, /*timeOlder:*/Active_ainorx_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeOther x}.*/
	Active_ainrx_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ainrxz, /*print0:*/Active_ainrxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_ainorx, /*timeOlder:*/Active_ainorx_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_aiorx(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_aiorxz, /*print0:*/Active_aiorxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ainorx, /*timeNewer:*/Active_ainorx_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_aiorx_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_aiorxz, /*print0:*/Active_aiorxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ainorx, /*timeNewer:*/Active_ainorx_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #typeOther x}.*/
	Active_airxz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ainrxz, /*timeNewer:*/Active_ainrxz_long, /*o:*/Active_aiorxz, /*timeOlder:*/Active_aiorxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #typeOther x}.*/
	Active_airxz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ainrxz, /*timeNewer:*/Active_ainrxz_long, /*o:*/Active_aiorxz, /*timeOlder:*/Active_aiorxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_anorx(
		/*i:*/Active_ainorx, /*ignoreCase:*/Active_ainorx_long, /*z:*/Active_anorxz, /*print0:*/Active_anorxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_anorx_long(
		/*i:*/Active_ainorx, /*ignoreCase:*/Active_ainorx_long, /*z:*/Active_anorxz, /*print0:*/Active_anorxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeOther x}.*/
	Active_anrxz(
		/*i:*/Active_ainrxz, /*ignoreCase:*/Active_ainrxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_anorxz, /*timeOlder:*/Active_anorxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeOther x}.*/
	Active_anrxz_long(
		/*i:*/Active_ainrxz, /*ignoreCase:*/Active_ainrxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_anorxz, /*timeOlder:*/Active_anorxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_aorxz(
		/*i:*/Active_aiorxz, /*ignoreCase:*/Active_aiorxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_anorxz, /*timeNewer:*/Active_anorxz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_aorxz_long(
		/*i:*/Active_aiorxz, /*ignoreCase:*/Active_aiorxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_anorxz, /*timeNewer:*/Active_anorxz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_ainox(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ainoxz, /*print0:*/Active_ainoxz_long, /*r:*/Active_ainorx, /*regex:*/Active_ainorx_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_ainox_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ainoxz, /*print0:*/Active_ainoxz_long, /*r:*/Active_ainorx, /*regex:*/Active_ainorx_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeOther x}.*/
	Active_ainxz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_ainrxz, /*regex:*/Active_ainrxz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_ainoxz, /*timeOlder:*/Active_ainoxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeOther x}.*/
	Active_ainxz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_ainrxz, /*regex:*/Active_ainrxz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_ainoxz, /*timeOlder:*/Active_ainoxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_aioxz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_aiorxz, /*regex:*/Active_aiorxz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ainoxz, /*timeNewer:*/Active_ainoxz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_aioxz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_aiorxz, /*regex:*/Active_aiorxz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ainoxz, /*timeNewer:*/Active_ainoxz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_anoxz(
		/*i:*/Active_ainoxz, /*ignoreCase:*/Active_ainoxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_anorxz, /*regex:*/Active_anorxz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_anoxz_long(
		/*i:*/Active_ainoxz, /*ignoreCase:*/Active_ainoxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_anorxz, /*regex:*/Active_anorxz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeAccess a}, {@link #typeOther x}.*/
	Active_airx(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_airxz, /*print0:*/Active_airxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ainrx, /*timeNewer:*/Active_ainrx_long, /*o:*/Active_aiorx, /*timeOlder:*/Active_aiorx_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeAccess, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeAccess a}, {@link #typeOther x}.*/
	Active_airx_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_airxz, /*print0:*/Active_airxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ainrx, /*timeNewer:*/Active_ainrx_long, /*o:*/Active_aiorx, /*timeOlder:*/Active_aiorx_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeAccess, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeOther x}.*/
	Active_anrx(
		/*i:*/Active_ainrx, /*ignoreCase:*/Active_ainrx_long, /*z:*/Active_anrxz, /*print0:*/Active_anrxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_anorx, /*timeOlder:*/Active_anorx_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeOther x}.*/
	Active_anrx_long(
		/*i:*/Active_ainrx, /*ignoreCase:*/Active_ainrx_long, /*z:*/Active_anrxz, /*print0:*/Active_anrxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_anorx, /*timeOlder:*/Active_anorx_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.regex, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_aorx(
		/*i:*/Active_aiorx, /*ignoreCase:*/Active_aiorx_long, /*z:*/Active_aorxz, /*print0:*/Active_aorxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_anorx, /*timeNewer:*/Active_anorx_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.regex, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_aorx_long(
		/*i:*/Active_aiorx, /*ignoreCase:*/Active_aiorx_long, /*z:*/Active_aorxz, /*print0:*/Active_aorxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_anorx, /*timeNewer:*/Active_anorx_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.regex, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #typeOther x}.*/
	Active_arxz(
		/*i:*/Active_airxz, /*ignoreCase:*/Active_airxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_anrxz, /*timeNewer:*/Active_anrxz_long, /*o:*/Active_aorxz, /*timeOlder:*/Active_aorxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeAccess a}, {@link #typeOther x}.*/
	Active_arxz_long(
		/*i:*/Active_airxz, /*ignoreCase:*/Active_airxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_anrxz, /*timeNewer:*/Active_anrxz_long, /*o:*/Active_aorxz, /*timeOlder:*/Active_aorxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeAccess, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeOther x}.*/
	Active_ainx(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ainxz, /*print0:*/Active_ainxz_long, /*r:*/Active_ainrx, /*regex:*/Active_ainrx_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_ainox, /*timeOlder:*/Active_ainox_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeOther x}.*/
	Active_ainx_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ainxz, /*print0:*/Active_ainxz_long, /*r:*/Active_ainrx, /*regex:*/Active_ainrx_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_ainox, /*timeOlder:*/Active_ainox_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_aiox(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_aioxz, /*print0:*/Active_aioxz_long, /*r:*/Active_aiorx, /*regex:*/Active_aiorx_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ainox, /*timeNewer:*/Active_ainox_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_aiox_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_aioxz, /*print0:*/Active_aioxz_long, /*r:*/Active_aiorx, /*regex:*/Active_aiorx_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ainox, /*timeNewer:*/Active_ainox_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeAccess a}, {@link #typeOther x}.*/
	Active_aixz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_airxz, /*regex:*/Active_airxz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ainxz, /*timeNewer:*/Active_ainxz_long, /*o:*/Active_aioxz, /*timeOlder:*/Active_aioxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeAccess, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeAccess a}, {@link #typeOther x}.*/
	Active_aixz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_airxz, /*regex:*/Active_airxz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ainxz, /*timeNewer:*/Active_ainxz_long, /*o:*/Active_aioxz, /*timeOlder:*/Active_aioxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeAccess, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_anox(
		/*i:*/Active_ainox, /*ignoreCase:*/Active_ainox_long, /*z:*/Active_anoxz, /*print0:*/Active_anoxz_long, /*r:*/Active_anorx, /*regex:*/Active_anorx_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #timeAccess a}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_anox_long(
		/*i:*/Active_ainox, /*ignoreCase:*/Active_ainox_long, /*z:*/Active_anoxz, /*print0:*/Active_anoxz_long, /*r:*/Active_anorx, /*regex:*/Active_anorx_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.timeAccess, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeOther x}.*/
	Active_anxz(
		/*i:*/Active_ainxz, /*ignoreCase:*/Active_ainxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_anrxz, /*regex:*/Active_anrxz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_anoxz, /*timeOlder:*/Active_anoxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeOther x}.*/
	Active_anxz_long(
		/*i:*/Active_ainxz, /*ignoreCase:*/Active_ainxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_anrxz, /*regex:*/Active_anrxz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_anoxz, /*timeOlder:*/Active_anoxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.timeAccess, FindOption.timeNewer, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_aoxz(
		/*i:*/Active_aioxz, /*ignoreCase:*/Active_aioxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_aorxz, /*regex:*/Active_aorxz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_anoxz, /*timeNewer:*/Active_anoxz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_aoxz_long(
		/*i:*/Active_aioxz, /*ignoreCase:*/Active_aioxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_aorxz, /*regex:*/Active_aorxz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_anoxz, /*timeNewer:*/Active_anoxz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.timeAccess, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeAccess a}, {@link #typeOther x}.*/
	Active_arx(
		/*i:*/Active_airx, /*ignoreCase:*/Active_airx_long, /*z:*/Active_arxz, /*print0:*/Active_arxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_anrx, /*timeNewer:*/Active_anrx_long, /*o:*/Active_aorx, /*timeOlder:*/Active_aorx_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.regex, FindOption.timeAccess, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeAccess a}, {@link #typeOther x}.*/
	Active_arx_long(
		/*i:*/Active_airx, /*ignoreCase:*/Active_airx_long, /*z:*/Active_arxz, /*print0:*/Active_arxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_anrx, /*timeNewer:*/Active_anrx_long, /*o:*/Active_aorx, /*timeOlder:*/Active_aorx_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.regex, FindOption.timeAccess, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeAccess a}, {@link #typeOther x}.*/
	Active_aix(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_aixz, /*print0:*/Active_aixz_long, /*r:*/Active_airx, /*regex:*/Active_airx_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ainx, /*timeNewer:*/Active_ainx_long, /*o:*/Active_aiox, /*timeOlder:*/Active_aiox_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.timeAccess, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeAccess a}, {@link #typeOther x}.*/
	Active_aix_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_aixz, /*print0:*/Active_aixz_long, /*r:*/Active_airx, /*regex:*/Active_airx_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_ainx, /*timeNewer:*/Active_ainx_long, /*o:*/Active_aiox, /*timeOlder:*/Active_aiox_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.timeAccess, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeOther x}.*/
	Active_anx(
		/*i:*/Active_ainx, /*ignoreCase:*/Active_ainx_long, /*z:*/Active_anxz, /*print0:*/Active_anxz_long, /*r:*/Active_anrx, /*regex:*/Active_anrx_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_anox, /*timeOlder:*/Active_anox_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.timeAccess, FindOption.timeNewer, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #timeAccess a}, {@link #timeNewer n}, {@link #typeOther x}.*/
	Active_anx_long(
		/*i:*/Active_ainx, /*ignoreCase:*/Active_ainx_long, /*z:*/Active_anxz, /*print0:*/Active_anxz_long, /*r:*/Active_anrx, /*regex:*/Active_anrx_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_anox, /*timeOlder:*/Active_anox_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.timeAccess, FindOption.timeNewer, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_aox(
		/*i:*/Active_aiox, /*ignoreCase:*/Active_aiox_long, /*z:*/Active_aoxz, /*print0:*/Active_aoxz_long, /*r:*/Active_aorx, /*regex:*/Active_aorx_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_anox, /*timeNewer:*/Active_anox_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.timeAccess, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #timeAccess a}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_aox_long(
		/*i:*/Active_aiox, /*ignoreCase:*/Active_aiox_long, /*z:*/Active_aoxz, /*print0:*/Active_aoxz_long, /*r:*/Active_aorx, /*regex:*/Active_aorx_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_anox, /*timeNewer:*/Active_anox_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.timeAccess, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeAccess a}, {@link #typeOther x}.*/
	Active_axz(
		/*i:*/Active_aixz, /*ignoreCase:*/Active_aixz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_arxz, /*regex:*/Active_arxz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_anxz, /*timeNewer:*/Active_anxz_long, /*o:*/Active_aoxz, /*timeOlder:*/Active_aoxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.timeAccess, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeAccess a}, {@link #typeOther x}.*/
	Active_axz_long(
		/*i:*/Active_aixz, /*ignoreCase:*/Active_aixz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_arxz, /*regex:*/Active_arxz_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_anxz, /*timeNewer:*/Active_anxz_long, /*o:*/Active_aoxz, /*timeOlder:*/Active_aoxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.timeAccess, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #timeAccess a}, {@link #typeOther x}.*/
	Active_ax(
		/*i:*/Active_aix, /*ignoreCase:*/Active_aix_long, /*z:*/Active_axz, /*print0:*/Active_axz_long, /*r:*/Active_arx, /*regex:*/Active_arx_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_anx, /*timeNewer:*/Active_anx_long, /*o:*/Active_aox, /*timeOlder:*/Active_aox_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.timeAccess, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #timeAccess a}, {@link #typeOther x}.*/
	Active_ax_long(
		/*i:*/Active_aix, /*ignoreCase:*/Active_aix_long, /*z:*/Active_axz, /*print0:*/Active_axz_long, /*r:*/Active_arx, /*regex:*/Active_arx_long, /*a:*/null /*already set*/, /*timeAccess:*/null /*already set*/, /*n:*/Active_anx, /*timeNewer:*/Active_anx_long, /*o:*/Active_aox, /*timeOlder:*/Active_aox_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.timeAccess, FindOption.typeOther
	);
	private FindOptionSet_ainorxz(
		FindOptionSet_ainorxz i, FindOptionSet_ainorxz ignoreCase, FindOptionSet_ainorxz z, FindOptionSet_ainorxz print0, FindOptionSet_ainorxz r, FindOptionSet_ainorxz regex, FindOptionSet_ainorxz a, FindOptionSet_ainorxz timeAccess, FindOptionSet_ainorxz n, FindOptionSet_ainorxz timeNewer, FindOptionSet_ainorxz o, FindOptionSet_ainorxz timeOlder, FindOptionSet_ainorxz x, FindOptionSet_ainorxz typeOther, 
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
		this.x = x == null ? this : x;
		this.typeOther = typeOther == null ? this : typeOther;
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
	public final FindOptionSet_ainorxz i;
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
	public final FindOptionSet_ainorxz ignoreCase;
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
	public final FindOptionSet_ainorxz z;
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
	public final FindOptionSet_ainorxz print0;
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
	public final FindOptionSet_ainorxz r;
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
	public final FindOptionSet_ainorxz regex;
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
	public final FindOptionSet_ainorxz a;
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
	public final FindOptionSet_ainorxz timeAccess;
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
	public final FindOptionSet_ainorxz n;
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
	public final FindOptionSet_ainorxz timeNewer;
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
	public final FindOptionSet_ainorxz o;
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
	public final FindOptionSet_ainorxz timeOlder;
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
	public final FindOptionSet_ainorxz x;
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
	public final FindOptionSet_ainorxz typeOther;
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
	 *    FindOptionSet_ainorxz.ignoreCase.z;
	 * </pre>
	 * uses acronyms, that is, this method always returns true for the above 
	 * set. 
	 * <p>
	 * On the other hand, long option names are used and this method always 
	 * returns false for the set
	 * <pre>
	 *    FindOptionSet_ainorxz.i.print0;
	 * </pre>
	 * <p>
	 * Note that a repeated option is <i>not</i> treated as the last set option.
	 * For instance, the first and last option of the following set are 
	 * equivalent and acronyms are used:
	 * <pre>
	 *    FindOptionSet_ainorxz.i.z.ignoreCase;
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
