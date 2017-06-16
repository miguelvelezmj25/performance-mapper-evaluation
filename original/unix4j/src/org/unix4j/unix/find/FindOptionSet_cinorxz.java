package org.unix4j.unix.find;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import org.unix4j.option.Option;

import org.unix4j.unix.Find;

/**
 * Option sets for the {@link Find find} command with 
 * the following options: {@link #i i}, {@link #z z}, {@link #r r}, {@link #c c}, {@link #n n}, {@link #o o}, {@link #x x}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Find#Options} should be used instead to specify command 
 * options. See also {@link org.unix4j.unix.find.FindOptions} for more information.
 */
public enum FindOptionSet_cinorxz implements FindOptions {
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_cinorxz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_cinorxz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_cinorx(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cinorxz, /*print0:*/Active_cinorxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_cinorx_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cinorxz, /*print0:*/Active_cinorxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeOther x}.*/
	Active_cinrxz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cinorxz, /*timeOlder:*/Active_cinorxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeOther x}.*/
	Active_cinrxz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cinorxz, /*timeOlder:*/Active_cinorxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_ciorxz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cinorxz, /*timeNewer:*/Active_cinorxz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_ciorxz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cinorxz, /*timeNewer:*/Active_cinorxz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_cnorxz(
		/*i:*/Active_cinorxz, /*ignoreCase:*/Active_cinorxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_cnorxz_long(
		/*i:*/Active_cinorxz, /*ignoreCase:*/Active_cinorxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_cinoxz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cinorxz, /*regex:*/Active_cinorxz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_cinoxz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cinorxz, /*regex:*/Active_cinorxz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeOther x}.*/
	Active_cinrx(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cinrxz, /*print0:*/Active_cinrxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cinorx, /*timeOlder:*/Active_cinorx_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeOther x}.*/
	Active_cinrx_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cinrxz, /*print0:*/Active_cinrxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cinorx, /*timeOlder:*/Active_cinorx_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_ciorx(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ciorxz, /*print0:*/Active_ciorxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cinorx, /*timeNewer:*/Active_cinorx_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_ciorx_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ciorxz, /*print0:*/Active_ciorxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cinorx, /*timeNewer:*/Active_cinorx_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #typeOther x}.*/
	Active_cirxz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cinrxz, /*timeNewer:*/Active_cinrxz_long, /*o:*/Active_ciorxz, /*timeOlder:*/Active_ciorxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #typeOther x}.*/
	Active_cirxz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cinrxz, /*timeNewer:*/Active_cinrxz_long, /*o:*/Active_ciorxz, /*timeOlder:*/Active_ciorxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_cnorx(
		/*i:*/Active_cinorx, /*ignoreCase:*/Active_cinorx_long, /*z:*/Active_cnorxz, /*print0:*/Active_cnorxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_cnorx_long(
		/*i:*/Active_cinorx, /*ignoreCase:*/Active_cinorx_long, /*z:*/Active_cnorxz, /*print0:*/Active_cnorxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeOther x}.*/
	Active_cnrxz(
		/*i:*/Active_cinrxz, /*ignoreCase:*/Active_cinrxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cnorxz, /*timeOlder:*/Active_cnorxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeOther x}.*/
	Active_cnrxz_long(
		/*i:*/Active_cinrxz, /*ignoreCase:*/Active_cinrxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cnorxz, /*timeOlder:*/Active_cnorxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_corxz(
		/*i:*/Active_ciorxz, /*ignoreCase:*/Active_ciorxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cnorxz, /*timeNewer:*/Active_cnorxz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_corxz_long(
		/*i:*/Active_ciorxz, /*ignoreCase:*/Active_ciorxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cnorxz, /*timeNewer:*/Active_cnorxz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_cinox(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cinoxz, /*print0:*/Active_cinoxz_long, /*r:*/Active_cinorx, /*regex:*/Active_cinorx_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_cinox_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cinoxz, /*print0:*/Active_cinoxz_long, /*r:*/Active_cinorx, /*regex:*/Active_cinorx_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeOther x}.*/
	Active_cinxz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cinrxz, /*regex:*/Active_cinrxz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cinoxz, /*timeOlder:*/Active_cinoxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeOther x}.*/
	Active_cinxz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cinrxz, /*regex:*/Active_cinrxz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cinoxz, /*timeOlder:*/Active_cinoxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_cioxz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_ciorxz, /*regex:*/Active_ciorxz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cinoxz, /*timeNewer:*/Active_cinoxz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_cioxz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_ciorxz, /*regex:*/Active_ciorxz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cinoxz, /*timeNewer:*/Active_cinoxz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_cnoxz(
		/*i:*/Active_cinoxz, /*ignoreCase:*/Active_cinoxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cnorxz, /*regex:*/Active_cnorxz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_cnoxz_long(
		/*i:*/Active_cinoxz, /*ignoreCase:*/Active_cinoxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cnorxz, /*regex:*/Active_cnorxz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeCreate c}, {@link #typeOther x}.*/
	Active_cirx(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cirxz, /*print0:*/Active_cirxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cinrx, /*timeNewer:*/Active_cinrx_long, /*o:*/Active_ciorx, /*timeOlder:*/Active_ciorx_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeCreate, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeCreate c}, {@link #typeOther x}.*/
	Active_cirx_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cirxz, /*print0:*/Active_cirxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cinrx, /*timeNewer:*/Active_cinrx_long, /*o:*/Active_ciorx, /*timeOlder:*/Active_ciorx_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeCreate, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeOther x}.*/
	Active_cnrx(
		/*i:*/Active_cinrx, /*ignoreCase:*/Active_cinrx_long, /*z:*/Active_cnrxz, /*print0:*/Active_cnrxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cnorx, /*timeOlder:*/Active_cnorx_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeOther x}.*/
	Active_cnrx_long(
		/*i:*/Active_cinrx, /*ignoreCase:*/Active_cinrx_long, /*z:*/Active_cnrxz, /*print0:*/Active_cnrxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cnorx, /*timeOlder:*/Active_cnorx_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.regex, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_corx(
		/*i:*/Active_ciorx, /*ignoreCase:*/Active_ciorx_long, /*z:*/Active_corxz, /*print0:*/Active_corxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cnorx, /*timeNewer:*/Active_cnorx_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.regex, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_corx_long(
		/*i:*/Active_ciorx, /*ignoreCase:*/Active_ciorx_long, /*z:*/Active_corxz, /*print0:*/Active_corxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cnorx, /*timeNewer:*/Active_cnorx_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.regex, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #typeOther x}.*/
	Active_crxz(
		/*i:*/Active_cirxz, /*ignoreCase:*/Active_cirxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cnrxz, /*timeNewer:*/Active_cnrxz_long, /*o:*/Active_corxz, /*timeOlder:*/Active_corxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeCreate c}, {@link #typeOther x}.*/
	Active_crxz_long(
		/*i:*/Active_cirxz, /*ignoreCase:*/Active_cirxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cnrxz, /*timeNewer:*/Active_cnrxz_long, /*o:*/Active_corxz, /*timeOlder:*/Active_corxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeCreate, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeOther x}.*/
	Active_cinx(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cinxz, /*print0:*/Active_cinxz_long, /*r:*/Active_cinrx, /*regex:*/Active_cinrx_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cinox, /*timeOlder:*/Active_cinox_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeOther x}.*/
	Active_cinx_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cinxz, /*print0:*/Active_cinxz_long, /*r:*/Active_cinrx, /*regex:*/Active_cinrx_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cinox, /*timeOlder:*/Active_cinox_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_ciox(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cioxz, /*print0:*/Active_cioxz_long, /*r:*/Active_ciorx, /*regex:*/Active_ciorx_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cinox, /*timeNewer:*/Active_cinox_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_ciox_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cioxz, /*print0:*/Active_cioxz_long, /*r:*/Active_ciorx, /*regex:*/Active_ciorx_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cinox, /*timeNewer:*/Active_cinox_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeCreate c}, {@link #typeOther x}.*/
	Active_cixz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cirxz, /*regex:*/Active_cirxz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cinxz, /*timeNewer:*/Active_cinxz_long, /*o:*/Active_cioxz, /*timeOlder:*/Active_cioxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeCreate, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeCreate c}, {@link #typeOther x}.*/
	Active_cixz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cirxz, /*regex:*/Active_cirxz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cinxz, /*timeNewer:*/Active_cinxz_long, /*o:*/Active_cioxz, /*timeOlder:*/Active_cioxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeCreate, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_cnox(
		/*i:*/Active_cinox, /*ignoreCase:*/Active_cinox_long, /*z:*/Active_cnoxz, /*print0:*/Active_cnoxz_long, /*r:*/Active_cnorx, /*regex:*/Active_cnorx_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #timeCreate c}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_cnox_long(
		/*i:*/Active_cinox, /*ignoreCase:*/Active_cinox_long, /*z:*/Active_cnoxz, /*print0:*/Active_cnoxz_long, /*r:*/Active_cnorx, /*regex:*/Active_cnorx_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.timeCreate, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeOther x}.*/
	Active_cnxz(
		/*i:*/Active_cinxz, /*ignoreCase:*/Active_cinxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cnrxz, /*regex:*/Active_cnrxz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cnoxz, /*timeOlder:*/Active_cnoxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeOther x}.*/
	Active_cnxz_long(
		/*i:*/Active_cinxz, /*ignoreCase:*/Active_cinxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_cnrxz, /*regex:*/Active_cnrxz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cnoxz, /*timeOlder:*/Active_cnoxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.timeCreate, FindOption.timeNewer, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_coxz(
		/*i:*/Active_cioxz, /*ignoreCase:*/Active_cioxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_corxz, /*regex:*/Active_corxz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cnoxz, /*timeNewer:*/Active_cnoxz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_coxz_long(
		/*i:*/Active_cioxz, /*ignoreCase:*/Active_cioxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_corxz, /*regex:*/Active_corxz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cnoxz, /*timeNewer:*/Active_cnoxz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.timeCreate, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeCreate c}, {@link #typeOther x}.*/
	Active_crx(
		/*i:*/Active_cirx, /*ignoreCase:*/Active_cirx_long, /*z:*/Active_crxz, /*print0:*/Active_crxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cnrx, /*timeNewer:*/Active_cnrx_long, /*o:*/Active_corx, /*timeOlder:*/Active_corx_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.regex, FindOption.timeCreate, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #regex r}, {@link #timeCreate c}, {@link #typeOther x}.*/
	Active_crx_long(
		/*i:*/Active_cirx, /*ignoreCase:*/Active_cirx_long, /*z:*/Active_crxz, /*print0:*/Active_crxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cnrx, /*timeNewer:*/Active_cnrx_long, /*o:*/Active_corx, /*timeOlder:*/Active_corx_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.regex, FindOption.timeCreate, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeCreate c}, {@link #typeOther x}.*/
	Active_cix(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cixz, /*print0:*/Active_cixz_long, /*r:*/Active_cirx, /*regex:*/Active_cirx_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cinx, /*timeNewer:*/Active_cinx_long, /*o:*/Active_ciox, /*timeOlder:*/Active_ciox_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.ignoreCase, FindOption.timeCreate, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #ignoreCase i}, {@link #timeCreate c}, {@link #typeOther x}.*/
	Active_cix_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_cixz, /*print0:*/Active_cixz_long, /*r:*/Active_cirx, /*regex:*/Active_cirx_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cinx, /*timeNewer:*/Active_cinx_long, /*o:*/Active_ciox, /*timeOlder:*/Active_ciox_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.ignoreCase, FindOption.timeCreate, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeOther x}.*/
	Active_cnx(
		/*i:*/Active_cinx, /*ignoreCase:*/Active_cinx_long, /*z:*/Active_cnxz, /*print0:*/Active_cnxz_long, /*r:*/Active_cnrx, /*regex:*/Active_cnrx_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cnox, /*timeOlder:*/Active_cnox_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.timeCreate, FindOption.timeNewer, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #timeCreate c}, {@link #timeNewer n}, {@link #typeOther x}.*/
	Active_cnx_long(
		/*i:*/Active_cinx, /*ignoreCase:*/Active_cinx_long, /*z:*/Active_cnxz, /*print0:*/Active_cnxz_long, /*r:*/Active_cnrx, /*regex:*/Active_cnrx_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_cnox, /*timeOlder:*/Active_cnox_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.timeCreate, FindOption.timeNewer, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_cox(
		/*i:*/Active_ciox, /*ignoreCase:*/Active_ciox_long, /*z:*/Active_coxz, /*print0:*/Active_coxz_long, /*r:*/Active_corx, /*regex:*/Active_corx_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cnox, /*timeNewer:*/Active_cnox_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.timeCreate, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #timeCreate c}, {@link #timeOlder o}, {@link #typeOther x}.*/
	Active_cox_long(
		/*i:*/Active_ciox, /*ignoreCase:*/Active_ciox_long, /*z:*/Active_coxz, /*print0:*/Active_coxz_long, /*r:*/Active_corx, /*regex:*/Active_corx_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cnox, /*timeNewer:*/Active_cnox_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.timeCreate, FindOption.timeOlder, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeCreate c}, {@link #typeOther x}.*/
	Active_cxz(
		/*i:*/Active_cixz, /*ignoreCase:*/Active_cixz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_crxz, /*regex:*/Active_crxz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cnxz, /*timeNewer:*/Active_cnxz_long, /*o:*/Active_coxz, /*timeOlder:*/Active_coxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.print0, FindOption.timeCreate, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #print0 z}, {@link #timeCreate c}, {@link #typeOther x}.*/
	Active_cxz_long(
		/*i:*/Active_cixz, /*ignoreCase:*/Active_cixz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_crxz, /*regex:*/Active_crxz_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cnxz, /*timeNewer:*/Active_cnxz_long, /*o:*/Active_coxz, /*timeOlder:*/Active_coxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.print0, FindOption.timeCreate, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #timeCreate c}, {@link #typeOther x}.*/
	Active_cx(
		/*i:*/Active_cix, /*ignoreCase:*/Active_cix_long, /*z:*/Active_cxz, /*print0:*/Active_cxz_long, /*r:*/Active_crx, /*regex:*/Active_crx_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cnx, /*timeNewer:*/Active_cnx_long, /*o:*/Active_cox, /*timeOlder:*/Active_cox_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		true, 
		/*active:*/FindOption.timeCreate, FindOption.typeOther
	),
	/** Option set with the following active options: {@link #timeCreate c}, {@link #typeOther x}.*/
	Active_cx_long(
		/*i:*/Active_cix, /*ignoreCase:*/Active_cix_long, /*z:*/Active_cxz, /*print0:*/Active_cxz_long, /*r:*/Active_crx, /*regex:*/Active_crx_long, /*c:*/null /*already set*/, /*timeCreate:*/null /*already set*/, /*n:*/Active_cnx, /*timeNewer:*/Active_cnx_long, /*o:*/Active_cox, /*timeOlder:*/Active_cox_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/, 
		false, 
		/*active:*/FindOption.timeCreate, FindOption.typeOther
	);
	private FindOptionSet_cinorxz(
		FindOptionSet_cinorxz i, FindOptionSet_cinorxz ignoreCase, FindOptionSet_cinorxz z, FindOptionSet_cinorxz print0, FindOptionSet_cinorxz r, FindOptionSet_cinorxz regex, FindOptionSet_cinorxz c, FindOptionSet_cinorxz timeCreate, FindOptionSet_cinorxz n, FindOptionSet_cinorxz timeNewer, FindOptionSet_cinorxz o, FindOptionSet_cinorxz timeOlder, FindOptionSet_cinorxz x, FindOptionSet_cinorxz typeOther, 
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
	public final FindOptionSet_cinorxz i;
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
	public final FindOptionSet_cinorxz ignoreCase;
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
	public final FindOptionSet_cinorxz z;
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
	public final FindOptionSet_cinorxz print0;
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
	public final FindOptionSet_cinorxz r;
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
	public final FindOptionSet_cinorxz regex;
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
	public final FindOptionSet_cinorxz c;
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
	public final FindOptionSet_cinorxz timeCreate;
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
	public final FindOptionSet_cinorxz n;
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
	public final FindOptionSet_cinorxz timeNewer;
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
	public final FindOptionSet_cinorxz o;
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
	public final FindOptionSet_cinorxz timeOlder;
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
	public final FindOptionSet_cinorxz x;
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
	public final FindOptionSet_cinorxz typeOther;
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
	 *    FindOptionSet_cinorxz.ignoreCase.z;
	 * </pre>
	 * uses acronyms, that is, this method always returns true for the above 
	 * set. 
	 * <p>
	 * On the other hand, long option names are used and this method always 
	 * returns false for the set
	 * <pre>
	 *    FindOptionSet_cinorxz.i.print0;
	 * </pre>
	 * <p>
	 * Note that a repeated option is <i>not</i> treated as the last set option.
	 * For instance, the first and last option of the following set are 
	 * equivalent and acronyms are used:
	 * <pre>
	 *    FindOptionSet_cinorxz.i.z.ignoreCase;
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
