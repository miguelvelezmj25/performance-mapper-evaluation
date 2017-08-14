package org.unix4j.unix.sed;

import org.unix4j.option.Option;
import org.unix4j.unix.Sed;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Option sets for the {@link Sed sed} command with
 * the following options: {@link #c c}, {@link #g g}, {@link #I I}, {@link #l l}, {@link #p p}, {@link #n n}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Sed#Options} should be used instead to specify command
 * options. See also {@link org.unix4j.unix.sed.SedOptions} for more information.
 */
public enum SedOptionSet_Icglnp implements SedOptions {
    /**
     * Option set with the following active options: {@link #change c}, {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}.
     */
    Active_Icglnp(
        /*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            true,
        /*active:*/SedOption.change, SedOption.global, SedOption.ignoreCase, SedOption.lineNumber, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}.
     */
    Active_Icglnp_long(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            false,
		/*active:*/SedOption.change, SedOption.global, SedOption.ignoreCase, SedOption.lineNumber, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #global g}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}.
     */
    Active_cglnp(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Icglnp, /*ignoreCase:*/Active_Icglnp_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            true,
		/*active:*/SedOption.change, SedOption.global, SedOption.lineNumber, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #global g}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}.
     */
    Active_cglnp_long(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Icglnp, /*ignoreCase:*/Active_Icglnp_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            false,
		/*active:*/SedOption.change, SedOption.global, SedOption.lineNumber, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #global g}, {@link #ignoreCase I}, {@link #print p}, {@link #quiet n}.
     */
    Active_Icgnp(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Icglnp, /*lineNumber:*/Active_Icglnp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            true,
		/*active:*/SedOption.change, SedOption.global, SedOption.ignoreCase, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #global g}, {@link #ignoreCase I}, {@link #print p}, {@link #quiet n}.
     */
    Active_Icgnp_long(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Icglnp, /*lineNumber:*/Active_Icglnp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            false,
		/*active:*/SedOption.change, SedOption.global, SedOption.ignoreCase, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #quiet n}.
     */
    Active_Icgln(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Icglnp, /*print:*/Active_Icglnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            true,
		/*active:*/SedOption.change, SedOption.global, SedOption.ignoreCase, SedOption.lineNumber, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #quiet n}.
     */
    Active_Icgln_long(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Icglnp, /*print:*/Active_Icglnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            false,
		/*active:*/SedOption.change, SedOption.global, SedOption.ignoreCase, SedOption.lineNumber, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}.
     */
    Active_Iclnp(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/Active_Icglnp, /*global:*/Active_Icglnp_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            true,
		/*active:*/SedOption.change, SedOption.ignoreCase, SedOption.lineNumber, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}.
     */
    Active_Iclnp_long(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/Active_Icglnp, /*global:*/Active_Icglnp_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            false,
		/*active:*/SedOption.change, SedOption.ignoreCase, SedOption.lineNumber, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}.
     */
    Active_Icglp(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Icglnp, /*quiet:*/Active_Icglnp_long,
            true,
		/*active:*/SedOption.change, SedOption.global, SedOption.ignoreCase, SedOption.lineNumber, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}.
     */
    Active_Icglp_long(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Icglnp, /*quiet:*/Active_Icglnp_long,
            false,
		/*active:*/SedOption.change, SedOption.global, SedOption.ignoreCase, SedOption.lineNumber, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #global g}, {@link #print p}, {@link #quiet n}.
     */
    Active_cgnp(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Icgnp, /*ignoreCase:*/Active_Icgnp_long, /*l:*/Active_cglnp, /*lineNumber:*/Active_cglnp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            true,
		/*active:*/SedOption.change, SedOption.global, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #global g}, {@link #print p}, {@link #quiet n}.
     */
    Active_cgnp_long(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Icgnp, /*ignoreCase:*/Active_Icgnp_long, /*l:*/Active_cglnp, /*lineNumber:*/Active_cglnp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            false,
		/*active:*/SedOption.change, SedOption.global, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #global g}, {@link #lineNumber l}, {@link #quiet n}.
     */
    Active_cgln(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Icgln, /*ignoreCase:*/Active_Icgln_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_cglnp, /*print:*/Active_cglnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            true,
		/*active:*/SedOption.change, SedOption.global, SedOption.lineNumber, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #global g}, {@link #lineNumber l}, {@link #quiet n}.
     */
    Active_cgln_long(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Icgln, /*ignoreCase:*/Active_Icgln_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_cglnp, /*print:*/Active_cglnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            false,
		/*active:*/SedOption.change, SedOption.global, SedOption.lineNumber, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #global g}, {@link #ignoreCase I}, {@link #quiet n}.
     */
    Active_Icgn(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Icgln, /*lineNumber:*/Active_Icgln_long, /*p:*/Active_Icgnp, /*print:*/Active_Icgnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            true,
		/*active:*/SedOption.change, SedOption.global, SedOption.ignoreCase, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #global g}, {@link #ignoreCase I}, {@link #quiet n}.
     */
    Active_Icgn_long(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Icgln, /*lineNumber:*/Active_Icgln_long, /*p:*/Active_Icgnp, /*print:*/Active_Icgnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            false,
		/*active:*/SedOption.change, SedOption.global, SedOption.ignoreCase, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}.
     */
    Active_clnp(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/Active_cglnp, /*global:*/Active_cglnp_long, /*I:*/Active_Iclnp, /*ignoreCase:*/Active_Iclnp_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            true,
		/*active:*/SedOption.change, SedOption.lineNumber, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}.
     */
    Active_clnp_long(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/Active_cglnp, /*global:*/Active_cglnp_long, /*I:*/Active_Iclnp, /*ignoreCase:*/Active_Iclnp_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            false,
		/*active:*/SedOption.change, SedOption.lineNumber, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #ignoreCase I}, {@link #print p}, {@link #quiet n}.
     */
    Active_Icnp(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/Active_Icgnp, /*global:*/Active_Icgnp_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Iclnp, /*lineNumber:*/Active_Iclnp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            true,
		/*active:*/SedOption.change, SedOption.ignoreCase, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #ignoreCase I}, {@link #print p}, {@link #quiet n}.
     */
    Active_Icnp_long(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/Active_Icgnp, /*global:*/Active_Icgnp_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Iclnp, /*lineNumber:*/Active_Iclnp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            false,
		/*active:*/SedOption.change, SedOption.ignoreCase, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #quiet n}.
     */
    Active_Icln(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/Active_Icgln, /*global:*/Active_Icgln_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Iclnp, /*print:*/Active_Iclnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            true,
		/*active:*/SedOption.change, SedOption.ignoreCase, SedOption.lineNumber, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #quiet n}.
     */
    Active_Icln_long(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/Active_Icgln, /*global:*/Active_Icgln_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Iclnp, /*print:*/Active_Iclnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            false,
		/*active:*/SedOption.change, SedOption.ignoreCase, SedOption.lineNumber, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #global g}, {@link #lineNumber l}, {@link #print p}.
     */
    Active_cglp(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Icglp, /*ignoreCase:*/Active_Icglp_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_cglnp, /*quiet:*/Active_cglnp_long,
            true,
		/*active:*/SedOption.change, SedOption.global, SedOption.lineNumber, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #global g}, {@link #lineNumber l}, {@link #print p}.
     */
    Active_cglp_long(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Icglp, /*ignoreCase:*/Active_Icglp_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_cglnp, /*quiet:*/Active_cglnp_long,
            false,
		/*active:*/SedOption.change, SedOption.global, SedOption.lineNumber, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #global g}, {@link #ignoreCase I}, {@link #print p}.
     */
    Active_Icgp(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Icglp, /*lineNumber:*/Active_Icglp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Icgnp, /*quiet:*/Active_Icgnp_long,
            true,
		/*active:*/SedOption.change, SedOption.global, SedOption.ignoreCase, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #global g}, {@link #ignoreCase I}, {@link #print p}.
     */
    Active_Icgp_long(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Icglp, /*lineNumber:*/Active_Icglp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Icgnp, /*quiet:*/Active_Icgnp_long,
            false,
		/*active:*/SedOption.change, SedOption.global, SedOption.ignoreCase, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}.
     */
    Active_Icgl(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Icglp, /*print:*/Active_Icglp_long, /*n:*/Active_Icgln, /*quiet:*/Active_Icgln_long,
            true,
		/*active:*/SedOption.change, SedOption.global, SedOption.ignoreCase, SedOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}.
     */
    Active_Icgl_long(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Icglp, /*print:*/Active_Icglp_long, /*n:*/Active_Icgln, /*quiet:*/Active_Icgln_long,
            false,
		/*active:*/SedOption.change, SedOption.global, SedOption.ignoreCase, SedOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}.
     */
    Active_Iclp(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/Active_Icglp, /*global:*/Active_Icglp_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Iclnp, /*quiet:*/Active_Iclnp_long,
            true,
		/*active:*/SedOption.change, SedOption.ignoreCase, SedOption.lineNumber, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}.
     */
    Active_Iclp_long(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/Active_Icglp, /*global:*/Active_Icglp_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Iclnp, /*quiet:*/Active_Iclnp_long,
            false,
		/*active:*/SedOption.change, SedOption.ignoreCase, SedOption.lineNumber, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #global g}, {@link #quiet n}.
     */
    Active_cgn(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Icgn, /*ignoreCase:*/Active_Icgn_long, /*l:*/Active_cgln, /*lineNumber:*/Active_cgln_long, /*p:*/Active_cgnp, /*print:*/Active_cgnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            true,
		/*active:*/SedOption.change, SedOption.global, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #global g}, {@link #quiet n}.
     */
    Active_cgn_long(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Icgn, /*ignoreCase:*/Active_Icgn_long, /*l:*/Active_cgln, /*lineNumber:*/Active_cgln_long, /*p:*/Active_cgnp, /*print:*/Active_cgnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            false,
		/*active:*/SedOption.change, SedOption.global, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #print p}, {@link #quiet n}.
     */
    Active_cnp(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/Active_cgnp, /*global:*/Active_cgnp_long, /*I:*/Active_Icnp, /*ignoreCase:*/Active_Icnp_long, /*l:*/Active_clnp, /*lineNumber:*/Active_clnp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            true,
		/*active:*/SedOption.change, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #print p}, {@link #quiet n}.
     */
    Active_cnp_long(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/Active_cgnp, /*global:*/Active_cgnp_long, /*I:*/Active_Icnp, /*ignoreCase:*/Active_Icnp_long, /*l:*/Active_clnp, /*lineNumber:*/Active_clnp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            false,
		/*active:*/SedOption.change, SedOption.print, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #lineNumber l}, {@link #quiet n}.
     */
    Active_cln(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/Active_cgln, /*global:*/Active_cgln_long, /*I:*/Active_Icln, /*ignoreCase:*/Active_Icln_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_clnp, /*print:*/Active_clnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            true,
		/*active:*/SedOption.change, SedOption.lineNumber, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #lineNumber l}, {@link #quiet n}.
     */
    Active_cln_long(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/Active_cgln, /*global:*/Active_cgln_long, /*I:*/Active_Icln, /*ignoreCase:*/Active_Icln_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_clnp, /*print:*/Active_clnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            false,
		/*active:*/SedOption.change, SedOption.lineNumber, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #ignoreCase I}, {@link #quiet n}.
     */
    Active_Icn(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/Active_Icgn, /*global:*/Active_Icgn_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Icln, /*lineNumber:*/Active_Icln_long, /*p:*/Active_Icnp, /*print:*/Active_Icnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            true,
		/*active:*/SedOption.change, SedOption.ignoreCase, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #ignoreCase I}, {@link #quiet n}.
     */
    Active_Icn_long(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/Active_Icgn, /*global:*/Active_Icgn_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Icln, /*lineNumber:*/Active_Icln_long, /*p:*/Active_Icnp, /*print:*/Active_Icnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            false,
		/*active:*/SedOption.change, SedOption.ignoreCase, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #global g}, {@link #print p}.
     */
    Active_cgp(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Icgp, /*ignoreCase:*/Active_Icgp_long, /*l:*/Active_cglp, /*lineNumber:*/Active_cglp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_cgnp, /*quiet:*/Active_cgnp_long,
            true,
		/*active:*/SedOption.change, SedOption.global, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #global g}, {@link #print p}.
     */
    Active_cgp_long(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Icgp, /*ignoreCase:*/Active_Icgp_long, /*l:*/Active_cglp, /*lineNumber:*/Active_cglp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_cgnp, /*quiet:*/Active_cgnp_long,
            false,
		/*active:*/SedOption.change, SedOption.global, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #global g}, {@link #lineNumber l}.
     */
    Active_cgl(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Icgl, /*ignoreCase:*/Active_Icgl_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_cglp, /*print:*/Active_cglp_long, /*n:*/Active_cgln, /*quiet:*/Active_cgln_long,
            true,
		/*active:*/SedOption.change, SedOption.global, SedOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #global g}, {@link #lineNumber l}.
     */
    Active_cgl_long(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Icgl, /*ignoreCase:*/Active_Icgl_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_cglp, /*print:*/Active_cglp_long, /*n:*/Active_cgln, /*quiet:*/Active_cgln_long,
            false,
		/*active:*/SedOption.change, SedOption.global, SedOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #global g}, {@link #ignoreCase I}.
     */
    Active_Icg(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Icgl, /*lineNumber:*/Active_Icgl_long, /*p:*/Active_Icgp, /*print:*/Active_Icgp_long, /*n:*/Active_Icgn, /*quiet:*/Active_Icgn_long,
            true,
		/*active:*/SedOption.change, SedOption.global, SedOption.ignoreCase
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #global g}, {@link #ignoreCase I}.
     */
    Active_Icg_long(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Icgl, /*lineNumber:*/Active_Icgl_long, /*p:*/Active_Icgp, /*print:*/Active_Icgp_long, /*n:*/Active_Icgn, /*quiet:*/Active_Icgn_long,
            false,
		/*active:*/SedOption.change, SedOption.global, SedOption.ignoreCase
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #lineNumber l}, {@link #print p}.
     */
    Active_clp(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/Active_cglp, /*global:*/Active_cglp_long, /*I:*/Active_Iclp, /*ignoreCase:*/Active_Iclp_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_clnp, /*quiet:*/Active_clnp_long,
            true,
		/*active:*/SedOption.change, SedOption.lineNumber, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #lineNumber l}, {@link #print p}.
     */
    Active_clp_long(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/Active_cglp, /*global:*/Active_cglp_long, /*I:*/Active_Iclp, /*ignoreCase:*/Active_Iclp_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_clnp, /*quiet:*/Active_clnp_long,
            false,
		/*active:*/SedOption.change, SedOption.lineNumber, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #ignoreCase I}, {@link #print p}.
     */
    Active_Icp(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/Active_Icgp, /*global:*/Active_Icgp_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Iclp, /*lineNumber:*/Active_Iclp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Icnp, /*quiet:*/Active_Icnp_long,
            true,
		/*active:*/SedOption.change, SedOption.ignoreCase, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #ignoreCase I}, {@link #print p}.
     */
    Active_Icp_long(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/Active_Icgp, /*global:*/Active_Icgp_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Iclp, /*lineNumber:*/Active_Iclp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Icnp, /*quiet:*/Active_Icnp_long,
            false,
		/*active:*/SedOption.change, SedOption.ignoreCase, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #ignoreCase I}, {@link #lineNumber l}.
     */
    Active_Icl(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/Active_Icgl, /*global:*/Active_Icgl_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Iclp, /*print:*/Active_Iclp_long, /*n:*/Active_Icln, /*quiet:*/Active_Icln_long,
            true,
		/*active:*/SedOption.change, SedOption.ignoreCase, SedOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #ignoreCase I}, {@link #lineNumber l}.
     */
    Active_Icl_long(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/Active_Icgl, /*global:*/Active_Icgl_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Iclp, /*print:*/Active_Iclp_long, /*n:*/Active_Icln, /*quiet:*/Active_Icln_long,
            false,
		/*active:*/SedOption.change, SedOption.ignoreCase, SedOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #quiet n}.
     */
    Active_cn(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/Active_cgn, /*global:*/Active_cgn_long, /*I:*/Active_Icn, /*ignoreCase:*/Active_Icn_long, /*l:*/Active_cln, /*lineNumber:*/Active_cln_long, /*p:*/Active_cnp, /*print:*/Active_cnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            true,
		/*active:*/SedOption.change, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #quiet n}.
     */
    Active_cn_long(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/Active_cgn, /*global:*/Active_cgn_long, /*I:*/Active_Icn, /*ignoreCase:*/Active_Icn_long, /*l:*/Active_cln, /*lineNumber:*/Active_cln_long, /*p:*/Active_cnp, /*print:*/Active_cnp_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/,
            false,
		/*active:*/SedOption.change, SedOption.quiet
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #global g}.
     */
    Active_cg(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Icg, /*ignoreCase:*/Active_Icg_long, /*l:*/Active_cgl, /*lineNumber:*/Active_cgl_long, /*p:*/Active_cgp, /*print:*/Active_cgp_long, /*n:*/Active_cgn, /*quiet:*/Active_cgn_long,
            true,
		/*active:*/SedOption.change, SedOption.global
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #global g}.
     */
    Active_cg_long(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Icg, /*ignoreCase:*/Active_Icg_long, /*l:*/Active_cgl, /*lineNumber:*/Active_cgl_long, /*p:*/Active_cgp, /*print:*/Active_cgp_long, /*n:*/Active_cgn, /*quiet:*/Active_cgn_long,
            false,
		/*active:*/SedOption.change, SedOption.global
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #print p}.
     */
    Active_cp(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/Active_cgp, /*global:*/Active_cgp_long, /*I:*/Active_Icp, /*ignoreCase:*/Active_Icp_long, /*l:*/Active_clp, /*lineNumber:*/Active_clp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_cnp, /*quiet:*/Active_cnp_long,
            true,
		/*active:*/SedOption.change, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #print p}.
     */
    Active_cp_long(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/Active_cgp, /*global:*/Active_cgp_long, /*I:*/Active_Icp, /*ignoreCase:*/Active_Icp_long, /*l:*/Active_clp, /*lineNumber:*/Active_clp_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_cnp, /*quiet:*/Active_cnp_long,
            false,
		/*active:*/SedOption.change, SedOption.print
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #lineNumber l}.
     */
    Active_cl(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/Active_cgl, /*global:*/Active_cgl_long, /*I:*/Active_Icl, /*ignoreCase:*/Active_Icl_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_clp, /*print:*/Active_clp_long, /*n:*/Active_cln, /*quiet:*/Active_cln_long,
            true,
		/*active:*/SedOption.change, SedOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #lineNumber l}.
     */
    Active_cl_long(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/Active_cgl, /*global:*/Active_cgl_long, /*I:*/Active_Icl, /*ignoreCase:*/Active_Icl_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_clp, /*print:*/Active_clp_long, /*n:*/Active_cln, /*quiet:*/Active_cln_long,
            false,
		/*active:*/SedOption.change, SedOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #ignoreCase I}.
     */
    Active_Ic(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/Active_Icg, /*global:*/Active_Icg_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Icl, /*lineNumber:*/Active_Icl_long, /*p:*/Active_Icp, /*print:*/Active_Icp_long, /*n:*/Active_Icn, /*quiet:*/Active_Icn_long,
            true,
		/*active:*/SedOption.change, SedOption.ignoreCase
    ),
    /**
     * Option set with the following active options: {@link #change c}, {@link #ignoreCase I}.
     */
    Active_Ic_long(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/Active_Icg, /*global:*/Active_Icg_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Icl, /*lineNumber:*/Active_Icl_long, /*p:*/Active_Icp, /*print:*/Active_Icp_long, /*n:*/Active_Icn, /*quiet:*/Active_Icn_long,
            false,
		/*active:*/SedOption.change, SedOption.ignoreCase
    ),
    /**
     * Option set with the following active options: {@link #change c}.
     */
    Active_c(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/Active_cg, /*global:*/Active_cg_long, /*I:*/Active_Ic, /*ignoreCase:*/Active_Ic_long, /*l:*/Active_cl, /*lineNumber:*/Active_cl_long, /*p:*/Active_cp, /*print:*/Active_cp_long, /*n:*/Active_cn, /*quiet:*/Active_cn_long,
            true,
		/*active:*/SedOption.change
    ),
    /**
     * Option set with the following active options: {@link #change c}.
     */
    Active_c_long(
		/*c:*/null /*already set*/, /*change:*/null /*already set*/, /*g:*/Active_cg, /*global:*/Active_cg_long, /*I:*/Active_Ic, /*ignoreCase:*/Active_Ic_long, /*l:*/Active_cl, /*lineNumber:*/Active_cl_long, /*p:*/Active_cp, /*print:*/Active_cp_long, /*n:*/Active_cn, /*quiet:*/Active_cn_long,
            false,
		/*active:*/SedOption.change
    );

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
    public final SedOptionSet_Icglnp g;
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
    public final SedOptionSet_Icglnp global;
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
    public final SedOptionSet_Icglnp I;
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
    public final SedOptionSet_Icglnp ignoreCase;
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
    public final SedOptionSet_Icglnp l;
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
    public final SedOptionSet_Icglnp lineNumber;
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
    public final SedOptionSet_Icglnp p;
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
    public final SedOptionSet_Icglnp print;
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
    public final SedOptionSet_Icglnp n;
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
    public final SedOptionSet_Icglnp quiet;
    private final boolean useAcronym;
    private final EnumSet<SedOption> options;

    private SedOptionSet_Icglnp(
            SedOptionSet_Icglnp c, SedOptionSet_Icglnp change, SedOptionSet_Icglnp g, SedOptionSet_Icglnp global, SedOptionSet_Icglnp I, SedOptionSet_Icglnp ignoreCase, SedOptionSet_Icglnp l, SedOptionSet_Icglnp lineNumber, SedOptionSet_Icglnp p, SedOptionSet_Icglnp print, SedOptionSet_Icglnp n, SedOptionSet_Icglnp quiet,
            boolean useAcronym,
            SedOption... activeOptions
    ) {
        this.c = c == null ? this : c;
        this.change = change == null ? this : change;
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
     *    SedOptionSet_Icglnp.change.g;
     * </pre>
     * uses acronyms, that is, this method always returns true for the above
     * set.
     * <p>
     * On the other hand, long option names are used and this method always
     * returns false for the set
     * <pre>
     *    SedOptionSet_Icglnp.c.global;
     * </pre>
     * <p>
     * Note that a repeated option is <i>not</i> treated as the last set option.
     * For instance, the first and last option of the following set are
     * equivalent and acronyms are used:
     * <pre>
     *    SedOptionSet_Icglnp.c.g.change;
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
