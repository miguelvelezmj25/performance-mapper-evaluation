package org.unix4j.unix.sed;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import org.unix4j.option.Option;

import org.unix4j.unix.Sed;

/**
 * Option sets for the {@link Sed sed} command with 
 * the following options: {@link #d d}, {@link #g g}, {@link #I I}, {@link #l l}, {@link #p p}, {@link #n n}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Sed#Options} should be used instead to specify command 
 * options. See also {@link org.unix4j.unix.sed.SedOptions} for more information.
 */
public enum SedOptionSet_Idglnp implements SedOptions {
	/** Option set with the following active options: {@link #delete d}, {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}.*/
	Active_Idglnp(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		true, 
		/*active:*/SedOption.delete, SedOption.global, SedOption.ignoreCase, SedOption.lineNumber, SedOption.print, SedOption.quiet
	),
	/** Option set with the following active options: {@link #delete d}, {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}.*/
	Active_Idglnp_long(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		false, 
		/*active:*/SedOption.delete, SedOption.global, SedOption.ignoreCase, SedOption.lineNumber, SedOption.print, SedOption.quiet
	),
	/** Option set with the following active options: {@link #delete d}, {@link #global g}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}.*/
	Active_dglnp(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Idglnp, /*ignoreCase:*/Active_Idglnp_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		true, 
		/*active:*/SedOption.delete, SedOption.global, SedOption.lineNumber, SedOption.print, SedOption.quiet
	),
	/** Option set with the following active options: {@link #delete d}, {@link #global g}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}.*/
	Active_dglnp_long(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Idglnp, /*ignoreCase:*/Active_Idglnp_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		false, 
		/*active:*/SedOption.delete, SedOption.global, SedOption.lineNumber, SedOption.print, SedOption.quiet
	),
	/** Option set with the following active options: {@link #delete d}, {@link #global g}, {@link #ignoreCase I}, {@link #print p}, {@link #quiet n}.*/
	Active_Idgnp(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Idglnp, /*lineNumber:*/Active_Idglnp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		true, 
		/*active:*/SedOption.delete, SedOption.global, SedOption.ignoreCase, SedOption.print, SedOption.quiet
	),
	/** Option set with the following active options: {@link #delete d}, {@link #global g}, {@link #ignoreCase I}, {@link #print p}, {@link #quiet n}.*/
	Active_Idgnp_long(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Idglnp, /*lineNumber:*/Active_Idglnp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		false, 
		/*active:*/SedOption.delete, SedOption.global, SedOption.ignoreCase, SedOption.print, SedOption.quiet
	),
	/** Option set with the following active options: {@link #delete d}, {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #quiet n}.*/
	Active_Idgln(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Idglnp, /*print:*/Active_Idglnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		true, 
		/*active:*/SedOption.delete, SedOption.global, SedOption.ignoreCase, SedOption.lineNumber, SedOption.quiet
	),
	/** Option set with the following active options: {@link #delete d}, {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #quiet n}.*/
	Active_Idgln_long(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Idglnp, /*print:*/Active_Idglnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		false, 
		/*active:*/SedOption.delete, SedOption.global, SedOption.ignoreCase, SedOption.lineNumber, SedOption.quiet
	),
	/** Option set with the following active options: {@link #delete d}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}.*/
	Active_Idlnp(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/Active_Idglnp, /*global:*/Active_Idglnp_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		true, 
		/*active:*/SedOption.delete, SedOption.ignoreCase, SedOption.lineNumber, SedOption.print, SedOption.quiet
	),
	/** Option set with the following active options: {@link #delete d}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}.*/
	Active_Idlnp_long(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/Active_Idglnp, /*global:*/Active_Idglnp_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		false, 
		/*active:*/SedOption.delete, SedOption.ignoreCase, SedOption.lineNumber, SedOption.print, SedOption.quiet
	),
	/** Option set with the following active options: {@link #delete d}, {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}.*/
	Active_Idglp(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Idglnp, /*quiet:*/Active_Idglnp_long, 
		true, 
		/*active:*/SedOption.delete, SedOption.global, SedOption.ignoreCase, SedOption.lineNumber, SedOption.print
	),
	/** Option set with the following active options: {@link #delete d}, {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}.*/
	Active_Idglp_long(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Idglnp, /*quiet:*/Active_Idglnp_long, 
		false, 
		/*active:*/SedOption.delete, SedOption.global, SedOption.ignoreCase, SedOption.lineNumber, SedOption.print
	),
	/** Option set with the following active options: {@link #delete d}, {@link #global g}, {@link #print p}, {@link #quiet n}.*/
	Active_dgnp(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Idgnp, /*ignoreCase:*/Active_Idgnp_long, /*l:*/Active_dglnp, /*lineNumber:*/Active_dglnp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		true, 
		/*active:*/SedOption.delete, SedOption.global, SedOption.print, SedOption.quiet
	),
	/** Option set with the following active options: {@link #delete d}, {@link #global g}, {@link #print p}, {@link #quiet n}.*/
	Active_dgnp_long(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Idgnp, /*ignoreCase:*/Active_Idgnp_long, /*l:*/Active_dglnp, /*lineNumber:*/Active_dglnp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		false, 
		/*active:*/SedOption.delete, SedOption.global, SedOption.print, SedOption.quiet
	),
	/** Option set with the following active options: {@link #delete d}, {@link #global g}, {@link #lineNumber l}, {@link #quiet n}.*/
	Active_dgln(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Idgln, /*ignoreCase:*/Active_Idgln_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_dglnp, /*print:*/Active_dglnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		true, 
		/*active:*/SedOption.delete, SedOption.global, SedOption.lineNumber, SedOption.quiet
	),
	/** Option set with the following active options: {@link #delete d}, {@link #global g}, {@link #lineNumber l}, {@link #quiet n}.*/
	Active_dgln_long(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Idgln, /*ignoreCase:*/Active_Idgln_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_dglnp, /*print:*/Active_dglnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		false, 
		/*active:*/SedOption.delete, SedOption.global, SedOption.lineNumber, SedOption.quiet
	),
	/** Option set with the following active options: {@link #delete d}, {@link #global g}, {@link #ignoreCase I}, {@link #quiet n}.*/
	Active_Idgn(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Idgln, /*lineNumber:*/Active_Idgln_long, /*p:*/Active_Idgnp, /*print:*/Active_Idgnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		true, 
		/*active:*/SedOption.delete, SedOption.global, SedOption.ignoreCase, SedOption.quiet
	),
	/** Option set with the following active options: {@link #delete d}, {@link #global g}, {@link #ignoreCase I}, {@link #quiet n}.*/
	Active_Idgn_long(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Idgln, /*lineNumber:*/Active_Idgln_long, /*p:*/Active_Idgnp, /*print:*/Active_Idgnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		false, 
		/*active:*/SedOption.delete, SedOption.global, SedOption.ignoreCase, SedOption.quiet
	),
	/** Option set with the following active options: {@link #delete d}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}.*/
	Active_dlnp(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/Active_dglnp, /*global:*/Active_dglnp_long, /*I:*/Active_Idlnp, /*ignoreCase:*/Active_Idlnp_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		true, 
		/*active:*/SedOption.delete, SedOption.lineNumber, SedOption.print, SedOption.quiet
	),
	/** Option set with the following active options: {@link #delete d}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}.*/
	Active_dlnp_long(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/Active_dglnp, /*global:*/Active_dglnp_long, /*I:*/Active_Idlnp, /*ignoreCase:*/Active_Idlnp_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		false, 
		/*active:*/SedOption.delete, SedOption.lineNumber, SedOption.print, SedOption.quiet
	),
	/** Option set with the following active options: {@link #delete d}, {@link #ignoreCase I}, {@link #print p}, {@link #quiet n}.*/
	Active_Idnp(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/Active_Idgnp, /*global:*/Active_Idgnp_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Idlnp, /*lineNumber:*/Active_Idlnp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		true, 
		/*active:*/SedOption.delete, SedOption.ignoreCase, SedOption.print, SedOption.quiet
	),
	/** Option set with the following active options: {@link #delete d}, {@link #ignoreCase I}, {@link #print p}, {@link #quiet n}.*/
	Active_Idnp_long(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/Active_Idgnp, /*global:*/Active_Idgnp_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Idlnp, /*lineNumber:*/Active_Idlnp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		false, 
		/*active:*/SedOption.delete, SedOption.ignoreCase, SedOption.print, SedOption.quiet
	),
	/** Option set with the following active options: {@link #delete d}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #quiet n}.*/
	Active_Idln(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/Active_Idgln, /*global:*/Active_Idgln_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Idlnp, /*print:*/Active_Idlnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		true, 
		/*active:*/SedOption.delete, SedOption.ignoreCase, SedOption.lineNumber, SedOption.quiet
	),
	/** Option set with the following active options: {@link #delete d}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #quiet n}.*/
	Active_Idln_long(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/Active_Idgln, /*global:*/Active_Idgln_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Idlnp, /*print:*/Active_Idlnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		false, 
		/*active:*/SedOption.delete, SedOption.ignoreCase, SedOption.lineNumber, SedOption.quiet
	),
	/** Option set with the following active options: {@link #delete d}, {@link #global g}, {@link #lineNumber l}, {@link #print p}.*/
	Active_dglp(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Idglp, /*ignoreCase:*/Active_Idglp_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_dglnp, /*quiet:*/Active_dglnp_long, 
		true, 
		/*active:*/SedOption.delete, SedOption.global, SedOption.lineNumber, SedOption.print
	),
	/** Option set with the following active options: {@link #delete d}, {@link #global g}, {@link #lineNumber l}, {@link #print p}.*/
	Active_dglp_long(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Idglp, /*ignoreCase:*/Active_Idglp_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_dglnp, /*quiet:*/Active_dglnp_long, 
		false, 
		/*active:*/SedOption.delete, SedOption.global, SedOption.lineNumber, SedOption.print
	),
	/** Option set with the following active options: {@link #delete d}, {@link #global g}, {@link #ignoreCase I}, {@link #print p}.*/
	Active_Idgp(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Idglp, /*lineNumber:*/Active_Idglp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Idgnp, /*quiet:*/Active_Idgnp_long, 
		true, 
		/*active:*/SedOption.delete, SedOption.global, SedOption.ignoreCase, SedOption.print
	),
	/** Option set with the following active options: {@link #delete d}, {@link #global g}, {@link #ignoreCase I}, {@link #print p}.*/
	Active_Idgp_long(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Idglp, /*lineNumber:*/Active_Idglp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Idgnp, /*quiet:*/Active_Idgnp_long, 
		false, 
		/*active:*/SedOption.delete, SedOption.global, SedOption.ignoreCase, SedOption.print
	),
	/** Option set with the following active options: {@link #delete d}, {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}.*/
	Active_Idgl(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Idglp, /*print:*/Active_Idglp_long, /*n:*/Active_Idgln, /*quiet:*/Active_Idgln_long, 
		true, 
		/*active:*/SedOption.delete, SedOption.global, SedOption.ignoreCase, SedOption.lineNumber
	),
	/** Option set with the following active options: {@link #delete d}, {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}.*/
	Active_Idgl_long(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Idglp, /*print:*/Active_Idglp_long, /*n:*/Active_Idgln, /*quiet:*/Active_Idgln_long, 
		false, 
		/*active:*/SedOption.delete, SedOption.global, SedOption.ignoreCase, SedOption.lineNumber
	),
	/** Option set with the following active options: {@link #delete d}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}.*/
	Active_Idlp(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/Active_Idglp, /*global:*/Active_Idglp_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Idlnp, /*quiet:*/Active_Idlnp_long, 
		true, 
		/*active:*/SedOption.delete, SedOption.ignoreCase, SedOption.lineNumber, SedOption.print
	),
	/** Option set with the following active options: {@link #delete d}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}.*/
	Active_Idlp_long(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/Active_Idglp, /*global:*/Active_Idglp_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Idlnp, /*quiet:*/Active_Idlnp_long, 
		false, 
		/*active:*/SedOption.delete, SedOption.ignoreCase, SedOption.lineNumber, SedOption.print
	),
	/** Option set with the following active options: {@link #delete d}, {@link #global g}, {@link #quiet n}.*/
	Active_dgn(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Idgn, /*ignoreCase:*/Active_Idgn_long, /*l:*/Active_dgln, /*lineNumber:*/Active_dgln_long, /*p:*/Active_dgnp, /*print:*/Active_dgnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		true, 
		/*active:*/SedOption.delete, SedOption.global, SedOption.quiet
	),
	/** Option set with the following active options: {@link #delete d}, {@link #global g}, {@link #quiet n}.*/
	Active_dgn_long(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Idgn, /*ignoreCase:*/Active_Idgn_long, /*l:*/Active_dgln, /*lineNumber:*/Active_dgln_long, /*p:*/Active_dgnp, /*print:*/Active_dgnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		false, 
		/*active:*/SedOption.delete, SedOption.global, SedOption.quiet
	),
	/** Option set with the following active options: {@link #delete d}, {@link #print p}, {@link #quiet n}.*/
	Active_dnp(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/Active_dgnp, /*global:*/Active_dgnp_long, /*I:*/Active_Idnp, /*ignoreCase:*/Active_Idnp_long, /*l:*/Active_dlnp, /*lineNumber:*/Active_dlnp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		true, 
		/*active:*/SedOption.delete, SedOption.print, SedOption.quiet
	),
	/** Option set with the following active options: {@link #delete d}, {@link #print p}, {@link #quiet n}.*/
	Active_dnp_long(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/Active_dgnp, /*global:*/Active_dgnp_long, /*I:*/Active_Idnp, /*ignoreCase:*/Active_Idnp_long, /*l:*/Active_dlnp, /*lineNumber:*/Active_dlnp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		false, 
		/*active:*/SedOption.delete, SedOption.print, SedOption.quiet
	),
	/** Option set with the following active options: {@link #delete d}, {@link #lineNumber l}, {@link #quiet n}.*/
	Active_dln(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/Active_dgln, /*global:*/Active_dgln_long, /*I:*/Active_Idln, /*ignoreCase:*/Active_Idln_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_dlnp, /*print:*/Active_dlnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		true, 
		/*active:*/SedOption.delete, SedOption.lineNumber, SedOption.quiet
	),
	/** Option set with the following active options: {@link #delete d}, {@link #lineNumber l}, {@link #quiet n}.*/
	Active_dln_long(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/Active_dgln, /*global:*/Active_dgln_long, /*I:*/Active_Idln, /*ignoreCase:*/Active_Idln_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_dlnp, /*print:*/Active_dlnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		false, 
		/*active:*/SedOption.delete, SedOption.lineNumber, SedOption.quiet
	),
	/** Option set with the following active options: {@link #delete d}, {@link #ignoreCase I}, {@link #quiet n}.*/
	Active_Idn(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/Active_Idgn, /*global:*/Active_Idgn_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Idln, /*lineNumber:*/Active_Idln_long, /*p:*/Active_Idnp, /*print:*/Active_Idnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		true, 
		/*active:*/SedOption.delete, SedOption.ignoreCase, SedOption.quiet
	),
	/** Option set with the following active options: {@link #delete d}, {@link #ignoreCase I}, {@link #quiet n}.*/
	Active_Idn_long(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/Active_Idgn, /*global:*/Active_Idgn_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Idln, /*lineNumber:*/Active_Idln_long, /*p:*/Active_Idnp, /*print:*/Active_Idnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		false, 
		/*active:*/SedOption.delete, SedOption.ignoreCase, SedOption.quiet
	),
	/** Option set with the following active options: {@link #delete d}, {@link #global g}, {@link #print p}.*/
	Active_dgp(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Idgp, /*ignoreCase:*/Active_Idgp_long, /*l:*/Active_dglp, /*lineNumber:*/Active_dglp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_dgnp, /*quiet:*/Active_dgnp_long, 
		true, 
		/*active:*/SedOption.delete, SedOption.global, SedOption.print
	),
	/** Option set with the following active options: {@link #delete d}, {@link #global g}, {@link #print p}.*/
	Active_dgp_long(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Idgp, /*ignoreCase:*/Active_Idgp_long, /*l:*/Active_dglp, /*lineNumber:*/Active_dglp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_dgnp, /*quiet:*/Active_dgnp_long, 
		false, 
		/*active:*/SedOption.delete, SedOption.global, SedOption.print
	),
	/** Option set with the following active options: {@link #delete d}, {@link #global g}, {@link #lineNumber l}.*/
	Active_dgl(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Idgl, /*ignoreCase:*/Active_Idgl_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_dglp, /*print:*/Active_dglp_long, /*n:*/Active_dgln, /*quiet:*/Active_dgln_long, 
		true, 
		/*active:*/SedOption.delete, SedOption.global, SedOption.lineNumber
	),
	/** Option set with the following active options: {@link #delete d}, {@link #global g}, {@link #lineNumber l}.*/
	Active_dgl_long(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Idgl, /*ignoreCase:*/Active_Idgl_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_dglp, /*print:*/Active_dglp_long, /*n:*/Active_dgln, /*quiet:*/Active_dgln_long, 
		false, 
		/*active:*/SedOption.delete, SedOption.global, SedOption.lineNumber
	),
	/** Option set with the following active options: {@link #delete d}, {@link #global g}, {@link #ignoreCase I}.*/
	Active_Idg(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Idgl, /*lineNumber:*/Active_Idgl_long, /*p:*/Active_Idgp, /*print:*/Active_Idgp_long, /*n:*/Active_Idgn, /*quiet:*/Active_Idgn_long, 
		true, 
		/*active:*/SedOption.delete, SedOption.global, SedOption.ignoreCase
	),
	/** Option set with the following active options: {@link #delete d}, {@link #global g}, {@link #ignoreCase I}.*/
	Active_Idg_long(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Idgl, /*lineNumber:*/Active_Idgl_long, /*p:*/Active_Idgp, /*print:*/Active_Idgp_long, /*n:*/Active_Idgn, /*quiet:*/Active_Idgn_long, 
		false, 
		/*active:*/SedOption.delete, SedOption.global, SedOption.ignoreCase
	),
	/** Option set with the following active options: {@link #delete d}, {@link #lineNumber l}, {@link #print p}.*/
	Active_dlp(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/Active_dglp, /*global:*/Active_dglp_long, /*I:*/Active_Idlp, /*ignoreCase:*/Active_Idlp_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_dlnp, /*quiet:*/Active_dlnp_long, 
		true, 
		/*active:*/SedOption.delete, SedOption.lineNumber, SedOption.print
	),
	/** Option set with the following active options: {@link #delete d}, {@link #lineNumber l}, {@link #print p}.*/
	Active_dlp_long(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/Active_dglp, /*global:*/Active_dglp_long, /*I:*/Active_Idlp, /*ignoreCase:*/Active_Idlp_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_dlnp, /*quiet:*/Active_dlnp_long, 
		false, 
		/*active:*/SedOption.delete, SedOption.lineNumber, SedOption.print
	),
	/** Option set with the following active options: {@link #delete d}, {@link #ignoreCase I}, {@link #print p}.*/
	Active_Idp(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/Active_Idgp, /*global:*/Active_Idgp_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Idlp, /*lineNumber:*/Active_Idlp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Idnp, /*quiet:*/Active_Idnp_long, 
		true, 
		/*active:*/SedOption.delete, SedOption.ignoreCase, SedOption.print
	),
	/** Option set with the following active options: {@link #delete d}, {@link #ignoreCase I}, {@link #print p}.*/
	Active_Idp_long(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/Active_Idgp, /*global:*/Active_Idgp_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Idlp, /*lineNumber:*/Active_Idlp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Idnp, /*quiet:*/Active_Idnp_long, 
		false, 
		/*active:*/SedOption.delete, SedOption.ignoreCase, SedOption.print
	),
	/** Option set with the following active options: {@link #delete d}, {@link #ignoreCase I}, {@link #lineNumber l}.*/
	Active_Idl(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/Active_Idgl, /*global:*/Active_Idgl_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Idlp, /*print:*/Active_Idlp_long, /*n:*/Active_Idln, /*quiet:*/Active_Idln_long, 
		true, 
		/*active:*/SedOption.delete, SedOption.ignoreCase, SedOption.lineNumber
	),
	/** Option set with the following active options: {@link #delete d}, {@link #ignoreCase I}, {@link #lineNumber l}.*/
	Active_Idl_long(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/Active_Idgl, /*global:*/Active_Idgl_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Idlp, /*print:*/Active_Idlp_long, /*n:*/Active_Idln, /*quiet:*/Active_Idln_long, 
		false, 
		/*active:*/SedOption.delete, SedOption.ignoreCase, SedOption.lineNumber
	),
	/** Option set with the following active options: {@link #delete d}, {@link #quiet n}.*/
	Active_dn(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/Active_dgn, /*global:*/Active_dgn_long, /*I:*/Active_Idn, /*ignoreCase:*/Active_Idn_long, /*l:*/Active_dln, /*lineNumber:*/Active_dln_long, /*p:*/Active_dnp, /*print:*/Active_dnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		true, 
		/*active:*/SedOption.delete, SedOption.quiet
	),
	/** Option set with the following active options: {@link #delete d}, {@link #quiet n}.*/
	Active_dn_long(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/Active_dgn, /*global:*/Active_dgn_long, /*I:*/Active_Idn, /*ignoreCase:*/Active_Idn_long, /*l:*/Active_dln, /*lineNumber:*/Active_dln_long, /*p:*/Active_dnp, /*print:*/Active_dnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		false, 
		/*active:*/SedOption.delete, SedOption.quiet
	),
	/** Option set with the following active options: {@link #delete d}, {@link #global g}.*/
	Active_dg(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Idg, /*ignoreCase:*/Active_Idg_long, /*l:*/Active_dgl, /*lineNumber:*/Active_dgl_long, /*p:*/Active_dgp, /*print:*/Active_dgp_long, /*n:*/Active_dgn, /*quiet:*/Active_dgn_long, 
		true, 
		/*active:*/SedOption.delete, SedOption.global
	),
	/** Option set with the following active options: {@link #delete d}, {@link #global g}.*/
	Active_dg_long(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Idg, /*ignoreCase:*/Active_Idg_long, /*l:*/Active_dgl, /*lineNumber:*/Active_dgl_long, /*p:*/Active_dgp, /*print:*/Active_dgp_long, /*n:*/Active_dgn, /*quiet:*/Active_dgn_long, 
		false, 
		/*active:*/SedOption.delete, SedOption.global
	),
	/** Option set with the following active options: {@link #delete d}, {@link #print p}.*/
	Active_dp(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/Active_dgp, /*global:*/Active_dgp_long, /*I:*/Active_Idp, /*ignoreCase:*/Active_Idp_long, /*l:*/Active_dlp, /*lineNumber:*/Active_dlp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_dnp, /*quiet:*/Active_dnp_long, 
		true, 
		/*active:*/SedOption.delete, SedOption.print
	),
	/** Option set with the following active options: {@link #delete d}, {@link #print p}.*/
	Active_dp_long(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/Active_dgp, /*global:*/Active_dgp_long, /*I:*/Active_Idp, /*ignoreCase:*/Active_Idp_long, /*l:*/Active_dlp, /*lineNumber:*/Active_dlp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_dnp, /*quiet:*/Active_dnp_long, 
		false, 
		/*active:*/SedOption.delete, SedOption.print
	),
	/** Option set with the following active options: {@link #delete d}, {@link #lineNumber l}.*/
	Active_dl(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/Active_dgl, /*global:*/Active_dgl_long, /*I:*/Active_Idl, /*ignoreCase:*/Active_Idl_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_dlp, /*print:*/Active_dlp_long, /*n:*/Active_dln, /*quiet:*/Active_dln_long, 
		true, 
		/*active:*/SedOption.delete, SedOption.lineNumber
	),
	/** Option set with the following active options: {@link #delete d}, {@link #lineNumber l}.*/
	Active_dl_long(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/Active_dgl, /*global:*/Active_dgl_long, /*I:*/Active_Idl, /*ignoreCase:*/Active_Idl_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_dlp, /*print:*/Active_dlp_long, /*n:*/Active_dln, /*quiet:*/Active_dln_long, 
		false, 
		/*active:*/SedOption.delete, SedOption.lineNumber
	),
	/** Option set with the following active options: {@link #delete d}, {@link #ignoreCase I}.*/
	Active_Id(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/Active_Idg, /*global:*/Active_Idg_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Idl, /*lineNumber:*/Active_Idl_long, /*p:*/Active_Idp, /*print:*/Active_Idp_long, /*n:*/Active_Idn, /*quiet:*/Active_Idn_long, 
		true, 
		/*active:*/SedOption.delete, SedOption.ignoreCase
	),
	/** Option set with the following active options: {@link #delete d}, {@link #ignoreCase I}.*/
	Active_Id_long(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/Active_Idg, /*global:*/Active_Idg_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Idl, /*lineNumber:*/Active_Idl_long, /*p:*/Active_Idp, /*print:*/Active_Idp_long, /*n:*/Active_Idn, /*quiet:*/Active_Idn_long, 
		false, 
		/*active:*/SedOption.delete, SedOption.ignoreCase
	),
	/** Option set with the following active options: {@link #delete d}.*/
	Active_d(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/Active_dg, /*global:*/Active_dg_long, /*I:*/Active_Id, /*ignoreCase:*/Active_Id_long, /*l:*/Active_dl, /*lineNumber:*/Active_dl_long, /*p:*/Active_dp, /*print:*/Active_dp_long, /*n:*/Active_dn, /*quiet:*/Active_dn_long, 
		true, 
		/*active:*/SedOption.delete
	),
	/** Option set with the following active options: {@link #delete d}.*/
	Active_d_long(
		/*d:*/null /*already set*/, /*delete:*/null /*already set*/, /*g:*/Active_dg, /*global:*/Active_dg_long, /*I:*/Active_Id, /*ignoreCase:*/Active_Id_long, /*l:*/Active_dl, /*lineNumber:*/Active_dl_long, /*p:*/Active_dp, /*print:*/Active_dp_long, /*n:*/Active_dn, /*quiet:*/Active_dn_long, 
		false, 
		/*active:*/SedOption.delete
	);
	private SedOptionSet_Idglnp(
		SedOptionSet_Idglnp d, SedOptionSet_Idglnp delete, SedOptionSet_Idglnp g, SedOptionSet_Idglnp global, SedOptionSet_Idglnp I, SedOptionSet_Idglnp ignoreCase, SedOptionSet_Idglnp l, SedOptionSet_Idglnp lineNumber, SedOptionSet_Idglnp p, SedOptionSet_Idglnp print, SedOptionSet_Idglnp n, SedOptionSet_Idglnp quiet, 
		boolean useAcronym,
		SedOption... activeOptions
	) {
		this.d = d == null ? this : d;
		this.delete = delete == null ? this : delete;
		this.g = g == null ? this : g;
		this.global = global == null ? this : global;
		this.I = I == null ? this : I;
		this.ignoreCase = ignoreCase == null ? this : ignoreCase;
		this.l = l == null ? this : l;
		this.lineNumber = lineNumber == null ? this : lineNumber;
		this.p = p == null ? this : p;
		this.print = print == null ? this : print;
		this.n = n == null ? this : n;
		this.quiet = quiet == null ? this : quiet;
		this.useAcronym = useAcronym;
		this.options = activeOptions.length == 0 ? EnumSet.noneOf(SedOption.class) : EnumSet.copyOf(Arrays.asList(activeOptions));
	}
	private final boolean useAcronym;
	/**
	 * Option {@code "-d"}: Delete the matched line.
	 * <p>
	 * The option {@code "-d"} is equivalent to the {@code "--}{@link #delete delete}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "-d"}. If the option {@code "-d"}
	 * is already set, the field {@code d} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final SedOptionSet_Idglnp d;
	/**
	 * Option {@code "--delete"}: Delete the matched line.
	 * <p>
	 * The option {@code "--delete"} is equivalent to the {@code "-}{@link #d d}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "--delete"}. If the option {@code "--delete"}
	 * is already set, the field {@code delete} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final SedOptionSet_Idglnp delete;
	/**
	 * Option {@code "-g"}: Globally substitute for all non-overlapping instances of the regexp 
			rather than just the first one. 
			<p>
			(This option is ignored if the occurrence operand is specified).
	 * <p>
	 * The option {@code "-g"} is equivalent to the {@code "--}{@link #global global}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "-g"}. If the option {@code "-g"}
	 * is already set, the field {@code g} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final SedOptionSet_Idglnp g;
	/**
	 * Option {@code "--global"}: Globally substitute for all non-overlapping instances of the regexp 
			rather than just the first one. 
			<p>
			(This option is ignored if the occurrence operand is specified).
	 * <p>
	 * The option {@code "--global"} is equivalent to the {@code "-}{@link #g g}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "--global"}. If the option {@code "--global"}
	 * is already set, the field {@code global} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final SedOptionSet_Idglnp global;
	/**
	 * Option {@code "-I"}: Use case insensitive pattern matching.
	 * <p>
	 * The option {@code "-I"} is equivalent to the {@code "--}{@link #ignoreCase ignoreCase}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "-I"}. If the option {@code "-I"}
	 * is already set, the field {@code I} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final SedOptionSet_Idglnp I;
	/**
	 * Option {@code "--ignoreCase"}: Use case insensitive pattern matching.
	 * <p>
	 * The option {@code "--ignoreCase"} is equivalent to the {@code "-}{@link #I I}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "--ignoreCase"}. If the option {@code "--ignoreCase"}
	 * is already set, the field {@code ignoreCase} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final SedOptionSet_Idglnp ignoreCase;
	/**
	 * Option {@code "-l"}: Writes the current line number on a separate line to the standard 
			output.
	 * <p>
	 * The option {@code "-l"} is equivalent to the {@code "--}{@link #lineNumber lineNumber}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "-l"}. If the option {@code "-l"}
	 * is already set, the field {@code l} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final SedOptionSet_Idglnp l;
	/**
	 * Option {@code "--lineNumber"}: Writes the current line number on a separate line to the standard 
			output.
	 * <p>
	 * The option {@code "--lineNumber"} is equivalent to the {@code "-}{@link #l l}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "--lineNumber"}. If the option {@code "--lineNumber"}
	 * is already set, the field {@code lineNumber} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final SedOptionSet_Idglnp lineNumber;
	/**
	 * Option {@code "-p"}: Write the matched line to standard output.
	 * <p>
	 * The option {@code "-p"} is equivalent to the {@code "--}{@link #print print}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "-p"}. If the option {@code "-p"}
	 * is already set, the field {@code p} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final SedOptionSet_Idglnp p;
	/**
	 * Option {@code "--print"}: Write the matched line to standard output.
	 * <p>
	 * The option {@code "--print"} is equivalent to the {@code "-}{@link #p p}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "--print"}. If the option {@code "--print"}
	 * is already set, the field {@code print} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final SedOptionSet_Idglnp print;
	/**
	 * Option {@code "-n"}: Suppress the default output (in which each line, after it is 
			examined for editing, is written to standard output). Only lines 
			explicitly selected for output are written.
	 * <p>
	 * The option {@code "-n"} is equivalent to the {@code "--}{@link #quiet quiet}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "-n"}. If the option {@code "-n"}
	 * is already set, the field {@code n} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final SedOptionSet_Idglnp n;
	/**
	 * Option {@code "--quiet"}: Suppress the default output (in which each line, after it is 
			examined for editing, is written to standard output). Only lines 
			explicitly selected for output are written.
	 * <p>
	 * The option {@code "--quiet"} is equivalent to the {@code "-}{@link #n n}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "--quiet"}. If the option {@code "--quiet"}
	 * is already set, the field {@code quiet} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final SedOptionSet_Idglnp quiet;
	private final EnumSet<SedOption> options;
	
	//inherit javadoc
	@Override
	public Class<SedOption> optionType() {
		return SedOption.class;
	}
	//inherit javadoc
	@Override
	public boolean isSet(SedOption option) {
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
	public EnumSet<SedOption> asSet() {
		return EnumSet.copyOf(options);
	}
	/**
	 * Returns an immutable iterator with the active options of this option set.
	 * 
	 * @return an immutable iterator for over the active options
	 */
	@Override
	public Iterator<SedOption> iterator() {
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
	 *    SedOptionSet_Idglnp.delete.g;
	 * </pre>
	 * uses acronyms, that is, this method always returns true for the above 
	 * set. 
	 * <p>
	 * On the other hand, long option names are used and this method always 
	 * returns false for the set
	 * <pre>
	 *    SedOptionSet_Idglnp.d.global;
	 * </pre>
	 * <p>
	 * Note that a repeated option is <i>not</i> treated as the last set option.
	 * For instance, the first and last option of the following set are 
	 * equivalent and acronyms are used:
	 * <pre>
	 *    SedOptionSet_Idglnp.d.g.delete;
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
	public boolean useAcronymFor(SedOption option) {
		return useAcronym;
	}
}
