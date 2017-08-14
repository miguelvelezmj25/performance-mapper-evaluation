package org.unix4j.unix.sed;

import org.unix4j.option.Option;
import org.unix4j.unix.Sed;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Option sets for the {@link Sed sed} command with
 * the following options: {@link #g g}, {@link #I I}, {@link #i i}, {@link #l l}, {@link #p p}, {@link #n n}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Sed#Options} should be used instead to specify command
 * options. See also {@link org.unix4j.unix.sed.SedOptions} for more information.
 */
public enum SedOptionSet_Igilnp implements SedOptions {
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #insert i}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}.
     */
    Active_Igilnp(
        /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            true,
        /*active:*/SedOption.global, SedOption.ignoreCase, SedOption.insert, SedOption.lineNumber, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #insert i}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}.
     */
    Active_Igilnp_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            false,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.insert, SedOption.lineNumber, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #insert i}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}.
     */
    Active_gilnp(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Igilnp, /*ignoreCase:*/Active_Igilnp_long, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            true,
		/*active:*/SedOption.global, SedOption.insert, SedOption.lineNumber, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #insert i}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}.
     */
    Active_gilnp_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Igilnp, /*ignoreCase:*/Active_Igilnp_long, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            false,
		/*active:*/SedOption.global, SedOption.insert, SedOption.lineNumber, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #insert i}, {@link #print p}, {@link #quiet n}.
     */
    Active_Iginp(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/Active_Igilnp, /*lineNumber:*/Active_Igilnp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            true,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.insert, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #insert i}, {@link #print p}, {@link #quiet n}.
     */
    Active_Iginp_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/Active_Igilnp, /*lineNumber:*/Active_Igilnp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            false,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.insert, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #insert i}, {@link #lineNumber l}, {@link #quiet n}.
     */
    Active_Igiln(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Igilnp, /*print:*/Active_Igilnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            true,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.insert, SedOption.lineNumber, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #insert i}, {@link #lineNumber l}, {@link #quiet n}.
     */
    Active_Igiln_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Igilnp, /*print:*/Active_Igilnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            false,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.insert, SedOption.lineNumber, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #insert i}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}.
     */
    Active_Iilnp(
		/*g:*/Active_Igilnp, /*global:*/Active_Igilnp_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            true,
		/*active:*/SedOption.ignoreCase, SedOption.insert, SedOption.lineNumber, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #insert i}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}.
     */
    Active_Iilnp_long(
		/*g:*/Active_Igilnp, /*global:*/Active_Igilnp_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            false,
		/*active:*/SedOption.ignoreCase, SedOption.insert, SedOption.lineNumber, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #insert i}, {@link #lineNumber l}, {@link #print p}.
     */
    Active_Igilp(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Igilnp, /*quiet:*/Active_Igilnp_long,
            true,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.insert, SedOption.lineNumber, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #insert i}, {@link #lineNumber l}, {@link #print p}.
     */
    Active_Igilp_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Igilnp, /*quiet:*/Active_Igilnp_long,
            false,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.insert, SedOption.lineNumber, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #insert i}, {@link #print p}, {@link #quiet n}.
     */
    Active_ginp(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Iginp, /*ignoreCase:*/Active_Iginp_long, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/Active_gilnp, /*lineNumber:*/Active_gilnp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            true,
		/*active:*/SedOption.global, SedOption.insert, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #insert i}, {@link #print p}, {@link #quiet n}.
     */
    Active_ginp_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Iginp, /*ignoreCase:*/Active_Iginp_long, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/Active_gilnp, /*lineNumber:*/Active_gilnp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            false,
		/*active:*/SedOption.global, SedOption.insert, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #insert i}, {@link #lineNumber l}, {@link #quiet n}.
     */
    Active_giln(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Igiln, /*ignoreCase:*/Active_Igiln_long, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_gilnp, /*print:*/Active_gilnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            true,
		/*active:*/SedOption.global, SedOption.insert, SedOption.lineNumber, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #insert i}, {@link #lineNumber l}, {@link #quiet n}.
     */
    Active_giln_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Igiln, /*ignoreCase:*/Active_Igiln_long, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_gilnp, /*print:*/Active_gilnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            false,
		/*active:*/SedOption.global, SedOption.insert, SedOption.lineNumber, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #insert i}, {@link #quiet n}.
     */
    Active_Igin(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/Active_Igiln, /*lineNumber:*/Active_Igiln_long, /*p:*/Active_Iginp, /*print:*/Active_Iginp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            true,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.insert, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #insert i}, {@link #quiet n}.
     */
    Active_Igin_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/Active_Igiln, /*lineNumber:*/Active_Igiln_long, /*p:*/Active_Iginp, /*print:*/Active_Iginp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            false,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.insert, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #insert i}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}.
     */
    Active_ilnp(
		/*g:*/Active_gilnp, /*global:*/Active_gilnp_long, /*I:*/Active_Iilnp, /*ignoreCase:*/Active_Iilnp_long, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            true,
		/*active:*/SedOption.insert, SedOption.lineNumber, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #insert i}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}.
     */
    Active_ilnp_long(
		/*g:*/Active_gilnp, /*global:*/Active_gilnp_long, /*I:*/Active_Iilnp, /*ignoreCase:*/Active_Iilnp_long, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            false,
		/*active:*/SedOption.insert, SedOption.lineNumber, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #insert i}, {@link #print p}, {@link #quiet n}.
     */
    Active_Iinp(
		/*g:*/Active_Iginp, /*global:*/Active_Iginp_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/Active_Iilnp, /*lineNumber:*/Active_Iilnp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            true,
		/*active:*/SedOption.ignoreCase, SedOption.insert, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #insert i}, {@link #print p}, {@link #quiet n}.
     */
    Active_Iinp_long(
		/*g:*/Active_Iginp, /*global:*/Active_Iginp_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/Active_Iilnp, /*lineNumber:*/Active_Iilnp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            false,
		/*active:*/SedOption.ignoreCase, SedOption.insert, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #insert i}, {@link #lineNumber l}, {@link #quiet n}.
     */
    Active_Iiln(
		/*g:*/Active_Igiln, /*global:*/Active_Igiln_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Iilnp, /*print:*/Active_Iilnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            true,
		/*active:*/SedOption.ignoreCase, SedOption.insert, SedOption.lineNumber, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #insert i}, {@link #lineNumber l}, {@link #quiet n}.
     */
    Active_Iiln_long(
		/*g:*/Active_Igiln, /*global:*/Active_Igiln_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Iilnp, /*print:*/Active_Iilnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            false,
		/*active:*/SedOption.ignoreCase, SedOption.insert, SedOption.lineNumber, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #insert i}, {@link #lineNumber l}, {@link #print p}.
     */
    Active_gilp(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Igilp, /*ignoreCase:*/Active_Igilp_long, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_gilnp, /*quiet:*/Active_gilnp_long,
            true,
		/*active:*/SedOption.global, SedOption.insert, SedOption.lineNumber, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #insert i}, {@link #lineNumber l}, {@link #print p}.
     */
    Active_gilp_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Igilp, /*ignoreCase:*/Active_Igilp_long, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_gilnp, /*quiet:*/Active_gilnp_long,
            false,
		/*active:*/SedOption.global, SedOption.insert, SedOption.lineNumber, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #insert i}, {@link #print p}.
     */
    Active_Igip(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/Active_Igilp, /*lineNumber:*/Active_Igilp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Iginp, /*quiet:*/Active_Iginp_long,
            true,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.insert, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #insert i}, {@link #print p}.
     */
    Active_Igip_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/Active_Igilp, /*lineNumber:*/Active_Igilp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Iginp, /*quiet:*/Active_Iginp_long,
            false,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.insert, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #insert i}, {@link #lineNumber l}.
     */
    Active_Igil(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Igilp, /*print:*/Active_Igilp_long, /*n:*/Active_Igiln, /*quiet:*/Active_Igiln_long,
            true,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.insert, SedOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #insert i}, {@link #lineNumber l}.
     */
    Active_Igil_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Igilp, /*print:*/Active_Igilp_long, /*n:*/Active_Igiln, /*quiet:*/Active_Igiln_long,
            false,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.insert, SedOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #insert i}, {@link #lineNumber l}, {@link #print p}.
     */
    Active_Iilp(
		/*g:*/Active_Igilp, /*global:*/Active_Igilp_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Iilnp, /*quiet:*/Active_Iilnp_long,
            true,
		/*active:*/SedOption.ignoreCase, SedOption.insert, SedOption.lineNumber, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #insert i}, {@link #lineNumber l}, {@link #print p}.
     */
    Active_Iilp_long(
		/*g:*/Active_Igilp, /*global:*/Active_Igilp_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Iilnp, /*quiet:*/Active_Iilnp_long,
            false,
		/*active:*/SedOption.ignoreCase, SedOption.insert, SedOption.lineNumber, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #insert i}, {@link #quiet n}.
     */
    Active_gin(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Igin, /*ignoreCase:*/Active_Igin_long, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/Active_giln, /*lineNumber:*/Active_giln_long, /*p:*/Active_ginp, /*print:*/Active_ginp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            true,
		/*active:*/SedOption.global, SedOption.insert, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #insert i}, {@link #quiet n}.
     */
    Active_gin_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Igin, /*ignoreCase:*/Active_Igin_long, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/Active_giln, /*lineNumber:*/Active_giln_long, /*p:*/Active_ginp, /*print:*/Active_ginp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            false,
		/*active:*/SedOption.global, SedOption.insert, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #insert i}, {@link #print p}, {@link #quiet n}.
     */
    Active_inp(
		/*g:*/Active_ginp, /*global:*/Active_ginp_long, /*I:*/Active_Iinp, /*ignoreCase:*/Active_Iinp_long, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/Active_ilnp, /*lineNumber:*/Active_ilnp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            true,
		/*active:*/SedOption.insert, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #insert i}, {@link #print p}, {@link #quiet n}.
     */
    Active_inp_long(
		/*g:*/Active_ginp, /*global:*/Active_ginp_long, /*I:*/Active_Iinp, /*ignoreCase:*/Active_Iinp_long, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/Active_ilnp, /*lineNumber:*/Active_ilnp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            false,
		/*active:*/SedOption.insert, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #insert i}, {@link #lineNumber l}, {@link #quiet n}.
     */
    Active_iln(
		/*g:*/Active_giln, /*global:*/Active_giln_long, /*I:*/Active_Iiln, /*ignoreCase:*/Active_Iiln_long, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_ilnp, /*print:*/Active_ilnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            true,
		/*active:*/SedOption.insert, SedOption.lineNumber, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #insert i}, {@link #lineNumber l}, {@link #quiet n}.
     */
    Active_iln_long(
		/*g:*/Active_giln, /*global:*/Active_giln_long, /*I:*/Active_Iiln, /*ignoreCase:*/Active_Iiln_long, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_ilnp, /*print:*/Active_ilnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            false,
		/*active:*/SedOption.insert, SedOption.lineNumber, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #insert i}, {@link #quiet n}.
     */
    Active_Iin(
		/*g:*/Active_Igin, /*global:*/Active_Igin_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/Active_Iiln, /*lineNumber:*/Active_Iiln_long, /*p:*/Active_Iinp, /*print:*/Active_Iinp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            true,
		/*active:*/SedOption.ignoreCase, SedOption.insert, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #insert i}, {@link #quiet n}.
     */
    Active_Iin_long(
		/*g:*/Active_Igin, /*global:*/Active_Igin_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/Active_Iiln, /*lineNumber:*/Active_Iiln_long, /*p:*/Active_Iinp, /*print:*/Active_Iinp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            false,
		/*active:*/SedOption.ignoreCase, SedOption.insert, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #insert i}, {@link #print p}.
     */
    Active_gip(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Igip, /*ignoreCase:*/Active_Igip_long, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/Active_gilp, /*lineNumber:*/Active_gilp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_ginp, /*quiet:*/Active_ginp_long,
            true,
		/*active:*/SedOption.global, SedOption.insert, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #insert i}, {@link #print p}.
     */
    Active_gip_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Igip, /*ignoreCase:*/Active_Igip_long, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/Active_gilp, /*lineNumber:*/Active_gilp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_ginp, /*quiet:*/Active_ginp_long,
            false,
		/*active:*/SedOption.global, SedOption.insert, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #insert i}, {@link #lineNumber l}.
     */
    Active_gil(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Igil, /*ignoreCase:*/Active_Igil_long, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_gilp, /*print:*/Active_gilp_long, /*n:*/Active_giln, /*quiet:*/Active_giln_long,
            true,
		/*active:*/SedOption.global, SedOption.insert, SedOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #insert i}, {@link #lineNumber l}.
     */
    Active_gil_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Igil, /*ignoreCase:*/Active_Igil_long, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_gilp, /*print:*/Active_gilp_long, /*n:*/Active_giln, /*quiet:*/Active_giln_long,
            false,
		/*active:*/SedOption.global, SedOption.insert, SedOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #insert i}.
     */
    Active_Igi(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/Active_Igil, /*lineNumber:*/Active_Igil_long, /*p:*/Active_Igip, /*print:*/Active_Igip_long, /*n:*/Active_Igin, /*quiet:*/Active_Igin_long,
            true,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.insert
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #insert i}.
     */
    Active_Igi_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/Active_Igil, /*lineNumber:*/Active_Igil_long, /*p:*/Active_Igip, /*print:*/Active_Igip_long, /*n:*/Active_Igin, /*quiet:*/Active_Igin_long,
            false,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.insert
    ),
    /**
     * Option set with the following active options: {@link #insert i}, {@link #lineNumber l}, {@link #print p}.
     */
    Active_ilp(
		/*g:*/Active_gilp, /*global:*/Active_gilp_long, /*I:*/Active_Iilp, /*ignoreCase:*/Active_Iilp_long, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_ilnp, /*quiet:*/Active_ilnp_long,
            true,
		/*active:*/SedOption.insert, SedOption.lineNumber, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #insert i}, {@link #lineNumber l}, {@link #print p}.
     */
    Active_ilp_long(
		/*g:*/Active_gilp, /*global:*/Active_gilp_long, /*I:*/Active_Iilp, /*ignoreCase:*/Active_Iilp_long, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_ilnp, /*quiet:*/Active_ilnp_long,
            false,
		/*active:*/SedOption.insert, SedOption.lineNumber, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #insert i}, {@link #print p}.
     */
    Active_Iip(
		/*g:*/Active_Igip, /*global:*/Active_Igip_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/Active_Iilp, /*lineNumber:*/Active_Iilp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Iinp, /*quiet:*/Active_Iinp_long,
            true,
		/*active:*/SedOption.ignoreCase, SedOption.insert, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #insert i}, {@link #print p}.
     */
    Active_Iip_long(
		/*g:*/Active_Igip, /*global:*/Active_Igip_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/Active_Iilp, /*lineNumber:*/Active_Iilp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Iinp, /*quiet:*/Active_Iinp_long,
            false,
		/*active:*/SedOption.ignoreCase, SedOption.insert, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #insert i}, {@link #lineNumber l}.
     */
    Active_Iil(
		/*g:*/Active_Igil, /*global:*/Active_Igil_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Iilp, /*print:*/Active_Iilp_long, /*n:*/Active_Iiln, /*quiet:*/Active_Iiln_long,
            true,
		/*active:*/SedOption.ignoreCase, SedOption.insert, SedOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #insert i}, {@link #lineNumber l}.
     */
    Active_Iil_long(
		/*g:*/Active_Igil, /*global:*/Active_Igil_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Iilp, /*print:*/Active_Iilp_long, /*n:*/Active_Iiln, /*quiet:*/Active_Iiln_long,
            false,
		/*active:*/SedOption.ignoreCase, SedOption.insert, SedOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #insert i}, {@link #quiet n}.
     */
    Active_in(
		/*g:*/Active_gin, /*global:*/Active_gin_long, /*I:*/Active_Iin, /*ignoreCase:*/Active_Iin_long, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/Active_iln, /*lineNumber:*/Active_iln_long, /*p:*/Active_inp, /*print:*/Active_inp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            true,
		/*active:*/SedOption.insert, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #insert i}, {@link #quiet n}.
     */
    Active_in_long(
		/*g:*/Active_gin, /*global:*/Active_gin_long, /*I:*/Active_Iin, /*ignoreCase:*/Active_Iin_long, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/Active_iln, /*lineNumber:*/Active_iln_long, /*p:*/Active_inp, /*print:*/Active_inp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            false,
		/*active:*/SedOption.insert, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #insert i}.
     */
    Active_gi(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Igi, /*ignoreCase:*/Active_Igi_long, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/Active_gil, /*lineNumber:*/Active_gil_long, /*p:*/Active_gip, /*print:*/Active_gip_long, /*n:*/Active_gin, /*quiet:*/Active_gin_long,
            true,
		/*active:*/SedOption.global, SedOption.insert
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #insert i}.
     */
    Active_gi_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Igi, /*ignoreCase:*/Active_Igi_long, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/Active_gil, /*lineNumber:*/Active_gil_long, /*p:*/Active_gip, /*print:*/Active_gip_long, /*n:*/Active_gin, /*quiet:*/Active_gin_long,
            false,
		/*active:*/SedOption.global, SedOption.insert
    ),
    /**
     * Option set with the following active options: {@link #insert i}, {@link #print p}.
     */
    Active_ip(
		/*g:*/Active_gip, /*global:*/Active_gip_long, /*I:*/Active_Iip, /*ignoreCase:*/Active_Iip_long, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/Active_ilp, /*lineNumber:*/Active_ilp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_inp, /*quiet:*/Active_inp_long,
            true,
		/*active:*/SedOption.insert, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #insert i}, {@link #print p}.
     */
    Active_ip_long(
		/*g:*/Active_gip, /*global:*/Active_gip_long, /*I:*/Active_Iip, /*ignoreCase:*/Active_Iip_long, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/Active_ilp, /*lineNumber:*/Active_ilp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_inp, /*quiet:*/Active_inp_long,
            false,
		/*active:*/SedOption.insert, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #insert i}, {@link #lineNumber l}.
     */
    Active_il(
		/*g:*/Active_gil, /*global:*/Active_gil_long, /*I:*/Active_Iil, /*ignoreCase:*/Active_Iil_long, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_ilp, /*print:*/Active_ilp_long, /*n:*/Active_iln, /*quiet:*/Active_iln_long,
            true,
		/*active:*/SedOption.insert, SedOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #insert i}, {@link #lineNumber l}.
     */
    Active_il_long(
		/*g:*/Active_gil, /*global:*/Active_gil_long, /*I:*/Active_Iil, /*ignoreCase:*/Active_Iil_long, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_ilp, /*print:*/Active_ilp_long, /*n:*/Active_iln, /*quiet:*/Active_iln_long,
            false,
		/*active:*/SedOption.insert, SedOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #insert i}.
     */
    Active_Ii(
		/*g:*/Active_Igi, /*global:*/Active_Igi_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/Active_Iil, /*lineNumber:*/Active_Iil_long, /*p:*/Active_Iip, /*print:*/Active_Iip_long, /*n:*/Active_Iin, /*quiet:*/Active_Iin_long,
            true,
		/*active:*/SedOption.ignoreCase, SedOption.insert
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #insert i}.
     */
    Active_Ii_long(
		/*g:*/Active_Igi, /*global:*/Active_Igi_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/Active_Iil, /*lineNumber:*/Active_Iil_long, /*p:*/Active_Iip, /*print:*/Active_Iip_long, /*n:*/Active_Iin, /*quiet:*/Active_Iin_long,
            false,
		/*active:*/SedOption.ignoreCase, SedOption.insert
    ),
    /**
     * Option set with the following active options: {@link #insert i}.
     */
    Active_i(
		/*g:*/Active_gi, /*global:*/Active_gi_long, /*I:*/Active_Ii, /*ignoreCase:*/Active_Ii_long, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/Active_il, /*lineNumber:*/Active_il_long, /*p:*/Active_ip, /*print:*/Active_ip_long, /*n:*/Active_in, /*quiet:*/Active_in_long,
            true,
		/*active:*/SedOption.insert
    ),
    /**
     * Option set with the following active options: {@link #insert i}.
     */
    Active_i_long(
		/*g:*/Active_gi, /*global:*/Active_gi_long, /*I:*/Active_Ii, /*ignoreCase:*/Active_Ii_long, /*i:*/null /*already set*/, /*insert:*/null /*already set*/, /*l:*/Active_il, /*lineNumber:*/Active_il_long, /*p:*/Active_ip, /*print:*/Active_ip_long, /*n:*/Active_in, /*quiet:*/Active_in_long,
            false,
		/*active:*/SedOption.insert
    );

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
    public final SedOptionSet_Igilnp g;
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
    public final SedOptionSet_Igilnp global;
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
    public final SedOptionSet_Igilnp I;
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
    public final SedOptionSet_Igilnp ignoreCase;
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
    public final SedOptionSet_Igilnp l;
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
    public final SedOptionSet_Igilnp lineNumber;
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
    public final SedOptionSet_Igilnp p;
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
    public final SedOptionSet_Igilnp print;
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
    public final SedOptionSet_Igilnp n;
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
    public final SedOptionSet_Igilnp quiet;
    private final boolean useAcronym;
    private final EnumSet<SedOption> options;

    private SedOptionSet_Igilnp(
            SedOptionSet_Igilnp g, SedOptionSet_Igilnp global, SedOptionSet_Igilnp I, SedOptionSet_Igilnp ignoreCase, SedOptionSet_Igilnp i, SedOptionSet_Igilnp insert, SedOptionSet_Igilnp l, SedOptionSet_Igilnp lineNumber, SedOptionSet_Igilnp p, SedOptionSet_Igilnp print, SedOptionSet_Igilnp n, SedOptionSet_Igilnp quiet,
            boolean useAcronym,
            SedOption... activeOptions
    ) {
        this.g = g == null ? this : g;
        this.global = global == null ? this : global;
        this.I = I == null ? this : I;
        this.ignoreCase = ignoreCase == null ? this : ignoreCase;
        this.i = i == null ? this : i;
        this.insert = insert == null ? this : insert;
        this.l = l == null ? this : l;
        this.lineNumber = lineNumber == null ? this : lineNumber;
        this.p = p == null ? this : p;
        this.print = print == null ? this : print;
        this.n = n == null ? this : n;
        this.quiet = quiet == null ? this : quiet;
        this.useAcronym = useAcronym;
        this.options = activeOptions.length == 0 ? EnumSet.noneOf(SedOption.class) : EnumSet.copyOf(Arrays.asList(activeOptions));
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
     *    SedOptionSet_Igilnp.global.I;
     * </pre>
     * uses acronyms, that is, this method always returns true for the above
     * set.
     * <p>
     * On the other hand, long option names are used and this method always
     * returns false for the set
     * <pre>
     *    SedOptionSet_Igilnp.g.ignoreCase;
     * </pre>
     * <p>
     * Note that a repeated option is <i>not</i> treated as the last set option.
     * For instance, the first and last option of the following set are
     * equivalent and acronyms are used:
     * <pre>
     *    SedOptionSet_Igilnp.g.I.global;
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
