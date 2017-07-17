package org.unix4j.unix.sed;

import org.unix4j.option.Option;
import org.unix4j.unix.Sed;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Option sets for the {@link Sed sed} command with
 * the following options: {@link #a a}, {@link #c c}, {@link #d d}, {@link #g g}, {@link #I I}, {@link #i i}, {@link #l l}, {@link #p p}, {@link #n n}, {@link #s s}, {@link #y y}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Sed#Options} should be used instead to specify command
 * options. See also {@link org.unix4j.unix.sed.SedOptions} for more information.
 */
public enum SedOptionSet_Iacdgilnpsy implements SedOptions {
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}.
     */
    Active_Iglnp(
        /*a:*/SedOptionSet_Iaglnp.Active_Iaglnp, /*append:*/SedOptionSet_Iaglnp.Active_Iaglnp_long, /*c:*/SedOptionSet_Icglnp.Active_Icglnp, /*change:*/SedOptionSet_Icglnp.Active_Icglnp_long, /*d:*/SedOptionSet_Idglnp.Active_Idglnp, /*delete:*/SedOptionSet_Idglnp.Active_Idglnp_long, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/SedOptionSet_Igilnp.Active_Igilnp, /*insert:*/SedOptionSet_Igilnp.Active_Igilnp_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/SedOptionSet_Iglnps.Active_Iglnps, /*substitute:*/SedOptionSet_Iglnps.Active_Iglnps_long, /*y:*/SedOptionSet_Iglnpy.Active_Iglnpy, /*translate:*/SedOptionSet_Iglnpy.Active_Iglnpy_long,
            true,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.lineNumber, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}.
     */
    Active_Iglnp_long(
		/*a:*/SedOptionSet_Iaglnp.Active_Iaglnp, /*append:*/SedOptionSet_Iaglnp.Active_Iaglnp_long, /*c:*/SedOptionSet_Icglnp.Active_Icglnp, /*change:*/SedOptionSet_Icglnp.Active_Icglnp_long, /*d:*/SedOptionSet_Idglnp.Active_Idglnp, /*delete:*/SedOptionSet_Idglnp.Active_Idglnp_long, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/SedOptionSet_Igilnp.Active_Igilnp, /*insert:*/SedOptionSet_Igilnp.Active_Igilnp_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/SedOptionSet_Iglnps.Active_Iglnps, /*substitute:*/SedOptionSet_Iglnps.Active_Iglnps_long, /*y:*/SedOptionSet_Iglnpy.Active_Iglnpy, /*translate:*/SedOptionSet_Iglnpy.Active_Iglnpy_long,
            false,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.lineNumber, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}.
     */
    Active_glnp(
		/*a:*/SedOptionSet_Iaglnp.Active_aglnp, /*append:*/SedOptionSet_Iaglnp.Active_aglnp_long, /*c:*/SedOptionSet_Icglnp.Active_cglnp, /*change:*/SedOptionSet_Icglnp.Active_cglnp_long, /*d:*/SedOptionSet_Idglnp.Active_dglnp, /*delete:*/SedOptionSet_Idglnp.Active_dglnp_long, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Iglnp, /*ignoreCase:*/Active_Iglnp_long, /*i:*/SedOptionSet_Igilnp.Active_gilnp, /*insert:*/SedOptionSet_Igilnp.Active_gilnp_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/SedOptionSet_Iglnps.Active_glnps, /*substitute:*/SedOptionSet_Iglnps.Active_glnps_long, /*y:*/SedOptionSet_Iglnpy.Active_glnpy, /*translate:*/SedOptionSet_Iglnpy.Active_glnpy_long,
            true,
		/*active:*/SedOption.global, SedOption.lineNumber, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}.
     */
    Active_glnp_long(
		/*a:*/SedOptionSet_Iaglnp.Active_aglnp, /*append:*/SedOptionSet_Iaglnp.Active_aglnp_long, /*c:*/SedOptionSet_Icglnp.Active_cglnp, /*change:*/SedOptionSet_Icglnp.Active_cglnp_long, /*d:*/SedOptionSet_Idglnp.Active_dglnp, /*delete:*/SedOptionSet_Idglnp.Active_dglnp_long, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Iglnp, /*ignoreCase:*/Active_Iglnp_long, /*i:*/SedOptionSet_Igilnp.Active_gilnp, /*insert:*/SedOptionSet_Igilnp.Active_gilnp_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/SedOptionSet_Iglnps.Active_glnps, /*substitute:*/SedOptionSet_Iglnps.Active_glnps_long, /*y:*/SedOptionSet_Iglnpy.Active_glnpy, /*translate:*/SedOptionSet_Iglnpy.Active_glnpy_long,
            false,
		/*active:*/SedOption.global, SedOption.lineNumber, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #print p}, {@link #quiet n}.
     */
    Active_Ignp(
		/*a:*/SedOptionSet_Iaglnp.Active_Iagnp, /*append:*/SedOptionSet_Iaglnp.Active_Iagnp_long, /*c:*/SedOptionSet_Icglnp.Active_Icgnp, /*change:*/SedOptionSet_Icglnp.Active_Icgnp_long, /*d:*/SedOptionSet_Idglnp.Active_Idgnp, /*delete:*/SedOptionSet_Idglnp.Active_Idgnp_long, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/SedOptionSet_Igilnp.Active_Iginp, /*insert:*/SedOptionSet_Igilnp.Active_Iginp_long, /*l:*/Active_Iglnp, /*lineNumber:*/Active_Iglnp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/SedOptionSet_Iglnps.Active_Ignps, /*substitute:*/SedOptionSet_Iglnps.Active_Ignps_long, /*y:*/SedOptionSet_Iglnpy.Active_Ignpy, /*translate:*/SedOptionSet_Iglnpy.Active_Ignpy_long,
            true,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #print p}, {@link #quiet n}.
     */
    Active_Ignp_long(
		/*a:*/SedOptionSet_Iaglnp.Active_Iagnp, /*append:*/SedOptionSet_Iaglnp.Active_Iagnp_long, /*c:*/SedOptionSet_Icglnp.Active_Icgnp, /*change:*/SedOptionSet_Icglnp.Active_Icgnp_long, /*d:*/SedOptionSet_Idglnp.Active_Idgnp, /*delete:*/SedOptionSet_Idglnp.Active_Idgnp_long, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/SedOptionSet_Igilnp.Active_Iginp, /*insert:*/SedOptionSet_Igilnp.Active_Iginp_long, /*l:*/Active_Iglnp, /*lineNumber:*/Active_Iglnp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/SedOptionSet_Iglnps.Active_Ignps, /*substitute:*/SedOptionSet_Iglnps.Active_Ignps_long, /*y:*/SedOptionSet_Iglnpy.Active_Ignpy, /*translate:*/SedOptionSet_Iglnpy.Active_Ignpy_long,
            false,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #quiet n}.
     */
    Active_Igln(
		/*a:*/SedOptionSet_Iaglnp.Active_Iagln, /*append:*/SedOptionSet_Iaglnp.Active_Iagln_long, /*c:*/SedOptionSet_Icglnp.Active_Icgln, /*change:*/SedOptionSet_Icglnp.Active_Icgln_long, /*d:*/SedOptionSet_Idglnp.Active_Idgln, /*delete:*/SedOptionSet_Idglnp.Active_Idgln_long, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/SedOptionSet_Igilnp.Active_Igiln, /*insert:*/SedOptionSet_Igilnp.Active_Igiln_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Iglnp, /*print:*/Active_Iglnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/SedOptionSet_Iglnps.Active_Iglns, /*substitute:*/SedOptionSet_Iglnps.Active_Iglns_long, /*y:*/SedOptionSet_Iglnpy.Active_Iglny, /*translate:*/SedOptionSet_Iglnpy.Active_Iglny_long,
            true,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.lineNumber, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #quiet n}.
     */
    Active_Igln_long(
		/*a:*/SedOptionSet_Iaglnp.Active_Iagln, /*append:*/SedOptionSet_Iaglnp.Active_Iagln_long, /*c:*/SedOptionSet_Icglnp.Active_Icgln, /*change:*/SedOptionSet_Icglnp.Active_Icgln_long, /*d:*/SedOptionSet_Idglnp.Active_Idgln, /*delete:*/SedOptionSet_Idglnp.Active_Idgln_long, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/SedOptionSet_Igilnp.Active_Igiln, /*insert:*/SedOptionSet_Igilnp.Active_Igiln_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Iglnp, /*print:*/Active_Iglnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/SedOptionSet_Iglnps.Active_Iglns, /*substitute:*/SedOptionSet_Iglnps.Active_Iglns_long, /*y:*/SedOptionSet_Iglnpy.Active_Iglny, /*translate:*/SedOptionSet_Iglnpy.Active_Iglny_long,
            false,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.lineNumber, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}.
     */
    Active_Ilnp(
		/*a:*/SedOptionSet_Iaglnp.Active_Ialnp, /*append:*/SedOptionSet_Iaglnp.Active_Ialnp_long, /*c:*/SedOptionSet_Icglnp.Active_Iclnp, /*change:*/SedOptionSet_Icglnp.Active_Iclnp_long, /*d:*/SedOptionSet_Idglnp.Active_Idlnp, /*delete:*/SedOptionSet_Idglnp.Active_Idlnp_long, /*g:*/Active_Iglnp, /*global:*/Active_Iglnp_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/SedOptionSet_Igilnp.Active_Iilnp, /*insert:*/SedOptionSet_Igilnp.Active_Iilnp_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/SedOptionSet_Iglnps.Active_Ilnps, /*substitute:*/SedOptionSet_Iglnps.Active_Ilnps_long, /*y:*/SedOptionSet_Iglnpy.Active_Ilnpy, /*translate:*/SedOptionSet_Iglnpy.Active_Ilnpy_long,
            true,
		/*active:*/SedOption.ignoreCase, SedOption.lineNumber, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}.
     */
    Active_Ilnp_long(
		/*a:*/SedOptionSet_Iaglnp.Active_Ialnp, /*append:*/SedOptionSet_Iaglnp.Active_Ialnp_long, /*c:*/SedOptionSet_Icglnp.Active_Iclnp, /*change:*/SedOptionSet_Icglnp.Active_Iclnp_long, /*d:*/SedOptionSet_Idglnp.Active_Idlnp, /*delete:*/SedOptionSet_Idglnp.Active_Idlnp_long, /*g:*/Active_Iglnp, /*global:*/Active_Iglnp_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/SedOptionSet_Igilnp.Active_Iilnp, /*insert:*/SedOptionSet_Igilnp.Active_Iilnp_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/SedOptionSet_Iglnps.Active_Ilnps, /*substitute:*/SedOptionSet_Iglnps.Active_Ilnps_long, /*y:*/SedOptionSet_Iglnpy.Active_Ilnpy, /*translate:*/SedOptionSet_Iglnpy.Active_Ilnpy_long,
            false,
		/*active:*/SedOption.ignoreCase, SedOption.lineNumber, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}.
     */
    Active_Iglp(
		/*a:*/SedOptionSet_Iaglnp.Active_Iaglp, /*append:*/SedOptionSet_Iaglnp.Active_Iaglp_long, /*c:*/SedOptionSet_Icglnp.Active_Icglp, /*change:*/SedOptionSet_Icglnp.Active_Icglp_long, /*d:*/SedOptionSet_Idglnp.Active_Idglp, /*delete:*/SedOptionSet_Idglnp.Active_Idglp_long, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/SedOptionSet_Igilnp.Active_Igilp, /*insert:*/SedOptionSet_Igilnp.Active_Igilp_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Iglnp, /*quiet:*/Active_Iglnp_long, /*s:*/SedOptionSet_Iglnps.Active_Iglps, /*substitute:*/SedOptionSet_Iglnps.Active_Iglps_long, /*y:*/SedOptionSet_Iglnpy.Active_Iglpy, /*translate:*/SedOptionSet_Iglnpy.Active_Iglpy_long,
            true,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.lineNumber, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}.
     */
    Active_Iglp_long(
		/*a:*/SedOptionSet_Iaglnp.Active_Iaglp, /*append:*/SedOptionSet_Iaglnp.Active_Iaglp_long, /*c:*/SedOptionSet_Icglnp.Active_Icglp, /*change:*/SedOptionSet_Icglnp.Active_Icglp_long, /*d:*/SedOptionSet_Idglnp.Active_Idglp, /*delete:*/SedOptionSet_Idglnp.Active_Idglp_long, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/SedOptionSet_Igilnp.Active_Igilp, /*insert:*/SedOptionSet_Igilnp.Active_Igilp_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Iglnp, /*quiet:*/Active_Iglnp_long, /*s:*/SedOptionSet_Iglnps.Active_Iglps, /*substitute:*/SedOptionSet_Iglnps.Active_Iglps_long, /*y:*/SedOptionSet_Iglnpy.Active_Iglpy, /*translate:*/SedOptionSet_Iglnpy.Active_Iglpy_long,
            false,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.lineNumber, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #print p}, {@link #quiet n}.
     */
    Active_gnp(
		/*a:*/SedOptionSet_Iaglnp.Active_agnp, /*append:*/SedOptionSet_Iaglnp.Active_agnp_long, /*c:*/SedOptionSet_Icglnp.Active_cgnp, /*change:*/SedOptionSet_Icglnp.Active_cgnp_long, /*d:*/SedOptionSet_Idglnp.Active_dgnp, /*delete:*/SedOptionSet_Idglnp.Active_dgnp_long, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Ignp, /*ignoreCase:*/Active_Ignp_long, /*i:*/SedOptionSet_Igilnp.Active_ginp, /*insert:*/SedOptionSet_Igilnp.Active_ginp_long, /*l:*/Active_glnp, /*lineNumber:*/Active_glnp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/SedOptionSet_Iglnps.Active_gnps, /*substitute:*/SedOptionSet_Iglnps.Active_gnps_long, /*y:*/SedOptionSet_Iglnpy.Active_gnpy, /*translate:*/SedOptionSet_Iglnpy.Active_gnpy_long,
            true,
		/*active:*/SedOption.global, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #print p}, {@link #quiet n}.
     */
    Active_gnp_long(
		/*a:*/SedOptionSet_Iaglnp.Active_agnp, /*append:*/SedOptionSet_Iaglnp.Active_agnp_long, /*c:*/SedOptionSet_Icglnp.Active_cgnp, /*change:*/SedOptionSet_Icglnp.Active_cgnp_long, /*d:*/SedOptionSet_Idglnp.Active_dgnp, /*delete:*/SedOptionSet_Idglnp.Active_dgnp_long, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Ignp, /*ignoreCase:*/Active_Ignp_long, /*i:*/SedOptionSet_Igilnp.Active_ginp, /*insert:*/SedOptionSet_Igilnp.Active_ginp_long, /*l:*/Active_glnp, /*lineNumber:*/Active_glnp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/SedOptionSet_Iglnps.Active_gnps, /*substitute:*/SedOptionSet_Iglnps.Active_gnps_long, /*y:*/SedOptionSet_Iglnpy.Active_gnpy, /*translate:*/SedOptionSet_Iglnpy.Active_gnpy_long,
            false,
		/*active:*/SedOption.global, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #lineNumber l}, {@link #quiet n}.
     */
    Active_gln(
		/*a:*/SedOptionSet_Iaglnp.Active_agln, /*append:*/SedOptionSet_Iaglnp.Active_agln_long, /*c:*/SedOptionSet_Icglnp.Active_cgln, /*change:*/SedOptionSet_Icglnp.Active_cgln_long, /*d:*/SedOptionSet_Idglnp.Active_dgln, /*delete:*/SedOptionSet_Idglnp.Active_dgln_long, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Igln, /*ignoreCase:*/Active_Igln_long, /*i:*/SedOptionSet_Igilnp.Active_giln, /*insert:*/SedOptionSet_Igilnp.Active_giln_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_glnp, /*print:*/Active_glnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/SedOptionSet_Iglnps.Active_glns, /*substitute:*/SedOptionSet_Iglnps.Active_glns_long, /*y:*/SedOptionSet_Iglnpy.Active_glny, /*translate:*/SedOptionSet_Iglnpy.Active_glny_long,
            true,
		/*active:*/SedOption.global, SedOption.lineNumber, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #lineNumber l}, {@link #quiet n}.
     */
    Active_gln_long(
		/*a:*/SedOptionSet_Iaglnp.Active_agln, /*append:*/SedOptionSet_Iaglnp.Active_agln_long, /*c:*/SedOptionSet_Icglnp.Active_cgln, /*change:*/SedOptionSet_Icglnp.Active_cgln_long, /*d:*/SedOptionSet_Idglnp.Active_dgln, /*delete:*/SedOptionSet_Idglnp.Active_dgln_long, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Igln, /*ignoreCase:*/Active_Igln_long, /*i:*/SedOptionSet_Igilnp.Active_giln, /*insert:*/SedOptionSet_Igilnp.Active_giln_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_glnp, /*print:*/Active_glnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/SedOptionSet_Iglnps.Active_glns, /*substitute:*/SedOptionSet_Iglnps.Active_glns_long, /*y:*/SedOptionSet_Iglnpy.Active_glny, /*translate:*/SedOptionSet_Iglnpy.Active_glny_long,
            false,
		/*active:*/SedOption.global, SedOption.lineNumber, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #quiet n}.
     */
    Active_Ign(
		/*a:*/SedOptionSet_Iaglnp.Active_Iagn, /*append:*/SedOptionSet_Iaglnp.Active_Iagn_long, /*c:*/SedOptionSet_Icglnp.Active_Icgn, /*change:*/SedOptionSet_Icglnp.Active_Icgn_long, /*d:*/SedOptionSet_Idglnp.Active_Idgn, /*delete:*/SedOptionSet_Idglnp.Active_Idgn_long, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/SedOptionSet_Igilnp.Active_Igin, /*insert:*/SedOptionSet_Igilnp.Active_Igin_long, /*l:*/Active_Igln, /*lineNumber:*/Active_Igln_long, /*p:*/Active_Ignp, /*print:*/Active_Ignp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/SedOptionSet_Iglnps.Active_Igns, /*substitute:*/SedOptionSet_Iglnps.Active_Igns_long, /*y:*/SedOptionSet_Iglnpy.Active_Igny, /*translate:*/SedOptionSet_Iglnpy.Active_Igny_long,
            true,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #quiet n}.
     */
    Active_Ign_long(
		/*a:*/SedOptionSet_Iaglnp.Active_Iagn, /*append:*/SedOptionSet_Iaglnp.Active_Iagn_long, /*c:*/SedOptionSet_Icglnp.Active_Icgn, /*change:*/SedOptionSet_Icglnp.Active_Icgn_long, /*d:*/SedOptionSet_Idglnp.Active_Idgn, /*delete:*/SedOptionSet_Idglnp.Active_Idgn_long, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/SedOptionSet_Igilnp.Active_Igin, /*insert:*/SedOptionSet_Igilnp.Active_Igin_long, /*l:*/Active_Igln, /*lineNumber:*/Active_Igln_long, /*p:*/Active_Ignp, /*print:*/Active_Ignp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/SedOptionSet_Iglnps.Active_Igns, /*substitute:*/SedOptionSet_Iglnps.Active_Igns_long, /*y:*/SedOptionSet_Iglnpy.Active_Igny, /*translate:*/SedOptionSet_Iglnpy.Active_Igny_long,
            false,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #lineNumber l}, {@link #print p}, {@link #quiet n}.
     */
    Active_lnp(
		/*a:*/SedOptionSet_Iaglnp.Active_alnp, /*append:*/SedOptionSet_Iaglnp.Active_alnp_long, /*c:*/SedOptionSet_Icglnp.Active_clnp, /*change:*/SedOptionSet_Icglnp.Active_clnp_long, /*d:*/SedOptionSet_Idglnp.Active_dlnp, /*delete:*/SedOptionSet_Idglnp.Active_dlnp_long, /*g:*/Active_glnp, /*global:*/Active_glnp_long, /*I:*/Active_Ilnp, /*ignoreCase:*/Active_Ilnp_long, /*i:*/SedOptionSet_Igilnp.Active_ilnp, /*insert:*/SedOptionSet_Igilnp.Active_ilnp_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/SedOptionSet_Iglnps.Active_lnps, /*substitute:*/SedOptionSet_Iglnps.Active_lnps_long, /*y:*/SedOptionSet_Iglnpy.Active_lnpy, /*translate:*/SedOptionSet_Iglnpy.Active_lnpy_long,
            true,
		/*active:*/SedOption.lineNumber, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #lineNumber l}, {@link #print p}, {@link #quiet n}.
     */
    Active_lnp_long(
		/*a:*/SedOptionSet_Iaglnp.Active_alnp, /*append:*/SedOptionSet_Iaglnp.Active_alnp_long, /*c:*/SedOptionSet_Icglnp.Active_clnp, /*change:*/SedOptionSet_Icglnp.Active_clnp_long, /*d:*/SedOptionSet_Idglnp.Active_dlnp, /*delete:*/SedOptionSet_Idglnp.Active_dlnp_long, /*g:*/Active_glnp, /*global:*/Active_glnp_long, /*I:*/Active_Ilnp, /*ignoreCase:*/Active_Ilnp_long, /*i:*/SedOptionSet_Igilnp.Active_ilnp, /*insert:*/SedOptionSet_Igilnp.Active_ilnp_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/SedOptionSet_Iglnps.Active_lnps, /*substitute:*/SedOptionSet_Iglnps.Active_lnps_long, /*y:*/SedOptionSet_Iglnpy.Active_lnpy, /*translate:*/SedOptionSet_Iglnpy.Active_lnpy_long,
            false,
		/*active:*/SedOption.lineNumber, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #print p}, {@link #quiet n}.
     */
    Active_Inp(
		/*a:*/SedOptionSet_Iaglnp.Active_Ianp, /*append:*/SedOptionSet_Iaglnp.Active_Ianp_long, /*c:*/SedOptionSet_Icglnp.Active_Icnp, /*change:*/SedOptionSet_Icglnp.Active_Icnp_long, /*d:*/SedOptionSet_Idglnp.Active_Idnp, /*delete:*/SedOptionSet_Idglnp.Active_Idnp_long, /*g:*/Active_Ignp, /*global:*/Active_Ignp_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/SedOptionSet_Igilnp.Active_Iinp, /*insert:*/SedOptionSet_Igilnp.Active_Iinp_long, /*l:*/Active_Ilnp, /*lineNumber:*/Active_Ilnp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/SedOptionSet_Iglnps.Active_Inps, /*substitute:*/SedOptionSet_Iglnps.Active_Inps_long, /*y:*/SedOptionSet_Iglnpy.Active_Inpy, /*translate:*/SedOptionSet_Iglnpy.Active_Inpy_long,
            true,
		/*active:*/SedOption.ignoreCase, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #print p}, {@link #quiet n}.
     */
    Active_Inp_long(
		/*a:*/SedOptionSet_Iaglnp.Active_Ianp, /*append:*/SedOptionSet_Iaglnp.Active_Ianp_long, /*c:*/SedOptionSet_Icglnp.Active_Icnp, /*change:*/SedOptionSet_Icglnp.Active_Icnp_long, /*d:*/SedOptionSet_Idglnp.Active_Idnp, /*delete:*/SedOptionSet_Idglnp.Active_Idnp_long, /*g:*/Active_Ignp, /*global:*/Active_Ignp_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/SedOptionSet_Igilnp.Active_Iinp, /*insert:*/SedOptionSet_Igilnp.Active_Iinp_long, /*l:*/Active_Ilnp, /*lineNumber:*/Active_Ilnp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/SedOptionSet_Iglnps.Active_Inps, /*substitute:*/SedOptionSet_Iglnps.Active_Inps_long, /*y:*/SedOptionSet_Iglnpy.Active_Inpy, /*translate:*/SedOptionSet_Iglnpy.Active_Inpy_long,
            false,
		/*active:*/SedOption.ignoreCase, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #lineNumber l}, {@link #quiet n}.
     */
    Active_Iln(
		/*a:*/SedOptionSet_Iaglnp.Active_Ialn, /*append:*/SedOptionSet_Iaglnp.Active_Ialn_long, /*c:*/SedOptionSet_Icglnp.Active_Icln, /*change:*/SedOptionSet_Icglnp.Active_Icln_long, /*d:*/SedOptionSet_Idglnp.Active_Idln, /*delete:*/SedOptionSet_Idglnp.Active_Idln_long, /*g:*/Active_Igln, /*global:*/Active_Igln_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/SedOptionSet_Igilnp.Active_Iiln, /*insert:*/SedOptionSet_Igilnp.Active_Iiln_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Ilnp, /*print:*/Active_Ilnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/SedOptionSet_Iglnps.Active_Ilns, /*substitute:*/SedOptionSet_Iglnps.Active_Ilns_long, /*y:*/SedOptionSet_Iglnpy.Active_Ilny, /*translate:*/SedOptionSet_Iglnpy.Active_Ilny_long,
            true,
		/*active:*/SedOption.ignoreCase, SedOption.lineNumber, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #lineNumber l}, {@link #quiet n}.
     */
    Active_Iln_long(
		/*a:*/SedOptionSet_Iaglnp.Active_Ialn, /*append:*/SedOptionSet_Iaglnp.Active_Ialn_long, /*c:*/SedOptionSet_Icglnp.Active_Icln, /*change:*/SedOptionSet_Icglnp.Active_Icln_long, /*d:*/SedOptionSet_Idglnp.Active_Idln, /*delete:*/SedOptionSet_Idglnp.Active_Idln_long, /*g:*/Active_Igln, /*global:*/Active_Igln_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/SedOptionSet_Igilnp.Active_Iiln, /*insert:*/SedOptionSet_Igilnp.Active_Iiln_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Ilnp, /*print:*/Active_Ilnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/SedOptionSet_Iglnps.Active_Ilns, /*substitute:*/SedOptionSet_Iglnps.Active_Ilns_long, /*y:*/SedOptionSet_Iglnpy.Active_Ilny, /*translate:*/SedOptionSet_Iglnpy.Active_Ilny_long,
            false,
		/*active:*/SedOption.ignoreCase, SedOption.lineNumber, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #lineNumber l}, {@link #print p}.
     */
    Active_glp(
		/*a:*/SedOptionSet_Iaglnp.Active_aglp, /*append:*/SedOptionSet_Iaglnp.Active_aglp_long, /*c:*/SedOptionSet_Icglnp.Active_cglp, /*change:*/SedOptionSet_Icglnp.Active_cglp_long, /*d:*/SedOptionSet_Idglnp.Active_dglp, /*delete:*/SedOptionSet_Idglnp.Active_dglp_long, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Iglp, /*ignoreCase:*/Active_Iglp_long, /*i:*/SedOptionSet_Igilnp.Active_gilp, /*insert:*/SedOptionSet_Igilnp.Active_gilp_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_glnp, /*quiet:*/Active_glnp_long, /*s:*/SedOptionSet_Iglnps.Active_glps, /*substitute:*/SedOptionSet_Iglnps.Active_glps_long, /*y:*/SedOptionSet_Iglnpy.Active_glpy, /*translate:*/SedOptionSet_Iglnpy.Active_glpy_long,
            true,
		/*active:*/SedOption.global, SedOption.lineNumber, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #lineNumber l}, {@link #print p}.
     */
    Active_glp_long(
		/*a:*/SedOptionSet_Iaglnp.Active_aglp, /*append:*/SedOptionSet_Iaglnp.Active_aglp_long, /*c:*/SedOptionSet_Icglnp.Active_cglp, /*change:*/SedOptionSet_Icglnp.Active_cglp_long, /*d:*/SedOptionSet_Idglnp.Active_dglp, /*delete:*/SedOptionSet_Idglnp.Active_dglp_long, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Iglp, /*ignoreCase:*/Active_Iglp_long, /*i:*/SedOptionSet_Igilnp.Active_gilp, /*insert:*/SedOptionSet_Igilnp.Active_gilp_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_glnp, /*quiet:*/Active_glnp_long, /*s:*/SedOptionSet_Iglnps.Active_glps, /*substitute:*/SedOptionSet_Iglnps.Active_glps_long, /*y:*/SedOptionSet_Iglnpy.Active_glpy, /*translate:*/SedOptionSet_Iglnpy.Active_glpy_long,
            false,
		/*active:*/SedOption.global, SedOption.lineNumber, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #print p}.
     */
    Active_Igp(
		/*a:*/SedOptionSet_Iaglnp.Active_Iagp, /*append:*/SedOptionSet_Iaglnp.Active_Iagp_long, /*c:*/SedOptionSet_Icglnp.Active_Icgp, /*change:*/SedOptionSet_Icglnp.Active_Icgp_long, /*d:*/SedOptionSet_Idglnp.Active_Idgp, /*delete:*/SedOptionSet_Idglnp.Active_Idgp_long, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/SedOptionSet_Igilnp.Active_Igip, /*insert:*/SedOptionSet_Igilnp.Active_Igip_long, /*l:*/Active_Iglp, /*lineNumber:*/Active_Iglp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Ignp, /*quiet:*/Active_Ignp_long, /*s:*/SedOptionSet_Iglnps.Active_Igps, /*substitute:*/SedOptionSet_Iglnps.Active_Igps_long, /*y:*/SedOptionSet_Iglnpy.Active_Igpy, /*translate:*/SedOptionSet_Iglnpy.Active_Igpy_long,
            true,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #print p}.
     */
    Active_Igp_long(
		/*a:*/SedOptionSet_Iaglnp.Active_Iagp, /*append:*/SedOptionSet_Iaglnp.Active_Iagp_long, /*c:*/SedOptionSet_Icglnp.Active_Icgp, /*change:*/SedOptionSet_Icglnp.Active_Icgp_long, /*d:*/SedOptionSet_Idglnp.Active_Idgp, /*delete:*/SedOptionSet_Idglnp.Active_Idgp_long, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/SedOptionSet_Igilnp.Active_Igip, /*insert:*/SedOptionSet_Igilnp.Active_Igip_long, /*l:*/Active_Iglp, /*lineNumber:*/Active_Iglp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Ignp, /*quiet:*/Active_Ignp_long, /*s:*/SedOptionSet_Iglnps.Active_Igps, /*substitute:*/SedOptionSet_Iglnps.Active_Igps_long, /*y:*/SedOptionSet_Iglnpy.Active_Igpy, /*translate:*/SedOptionSet_Iglnpy.Active_Igpy_long,
            false,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}.
     */
    Active_Igl(
		/*a:*/SedOptionSet_Iaglnp.Active_Iagl, /*append:*/SedOptionSet_Iaglnp.Active_Iagl_long, /*c:*/SedOptionSet_Icglnp.Active_Icgl, /*change:*/SedOptionSet_Icglnp.Active_Icgl_long, /*d:*/SedOptionSet_Idglnp.Active_Idgl, /*delete:*/SedOptionSet_Idglnp.Active_Idgl_long, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/SedOptionSet_Igilnp.Active_Igil, /*insert:*/SedOptionSet_Igilnp.Active_Igil_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Iglp, /*print:*/Active_Iglp_long, /*n:*/Active_Igln, /*quiet:*/Active_Igln_long, /*s:*/SedOptionSet_Iglnps.Active_Igls, /*substitute:*/SedOptionSet_Iglnps.Active_Igls_long, /*y:*/SedOptionSet_Iglnpy.Active_Igly, /*translate:*/SedOptionSet_Iglnpy.Active_Igly_long,
            true,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}.
     */
    Active_Igl_long(
		/*a:*/SedOptionSet_Iaglnp.Active_Iagl, /*append:*/SedOptionSet_Iaglnp.Active_Iagl_long, /*c:*/SedOptionSet_Icglnp.Active_Icgl, /*change:*/SedOptionSet_Icglnp.Active_Icgl_long, /*d:*/SedOptionSet_Idglnp.Active_Idgl, /*delete:*/SedOptionSet_Idglnp.Active_Idgl_long, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/SedOptionSet_Igilnp.Active_Igil, /*insert:*/SedOptionSet_Igilnp.Active_Igil_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Iglp, /*print:*/Active_Iglp_long, /*n:*/Active_Igln, /*quiet:*/Active_Igln_long, /*s:*/SedOptionSet_Iglnps.Active_Igls, /*substitute:*/SedOptionSet_Iglnps.Active_Igls_long, /*y:*/SedOptionSet_Iglnpy.Active_Igly, /*translate:*/SedOptionSet_Iglnpy.Active_Igly_long,
            false,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}.
     */
    Active_Ilp(
		/*a:*/SedOptionSet_Iaglnp.Active_Ialp, /*append:*/SedOptionSet_Iaglnp.Active_Ialp_long, /*c:*/SedOptionSet_Icglnp.Active_Iclp, /*change:*/SedOptionSet_Icglnp.Active_Iclp_long, /*d:*/SedOptionSet_Idglnp.Active_Idlp, /*delete:*/SedOptionSet_Idglnp.Active_Idlp_long, /*g:*/Active_Iglp, /*global:*/Active_Iglp_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/SedOptionSet_Igilnp.Active_Iilp, /*insert:*/SedOptionSet_Igilnp.Active_Iilp_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Ilnp, /*quiet:*/Active_Ilnp_long, /*s:*/SedOptionSet_Iglnps.Active_Ilps, /*substitute:*/SedOptionSet_Iglnps.Active_Ilps_long, /*y:*/SedOptionSet_Iglnpy.Active_Ilpy, /*translate:*/SedOptionSet_Iglnpy.Active_Ilpy_long,
            true,
		/*active:*/SedOption.ignoreCase, SedOption.lineNumber, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}.
     */
    Active_Ilp_long(
		/*a:*/SedOptionSet_Iaglnp.Active_Ialp, /*append:*/SedOptionSet_Iaglnp.Active_Ialp_long, /*c:*/SedOptionSet_Icglnp.Active_Iclp, /*change:*/SedOptionSet_Icglnp.Active_Iclp_long, /*d:*/SedOptionSet_Idglnp.Active_Idlp, /*delete:*/SedOptionSet_Idglnp.Active_Idlp_long, /*g:*/Active_Iglp, /*global:*/Active_Iglp_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/SedOptionSet_Igilnp.Active_Iilp, /*insert:*/SedOptionSet_Igilnp.Active_Iilp_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Ilnp, /*quiet:*/Active_Ilnp_long, /*s:*/SedOptionSet_Iglnps.Active_Ilps, /*substitute:*/SedOptionSet_Iglnps.Active_Ilps_long, /*y:*/SedOptionSet_Iglnpy.Active_Ilpy, /*translate:*/SedOptionSet_Iglnpy.Active_Ilpy_long,
            false,
		/*active:*/SedOption.ignoreCase, SedOption.lineNumber, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #quiet n}.
     */
    Active_gn(
		/*a:*/SedOptionSet_Iaglnp.Active_agn, /*append:*/SedOptionSet_Iaglnp.Active_agn_long, /*c:*/SedOptionSet_Icglnp.Active_cgn, /*change:*/SedOptionSet_Icglnp.Active_cgn_long, /*d:*/SedOptionSet_Idglnp.Active_dgn, /*delete:*/SedOptionSet_Idglnp.Active_dgn_long, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Ign, /*ignoreCase:*/Active_Ign_long, /*i:*/SedOptionSet_Igilnp.Active_gin, /*insert:*/SedOptionSet_Igilnp.Active_gin_long, /*l:*/Active_gln, /*lineNumber:*/Active_gln_long, /*p:*/Active_gnp, /*print:*/Active_gnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/SedOptionSet_Iglnps.Active_gns, /*substitute:*/SedOptionSet_Iglnps.Active_gns_long, /*y:*/SedOptionSet_Iglnpy.Active_gny, /*translate:*/SedOptionSet_Iglnpy.Active_gny_long,
            true,
		/*active:*/SedOption.global, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #quiet n}.
     */
    Active_gn_long(
		/*a:*/SedOptionSet_Iaglnp.Active_agn, /*append:*/SedOptionSet_Iaglnp.Active_agn_long, /*c:*/SedOptionSet_Icglnp.Active_cgn, /*change:*/SedOptionSet_Icglnp.Active_cgn_long, /*d:*/SedOptionSet_Idglnp.Active_dgn, /*delete:*/SedOptionSet_Idglnp.Active_dgn_long, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Ign, /*ignoreCase:*/Active_Ign_long, /*i:*/SedOptionSet_Igilnp.Active_gin, /*insert:*/SedOptionSet_Igilnp.Active_gin_long, /*l:*/Active_gln, /*lineNumber:*/Active_gln_long, /*p:*/Active_gnp, /*print:*/Active_gnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/SedOptionSet_Iglnps.Active_gns, /*substitute:*/SedOptionSet_Iglnps.Active_gns_long, /*y:*/SedOptionSet_Iglnpy.Active_gny, /*translate:*/SedOptionSet_Iglnpy.Active_gny_long,
            false,
		/*active:*/SedOption.global, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #print p}, {@link #quiet n}.
     */
    Active_np(
		/*a:*/SedOptionSet_Iaglnp.Active_anp, /*append:*/SedOptionSet_Iaglnp.Active_anp_long, /*c:*/SedOptionSet_Icglnp.Active_cnp, /*change:*/SedOptionSet_Icglnp.Active_cnp_long, /*d:*/SedOptionSet_Idglnp.Active_dnp, /*delete:*/SedOptionSet_Idglnp.Active_dnp_long, /*g:*/Active_gnp, /*global:*/Active_gnp_long, /*I:*/Active_Inp, /*ignoreCase:*/Active_Inp_long, /*i:*/SedOptionSet_Igilnp.Active_inp, /*insert:*/SedOptionSet_Igilnp.Active_inp_long, /*l:*/Active_lnp, /*lineNumber:*/Active_lnp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/SedOptionSet_Iglnps.Active_nps, /*substitute:*/SedOptionSet_Iglnps.Active_nps_long, /*y:*/SedOptionSet_Iglnpy.Active_npy, /*translate:*/SedOptionSet_Iglnpy.Active_npy_long,
            true,
		/*active:*/SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #print p}, {@link #quiet n}.
     */
    Active_np_long(
		/*a:*/SedOptionSet_Iaglnp.Active_anp, /*append:*/SedOptionSet_Iaglnp.Active_anp_long, /*c:*/SedOptionSet_Icglnp.Active_cnp, /*change:*/SedOptionSet_Icglnp.Active_cnp_long, /*d:*/SedOptionSet_Idglnp.Active_dnp, /*delete:*/SedOptionSet_Idglnp.Active_dnp_long, /*g:*/Active_gnp, /*global:*/Active_gnp_long, /*I:*/Active_Inp, /*ignoreCase:*/Active_Inp_long, /*i:*/SedOptionSet_Igilnp.Active_inp, /*insert:*/SedOptionSet_Igilnp.Active_inp_long, /*l:*/Active_lnp, /*lineNumber:*/Active_lnp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/SedOptionSet_Iglnps.Active_nps, /*substitute:*/SedOptionSet_Iglnps.Active_nps_long, /*y:*/SedOptionSet_Iglnpy.Active_npy, /*translate:*/SedOptionSet_Iglnpy.Active_npy_long,
            false,
		/*active:*/SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #lineNumber l}, {@link #quiet n}.
     */
    Active_ln(
		/*a:*/SedOptionSet_Iaglnp.Active_aln, /*append:*/SedOptionSet_Iaglnp.Active_aln_long, /*c:*/SedOptionSet_Icglnp.Active_cln, /*change:*/SedOptionSet_Icglnp.Active_cln_long, /*d:*/SedOptionSet_Idglnp.Active_dln, /*delete:*/SedOptionSet_Idglnp.Active_dln_long, /*g:*/Active_gln, /*global:*/Active_gln_long, /*I:*/Active_Iln, /*ignoreCase:*/Active_Iln_long, /*i:*/SedOptionSet_Igilnp.Active_iln, /*insert:*/SedOptionSet_Igilnp.Active_iln_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_lnp, /*print:*/Active_lnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/SedOptionSet_Iglnps.Active_lns, /*substitute:*/SedOptionSet_Iglnps.Active_lns_long, /*y:*/SedOptionSet_Iglnpy.Active_lny, /*translate:*/SedOptionSet_Iglnpy.Active_lny_long,
            true,
		/*active:*/SedOption.lineNumber, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #lineNumber l}, {@link #quiet n}.
     */
    Active_ln_long(
		/*a:*/SedOptionSet_Iaglnp.Active_aln, /*append:*/SedOptionSet_Iaglnp.Active_aln_long, /*c:*/SedOptionSet_Icglnp.Active_cln, /*change:*/SedOptionSet_Icglnp.Active_cln_long, /*d:*/SedOptionSet_Idglnp.Active_dln, /*delete:*/SedOptionSet_Idglnp.Active_dln_long, /*g:*/Active_gln, /*global:*/Active_gln_long, /*I:*/Active_Iln, /*ignoreCase:*/Active_Iln_long, /*i:*/SedOptionSet_Igilnp.Active_iln, /*insert:*/SedOptionSet_Igilnp.Active_iln_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_lnp, /*print:*/Active_lnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/SedOptionSet_Iglnps.Active_lns, /*substitute:*/SedOptionSet_Iglnps.Active_lns_long, /*y:*/SedOptionSet_Iglnpy.Active_lny, /*translate:*/SedOptionSet_Iglnpy.Active_lny_long,
            false,
		/*active:*/SedOption.lineNumber, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #quiet n}.
     */
    Active_In(
		/*a:*/SedOptionSet_Iaglnp.Active_Ian, /*append:*/SedOptionSet_Iaglnp.Active_Ian_long, /*c:*/SedOptionSet_Icglnp.Active_Icn, /*change:*/SedOptionSet_Icglnp.Active_Icn_long, /*d:*/SedOptionSet_Idglnp.Active_Idn, /*delete:*/SedOptionSet_Idglnp.Active_Idn_long, /*g:*/Active_Ign, /*global:*/Active_Ign_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/SedOptionSet_Igilnp.Active_Iin, /*insert:*/SedOptionSet_Igilnp.Active_Iin_long, /*l:*/Active_Iln, /*lineNumber:*/Active_Iln_long, /*p:*/Active_Inp, /*print:*/Active_Inp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/SedOptionSet_Iglnps.Active_Ins, /*substitute:*/SedOptionSet_Iglnps.Active_Ins_long, /*y:*/SedOptionSet_Iglnpy.Active_Iny, /*translate:*/SedOptionSet_Iglnpy.Active_Iny_long,
            true,
		/*active:*/SedOption.ignoreCase, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #quiet n}.
     */
    Active_In_long(
		/*a:*/SedOptionSet_Iaglnp.Active_Ian, /*append:*/SedOptionSet_Iaglnp.Active_Ian_long, /*c:*/SedOptionSet_Icglnp.Active_Icn, /*change:*/SedOptionSet_Icglnp.Active_Icn_long, /*d:*/SedOptionSet_Idglnp.Active_Idn, /*delete:*/SedOptionSet_Idglnp.Active_Idn_long, /*g:*/Active_Ign, /*global:*/Active_Ign_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/SedOptionSet_Igilnp.Active_Iin, /*insert:*/SedOptionSet_Igilnp.Active_Iin_long, /*l:*/Active_Iln, /*lineNumber:*/Active_Iln_long, /*p:*/Active_Inp, /*print:*/Active_Inp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/SedOptionSet_Iglnps.Active_Ins, /*substitute:*/SedOptionSet_Iglnps.Active_Ins_long, /*y:*/SedOptionSet_Iglnpy.Active_Iny, /*translate:*/SedOptionSet_Iglnpy.Active_Iny_long,
            false,
		/*active:*/SedOption.ignoreCase, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #print p}.
     */
    Active_gp(
		/*a:*/SedOptionSet_Iaglnp.Active_agp, /*append:*/SedOptionSet_Iaglnp.Active_agp_long, /*c:*/SedOptionSet_Icglnp.Active_cgp, /*change:*/SedOptionSet_Icglnp.Active_cgp_long, /*d:*/SedOptionSet_Idglnp.Active_dgp, /*delete:*/SedOptionSet_Idglnp.Active_dgp_long, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Igp, /*ignoreCase:*/Active_Igp_long, /*i:*/SedOptionSet_Igilnp.Active_gip, /*insert:*/SedOptionSet_Igilnp.Active_gip_long, /*l:*/Active_glp, /*lineNumber:*/Active_glp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_gnp, /*quiet:*/Active_gnp_long, /*s:*/SedOptionSet_Iglnps.Active_gps, /*substitute:*/SedOptionSet_Iglnps.Active_gps_long, /*y:*/SedOptionSet_Iglnpy.Active_gpy, /*translate:*/SedOptionSet_Iglnpy.Active_gpy_long,
            true,
		/*active:*/SedOption.global, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #print p}.
     */
    Active_gp_long(
		/*a:*/SedOptionSet_Iaglnp.Active_agp, /*append:*/SedOptionSet_Iaglnp.Active_agp_long, /*c:*/SedOptionSet_Icglnp.Active_cgp, /*change:*/SedOptionSet_Icglnp.Active_cgp_long, /*d:*/SedOptionSet_Idglnp.Active_dgp, /*delete:*/SedOptionSet_Idglnp.Active_dgp_long, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Igp, /*ignoreCase:*/Active_Igp_long, /*i:*/SedOptionSet_Igilnp.Active_gip, /*insert:*/SedOptionSet_Igilnp.Active_gip_long, /*l:*/Active_glp, /*lineNumber:*/Active_glp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_gnp, /*quiet:*/Active_gnp_long, /*s:*/SedOptionSet_Iglnps.Active_gps, /*substitute:*/SedOptionSet_Iglnps.Active_gps_long, /*y:*/SedOptionSet_Iglnpy.Active_gpy, /*translate:*/SedOptionSet_Iglnpy.Active_gpy_long,
            false,
		/*active:*/SedOption.global, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #lineNumber l}.
     */
    Active_gl(
		/*a:*/SedOptionSet_Iaglnp.Active_agl, /*append:*/SedOptionSet_Iaglnp.Active_agl_long, /*c:*/SedOptionSet_Icglnp.Active_cgl, /*change:*/SedOptionSet_Icglnp.Active_cgl_long, /*d:*/SedOptionSet_Idglnp.Active_dgl, /*delete:*/SedOptionSet_Idglnp.Active_dgl_long, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Igl, /*ignoreCase:*/Active_Igl_long, /*i:*/SedOptionSet_Igilnp.Active_gil, /*insert:*/SedOptionSet_Igilnp.Active_gil_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_glp, /*print:*/Active_glp_long, /*n:*/Active_gln, /*quiet:*/Active_gln_long, /*s:*/SedOptionSet_Iglnps.Active_gls, /*substitute:*/SedOptionSet_Iglnps.Active_gls_long, /*y:*/SedOptionSet_Iglnpy.Active_gly, /*translate:*/SedOptionSet_Iglnpy.Active_gly_long,
            true,
		/*active:*/SedOption.global, SedOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #lineNumber l}.
     */
    Active_gl_long(
		/*a:*/SedOptionSet_Iaglnp.Active_agl, /*append:*/SedOptionSet_Iaglnp.Active_agl_long, /*c:*/SedOptionSet_Icglnp.Active_cgl, /*change:*/SedOptionSet_Icglnp.Active_cgl_long, /*d:*/SedOptionSet_Idglnp.Active_dgl, /*delete:*/SedOptionSet_Idglnp.Active_dgl_long, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Igl, /*ignoreCase:*/Active_Igl_long, /*i:*/SedOptionSet_Igilnp.Active_gil, /*insert:*/SedOptionSet_Igilnp.Active_gil_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_glp, /*print:*/Active_glp_long, /*n:*/Active_gln, /*quiet:*/Active_gln_long, /*s:*/SedOptionSet_Iglnps.Active_gls, /*substitute:*/SedOptionSet_Iglnps.Active_gls_long, /*y:*/SedOptionSet_Iglnpy.Active_gly, /*translate:*/SedOptionSet_Iglnpy.Active_gly_long,
            false,
		/*active:*/SedOption.global, SedOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}.
     */
    Active_Ig(
		/*a:*/SedOptionSet_Iaglnp.Active_Iag, /*append:*/SedOptionSet_Iaglnp.Active_Iag_long, /*c:*/SedOptionSet_Icglnp.Active_Icg, /*change:*/SedOptionSet_Icglnp.Active_Icg_long, /*d:*/SedOptionSet_Idglnp.Active_Idg, /*delete:*/SedOptionSet_Idglnp.Active_Idg_long, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/SedOptionSet_Igilnp.Active_Igi, /*insert:*/SedOptionSet_Igilnp.Active_Igi_long, /*l:*/Active_Igl, /*lineNumber:*/Active_Igl_long, /*p:*/Active_Igp, /*print:*/Active_Igp_long, /*n:*/Active_Ign, /*quiet:*/Active_Ign_long, /*s:*/SedOptionSet_Iglnps.Active_Igs, /*substitute:*/SedOptionSet_Iglnps.Active_Igs_long, /*y:*/SedOptionSet_Iglnpy.Active_Igy, /*translate:*/SedOptionSet_Iglnpy.Active_Igy_long,
            true,
		/*active:*/SedOption.global, SedOption.ignoreCase
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}.
     */
    Active_Ig_long(
		/*a:*/SedOptionSet_Iaglnp.Active_Iag, /*append:*/SedOptionSet_Iaglnp.Active_Iag_long, /*c:*/SedOptionSet_Icglnp.Active_Icg, /*change:*/SedOptionSet_Icglnp.Active_Icg_long, /*d:*/SedOptionSet_Idglnp.Active_Idg, /*delete:*/SedOptionSet_Idglnp.Active_Idg_long, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/SedOptionSet_Igilnp.Active_Igi, /*insert:*/SedOptionSet_Igilnp.Active_Igi_long, /*l:*/Active_Igl, /*lineNumber:*/Active_Igl_long, /*p:*/Active_Igp, /*print:*/Active_Igp_long, /*n:*/Active_Ign, /*quiet:*/Active_Ign_long, /*s:*/SedOptionSet_Iglnps.Active_Igs, /*substitute:*/SedOptionSet_Iglnps.Active_Igs_long, /*y:*/SedOptionSet_Iglnpy.Active_Igy, /*translate:*/SedOptionSet_Iglnpy.Active_Igy_long,
            false,
		/*active:*/SedOption.global, SedOption.ignoreCase
    ),
    /**
     * Option set with the following active options: {@link #lineNumber l}, {@link #print p}.
     */
    Active_lp(
		/*a:*/SedOptionSet_Iaglnp.Active_alp, /*append:*/SedOptionSet_Iaglnp.Active_alp_long, /*c:*/SedOptionSet_Icglnp.Active_clp, /*change:*/SedOptionSet_Icglnp.Active_clp_long, /*d:*/SedOptionSet_Idglnp.Active_dlp, /*delete:*/SedOptionSet_Idglnp.Active_dlp_long, /*g:*/Active_glp, /*global:*/Active_glp_long, /*I:*/Active_Ilp, /*ignoreCase:*/Active_Ilp_long, /*i:*/SedOptionSet_Igilnp.Active_ilp, /*insert:*/SedOptionSet_Igilnp.Active_ilp_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_lnp, /*quiet:*/Active_lnp_long, /*s:*/SedOptionSet_Iglnps.Active_lps, /*substitute:*/SedOptionSet_Iglnps.Active_lps_long, /*y:*/SedOptionSet_Iglnpy.Active_lpy, /*translate:*/SedOptionSet_Iglnpy.Active_lpy_long,
            true,
		/*active:*/SedOption.lineNumber, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #lineNumber l}, {@link #print p}.
     */
    Active_lp_long(
		/*a:*/SedOptionSet_Iaglnp.Active_alp, /*append:*/SedOptionSet_Iaglnp.Active_alp_long, /*c:*/SedOptionSet_Icglnp.Active_clp, /*change:*/SedOptionSet_Icglnp.Active_clp_long, /*d:*/SedOptionSet_Idglnp.Active_dlp, /*delete:*/SedOptionSet_Idglnp.Active_dlp_long, /*g:*/Active_glp, /*global:*/Active_glp_long, /*I:*/Active_Ilp, /*ignoreCase:*/Active_Ilp_long, /*i:*/SedOptionSet_Igilnp.Active_ilp, /*insert:*/SedOptionSet_Igilnp.Active_ilp_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_lnp, /*quiet:*/Active_lnp_long, /*s:*/SedOptionSet_Iglnps.Active_lps, /*substitute:*/SedOptionSet_Iglnps.Active_lps_long, /*y:*/SedOptionSet_Iglnpy.Active_lpy, /*translate:*/SedOptionSet_Iglnpy.Active_lpy_long,
            false,
		/*active:*/SedOption.lineNumber, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #print p}.
     */
    Active_Ip(
		/*a:*/SedOptionSet_Iaglnp.Active_Iap, /*append:*/SedOptionSet_Iaglnp.Active_Iap_long, /*c:*/SedOptionSet_Icglnp.Active_Icp, /*change:*/SedOptionSet_Icglnp.Active_Icp_long, /*d:*/SedOptionSet_Idglnp.Active_Idp, /*delete:*/SedOptionSet_Idglnp.Active_Idp_long, /*g:*/Active_Igp, /*global:*/Active_Igp_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/SedOptionSet_Igilnp.Active_Iip, /*insert:*/SedOptionSet_Igilnp.Active_Iip_long, /*l:*/Active_Ilp, /*lineNumber:*/Active_Ilp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Inp, /*quiet:*/Active_Inp_long, /*s:*/SedOptionSet_Iglnps.Active_Ips, /*substitute:*/SedOptionSet_Iglnps.Active_Ips_long, /*y:*/SedOptionSet_Iglnpy.Active_Ipy, /*translate:*/SedOptionSet_Iglnpy.Active_Ipy_long,
            true,
		/*active:*/SedOption.ignoreCase, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #print p}.
     */
    Active_Ip_long(
		/*a:*/SedOptionSet_Iaglnp.Active_Iap, /*append:*/SedOptionSet_Iaglnp.Active_Iap_long, /*c:*/SedOptionSet_Icglnp.Active_Icp, /*change:*/SedOptionSet_Icglnp.Active_Icp_long, /*d:*/SedOptionSet_Idglnp.Active_Idp, /*delete:*/SedOptionSet_Idglnp.Active_Idp_long, /*g:*/Active_Igp, /*global:*/Active_Igp_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/SedOptionSet_Igilnp.Active_Iip, /*insert:*/SedOptionSet_Igilnp.Active_Iip_long, /*l:*/Active_Ilp, /*lineNumber:*/Active_Ilp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Inp, /*quiet:*/Active_Inp_long, /*s:*/SedOptionSet_Iglnps.Active_Ips, /*substitute:*/SedOptionSet_Iglnps.Active_Ips_long, /*y:*/SedOptionSet_Iglnpy.Active_Ipy, /*translate:*/SedOptionSet_Iglnpy.Active_Ipy_long,
            false,
		/*active:*/SedOption.ignoreCase, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #lineNumber l}.
     */
    Active_Il(
		/*a:*/SedOptionSet_Iaglnp.Active_Ial, /*append:*/SedOptionSet_Iaglnp.Active_Ial_long, /*c:*/SedOptionSet_Icglnp.Active_Icl, /*change:*/SedOptionSet_Icglnp.Active_Icl_long, /*d:*/SedOptionSet_Idglnp.Active_Idl, /*delete:*/SedOptionSet_Idglnp.Active_Idl_long, /*g:*/Active_Igl, /*global:*/Active_Igl_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/SedOptionSet_Igilnp.Active_Iil, /*insert:*/SedOptionSet_Igilnp.Active_Iil_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Ilp, /*print:*/Active_Ilp_long, /*n:*/Active_Iln, /*quiet:*/Active_Iln_long, /*s:*/SedOptionSet_Iglnps.Active_Ils, /*substitute:*/SedOptionSet_Iglnps.Active_Ils_long, /*y:*/SedOptionSet_Iglnpy.Active_Ily, /*translate:*/SedOptionSet_Iglnpy.Active_Ily_long,
            true,
		/*active:*/SedOption.ignoreCase, SedOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #lineNumber l}.
     */
    Active_Il_long(
		/*a:*/SedOptionSet_Iaglnp.Active_Ial, /*append:*/SedOptionSet_Iaglnp.Active_Ial_long, /*c:*/SedOptionSet_Icglnp.Active_Icl, /*change:*/SedOptionSet_Icglnp.Active_Icl_long, /*d:*/SedOptionSet_Idglnp.Active_Idl, /*delete:*/SedOptionSet_Idglnp.Active_Idl_long, /*g:*/Active_Igl, /*global:*/Active_Igl_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/SedOptionSet_Igilnp.Active_Iil, /*insert:*/SedOptionSet_Igilnp.Active_Iil_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Ilp, /*print:*/Active_Ilp_long, /*n:*/Active_Iln, /*quiet:*/Active_Iln_long, /*s:*/SedOptionSet_Iglnps.Active_Ils, /*substitute:*/SedOptionSet_Iglnps.Active_Ils_long, /*y:*/SedOptionSet_Iglnpy.Active_Ily, /*translate:*/SedOptionSet_Iglnpy.Active_Ily_long,
            false,
		/*active:*/SedOption.ignoreCase, SedOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #quiet n}.
     */
    Active_n(
		/*a:*/SedOptionSet_Iaglnp.Active_an, /*append:*/SedOptionSet_Iaglnp.Active_an_long, /*c:*/SedOptionSet_Icglnp.Active_cn, /*change:*/SedOptionSet_Icglnp.Active_cn_long, /*d:*/SedOptionSet_Idglnp.Active_dn, /*delete:*/SedOptionSet_Idglnp.Active_dn_long, /*g:*/Active_gn, /*global:*/Active_gn_long, /*I:*/Active_In, /*ignoreCase:*/Active_In_long, /*i:*/SedOptionSet_Igilnp.Active_in, /*insert:*/SedOptionSet_Igilnp.Active_in_long, /*l:*/Active_ln, /*lineNumber:*/Active_ln_long, /*p:*/Active_np, /*print:*/Active_np_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/SedOptionSet_Iglnps.Active_ns, /*substitute:*/SedOptionSet_Iglnps.Active_ns_long, /*y:*/SedOptionSet_Iglnpy.Active_ny, /*translate:*/SedOptionSet_Iglnpy.Active_ny_long,
            true,
		/*active:*/SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #quiet n}.
     */
    Active_n_long(
		/*a:*/SedOptionSet_Iaglnp.Active_an, /*append:*/SedOptionSet_Iaglnp.Active_an_long, /*c:*/SedOptionSet_Icglnp.Active_cn, /*change:*/SedOptionSet_Icglnp.Active_cn_long, /*d:*/SedOptionSet_Idglnp.Active_dn, /*delete:*/SedOptionSet_Idglnp.Active_dn_long, /*g:*/Active_gn, /*global:*/Active_gn_long, /*I:*/Active_In, /*ignoreCase:*/Active_In_long, /*i:*/SedOptionSet_Igilnp.Active_in, /*insert:*/SedOptionSet_Igilnp.Active_in_long, /*l:*/Active_ln, /*lineNumber:*/Active_ln_long, /*p:*/Active_np, /*print:*/Active_np_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/SedOptionSet_Iglnps.Active_ns, /*substitute:*/SedOptionSet_Iglnps.Active_ns_long, /*y:*/SedOptionSet_Iglnpy.Active_ny, /*translate:*/SedOptionSet_Iglnpy.Active_ny_long,
            false,
		/*active:*/SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #global g}.
     */
    Active_g(
		/*a:*/SedOptionSet_Iaglnp.Active_ag, /*append:*/SedOptionSet_Iaglnp.Active_ag_long, /*c:*/SedOptionSet_Icglnp.Active_cg, /*change:*/SedOptionSet_Icglnp.Active_cg_long, /*d:*/SedOptionSet_Idglnp.Active_dg, /*delete:*/SedOptionSet_Idglnp.Active_dg_long, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Ig, /*ignoreCase:*/Active_Ig_long, /*i:*/SedOptionSet_Igilnp.Active_gi, /*insert:*/SedOptionSet_Igilnp.Active_gi_long, /*l:*/Active_gl, /*lineNumber:*/Active_gl_long, /*p:*/Active_gp, /*print:*/Active_gp_long, /*n:*/Active_gn, /*quiet:*/Active_gn_long, /*s:*/SedOptionSet_Iglnps.Active_gs, /*substitute:*/SedOptionSet_Iglnps.Active_gs_long, /*y:*/SedOptionSet_Iglnpy.Active_gy, /*translate:*/SedOptionSet_Iglnpy.Active_gy_long,
            true,
		/*active:*/SedOption.global
    ),
    /**
     * Option set with the following active options: {@link #global g}.
     */
    Active_g_long(
		/*a:*/SedOptionSet_Iaglnp.Active_ag, /*append:*/SedOptionSet_Iaglnp.Active_ag_long, /*c:*/SedOptionSet_Icglnp.Active_cg, /*change:*/SedOptionSet_Icglnp.Active_cg_long, /*d:*/SedOptionSet_Idglnp.Active_dg, /*delete:*/SedOptionSet_Idglnp.Active_dg_long, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Ig, /*ignoreCase:*/Active_Ig_long, /*i:*/SedOptionSet_Igilnp.Active_gi, /*insert:*/SedOptionSet_Igilnp.Active_gi_long, /*l:*/Active_gl, /*lineNumber:*/Active_gl_long, /*p:*/Active_gp, /*print:*/Active_gp_long, /*n:*/Active_gn, /*quiet:*/Active_gn_long, /*s:*/SedOptionSet_Iglnps.Active_gs, /*substitute:*/SedOptionSet_Iglnps.Active_gs_long, /*y:*/SedOptionSet_Iglnpy.Active_gy, /*translate:*/SedOptionSet_Iglnpy.Active_gy_long,
            false,
		/*active:*/SedOption.global
    ),
    /**
     * Option set with the following active options: {@link #print p}.
     */
    Active_p(
		/*a:*/SedOptionSet_Iaglnp.Active_ap, /*append:*/SedOptionSet_Iaglnp.Active_ap_long, /*c:*/SedOptionSet_Icglnp.Active_cp, /*change:*/SedOptionSet_Icglnp.Active_cp_long, /*d:*/SedOptionSet_Idglnp.Active_dp, /*delete:*/SedOptionSet_Idglnp.Active_dp_long, /*g:*/Active_gp, /*global:*/Active_gp_long, /*I:*/Active_Ip, /*ignoreCase:*/Active_Ip_long, /*i:*/SedOptionSet_Igilnp.Active_ip, /*insert:*/SedOptionSet_Igilnp.Active_ip_long, /*l:*/Active_lp, /*lineNumber:*/Active_lp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_np, /*quiet:*/Active_np_long, /*s:*/SedOptionSet_Iglnps.Active_ps, /*substitute:*/SedOptionSet_Iglnps.Active_ps_long, /*y:*/SedOptionSet_Iglnpy.Active_py, /*translate:*/SedOptionSet_Iglnpy.Active_py_long,
            true,
		/*active:*/SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #print p}.
     */
    Active_p_long(
		/*a:*/SedOptionSet_Iaglnp.Active_ap, /*append:*/SedOptionSet_Iaglnp.Active_ap_long, /*c:*/SedOptionSet_Icglnp.Active_cp, /*change:*/SedOptionSet_Icglnp.Active_cp_long, /*d:*/SedOptionSet_Idglnp.Active_dp, /*delete:*/SedOptionSet_Idglnp.Active_dp_long, /*g:*/Active_gp, /*global:*/Active_gp_long, /*I:*/Active_Ip, /*ignoreCase:*/Active_Ip_long, /*i:*/SedOptionSet_Igilnp.Active_ip, /*insert:*/SedOptionSet_Igilnp.Active_ip_long, /*l:*/Active_lp, /*lineNumber:*/Active_lp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_np, /*quiet:*/Active_np_long, /*s:*/SedOptionSet_Iglnps.Active_ps, /*substitute:*/SedOptionSet_Iglnps.Active_ps_long, /*y:*/SedOptionSet_Iglnpy.Active_py, /*translate:*/SedOptionSet_Iglnpy.Active_py_long,
            false,
		/*active:*/SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #lineNumber l}.
     */
    Active_l(
		/*a:*/SedOptionSet_Iaglnp.Active_al, /*append:*/SedOptionSet_Iaglnp.Active_al_long, /*c:*/SedOptionSet_Icglnp.Active_cl, /*change:*/SedOptionSet_Icglnp.Active_cl_long, /*d:*/SedOptionSet_Idglnp.Active_dl, /*delete:*/SedOptionSet_Idglnp.Active_dl_long, /*g:*/Active_gl, /*global:*/Active_gl_long, /*I:*/Active_Il, /*ignoreCase:*/Active_Il_long, /*i:*/SedOptionSet_Igilnp.Active_il, /*insert:*/SedOptionSet_Igilnp.Active_il_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_lp, /*print:*/Active_lp_long, /*n:*/Active_ln, /*quiet:*/Active_ln_long, /*s:*/SedOptionSet_Iglnps.Active_ls, /*substitute:*/SedOptionSet_Iglnps.Active_ls_long, /*y:*/SedOptionSet_Iglnpy.Active_ly, /*translate:*/SedOptionSet_Iglnpy.Active_ly_long,
            true,
		/*active:*/SedOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #lineNumber l}.
     */
    Active_l_long(
		/*a:*/SedOptionSet_Iaglnp.Active_al, /*append:*/SedOptionSet_Iaglnp.Active_al_long, /*c:*/SedOptionSet_Icglnp.Active_cl, /*change:*/SedOptionSet_Icglnp.Active_cl_long, /*d:*/SedOptionSet_Idglnp.Active_dl, /*delete:*/SedOptionSet_Idglnp.Active_dl_long, /*g:*/Active_gl, /*global:*/Active_gl_long, /*I:*/Active_Il, /*ignoreCase:*/Active_Il_long, /*i:*/SedOptionSet_Igilnp.Active_il, /*insert:*/SedOptionSet_Igilnp.Active_il_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_lp, /*print:*/Active_lp_long, /*n:*/Active_ln, /*quiet:*/Active_ln_long, /*s:*/SedOptionSet_Iglnps.Active_ls, /*substitute:*/SedOptionSet_Iglnps.Active_ls_long, /*y:*/SedOptionSet_Iglnpy.Active_ly, /*translate:*/SedOptionSet_Iglnpy.Active_ly_long,
            false,
		/*active:*/SedOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}.
     */
    Active_I(
		/*a:*/SedOptionSet_Iaglnp.Active_Ia, /*append:*/SedOptionSet_Iaglnp.Active_Ia_long, /*c:*/SedOptionSet_Icglnp.Active_Ic, /*change:*/SedOptionSet_Icglnp.Active_Ic_long, /*d:*/SedOptionSet_Idglnp.Active_Id, /*delete:*/SedOptionSet_Idglnp.Active_Id_long, /*g:*/Active_Ig, /*global:*/Active_Ig_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/SedOptionSet_Igilnp.Active_Ii, /*insert:*/SedOptionSet_Igilnp.Active_Ii_long, /*l:*/Active_Il, /*lineNumber:*/Active_Il_long, /*p:*/Active_Ip, /*print:*/Active_Ip_long, /*n:*/Active_In, /*quiet:*/Active_In_long, /*s:*/SedOptionSet_Iglnps.Active_Is, /*substitute:*/SedOptionSet_Iglnps.Active_Is_long, /*y:*/SedOptionSet_Iglnpy.Active_Iy, /*translate:*/SedOptionSet_Iglnpy.Active_Iy_long,
            true,
		/*active:*/SedOption.ignoreCase
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}.
     */
    Active_I_long(
		/*a:*/SedOptionSet_Iaglnp.Active_Ia, /*append:*/SedOptionSet_Iaglnp.Active_Ia_long, /*c:*/SedOptionSet_Icglnp.Active_Ic, /*change:*/SedOptionSet_Icglnp.Active_Ic_long, /*d:*/SedOptionSet_Idglnp.Active_Id, /*delete:*/SedOptionSet_Idglnp.Active_Id_long, /*g:*/Active_Ig, /*global:*/Active_Ig_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/SedOptionSet_Igilnp.Active_Ii, /*insert:*/SedOptionSet_Igilnp.Active_Ii_long, /*l:*/Active_Il, /*lineNumber:*/Active_Il_long, /*p:*/Active_Ip, /*print:*/Active_Ip_long, /*n:*/Active_In, /*quiet:*/Active_In_long, /*s:*/SedOptionSet_Iglnps.Active_Is, /*substitute:*/SedOptionSet_Iglnps.Active_Is_long, /*y:*/SedOptionSet_Iglnpy.Active_Iy, /*translate:*/SedOptionSet_Iglnpy.Active_Iy_long,
            false,
		/*active:*/SedOption.ignoreCase
    );

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
     * Option {@code "-c"}: Write string2 as a separate line instead of the matched line.
     * <p>
     * The option {@code "-c"} is equivalent to the {@code "--}{@link #change change}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-c"}. If the option {@code "-c"}
     * is already set, the field {@code c} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final SedOptionSet_Icglnp c;
    /**
     * Option {@code "--change"}: Write string2 as a separate line instead of the matched line.
     * <p>
     * The option {@code "--change"} is equivalent to the {@code "-}{@link #c c}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--change"}. If the option {@code "--change"}
     * is already set, the field {@code change} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final SedOptionSet_Icglnp change;
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
     * rather than just the first one.
     * <p>
     * (This option is ignored if the occurrence operand is specified).
     * <p>
     * The option {@code "-g"} is equivalent to the {@code "--}{@link #global global}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-g"}. If the option {@code "-g"}
     * is already set, the field {@code g} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final SedOptionSet_Iacdgilnpsy g;
    /**
     * Option {@code "--global"}: Globally substitute for all non-overlapping instances of the regexp
     * rather than just the first one.
     * <p>
     * (This option is ignored if the occurrence operand is specified).
     * <p>
     * The option {@code "--global"} is equivalent to the {@code "-}{@link #g g}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--global"}. If the option {@code "--global"}
     * is already set, the field {@code global} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final SedOptionSet_Iacdgilnpsy global;
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
    public final SedOptionSet_Iacdgilnpsy I;
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
    public final SedOptionSet_Iacdgilnpsy ignoreCase;
    /**
     * Option {@code "-i"}: Insert string2 as a separate line before the matched line.
     * <p>
     * The option {@code "-i"} is equivalent to the {@code "--}{@link #insert insert}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-i"}. If the option {@code "-i"}
     * is already set, the field {@code i} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final SedOptionSet_Igilnp i;
    /**
     * Option {@code "--insert"}: Insert string2 as a separate line before the matched line.
     * <p>
     * The option {@code "--insert"} is equivalent to the {@code "-}{@link #i i}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--insert"}. If the option {@code "--insert"}
     * is already set, the field {@code insert} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final SedOptionSet_Igilnp insert;
    /**
     * Option {@code "-l"}: Writes the current line number on a separate line to the standard
     * output.
     * <p>
     * The option {@code "-l"} is equivalent to the {@code "--}{@link #lineNumber lineNumber}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-l"}. If the option {@code "-l"}
     * is already set, the field {@code l} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final SedOptionSet_Iacdgilnpsy l;
    /**
     * Option {@code "--lineNumber"}: Writes the current line number on a separate line to the standard
     * output.
     * <p>
     * The option {@code "--lineNumber"} is equivalent to the {@code "-}{@link #l l}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--lineNumber"}. If the option {@code "--lineNumber"}
     * is already set, the field {@code lineNumber} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final SedOptionSet_Iacdgilnpsy lineNumber;
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
    public final SedOptionSet_Iacdgilnpsy p;
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
    public final SedOptionSet_Iacdgilnpsy print;
    /**
     * Option {@code "-n"}: Suppress the default output (in which each line, after it is
     * examined for editing, is written to standard output). Only lines
     * explicitly selected for output are written.
     * <p>
     * The option {@code "-n"} is equivalent to the {@code "--}{@link #quiet quiet}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-n"}. If the option {@code "-n"}
     * is already set, the field {@code n} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final SedOptionSet_Iacdgilnpsy n;
    /**
     * Option {@code "--quiet"}: Suppress the default output (in which each line, after it is
     * examined for editing, is written to standard output). Only lines
     * explicitly selected for output are written.
     * <p>
     * The option {@code "--quiet"} is equivalent to the {@code "-}{@link #n n}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--quiet"}. If the option {@code "--quiet"}
     * is already set, the field {@code quiet} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final SedOptionSet_Iacdgilnpsy quiet;
    /**
     * Option {@code "-s"}: Substitutes the replacement string for instances of the regexp in
     * the matched line.
     * <p>
     * An ampersand ('&') appearing in the replacement is be replaced
     * by the line matching the regexp. The characters "\n", where n is a
     * digit, are replaced by the text matched by the corresponding
     * backreference expression.  The special meaning of '&' and "\n"
     * in this context can be suppressed by preceding it by a backslash.
     * <p>
     * A line can be split by substituting a newline ('\n') into it.
     * <p>
     * A substitution is considered to have been performed even if the
     * replacement string is identical to the string that it replaces.
     * <p>
     * The option {@code "-s"} is equivalent to the {@code "--}{@link #substitute substitute}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-s"}. If the option {@code "-s"}
     * is already set, the field {@code s} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final SedOptionSet_Iglnps s;
    /**
     * Option {@code "--substitute"}: Substitutes the replacement string for instances of the regexp in
     * the matched line.
     * <p>
     * An ampersand ('&') appearing in the replacement is be replaced
     * by the line matching the regexp. The characters "\n", where n is a
     * digit, are replaced by the text matched by the corresponding
     * backreference expression.  The special meaning of '&' and "\n"
     * in this context can be suppressed by preceding it by a backslash.
     * <p>
     * A line can be split by substituting a newline ('\n') into it.
     * <p>
     * A substitution is considered to have been performed even if the
     * replacement string is identical to the string that it replaces.
     * <p>
     * The option {@code "--substitute"} is equivalent to the {@code "-}{@link #s s}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--substitute"}. If the option {@code "--substitute"}
     * is already set, the field {@code substitute} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final SedOptionSet_Iglnps substitute;
    /**
     * Option {@code "-y"}: Replace all occurrences of characters in string1 with the
     * corresponding characters in string2. If the number of characters in
     * the two strings are not equal, or if any of the characters in
     * string1 appear more than once, the results are undefined.
     * <p>
     * The option {@code "-y"} is equivalent to the {@code "--}{@link #translate translate}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-y"}. If the option {@code "-y"}
     * is already set, the field {@code y} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final SedOptionSet_Iglnpy y;
    /**
     * Option {@code "--translate"}: Replace all occurrences of characters in string1 with the
     * corresponding characters in string2. If the number of characters in
     * the two strings are not equal, or if any of the characters in
     * string1 appear more than once, the results are undefined.
     * <p>
     * The option {@code "--translate"} is equivalent to the {@code "-}{@link #y y}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--translate"}. If the option {@code "--translate"}
     * is already set, the field {@code translate} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final SedOptionSet_Iglnpy translate;
    private final boolean useAcronym;
    private final EnumSet<SedOption> options;
    private SedOptionSet_Iacdgilnpsy(
            SedOptionSet_Iaglnp a, SedOptionSet_Iaglnp append, SedOptionSet_Icglnp c, SedOptionSet_Icglnp change, SedOptionSet_Idglnp d, SedOptionSet_Idglnp delete, SedOptionSet_Iacdgilnpsy g, SedOptionSet_Iacdgilnpsy global, SedOptionSet_Iacdgilnpsy I, SedOptionSet_Iacdgilnpsy ignoreCase, SedOptionSet_Igilnp i, SedOptionSet_Igilnp insert, SedOptionSet_Iacdgilnpsy l, SedOptionSet_Iacdgilnpsy lineNumber, SedOptionSet_Iacdgilnpsy p, SedOptionSet_Iacdgilnpsy print, SedOptionSet_Iacdgilnpsy n, SedOptionSet_Iacdgilnpsy quiet, SedOptionSet_Iglnps s, SedOptionSet_Iglnps substitute, SedOptionSet_Iglnpy y, SedOptionSet_Iglnpy translate,
            boolean useAcronym,
            SedOption... activeOptions
    ) {
        this.a = notNull(a);
        this.append = notNull(append);
        this.c = notNull(c);
        this.change = notNull(change);
        this.d = notNull(d);
        this.delete = notNull(delete);
        this.g = g == null ? this : g;
        this.global = global == null ? this : global;
        this.I = I == null ? this : I;
        this.ignoreCase = ignoreCase == null ? this : ignoreCase;
        this.i = notNull(i);
        this.insert = notNull(insert);
        this.l = l == null ? this : l;
        this.lineNumber = lineNumber == null ? this : lineNumber;
        this.p = p == null ? this : p;
        this.print = print == null ? this : print;
        this.n = n == null ? this : n;
        this.quiet = quiet == null ? this : quiet;
        this.s = notNull(s);
        this.substitute = notNull(substitute);
        this.y = notNull(y);
        this.translate = notNull(translate);
        this.useAcronym = useAcronym;
        this.options = activeOptions.length == 0 ? EnumSet.noneOf(SedOption.class) : EnumSet.copyOf(Arrays.asList(activeOptions));
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
        if(value != null) {
            return value;
        }
        throw new NullPointerException();
    }

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
     *    SedOptionSet_Iacdgilnpsy.append.c;
     * </pre>
     * uses acronyms, that is, this method always returns true for the above
     * set.
     * <p>
     * On the other hand, long option names are used and this method always
     * returns false for the set
     * <pre>
     *    SedOptionSet_Iacdgilnpsy.a.change;
     * </pre>
     * <p>
     * Note that a repeated option is <i>not</i> treated as the last set option.
     * For instance, the first and last option of the following set are
     * equivalent and acronyms are used:
     * <pre>
     *    SedOptionSet_Iacdgilnpsy.a.c.append;
     * </pre>
     * <p>
     * This method always returns true for the empty set with no active options.
     *
     * @param option the option of interest, has no impact on the result returned
     *               by this method
     * @return true if option acronyms should be used for string representations
     * of any option of this option set
     */
    @Override
    public boolean useAcronymFor(SedOption option) {
        return useAcronym;
    }
}
