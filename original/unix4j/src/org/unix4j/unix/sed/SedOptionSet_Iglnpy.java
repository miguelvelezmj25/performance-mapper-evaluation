package org.unix4j.unix.sed;

import org.unix4j.option.Option;
import org.unix4j.unix.Sed;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Option sets for the {@link Sed sed} command with
 * the following options: {@link #g g}, {@link #I I}, {@link #l l}, {@link #p p}, {@link #n n}, {@link #y y}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Sed#Options} should be used instead to specify command
 * options. See also {@link org.unix4j.unix.sed.SedOptions} for more information.
 */
public enum SedOptionSet_Iglnpy implements SedOptions {
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}, {@link #translate y}.
     */
    Active_Iglnpy(
        /*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            true,
        /*active:*/SedOption.global, SedOption.ignoreCase, SedOption.lineNumber, SedOption.print, SedOption.quiet, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}, {@link #translate y}.
     */
    Active_Iglnpy_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            false,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.lineNumber, SedOption.print, SedOption.quiet, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}, {@link #translate y}.
     */
    Active_glnpy(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Iglnpy, /*ignoreCase:*/Active_Iglnpy_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            true,
		/*active:*/SedOption.global, SedOption.lineNumber, SedOption.print, SedOption.quiet, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}, {@link #translate y}.
     */
    Active_glnpy_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Iglnpy, /*ignoreCase:*/Active_Iglnpy_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            false,
		/*active:*/SedOption.global, SedOption.lineNumber, SedOption.print, SedOption.quiet, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #print p}, {@link #quiet n}, {@link #translate y}.
     */
    Active_Ignpy(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Iglnpy, /*lineNumber:*/Active_Iglnpy_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            true,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.print, SedOption.quiet, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #print p}, {@link #quiet n}, {@link #translate y}.
     */
    Active_Ignpy_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Iglnpy, /*lineNumber:*/Active_Iglnpy_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            false,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.print, SedOption.quiet, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #quiet n}, {@link #translate y}.
     */
    Active_Iglny(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Iglnpy, /*print:*/Active_Iglnpy_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            true,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.lineNumber, SedOption.quiet, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #quiet n}, {@link #translate y}.
     */
    Active_Iglny_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Iglnpy, /*print:*/Active_Iglnpy_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            false,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.lineNumber, SedOption.quiet, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}, {@link #translate y}.
     */
    Active_Ilnpy(
		/*g:*/Active_Iglnpy, /*global:*/Active_Iglnpy_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            true,
		/*active:*/SedOption.ignoreCase, SedOption.lineNumber, SedOption.print, SedOption.quiet, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}, {@link #quiet n}, {@link #translate y}.
     */
    Active_Ilnpy_long(
		/*g:*/Active_Iglnpy, /*global:*/Active_Iglnpy_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            false,
		/*active:*/SedOption.ignoreCase, SedOption.lineNumber, SedOption.print, SedOption.quiet, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}, {@link #translate y}.
     */
    Active_Iglpy(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Iglnpy, /*quiet:*/Active_Iglnpy_long, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            true,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.lineNumber, SedOption.print, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}, {@link #translate y}.
     */
    Active_Iglpy_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Iglnpy, /*quiet:*/Active_Iglnpy_long, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            false,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.lineNumber, SedOption.print, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #print p}, {@link #quiet n}, {@link #translate y}.
     */
    Active_gnpy(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Ignpy, /*ignoreCase:*/Active_Ignpy_long, /*l:*/Active_glnpy, /*lineNumber:*/Active_glnpy_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            true,
		/*active:*/SedOption.global, SedOption.print, SedOption.quiet, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #print p}, {@link #quiet n}, {@link #translate y}.
     */
    Active_gnpy_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Ignpy, /*ignoreCase:*/Active_Ignpy_long, /*l:*/Active_glnpy, /*lineNumber:*/Active_glnpy_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            false,
		/*active:*/SedOption.global, SedOption.print, SedOption.quiet, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #lineNumber l}, {@link #quiet n}, {@link #translate y}.
     */
    Active_glny(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Iglny, /*ignoreCase:*/Active_Iglny_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_glnpy, /*print:*/Active_glnpy_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            true,
		/*active:*/SedOption.global, SedOption.lineNumber, SedOption.quiet, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #lineNumber l}, {@link #quiet n}, {@link #translate y}.
     */
    Active_glny_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Iglny, /*ignoreCase:*/Active_Iglny_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_glnpy, /*print:*/Active_glnpy_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            false,
		/*active:*/SedOption.global, SedOption.lineNumber, SedOption.quiet, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #quiet n}, {@link #translate y}.
     */
    Active_Igny(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Iglny, /*lineNumber:*/Active_Iglny_long, /*p:*/Active_Ignpy, /*print:*/Active_Ignpy_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            true,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.quiet, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #quiet n}, {@link #translate y}.
     */
    Active_Igny_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Iglny, /*lineNumber:*/Active_Iglny_long, /*p:*/Active_Ignpy, /*print:*/Active_Ignpy_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            false,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.quiet, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #lineNumber l}, {@link #print p}, {@link #quiet n}, {@link #translate y}.
     */
    Active_lnpy(
		/*g:*/Active_glnpy, /*global:*/Active_glnpy_long, /*I:*/Active_Ilnpy, /*ignoreCase:*/Active_Ilnpy_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            true,
		/*active:*/SedOption.lineNumber, SedOption.print, SedOption.quiet, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #lineNumber l}, {@link #print p}, {@link #quiet n}, {@link #translate y}.
     */
    Active_lnpy_long(
		/*g:*/Active_glnpy, /*global:*/Active_glnpy_long, /*I:*/Active_Ilnpy, /*ignoreCase:*/Active_Ilnpy_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            false,
		/*active:*/SedOption.lineNumber, SedOption.print, SedOption.quiet, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #print p}, {@link #quiet n}, {@link #translate y}.
     */
    Active_Inpy(
		/*g:*/Active_Ignpy, /*global:*/Active_Ignpy_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Ilnpy, /*lineNumber:*/Active_Ilnpy_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            true,
		/*active:*/SedOption.ignoreCase, SedOption.print, SedOption.quiet, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #print p}, {@link #quiet n}, {@link #translate y}.
     */
    Active_Inpy_long(
		/*g:*/Active_Ignpy, /*global:*/Active_Ignpy_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Ilnpy, /*lineNumber:*/Active_Ilnpy_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            false,
		/*active:*/SedOption.ignoreCase, SedOption.print, SedOption.quiet, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #lineNumber l}, {@link #quiet n}, {@link #translate y}.
     */
    Active_Ilny(
		/*g:*/Active_Iglny, /*global:*/Active_Iglny_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Ilnpy, /*print:*/Active_Ilnpy_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            true,
		/*active:*/SedOption.ignoreCase, SedOption.lineNumber, SedOption.quiet, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #lineNumber l}, {@link #quiet n}, {@link #translate y}.
     */
    Active_Ilny_long(
		/*g:*/Active_Iglny, /*global:*/Active_Iglny_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Ilnpy, /*print:*/Active_Ilnpy_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            false,
		/*active:*/SedOption.ignoreCase, SedOption.lineNumber, SedOption.quiet, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #lineNumber l}, {@link #print p}, {@link #translate y}.
     */
    Active_glpy(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Iglpy, /*ignoreCase:*/Active_Iglpy_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_glnpy, /*quiet:*/Active_glnpy_long, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            true,
		/*active:*/SedOption.global, SedOption.lineNumber, SedOption.print, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #lineNumber l}, {@link #print p}, {@link #translate y}.
     */
    Active_glpy_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Iglpy, /*ignoreCase:*/Active_Iglpy_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_glnpy, /*quiet:*/Active_glnpy_long, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            false,
		/*active:*/SedOption.global, SedOption.lineNumber, SedOption.print, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #print p}, {@link #translate y}.
     */
    Active_Igpy(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Iglpy, /*lineNumber:*/Active_Iglpy_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Ignpy, /*quiet:*/Active_Ignpy_long, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            true,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.print, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #print p}, {@link #translate y}.
     */
    Active_Igpy_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Iglpy, /*lineNumber:*/Active_Iglpy_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Ignpy, /*quiet:*/Active_Ignpy_long, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            false,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.print, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #translate y}.
     */
    Active_Igly(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Iglpy, /*print:*/Active_Iglpy_long, /*n:*/Active_Iglny, /*quiet:*/Active_Iglny_long, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            true,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.lineNumber, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #lineNumber l}, {@link #translate y}.
     */
    Active_Igly_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Iglpy, /*print:*/Active_Iglpy_long, /*n:*/Active_Iglny, /*quiet:*/Active_Iglny_long, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            false,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.lineNumber, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}, {@link #translate y}.
     */
    Active_Ilpy(
		/*g:*/Active_Iglpy, /*global:*/Active_Iglpy_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Ilnpy, /*quiet:*/Active_Ilnpy_long, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            true,
		/*active:*/SedOption.ignoreCase, SedOption.lineNumber, SedOption.print, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #lineNumber l}, {@link #print p}, {@link #translate y}.
     */
    Active_Ilpy_long(
		/*g:*/Active_Iglpy, /*global:*/Active_Iglpy_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Ilnpy, /*quiet:*/Active_Ilnpy_long, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            false,
		/*active:*/SedOption.ignoreCase, SedOption.lineNumber, SedOption.print, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #quiet n}, {@link #translate y}.
     */
    Active_gny(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Igny, /*ignoreCase:*/Active_Igny_long, /*l:*/Active_glny, /*lineNumber:*/Active_glny_long, /*p:*/Active_gnpy, /*print:*/Active_gnpy_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            true,
		/*active:*/SedOption.global, SedOption.quiet, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #quiet n}, {@link #translate y}.
     */
    Active_gny_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Igny, /*ignoreCase:*/Active_Igny_long, /*l:*/Active_glny, /*lineNumber:*/Active_glny_long, /*p:*/Active_gnpy, /*print:*/Active_gnpy_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            false,
		/*active:*/SedOption.global, SedOption.quiet, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #print p}, {@link #quiet n}, {@link #translate y}.
     */
    Active_npy(
		/*g:*/Active_gnpy, /*global:*/Active_gnpy_long, /*I:*/Active_Inpy, /*ignoreCase:*/Active_Inpy_long, /*l:*/Active_lnpy, /*lineNumber:*/Active_lnpy_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            true,
		/*active:*/SedOption.print, SedOption.quiet, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #print p}, {@link #quiet n}, {@link #translate y}.
     */
    Active_npy_long(
		/*g:*/Active_gnpy, /*global:*/Active_gnpy_long, /*I:*/Active_Inpy, /*ignoreCase:*/Active_Inpy_long, /*l:*/Active_lnpy, /*lineNumber:*/Active_lnpy_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            false,
		/*active:*/SedOption.print, SedOption.quiet, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #lineNumber l}, {@link #quiet n}, {@link #translate y}.
     */
    Active_lny(
		/*g:*/Active_glny, /*global:*/Active_glny_long, /*I:*/Active_Ilny, /*ignoreCase:*/Active_Ilny_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_lnpy, /*print:*/Active_lnpy_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            true,
		/*active:*/SedOption.lineNumber, SedOption.quiet, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #lineNumber l}, {@link #quiet n}, {@link #translate y}.
     */
    Active_lny_long(
		/*g:*/Active_glny, /*global:*/Active_glny_long, /*I:*/Active_Ilny, /*ignoreCase:*/Active_Ilny_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_lnpy, /*print:*/Active_lnpy_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            false,
		/*active:*/SedOption.lineNumber, SedOption.quiet, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #quiet n}, {@link #translate y}.
     */
    Active_Iny(
		/*g:*/Active_Igny, /*global:*/Active_Igny_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Ilny, /*lineNumber:*/Active_Ilny_long, /*p:*/Active_Inpy, /*print:*/Active_Inpy_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            true,
		/*active:*/SedOption.ignoreCase, SedOption.quiet, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #quiet n}, {@link #translate y}.
     */
    Active_Iny_long(
		/*g:*/Active_Igny, /*global:*/Active_Igny_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Ilny, /*lineNumber:*/Active_Ilny_long, /*p:*/Active_Inpy, /*print:*/Active_Inpy_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            false,
		/*active:*/SedOption.ignoreCase, SedOption.quiet, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #print p}, {@link #translate y}.
     */
    Active_gpy(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Igpy, /*ignoreCase:*/Active_Igpy_long, /*l:*/Active_glpy, /*lineNumber:*/Active_glpy_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_gnpy, /*quiet:*/Active_gnpy_long, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            true,
		/*active:*/SedOption.global, SedOption.print, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #print p}, {@link #translate y}.
     */
    Active_gpy_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Igpy, /*ignoreCase:*/Active_Igpy_long, /*l:*/Active_glpy, /*lineNumber:*/Active_glpy_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_gnpy, /*quiet:*/Active_gnpy_long, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            false,
		/*active:*/SedOption.global, SedOption.print, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #lineNumber l}, {@link #translate y}.
     */
    Active_gly(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Igly, /*ignoreCase:*/Active_Igly_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_glpy, /*print:*/Active_glpy_long, /*n:*/Active_glny, /*quiet:*/Active_glny_long, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            true,
		/*active:*/SedOption.global, SedOption.lineNumber, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #lineNumber l}, {@link #translate y}.
     */
    Active_gly_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Igly, /*ignoreCase:*/Active_Igly_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_glpy, /*print:*/Active_glpy_long, /*n:*/Active_glny, /*quiet:*/Active_glny_long, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            false,
		/*active:*/SedOption.global, SedOption.lineNumber, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #translate y}.
     */
    Active_Igy(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Igly, /*lineNumber:*/Active_Igly_long, /*p:*/Active_Igpy, /*print:*/Active_Igpy_long, /*n:*/Active_Igny, /*quiet:*/Active_Igny_long, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            true,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #ignoreCase I}, {@link #translate y}.
     */
    Active_Igy_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Igly, /*lineNumber:*/Active_Igly_long, /*p:*/Active_Igpy, /*print:*/Active_Igpy_long, /*n:*/Active_Igny, /*quiet:*/Active_Igny_long, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            false,
		/*active:*/SedOption.global, SedOption.ignoreCase, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #lineNumber l}, {@link #print p}, {@link #translate y}.
     */
    Active_lpy(
		/*g:*/Active_glpy, /*global:*/Active_glpy_long, /*I:*/Active_Ilpy, /*ignoreCase:*/Active_Ilpy_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_lnpy, /*quiet:*/Active_lnpy_long, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            true,
		/*active:*/SedOption.lineNumber, SedOption.print, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #lineNumber l}, {@link #print p}, {@link #translate y}.
     */
    Active_lpy_long(
		/*g:*/Active_glpy, /*global:*/Active_glpy_long, /*I:*/Active_Ilpy, /*ignoreCase:*/Active_Ilpy_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_lnpy, /*quiet:*/Active_lnpy_long, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            false,
		/*active:*/SedOption.lineNumber, SedOption.print, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #print p}, {@link #translate y}.
     */
    Active_Ipy(
		/*g:*/Active_Igpy, /*global:*/Active_Igpy_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Ilpy, /*lineNumber:*/Active_Ilpy_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Inpy, /*quiet:*/Active_Inpy_long, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            true,
		/*active:*/SedOption.ignoreCase, SedOption.print, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #print p}, {@link #translate y}.
     */
    Active_Ipy_long(
		/*g:*/Active_Igpy, /*global:*/Active_Igpy_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Ilpy, /*lineNumber:*/Active_Ilpy_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_Inpy, /*quiet:*/Active_Inpy_long, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            false,
		/*active:*/SedOption.ignoreCase, SedOption.print, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #lineNumber l}, {@link #translate y}.
     */
    Active_Ily(
		/*g:*/Active_Igly, /*global:*/Active_Igly_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Ilpy, /*print:*/Active_Ilpy_long, /*n:*/Active_Ilny, /*quiet:*/Active_Ilny_long, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            true,
		/*active:*/SedOption.ignoreCase, SedOption.lineNumber, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #lineNumber l}, {@link #translate y}.
     */
    Active_Ily_long(
		/*g:*/Active_Igly, /*global:*/Active_Igly_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_Ilpy, /*print:*/Active_Ilpy_long, /*n:*/Active_Ilny, /*quiet:*/Active_Ilny_long, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            false,
		/*active:*/SedOption.ignoreCase, SedOption.lineNumber, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #quiet n}, {@link #translate y}.
     */
    Active_ny(
		/*g:*/Active_gny, /*global:*/Active_gny_long, /*I:*/Active_Iny, /*ignoreCase:*/Active_Iny_long, /*l:*/Active_lny, /*lineNumber:*/Active_lny_long, /*p:*/Active_npy, /*print:*/Active_npy_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            true,
		/*active:*/SedOption.quiet, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #quiet n}, {@link #translate y}.
     */
    Active_ny_long(
		/*g:*/Active_gny, /*global:*/Active_gny_long, /*I:*/Active_Iny, /*ignoreCase:*/Active_Iny_long, /*l:*/Active_lny, /*lineNumber:*/Active_lny_long, /*p:*/Active_npy, /*print:*/Active_npy_long, /*n:*/null /*already set*/, /*quiet:*/null /*already set*/, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            false,
		/*active:*/SedOption.quiet, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #translate y}.
     */
    Active_gy(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Igy, /*ignoreCase:*/Active_Igy_long, /*l:*/Active_gly, /*lineNumber:*/Active_gly_long, /*p:*/Active_gpy, /*print:*/Active_gpy_long, /*n:*/Active_gny, /*quiet:*/Active_gny_long, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            true,
		/*active:*/SedOption.global, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #global g}, {@link #translate y}.
     */
    Active_gy_long(
		/*g:*/null /*already set*/, /*global:*/null /*already set*/, /*I:*/Active_Igy, /*ignoreCase:*/Active_Igy_long, /*l:*/Active_gly, /*lineNumber:*/Active_gly_long, /*p:*/Active_gpy, /*print:*/Active_gpy_long, /*n:*/Active_gny, /*quiet:*/Active_gny_long, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            false,
		/*active:*/SedOption.global, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #print p}, {@link #translate y}.
     */
    Active_py(
		/*g:*/Active_gpy, /*global:*/Active_gpy_long, /*I:*/Active_Ipy, /*ignoreCase:*/Active_Ipy_long, /*l:*/Active_lpy, /*lineNumber:*/Active_lpy_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_npy, /*quiet:*/Active_npy_long, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            true,
		/*active:*/SedOption.print, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #print p}, {@link #translate y}.
     */
    Active_py_long(
		/*g:*/Active_gpy, /*global:*/Active_gpy_long, /*I:*/Active_Ipy, /*ignoreCase:*/Active_Ipy_long, /*l:*/Active_lpy, /*lineNumber:*/Active_lpy_long, /*p:*/null /*already set*/, /*print:*/null /*already set*/, /*n:*/Active_npy, /*quiet:*/Active_npy_long, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            false,
		/*active:*/SedOption.print, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #lineNumber l}, {@link #translate y}.
     */
    Active_ly(
		/*g:*/Active_gly, /*global:*/Active_gly_long, /*I:*/Active_Ily, /*ignoreCase:*/Active_Ily_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_lpy, /*print:*/Active_lpy_long, /*n:*/Active_lny, /*quiet:*/Active_lny_long, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            true,
		/*active:*/SedOption.lineNumber, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #lineNumber l}, {@link #translate y}.
     */
    Active_ly_long(
		/*g:*/Active_gly, /*global:*/Active_gly_long, /*I:*/Active_Ily, /*ignoreCase:*/Active_Ily_long, /*l:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*p:*/Active_lpy, /*print:*/Active_lpy_long, /*n:*/Active_lny, /*quiet:*/Active_lny_long, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            false,
		/*active:*/SedOption.lineNumber, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #translate y}.
     */
    Active_Iy(
		/*g:*/Active_Igy, /*global:*/Active_Igy_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Ily, /*lineNumber:*/Active_Ily_long, /*p:*/Active_Ipy, /*print:*/Active_Ipy_long, /*n:*/Active_Iny, /*quiet:*/Active_Iny_long, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            true,
		/*active:*/SedOption.ignoreCase, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase I}, {@link #translate y}.
     */
    Active_Iy_long(
		/*g:*/Active_Igy, /*global:*/Active_Igy_long, /*I:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*l:*/Active_Ily, /*lineNumber:*/Active_Ily_long, /*p:*/Active_Ipy, /*print:*/Active_Ipy_long, /*n:*/Active_Iny, /*quiet:*/Active_Iny_long, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            false,
		/*active:*/SedOption.ignoreCase, SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #translate y}.
     */
    Active_y(
		/*g:*/Active_gy, /*global:*/Active_gy_long, /*I:*/Active_Iy, /*ignoreCase:*/Active_Iy_long, /*l:*/Active_ly, /*lineNumber:*/Active_ly_long, /*p:*/Active_py, /*print:*/Active_py_long, /*n:*/Active_ny, /*quiet:*/Active_ny_long, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            true,
		/*active:*/SedOption.translate
    ),
    /**
     * Option set with the following active options: {@link #translate y}.
     */
    Active_y_long(
		/*g:*/Active_gy, /*global:*/Active_gy_long, /*I:*/Active_Iy, /*ignoreCase:*/Active_Iy_long, /*l:*/Active_ly, /*lineNumber:*/Active_ly_long, /*p:*/Active_py, /*print:*/Active_py_long, /*n:*/Active_ny, /*quiet:*/Active_ny_long, /*y:*/null /*already set*/, /*translate:*/null /*already set*/,
            false,
		/*active:*/SedOption.translate
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
    public final SedOptionSet_Iglnpy g;
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
    public final SedOptionSet_Iglnpy global;
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
    public final SedOptionSet_Iglnpy I;
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
    public final SedOptionSet_Iglnpy ignoreCase;
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
    public final SedOptionSet_Iglnpy l;
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
    public final SedOptionSet_Iglnpy lineNumber;
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
    public final SedOptionSet_Iglnpy p;
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
    public final SedOptionSet_Iglnpy print;
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
    public final SedOptionSet_Iglnpy n;
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
    public final SedOptionSet_Iglnpy quiet;
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

    private SedOptionSet_Iglnpy(
            SedOptionSet_Iglnpy g, SedOptionSet_Iglnpy global, SedOptionSet_Iglnpy I, SedOptionSet_Iglnpy ignoreCase, SedOptionSet_Iglnpy l, SedOptionSet_Iglnpy lineNumber, SedOptionSet_Iglnpy p, SedOptionSet_Iglnpy print, SedOptionSet_Iglnpy n, SedOptionSet_Iglnpy quiet, SedOptionSet_Iglnpy y, SedOptionSet_Iglnpy translate,
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
        this.y = y == null ? this : y;
        this.translate = translate == null ? this : translate;
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
     *    SedOptionSet_Iglnpy.global.I;
     * </pre>
     * uses acronyms, that is, this method always returns true for the above
     * set.
     * <p>
     * On the other hand, long option names are used and this method always
     * returns false for the set
     * <pre>
     *    SedOptionSet_Iglnpy.g.ignoreCase;
     * </pre>
     * <p>
     * Note that a repeated option is <i>not</i> treated as the last set option.
     * For instance, the first and last option of the following set are
     * equivalent and acronyms are used:
     * <pre>
     *    SedOptionSet_Iglnpy.g.I.global;
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
