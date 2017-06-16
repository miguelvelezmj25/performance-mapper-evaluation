package org.unix4j.unix.ls;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import org.unix4j.option.Option;

import org.unix4j.unix.Ls;

/**
 * Option sets for the {@link Ls ls} command with 
 * the following options: {@link #a a}, {@link #h h}, {@link #l l}, {@link #R R}, {@link #r r}, {@link #t t}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Ls#Options} should be used instead to specify command 
 * options. See also {@link org.unix4j.unix.ls.LsOptions} for more information.
 */
public enum LsOptionSet_Rahlrt implements LsOptions {
	/** Option set with the following active options: {@link #allFiles a}, {@link #humanReadable h}, {@link #longFormat l}, {@link #recurseSubdirs R}, {@link #reverseOrder r}, {@link #timeSorted t}.*/
	Active_Rahlrt(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		true, 
		/*active:*/LsOption.allFiles, LsOption.humanReadable, LsOption.longFormat, LsOption.recurseSubdirs, LsOption.reverseOrder, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #humanReadable h}, {@link #longFormat l}, {@link #recurseSubdirs R}, {@link #reverseOrder r}, {@link #timeSorted t}.*/
	Active_Rahlrt_long(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		false, 
		/*active:*/LsOption.allFiles, LsOption.humanReadable, LsOption.longFormat, LsOption.recurseSubdirs, LsOption.reverseOrder, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #humanReadable h}, {@link #longFormat l}, {@link #recurseSubdirs R}, {@link #reverseOrder r}.*/
	Active_Rahlr(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/Active_Rahlrt, /*timeSorted:*/Active_Rahlrt_long, 
		true, 
		/*active:*/LsOption.allFiles, LsOption.humanReadable, LsOption.longFormat, LsOption.recurseSubdirs, LsOption.reverseOrder
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #humanReadable h}, {@link #longFormat l}, {@link #recurseSubdirs R}, {@link #reverseOrder r}.*/
	Active_Rahlr_long(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/Active_Rahlrt, /*timeSorted:*/Active_Rahlrt_long, 
		false, 
		/*active:*/LsOption.allFiles, LsOption.humanReadable, LsOption.longFormat, LsOption.recurseSubdirs, LsOption.reverseOrder
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #humanReadable h}, {@link #longFormat l}, {@link #recurseSubdirs R}, {@link #timeSorted t}.*/
	Active_Rahlt(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/Active_Rahlrt, /*reverseOrder:*/Active_Rahlrt_long, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		true, 
		/*active:*/LsOption.allFiles, LsOption.humanReadable, LsOption.longFormat, LsOption.recurseSubdirs, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #humanReadable h}, {@link #longFormat l}, {@link #recurseSubdirs R}, {@link #timeSorted t}.*/
	Active_Rahlt_long(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/Active_Rahlrt, /*reverseOrder:*/Active_Rahlrt_long, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		false, 
		/*active:*/LsOption.allFiles, LsOption.humanReadable, LsOption.longFormat, LsOption.recurseSubdirs, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #humanReadable h}, {@link #longFormat l}, {@link #reverseOrder r}, {@link #timeSorted t}.*/
	Active_ahlrt(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/Active_Rahlrt, /*recurseSubdirs:*/Active_Rahlrt_long, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		true, 
		/*active:*/LsOption.allFiles, LsOption.humanReadable, LsOption.longFormat, LsOption.reverseOrder, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #humanReadable h}, {@link #longFormat l}, {@link #reverseOrder r}, {@link #timeSorted t}.*/
	Active_ahlrt_long(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/Active_Rahlrt, /*recurseSubdirs:*/Active_Rahlrt_long, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		false, 
		/*active:*/LsOption.allFiles, LsOption.humanReadable, LsOption.longFormat, LsOption.reverseOrder, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #humanReadable h}, {@link #recurseSubdirs R}, {@link #reverseOrder r}, {@link #timeSorted t}.*/
	Active_Rahrt(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/Active_Rahlrt, /*longFormat:*/Active_Rahlrt_long, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		true, 
		/*active:*/LsOption.allFiles, LsOption.humanReadable, LsOption.recurseSubdirs, LsOption.reverseOrder, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #humanReadable h}, {@link #recurseSubdirs R}, {@link #reverseOrder r}, {@link #timeSorted t}.*/
	Active_Rahrt_long(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/Active_Rahlrt, /*longFormat:*/Active_Rahlrt_long, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		false, 
		/*active:*/LsOption.allFiles, LsOption.humanReadable, LsOption.recurseSubdirs, LsOption.reverseOrder, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #longFormat l}, {@link #recurseSubdirs R}, {@link #reverseOrder r}, {@link #timeSorted t}.*/
	Active_Ralrt(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/Active_Rahlrt, /*humanReadable:*/Active_Rahlrt_long, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		true, 
		/*active:*/LsOption.allFiles, LsOption.longFormat, LsOption.recurseSubdirs, LsOption.reverseOrder, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #longFormat l}, {@link #recurseSubdirs R}, {@link #reverseOrder r}, {@link #timeSorted t}.*/
	Active_Ralrt_long(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/Active_Rahlrt, /*humanReadable:*/Active_Rahlrt_long, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		false, 
		/*active:*/LsOption.allFiles, LsOption.longFormat, LsOption.recurseSubdirs, LsOption.reverseOrder, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #humanReadable h}, {@link #longFormat l}, {@link #recurseSubdirs R}, {@link #reverseOrder r}, {@link #timeSorted t}.*/
	Active_Rhlrt(
		/*a:*/Active_Rahlrt, /*allFiles:*/Active_Rahlrt_long, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		true, 
		/*active:*/LsOption.humanReadable, LsOption.longFormat, LsOption.recurseSubdirs, LsOption.reverseOrder, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #humanReadable h}, {@link #longFormat l}, {@link #recurseSubdirs R}, {@link #reverseOrder r}, {@link #timeSorted t}.*/
	Active_Rhlrt_long(
		/*a:*/Active_Rahlrt, /*allFiles:*/Active_Rahlrt_long, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		false, 
		/*active:*/LsOption.humanReadable, LsOption.longFormat, LsOption.recurseSubdirs, LsOption.reverseOrder, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #humanReadable h}, {@link #longFormat l}, {@link #recurseSubdirs R}.*/
	Active_Rahl(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/Active_Rahlr, /*reverseOrder:*/Active_Rahlr_long, /*t:*/Active_Rahlt, /*timeSorted:*/Active_Rahlt_long, 
		true, 
		/*active:*/LsOption.allFiles, LsOption.humanReadable, LsOption.longFormat, LsOption.recurseSubdirs
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #humanReadable h}, {@link #longFormat l}, {@link #recurseSubdirs R}.*/
	Active_Rahl_long(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/Active_Rahlr, /*reverseOrder:*/Active_Rahlr_long, /*t:*/Active_Rahlt, /*timeSorted:*/Active_Rahlt_long, 
		false, 
		/*active:*/LsOption.allFiles, LsOption.humanReadable, LsOption.longFormat, LsOption.recurseSubdirs
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #humanReadable h}, {@link #longFormat l}, {@link #reverseOrder r}.*/
	Active_ahlr(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/Active_Rahlr, /*recurseSubdirs:*/Active_Rahlr_long, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/Active_ahlrt, /*timeSorted:*/Active_ahlrt_long, 
		true, 
		/*active:*/LsOption.allFiles, LsOption.humanReadable, LsOption.longFormat, LsOption.reverseOrder
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #humanReadable h}, {@link #longFormat l}, {@link #reverseOrder r}.*/
	Active_ahlr_long(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/Active_Rahlr, /*recurseSubdirs:*/Active_Rahlr_long, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/Active_ahlrt, /*timeSorted:*/Active_ahlrt_long, 
		false, 
		/*active:*/LsOption.allFiles, LsOption.humanReadable, LsOption.longFormat, LsOption.reverseOrder
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #humanReadable h}, {@link #longFormat l}, {@link #timeSorted t}.*/
	Active_ahlt(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/Active_Rahlt, /*recurseSubdirs:*/Active_Rahlt_long, /*r:*/Active_ahlrt, /*reverseOrder:*/Active_ahlrt_long, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		true, 
		/*active:*/LsOption.allFiles, LsOption.humanReadable, LsOption.longFormat, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #humanReadable h}, {@link #longFormat l}, {@link #timeSorted t}.*/
	Active_ahlt_long(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/Active_Rahlt, /*recurseSubdirs:*/Active_Rahlt_long, /*r:*/Active_ahlrt, /*reverseOrder:*/Active_ahlrt_long, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		false, 
		/*active:*/LsOption.allFiles, LsOption.humanReadable, LsOption.longFormat, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #humanReadable h}, {@link #recurseSubdirs R}, {@link #reverseOrder r}.*/
	Active_Rahr(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/Active_Rahlr, /*longFormat:*/Active_Rahlr_long, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/Active_Rahrt, /*timeSorted:*/Active_Rahrt_long, 
		true, 
		/*active:*/LsOption.allFiles, LsOption.humanReadable, LsOption.recurseSubdirs, LsOption.reverseOrder
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #humanReadable h}, {@link #recurseSubdirs R}, {@link #reverseOrder r}.*/
	Active_Rahr_long(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/Active_Rahlr, /*longFormat:*/Active_Rahlr_long, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/Active_Rahrt, /*timeSorted:*/Active_Rahrt_long, 
		false, 
		/*active:*/LsOption.allFiles, LsOption.humanReadable, LsOption.recurseSubdirs, LsOption.reverseOrder
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #humanReadable h}, {@link #recurseSubdirs R}, {@link #timeSorted t}.*/
	Active_Raht(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/Active_Rahlt, /*longFormat:*/Active_Rahlt_long, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/Active_Rahrt, /*reverseOrder:*/Active_Rahrt_long, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		true, 
		/*active:*/LsOption.allFiles, LsOption.humanReadable, LsOption.recurseSubdirs, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #humanReadable h}, {@link #recurseSubdirs R}, {@link #timeSorted t}.*/
	Active_Raht_long(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/Active_Rahlt, /*longFormat:*/Active_Rahlt_long, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/Active_Rahrt, /*reverseOrder:*/Active_Rahrt_long, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		false, 
		/*active:*/LsOption.allFiles, LsOption.humanReadable, LsOption.recurseSubdirs, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #humanReadable h}, {@link #reverseOrder r}, {@link #timeSorted t}.*/
	Active_ahrt(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/Active_ahlrt, /*longFormat:*/Active_ahlrt_long, /*R:*/Active_Rahrt, /*recurseSubdirs:*/Active_Rahrt_long, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		true, 
		/*active:*/LsOption.allFiles, LsOption.humanReadable, LsOption.reverseOrder, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #humanReadable h}, {@link #reverseOrder r}, {@link #timeSorted t}.*/
	Active_ahrt_long(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/Active_ahlrt, /*longFormat:*/Active_ahlrt_long, /*R:*/Active_Rahrt, /*recurseSubdirs:*/Active_Rahrt_long, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		false, 
		/*active:*/LsOption.allFiles, LsOption.humanReadable, LsOption.reverseOrder, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #longFormat l}, {@link #recurseSubdirs R}, {@link #reverseOrder r}.*/
	Active_Ralr(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/Active_Rahlr, /*humanReadable:*/Active_Rahlr_long, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/Active_Ralrt, /*timeSorted:*/Active_Ralrt_long, 
		true, 
		/*active:*/LsOption.allFiles, LsOption.longFormat, LsOption.recurseSubdirs, LsOption.reverseOrder
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #longFormat l}, {@link #recurseSubdirs R}, {@link #reverseOrder r}.*/
	Active_Ralr_long(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/Active_Rahlr, /*humanReadable:*/Active_Rahlr_long, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/Active_Ralrt, /*timeSorted:*/Active_Ralrt_long, 
		false, 
		/*active:*/LsOption.allFiles, LsOption.longFormat, LsOption.recurseSubdirs, LsOption.reverseOrder
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #longFormat l}, {@link #recurseSubdirs R}, {@link #timeSorted t}.*/
	Active_Ralt(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/Active_Rahlt, /*humanReadable:*/Active_Rahlt_long, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/Active_Ralrt, /*reverseOrder:*/Active_Ralrt_long, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		true, 
		/*active:*/LsOption.allFiles, LsOption.longFormat, LsOption.recurseSubdirs, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #longFormat l}, {@link #recurseSubdirs R}, {@link #timeSorted t}.*/
	Active_Ralt_long(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/Active_Rahlt, /*humanReadable:*/Active_Rahlt_long, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/Active_Ralrt, /*reverseOrder:*/Active_Ralrt_long, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		false, 
		/*active:*/LsOption.allFiles, LsOption.longFormat, LsOption.recurseSubdirs, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #longFormat l}, {@link #reverseOrder r}, {@link #timeSorted t}.*/
	Active_alrt(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/Active_ahlrt, /*humanReadable:*/Active_ahlrt_long, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/Active_Ralrt, /*recurseSubdirs:*/Active_Ralrt_long, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		true, 
		/*active:*/LsOption.allFiles, LsOption.longFormat, LsOption.reverseOrder, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #longFormat l}, {@link #reverseOrder r}, {@link #timeSorted t}.*/
	Active_alrt_long(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/Active_ahlrt, /*humanReadable:*/Active_ahlrt_long, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/Active_Ralrt, /*recurseSubdirs:*/Active_Ralrt_long, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		false, 
		/*active:*/LsOption.allFiles, LsOption.longFormat, LsOption.reverseOrder, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #recurseSubdirs R}, {@link #reverseOrder r}, {@link #timeSorted t}.*/
	Active_Rart(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/Active_Rahrt, /*humanReadable:*/Active_Rahrt_long, /*l:*/Active_Ralrt, /*longFormat:*/Active_Ralrt_long, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		true, 
		/*active:*/LsOption.allFiles, LsOption.recurseSubdirs, LsOption.reverseOrder, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #recurseSubdirs R}, {@link #reverseOrder r}, {@link #timeSorted t}.*/
	Active_Rart_long(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/Active_Rahrt, /*humanReadable:*/Active_Rahrt_long, /*l:*/Active_Ralrt, /*longFormat:*/Active_Ralrt_long, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		false, 
		/*active:*/LsOption.allFiles, LsOption.recurseSubdirs, LsOption.reverseOrder, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #humanReadable h}, {@link #longFormat l}, {@link #recurseSubdirs R}, {@link #reverseOrder r}.*/
	Active_Rhlr(
		/*a:*/Active_Rahlr, /*allFiles:*/Active_Rahlr_long, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/Active_Rhlrt, /*timeSorted:*/Active_Rhlrt_long, 
		true, 
		/*active:*/LsOption.humanReadable, LsOption.longFormat, LsOption.recurseSubdirs, LsOption.reverseOrder
	),
	/** Option set with the following active options: {@link #humanReadable h}, {@link #longFormat l}, {@link #recurseSubdirs R}, {@link #reverseOrder r}.*/
	Active_Rhlr_long(
		/*a:*/Active_Rahlr, /*allFiles:*/Active_Rahlr_long, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/Active_Rhlrt, /*timeSorted:*/Active_Rhlrt_long, 
		false, 
		/*active:*/LsOption.humanReadable, LsOption.longFormat, LsOption.recurseSubdirs, LsOption.reverseOrder
	),
	/** Option set with the following active options: {@link #humanReadable h}, {@link #longFormat l}, {@link #recurseSubdirs R}, {@link #timeSorted t}.*/
	Active_Rhlt(
		/*a:*/Active_Rahlt, /*allFiles:*/Active_Rahlt_long, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/Active_Rhlrt, /*reverseOrder:*/Active_Rhlrt_long, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		true, 
		/*active:*/LsOption.humanReadable, LsOption.longFormat, LsOption.recurseSubdirs, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #humanReadable h}, {@link #longFormat l}, {@link #recurseSubdirs R}, {@link #timeSorted t}.*/
	Active_Rhlt_long(
		/*a:*/Active_Rahlt, /*allFiles:*/Active_Rahlt_long, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/Active_Rhlrt, /*reverseOrder:*/Active_Rhlrt_long, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		false, 
		/*active:*/LsOption.humanReadable, LsOption.longFormat, LsOption.recurseSubdirs, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #humanReadable h}, {@link #longFormat l}, {@link #reverseOrder r}, {@link #timeSorted t}.*/
	Active_hlrt(
		/*a:*/Active_ahlrt, /*allFiles:*/Active_ahlrt_long, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/Active_Rhlrt, /*recurseSubdirs:*/Active_Rhlrt_long, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		true, 
		/*active:*/LsOption.humanReadable, LsOption.longFormat, LsOption.reverseOrder, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #humanReadable h}, {@link #longFormat l}, {@link #reverseOrder r}, {@link #timeSorted t}.*/
	Active_hlrt_long(
		/*a:*/Active_ahlrt, /*allFiles:*/Active_ahlrt_long, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/Active_Rhlrt, /*recurseSubdirs:*/Active_Rhlrt_long, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		false, 
		/*active:*/LsOption.humanReadable, LsOption.longFormat, LsOption.reverseOrder, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #humanReadable h}, {@link #recurseSubdirs R}, {@link #reverseOrder r}, {@link #timeSorted t}.*/
	Active_Rhrt(
		/*a:*/Active_Rahrt, /*allFiles:*/Active_Rahrt_long, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/Active_Rhlrt, /*longFormat:*/Active_Rhlrt_long, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		true, 
		/*active:*/LsOption.humanReadable, LsOption.recurseSubdirs, LsOption.reverseOrder, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #humanReadable h}, {@link #recurseSubdirs R}, {@link #reverseOrder r}, {@link #timeSorted t}.*/
	Active_Rhrt_long(
		/*a:*/Active_Rahrt, /*allFiles:*/Active_Rahrt_long, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/Active_Rhlrt, /*longFormat:*/Active_Rhlrt_long, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		false, 
		/*active:*/LsOption.humanReadable, LsOption.recurseSubdirs, LsOption.reverseOrder, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #longFormat l}, {@link #recurseSubdirs R}, {@link #reverseOrder r}, {@link #timeSorted t}.*/
	Active_Rlrt(
		/*a:*/Active_Ralrt, /*allFiles:*/Active_Ralrt_long, /*h:*/Active_Rhlrt, /*humanReadable:*/Active_Rhlrt_long, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		true, 
		/*active:*/LsOption.longFormat, LsOption.recurseSubdirs, LsOption.reverseOrder, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #longFormat l}, {@link #recurseSubdirs R}, {@link #reverseOrder r}, {@link #timeSorted t}.*/
	Active_Rlrt_long(
		/*a:*/Active_Ralrt, /*allFiles:*/Active_Ralrt_long, /*h:*/Active_Rhlrt, /*humanReadable:*/Active_Rhlrt_long, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		false, 
		/*active:*/LsOption.longFormat, LsOption.recurseSubdirs, LsOption.reverseOrder, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #humanReadable h}, {@link #longFormat l}.*/
	Active_ahl(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/Active_Rahl, /*recurseSubdirs:*/Active_Rahl_long, /*r:*/Active_ahlr, /*reverseOrder:*/Active_ahlr_long, /*t:*/Active_ahlt, /*timeSorted:*/Active_ahlt_long, 
		true, 
		/*active:*/LsOption.allFiles, LsOption.humanReadable, LsOption.longFormat
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #humanReadable h}, {@link #longFormat l}.*/
	Active_ahl_long(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/Active_Rahl, /*recurseSubdirs:*/Active_Rahl_long, /*r:*/Active_ahlr, /*reverseOrder:*/Active_ahlr_long, /*t:*/Active_ahlt, /*timeSorted:*/Active_ahlt_long, 
		false, 
		/*active:*/LsOption.allFiles, LsOption.humanReadable, LsOption.longFormat
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #humanReadable h}, {@link #recurseSubdirs R}.*/
	Active_Rah(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/Active_Rahl, /*longFormat:*/Active_Rahl_long, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/Active_Rahr, /*reverseOrder:*/Active_Rahr_long, /*t:*/Active_Raht, /*timeSorted:*/Active_Raht_long, 
		true, 
		/*active:*/LsOption.allFiles, LsOption.humanReadable, LsOption.recurseSubdirs
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #humanReadable h}, {@link #recurseSubdirs R}.*/
	Active_Rah_long(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/Active_Rahl, /*longFormat:*/Active_Rahl_long, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/Active_Rahr, /*reverseOrder:*/Active_Rahr_long, /*t:*/Active_Raht, /*timeSorted:*/Active_Raht_long, 
		false, 
		/*active:*/LsOption.allFiles, LsOption.humanReadable, LsOption.recurseSubdirs
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #humanReadable h}, {@link #reverseOrder r}.*/
	Active_ahr(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/Active_ahlr, /*longFormat:*/Active_ahlr_long, /*R:*/Active_Rahr, /*recurseSubdirs:*/Active_Rahr_long, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/Active_ahrt, /*timeSorted:*/Active_ahrt_long, 
		true, 
		/*active:*/LsOption.allFiles, LsOption.humanReadable, LsOption.reverseOrder
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #humanReadable h}, {@link #reverseOrder r}.*/
	Active_ahr_long(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/Active_ahlr, /*longFormat:*/Active_ahlr_long, /*R:*/Active_Rahr, /*recurseSubdirs:*/Active_Rahr_long, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/Active_ahrt, /*timeSorted:*/Active_ahrt_long, 
		false, 
		/*active:*/LsOption.allFiles, LsOption.humanReadable, LsOption.reverseOrder
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #humanReadable h}, {@link #timeSorted t}.*/
	Active_aht(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/Active_ahlt, /*longFormat:*/Active_ahlt_long, /*R:*/Active_Raht, /*recurseSubdirs:*/Active_Raht_long, /*r:*/Active_ahrt, /*reverseOrder:*/Active_ahrt_long, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		true, 
		/*active:*/LsOption.allFiles, LsOption.humanReadable, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #humanReadable h}, {@link #timeSorted t}.*/
	Active_aht_long(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/Active_ahlt, /*longFormat:*/Active_ahlt_long, /*R:*/Active_Raht, /*recurseSubdirs:*/Active_Raht_long, /*r:*/Active_ahrt, /*reverseOrder:*/Active_ahrt_long, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		false, 
		/*active:*/LsOption.allFiles, LsOption.humanReadable, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #longFormat l}, {@link #recurseSubdirs R}.*/
	Active_Ral(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/Active_Rahl, /*humanReadable:*/Active_Rahl_long, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/Active_Ralr, /*reverseOrder:*/Active_Ralr_long, /*t:*/Active_Ralt, /*timeSorted:*/Active_Ralt_long, 
		true, 
		/*active:*/LsOption.allFiles, LsOption.longFormat, LsOption.recurseSubdirs
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #longFormat l}, {@link #recurseSubdirs R}.*/
	Active_Ral_long(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/Active_Rahl, /*humanReadable:*/Active_Rahl_long, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/Active_Ralr, /*reverseOrder:*/Active_Ralr_long, /*t:*/Active_Ralt, /*timeSorted:*/Active_Ralt_long, 
		false, 
		/*active:*/LsOption.allFiles, LsOption.longFormat, LsOption.recurseSubdirs
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #longFormat l}, {@link #reverseOrder r}.*/
	Active_alr(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/Active_ahlr, /*humanReadable:*/Active_ahlr_long, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/Active_Ralr, /*recurseSubdirs:*/Active_Ralr_long, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/Active_alrt, /*timeSorted:*/Active_alrt_long, 
		true, 
		/*active:*/LsOption.allFiles, LsOption.longFormat, LsOption.reverseOrder
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #longFormat l}, {@link #reverseOrder r}.*/
	Active_alr_long(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/Active_ahlr, /*humanReadable:*/Active_ahlr_long, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/Active_Ralr, /*recurseSubdirs:*/Active_Ralr_long, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/Active_alrt, /*timeSorted:*/Active_alrt_long, 
		false, 
		/*active:*/LsOption.allFiles, LsOption.longFormat, LsOption.reverseOrder
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #longFormat l}, {@link #timeSorted t}.*/
	Active_alt(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/Active_ahlt, /*humanReadable:*/Active_ahlt_long, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/Active_Ralt, /*recurseSubdirs:*/Active_Ralt_long, /*r:*/Active_alrt, /*reverseOrder:*/Active_alrt_long, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		true, 
		/*active:*/LsOption.allFiles, LsOption.longFormat, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #longFormat l}, {@link #timeSorted t}.*/
	Active_alt_long(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/Active_ahlt, /*humanReadable:*/Active_ahlt_long, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/Active_Ralt, /*recurseSubdirs:*/Active_Ralt_long, /*r:*/Active_alrt, /*reverseOrder:*/Active_alrt_long, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		false, 
		/*active:*/LsOption.allFiles, LsOption.longFormat, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #recurseSubdirs R}, {@link #reverseOrder r}.*/
	Active_Rar(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/Active_Rahr, /*humanReadable:*/Active_Rahr_long, /*l:*/Active_Ralr, /*longFormat:*/Active_Ralr_long, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/Active_Rart, /*timeSorted:*/Active_Rart_long, 
		true, 
		/*active:*/LsOption.allFiles, LsOption.recurseSubdirs, LsOption.reverseOrder
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #recurseSubdirs R}, {@link #reverseOrder r}.*/
	Active_Rar_long(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/Active_Rahr, /*humanReadable:*/Active_Rahr_long, /*l:*/Active_Ralr, /*longFormat:*/Active_Ralr_long, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/Active_Rart, /*timeSorted:*/Active_Rart_long, 
		false, 
		/*active:*/LsOption.allFiles, LsOption.recurseSubdirs, LsOption.reverseOrder
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #recurseSubdirs R}, {@link #timeSorted t}.*/
	Active_Rat(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/Active_Raht, /*humanReadable:*/Active_Raht_long, /*l:*/Active_Ralt, /*longFormat:*/Active_Ralt_long, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/Active_Rart, /*reverseOrder:*/Active_Rart_long, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		true, 
		/*active:*/LsOption.allFiles, LsOption.recurseSubdirs, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #recurseSubdirs R}, {@link #timeSorted t}.*/
	Active_Rat_long(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/Active_Raht, /*humanReadable:*/Active_Raht_long, /*l:*/Active_Ralt, /*longFormat:*/Active_Ralt_long, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/Active_Rart, /*reverseOrder:*/Active_Rart_long, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		false, 
		/*active:*/LsOption.allFiles, LsOption.recurseSubdirs, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #reverseOrder r}, {@link #timeSorted t}.*/
	Active_art(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/Active_ahrt, /*humanReadable:*/Active_ahrt_long, /*l:*/Active_alrt, /*longFormat:*/Active_alrt_long, /*R:*/Active_Rart, /*recurseSubdirs:*/Active_Rart_long, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		true, 
		/*active:*/LsOption.allFiles, LsOption.reverseOrder, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #reverseOrder r}, {@link #timeSorted t}.*/
	Active_art_long(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/Active_ahrt, /*humanReadable:*/Active_ahrt_long, /*l:*/Active_alrt, /*longFormat:*/Active_alrt_long, /*R:*/Active_Rart, /*recurseSubdirs:*/Active_Rart_long, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		false, 
		/*active:*/LsOption.allFiles, LsOption.reverseOrder, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #humanReadable h}, {@link #longFormat l}, {@link #recurseSubdirs R}.*/
	Active_Rhl(
		/*a:*/Active_Rahl, /*allFiles:*/Active_Rahl_long, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/Active_Rhlr, /*reverseOrder:*/Active_Rhlr_long, /*t:*/Active_Rhlt, /*timeSorted:*/Active_Rhlt_long, 
		true, 
		/*active:*/LsOption.humanReadable, LsOption.longFormat, LsOption.recurseSubdirs
	),
	/** Option set with the following active options: {@link #humanReadable h}, {@link #longFormat l}, {@link #recurseSubdirs R}.*/
	Active_Rhl_long(
		/*a:*/Active_Rahl, /*allFiles:*/Active_Rahl_long, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/Active_Rhlr, /*reverseOrder:*/Active_Rhlr_long, /*t:*/Active_Rhlt, /*timeSorted:*/Active_Rhlt_long, 
		false, 
		/*active:*/LsOption.humanReadable, LsOption.longFormat, LsOption.recurseSubdirs
	),
	/** Option set with the following active options: {@link #humanReadable h}, {@link #longFormat l}, {@link #reverseOrder r}.*/
	Active_hlr(
		/*a:*/Active_ahlr, /*allFiles:*/Active_ahlr_long, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/Active_Rhlr, /*recurseSubdirs:*/Active_Rhlr_long, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/Active_hlrt, /*timeSorted:*/Active_hlrt_long, 
		true, 
		/*active:*/LsOption.humanReadable, LsOption.longFormat, LsOption.reverseOrder
	),
	/** Option set with the following active options: {@link #humanReadable h}, {@link #longFormat l}, {@link #reverseOrder r}.*/
	Active_hlr_long(
		/*a:*/Active_ahlr, /*allFiles:*/Active_ahlr_long, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/Active_Rhlr, /*recurseSubdirs:*/Active_Rhlr_long, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/Active_hlrt, /*timeSorted:*/Active_hlrt_long, 
		false, 
		/*active:*/LsOption.humanReadable, LsOption.longFormat, LsOption.reverseOrder
	),
	/** Option set with the following active options: {@link #humanReadable h}, {@link #longFormat l}, {@link #timeSorted t}.*/
	Active_hlt(
		/*a:*/Active_ahlt, /*allFiles:*/Active_ahlt_long, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/Active_Rhlt, /*recurseSubdirs:*/Active_Rhlt_long, /*r:*/Active_hlrt, /*reverseOrder:*/Active_hlrt_long, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		true, 
		/*active:*/LsOption.humanReadable, LsOption.longFormat, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #humanReadable h}, {@link #longFormat l}, {@link #timeSorted t}.*/
	Active_hlt_long(
		/*a:*/Active_ahlt, /*allFiles:*/Active_ahlt_long, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/Active_Rhlt, /*recurseSubdirs:*/Active_Rhlt_long, /*r:*/Active_hlrt, /*reverseOrder:*/Active_hlrt_long, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		false, 
		/*active:*/LsOption.humanReadable, LsOption.longFormat, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #humanReadable h}, {@link #recurseSubdirs R}, {@link #reverseOrder r}.*/
	Active_Rhr(
		/*a:*/Active_Rahr, /*allFiles:*/Active_Rahr_long, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/Active_Rhlr, /*longFormat:*/Active_Rhlr_long, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/Active_Rhrt, /*timeSorted:*/Active_Rhrt_long, 
		true, 
		/*active:*/LsOption.humanReadable, LsOption.recurseSubdirs, LsOption.reverseOrder
	),
	/** Option set with the following active options: {@link #humanReadable h}, {@link #recurseSubdirs R}, {@link #reverseOrder r}.*/
	Active_Rhr_long(
		/*a:*/Active_Rahr, /*allFiles:*/Active_Rahr_long, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/Active_Rhlr, /*longFormat:*/Active_Rhlr_long, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/Active_Rhrt, /*timeSorted:*/Active_Rhrt_long, 
		false, 
		/*active:*/LsOption.humanReadable, LsOption.recurseSubdirs, LsOption.reverseOrder
	),
	/** Option set with the following active options: {@link #humanReadable h}, {@link #recurseSubdirs R}, {@link #timeSorted t}.*/
	Active_Rht(
		/*a:*/Active_Raht, /*allFiles:*/Active_Raht_long, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/Active_Rhlt, /*longFormat:*/Active_Rhlt_long, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/Active_Rhrt, /*reverseOrder:*/Active_Rhrt_long, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		true, 
		/*active:*/LsOption.humanReadable, LsOption.recurseSubdirs, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #humanReadable h}, {@link #recurseSubdirs R}, {@link #timeSorted t}.*/
	Active_Rht_long(
		/*a:*/Active_Raht, /*allFiles:*/Active_Raht_long, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/Active_Rhlt, /*longFormat:*/Active_Rhlt_long, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/Active_Rhrt, /*reverseOrder:*/Active_Rhrt_long, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		false, 
		/*active:*/LsOption.humanReadable, LsOption.recurseSubdirs, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #humanReadable h}, {@link #reverseOrder r}, {@link #timeSorted t}.*/
	Active_hrt(
		/*a:*/Active_ahrt, /*allFiles:*/Active_ahrt_long, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/Active_hlrt, /*longFormat:*/Active_hlrt_long, /*R:*/Active_Rhrt, /*recurseSubdirs:*/Active_Rhrt_long, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		true, 
		/*active:*/LsOption.humanReadable, LsOption.reverseOrder, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #humanReadable h}, {@link #reverseOrder r}, {@link #timeSorted t}.*/
	Active_hrt_long(
		/*a:*/Active_ahrt, /*allFiles:*/Active_ahrt_long, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/Active_hlrt, /*longFormat:*/Active_hlrt_long, /*R:*/Active_Rhrt, /*recurseSubdirs:*/Active_Rhrt_long, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		false, 
		/*active:*/LsOption.humanReadable, LsOption.reverseOrder, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #longFormat l}, {@link #recurseSubdirs R}, {@link #reverseOrder r}.*/
	Active_Rlr(
		/*a:*/Active_Ralr, /*allFiles:*/Active_Ralr_long, /*h:*/Active_Rhlr, /*humanReadable:*/Active_Rhlr_long, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/Active_Rlrt, /*timeSorted:*/Active_Rlrt_long, 
		true, 
		/*active:*/LsOption.longFormat, LsOption.recurseSubdirs, LsOption.reverseOrder
	),
	/** Option set with the following active options: {@link #longFormat l}, {@link #recurseSubdirs R}, {@link #reverseOrder r}.*/
	Active_Rlr_long(
		/*a:*/Active_Ralr, /*allFiles:*/Active_Ralr_long, /*h:*/Active_Rhlr, /*humanReadable:*/Active_Rhlr_long, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/Active_Rlrt, /*timeSorted:*/Active_Rlrt_long, 
		false, 
		/*active:*/LsOption.longFormat, LsOption.recurseSubdirs, LsOption.reverseOrder
	),
	/** Option set with the following active options: {@link #longFormat l}, {@link #recurseSubdirs R}, {@link #timeSorted t}.*/
	Active_Rlt(
		/*a:*/Active_Ralt, /*allFiles:*/Active_Ralt_long, /*h:*/Active_Rhlt, /*humanReadable:*/Active_Rhlt_long, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/Active_Rlrt, /*reverseOrder:*/Active_Rlrt_long, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		true, 
		/*active:*/LsOption.longFormat, LsOption.recurseSubdirs, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #longFormat l}, {@link #recurseSubdirs R}, {@link #timeSorted t}.*/
	Active_Rlt_long(
		/*a:*/Active_Ralt, /*allFiles:*/Active_Ralt_long, /*h:*/Active_Rhlt, /*humanReadable:*/Active_Rhlt_long, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/Active_Rlrt, /*reverseOrder:*/Active_Rlrt_long, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		false, 
		/*active:*/LsOption.longFormat, LsOption.recurseSubdirs, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #longFormat l}, {@link #reverseOrder r}, {@link #timeSorted t}.*/
	Active_lrt(
		/*a:*/Active_alrt, /*allFiles:*/Active_alrt_long, /*h:*/Active_hlrt, /*humanReadable:*/Active_hlrt_long, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/Active_Rlrt, /*recurseSubdirs:*/Active_Rlrt_long, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		true, 
		/*active:*/LsOption.longFormat, LsOption.reverseOrder, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #longFormat l}, {@link #reverseOrder r}, {@link #timeSorted t}.*/
	Active_lrt_long(
		/*a:*/Active_alrt, /*allFiles:*/Active_alrt_long, /*h:*/Active_hlrt, /*humanReadable:*/Active_hlrt_long, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/Active_Rlrt, /*recurseSubdirs:*/Active_Rlrt_long, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		false, 
		/*active:*/LsOption.longFormat, LsOption.reverseOrder, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #recurseSubdirs R}, {@link #reverseOrder r}, {@link #timeSorted t}.*/
	Active_Rrt(
		/*a:*/Active_Rart, /*allFiles:*/Active_Rart_long, /*h:*/Active_Rhrt, /*humanReadable:*/Active_Rhrt_long, /*l:*/Active_Rlrt, /*longFormat:*/Active_Rlrt_long, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		true, 
		/*active:*/LsOption.recurseSubdirs, LsOption.reverseOrder, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #recurseSubdirs R}, {@link #reverseOrder r}, {@link #timeSorted t}.*/
	Active_Rrt_long(
		/*a:*/Active_Rart, /*allFiles:*/Active_Rart_long, /*h:*/Active_Rhrt, /*humanReadable:*/Active_Rhrt_long, /*l:*/Active_Rlrt, /*longFormat:*/Active_Rlrt_long, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		false, 
		/*active:*/LsOption.recurseSubdirs, LsOption.reverseOrder, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #humanReadable h}.*/
	Active_ah(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/Active_ahl, /*longFormat:*/Active_ahl_long, /*R:*/Active_Rah, /*recurseSubdirs:*/Active_Rah_long, /*r:*/Active_ahr, /*reverseOrder:*/Active_ahr_long, /*t:*/Active_aht, /*timeSorted:*/Active_aht_long, 
		true, 
		/*active:*/LsOption.allFiles, LsOption.humanReadable
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #humanReadable h}.*/
	Active_ah_long(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/Active_ahl, /*longFormat:*/Active_ahl_long, /*R:*/Active_Rah, /*recurseSubdirs:*/Active_Rah_long, /*r:*/Active_ahr, /*reverseOrder:*/Active_ahr_long, /*t:*/Active_aht, /*timeSorted:*/Active_aht_long, 
		false, 
		/*active:*/LsOption.allFiles, LsOption.humanReadable
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #longFormat l}.*/
	Active_al(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/Active_ahl, /*humanReadable:*/Active_ahl_long, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/Active_Ral, /*recurseSubdirs:*/Active_Ral_long, /*r:*/Active_alr, /*reverseOrder:*/Active_alr_long, /*t:*/Active_alt, /*timeSorted:*/Active_alt_long, 
		true, 
		/*active:*/LsOption.allFiles, LsOption.longFormat
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #longFormat l}.*/
	Active_al_long(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/Active_ahl, /*humanReadable:*/Active_ahl_long, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/Active_Ral, /*recurseSubdirs:*/Active_Ral_long, /*r:*/Active_alr, /*reverseOrder:*/Active_alr_long, /*t:*/Active_alt, /*timeSorted:*/Active_alt_long, 
		false, 
		/*active:*/LsOption.allFiles, LsOption.longFormat
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #recurseSubdirs R}.*/
	Active_Ra(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/Active_Rah, /*humanReadable:*/Active_Rah_long, /*l:*/Active_Ral, /*longFormat:*/Active_Ral_long, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/Active_Rar, /*reverseOrder:*/Active_Rar_long, /*t:*/Active_Rat, /*timeSorted:*/Active_Rat_long, 
		true, 
		/*active:*/LsOption.allFiles, LsOption.recurseSubdirs
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #recurseSubdirs R}.*/
	Active_Ra_long(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/Active_Rah, /*humanReadable:*/Active_Rah_long, /*l:*/Active_Ral, /*longFormat:*/Active_Ral_long, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/Active_Rar, /*reverseOrder:*/Active_Rar_long, /*t:*/Active_Rat, /*timeSorted:*/Active_Rat_long, 
		false, 
		/*active:*/LsOption.allFiles, LsOption.recurseSubdirs
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #reverseOrder r}.*/
	Active_ar(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/Active_ahr, /*humanReadable:*/Active_ahr_long, /*l:*/Active_alr, /*longFormat:*/Active_alr_long, /*R:*/Active_Rar, /*recurseSubdirs:*/Active_Rar_long, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/Active_art, /*timeSorted:*/Active_art_long, 
		true, 
		/*active:*/LsOption.allFiles, LsOption.reverseOrder
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #reverseOrder r}.*/
	Active_ar_long(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/Active_ahr, /*humanReadable:*/Active_ahr_long, /*l:*/Active_alr, /*longFormat:*/Active_alr_long, /*R:*/Active_Rar, /*recurseSubdirs:*/Active_Rar_long, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/Active_art, /*timeSorted:*/Active_art_long, 
		false, 
		/*active:*/LsOption.allFiles, LsOption.reverseOrder
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #timeSorted t}.*/
	Active_at(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/Active_aht, /*humanReadable:*/Active_aht_long, /*l:*/Active_alt, /*longFormat:*/Active_alt_long, /*R:*/Active_Rat, /*recurseSubdirs:*/Active_Rat_long, /*r:*/Active_art, /*reverseOrder:*/Active_art_long, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		true, 
		/*active:*/LsOption.allFiles, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #allFiles a}, {@link #timeSorted t}.*/
	Active_at_long(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/Active_aht, /*humanReadable:*/Active_aht_long, /*l:*/Active_alt, /*longFormat:*/Active_alt_long, /*R:*/Active_Rat, /*recurseSubdirs:*/Active_Rat_long, /*r:*/Active_art, /*reverseOrder:*/Active_art_long, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		false, 
		/*active:*/LsOption.allFiles, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #humanReadable h}, {@link #longFormat l}.*/
	Active_hl(
		/*a:*/Active_ahl, /*allFiles:*/Active_ahl_long, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/Active_Rhl, /*recurseSubdirs:*/Active_Rhl_long, /*r:*/Active_hlr, /*reverseOrder:*/Active_hlr_long, /*t:*/Active_hlt, /*timeSorted:*/Active_hlt_long, 
		true, 
		/*active:*/LsOption.humanReadable, LsOption.longFormat
	),
	/** Option set with the following active options: {@link #humanReadable h}, {@link #longFormat l}.*/
	Active_hl_long(
		/*a:*/Active_ahl, /*allFiles:*/Active_ahl_long, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/Active_Rhl, /*recurseSubdirs:*/Active_Rhl_long, /*r:*/Active_hlr, /*reverseOrder:*/Active_hlr_long, /*t:*/Active_hlt, /*timeSorted:*/Active_hlt_long, 
		false, 
		/*active:*/LsOption.humanReadable, LsOption.longFormat
	),
	/** Option set with the following active options: {@link #humanReadable h}, {@link #recurseSubdirs R}.*/
	Active_Rh(
		/*a:*/Active_Rah, /*allFiles:*/Active_Rah_long, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/Active_Rhl, /*longFormat:*/Active_Rhl_long, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/Active_Rhr, /*reverseOrder:*/Active_Rhr_long, /*t:*/Active_Rht, /*timeSorted:*/Active_Rht_long, 
		true, 
		/*active:*/LsOption.humanReadable, LsOption.recurseSubdirs
	),
	/** Option set with the following active options: {@link #humanReadable h}, {@link #recurseSubdirs R}.*/
	Active_Rh_long(
		/*a:*/Active_Rah, /*allFiles:*/Active_Rah_long, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/Active_Rhl, /*longFormat:*/Active_Rhl_long, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/Active_Rhr, /*reverseOrder:*/Active_Rhr_long, /*t:*/Active_Rht, /*timeSorted:*/Active_Rht_long, 
		false, 
		/*active:*/LsOption.humanReadable, LsOption.recurseSubdirs
	),
	/** Option set with the following active options: {@link #humanReadable h}, {@link #reverseOrder r}.*/
	Active_hr(
		/*a:*/Active_ahr, /*allFiles:*/Active_ahr_long, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/Active_hlr, /*longFormat:*/Active_hlr_long, /*R:*/Active_Rhr, /*recurseSubdirs:*/Active_Rhr_long, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/Active_hrt, /*timeSorted:*/Active_hrt_long, 
		true, 
		/*active:*/LsOption.humanReadable, LsOption.reverseOrder
	),
	/** Option set with the following active options: {@link #humanReadable h}, {@link #reverseOrder r}.*/
	Active_hr_long(
		/*a:*/Active_ahr, /*allFiles:*/Active_ahr_long, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/Active_hlr, /*longFormat:*/Active_hlr_long, /*R:*/Active_Rhr, /*recurseSubdirs:*/Active_Rhr_long, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/Active_hrt, /*timeSorted:*/Active_hrt_long, 
		false, 
		/*active:*/LsOption.humanReadable, LsOption.reverseOrder
	),
	/** Option set with the following active options: {@link #humanReadable h}, {@link #timeSorted t}.*/
	Active_ht(
		/*a:*/Active_aht, /*allFiles:*/Active_aht_long, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/Active_hlt, /*longFormat:*/Active_hlt_long, /*R:*/Active_Rht, /*recurseSubdirs:*/Active_Rht_long, /*r:*/Active_hrt, /*reverseOrder:*/Active_hrt_long, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		true, 
		/*active:*/LsOption.humanReadable, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #humanReadable h}, {@link #timeSorted t}.*/
	Active_ht_long(
		/*a:*/Active_aht, /*allFiles:*/Active_aht_long, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/Active_hlt, /*longFormat:*/Active_hlt_long, /*R:*/Active_Rht, /*recurseSubdirs:*/Active_Rht_long, /*r:*/Active_hrt, /*reverseOrder:*/Active_hrt_long, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		false, 
		/*active:*/LsOption.humanReadable, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #longFormat l}, {@link #recurseSubdirs R}.*/
	Active_Rl(
		/*a:*/Active_Ral, /*allFiles:*/Active_Ral_long, /*h:*/Active_Rhl, /*humanReadable:*/Active_Rhl_long, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/Active_Rlr, /*reverseOrder:*/Active_Rlr_long, /*t:*/Active_Rlt, /*timeSorted:*/Active_Rlt_long, 
		true, 
		/*active:*/LsOption.longFormat, LsOption.recurseSubdirs
	),
	/** Option set with the following active options: {@link #longFormat l}, {@link #recurseSubdirs R}.*/
	Active_Rl_long(
		/*a:*/Active_Ral, /*allFiles:*/Active_Ral_long, /*h:*/Active_Rhl, /*humanReadable:*/Active_Rhl_long, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/Active_Rlr, /*reverseOrder:*/Active_Rlr_long, /*t:*/Active_Rlt, /*timeSorted:*/Active_Rlt_long, 
		false, 
		/*active:*/LsOption.longFormat, LsOption.recurseSubdirs
	),
	/** Option set with the following active options: {@link #longFormat l}, {@link #reverseOrder r}.*/
	Active_lr(
		/*a:*/Active_alr, /*allFiles:*/Active_alr_long, /*h:*/Active_hlr, /*humanReadable:*/Active_hlr_long, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/Active_Rlr, /*recurseSubdirs:*/Active_Rlr_long, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/Active_lrt, /*timeSorted:*/Active_lrt_long, 
		true, 
		/*active:*/LsOption.longFormat, LsOption.reverseOrder
	),
	/** Option set with the following active options: {@link #longFormat l}, {@link #reverseOrder r}.*/
	Active_lr_long(
		/*a:*/Active_alr, /*allFiles:*/Active_alr_long, /*h:*/Active_hlr, /*humanReadable:*/Active_hlr_long, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/Active_Rlr, /*recurseSubdirs:*/Active_Rlr_long, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/Active_lrt, /*timeSorted:*/Active_lrt_long, 
		false, 
		/*active:*/LsOption.longFormat, LsOption.reverseOrder
	),
	/** Option set with the following active options: {@link #longFormat l}, {@link #timeSorted t}.*/
	Active_lt(
		/*a:*/Active_alt, /*allFiles:*/Active_alt_long, /*h:*/Active_hlt, /*humanReadable:*/Active_hlt_long, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/Active_Rlt, /*recurseSubdirs:*/Active_Rlt_long, /*r:*/Active_lrt, /*reverseOrder:*/Active_lrt_long, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		true, 
		/*active:*/LsOption.longFormat, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #longFormat l}, {@link #timeSorted t}.*/
	Active_lt_long(
		/*a:*/Active_alt, /*allFiles:*/Active_alt_long, /*h:*/Active_hlt, /*humanReadable:*/Active_hlt_long, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/Active_Rlt, /*recurseSubdirs:*/Active_Rlt_long, /*r:*/Active_lrt, /*reverseOrder:*/Active_lrt_long, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		false, 
		/*active:*/LsOption.longFormat, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #recurseSubdirs R}, {@link #reverseOrder r}.*/
	Active_Rr(
		/*a:*/Active_Rar, /*allFiles:*/Active_Rar_long, /*h:*/Active_Rhr, /*humanReadable:*/Active_Rhr_long, /*l:*/Active_Rlr, /*longFormat:*/Active_Rlr_long, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/Active_Rrt, /*timeSorted:*/Active_Rrt_long, 
		true, 
		/*active:*/LsOption.recurseSubdirs, LsOption.reverseOrder
	),
	/** Option set with the following active options: {@link #recurseSubdirs R}, {@link #reverseOrder r}.*/
	Active_Rr_long(
		/*a:*/Active_Rar, /*allFiles:*/Active_Rar_long, /*h:*/Active_Rhr, /*humanReadable:*/Active_Rhr_long, /*l:*/Active_Rlr, /*longFormat:*/Active_Rlr_long, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/Active_Rrt, /*timeSorted:*/Active_Rrt_long, 
		false, 
		/*active:*/LsOption.recurseSubdirs, LsOption.reverseOrder
	),
	/** Option set with the following active options: {@link #recurseSubdirs R}, {@link #timeSorted t}.*/
	Active_Rt(
		/*a:*/Active_Rat, /*allFiles:*/Active_Rat_long, /*h:*/Active_Rht, /*humanReadable:*/Active_Rht_long, /*l:*/Active_Rlt, /*longFormat:*/Active_Rlt_long, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/Active_Rrt, /*reverseOrder:*/Active_Rrt_long, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		true, 
		/*active:*/LsOption.recurseSubdirs, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #recurseSubdirs R}, {@link #timeSorted t}.*/
	Active_Rt_long(
		/*a:*/Active_Rat, /*allFiles:*/Active_Rat_long, /*h:*/Active_Rht, /*humanReadable:*/Active_Rht_long, /*l:*/Active_Rlt, /*longFormat:*/Active_Rlt_long, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/Active_Rrt, /*reverseOrder:*/Active_Rrt_long, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		false, 
		/*active:*/LsOption.recurseSubdirs, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #reverseOrder r}, {@link #timeSorted t}.*/
	Active_rt(
		/*a:*/Active_art, /*allFiles:*/Active_art_long, /*h:*/Active_hrt, /*humanReadable:*/Active_hrt_long, /*l:*/Active_lrt, /*longFormat:*/Active_lrt_long, /*R:*/Active_Rrt, /*recurseSubdirs:*/Active_Rrt_long, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		true, 
		/*active:*/LsOption.reverseOrder, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #reverseOrder r}, {@link #timeSorted t}.*/
	Active_rt_long(
		/*a:*/Active_art, /*allFiles:*/Active_art_long, /*h:*/Active_hrt, /*humanReadable:*/Active_hrt_long, /*l:*/Active_lrt, /*longFormat:*/Active_lrt_long, /*R:*/Active_Rrt, /*recurseSubdirs:*/Active_Rrt_long, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		false, 
		/*active:*/LsOption.reverseOrder, LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #allFiles a}.*/
	Active_a(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/Active_ah, /*humanReadable:*/Active_ah_long, /*l:*/Active_al, /*longFormat:*/Active_al_long, /*R:*/Active_Ra, /*recurseSubdirs:*/Active_Ra_long, /*r:*/Active_ar, /*reverseOrder:*/Active_ar_long, /*t:*/Active_at, /*timeSorted:*/Active_at_long, 
		true, 
		/*active:*/LsOption.allFiles
	),
	/** Option set with the following active options: {@link #allFiles a}.*/
	Active_a_long(
		/*a:*/null /*already set*/, /*allFiles:*/null /*already set*/, /*h:*/Active_ah, /*humanReadable:*/Active_ah_long, /*l:*/Active_al, /*longFormat:*/Active_al_long, /*R:*/Active_Ra, /*recurseSubdirs:*/Active_Ra_long, /*r:*/Active_ar, /*reverseOrder:*/Active_ar_long, /*t:*/Active_at, /*timeSorted:*/Active_at_long, 
		false, 
		/*active:*/LsOption.allFiles
	),
	/** Option set with the following active options: {@link #humanReadable h}.*/
	Active_h(
		/*a:*/Active_ah, /*allFiles:*/Active_ah_long, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/Active_hl, /*longFormat:*/Active_hl_long, /*R:*/Active_Rh, /*recurseSubdirs:*/Active_Rh_long, /*r:*/Active_hr, /*reverseOrder:*/Active_hr_long, /*t:*/Active_ht, /*timeSorted:*/Active_ht_long, 
		true, 
		/*active:*/LsOption.humanReadable
	),
	/** Option set with the following active options: {@link #humanReadable h}.*/
	Active_h_long(
		/*a:*/Active_ah, /*allFiles:*/Active_ah_long, /*h:*/null /*already set*/, /*humanReadable:*/null /*already set*/, /*l:*/Active_hl, /*longFormat:*/Active_hl_long, /*R:*/Active_Rh, /*recurseSubdirs:*/Active_Rh_long, /*r:*/Active_hr, /*reverseOrder:*/Active_hr_long, /*t:*/Active_ht, /*timeSorted:*/Active_ht_long, 
		false, 
		/*active:*/LsOption.humanReadable
	),
	/** Option set with the following active options: {@link #longFormat l}.*/
	Active_l(
		/*a:*/Active_al, /*allFiles:*/Active_al_long, /*h:*/Active_hl, /*humanReadable:*/Active_hl_long, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/Active_Rl, /*recurseSubdirs:*/Active_Rl_long, /*r:*/Active_lr, /*reverseOrder:*/Active_lr_long, /*t:*/Active_lt, /*timeSorted:*/Active_lt_long, 
		true, 
		/*active:*/LsOption.longFormat
	),
	/** Option set with the following active options: {@link #longFormat l}.*/
	Active_l_long(
		/*a:*/Active_al, /*allFiles:*/Active_al_long, /*h:*/Active_hl, /*humanReadable:*/Active_hl_long, /*l:*/null /*already set*/, /*longFormat:*/null /*already set*/, /*R:*/Active_Rl, /*recurseSubdirs:*/Active_Rl_long, /*r:*/Active_lr, /*reverseOrder:*/Active_lr_long, /*t:*/Active_lt, /*timeSorted:*/Active_lt_long, 
		false, 
		/*active:*/LsOption.longFormat
	),
	/** Option set with the following active options: {@link #recurseSubdirs R}.*/
	Active_R(
		/*a:*/Active_Ra, /*allFiles:*/Active_Ra_long, /*h:*/Active_Rh, /*humanReadable:*/Active_Rh_long, /*l:*/Active_Rl, /*longFormat:*/Active_Rl_long, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/Active_Rr, /*reverseOrder:*/Active_Rr_long, /*t:*/Active_Rt, /*timeSorted:*/Active_Rt_long, 
		true, 
		/*active:*/LsOption.recurseSubdirs
	),
	/** Option set with the following active options: {@link #recurseSubdirs R}.*/
	Active_R_long(
		/*a:*/Active_Ra, /*allFiles:*/Active_Ra_long, /*h:*/Active_Rh, /*humanReadable:*/Active_Rh_long, /*l:*/Active_Rl, /*longFormat:*/Active_Rl_long, /*R:*/null /*already set*/, /*recurseSubdirs:*/null /*already set*/, /*r:*/Active_Rr, /*reverseOrder:*/Active_Rr_long, /*t:*/Active_Rt, /*timeSorted:*/Active_Rt_long, 
		false, 
		/*active:*/LsOption.recurseSubdirs
	),
	/** Option set with the following active options: {@link #reverseOrder r}.*/
	Active_r(
		/*a:*/Active_ar, /*allFiles:*/Active_ar_long, /*h:*/Active_hr, /*humanReadable:*/Active_hr_long, /*l:*/Active_lr, /*longFormat:*/Active_lr_long, /*R:*/Active_Rr, /*recurseSubdirs:*/Active_Rr_long, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/Active_rt, /*timeSorted:*/Active_rt_long, 
		true, 
		/*active:*/LsOption.reverseOrder
	),
	/** Option set with the following active options: {@link #reverseOrder r}.*/
	Active_r_long(
		/*a:*/Active_ar, /*allFiles:*/Active_ar_long, /*h:*/Active_hr, /*humanReadable:*/Active_hr_long, /*l:*/Active_lr, /*longFormat:*/Active_lr_long, /*R:*/Active_Rr, /*recurseSubdirs:*/Active_Rr_long, /*r:*/null /*already set*/, /*reverseOrder:*/null /*already set*/, /*t:*/Active_rt, /*timeSorted:*/Active_rt_long, 
		false, 
		/*active:*/LsOption.reverseOrder
	),
	/** Option set with the following active options: {@link #timeSorted t}.*/
	Active_t(
		/*a:*/Active_at, /*allFiles:*/Active_at_long, /*h:*/Active_ht, /*humanReadable:*/Active_ht_long, /*l:*/Active_lt, /*longFormat:*/Active_lt_long, /*R:*/Active_Rt, /*recurseSubdirs:*/Active_Rt_long, /*r:*/Active_rt, /*reverseOrder:*/Active_rt_long, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		true, 
		/*active:*/LsOption.timeSorted
	),
	/** Option set with the following active options: {@link #timeSorted t}.*/
	Active_t_long(
		/*a:*/Active_at, /*allFiles:*/Active_at_long, /*h:*/Active_ht, /*humanReadable:*/Active_ht_long, /*l:*/Active_lt, /*longFormat:*/Active_lt_long, /*R:*/Active_Rt, /*recurseSubdirs:*/Active_Rt_long, /*r:*/Active_rt, /*reverseOrder:*/Active_rt_long, /*t:*/null /*already set*/, /*timeSorted:*/null /*already set*/, 
		false, 
		/*active:*/LsOption.timeSorted
	);
	private LsOptionSet_Rahlrt(
		LsOptionSet_Rahlrt a, LsOptionSet_Rahlrt allFiles, LsOptionSet_Rahlrt h, LsOptionSet_Rahlrt humanReadable, LsOptionSet_Rahlrt l, LsOptionSet_Rahlrt longFormat, LsOptionSet_Rahlrt R, LsOptionSet_Rahlrt recurseSubdirs, LsOptionSet_Rahlrt r, LsOptionSet_Rahlrt reverseOrder, LsOptionSet_Rahlrt t, LsOptionSet_Rahlrt timeSorted, 
		boolean useAcronym,
		LsOption... activeOptions
	) {
		this.a = a == null ? this : a;
		this.allFiles = allFiles == null ? this : allFiles;
		this.h = h == null ? this : h;
		this.humanReadable = humanReadable == null ? this : humanReadable;
		this.l = l == null ? this : l;
		this.longFormat = longFormat == null ? this : longFormat;
		this.R = R == null ? this : R;
		this.recurseSubdirs = recurseSubdirs == null ? this : recurseSubdirs;
		this.r = r == null ? this : r;
		this.reverseOrder = reverseOrder == null ? this : reverseOrder;
		this.t = t == null ? this : t;
		this.timeSorted = timeSorted == null ? this : timeSorted;
		this.useAcronym = useAcronym;
		this.options = activeOptions.length == 0 ? EnumSet.noneOf(LsOption.class) : EnumSet.copyOf(Arrays.asList(activeOptions));
	}
	private final boolean useAcronym;
	/**
	 * Option {@code "-a"}: Lists all files in the given directory, including hidden files
			(those whose names start with \".\" in Unix). By default, these 
			files are excluded from the list.
	 * <p>
	 * The option {@code "-a"} is equivalent to the {@code "--}{@link #allFiles allFiles}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "-a"}. If the option {@code "-a"}
	 * is already set, the field {@code a} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final LsOptionSet_Rahlrt a;
	/**
	 * Option {@code "--allFiles"}: Lists all files in the given directory, including hidden files
			(those whose names start with \".\" in Unix). By default, these 
			files are excluded from the list.
	 * <p>
	 * The option {@code "--allFiles"} is equivalent to the {@code "-}{@link #a a}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "--allFiles"}. If the option {@code "--allFiles"}
	 * is already set, the field {@code allFiles} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final LsOptionSet_Rahlrt allFiles;
	/**
	 * Option {@code "-h"}: Print sizes in human readable format. (e.g., 1K, 234M, 2G, etc.)
	 * <p>
	 * The option {@code "-h"} is equivalent to the {@code "--}{@link #humanReadable humanReadable}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "-h"}. If the option {@code "-h"}
	 * is already set, the field {@code h} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final LsOptionSet_Rahlrt h;
	/**
	 * Option {@code "--humanReadable"}: Print sizes in human readable format. (e.g., 1K, 234M, 2G, etc.)
	 * <p>
	 * The option {@code "--humanReadable"} is equivalent to the {@code "-}{@link #h h}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "--humanReadable"}. If the option {@code "--humanReadable"}
	 * is already set, the field {@code humanReadable} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final LsOptionSet_Rahlrt humanReadable;
	/**
	 * Option {@code "-l"}: Long format, displaying file types, permissions, number of hard 
			links, owner, group, size, date, and filename.
	 * <p>
	 * The option {@code "-l"} is equivalent to the {@code "--}{@link #longFormat longFormat}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "-l"}. If the option {@code "-l"}
	 * is already set, the field {@code l} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final LsOptionSet_Rahlrt l;
	/**
	 * Option {@code "--longFormat"}: Long format, displaying file types, permissions, number of hard 
			links, owner, group, size, date, and filename.
	 * <p>
	 * The option {@code "--longFormat"} is equivalent to the {@code "-}{@link #l l}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "--longFormat"}. If the option {@code "--longFormat"}
	 * is already set, the field {@code longFormat} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final LsOptionSet_Rahlrt longFormat;
	/**
	 * Option {@code "-R"}: Recursively lists subdirectories encountered.
	 * <p>
	 * The option {@code "-R"} is equivalent to the {@code "--}{@link #recurseSubdirs recurseSubdirs}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "-R"}. If the option {@code "-R"}
	 * is already set, the field {@code R} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final LsOptionSet_Rahlrt R;
	/**
	 * Option {@code "--recurseSubdirs"}: Recursively lists subdirectories encountered.
	 * <p>
	 * The option {@code "--recurseSubdirs"} is equivalent to the {@code "-}{@link #R R}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "--recurseSubdirs"}. If the option {@code "--recurseSubdirs"}
	 * is already set, the field {@code recurseSubdirs} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final LsOptionSet_Rahlrt recurseSubdirs;
	/**
	 * Option {@code "-r"}: Reverses the order of the sort to get reverse collating sequence or 
			oldest first.
	 * <p>
	 * The option {@code "-r"} is equivalent to the {@code "--}{@link #reverseOrder reverseOrder}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "-r"}. If the option {@code "-r"}
	 * is already set, the field {@code r} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final LsOptionSet_Rahlrt r;
	/**
	 * Option {@code "--reverseOrder"}: Reverses the order of the sort to get reverse collating sequence or 
			oldest first.
	 * <p>
	 * The option {@code "--reverseOrder"} is equivalent to the {@code "-}{@link #r r}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "--reverseOrder"}. If the option {@code "--reverseOrder"}
	 * is already set, the field {@code reverseOrder} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final LsOptionSet_Rahlrt reverseOrder;
	/**
	 * Option {@code "-t"}: Sorts with the primary key being time modified (most recently 
			modified first) and the secondary key being filename in the 
			collating sequence.
	 * <p>
	 * The option {@code "-t"} is equivalent to the {@code "--}{@link #timeSorted timeSorted}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "-t"}. If the option {@code "-t"}
	 * is already set, the field {@code t} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final LsOptionSet_Rahlrt t;
	/**
	 * Option {@code "--timeSorted"}: Sorts with the primary key being time modified (most recently 
			modified first) and the secondary key being filename in the 
			collating sequence.
	 * <p>
	 * The option {@code "--timeSorted"} is equivalent to the {@code "-}{@link #t t}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "--timeSorted"}. If the option {@code "--timeSorted"}
	 * is already set, the field {@code timeSorted} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final LsOptionSet_Rahlrt timeSorted;
	private final EnumSet<LsOption> options;
	
	//inherit javadoc
	@Override
	public Class<LsOption> optionType() {
		return LsOption.class;
	}
	//inherit javadoc
	@Override
	public boolean isSet(LsOption option) {
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
	public EnumSet<LsOption> asSet() {
		return EnumSet.copyOf(options);
	}
	/**
	 * Returns an immutable iterator with the active options of this option set.
	 * 
	 * @return an immutable iterator for over the active options
	 */
	@Override
	public Iterator<LsOption> iterator() {
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
	 *    LsOptionSet_Rahlrt.allFiles.h;
	 * </pre>
	 * uses acronyms, that is, this method always returns true for the above 
	 * set. 
	 * <p>
	 * On the other hand, long option names are used and this method always 
	 * returns false for the set
	 * <pre>
	 *    LsOptionSet_Rahlrt.a.humanReadable;
	 * </pre>
	 * <p>
	 * Note that a repeated option is <i>not</i> treated as the last set option.
	 * For instance, the first and last option of the following set are 
	 * equivalent and acronyms are used:
	 * <pre>
	 *    LsOptionSet_Rahlrt.a.h.allFiles;
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
	public boolean useAcronymFor(LsOption option) {
		return useAcronym;
	}
}
