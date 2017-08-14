package org.unix4j.unix.sed;

import org.unix4j.option.Option;
import org.unix4j.unix.Sed;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Option sets for the {@link Sed sed} command with
 * the following options: {@link #g g}, {@link #I I}, {@link #l l}, {@link #p p}, {@link #n n}, {@link #s s}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Sed#Options} should be used instead to specify command
 * options. See also {@link org.unix4j.unix.sed.SedOptions} for more information.
 */
public enum SedOptionSet_Iglnps implements SedOptions {
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}, {@link #substitute s}.
     */
    Active_Iglnps(
        /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            true,
        /*active:*/SedOption.global, SedOption.ignoreCase, SedOption.lineNumber, SedOption.print, SedOption.quiet, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}, {@link #substitute s}.
     */
    Active_Iglnps_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            false,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.lineNumber, SedOption.print, SedOption.quiet, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}, {@link #substitute s}.
     */
    Active_glnps(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Iglnps, /*ignoreCase:*/Active_Iglnps_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            true,
		/*active:*/SedOption.global, SedOption.lineNumber, SedOption.print, SedOption.quiet, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}, {@link #substitute s}.
     */
    Active_glnps_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Iglnps, /*ignoreCase:*/Active_Iglnps_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            false,
		/*active:*/SedOption.global, SedOption.lineNumber, SedOption.print, SedOption.quiet, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #print p}, {@link #quiet n}, {@link #substitute s}.
     */
    Active_Ignps(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Iglnps, /*lineNumber:*/Active_Iglnps_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            true,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.print, SedOption.quiet, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #print p}, {@link #quiet n}, {@link #substitute s}.
     */
    Active_Ignps_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Iglnps, /*lineNumber:*/Active_Iglnps_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            false,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.print, SedOption.quiet, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #quiet n}, {@link #substitute s}.
     */
    Active_Iglns(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Iglnps, /*print:*/Active_Iglnps_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            true,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.lineNumber, SedOption.quiet, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #quiet n}, {@link #substitute s}.
     */
    Active_Iglns_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Iglnps, /*print:*/Active_Iglnps_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            false,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.lineNumber, SedOption.quiet, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}, {@link #substitute s}.
     */
    Active_Ilnps(
		/*g:*/Active_Iglnps, /*global:*/Active_Iglnps_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            true,
		/*active:*/SedOption.ignoreCase, SedOption.lineNumber, SedOption.print, SedOption.quiet, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}, {@link #substitute s}.
     */
    Active_Ilnps_long(
		/*g:*/Active_Iglnps, /*global:*/Active_Iglnps_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            false,
		/*active:*/SedOption.ignoreCase, SedOption.lineNumber, SedOption.print, SedOption.quiet, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}, {@link #substitute s}.
     */
    Active_Iglps(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Iglnps, /*quiet:*/Active_Iglnps_long, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            true,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.lineNumber, SedOption.print, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}, {@link #substitute s}.
     */
    Active_Iglps_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Iglnps, /*quiet:*/Active_Iglnps_long, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            false,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.lineNumber, SedOption.print, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #print p}, {@link #quiet n}, {@link #substitute s}.
     */
    Active_gnps(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Ignps, /*ignoreCase:*/Active_Ignps_long, /*l:*/Active_glnps, /*lineNumber:*/Active_glnps_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            true,
		/*active:*/SedOption.global, SedOption.print, SedOption.quiet, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #print p}, {@link #quiet n}, {@link #substitute s}.
     */
    Active_gnps_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Ignps, /*ignoreCase:*/Active_Ignps_long, /*l:*/Active_glnps, /*lineNumber:*/Active_glnps_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            false,
		/*active:*/SedOption.global, SedOption.print, SedOption.quiet, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #lineNumber l}, {@link #quiet n}, {@link #substitute s}.
     */
    Active_glns(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Iglns, /*ignoreCase:*/Active_Iglns_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_glnps, /*print:*/Active_glnps_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            true,
		/*active:*/SedOption.global, SedOption.lineNumber, SedOption.quiet, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #lineNumber l}, {@link #quiet n}, {@link #substitute s}.
     */
    Active_glns_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Iglns, /*ignoreCase:*/Active_Iglns_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_glnps, /*print:*/Active_glnps_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            false,
		/*active:*/SedOption.global, SedOption.lineNumber, SedOption.quiet, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #quiet n}, {@link #substitute s}.
     */
    Active_Igns(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Iglns, /*lineNumber:*/Active_Iglns_long, /*p:*/Active_Ignps, /*print:*/Active_Ignps_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            true,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.quiet, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #quiet n}, {@link #substitute s}.
     */
    Active_Igns_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Iglns, /*lineNumber:*/Active_Iglns_long, /*p:*/Active_Ignps, /*print:*/Active_Ignps_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            false,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.quiet, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #lineNumber l}, {@link #print p}, {@link #quiet n}, {@link #substitute s}.
     */
    Active_lnps(
		/*g:*/Active_glnps, /*global:*/Active_glnps_long, /*I:*/Active_Ilnps, /*ignoreCase:*/Active_Ilnps_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            true,
		/*active:*/SedOption.lineNumber, SedOption.print, SedOption.quiet, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #lineNumber l}, {@link #print p}, {@link #quiet n}, {@link #substitute s}.
     */
    Active_lnps_long(
		/*g:*/Active_glnps, /*global:*/Active_glnps_long, /*I:*/Active_Ilnps, /*ignoreCase:*/Active_Ilnps_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            false,
		/*active:*/SedOption.lineNumber, SedOption.print, SedOption.quiet, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #print p}, {@link #quiet n}, {@link #substitute s}.
     */
    Active_Inps(
		/*g:*/Active_Ignps, /*global:*/Active_Ignps_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Ilnps, /*lineNumber:*/Active_Ilnps_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            true,
		/*active:*/SedOption.ignoreCase, SedOption.print, SedOption.quiet, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #print p}, {@link #quiet n}, {@link #substitute s}.
     */
    Active_Inps_long(
		/*g:*/Active_Ignps, /*global:*/Active_Ignps_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Ilnps, /*lineNumber:*/Active_Ilnps_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            false,
		/*active:*/SedOption.ignoreCase, SedOption.print, SedOption.quiet, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #lineNumber l}, {@link #quiet n}, {@link #substitute s}.
     */
    Active_Ilns(
		/*g:*/Active_Iglns, /*global:*/Active_Iglns_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Ilnps, /*print:*/Active_Ilnps_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            true,
		/*active:*/SedOption.ignoreCase, SedOption.lineNumber, SedOption.quiet, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #lineNumber l}, {@link #quiet n}, {@link #substitute s}.
     */
    Active_Ilns_long(
		/*g:*/Active_Iglns, /*global:*/Active_Iglns_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Ilnps, /*print:*/Active_Ilnps_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            false,
		/*active:*/SedOption.ignoreCase, SedOption.lineNumber, SedOption.quiet, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #lineNumber l}, {@link #print p}, {@link #substitute s}.
     */
    Active_glps(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Iglps, /*ignoreCase:*/Active_Iglps_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_glnps, /*quiet:*/Active_glnps_long, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            true,
		/*active:*/SedOption.global, SedOption.lineNumber, SedOption.print, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #lineNumber l}, {@link #print p}, {@link #substitute s}.
     */
    Active_glps_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Iglps, /*ignoreCase:*/Active_Iglps_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_glnps, /*quiet:*/Active_glnps_long, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            false,
		/*active:*/SedOption.global, SedOption.lineNumber, SedOption.print, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #print p}, {@link #substitute s}.
     */
    Active_Igps(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Iglps, /*lineNumber:*/Active_Iglps_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Ignps, /*quiet:*/Active_Ignps_long, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            true,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.print, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #print p}, {@link #substitute s}.
     */
    Active_Igps_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Iglps, /*lineNumber:*/Active_Iglps_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Ignps, /*quiet:*/Active_Ignps_long, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            false,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.print, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #substitute s}.
     */
    Active_Igls(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Iglps, /*print:*/Active_Iglps_long, /*n:*/Active_Iglns, /*quiet:*/Active_Iglns_long, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            true,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.lineNumber, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #substitute s}.
     */
    Active_Igls_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Iglps, /*print:*/Active_Iglps_long, /*n:*/Active_Iglns, /*quiet:*/Active_Iglns_long, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            false,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.lineNumber, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}, {@link #substitute s}.
     */
    Active_Ilps(
		/*g:*/Active_Iglps, /*global:*/Active_Iglps_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Ilnps, /*quiet:*/Active_Ilnps_long, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            true,
		/*active:*/SedOption.ignoreCase, SedOption.lineNumber, SedOption.print, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}, {@link #substitute s}.
     */
    Active_Ilps_long(
		/*g:*/Active_Iglps, /*global:*/Active_Iglps_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Ilnps, /*quiet:*/Active_Ilnps_long, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            false,
		/*active:*/SedOption.ignoreCase, SedOption.lineNumber, SedOption.print, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #quiet n}, {@link #substitute s}.
     */
    Active_gns(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Igns, /*ignoreCase:*/Active_Igns_long, /*l:*/Active_glns, /*lineNumber:*/Active_glns_long, /*p:*/Active_gnps, /*print:*/Active_gnps_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            true,
		/*active:*/SedOption.global, SedOption.quiet, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #quiet n}, {@link #substitute s}.
     */
    Active_gns_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Igns, /*ignoreCase:*/Active_Igns_long, /*l:*/Active_glns, /*lineNumber:*/Active_glns_long, /*p:*/Active_gnps, /*print:*/Active_gnps_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            false,
		/*active:*/SedOption.global, SedOption.quiet, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #print p}, {@link #quiet n}, {@link #substitute s}.
     */
    Active_nps(
		/*g:*/Active_gnps, /*global:*/Active_gnps_long, /*I:*/Active_Inps, /*ignoreCase:*/Active_Inps_long, /*l:*/Active_lnps, /*lineNumber:*/Active_lnps_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            true,
		/*active:*/SedOption.print, SedOption.quiet, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #print p}, {@link #quiet n}, {@link #substitute s}.
     */
    Active_nps_long(
		/*g:*/Active_gnps, /*global:*/Active_gnps_long, /*I:*/Active_Inps, /*ignoreCase:*/Active_Inps_long, /*l:*/Active_lnps, /*lineNumber:*/Active_lnps_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            false,
		/*active:*/SedOption.print, SedOption.quiet, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #lineNumber l}, {@link #quiet n}, {@link #substitute s}.
     */
    Active_lns(
		/*g:*/Active_glns, /*global:*/Active_glns_long, /*I:*/Active_Ilns, /*ignoreCase:*/Active_Ilns_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_lnps, /*print:*/Active_lnps_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            true,
		/*active:*/SedOption.lineNumber, SedOption.quiet, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #lineNumber l}, {@link #quiet n}, {@link #substitute s}.
     */
    Active_lns_long(
		/*g:*/Active_glns, /*global:*/Active_glns_long, /*I:*/Active_Ilns, /*ignoreCase:*/Active_Ilns_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_lnps, /*print:*/Active_lnps_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            false,
		/*active:*/SedOption.lineNumber, SedOption.quiet, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #quiet n}, {@link #substitute s}.
     */
    Active_Ins(
		/*g:*/Active_Igns, /*global:*/Active_Igns_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Ilns, /*lineNumber:*/Active_Ilns_long, /*p:*/Active_Inps, /*print:*/Active_Inps_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            true,
		/*active:*/SedOption.ignoreCase, SedOption.quiet, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #quiet n}, {@link #substitute s}.
     */
    Active_Ins_long(
		/*g:*/Active_Igns, /*global:*/Active_Igns_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Ilns, /*lineNumber:*/Active_Ilns_long, /*p:*/Active_Inps, /*print:*/Active_Inps_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            false,
		/*active:*/SedOption.ignoreCase, SedOption.quiet, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #print p}, {@link #substitute s}.
     */
    Active_gps(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Igps, /*ignoreCase:*/Active_Igps_long, /*l:*/Active_glps, /*lineNumber:*/Active_glps_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_gnps, /*quiet:*/Active_gnps_long, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            true,
		/*active:*/SedOption.global, SedOption.print, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #print p}, {@link #substitute s}.
     */
    Active_gps_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Igps, /*ignoreCase:*/Active_Igps_long, /*l:*/Active_glps, /*lineNumber:*/Active_glps_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_gnps, /*quiet:*/Active_gnps_long, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            false,
		/*active:*/SedOption.global, SedOption.print, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #lineNumber l}, {@link #substitute s}.
     */
    Active_gls(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Igls, /*ignoreCase:*/Active_Igls_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_glps, /*print:*/Active_glps_long, /*n:*/Active_glns, /*quiet:*/Active_glns_long, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            true,
		/*active:*/SedOption.global, SedOption.lineNumber, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #lineNumber l}, {@link #substitute s}.
     */
    Active_gls_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Igls, /*ignoreCase:*/Active_Igls_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_glps, /*print:*/Active_glps_long, /*n:*/Active_glns, /*quiet:*/Active_glns_long, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            false,
		/*active:*/SedOption.global, SedOption.lineNumber, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #substitute s}.
     */
    Active_Igs(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Igls, /*lineNumber:*/Active_Igls_long, /*p:*/Active_Igps, /*print:*/Active_Igps_long, /*n:*/Active_Igns, /*quiet:*/Active_Igns_long, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            true,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #substitute s}.
     */
    Active_Igs_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Igls, /*lineNumber:*/Active_Igls_long, /*p:*/Active_Igps, /*print:*/Active_Igps_long, /*n:*/Active_Igns, /*quiet:*/Active_Igns_long, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            false,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #lineNumber l}, {@link #print p}, {@link #substitute s}.
     */
    Active_lps(
		/*g:*/Active_glps, /*global:*/Active_glps_long, /*I:*/Active_Ilps, /*ignoreCase:*/Active_Ilps_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_lnps, /*quiet:*/Active_lnps_long, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            true,
		/*active:*/SedOption.lineNumber, SedOption.print, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #lineNumber l}, {@link #print p}, {@link #substitute s}.
     */
    Active_lps_long(
		/*g:*/Active_glps, /*global:*/Active_glps_long, /*I:*/Active_Ilps, /*ignoreCase:*/Active_Ilps_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_lnps, /*quiet:*/Active_lnps_long, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            false,
		/*active:*/SedOption.lineNumber, SedOption.print, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #print p}, {@link #substitute s}.
     */
    Active_Ips(
		/*g:*/Active_Igps, /*global:*/Active_Igps_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Ilps, /*lineNumber:*/Active_Ilps_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Inps, /*quiet:*/Active_Inps_long, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            true,
		/*active:*/SedOption.ignoreCase, SedOption.print, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #print p}, {@link #substitute s}.
     */
    Active_Ips_long(
		/*g:*/Active_Igps, /*global:*/Active_Igps_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Ilps, /*lineNumber:*/Active_Ilps_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Inps, /*quiet:*/Active_Inps_long, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            false,
		/*active:*/SedOption.ignoreCase, SedOption.print, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #lineNumber l}, {@link #substitute s}.
     */
    Active_Ils(
		/*g:*/Active_Igls, /*global:*/Active_Igls_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Ilps, /*print:*/Active_Ilps_long, /*n:*/Active_Ilns, /*quiet:*/Active_Ilns_long, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            true,
		/*active:*/SedOption.ignoreCase, SedOption.lineNumber, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #lineNumber l}, {@link #substitute s}.
     */
    Active_Ils_long(
		/*g:*/Active_Igls, /*global:*/Active_Igls_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Ilps, /*print:*/Active_Ilps_long, /*n:*/Active_Ilns, /*quiet:*/Active_Ilns_long, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            false,
		/*active:*/SedOption.ignoreCase, SedOption.lineNumber, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #quiet n}, {@link #substitute s}.
     */
    Active_ns(
		/*g:*/Active_gns, /*global:*/Active_gns_long, /*I:*/Active_Ins, /*ignoreCase:*/Active_Ins_long, /*l:*/Active_lns, /*lineNumber:*/Active_lns_long, /*p:*/Active_nps, /*print:*/Active_nps_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            true,
		/*active:*/SedOption.quiet, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #quiet n}, {@link #substitute s}.
     */
    Active_ns_long(
		/*g:*/Active_gns, /*global:*/Active_gns_long, /*I:*/Active_Ins, /*ignoreCase:*/Active_Ins_long, /*l:*/Active_lns, /*lineNumber:*/Active_lns_long, /*p:*/Active_nps, /*print:*/Active_nps_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            false,
		/*active:*/SedOption.quiet, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #substitute s}.
     */
    Active_gs(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Igs, /*ignoreCase:*/Active_Igs_long, /*l:*/Active_gls, /*lineNumber:*/Active_gls_long, /*p:*/Active_gps, /*print:*/Active_gps_long, /*n:*/Active_gns, /*quiet:*/Active_gns_long, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            true,
		/*active:*/SedOption.global, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #substitute s}.
     */
    Active_gs_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Igs, /*ignoreCase:*/Active_Igs_long, /*l:*/Active_gls, /*lineNumber:*/Active_gls_long, /*p:*/Active_gps, /*print:*/Active_gps_long, /*n:*/Active_gns, /*quiet:*/Active_gns_long, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            false,
		/*active:*/SedOption.global, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #print p}, {@link #substitute s}.
     */
    Active_ps(
		/*g:*/Active_gps, /*global:*/Active_gps_long, /*I:*/Active_Ips, /*ignoreCase:*/Active_Ips_long, /*l:*/Active_lps, /*lineNumber:*/Active_lps_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_nps, /*quiet:*/Active_nps_long, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            true,
		/*active:*/SedOption.print, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #print p}, {@link #substitute s}.
     */
    Active_ps_long(
		/*g:*/Active_gps, /*global:*/Active_gps_long, /*I:*/Active_Ips, /*ignoreCase:*/Active_Ips_long, /*l:*/Active_lps, /*lineNumber:*/Active_lps_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_nps, /*quiet:*/Active_nps_long, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            false,
		/*active:*/SedOption.print, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #lineNumber l}, {@link #substitute s}.
     */
    Active_ls(
		/*g:*/Active_gls, /*global:*/Active_gls_long, /*I:*/Active_Ils, /*ignoreCase:*/Active_Ils_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_lps, /*print:*/Active_lps_long, /*n:*/Active_lns, /*quiet:*/Active_lns_long, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            true,
		/*active:*/SedOption.lineNumber, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #lineNumber l}, {@link #substitute s}.
     */
    Active_ls_long(
		/*g:*/Active_gls, /*global:*/Active_gls_long, /*I:*/Active_Ils, /*ignoreCase:*/Active_Ils_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_lps, /*print:*/Active_lps_long, /*n:*/Active_lns, /*quiet:*/Active_lns_long, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            false,
		/*active:*/SedOption.lineNumber, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #substitute s}.
     */
    Active_Is(
		/*g:*/Active_Igs, /*global:*/Active_Igs_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Ils, /*lineNumber:*/Active_Ils_long, /*p:*/Active_Ips, /*print:*/Active_Ips_long, /*n:*/Active_Ins, /*quiet:*/Active_Ins_long, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            true,
		/*active:*/SedOption.ignoreCase, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #substitute s}.
     */
    Active_Is_long(
		/*g:*/Active_Igs, /*global:*/Active_Igs_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Ils, /*lineNumber:*/Active_Ils_long, /*p:*/Active_Ips, /*print:*/Active_Ips_long, /*n:*/Active_Ins, /*quiet:*/Active_Ins_long, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            false,
		/*active:*/SedOption.ignoreCase, SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #substitute s}.
     */
    Active_s(
		/*g:*/Active_gs, /*global:*/Active_gs_long, /*I:*/Active_Is, /*ignoreCase:*/Active_Is_long, /*l:*/Active_ls, /*lineNumber:*/Active_ls_long, /*p:*/Active_ps, /*print:*/Active_ps_long, /*n:*/Active_ns, /*quiet:*/Active_ns_long, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            true,
		/*active:*/SedOption.substitute
    ),
    /**
     * Option set with the following active options: {@link #substitute s}.
     */
    Active_s_long(
		/*g:*/Active_gs, /*global:*/Active_gs_long, /*I:*/Active_Is, /*ignoreCase:*/Active_Is_long, /*l:*/Active_ls, /*lineNumber:*/Active_ls_long, /*p:*/Active_ps, /*print:*/Active_ps_long, /*n:*/Active_ns, /*quiet:*/Active_ns_long, /*s:*/null /*already set*/, /*substitute:*/null /*already set*/,
            false,
		/*active:*/SedOption.substitute
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
    public final SedOptionSet_Iglnps g;
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
    public final SedOptionSet_Iglnps global;
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
    public final SedOptionSet_Iglnps I;
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
    public final SedOptionSet_Iglnps ignoreCase;
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
    public final SedOptionSet_Iglnps l;
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
    public final SedOptionSet_Iglnps lineNumber;
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
    public final SedOptionSet_Iglnps p;
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
    public final SedOptionSet_Iglnps print;
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
    public final SedOptionSet_Iglnps n;
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
    public final SedOptionSet_Iglnps quiet;
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
    private final boolean useAcronym;
    private final EnumSet<SedOption> options;

    private SedOptionSet_Iglnps(
            SedOptionSet_Iglnps g, SedOptionSet_Iglnps global, SedOptionSet_Iglnps I, SedOptionSet_Iglnps ignoreCase, SedOptionSet_Iglnps l, SedOptionSet_Iglnps lineNumber, SedOptionSet_Iglnps p, SedOptionSet_Iglnps print, SedOptionSet_Iglnps n, SedOptionSet_Iglnps quiet, SedOptionSet_Iglnps s, SedOptionSet_Iglnps substitute,
            boolean useAcronym,
            SedOption... activeOptions
    ) {
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
        this.s = s == null ? this : s;
        this.substitute = substitute == null ? this : substitute;
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
     *    SedOptionSet_Iglnps.global.I;
     * </pre>
     * uses acronyms, that is, this method always returns true for the above
     * set.
     * <p>
     * On the other hand, long option names are used and this method always
     * returns false for the set
     * <pre>
     *    SedOptionSet_Iglnps.g.ignoreCase;
     * </pre>
     * <p>
     * Note that a repeated option is <i>not</i> treated as the last set option.
     * For instance, the first and last option of the following set are
     * equivalent and acronyms are used:
     * <pre>
     *    SedOptionSet_Iglnps.g.I.global;
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
