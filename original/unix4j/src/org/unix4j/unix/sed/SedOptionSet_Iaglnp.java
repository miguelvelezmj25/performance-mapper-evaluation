package org.unix4j.unix.sed;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import org.unix4j.option.Option;

import org.unix4j.unix.Sed;

/**
 * Option sets for the {@link Sed sed} command with 
 * the following options: {@link #a a}, {@link #g g}, {@link #I I}, {@link #l l}, {@link #p p}, {@link #n n}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Sed#Options} should be used instead to specify command 
 * options. See also {@link org.unix4j.unix.sed.SedOptions} for more information.
 */
public enum SedOptionSet_Iaglnp implements SedOptions {
	/** Option set with the following active options: {@link #append a}, {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}.*/
	Active_Iaglnp(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		true, 
		/*active:*/SedOption.append, SedOption.global, SedOption.ignoreCase, SedOption.lineNumber, SedOption.print, SedOption.quiet
	),
	/** Option set with the following active options: {@link #append a}, {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}.*/
	Active_Iaglnp_long(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		false, 
		/*active:*/SedOption.append, SedOption.global, SedOption.ignoreCase, SedOption.lineNumber, SedOption.print, SedOption.quiet
	),
	/** Option set with the following active options: {@link #append a}, {@link #global g}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}.*/
	Active_aglnp(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Iaglnp, /*ignoreCase:*/Active_Iaglnp_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		true, 
		/*active:*/SedOption.append, SedOption.global, SedOption.lineNumber, SedOption.print, SedOption.quiet
	),
	/** Option set with the following active options: {@link #append a}, {@link #global g}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}.*/
	Active_aglnp_long(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Iaglnp, /*ignoreCase:*/Active_Iaglnp_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		false, 
		/*active:*/SedOption.append, SedOption.global, SedOption.lineNumber, SedOption.print, SedOption.quiet
	),
	/** Option set with the following active options: {@link #append a}, {@link #global g}, {@link #ignoreCase I}, {@link #print p}, {@link #quiet n}.*/
	Active_Iagnp(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Iaglnp, /*lineNumber:*/Active_Iaglnp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		true, 
		/*active:*/SedOption.append, SedOption.global, SedOption.ignoreCase, SedOption.print, SedOption.quiet
	),
	/** Option set with the following active options: {@link #append a}, {@link #global g}, {@link #ignoreCase I}, {@link #print p}, {@link #quiet n}.*/
	Active_Iagnp_long(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Iaglnp, /*lineNumber:*/Active_Iaglnp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		false, 
		/*active:*/SedOption.append, SedOption.global, SedOption.ignoreCase, SedOption.print, SedOption.quiet
	),
	/** Option set with the following active options: {@link #append a}, {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #quiet n}.*/
	Active_Iagln(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Iaglnp, /*print:*/Active_Iaglnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		true, 
		/*active:*/SedOption.append, SedOption.global, SedOption.ignoreCase, SedOption.lineNumber, SedOption.quiet
	),
	/** Option set with the following active options: {@link #append a}, {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #quiet n}.*/
	Active_Iagln_long(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Iaglnp, /*print:*/Active_Iaglnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		false, 
		/*active:*/SedOption.append, SedOption.global, SedOption.ignoreCase, SedOption.lineNumber, SedOption.quiet
	),
	/** Option set with the following active options: {@link #append a}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}.*/
	Active_Ialnp(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/Active_Iaglnp, /*global:*/Active_Iaglnp_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		true, 
		/*active:*/SedOption.append, SedOption.ignoreCase, SedOption.lineNumber, SedOption.print, SedOption.quiet
	),
	/** Option set with the following active options: {@link #append a}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}.*/
	Active_Ialnp_long(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/Active_Iaglnp, /*global:*/Active_Iaglnp_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		false, 
		/*active:*/SedOption.append, SedOption.ignoreCase, SedOption.lineNumber, SedOption.print, SedOption.quiet
	),
	/** Option set with the following active options: {@link #append a}, {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}.*/
	Active_Iaglp(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Iaglnp, /*quiet:*/Active_Iaglnp_long, 
		true, 
		/*active:*/SedOption.append, SedOption.global, SedOption.ignoreCase, SedOption.lineNumber, SedOption.print
	),
	/** Option set with the following active options: {@link #append a}, {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}.*/
	Active_Iaglp_long(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Iaglnp, /*quiet:*/Active_Iaglnp_long, 
		false, 
		/*active:*/SedOption.append, SedOption.global, SedOption.ignoreCase, SedOption.lineNumber, SedOption.print
	),
	/** Option set with the following active options: {@link #append a}, {@link #global g}, {@link #print p}, {@link #quiet n}.*/
	Active_agnp(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Iagnp, /*ignoreCase:*/Active_Iagnp_long, /*l:*/Active_aglnp, /*lineNumber:*/Active_aglnp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		true, 
		/*active:*/SedOption.append, SedOption.global, SedOption.print, SedOption.quiet
	),
	/** Option set with the following active options: {@link #append a}, {@link #global g}, {@link #print p}, {@link #quiet n}.*/
	Active_agnp_long(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Iagnp, /*ignoreCase:*/Active_Iagnp_long, /*l:*/Active_aglnp, /*lineNumber:*/Active_aglnp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		false, 
		/*active:*/SedOption.append, SedOption.global, SedOption.print, SedOption.quiet
	),
	/** Option set with the following active options: {@link #append a}, {@link #global g}, {@link #lineNumber l}, {@link #quiet n}.*/
	Active_agln(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Iagln, /*ignoreCase:*/Active_Iagln_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_aglnp, /*print:*/Active_aglnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		true, 
		/*active:*/SedOption.append, SedOption.global, SedOption.lineNumber, SedOption.quiet
	),
	/** Option set with the following active options: {@link #append a}, {@link #global g}, {@link #lineNumber l}, {@link #quiet n}.*/
	Active_agln_long(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Iagln, /*ignoreCase:*/Active_Iagln_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_aglnp, /*print:*/Active_aglnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		false, 
		/*active:*/SedOption.append, SedOption.global, SedOption.lineNumber, SedOption.quiet
	),
	/** Option set with the following active options: {@link #append a}, {@link #global g}, {@link #ignoreCase I}, {@link #quiet n}.*/
	Active_Iagn(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Iagln, /*lineNumber:*/Active_Iagln_long, /*p:*/Active_Iagnp, /*print:*/Active_Iagnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		true, 
		/*active:*/SedOption.append, SedOption.global, SedOption.ignoreCase, SedOption.quiet
	),
	/** Option set with the following active options: {@link #append a}, {@link #global g}, {@link #ignoreCase I}, {@link #quiet n}.*/
	Active_Iagn_long(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Iagln, /*lineNumber:*/Active_Iagln_long, /*p:*/Active_Iagnp, /*print:*/Active_Iagnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		false, 
		/*active:*/SedOption.append, SedOption.global, SedOption.ignoreCase, SedOption.quiet
	),
	/** Option set with the following active options: {@link #append a}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}.*/
	Active_alnp(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/Active_aglnp, /*global:*/Active_aglnp_long, /*I:*/Active_Ialnp, /*ignoreCase:*/Active_Ialnp_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		true, 
		/*active:*/SedOption.append, SedOption.lineNumber, SedOption.print, SedOption.quiet
	),
	/** Option set with the following active options: {@link #append a}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}.*/
	Active_alnp_long(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/Active_aglnp, /*global:*/Active_aglnp_long, /*I:*/Active_Ialnp, /*ignoreCase:*/Active_Ialnp_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		false, 
		/*active:*/SedOption.append, SedOption.lineNumber, SedOption.print, SedOption.quiet
	),
	/** Option set with the following active options: {@link #append a}, {@link #ignoreCase I}, {@link #print p}, {@link #quiet n}.*/
	Active_Ianp(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/Active_Iagnp, /*global:*/Active_Iagnp_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Ialnp, /*lineNumber:*/Active_Ialnp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		true, 
		/*active:*/SedOption.append, SedOption.ignoreCase, SedOption.print, SedOption.quiet
	),
	/** Option set with the following active options: {@link #append a}, {@link #ignoreCase I}, {@link #print p}, {@link #quiet n}.*/
	Active_Ianp_long(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/Active_Iagnp, /*global:*/Active_Iagnp_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Ialnp, /*lineNumber:*/Active_Ialnp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		false, 
		/*active:*/SedOption.append, SedOption.ignoreCase, SedOption.print, SedOption.quiet
	),
	/** Option set with the following active options: {@link #append a}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #quiet n}.*/
	Active_Ialn(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/Active_Iagln, /*global:*/Active_Iagln_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Ialnp, /*print:*/Active_Ialnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		true, 
		/*active:*/SedOption.append, SedOption.ignoreCase, SedOption.lineNumber, SedOption.quiet
	),
	/** Option set with the following active options: {@link #append a}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #quiet n}.*/
	Active_Ialn_long(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/Active_Iagln, /*global:*/Active_Iagln_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Ialnp, /*print:*/Active_Ialnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		false, 
		/*active:*/SedOption.append, SedOption.ignoreCase, SedOption.lineNumber, SedOption.quiet
	),
	/** Option set with the following active options: {@link #append a}, {@link #global g}, {@link #lineNumber l}, {@link #print p}.*/
	Active_aglp(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Iaglp, /*ignoreCase:*/Active_Iaglp_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_aglnp, /*quiet:*/Active_aglnp_long, 
		true, 
		/*active:*/SedOption.append, SedOption.global, SedOption.lineNumber, SedOption.print
	),
	/** Option set with the following active options: {@link #append a}, {@link #global g}, {@link #lineNumber l}, {@link #print p}.*/
	Active_aglp_long(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Iaglp, /*ignoreCase:*/Active_Iaglp_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_aglnp, /*quiet:*/Active_aglnp_long, 
		false, 
		/*active:*/SedOption.append, SedOption.global, SedOption.lineNumber, SedOption.print
	),
	/** Option set with the following active options: {@link #append a}, {@link #global g}, {@link #ignoreCase I}, {@link #print p}.*/
	Active_Iagp(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Iaglp, /*lineNumber:*/Active_Iaglp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Iagnp, /*quiet:*/Active_Iagnp_long, 
		true, 
		/*active:*/SedOption.append, SedOption.global, SedOption.ignoreCase, SedOption.print
	),
	/** Option set with the following active options: {@link #append a}, {@link #global g}, {@link #ignoreCase I}, {@link #print p}.*/
	Active_Iagp_long(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Iaglp, /*lineNumber:*/Active_Iaglp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Iagnp, /*quiet:*/Active_Iagnp_long, 
		false, 
		/*active:*/SedOption.append, SedOption.global, SedOption.ignoreCase, SedOption.print
	),
	/** Option set with the following active options: {@link #append a}, {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}.*/
	Active_Iagl(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Iaglp, /*print:*/Active_Iaglp_long, /*n:*/Active_Iagln, /*quiet:*/Active_Iagln_long, 
		true, 
		/*active:*/SedOption.append, SedOption.global, SedOption.ignoreCase, SedOption.lineNumber
	),
	/** Option set with the following active options: {@link #append a}, {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}.*/
	Active_Iagl_long(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Iaglp, /*print:*/Active_Iaglp_long, /*n:*/Active_Iagln, /*quiet:*/Active_Iagln_long, 
		false, 
		/*active:*/SedOption.append, SedOption.global, SedOption.ignoreCase, SedOption.lineNumber
	),
	/** Option set with the following active options: {@link #append a}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}.*/
	Active_Ialp(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/Active_Iaglp, /*global:*/Active_Iaglp_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Ialnp, /*quiet:*/Active_Ialnp_long, 
		true, 
		/*active:*/SedOption.append, SedOption.ignoreCase, SedOption.lineNumber, SedOption.print
	),
	/** Option set with the following active options: {@link #append a}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}.*/
	Active_Ialp_long(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/Active_Iaglp, /*global:*/Active_Iaglp_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Ialnp, /*quiet:*/Active_Ialnp_long, 
		false, 
		/*active:*/SedOption.append, SedOption.ignoreCase, SedOption.lineNumber, SedOption.print
	),
	/** Option set with the following active options: {@link #append a}, {@link #global g}, {@link #quiet n}.*/
	Active_agn(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Iagn, /*ignoreCase:*/Active_Iagn_long, /*l:*/Active_agln, /*lineNumber:*/Active_agln_long, /*p:*/Active_agnp, /*print:*/Active_agnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		true, 
		/*active:*/SedOption.append, SedOption.global, SedOption.quiet
	),
	/** Option set with the following active options: {@link #append a}, {@link #global g}, {@link #quiet n}.*/
	Active_agn_long(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Iagn, /*ignoreCase:*/Active_Iagn_long, /*l:*/Active_agln, /*lineNumber:*/Active_agln_long, /*p:*/Active_agnp, /*print:*/Active_agnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		false, 
		/*active:*/SedOption.append, SedOption.global, SedOption.quiet
	),
	/** Option set with the following active options: {@link #append a}, {@link #print p}, {@link #quiet n}.*/
	Active_anp(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/Active_agnp, /*global:*/Active_agnp_long, /*I:*/Active_Ianp, /*ignoreCase:*/Active_Ianp_long, /*l:*/Active_alnp, /*lineNumber:*/Active_alnp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		true, 
		/*active:*/SedOption.append, SedOption.print, SedOption.quiet
	),
	/** Option set with the following active options: {@link #append a}, {@link #print p}, {@link #quiet n}.*/
	Active_anp_long(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/Active_agnp, /*global:*/Active_agnp_long, /*I:*/Active_Ianp, /*ignoreCase:*/Active_Ianp_long, /*l:*/Active_alnp, /*lineNumber:*/Active_alnp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		false, 
		/*active:*/SedOption.append, SedOption.print, SedOption.quiet
	),
	/** Option set with the following active options: {@link #append a}, {@link #lineNumber l}, {@link #quiet n}.*/
	Active_aln(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/Active_agln, /*global:*/Active_agln_long, /*I:*/Active_Ialn, /*ignoreCase:*/Active_Ialn_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_alnp, /*print:*/Active_alnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		true, 
		/*active:*/SedOption.append, SedOption.lineNumber, SedOption.quiet
	),
	/** Option set with the following active options: {@link #append a}, {@link #lineNumber l}, {@link #quiet n}.*/
	Active_aln_long(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/Active_agln, /*global:*/Active_agln_long, /*I:*/Active_Ialn, /*ignoreCase:*/Active_Ialn_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_alnp, /*print:*/Active_alnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		false, 
		/*active:*/SedOption.append, SedOption.lineNumber, SedOption.quiet
	),
	/** Option set with the following active options: {@link #append a}, {@link #ignoreCase I}, {@link #quiet n}.*/
	Active_Ian(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/Active_Iagn, /*global:*/Active_Iagn_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Ialn, /*lineNumber:*/Active_Ialn_long, /*p:*/Active_Ianp, /*print:*/Active_Ianp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		true, 
		/*active:*/SedOption.append, SedOption.ignoreCase, SedOption.quiet
	),
	/** Option set with the following active options: {@link #append a}, {@link #ignoreCase I}, {@link #quiet n}.*/
	Active_Ian_long(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/Active_Iagn, /*global:*/Active_Iagn_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Ialn, /*lineNumber:*/Active_Ialn_long, /*p:*/Active_Ianp, /*print:*/Active_Ianp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		false, 
		/*active:*/SedOption.append, SedOption.ignoreCase, SedOption.quiet
	),
	/** Option set with the following active options: {@link #append a}, {@link #global g}, {@link #print p}.*/
	Active_agp(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Iagp, /*ignoreCase:*/Active_Iagp_long, /*l:*/Active_aglp, /*lineNumber:*/Active_aglp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_agnp, /*quiet:*/Active_agnp_long, 
		true, 
		/*active:*/SedOption.append, SedOption.global, SedOption.print
	),
	/** Option set with the following active options: {@link #append a}, {@link #global g}, {@link #print p}.*/
	Active_agp_long(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Iagp, /*ignoreCase:*/Active_Iagp_long, /*l:*/Active_aglp, /*lineNumber:*/Active_aglp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_agnp, /*quiet:*/Active_agnp_long, 
		false, 
		/*active:*/SedOption.append, SedOption.global, SedOption.print
	),
	/** Option set with the following active options: {@link #append a}, {@link #global g}, {@link #lineNumber l}.*/
	Active_agl(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Iagl, /*ignoreCase:*/Active_Iagl_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_aglp, /*print:*/Active_aglp_long, /*n:*/Active_agln, /*quiet:*/Active_agln_long, 
		true, 
		/*active:*/SedOption.append, SedOption.global, SedOption.lineNumber
	),
	/** Option set with the following active options: {@link #append a}, {@link #global g}, {@link #lineNumber l}.*/
	Active_agl_long(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Iagl, /*ignoreCase:*/Active_Iagl_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_aglp, /*print:*/Active_aglp_long, /*n:*/Active_agln, /*quiet:*/Active_agln_long, 
		false, 
		/*active:*/SedOption.append, SedOption.global, SedOption.lineNumber
	),
	/** Option set with the following active options: {@link #append a}, {@link #global g}, {@link #ignoreCase I}.*/
	Active_Iag(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Iagl, /*lineNumber:*/Active_Iagl_long, /*p:*/Active_Iagp, /*print:*/Active_Iagp_long, /*n:*/Active_Iagn, /*quiet:*/Active_Iagn_long, 
		true, 
		/*active:*/SedOption.append, SedOption.global, SedOption.ignoreCase
	),
	/** Option set with the following active options: {@link #append a}, {@link #global g}, {@link #ignoreCase I}.*/
	Active_Iag_long(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Iagl, /*lineNumber:*/Active_Iagl_long, /*p:*/Active_Iagp, /*print:*/Active_Iagp_long, /*n:*/Active_Iagn, /*quiet:*/Active_Iagn_long, 
		false, 
		/*active:*/SedOption.append, SedOption.global, SedOption.ignoreCase
	),
	/** Option set with the following active options: {@link #append a}, {@link #lineNumber l}, {@link #print p}.*/
	Active_alp(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/Active_aglp, /*global:*/Active_aglp_long, /*I:*/Active_Ialp, /*ignoreCase:*/Active_Ialp_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_alnp, /*quiet:*/Active_alnp_long, 
		true, 
		/*active:*/SedOption.append, SedOption.lineNumber, SedOption.print
	),
	/** Option set with the following active options: {@link #append a}, {@link #lineNumber l}, {@link #print p}.*/
	Active_alp_long(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/Active_aglp, /*global:*/Active_aglp_long, /*I:*/Active_Ialp, /*ignoreCase:*/Active_Ialp_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_alnp, /*quiet:*/Active_alnp_long, 
		false, 
		/*active:*/SedOption.append, SedOption.lineNumber, SedOption.print
	),
	/** Option set with the following active options: {@link #append a}, {@link #ignoreCase I}, {@link #print p}.*/
	Active_Iap(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/Active_Iagp, /*global:*/Active_Iagp_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Ialp, /*lineNumber:*/Active_Ialp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Ianp, /*quiet:*/Active_Ianp_long, 
		true, 
		/*active:*/SedOption.append, SedOption.ignoreCase, SedOption.print
	),
	/** Option set with the following active options: {@link #append a}, {@link #ignoreCase I}, {@link #print p}.*/
	Active_Iap_long(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/Active_Iagp, /*global:*/Active_Iagp_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Ialp, /*lineNumber:*/Active_Ialp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Ianp, /*quiet:*/Active_Ianp_long, 
		false, 
		/*active:*/SedOption.append, SedOption.ignoreCase, SedOption.print
	),
	/** Option set with the following active options: {@link #append a}, {@link #ignoreCase I}, {@link #lineNumber l}.*/
	Active_Ial(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/Active_Iagl, /*global:*/Active_Iagl_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Ialp, /*print:*/Active_Ialp_long, /*n:*/Active_Ialn, /*quiet:*/Active_Ialn_long, 
		true, 
		/*active:*/SedOption.append, SedOption.ignoreCase, SedOption.lineNumber
	),
	/** Option set with the following active options: {@link #append a}, {@link #ignoreCase I}, {@link #lineNumber l}.*/
	Active_Ial_long(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/Active_Iagl, /*global:*/Active_Iagl_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Ialp, /*print:*/Active_Ialp_long, /*n:*/Active_Ialn, /*quiet:*/Active_Ialn_long, 
		false, 
		/*active:*/SedOption.append, SedOption.ignoreCase, SedOption.lineNumber
	),
	/** Option set with the following active options: {@link #append a}, {@link #quiet n}.*/
	Active_an(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/Active_agn, /*global:*/Active_agn_long, /*I:*/Active_Ian, /*ignoreCase:*/Active_Ian_long, /*l:*/Active_aln, /*lineNumber:*/Active_aln_long, /*p:*/Active_anp, /*print:*/Active_anp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		true, 
		/*active:*/SedOption.append, SedOption.quiet
	),
	/** Option set with the following active options: {@link #append a}, {@link #quiet n}.*/
	Active_an_long(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/Active_agn, /*global:*/Active_agn_long, /*I:*/Active_Ian, /*ignoreCase:*/Active_Ian_long, /*l:*/Active_aln, /*lineNumber:*/Active_aln_long, /*p:*/Active_anp, /*print:*/Active_anp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, 
		false, 
		/*active:*/SedOption.append, SedOption.quiet
	),
	/** Option set with the following active options: {@link #append a}, {@link #global g}.*/
	Active_ag(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Iag, /*ignoreCase:*/Active_Iag_long, /*l:*/Active_agl, /*lineNumber:*/Active_agl_long, /*p:*/Active_agp, /*print:*/Active_agp_long, /*n:*/Active_agn, /*quiet:*/Active_agn_long, 
		true, 
		/*active:*/SedOption.append, SedOption.global
	),
	/** Option set with the following active options: {@link #append a}, {@link #global g}.*/
	Active_ag_long(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Iag, /*ignoreCase:*/Active_Iag_long, /*l:*/Active_agl, /*lineNumber:*/Active_agl_long, /*p:*/Active_agp, /*print:*/Active_agp_long, /*n:*/Active_agn, /*quiet:*/Active_agn_long, 
		false, 
		/*active:*/SedOption.append, SedOption.global
	),
	/** Option set with the following active options: {@link #append a}, {@link #print p}.*/
	Active_ap(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/Active_agp, /*global:*/Active_agp_long, /*I:*/Active_Iap, /*ignoreCase:*/Active_Iap_long, /*l:*/Active_alp, /*lineNumber:*/Active_alp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_anp, /*quiet:*/Active_anp_long, 
		true, 
		/*active:*/SedOption.append, SedOption.print
	),
	/** Option set with the following active options: {@link #append a}, {@link #print p}.*/
	Active_ap_long(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/Active_agp, /*global:*/Active_agp_long, /*I:*/Active_Iap, /*ignoreCase:*/Active_Iap_long, /*l:*/Active_alp, /*lineNumber:*/Active_alp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_anp, /*quiet:*/Active_anp_long, 
		false, 
		/*active:*/SedOption.append, SedOption.print
	),
	/** Option set with the following active options: {@link #append a}, {@link #lineNumber l}.*/
	Active_al(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/Active_agl, /*global:*/Active_agl_long, /*I:*/Active_Ial, /*ignoreCase:*/Active_Ial_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_alp, /*print:*/Active_alp_long, /*n:*/Active_aln, /*quiet:*/Active_aln_long, 
		true, 
		/*active:*/SedOption.append, SedOption.lineNumber
	),
	/** Option set with the following active options: {@link #append a}, {@link #lineNumber l}.*/
	Active_al_long(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/Active_agl, /*global:*/Active_agl_long, /*I:*/Active_Ial, /*ignoreCase:*/Active_Ial_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_alp, /*print:*/Active_alp_long, /*n:*/Active_aln, /*quiet:*/Active_aln_long, 
		false, 
		/*active:*/SedOption.append, SedOption.lineNumber
	),
	/** Option set with the following active options: {@link #append a}, {@link #ignoreCase I}.*/
	Active_Ia(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/Active_Iag, /*global:*/Active_Iag_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Ial, /*lineNumber:*/Active_Ial_long, /*p:*/Active_Iap, /*print:*/Active_Iap_long, /*n:*/Active_Ian, /*quiet:*/Active_Ian_long, 
		true, 
		/*active:*/SedOption.append, SedOption.ignoreCase
	),
	/** Option set with the following active options: {@link #append a}, {@link #ignoreCase I}.*/
	Active_Ia_long(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/Active_Iag, /*global:*/Active_Iag_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Ial, /*lineNumber:*/Active_Ial_long, /*p:*/Active_Iap, /*print:*/Active_Iap_long, /*n:*/Active_Ian, /*quiet:*/Active_Ian_long, 
		false, 
		/*active:*/SedOption.append, SedOption.ignoreCase
	),
	/** Option set with the following active options: {@link #append a}.*/
	Active_a(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/Active_ag, /*global:*/Active_ag_long, /*I:*/Active_Ia, /*ignoreCase:*/Active_Ia_long, /*l:*/Active_al, /*lineNumber:*/Active_al_long, /*p:*/Active_ap, /*print:*/Active_ap_long, /*n:*/Active_an, /*quiet:*/Active_an_long, 
		true, 
		/*active:*/SedOption.append
	),
	/** Option set with the following active options: {@link #append a}.*/
	Active_a_long(
		/*a:*/null /*already set*/, /*append:*/null /*already set*/, /*g:*/Active_ag, /*global:*/Active_ag_long, /*I:*/Active_Ia, /*ignoreCase:*/Active_Ia_long, /*l:*/Active_al, /*lineNumber:*/Active_al_long, /*p:*/Active_ap, /*print:*/Active_ap_long, /*n:*/Active_an, /*quiet:*/Active_an_long, 
		false, 
		/*active:*/SedOption.append
	);
	private SedOptionSet_Iaglnp(
		SedOptionSet_Iaglnp a, SedOptionSet_Iaglnp append, SedOptionSet_Iaglnp g, SedOptionSet_Iaglnp global, SedOptionSet_Iaglnp I, SedOptionSet_Iaglnp ignoreCase, SedOptionSet_Iaglnp l, SedOptionSet_Iaglnp lineNumber, SedOptionSet_Iaglnp p, SedOptionSet_Iaglnp print, SedOptionSet_Iaglnp n, SedOptionSet_Iaglnp quiet, 
		boolean useAcronym,
		SedOption... activeOptions
	) {
		this.a = a == null ? this : a;
		this.append = append == null ? this : append;
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
	 * Option {@code "-a"}: Append string2 as a separate line after the matched line.
	 * <p>
	 * The option {@code "-a"} is equivalent to the {@code "--}{@link #append append}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "-a"}. If the option {@code "-a"}
	 * is already set, the field {@code a} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final SedOptionSet_Iaglnp a;
	/**
	 * Option {@code "--append"}: Append string2 as a separate line after the matched line.
	 * <p>
	 * The option {@code "--append"} is equivalent to the {@code "-}{@link #a a}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "--append"}. If the option {@code "--append"}
	 * is already set, the field {@code append} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final SedOptionSet_Iaglnp append;
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
	public final SedOptionSet_Iaglnp g;
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
	public final SedOptionSet_Iaglnp global;
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
	public final SedOptionSet_Iaglnp I;
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
	public final SedOptionSet_Iaglnp ignoreCase;
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
	public final SedOptionSet_Iaglnp l;
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
	public final SedOptionSet_Iaglnp lineNumber;
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
	public final SedOptionSet_Iaglnp p;
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
	public final SedOptionSet_Iaglnp print;
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
	public final SedOptionSet_Iaglnp n;
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
	public final SedOptionSet_Iaglnp quiet;
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
	 *    SedOptionSet_Iaglnp.append.g;
	 * </pre>
	 * uses acronyms, that is, this method always returns true for the above 
	 * set. 
	 * <p>
	 * On the other hand, long option names are used and this method always 
	 * returns false for the set
	 * <pre>
	 *    SedOptionSet_Iaglnp.a.global;
	 * </pre>
	 * <p>
	 * Note that a repeated option is <i>not</i> treated as the last set option.
	 * For instance, the first and last option of the following set are 
	 * equivalent and acronyms are used:
	 * <pre>
	 *    SedOptionSet_Iaglnp.a.g.append;
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
