package org.unix4j.grep.unix.grep;

import org.unix4j.grep.option.Option;
import org.unix4j.grep.unix.Grep;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Option sets for the {@link Grep grep} command with
 * the following options: {@link #c c}, {@link #F F}, {@link #i i}, {@link #v v}, {@link #n n}, {@link #l l}, {@link #x x}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Grep#Options} should be used instead to specify command
 * options. See also {@link org.unix4j.grep.unix.grep.GrepOptions} for more information.
 */
public enum GrepOptionSet_Fcilnvx implements GrepOptions {
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #invertMatch v}, {@link #lineNumber n}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_Fcilnvx(
        /*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
        /*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #invertMatch v}, {@link #lineNumber n}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_Fcilnvx_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #invertMatch v}, {@link #lineNumber n}, {@link #matchingFiles l}.
     */
    Active_Fcilnv(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_Fcilnvx, /*wholeLine:*/Active_Fcilnvx_long,
            true,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #invertMatch v}, {@link #lineNumber n}, {@link #matchingFiles l}.
     */
    Active_Fcilnv_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_Fcilnvx, /*wholeLine:*/Active_Fcilnvx_long,
            false,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #invertMatch v}, {@link #lineNumber n}, {@link #wholeLine x}.
     */
    Active_Fcinvx(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_Fcilnvx, /*matchingFiles:*/Active_Fcilnvx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #invertMatch v}, {@link #lineNumber n}, {@link #wholeLine x}.
     */
    Active_Fcinvx_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_Fcilnvx, /*matchingFiles:*/Active_Fcilnvx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #invertMatch v}, {@link #lineNumber n}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_Filnvx(
		/*c:*/Active_Fcilnvx, /*count:*/Active_Fcilnvx_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #invertMatch v}, {@link #lineNumber n}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_Filnvx_long(
		/*c:*/Active_Fcilnvx, /*count:*/Active_Fcilnvx_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #invertMatch v}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_Fcilvx(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_Fcilnvx, /*lineNumber:*/Active_Fcilnvx_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #invertMatch v}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_Fcilvx_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_Fcilnvx, /*lineNumber:*/Active_Fcilnvx_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #ignoreCase i}, {@link #invertMatch v}, {@link #lineNumber n}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_cilnvx(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcilnvx, /*fixedStrings:*/Active_Fcilnvx_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.count, GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #ignoreCase i}, {@link #invertMatch v}, {@link #lineNumber n}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_cilnvx_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcilnvx, /*fixedStrings:*/Active_Fcilnvx_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.count, GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #lineNumber n}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_Fcilnx(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_Fcilnvx, /*invertMatch:*/Active_Fcilnvx_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.lineNumber, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #lineNumber n}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_Fcilnx_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_Fcilnvx, /*invertMatch:*/Active_Fcilnvx_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.lineNumber, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #invertMatch v}, {@link #lineNumber n}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_Fclnvx(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fcilnvx, /*ignoreCase:*/Active_Fcilnvx_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #invertMatch v}, {@link #lineNumber n}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_Fclnvx_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fcilnvx, /*ignoreCase:*/Active_Fcilnvx_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #invertMatch v}, {@link #lineNumber n}.
     */
    Active_Fcinv(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_Fcilnv, /*matchingFiles:*/Active_Fcilnv_long, /*x:*/Active_Fcinvx, /*wholeLine:*/Active_Fcinvx_long,
            true,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #invertMatch v}, {@link #lineNumber n}.
     */
    Active_Fcinv_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_Fcilnv, /*matchingFiles:*/Active_Fcilnv_long, /*x:*/Active_Fcinvx, /*wholeLine:*/Active_Fcinvx_long,
            false,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #invertMatch v}, {@link #lineNumber n}, {@link #matchingFiles l}.
     */
    Active_Filnv(
		/*c:*/Active_Fcilnv, /*count:*/Active_Fcilnv_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_Filnvx, /*wholeLine:*/Active_Filnvx_long,
            true,
		/*active:*/GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #invertMatch v}, {@link #lineNumber n}, {@link #matchingFiles l}.
     */
    Active_Filnv_long(
		/*c:*/Active_Fcilnv, /*count:*/Active_Fcilnv_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_Filnvx, /*wholeLine:*/Active_Filnvx_long,
            false,
		/*active:*/GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #invertMatch v}, {@link #lineNumber n}, {@link #wholeLine x}.
     */
    Active_Finvx(
		/*c:*/Active_Fcinvx, /*count:*/Active_Fcinvx_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_Filnvx, /*matchingFiles:*/Active_Filnvx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #invertMatch v}, {@link #lineNumber n}, {@link #wholeLine x}.
     */
    Active_Finvx_long(
		/*c:*/Active_Fcinvx, /*count:*/Active_Fcinvx_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_Filnvx, /*matchingFiles:*/Active_Filnvx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #invertMatch v}, {@link #matchingFiles l}.
     */
    Active_Fcilv(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_Fcilnv, /*lineNumber:*/Active_Fcilnv_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_Fcilvx, /*wholeLine:*/Active_Fcilvx_long,
            true,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #invertMatch v}, {@link #matchingFiles l}.
     */
    Active_Fcilv_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_Fcilnv, /*lineNumber:*/Active_Fcilnv_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_Fcilvx, /*wholeLine:*/Active_Fcilvx_long,
            false,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #invertMatch v}, {@link #wholeLine x}.
     */
    Active_Fcivx(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_Fcinvx, /*lineNumber:*/Active_Fcinvx_long, /*l:*/Active_Fcilvx, /*matchingFiles:*/Active_Fcilvx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #invertMatch v}, {@link #wholeLine x}.
     */
    Active_Fcivx_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_Fcinvx, /*lineNumber:*/Active_Fcinvx_long, /*l:*/Active_Fcilvx, /*matchingFiles:*/Active_Fcilvx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #invertMatch v}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_Filvx(
		/*c:*/Active_Fcilvx, /*count:*/Active_Fcilvx_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_Filnvx, /*lineNumber:*/Active_Filnvx_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #invertMatch v}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_Filvx_long(
		/*c:*/Active_Fcilvx, /*count:*/Active_Fcilvx_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_Filnvx, /*lineNumber:*/Active_Filnvx_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #ignoreCase i}, {@link #invertMatch v}, {@link #lineNumber n}, {@link #matchingFiles l}.
     */
    Active_cilnv(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcilnv, /*fixedStrings:*/Active_Fcilnv_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_cilnvx, /*wholeLine:*/Active_cilnvx_long,
            true,
		/*active:*/GrepOption.count, GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #ignoreCase i}, {@link #invertMatch v}, {@link #lineNumber n}, {@link #matchingFiles l}.
     */
    Active_cilnv_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcilnv, /*fixedStrings:*/Active_Fcilnv_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_cilnvx, /*wholeLine:*/Active_cilnvx_long,
            false,
		/*active:*/GrepOption.count, GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #ignoreCase i}, {@link #invertMatch v}, {@link #lineNumber n}, {@link #wholeLine x}.
     */
    Active_cinvx(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcinvx, /*fixedStrings:*/Active_Fcinvx_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_cilnvx, /*matchingFiles:*/Active_cilnvx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.count, GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #ignoreCase i}, {@link #invertMatch v}, {@link #lineNumber n}, {@link #wholeLine x}.
     */
    Active_cinvx_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcinvx, /*fixedStrings:*/Active_Fcinvx_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_cilnvx, /*matchingFiles:*/Active_cilnvx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.count, GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #invertMatch v}, {@link #lineNumber n}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_ilnvx(
		/*c:*/Active_cilnvx, /*count:*/Active_cilnvx_long, /*F:*/Active_Filnvx, /*fixedStrings:*/Active_Filnvx_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #invertMatch v}, {@link #lineNumber n}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_ilnvx_long(
		/*c:*/Active_cilnvx, /*count:*/Active_cilnvx_long, /*F:*/Active_Filnvx, /*fixedStrings:*/Active_Filnvx_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #ignoreCase i}, {@link #invertMatch v}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_cilvx(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcilvx, /*fixedStrings:*/Active_Fcilvx_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_cilnvx, /*lineNumber:*/Active_cilnvx_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.count, GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #ignoreCase i}, {@link #invertMatch v}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_cilvx_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcilvx, /*fixedStrings:*/Active_Fcilvx_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_cilnvx, /*lineNumber:*/Active_cilnvx_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.count, GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #lineNumber n}, {@link #matchingFiles l}.
     */
    Active_Fciln(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_Fcilnv, /*invertMatch:*/Active_Fcilnv_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_Fcilnx, /*wholeLine:*/Active_Fcilnx_long,
            true,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.lineNumber, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #lineNumber n}, {@link #matchingFiles l}.
     */
    Active_Fciln_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_Fcilnv, /*invertMatch:*/Active_Fcilnv_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_Fcilnx, /*wholeLine:*/Active_Fcilnx_long,
            false,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.lineNumber, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #lineNumber n}, {@link #wholeLine x}.
     */
    Active_Fcinx(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_Fcinvx, /*invertMatch:*/Active_Fcinvx_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_Fcilnx, /*matchingFiles:*/Active_Fcilnx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.lineNumber, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #lineNumber n}, {@link #wholeLine x}.
     */
    Active_Fcinx_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_Fcinvx, /*invertMatch:*/Active_Fcinvx_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_Fcilnx, /*matchingFiles:*/Active_Fcilnx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.lineNumber, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #lineNumber n}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_Filnx(
		/*c:*/Active_Fcilnx, /*count:*/Active_Fcilnx_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_Filnvx, /*invertMatch:*/Active_Filnvx_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.lineNumber, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #lineNumber n}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_Filnx_long(
		/*c:*/Active_Fcilnx, /*count:*/Active_Fcilnx_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_Filnvx, /*invertMatch:*/Active_Filnvx_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.lineNumber, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_Fcilx(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_Fcilvx, /*invertMatch:*/Active_Fcilvx_long, /*n:*/Active_Fcilnx, /*lineNumber:*/Active_Fcilnx_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_Fcilx_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_Fcilvx, /*invertMatch:*/Active_Fcilvx_long, /*n:*/Active_Fcilnx, /*lineNumber:*/Active_Fcilnx_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #ignoreCase i}, {@link #lineNumber n}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_cilnx(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcilnx, /*fixedStrings:*/Active_Fcilnx_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_cilnvx, /*invertMatch:*/Active_cilnvx_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.count, GrepOption.ignoreCase, GrepOption.lineNumber, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #ignoreCase i}, {@link #lineNumber n}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_cilnx_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcilnx, /*fixedStrings:*/Active_Fcilnx_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_cilnvx, /*invertMatch:*/Active_cilnvx_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.count, GrepOption.ignoreCase, GrepOption.lineNumber, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #invertMatch v}, {@link #lineNumber n}, {@link #matchingFiles l}.
     */
    Active_Fclnv(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fcilnv, /*ignoreCase:*/Active_Fcilnv_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_Fclnvx, /*wholeLine:*/Active_Fclnvx_long,
            true,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #invertMatch v}, {@link #lineNumber n}, {@link #matchingFiles l}.
     */
    Active_Fclnv_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fcilnv, /*ignoreCase:*/Active_Fcilnv_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_Fclnvx, /*wholeLine:*/Active_Fclnvx_long,
            false,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #invertMatch v}, {@link #lineNumber n}, {@link #wholeLine x}.
     */
    Active_Fcnvx(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fcinvx, /*ignoreCase:*/Active_Fcinvx_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_Fclnvx, /*matchingFiles:*/Active_Fclnvx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #invertMatch v}, {@link #lineNumber n}, {@link #wholeLine x}.
     */
    Active_Fcnvx_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fcinvx, /*ignoreCase:*/Active_Fcinvx_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_Fclnvx, /*matchingFiles:*/Active_Fclnvx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #invertMatch v}, {@link #lineNumber n}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_Flnvx(
		/*c:*/Active_Fclnvx, /*count:*/Active_Fclnvx_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Filnvx, /*ignoreCase:*/Active_Filnvx_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.fixedStrings, GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #invertMatch v}, {@link #lineNumber n}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_Flnvx_long(
		/*c:*/Active_Fclnvx, /*count:*/Active_Fclnvx_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Filnvx, /*ignoreCase:*/Active_Filnvx_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.fixedStrings, GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #invertMatch v}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_Fclvx(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fcilvx, /*ignoreCase:*/Active_Fcilvx_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_Fclnvx, /*lineNumber:*/Active_Fclnvx_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.invertMatch, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #invertMatch v}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_Fclvx_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fcilvx, /*ignoreCase:*/Active_Fcilvx_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_Fclnvx, /*lineNumber:*/Active_Fclnvx_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.invertMatch, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #invertMatch v}, {@link #lineNumber n}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_clnvx(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fclnvx, /*fixedStrings:*/Active_Fclnvx_long, /*i:*/Active_cilnvx, /*ignoreCase:*/Active_cilnvx_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.count, GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #invertMatch v}, {@link #lineNumber n}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_clnvx_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fclnvx, /*fixedStrings:*/Active_Fclnvx_long, /*i:*/Active_cilnvx, /*ignoreCase:*/Active_cilnvx_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.count, GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #lineNumber n}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_Fclnx(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fcilnx, /*ignoreCase:*/Active_Fcilnx_long, /*v:*/Active_Fclnvx, /*invertMatch:*/Active_Fclnvx_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.lineNumber, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #lineNumber n}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_Fclnx_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fcilnx, /*ignoreCase:*/Active_Fcilnx_long, /*v:*/Active_Fclnvx, /*invertMatch:*/Active_Fclnvx_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.lineNumber, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #invertMatch v}, {@link #lineNumber n}.
     */
    Active_Finv(
		/*c:*/Active_Fcinv, /*count:*/Active_Fcinv_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_Filnv, /*matchingFiles:*/Active_Filnv_long, /*x:*/Active_Finvx, /*wholeLine:*/Active_Finvx_long,
            true,
		/*active:*/GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #invertMatch v}, {@link #lineNumber n}.
     */
    Active_Finv_long(
		/*c:*/Active_Fcinv, /*count:*/Active_Fcinv_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_Filnv, /*matchingFiles:*/Active_Filnv_long, /*x:*/Active_Finvx, /*wholeLine:*/Active_Finvx_long,
            false,
		/*active:*/GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #invertMatch v}.
     */
    Active_Fciv(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_Fcinv, /*lineNumber:*/Active_Fcinv_long, /*l:*/Active_Fcilv, /*matchingFiles:*/Active_Fcilv_long, /*x:*/Active_Fcivx, /*wholeLine:*/Active_Fcivx_long,
            true,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.invertMatch
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #invertMatch v}.
     */
    Active_Fciv_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_Fcinv, /*lineNumber:*/Active_Fcinv_long, /*l:*/Active_Fcilv, /*matchingFiles:*/Active_Fcilv_long, /*x:*/Active_Fcivx, /*wholeLine:*/Active_Fcivx_long,
            false,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.invertMatch
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #invertMatch v}, {@link #matchingFiles l}.
     */
    Active_Filv(
		/*c:*/Active_Fcilv, /*count:*/Active_Fcilv_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_Filnv, /*lineNumber:*/Active_Filnv_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_Filvx, /*wholeLine:*/Active_Filvx_long,
            true,
		/*active:*/GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #invertMatch v}, {@link #matchingFiles l}.
     */
    Active_Filv_long(
		/*c:*/Active_Fcilv, /*count:*/Active_Fcilv_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_Filnv, /*lineNumber:*/Active_Filnv_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_Filvx, /*wholeLine:*/Active_Filvx_long,
            false,
		/*active:*/GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #invertMatch v}, {@link #wholeLine x}.
     */
    Active_Fivx(
		/*c:*/Active_Fcivx, /*count:*/Active_Fcivx_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_Finvx, /*lineNumber:*/Active_Finvx_long, /*l:*/Active_Filvx, /*matchingFiles:*/Active_Filvx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #invertMatch v}, {@link #wholeLine x}.
     */
    Active_Fivx_long(
		/*c:*/Active_Fcivx, /*count:*/Active_Fcivx_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_Finvx, /*lineNumber:*/Active_Finvx_long, /*l:*/Active_Filvx, /*matchingFiles:*/Active_Filvx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #ignoreCase i}, {@link #invertMatch v}, {@link #lineNumber n}.
     */
    Active_cinv(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcinv, /*fixedStrings:*/Active_Fcinv_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_cilnv, /*matchingFiles:*/Active_cilnv_long, /*x:*/Active_cinvx, /*wholeLine:*/Active_cinvx_long,
            true,
		/*active:*/GrepOption.count, GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #ignoreCase i}, {@link #invertMatch v}, {@link #lineNumber n}.
     */
    Active_cinv_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcinv, /*fixedStrings:*/Active_Fcinv_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_cilnv, /*matchingFiles:*/Active_cilnv_long, /*x:*/Active_cinvx, /*wholeLine:*/Active_cinvx_long,
            false,
		/*active:*/GrepOption.count, GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #invertMatch v}, {@link #lineNumber n}, {@link #matchingFiles l}.
     */
    Active_ilnv(
		/*c:*/Active_cilnv, /*count:*/Active_cilnv_long, /*F:*/Active_Filnv, /*fixedStrings:*/Active_Filnv_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_ilnvx, /*wholeLine:*/Active_ilnvx_long,
            true,
		/*active:*/GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #invertMatch v}, {@link #lineNumber n}, {@link #matchingFiles l}.
     */
    Active_ilnv_long(
		/*c:*/Active_cilnv, /*count:*/Active_cilnv_long, /*F:*/Active_Filnv, /*fixedStrings:*/Active_Filnv_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_ilnvx, /*wholeLine:*/Active_ilnvx_long,
            false,
		/*active:*/GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #invertMatch v}, {@link #lineNumber n}, {@link #wholeLine x}.
     */
    Active_invx(
		/*c:*/Active_cinvx, /*count:*/Active_cinvx_long, /*F:*/Active_Finvx, /*fixedStrings:*/Active_Finvx_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_ilnvx, /*matchingFiles:*/Active_ilnvx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #invertMatch v}, {@link #lineNumber n}, {@link #wholeLine x}.
     */
    Active_invx_long(
		/*c:*/Active_cinvx, /*count:*/Active_cinvx_long, /*F:*/Active_Finvx, /*fixedStrings:*/Active_Finvx_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_ilnvx, /*matchingFiles:*/Active_ilnvx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #ignoreCase i}, {@link #invertMatch v}, {@link #matchingFiles l}.
     */
    Active_cilv(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcilv, /*fixedStrings:*/Active_Fcilv_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_cilnv, /*lineNumber:*/Active_cilnv_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_cilvx, /*wholeLine:*/Active_cilvx_long,
            true,
		/*active:*/GrepOption.count, GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #ignoreCase i}, {@link #invertMatch v}, {@link #matchingFiles l}.
     */
    Active_cilv_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcilv, /*fixedStrings:*/Active_Fcilv_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_cilnv, /*lineNumber:*/Active_cilnv_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_cilvx, /*wholeLine:*/Active_cilvx_long,
            false,
		/*active:*/GrepOption.count, GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #ignoreCase i}, {@link #invertMatch v}, {@link #wholeLine x}.
     */
    Active_civx(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcivx, /*fixedStrings:*/Active_Fcivx_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_cinvx, /*lineNumber:*/Active_cinvx_long, /*l:*/Active_cilvx, /*matchingFiles:*/Active_cilvx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.count, GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #ignoreCase i}, {@link #invertMatch v}, {@link #wholeLine x}.
     */
    Active_civx_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcivx, /*fixedStrings:*/Active_Fcivx_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_cinvx, /*lineNumber:*/Active_cinvx_long, /*l:*/Active_cilvx, /*matchingFiles:*/Active_cilvx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.count, GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #invertMatch v}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_ilvx(
		/*c:*/Active_cilvx, /*count:*/Active_cilvx_long, /*F:*/Active_Filvx, /*fixedStrings:*/Active_Filvx_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_ilnvx, /*lineNumber:*/Active_ilnvx_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #invertMatch v}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_ilvx_long(
		/*c:*/Active_cilvx, /*count:*/Active_cilvx_long, /*F:*/Active_Filvx, /*fixedStrings:*/Active_Filvx_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_ilnvx, /*lineNumber:*/Active_ilnvx_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #lineNumber n}.
     */
    Active_Fcin(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_Fcinv, /*invertMatch:*/Active_Fcinv_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_Fciln, /*matchingFiles:*/Active_Fciln_long, /*x:*/Active_Fcinx, /*wholeLine:*/Active_Fcinx_long,
            true,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #lineNumber n}.
     */
    Active_Fcin_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_Fcinv, /*invertMatch:*/Active_Fcinv_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_Fciln, /*matchingFiles:*/Active_Fciln_long, /*x:*/Active_Fcinx, /*wholeLine:*/Active_Fcinx_long,
            false,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #lineNumber n}, {@link #matchingFiles l}.
     */
    Active_Filn(
		/*c:*/Active_Fciln, /*count:*/Active_Fciln_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_Filnv, /*invertMatch:*/Active_Filnv_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_Filnx, /*wholeLine:*/Active_Filnx_long,
            true,
		/*active:*/GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.lineNumber, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #lineNumber n}, {@link #matchingFiles l}.
     */
    Active_Filn_long(
		/*c:*/Active_Fciln, /*count:*/Active_Fciln_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_Filnv, /*invertMatch:*/Active_Filnv_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_Filnx, /*wholeLine:*/Active_Filnx_long,
            false,
		/*active:*/GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.lineNumber, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #lineNumber n}, {@link #wholeLine x}.
     */
    Active_Finx(
		/*c:*/Active_Fcinx, /*count:*/Active_Fcinx_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_Finvx, /*invertMatch:*/Active_Finvx_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_Filnx, /*matchingFiles:*/Active_Filnx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.lineNumber, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #lineNumber n}, {@link #wholeLine x}.
     */
    Active_Finx_long(
		/*c:*/Active_Fcinx, /*count:*/Active_Fcinx_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_Finvx, /*invertMatch:*/Active_Finvx_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_Filnx, /*matchingFiles:*/Active_Filnx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.lineNumber, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #matchingFiles l}.
     */
    Active_Fcil(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_Fcilv, /*invertMatch:*/Active_Fcilv_long, /*n:*/Active_Fciln, /*lineNumber:*/Active_Fciln_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_Fcilx, /*wholeLine:*/Active_Fcilx_long,
            true,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #matchingFiles l}.
     */
    Active_Fcil_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_Fcilv, /*invertMatch:*/Active_Fcilv_long, /*n:*/Active_Fciln, /*lineNumber:*/Active_Fciln_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_Fcilx, /*wholeLine:*/Active_Fcilx_long,
            false,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #wholeLine x}.
     */
    Active_Fcix(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_Fcivx, /*invertMatch:*/Active_Fcivx_long, /*n:*/Active_Fcinx, /*lineNumber:*/Active_Fcinx_long, /*l:*/Active_Fcilx, /*matchingFiles:*/Active_Fcilx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #wholeLine x}.
     */
    Active_Fcix_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_Fcivx, /*invertMatch:*/Active_Fcivx_long, /*n:*/Active_Fcinx, /*lineNumber:*/Active_Fcinx_long, /*l:*/Active_Fcilx, /*matchingFiles:*/Active_Fcilx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_Filx(
		/*c:*/Active_Fcilx, /*count:*/Active_Fcilx_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_Filvx, /*invertMatch:*/Active_Filvx_long, /*n:*/Active_Filnx, /*lineNumber:*/Active_Filnx_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_Filx_long(
		/*c:*/Active_Fcilx, /*count:*/Active_Fcilx_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_Filvx, /*invertMatch:*/Active_Filvx_long, /*n:*/Active_Filnx, /*lineNumber:*/Active_Filnx_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #ignoreCase i}, {@link #lineNumber n}, {@link #matchingFiles l}.
     */
    Active_ciln(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fciln, /*fixedStrings:*/Active_Fciln_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_cilnv, /*invertMatch:*/Active_cilnv_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_cilnx, /*wholeLine:*/Active_cilnx_long,
            true,
		/*active:*/GrepOption.count, GrepOption.ignoreCase, GrepOption.lineNumber, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #ignoreCase i}, {@link #lineNumber n}, {@link #matchingFiles l}.
     */
    Active_ciln_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fciln, /*fixedStrings:*/Active_Fciln_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_cilnv, /*invertMatch:*/Active_cilnv_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_cilnx, /*wholeLine:*/Active_cilnx_long,
            false,
		/*active:*/GrepOption.count, GrepOption.ignoreCase, GrepOption.lineNumber, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #ignoreCase i}, {@link #lineNumber n}, {@link #wholeLine x}.
     */
    Active_cinx(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcinx, /*fixedStrings:*/Active_Fcinx_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_cinvx, /*invertMatch:*/Active_cinvx_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_cilnx, /*matchingFiles:*/Active_cilnx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.count, GrepOption.ignoreCase, GrepOption.lineNumber, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #ignoreCase i}, {@link #lineNumber n}, {@link #wholeLine x}.
     */
    Active_cinx_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcinx, /*fixedStrings:*/Active_Fcinx_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_cinvx, /*invertMatch:*/Active_cinvx_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_cilnx, /*matchingFiles:*/Active_cilnx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.count, GrepOption.ignoreCase, GrepOption.lineNumber, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #lineNumber n}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_ilnx(
		/*c:*/Active_cilnx, /*count:*/Active_cilnx_long, /*F:*/Active_Filnx, /*fixedStrings:*/Active_Filnx_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_ilnvx, /*invertMatch:*/Active_ilnvx_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.ignoreCase, GrepOption.lineNumber, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #lineNumber n}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_ilnx_long(
		/*c:*/Active_cilnx, /*count:*/Active_cilnx_long, /*F:*/Active_Filnx, /*fixedStrings:*/Active_Filnx_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_ilnvx, /*invertMatch:*/Active_ilnvx_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.ignoreCase, GrepOption.lineNumber, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #ignoreCase i}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_cilx(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcilx, /*fixedStrings:*/Active_Fcilx_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_cilvx, /*invertMatch:*/Active_cilvx_long, /*n:*/Active_cilnx, /*lineNumber:*/Active_cilnx_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.count, GrepOption.ignoreCase, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #ignoreCase i}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_cilx_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcilx, /*fixedStrings:*/Active_Fcilx_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_cilvx, /*invertMatch:*/Active_cilvx_long, /*n:*/Active_cilnx, /*lineNumber:*/Active_cilnx_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.count, GrepOption.ignoreCase, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #invertMatch v}, {@link #lineNumber n}.
     */
    Active_Fcnv(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fcinv, /*ignoreCase:*/Active_Fcinv_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_Fclnv, /*matchingFiles:*/Active_Fclnv_long, /*x:*/Active_Fcnvx, /*wholeLine:*/Active_Fcnvx_long,
            true,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.invertMatch, GrepOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #invertMatch v}, {@link #lineNumber n}.
     */
    Active_Fcnv_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fcinv, /*ignoreCase:*/Active_Fcinv_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_Fclnv, /*matchingFiles:*/Active_Fclnv_long, /*x:*/Active_Fcnvx, /*wholeLine:*/Active_Fcnvx_long,
            false,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.invertMatch, GrepOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #invertMatch v}, {@link #lineNumber n}, {@link #matchingFiles l}.
     */
    Active_Flnv(
		/*c:*/Active_Fclnv, /*count:*/Active_Fclnv_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Filnv, /*ignoreCase:*/Active_Filnv_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_Flnvx, /*wholeLine:*/Active_Flnvx_long,
            true,
		/*active:*/GrepOption.fixedStrings, GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #invertMatch v}, {@link #lineNumber n}, {@link #matchingFiles l}.
     */
    Active_Flnv_long(
		/*c:*/Active_Fclnv, /*count:*/Active_Fclnv_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Filnv, /*ignoreCase:*/Active_Filnv_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_Flnvx, /*wholeLine:*/Active_Flnvx_long,
            false,
		/*active:*/GrepOption.fixedStrings, GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #invertMatch v}, {@link #lineNumber n}, {@link #wholeLine x}.
     */
    Active_Fnvx(
		/*c:*/Active_Fcnvx, /*count:*/Active_Fcnvx_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Finvx, /*ignoreCase:*/Active_Finvx_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_Flnvx, /*matchingFiles:*/Active_Flnvx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.fixedStrings, GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #invertMatch v}, {@link #lineNumber n}, {@link #wholeLine x}.
     */
    Active_Fnvx_long(
		/*c:*/Active_Fcnvx, /*count:*/Active_Fcnvx_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Finvx, /*ignoreCase:*/Active_Finvx_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_Flnvx, /*matchingFiles:*/Active_Flnvx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.fixedStrings, GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #invertMatch v}, {@link #matchingFiles l}.
     */
    Active_Fclv(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fcilv, /*ignoreCase:*/Active_Fcilv_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_Fclnv, /*lineNumber:*/Active_Fclnv_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_Fclvx, /*wholeLine:*/Active_Fclvx_long,
            true,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.invertMatch, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #invertMatch v}, {@link #matchingFiles l}.
     */
    Active_Fclv_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fcilv, /*ignoreCase:*/Active_Fcilv_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_Fclnv, /*lineNumber:*/Active_Fclnv_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_Fclvx, /*wholeLine:*/Active_Fclvx_long,
            false,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.invertMatch, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #invertMatch v}, {@link #wholeLine x}.
     */
    Active_Fcvx(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fcivx, /*ignoreCase:*/Active_Fcivx_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_Fcnvx, /*lineNumber:*/Active_Fcnvx_long, /*l:*/Active_Fclvx, /*matchingFiles:*/Active_Fclvx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.invertMatch, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #invertMatch v}, {@link #wholeLine x}.
     */
    Active_Fcvx_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fcivx, /*ignoreCase:*/Active_Fcivx_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_Fcnvx, /*lineNumber:*/Active_Fcnvx_long, /*l:*/Active_Fclvx, /*matchingFiles:*/Active_Fclvx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.invertMatch, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #invertMatch v}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_Flvx(
		/*c:*/Active_Fclvx, /*count:*/Active_Fclvx_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Filvx, /*ignoreCase:*/Active_Filvx_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_Flnvx, /*lineNumber:*/Active_Flnvx_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.fixedStrings, GrepOption.invertMatch, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #invertMatch v}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_Flvx_long(
		/*c:*/Active_Fclvx, /*count:*/Active_Fclvx_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Filvx, /*ignoreCase:*/Active_Filvx_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_Flnvx, /*lineNumber:*/Active_Flnvx_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.fixedStrings, GrepOption.invertMatch, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #invertMatch v}, {@link #lineNumber n}, {@link #matchingFiles l}.
     */
    Active_clnv(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fclnv, /*fixedStrings:*/Active_Fclnv_long, /*i:*/Active_cilnv, /*ignoreCase:*/Active_cilnv_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_clnvx, /*wholeLine:*/Active_clnvx_long,
            true,
		/*active:*/GrepOption.count, GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #invertMatch v}, {@link #lineNumber n}, {@link #matchingFiles l}.
     */
    Active_clnv_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fclnv, /*fixedStrings:*/Active_Fclnv_long, /*i:*/Active_cilnv, /*ignoreCase:*/Active_cilnv_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_clnvx, /*wholeLine:*/Active_clnvx_long,
            false,
		/*active:*/GrepOption.count, GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #invertMatch v}, {@link #lineNumber n}, {@link #wholeLine x}.
     */
    Active_cnvx(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcnvx, /*fixedStrings:*/Active_Fcnvx_long, /*i:*/Active_cinvx, /*ignoreCase:*/Active_cinvx_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_clnvx, /*matchingFiles:*/Active_clnvx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.count, GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #invertMatch v}, {@link #lineNumber n}, {@link #wholeLine x}.
     */
    Active_cnvx_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcnvx, /*fixedStrings:*/Active_Fcnvx_long, /*i:*/Active_cinvx, /*ignoreCase:*/Active_cinvx_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_clnvx, /*matchingFiles:*/Active_clnvx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.count, GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #invertMatch v}, {@link #lineNumber n}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_lnvx(
		/*c:*/Active_clnvx, /*count:*/Active_clnvx_long, /*F:*/Active_Flnvx, /*fixedStrings:*/Active_Flnvx_long, /*i:*/Active_ilnvx, /*ignoreCase:*/Active_ilnvx_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #invertMatch v}, {@link #lineNumber n}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_lnvx_long(
		/*c:*/Active_clnvx, /*count:*/Active_clnvx_long, /*F:*/Active_Flnvx, /*fixedStrings:*/Active_Flnvx_long, /*i:*/Active_ilnvx, /*ignoreCase:*/Active_ilnvx_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #invertMatch v}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_clvx(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fclvx, /*fixedStrings:*/Active_Fclvx_long, /*i:*/Active_cilvx, /*ignoreCase:*/Active_cilvx_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_clnvx, /*lineNumber:*/Active_clnvx_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.count, GrepOption.invertMatch, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #invertMatch v}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_clvx_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fclvx, /*fixedStrings:*/Active_Fclvx_long, /*i:*/Active_cilvx, /*ignoreCase:*/Active_cilvx_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_clnvx, /*lineNumber:*/Active_clnvx_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.count, GrepOption.invertMatch, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #lineNumber n}, {@link #matchingFiles l}.
     */
    Active_Fcln(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fciln, /*ignoreCase:*/Active_Fciln_long, /*v:*/Active_Fclnv, /*invertMatch:*/Active_Fclnv_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_Fclnx, /*wholeLine:*/Active_Fclnx_long,
            true,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.lineNumber, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #lineNumber n}, {@link #matchingFiles l}.
     */
    Active_Fcln_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fciln, /*ignoreCase:*/Active_Fciln_long, /*v:*/Active_Fclnv, /*invertMatch:*/Active_Fclnv_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_Fclnx, /*wholeLine:*/Active_Fclnx_long,
            false,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.lineNumber, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #lineNumber n}, {@link #wholeLine x}.
     */
    Active_Fcnx(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fcinx, /*ignoreCase:*/Active_Fcinx_long, /*v:*/Active_Fcnvx, /*invertMatch:*/Active_Fcnvx_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_Fclnx, /*matchingFiles:*/Active_Fclnx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.lineNumber, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #lineNumber n}, {@link #wholeLine x}.
     */
    Active_Fcnx_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fcinx, /*ignoreCase:*/Active_Fcinx_long, /*v:*/Active_Fcnvx, /*invertMatch:*/Active_Fcnvx_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_Fclnx, /*matchingFiles:*/Active_Fclnx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.lineNumber, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #lineNumber n}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_Flnx(
		/*c:*/Active_Fclnx, /*count:*/Active_Fclnx_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Filnx, /*ignoreCase:*/Active_Filnx_long, /*v:*/Active_Flnvx, /*invertMatch:*/Active_Flnvx_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.fixedStrings, GrepOption.lineNumber, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #lineNumber n}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_Flnx_long(
		/*c:*/Active_Fclnx, /*count:*/Active_Fclnx_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Filnx, /*ignoreCase:*/Active_Filnx_long, /*v:*/Active_Flnvx, /*invertMatch:*/Active_Flnvx_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.fixedStrings, GrepOption.lineNumber, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_Fclx(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fcilx, /*ignoreCase:*/Active_Fcilx_long, /*v:*/Active_Fclvx, /*invertMatch:*/Active_Fclvx_long, /*n:*/Active_Fclnx, /*lineNumber:*/Active_Fclnx_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_Fclx_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fcilx, /*ignoreCase:*/Active_Fcilx_long, /*v:*/Active_Fclvx, /*invertMatch:*/Active_Fclvx_long, /*n:*/Active_Fclnx, /*lineNumber:*/Active_Fclnx_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #lineNumber n}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_clnx(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fclnx, /*fixedStrings:*/Active_Fclnx_long, /*i:*/Active_cilnx, /*ignoreCase:*/Active_cilnx_long, /*v:*/Active_clnvx, /*invertMatch:*/Active_clnvx_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.count, GrepOption.lineNumber, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #lineNumber n}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_clnx_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fclnx, /*fixedStrings:*/Active_Fclnx_long, /*i:*/Active_cilnx, /*ignoreCase:*/Active_cilnx_long, /*v:*/Active_clnvx, /*invertMatch:*/Active_clnvx_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.count, GrepOption.lineNumber, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #invertMatch v}.
     */
    Active_Fiv(
		/*c:*/Active_Fciv, /*count:*/Active_Fciv_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_Finv, /*lineNumber:*/Active_Finv_long, /*l:*/Active_Filv, /*matchingFiles:*/Active_Filv_long, /*x:*/Active_Fivx, /*wholeLine:*/Active_Fivx_long,
            true,
		/*active:*/GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.invertMatch
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #invertMatch v}.
     */
    Active_Fiv_long(
		/*c:*/Active_Fciv, /*count:*/Active_Fciv_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_Finv, /*lineNumber:*/Active_Finv_long, /*l:*/Active_Filv, /*matchingFiles:*/Active_Filv_long, /*x:*/Active_Fivx, /*wholeLine:*/Active_Fivx_long,
            false,
		/*active:*/GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.invertMatch
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #invertMatch v}, {@link #lineNumber n}.
     */
    Active_inv(
		/*c:*/Active_cinv, /*count:*/Active_cinv_long, /*F:*/Active_Finv, /*fixedStrings:*/Active_Finv_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_ilnv, /*matchingFiles:*/Active_ilnv_long, /*x:*/Active_invx, /*wholeLine:*/Active_invx_long,
            true,
		/*active:*/GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #invertMatch v}, {@link #lineNumber n}.
     */
    Active_inv_long(
		/*c:*/Active_cinv, /*count:*/Active_cinv_long, /*F:*/Active_Finv, /*fixedStrings:*/Active_Finv_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_ilnv, /*matchingFiles:*/Active_ilnv_long, /*x:*/Active_invx, /*wholeLine:*/Active_invx_long,
            false,
		/*active:*/GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #ignoreCase i}, {@link #invertMatch v}.
     */
    Active_civ(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fciv, /*fixedStrings:*/Active_Fciv_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_cinv, /*lineNumber:*/Active_cinv_long, /*l:*/Active_cilv, /*matchingFiles:*/Active_cilv_long, /*x:*/Active_civx, /*wholeLine:*/Active_civx_long,
            true,
		/*active:*/GrepOption.count, GrepOption.ignoreCase, GrepOption.invertMatch
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #ignoreCase i}, {@link #invertMatch v}.
     */
    Active_civ_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fciv, /*fixedStrings:*/Active_Fciv_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_cinv, /*lineNumber:*/Active_cinv_long, /*l:*/Active_cilv, /*matchingFiles:*/Active_cilv_long, /*x:*/Active_civx, /*wholeLine:*/Active_civx_long,
            false,
		/*active:*/GrepOption.count, GrepOption.ignoreCase, GrepOption.invertMatch
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #invertMatch v}, {@link #matchingFiles l}.
     */
    Active_ilv(
		/*c:*/Active_cilv, /*count:*/Active_cilv_long, /*F:*/Active_Filv, /*fixedStrings:*/Active_Filv_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_ilnv, /*lineNumber:*/Active_ilnv_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_ilvx, /*wholeLine:*/Active_ilvx_long,
            true,
		/*active:*/GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #invertMatch v}, {@link #matchingFiles l}.
     */
    Active_ilv_long(
		/*c:*/Active_cilv, /*count:*/Active_cilv_long, /*F:*/Active_Filv, /*fixedStrings:*/Active_Filv_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_ilnv, /*lineNumber:*/Active_ilnv_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_ilvx, /*wholeLine:*/Active_ilvx_long,
            false,
		/*active:*/GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #invertMatch v}, {@link #wholeLine x}.
     */
    Active_ivx(
		/*c:*/Active_civx, /*count:*/Active_civx_long, /*F:*/Active_Fivx, /*fixedStrings:*/Active_Fivx_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_invx, /*lineNumber:*/Active_invx_long, /*l:*/Active_ilvx, /*matchingFiles:*/Active_ilvx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #invertMatch v}, {@link #wholeLine x}.
     */
    Active_ivx_long(
		/*c:*/Active_civx, /*count:*/Active_civx_long, /*F:*/Active_Fivx, /*fixedStrings:*/Active_Fivx_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_invx, /*lineNumber:*/Active_invx_long, /*l:*/Active_ilvx, /*matchingFiles:*/Active_ilvx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.ignoreCase, GrepOption.invertMatch, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #lineNumber n}.
     */
    Active_Fin(
		/*c:*/Active_Fcin, /*count:*/Active_Fcin_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_Finv, /*invertMatch:*/Active_Finv_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_Filn, /*matchingFiles:*/Active_Filn_long, /*x:*/Active_Finx, /*wholeLine:*/Active_Finx_long,
            true,
		/*active:*/GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #lineNumber n}.
     */
    Active_Fin_long(
		/*c:*/Active_Fcin, /*count:*/Active_Fcin_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_Finv, /*invertMatch:*/Active_Finv_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_Filn, /*matchingFiles:*/Active_Filn_long, /*x:*/Active_Finx, /*wholeLine:*/Active_Finx_long,
            false,
		/*active:*/GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #ignoreCase i}.
     */
    Active_Fci(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_Fciv, /*invertMatch:*/Active_Fciv_long, /*n:*/Active_Fcin, /*lineNumber:*/Active_Fcin_long, /*l:*/Active_Fcil, /*matchingFiles:*/Active_Fcil_long, /*x:*/Active_Fcix, /*wholeLine:*/Active_Fcix_long,
            true,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.ignoreCase
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #ignoreCase i}.
     */
    Active_Fci_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_Fciv, /*invertMatch:*/Active_Fciv_long, /*n:*/Active_Fcin, /*lineNumber:*/Active_Fcin_long, /*l:*/Active_Fcil, /*matchingFiles:*/Active_Fcil_long, /*x:*/Active_Fcix, /*wholeLine:*/Active_Fcix_long,
            false,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.ignoreCase
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #matchingFiles l}.
     */
    Active_Fil(
		/*c:*/Active_Fcil, /*count:*/Active_Fcil_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_Filv, /*invertMatch:*/Active_Filv_long, /*n:*/Active_Filn, /*lineNumber:*/Active_Filn_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_Filx, /*wholeLine:*/Active_Filx_long,
            true,
		/*active:*/GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #matchingFiles l}.
     */
    Active_Fil_long(
		/*c:*/Active_Fcil, /*count:*/Active_Fcil_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_Filv, /*invertMatch:*/Active_Filv_long, /*n:*/Active_Filn, /*lineNumber:*/Active_Filn_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_Filx, /*wholeLine:*/Active_Filx_long,
            false,
		/*active:*/GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #wholeLine x}.
     */
    Active_Fix(
		/*c:*/Active_Fcix, /*count:*/Active_Fcix_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_Fivx, /*invertMatch:*/Active_Fivx_long, /*n:*/Active_Finx, /*lineNumber:*/Active_Finx_long, /*l:*/Active_Filx, /*matchingFiles:*/Active_Filx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #ignoreCase i}, {@link #wholeLine x}.
     */
    Active_Fix_long(
		/*c:*/Active_Fcix, /*count:*/Active_Fcix_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_Fivx, /*invertMatch:*/Active_Fivx_long, /*n:*/Active_Finx, /*lineNumber:*/Active_Finx_long, /*l:*/Active_Filx, /*matchingFiles:*/Active_Filx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.fixedStrings, GrepOption.ignoreCase, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #ignoreCase i}, {@link #lineNumber n}.
     */
    Active_cin(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcin, /*fixedStrings:*/Active_Fcin_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_cinv, /*invertMatch:*/Active_cinv_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_ciln, /*matchingFiles:*/Active_ciln_long, /*x:*/Active_cinx, /*wholeLine:*/Active_cinx_long,
            true,
		/*active:*/GrepOption.count, GrepOption.ignoreCase, GrepOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #ignoreCase i}, {@link #lineNumber n}.
     */
    Active_cin_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcin, /*fixedStrings:*/Active_Fcin_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_cinv, /*invertMatch:*/Active_cinv_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_ciln, /*matchingFiles:*/Active_ciln_long, /*x:*/Active_cinx, /*wholeLine:*/Active_cinx_long,
            false,
		/*active:*/GrepOption.count, GrepOption.ignoreCase, GrepOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #lineNumber n}, {@link #matchingFiles l}.
     */
    Active_iln(
		/*c:*/Active_ciln, /*count:*/Active_ciln_long, /*F:*/Active_Filn, /*fixedStrings:*/Active_Filn_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_ilnv, /*invertMatch:*/Active_ilnv_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_ilnx, /*wholeLine:*/Active_ilnx_long,
            true,
		/*active:*/GrepOption.ignoreCase, GrepOption.lineNumber, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #lineNumber n}, {@link #matchingFiles l}.
     */
    Active_iln_long(
		/*c:*/Active_ciln, /*count:*/Active_ciln_long, /*F:*/Active_Filn, /*fixedStrings:*/Active_Filn_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_ilnv, /*invertMatch:*/Active_ilnv_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_ilnx, /*wholeLine:*/Active_ilnx_long,
            false,
		/*active:*/GrepOption.ignoreCase, GrepOption.lineNumber, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #lineNumber n}, {@link #wholeLine x}.
     */
    Active_inx(
		/*c:*/Active_cinx, /*count:*/Active_cinx_long, /*F:*/Active_Finx, /*fixedStrings:*/Active_Finx_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_invx, /*invertMatch:*/Active_invx_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_ilnx, /*matchingFiles:*/Active_ilnx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.ignoreCase, GrepOption.lineNumber, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #lineNumber n}, {@link #wholeLine x}.
     */
    Active_inx_long(
		/*c:*/Active_cinx, /*count:*/Active_cinx_long, /*F:*/Active_Finx, /*fixedStrings:*/Active_Finx_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_invx, /*invertMatch:*/Active_invx_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_ilnx, /*matchingFiles:*/Active_ilnx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.ignoreCase, GrepOption.lineNumber, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #ignoreCase i}, {@link #matchingFiles l}.
     */
    Active_cil(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcil, /*fixedStrings:*/Active_Fcil_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_cilv, /*invertMatch:*/Active_cilv_long, /*n:*/Active_ciln, /*lineNumber:*/Active_ciln_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_cilx, /*wholeLine:*/Active_cilx_long,
            true,
		/*active:*/GrepOption.count, GrepOption.ignoreCase, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #ignoreCase i}, {@link #matchingFiles l}.
     */
    Active_cil_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcil, /*fixedStrings:*/Active_Fcil_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_cilv, /*invertMatch:*/Active_cilv_long, /*n:*/Active_ciln, /*lineNumber:*/Active_ciln_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_cilx, /*wholeLine:*/Active_cilx_long,
            false,
		/*active:*/GrepOption.count, GrepOption.ignoreCase, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #ignoreCase i}, {@link #wholeLine x}.
     */
    Active_cix(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcix, /*fixedStrings:*/Active_Fcix_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_civx, /*invertMatch:*/Active_civx_long, /*n:*/Active_cinx, /*lineNumber:*/Active_cinx_long, /*l:*/Active_cilx, /*matchingFiles:*/Active_cilx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.count, GrepOption.ignoreCase, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #ignoreCase i}, {@link #wholeLine x}.
     */
    Active_cix_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcix, /*fixedStrings:*/Active_Fcix_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_civx, /*invertMatch:*/Active_civx_long, /*n:*/Active_cinx, /*lineNumber:*/Active_cinx_long, /*l:*/Active_cilx, /*matchingFiles:*/Active_cilx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.count, GrepOption.ignoreCase, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_ilx(
		/*c:*/Active_cilx, /*count:*/Active_cilx_long, /*F:*/Active_Filx, /*fixedStrings:*/Active_Filx_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_ilvx, /*invertMatch:*/Active_ilvx_long, /*n:*/Active_ilnx, /*lineNumber:*/Active_ilnx_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.ignoreCase, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_ilx_long(
		/*c:*/Active_cilx, /*count:*/Active_cilx_long, /*F:*/Active_Filx, /*fixedStrings:*/Active_Filx_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_ilvx, /*invertMatch:*/Active_ilvx_long, /*n:*/Active_ilnx, /*lineNumber:*/Active_ilnx_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.ignoreCase, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #invertMatch v}, {@link #lineNumber n}.
     */
    Active_Fnv(
		/*c:*/Active_Fcnv, /*count:*/Active_Fcnv_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Finv, /*ignoreCase:*/Active_Finv_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_Flnv, /*matchingFiles:*/Active_Flnv_long, /*x:*/Active_Fnvx, /*wholeLine:*/Active_Fnvx_long,
            true,
		/*active:*/GrepOption.fixedStrings, GrepOption.invertMatch, GrepOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #invertMatch v}, {@link #lineNumber n}.
     */
    Active_Fnv_long(
		/*c:*/Active_Fcnv, /*count:*/Active_Fcnv_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Finv, /*ignoreCase:*/Active_Finv_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_Flnv, /*matchingFiles:*/Active_Flnv_long, /*x:*/Active_Fnvx, /*wholeLine:*/Active_Fnvx_long,
            false,
		/*active:*/GrepOption.fixedStrings, GrepOption.invertMatch, GrepOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #invertMatch v}.
     */
    Active_Fcv(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fciv, /*ignoreCase:*/Active_Fciv_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_Fcnv, /*lineNumber:*/Active_Fcnv_long, /*l:*/Active_Fclv, /*matchingFiles:*/Active_Fclv_long, /*x:*/Active_Fcvx, /*wholeLine:*/Active_Fcvx_long,
            true,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.invertMatch
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #invertMatch v}.
     */
    Active_Fcv_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fciv, /*ignoreCase:*/Active_Fciv_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_Fcnv, /*lineNumber:*/Active_Fcnv_long, /*l:*/Active_Fclv, /*matchingFiles:*/Active_Fclv_long, /*x:*/Active_Fcvx, /*wholeLine:*/Active_Fcvx_long,
            false,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.invertMatch
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #invertMatch v}, {@link #matchingFiles l}.
     */
    Active_Flv(
		/*c:*/Active_Fclv, /*count:*/Active_Fclv_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Filv, /*ignoreCase:*/Active_Filv_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_Flnv, /*lineNumber:*/Active_Flnv_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_Flvx, /*wholeLine:*/Active_Flvx_long,
            true,
		/*active:*/GrepOption.fixedStrings, GrepOption.invertMatch, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #invertMatch v}, {@link #matchingFiles l}.
     */
    Active_Flv_long(
		/*c:*/Active_Fclv, /*count:*/Active_Fclv_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Filv, /*ignoreCase:*/Active_Filv_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_Flnv, /*lineNumber:*/Active_Flnv_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_Flvx, /*wholeLine:*/Active_Flvx_long,
            false,
		/*active:*/GrepOption.fixedStrings, GrepOption.invertMatch, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #invertMatch v}, {@link #wholeLine x}.
     */
    Active_Fvx(
		/*c:*/Active_Fcvx, /*count:*/Active_Fcvx_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fivx, /*ignoreCase:*/Active_Fivx_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_Fnvx, /*lineNumber:*/Active_Fnvx_long, /*l:*/Active_Flvx, /*matchingFiles:*/Active_Flvx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.fixedStrings, GrepOption.invertMatch, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #invertMatch v}, {@link #wholeLine x}.
     */
    Active_Fvx_long(
		/*c:*/Active_Fcvx, /*count:*/Active_Fcvx_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fivx, /*ignoreCase:*/Active_Fivx_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_Fnvx, /*lineNumber:*/Active_Fnvx_long, /*l:*/Active_Flvx, /*matchingFiles:*/Active_Flvx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.fixedStrings, GrepOption.invertMatch, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #invertMatch v}, {@link #lineNumber n}.
     */
    Active_cnv(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcnv, /*fixedStrings:*/Active_Fcnv_long, /*i:*/Active_cinv, /*ignoreCase:*/Active_cinv_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_clnv, /*matchingFiles:*/Active_clnv_long, /*x:*/Active_cnvx, /*wholeLine:*/Active_cnvx_long,
            true,
		/*active:*/GrepOption.count, GrepOption.invertMatch, GrepOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #invertMatch v}, {@link #lineNumber n}.
     */
    Active_cnv_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcnv, /*fixedStrings:*/Active_Fcnv_long, /*i:*/Active_cinv, /*ignoreCase:*/Active_cinv_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_clnv, /*matchingFiles:*/Active_clnv_long, /*x:*/Active_cnvx, /*wholeLine:*/Active_cnvx_long,
            false,
		/*active:*/GrepOption.count, GrepOption.invertMatch, GrepOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #invertMatch v}, {@link #lineNumber n}, {@link #matchingFiles l}.
     */
    Active_lnv(
		/*c:*/Active_clnv, /*count:*/Active_clnv_long, /*F:*/Active_Flnv, /*fixedStrings:*/Active_Flnv_long, /*i:*/Active_ilnv, /*ignoreCase:*/Active_ilnv_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_lnvx, /*wholeLine:*/Active_lnvx_long,
            true,
		/*active:*/GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #invertMatch v}, {@link #lineNumber n}, {@link #matchingFiles l}.
     */
    Active_lnv_long(
		/*c:*/Active_clnv, /*count:*/Active_clnv_long, /*F:*/Active_Flnv, /*fixedStrings:*/Active_Flnv_long, /*i:*/Active_ilnv, /*ignoreCase:*/Active_ilnv_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_lnvx, /*wholeLine:*/Active_lnvx_long,
            false,
		/*active:*/GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #invertMatch v}, {@link #lineNumber n}, {@link #wholeLine x}.
     */
    Active_nvx(
		/*c:*/Active_cnvx, /*count:*/Active_cnvx_long, /*F:*/Active_Fnvx, /*fixedStrings:*/Active_Fnvx_long, /*i:*/Active_invx, /*ignoreCase:*/Active_invx_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_lnvx, /*matchingFiles:*/Active_lnvx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #invertMatch v}, {@link #lineNumber n}, {@link #wholeLine x}.
     */
    Active_nvx_long(
		/*c:*/Active_cnvx, /*count:*/Active_cnvx_long, /*F:*/Active_Fnvx, /*fixedStrings:*/Active_Fnvx_long, /*i:*/Active_invx, /*ignoreCase:*/Active_invx_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_lnvx, /*matchingFiles:*/Active_lnvx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.invertMatch, GrepOption.lineNumber, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #invertMatch v}, {@link #matchingFiles l}.
     */
    Active_clv(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fclv, /*fixedStrings:*/Active_Fclv_long, /*i:*/Active_cilv, /*ignoreCase:*/Active_cilv_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_clnv, /*lineNumber:*/Active_clnv_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_clvx, /*wholeLine:*/Active_clvx_long,
            true,
		/*active:*/GrepOption.count, GrepOption.invertMatch, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #invertMatch v}, {@link #matchingFiles l}.
     */
    Active_clv_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fclv, /*fixedStrings:*/Active_Fclv_long, /*i:*/Active_cilv, /*ignoreCase:*/Active_cilv_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_clnv, /*lineNumber:*/Active_clnv_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_clvx, /*wholeLine:*/Active_clvx_long,
            false,
		/*active:*/GrepOption.count, GrepOption.invertMatch, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #invertMatch v}, {@link #wholeLine x}.
     */
    Active_cvx(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcvx, /*fixedStrings:*/Active_Fcvx_long, /*i:*/Active_civx, /*ignoreCase:*/Active_civx_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_cnvx, /*lineNumber:*/Active_cnvx_long, /*l:*/Active_clvx, /*matchingFiles:*/Active_clvx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.count, GrepOption.invertMatch, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #invertMatch v}, {@link #wholeLine x}.
     */
    Active_cvx_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcvx, /*fixedStrings:*/Active_Fcvx_long, /*i:*/Active_civx, /*ignoreCase:*/Active_civx_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_cnvx, /*lineNumber:*/Active_cnvx_long, /*l:*/Active_clvx, /*matchingFiles:*/Active_clvx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.count, GrepOption.invertMatch, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #invertMatch v}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_lvx(
		/*c:*/Active_clvx, /*count:*/Active_clvx_long, /*F:*/Active_Flvx, /*fixedStrings:*/Active_Flvx_long, /*i:*/Active_ilvx, /*ignoreCase:*/Active_ilvx_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_lnvx, /*lineNumber:*/Active_lnvx_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.invertMatch, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #invertMatch v}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_lvx_long(
		/*c:*/Active_clvx, /*count:*/Active_clvx_long, /*F:*/Active_Flvx, /*fixedStrings:*/Active_Flvx_long, /*i:*/Active_ilvx, /*ignoreCase:*/Active_ilvx_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_lnvx, /*lineNumber:*/Active_lnvx_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.invertMatch, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #lineNumber n}.
     */
    Active_Fcn(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fcin, /*ignoreCase:*/Active_Fcin_long, /*v:*/Active_Fcnv, /*invertMatch:*/Active_Fcnv_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_Fcln, /*matchingFiles:*/Active_Fcln_long, /*x:*/Active_Fcnx, /*wholeLine:*/Active_Fcnx_long,
            true,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #lineNumber n}.
     */
    Active_Fcn_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fcin, /*ignoreCase:*/Active_Fcin_long, /*v:*/Active_Fcnv, /*invertMatch:*/Active_Fcnv_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_Fcln, /*matchingFiles:*/Active_Fcln_long, /*x:*/Active_Fcnx, /*wholeLine:*/Active_Fcnx_long,
            false,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #lineNumber n}, {@link #matchingFiles l}.
     */
    Active_Fln(
		/*c:*/Active_Fcln, /*count:*/Active_Fcln_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Filn, /*ignoreCase:*/Active_Filn_long, /*v:*/Active_Flnv, /*invertMatch:*/Active_Flnv_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_Flnx, /*wholeLine:*/Active_Flnx_long,
            true,
		/*active:*/GrepOption.fixedStrings, GrepOption.lineNumber, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #lineNumber n}, {@link #matchingFiles l}.
     */
    Active_Fln_long(
		/*c:*/Active_Fcln, /*count:*/Active_Fcln_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Filn, /*ignoreCase:*/Active_Filn_long, /*v:*/Active_Flnv, /*invertMatch:*/Active_Flnv_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_Flnx, /*wholeLine:*/Active_Flnx_long,
            false,
		/*active:*/GrepOption.fixedStrings, GrepOption.lineNumber, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #lineNumber n}, {@link #wholeLine x}.
     */
    Active_Fnx(
		/*c:*/Active_Fcnx, /*count:*/Active_Fcnx_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Finx, /*ignoreCase:*/Active_Finx_long, /*v:*/Active_Fnvx, /*invertMatch:*/Active_Fnvx_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_Flnx, /*matchingFiles:*/Active_Flnx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.fixedStrings, GrepOption.lineNumber, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #lineNumber n}, {@link #wholeLine x}.
     */
    Active_Fnx_long(
		/*c:*/Active_Fcnx, /*count:*/Active_Fcnx_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Finx, /*ignoreCase:*/Active_Finx_long, /*v:*/Active_Fnvx, /*invertMatch:*/Active_Fnvx_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_Flnx, /*matchingFiles:*/Active_Flnx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.fixedStrings, GrepOption.lineNumber, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #matchingFiles l}.
     */
    Active_Fcl(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fcil, /*ignoreCase:*/Active_Fcil_long, /*v:*/Active_Fclv, /*invertMatch:*/Active_Fclv_long, /*n:*/Active_Fcln, /*lineNumber:*/Active_Fcln_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_Fclx, /*wholeLine:*/Active_Fclx_long,
            true,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #matchingFiles l}.
     */
    Active_Fcl_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fcil, /*ignoreCase:*/Active_Fcil_long, /*v:*/Active_Fclv, /*invertMatch:*/Active_Fclv_long, /*n:*/Active_Fcln, /*lineNumber:*/Active_Fcln_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_Fclx, /*wholeLine:*/Active_Fclx_long,
            false,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #wholeLine x}.
     */
    Active_Fcx(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fcix, /*ignoreCase:*/Active_Fcix_long, /*v:*/Active_Fcvx, /*invertMatch:*/Active_Fcvx_long, /*n:*/Active_Fcnx, /*lineNumber:*/Active_Fcnx_long, /*l:*/Active_Fclx, /*matchingFiles:*/Active_Fclx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}, {@link #wholeLine x}.
     */
    Active_Fcx_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fcix, /*ignoreCase:*/Active_Fcix_long, /*v:*/Active_Fcvx, /*invertMatch:*/Active_Fcvx_long, /*n:*/Active_Fcnx, /*lineNumber:*/Active_Fcnx_long, /*l:*/Active_Fclx, /*matchingFiles:*/Active_Fclx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.count, GrepOption.fixedStrings, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_Flx(
		/*c:*/Active_Fclx, /*count:*/Active_Fclx_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Filx, /*ignoreCase:*/Active_Filx_long, /*v:*/Active_Flvx, /*invertMatch:*/Active_Flvx_long, /*n:*/Active_Flnx, /*lineNumber:*/Active_Flnx_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.fixedStrings, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_Flx_long(
		/*c:*/Active_Fclx, /*count:*/Active_Fclx_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Filx, /*ignoreCase:*/Active_Filx_long, /*v:*/Active_Flvx, /*invertMatch:*/Active_Flvx_long, /*n:*/Active_Flnx, /*lineNumber:*/Active_Flnx_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.fixedStrings, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #lineNumber n}, {@link #matchingFiles l}.
     */
    Active_cln(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcln, /*fixedStrings:*/Active_Fcln_long, /*i:*/Active_ciln, /*ignoreCase:*/Active_ciln_long, /*v:*/Active_clnv, /*invertMatch:*/Active_clnv_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_clnx, /*wholeLine:*/Active_clnx_long,
            true,
		/*active:*/GrepOption.count, GrepOption.lineNumber, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #lineNumber n}, {@link #matchingFiles l}.
     */
    Active_cln_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcln, /*fixedStrings:*/Active_Fcln_long, /*i:*/Active_ciln, /*ignoreCase:*/Active_ciln_long, /*v:*/Active_clnv, /*invertMatch:*/Active_clnv_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_clnx, /*wholeLine:*/Active_clnx_long,
            false,
		/*active:*/GrepOption.count, GrepOption.lineNumber, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #lineNumber n}, {@link #wholeLine x}.
     */
    Active_cnx(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcnx, /*fixedStrings:*/Active_Fcnx_long, /*i:*/Active_cinx, /*ignoreCase:*/Active_cinx_long, /*v:*/Active_cnvx, /*invertMatch:*/Active_cnvx_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_clnx, /*matchingFiles:*/Active_clnx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.count, GrepOption.lineNumber, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #lineNumber n}, {@link #wholeLine x}.
     */
    Active_cnx_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcnx, /*fixedStrings:*/Active_Fcnx_long, /*i:*/Active_cinx, /*ignoreCase:*/Active_cinx_long, /*v:*/Active_cnvx, /*invertMatch:*/Active_cnvx_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_clnx, /*matchingFiles:*/Active_clnx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.count, GrepOption.lineNumber, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #lineNumber n}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_lnx(
		/*c:*/Active_clnx, /*count:*/Active_clnx_long, /*F:*/Active_Flnx, /*fixedStrings:*/Active_Flnx_long, /*i:*/Active_ilnx, /*ignoreCase:*/Active_ilnx_long, /*v:*/Active_lnvx, /*invertMatch:*/Active_lnvx_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.lineNumber, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #lineNumber n}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_lnx_long(
		/*c:*/Active_clnx, /*count:*/Active_clnx_long, /*F:*/Active_Flnx, /*fixedStrings:*/Active_Flnx_long, /*i:*/Active_ilnx, /*ignoreCase:*/Active_ilnx_long, /*v:*/Active_lnvx, /*invertMatch:*/Active_lnvx_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.lineNumber, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_clx(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fclx, /*fixedStrings:*/Active_Fclx_long, /*i:*/Active_cilx, /*ignoreCase:*/Active_cilx_long, /*v:*/Active_clvx, /*invertMatch:*/Active_clvx_long, /*n:*/Active_clnx, /*lineNumber:*/Active_clnx_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.count, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_clx_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fclx, /*fixedStrings:*/Active_Fclx_long, /*i:*/Active_cilx, /*ignoreCase:*/Active_cilx_long, /*v:*/Active_clvx, /*invertMatch:*/Active_clvx_long, /*n:*/Active_clnx, /*lineNumber:*/Active_clnx_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.count, GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #invertMatch v}.
     */
    Active_iv(
		/*c:*/Active_civ, /*count:*/Active_civ_long, /*F:*/Active_Fiv, /*fixedStrings:*/Active_Fiv_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_inv, /*lineNumber:*/Active_inv_long, /*l:*/Active_ilv, /*matchingFiles:*/Active_ilv_long, /*x:*/Active_ivx, /*wholeLine:*/Active_ivx_long,
            true,
		/*active:*/GrepOption.ignoreCase, GrepOption.invertMatch
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #invertMatch v}.
     */
    Active_iv_long(
		/*c:*/Active_civ, /*count:*/Active_civ_long, /*F:*/Active_Fiv, /*fixedStrings:*/Active_Fiv_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_inv, /*lineNumber:*/Active_inv_long, /*l:*/Active_ilv, /*matchingFiles:*/Active_ilv_long, /*x:*/Active_ivx, /*wholeLine:*/Active_ivx_long,
            false,
		/*active:*/GrepOption.ignoreCase, GrepOption.invertMatch
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #ignoreCase i}.
     */
    Active_Fi(
		/*c:*/Active_Fci, /*count:*/Active_Fci_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_Fiv, /*invertMatch:*/Active_Fiv_long, /*n:*/Active_Fin, /*lineNumber:*/Active_Fin_long, /*l:*/Active_Fil, /*matchingFiles:*/Active_Fil_long, /*x:*/Active_Fix, /*wholeLine:*/Active_Fix_long,
            true,
		/*active:*/GrepOption.fixedStrings, GrepOption.ignoreCase
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #ignoreCase i}.
     */
    Active_Fi_long(
		/*c:*/Active_Fci, /*count:*/Active_Fci_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_Fiv, /*invertMatch:*/Active_Fiv_long, /*n:*/Active_Fin, /*lineNumber:*/Active_Fin_long, /*l:*/Active_Fil, /*matchingFiles:*/Active_Fil_long, /*x:*/Active_Fix, /*wholeLine:*/Active_Fix_long,
            false,
		/*active:*/GrepOption.fixedStrings, GrepOption.ignoreCase
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #lineNumber n}.
     */
    Active_in(
		/*c:*/Active_cin, /*count:*/Active_cin_long, /*F:*/Active_Fin, /*fixedStrings:*/Active_Fin_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_inv, /*invertMatch:*/Active_inv_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_iln, /*matchingFiles:*/Active_iln_long, /*x:*/Active_inx, /*wholeLine:*/Active_inx_long,
            true,
		/*active:*/GrepOption.ignoreCase, GrepOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #lineNumber n}.
     */
    Active_in_long(
		/*c:*/Active_cin, /*count:*/Active_cin_long, /*F:*/Active_Fin, /*fixedStrings:*/Active_Fin_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_inv, /*invertMatch:*/Active_inv_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_iln, /*matchingFiles:*/Active_iln_long, /*x:*/Active_inx, /*wholeLine:*/Active_inx_long,
            false,
		/*active:*/GrepOption.ignoreCase, GrepOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #ignoreCase i}.
     */
    Active_ci(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fci, /*fixedStrings:*/Active_Fci_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_civ, /*invertMatch:*/Active_civ_long, /*n:*/Active_cin, /*lineNumber:*/Active_cin_long, /*l:*/Active_cil, /*matchingFiles:*/Active_cil_long, /*x:*/Active_cix, /*wholeLine:*/Active_cix_long,
            true,
		/*active:*/GrepOption.count, GrepOption.ignoreCase
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #ignoreCase i}.
     */
    Active_ci_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fci, /*fixedStrings:*/Active_Fci_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_civ, /*invertMatch:*/Active_civ_long, /*n:*/Active_cin, /*lineNumber:*/Active_cin_long, /*l:*/Active_cil, /*matchingFiles:*/Active_cil_long, /*x:*/Active_cix, /*wholeLine:*/Active_cix_long,
            false,
		/*active:*/GrepOption.count, GrepOption.ignoreCase
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #matchingFiles l}.
     */
    Active_il(
		/*c:*/Active_cil, /*count:*/Active_cil_long, /*F:*/Active_Fil, /*fixedStrings:*/Active_Fil_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_ilv, /*invertMatch:*/Active_ilv_long, /*n:*/Active_iln, /*lineNumber:*/Active_iln_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_ilx, /*wholeLine:*/Active_ilx_long,
            true,
		/*active:*/GrepOption.ignoreCase, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #matchingFiles l}.
     */
    Active_il_long(
		/*c:*/Active_cil, /*count:*/Active_cil_long, /*F:*/Active_Fil, /*fixedStrings:*/Active_Fil_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_ilv, /*invertMatch:*/Active_ilv_long, /*n:*/Active_iln, /*lineNumber:*/Active_iln_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_ilx, /*wholeLine:*/Active_ilx_long,
            false,
		/*active:*/GrepOption.ignoreCase, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #wholeLine x}.
     */
    Active_ix(
		/*c:*/Active_cix, /*count:*/Active_cix_long, /*F:*/Active_Fix, /*fixedStrings:*/Active_Fix_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_ivx, /*invertMatch:*/Active_ivx_long, /*n:*/Active_inx, /*lineNumber:*/Active_inx_long, /*l:*/Active_ilx, /*matchingFiles:*/Active_ilx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.ignoreCase, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #wholeLine x}.
     */
    Active_ix_long(
		/*c:*/Active_cix, /*count:*/Active_cix_long, /*F:*/Active_Fix, /*fixedStrings:*/Active_Fix_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_ivx, /*invertMatch:*/Active_ivx_long, /*n:*/Active_inx, /*lineNumber:*/Active_inx_long, /*l:*/Active_ilx, /*matchingFiles:*/Active_ilx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.ignoreCase, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #invertMatch v}.
     */
    Active_Fv(
		/*c:*/Active_Fcv, /*count:*/Active_Fcv_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fiv, /*ignoreCase:*/Active_Fiv_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_Fnv, /*lineNumber:*/Active_Fnv_long, /*l:*/Active_Flv, /*matchingFiles:*/Active_Flv_long, /*x:*/Active_Fvx, /*wholeLine:*/Active_Fvx_long,
            true,
		/*active:*/GrepOption.fixedStrings, GrepOption.invertMatch
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #invertMatch v}.
     */
    Active_Fv_long(
		/*c:*/Active_Fcv, /*count:*/Active_Fcv_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fiv, /*ignoreCase:*/Active_Fiv_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_Fnv, /*lineNumber:*/Active_Fnv_long, /*l:*/Active_Flv, /*matchingFiles:*/Active_Flv_long, /*x:*/Active_Fvx, /*wholeLine:*/Active_Fvx_long,
            false,
		/*active:*/GrepOption.fixedStrings, GrepOption.invertMatch
    ),
    /**
     * Option set with the following active options: {@link #invertMatch v}, {@link #lineNumber n}.
     */
    Active_nv(
		/*c:*/Active_cnv, /*count:*/Active_cnv_long, /*F:*/Active_Fnv, /*fixedStrings:*/Active_Fnv_long, /*i:*/Active_inv, /*ignoreCase:*/Active_inv_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_lnv, /*matchingFiles:*/Active_lnv_long, /*x:*/Active_nvx, /*wholeLine:*/Active_nvx_long,
            true,
		/*active:*/GrepOption.invertMatch, GrepOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #invertMatch v}, {@link #lineNumber n}.
     */
    Active_nv_long(
		/*c:*/Active_cnv, /*count:*/Active_cnv_long, /*F:*/Active_Fnv, /*fixedStrings:*/Active_Fnv_long, /*i:*/Active_inv, /*ignoreCase:*/Active_inv_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_lnv, /*matchingFiles:*/Active_lnv_long, /*x:*/Active_nvx, /*wholeLine:*/Active_nvx_long,
            false,
		/*active:*/GrepOption.invertMatch, GrepOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #invertMatch v}.
     */
    Active_cv(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcv, /*fixedStrings:*/Active_Fcv_long, /*i:*/Active_civ, /*ignoreCase:*/Active_civ_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_cnv, /*lineNumber:*/Active_cnv_long, /*l:*/Active_clv, /*matchingFiles:*/Active_clv_long, /*x:*/Active_cvx, /*wholeLine:*/Active_cvx_long,
            true,
		/*active:*/GrepOption.count, GrepOption.invertMatch
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #invertMatch v}.
     */
    Active_cv_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcv, /*fixedStrings:*/Active_Fcv_long, /*i:*/Active_civ, /*ignoreCase:*/Active_civ_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_cnv, /*lineNumber:*/Active_cnv_long, /*l:*/Active_clv, /*matchingFiles:*/Active_clv_long, /*x:*/Active_cvx, /*wholeLine:*/Active_cvx_long,
            false,
		/*active:*/GrepOption.count, GrepOption.invertMatch
    ),
    /**
     * Option set with the following active options: {@link #invertMatch v}, {@link #matchingFiles l}.
     */
    Active_lv(
		/*c:*/Active_clv, /*count:*/Active_clv_long, /*F:*/Active_Flv, /*fixedStrings:*/Active_Flv_long, /*i:*/Active_ilv, /*ignoreCase:*/Active_ilv_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_lnv, /*lineNumber:*/Active_lnv_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_lvx, /*wholeLine:*/Active_lvx_long,
            true,
		/*active:*/GrepOption.invertMatch, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #invertMatch v}, {@link #matchingFiles l}.
     */
    Active_lv_long(
		/*c:*/Active_clv, /*count:*/Active_clv_long, /*F:*/Active_Flv, /*fixedStrings:*/Active_Flv_long, /*i:*/Active_ilv, /*ignoreCase:*/Active_ilv_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_lnv, /*lineNumber:*/Active_lnv_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_lvx, /*wholeLine:*/Active_lvx_long,
            false,
		/*active:*/GrepOption.invertMatch, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #invertMatch v}, {@link #wholeLine x}.
     */
    Active_vx(
		/*c:*/Active_cvx, /*count:*/Active_cvx_long, /*F:*/Active_Fvx, /*fixedStrings:*/Active_Fvx_long, /*i:*/Active_ivx, /*ignoreCase:*/Active_ivx_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_nvx, /*lineNumber:*/Active_nvx_long, /*l:*/Active_lvx, /*matchingFiles:*/Active_lvx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.invertMatch, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #invertMatch v}, {@link #wholeLine x}.
     */
    Active_vx_long(
		/*c:*/Active_cvx, /*count:*/Active_cvx_long, /*F:*/Active_Fvx, /*fixedStrings:*/Active_Fvx_long, /*i:*/Active_ivx, /*ignoreCase:*/Active_ivx_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_nvx, /*lineNumber:*/Active_nvx_long, /*l:*/Active_lvx, /*matchingFiles:*/Active_lvx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.invertMatch, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #lineNumber n}.
     */
    Active_Fn(
		/*c:*/Active_Fcn, /*count:*/Active_Fcn_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fin, /*ignoreCase:*/Active_Fin_long, /*v:*/Active_Fnv, /*invertMatch:*/Active_Fnv_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_Fln, /*matchingFiles:*/Active_Fln_long, /*x:*/Active_Fnx, /*wholeLine:*/Active_Fnx_long,
            true,
		/*active:*/GrepOption.fixedStrings, GrepOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #lineNumber n}.
     */
    Active_Fn_long(
		/*c:*/Active_Fcn, /*count:*/Active_Fcn_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fin, /*ignoreCase:*/Active_Fin_long, /*v:*/Active_Fnv, /*invertMatch:*/Active_Fnv_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_Fln, /*matchingFiles:*/Active_Fln_long, /*x:*/Active_Fnx, /*wholeLine:*/Active_Fnx_long,
            false,
		/*active:*/GrepOption.fixedStrings, GrepOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}.
     */
    Active_Fc(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fci, /*ignoreCase:*/Active_Fci_long, /*v:*/Active_Fcv, /*invertMatch:*/Active_Fcv_long, /*n:*/Active_Fcn, /*lineNumber:*/Active_Fcn_long, /*l:*/Active_Fcl, /*matchingFiles:*/Active_Fcl_long, /*x:*/Active_Fcx, /*wholeLine:*/Active_Fcx_long,
            true,
		/*active:*/GrepOption.count, GrepOption.fixedStrings
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #fixedStrings F}.
     */
    Active_Fc_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fci, /*ignoreCase:*/Active_Fci_long, /*v:*/Active_Fcv, /*invertMatch:*/Active_Fcv_long, /*n:*/Active_Fcn, /*lineNumber:*/Active_Fcn_long, /*l:*/Active_Fcl, /*matchingFiles:*/Active_Fcl_long, /*x:*/Active_Fcx, /*wholeLine:*/Active_Fcx_long,
            false,
		/*active:*/GrepOption.count, GrepOption.fixedStrings
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #matchingFiles l}.
     */
    Active_Fl(
		/*c:*/Active_Fcl, /*count:*/Active_Fcl_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fil, /*ignoreCase:*/Active_Fil_long, /*v:*/Active_Flv, /*invertMatch:*/Active_Flv_long, /*n:*/Active_Fln, /*lineNumber:*/Active_Fln_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_Flx, /*wholeLine:*/Active_Flx_long,
            true,
		/*active:*/GrepOption.fixedStrings, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #matchingFiles l}.
     */
    Active_Fl_long(
		/*c:*/Active_Fcl, /*count:*/Active_Fcl_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fil, /*ignoreCase:*/Active_Fil_long, /*v:*/Active_Flv, /*invertMatch:*/Active_Flv_long, /*n:*/Active_Fln, /*lineNumber:*/Active_Fln_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_Flx, /*wholeLine:*/Active_Flx_long,
            false,
		/*active:*/GrepOption.fixedStrings, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #wholeLine x}.
     */
    Active_Fx(
		/*c:*/Active_Fcx, /*count:*/Active_Fcx_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fix, /*ignoreCase:*/Active_Fix_long, /*v:*/Active_Fvx, /*invertMatch:*/Active_Fvx_long, /*n:*/Active_Fnx, /*lineNumber:*/Active_Fnx_long, /*l:*/Active_Flx, /*matchingFiles:*/Active_Flx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.fixedStrings, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}, {@link #wholeLine x}.
     */
    Active_Fx_long(
		/*c:*/Active_Fcx, /*count:*/Active_Fcx_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fix, /*ignoreCase:*/Active_Fix_long, /*v:*/Active_Fvx, /*invertMatch:*/Active_Fvx_long, /*n:*/Active_Fnx, /*lineNumber:*/Active_Fnx_long, /*l:*/Active_Flx, /*matchingFiles:*/Active_Flx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.fixedStrings, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #lineNumber n}.
     */
    Active_cn(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcn, /*fixedStrings:*/Active_Fcn_long, /*i:*/Active_cin, /*ignoreCase:*/Active_cin_long, /*v:*/Active_cnv, /*invertMatch:*/Active_cnv_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_cln, /*matchingFiles:*/Active_cln_long, /*x:*/Active_cnx, /*wholeLine:*/Active_cnx_long,
            true,
		/*active:*/GrepOption.count, GrepOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #lineNumber n}.
     */
    Active_cn_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcn, /*fixedStrings:*/Active_Fcn_long, /*i:*/Active_cin, /*ignoreCase:*/Active_cin_long, /*v:*/Active_cnv, /*invertMatch:*/Active_cnv_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_cln, /*matchingFiles:*/Active_cln_long, /*x:*/Active_cnx, /*wholeLine:*/Active_cnx_long,
            false,
		/*active:*/GrepOption.count, GrepOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #lineNumber n}, {@link #matchingFiles l}.
     */
    Active_ln(
		/*c:*/Active_cln, /*count:*/Active_cln_long, /*F:*/Active_Fln, /*fixedStrings:*/Active_Fln_long, /*i:*/Active_iln, /*ignoreCase:*/Active_iln_long, /*v:*/Active_lnv, /*invertMatch:*/Active_lnv_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_lnx, /*wholeLine:*/Active_lnx_long,
            true,
		/*active:*/GrepOption.lineNumber, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #lineNumber n}, {@link #matchingFiles l}.
     */
    Active_ln_long(
		/*c:*/Active_cln, /*count:*/Active_cln_long, /*F:*/Active_Fln, /*fixedStrings:*/Active_Fln_long, /*i:*/Active_iln, /*ignoreCase:*/Active_iln_long, /*v:*/Active_lnv, /*invertMatch:*/Active_lnv_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_lnx, /*wholeLine:*/Active_lnx_long,
            false,
		/*active:*/GrepOption.lineNumber, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #lineNumber n}, {@link #wholeLine x}.
     */
    Active_nx(
		/*c:*/Active_cnx, /*count:*/Active_cnx_long, /*F:*/Active_Fnx, /*fixedStrings:*/Active_Fnx_long, /*i:*/Active_inx, /*ignoreCase:*/Active_inx_long, /*v:*/Active_nvx, /*invertMatch:*/Active_nvx_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_lnx, /*matchingFiles:*/Active_lnx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.lineNumber, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #lineNumber n}, {@link #wholeLine x}.
     */
    Active_nx_long(
		/*c:*/Active_cnx, /*count:*/Active_cnx_long, /*F:*/Active_Fnx, /*fixedStrings:*/Active_Fnx_long, /*i:*/Active_inx, /*ignoreCase:*/Active_inx_long, /*v:*/Active_nvx, /*invertMatch:*/Active_nvx_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_lnx, /*matchingFiles:*/Active_lnx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.lineNumber, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #matchingFiles l}.
     */
    Active_cl(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcl, /*fixedStrings:*/Active_Fcl_long, /*i:*/Active_cil, /*ignoreCase:*/Active_cil_long, /*v:*/Active_clv, /*invertMatch:*/Active_clv_long, /*n:*/Active_cln, /*lineNumber:*/Active_cln_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_clx, /*wholeLine:*/Active_clx_long,
            true,
		/*active:*/GrepOption.count, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #matchingFiles l}.
     */
    Active_cl_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcl, /*fixedStrings:*/Active_Fcl_long, /*i:*/Active_cil, /*ignoreCase:*/Active_cil_long, /*v:*/Active_clv, /*invertMatch:*/Active_clv_long, /*n:*/Active_cln, /*lineNumber:*/Active_cln_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_clx, /*wholeLine:*/Active_clx_long,
            false,
		/*active:*/GrepOption.count, GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #wholeLine x}.
     */
    Active_cx(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcx, /*fixedStrings:*/Active_Fcx_long, /*i:*/Active_cix, /*ignoreCase:*/Active_cix_long, /*v:*/Active_cvx, /*invertMatch:*/Active_cvx_long, /*n:*/Active_cnx, /*lineNumber:*/Active_cnx_long, /*l:*/Active_clx, /*matchingFiles:*/Active_clx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.count, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #count c}, {@link #wholeLine x}.
     */
    Active_cx_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fcx, /*fixedStrings:*/Active_Fcx_long, /*i:*/Active_cix, /*ignoreCase:*/Active_cix_long, /*v:*/Active_cvx, /*invertMatch:*/Active_cvx_long, /*n:*/Active_cnx, /*lineNumber:*/Active_cnx_long, /*l:*/Active_clx, /*matchingFiles:*/Active_clx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.count, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_lx(
		/*c:*/Active_clx, /*count:*/Active_clx_long, /*F:*/Active_Flx, /*fixedStrings:*/Active_Flx_long, /*i:*/Active_ilx, /*ignoreCase:*/Active_ilx_long, /*v:*/Active_lvx, /*invertMatch:*/Active_lvx_long, /*n:*/Active_lnx, /*lineNumber:*/Active_lnx_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #matchingFiles l}, {@link #wholeLine x}.
     */
    Active_lx_long(
		/*c:*/Active_clx, /*count:*/Active_clx_long, /*F:*/Active_Flx, /*fixedStrings:*/Active_Flx_long, /*i:*/Active_ilx, /*ignoreCase:*/Active_ilx_long, /*v:*/Active_lvx, /*invertMatch:*/Active_lvx_long, /*n:*/Active_lnx, /*lineNumber:*/Active_lnx_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.matchingFiles, GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}.
     */
    Active_i(
		/*c:*/Active_ci, /*count:*/Active_ci_long, /*F:*/Active_Fi, /*fixedStrings:*/Active_Fi_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_iv, /*invertMatch:*/Active_iv_long, /*n:*/Active_in, /*lineNumber:*/Active_in_long, /*l:*/Active_il, /*matchingFiles:*/Active_il_long, /*x:*/Active_ix, /*wholeLine:*/Active_ix_long,
            true,
		/*active:*/GrepOption.ignoreCase
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}.
     */
    Active_i_long(
		/*c:*/Active_ci, /*count:*/Active_ci_long, /*F:*/Active_Fi, /*fixedStrings:*/Active_Fi_long, /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*v:*/Active_iv, /*invertMatch:*/Active_iv_long, /*n:*/Active_in, /*lineNumber:*/Active_in_long, /*l:*/Active_il, /*matchingFiles:*/Active_il_long, /*x:*/Active_ix, /*wholeLine:*/Active_ix_long,
            false,
		/*active:*/GrepOption.ignoreCase
    ),
    /**
     * Option set with the following active options: {@link #invertMatch v}.
     */
    Active_v(
		/*c:*/Active_cv, /*count:*/Active_cv_long, /*F:*/Active_Fv, /*fixedStrings:*/Active_Fv_long, /*i:*/Active_iv, /*ignoreCase:*/Active_iv_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_nv, /*lineNumber:*/Active_nv_long, /*l:*/Active_lv, /*matchingFiles:*/Active_lv_long, /*x:*/Active_vx, /*wholeLine:*/Active_vx_long,
            true,
		/*active:*/GrepOption.invertMatch
    ),
    /**
     * Option set with the following active options: {@link #invertMatch v}.
     */
    Active_v_long(
		/*c:*/Active_cv, /*count:*/Active_cv_long, /*F:*/Active_Fv, /*fixedStrings:*/Active_Fv_long, /*i:*/Active_iv, /*ignoreCase:*/Active_iv_long, /*v:*/null /*already set*/, /*invertMatch:*/null /*already set*/, /*n:*/Active_nv, /*lineNumber:*/Active_nv_long, /*l:*/Active_lv, /*matchingFiles:*/Active_lv_long, /*x:*/Active_vx, /*wholeLine:*/Active_vx_long,
            false,
		/*active:*/GrepOption.invertMatch
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}.
     */
    Active_F(
		/*c:*/Active_Fc, /*count:*/Active_Fc_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fi, /*ignoreCase:*/Active_Fi_long, /*v:*/Active_Fv, /*invertMatch:*/Active_Fv_long, /*n:*/Active_Fn, /*lineNumber:*/Active_Fn_long, /*l:*/Active_Fl, /*matchingFiles:*/Active_Fl_long, /*x:*/Active_Fx, /*wholeLine:*/Active_Fx_long,
            true,
		/*active:*/GrepOption.fixedStrings
    ),
    /**
     * Option set with the following active options: {@link #fixedStrings F}.
     */
    Active_F_long(
		/*c:*/Active_Fc, /*count:*/Active_Fc_long, /*F:*/null /*already set*/, /*fixedStrings:*/null /*already set*/, /*i:*/Active_Fi, /*ignoreCase:*/Active_Fi_long, /*v:*/Active_Fv, /*invertMatch:*/Active_Fv_long, /*n:*/Active_Fn, /*lineNumber:*/Active_Fn_long, /*l:*/Active_Fl, /*matchingFiles:*/Active_Fl_long, /*x:*/Active_Fx, /*wholeLine:*/Active_Fx_long,
            false,
		/*active:*/GrepOption.fixedStrings
    ),
    /**
     * Option set with the following active options: {@link #lineNumber n}.
     */
    Active_n(
		/*c:*/Active_cn, /*count:*/Active_cn_long, /*F:*/Active_Fn, /*fixedStrings:*/Active_Fn_long, /*i:*/Active_in, /*ignoreCase:*/Active_in_long, /*v:*/Active_nv, /*invertMatch:*/Active_nv_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_ln, /*matchingFiles:*/Active_ln_long, /*x:*/Active_nx, /*wholeLine:*/Active_nx_long,
            true,
		/*active:*/GrepOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #lineNumber n}.
     */
    Active_n_long(
		/*c:*/Active_cn, /*count:*/Active_cn_long, /*F:*/Active_Fn, /*fixedStrings:*/Active_Fn_long, /*i:*/Active_in, /*ignoreCase:*/Active_in_long, /*v:*/Active_nv, /*invertMatch:*/Active_nv_long, /*n:*/null /*already set*/, /*lineNumber:*/null /*already set*/, /*l:*/Active_ln, /*matchingFiles:*/Active_ln_long, /*x:*/Active_nx, /*wholeLine:*/Active_nx_long,
            false,
		/*active:*/GrepOption.lineNumber
    ),
    /**
     * Option set with the following active options: {@link #count c}.
     */
    Active_c(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fc, /*fixedStrings:*/Active_Fc_long, /*i:*/Active_ci, /*ignoreCase:*/Active_ci_long, /*v:*/Active_cv, /*invertMatch:*/Active_cv_long, /*n:*/Active_cn, /*lineNumber:*/Active_cn_long, /*l:*/Active_cl, /*matchingFiles:*/Active_cl_long, /*x:*/Active_cx, /*wholeLine:*/Active_cx_long,
            true,
		/*active:*/GrepOption.count
    ),
    /**
     * Option set with the following active options: {@link #count c}.
     */
    Active_c_long(
		/*c:*/null /*already set*/, /*count:*/null /*already set*/, /*F:*/Active_Fc, /*fixedStrings:*/Active_Fc_long, /*i:*/Active_ci, /*ignoreCase:*/Active_ci_long, /*v:*/Active_cv, /*invertMatch:*/Active_cv_long, /*n:*/Active_cn, /*lineNumber:*/Active_cn_long, /*l:*/Active_cl, /*matchingFiles:*/Active_cl_long, /*x:*/Active_cx, /*wholeLine:*/Active_cx_long,
            false,
		/*active:*/GrepOption.count
    ),
    /**
     * Option set with the following active options: {@link #matchingFiles l}.
     */
    Active_l(
		/*c:*/Active_cl, /*count:*/Active_cl_long, /*F:*/Active_Fl, /*fixedStrings:*/Active_Fl_long, /*i:*/Active_il, /*ignoreCase:*/Active_il_long, /*v:*/Active_lv, /*invertMatch:*/Active_lv_long, /*n:*/Active_ln, /*lineNumber:*/Active_ln_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_lx, /*wholeLine:*/Active_lx_long,
            true,
		/*active:*/GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #matchingFiles l}.
     */
    Active_l_long(
		/*c:*/Active_cl, /*count:*/Active_cl_long, /*F:*/Active_Fl, /*fixedStrings:*/Active_Fl_long, /*i:*/Active_il, /*ignoreCase:*/Active_il_long, /*v:*/Active_lv, /*invertMatch:*/Active_lv_long, /*n:*/Active_ln, /*lineNumber:*/Active_ln_long, /*l:*/null /*already set*/, /*matchingFiles:*/null /*already set*/, /*x:*/Active_lx, /*wholeLine:*/Active_lx_long,
            false,
		/*active:*/GrepOption.matchingFiles
    ),
    /**
     * Option set with the following active options: {@link #wholeLine x}.
     */
    Active_x(
		/*c:*/Active_cx, /*count:*/Active_cx_long, /*F:*/Active_Fx, /*fixedStrings:*/Active_Fx_long, /*i:*/Active_ix, /*ignoreCase:*/Active_ix_long, /*v:*/Active_vx, /*invertMatch:*/Active_vx_long, /*n:*/Active_nx, /*lineNumber:*/Active_nx_long, /*l:*/Active_lx, /*matchingFiles:*/Active_lx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            true,
		/*active:*/GrepOption.wholeLine
    ),
    /**
     * Option set with the following active options: {@link #wholeLine x}.
     */
    Active_x_long(
		/*c:*/Active_cx, /*count:*/Active_cx_long, /*F:*/Active_Fx, /*fixedStrings:*/Active_Fx_long, /*i:*/Active_ix, /*ignoreCase:*/Active_ix_long, /*v:*/Active_vx, /*invertMatch:*/Active_vx_long, /*n:*/Active_nx, /*lineNumber:*/Active_nx_long, /*l:*/Active_lx, /*matchingFiles:*/Active_lx_long, /*x:*/null /*already set*/, /*wholeLine:*/null /*already set*/,
            false,
		/*active:*/GrepOption.wholeLine
    );

    /**
     * Option {@code "-c"}: Suppress normal output; instead print a count of matching lines for
     * each input file. With the {@code -v}, {@code --invertMatch} option,
     * count non-matching lines.
     * <p>
     * The option {@code "-c"} is equivalent to the {@code "--}{@link #count count}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-c"}. If the option {@code "-c"}
     * is already set, the field {@code c} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final GrepOptionSet_Fcilnvx c;
    /**
     * Option {@code "--count"}: Suppress normal output; instead print a count of matching lines for
     * each input file. With the {@code -v}, {@code --invertMatch} option,
     * count non-matching lines.
     * <p>
     * The option {@code "--count"} is equivalent to the {@code "-}{@link #c c}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--count"}. If the option {@code "--count"}
     * is already set, the field {@code count} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final GrepOptionSet_Fcilnvx count;
    /**
     * Option {@code "-F"}: Use fixed-strings matching instead of regular expressions. This is
     * usually faster than the standard regexp version.
     * <p>
     * (This option is ignored if a {@code pattern} operand is specified
     * instead of the {@code regexp} string).
     * <p>
     * The option {@code "-F"} is equivalent to the {@code "--}{@link #fixedStrings fixedStrings}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-F"}. If the option {@code "-F"}
     * is already set, the field {@code F} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final GrepOptionSet_Fcilnvx F;
    /**
     * Option {@code "--fixedStrings"}: Use fixed-strings matching instead of regular expressions. This is
     * usually faster than the standard regexp version.
     * <p>
     * (This option is ignored if a {@code pattern} operand is specified
     * instead of the {@code regexp} string).
     * <p>
     * The option {@code "--fixedStrings"} is equivalent to the {@code "-}{@link #F F}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--fixedStrings"}. If the option {@code "--fixedStrings"}
     * is already set, the field {@code fixedStrings} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final GrepOptionSet_Fcilnvx fixedStrings;
    /**
     * Option {@code "-i"}: Match lines ignoring the case when comparing the strings, also known
     * from Unix with its acronym 'i'.
     * <p>
     * The option {@code "-i"} is equivalent to the {@code "--}{@link #ignoreCase ignoreCase}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-i"}. If the option {@code "-i"}
     * is already set, the field {@code i} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final GrepOptionSet_Fcilnvx i;
    /**
     * Option {@code "--ignoreCase"}: Match lines ignoring the case when comparing the strings, also known
     * from Unix with its acronym 'i'.
     * <p>
     * The option {@code "--ignoreCase"} is equivalent to the {@code "-}{@link #i i}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--ignoreCase"}. If the option {@code "--ignoreCase"}
     * is already set, the field {@code ignoreCase} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final GrepOptionSet_Fcilnvx ignoreCase;
    /**
     * Option {@code "-v"}: Invert the match result, that is, a non-matching line is written to
     * the output and a matching line is not. This option is also known
     * from Unix with its acronym 'v'.
     * <p>
     * The option {@code "-v"} is equivalent to the {@code "--}{@link #invertMatch invertMatch}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-v"}. If the option {@code "-v"}
     * is already set, the field {@code v} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final GrepOptionSet_Fcilnvx v;
    /**
     * Option {@code "--invertMatch"}: Invert the match result, that is, a non-matching line is written to
     * the output and a matching line is not. This option is also known
     * from Unix with its acronym 'v'.
     * <p>
     * The option {@code "--invertMatch"} is equivalent to the {@code "-}{@link #v v}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--invertMatch"}. If the option {@code "--invertMatch"}
     * is already set, the field {@code invertMatch} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final GrepOptionSet_Fcilnvx invertMatch;
    /**
     * Option {@code "-n"}: Prefix each line of output with the line number within its input
     * file.
     * <p>
     * The option {@code "-n"} is equivalent to the {@code "--}{@link #lineNumber lineNumber}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-n"}. If the option {@code "-n"}
     * is already set, the field {@code n} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final GrepOptionSet_Fcilnvx n;
    /**
     * Option {@code "--lineNumber"}: Prefix each line of output with the line number within its input
     * file.
     * <p>
     * The option {@code "--lineNumber"} is equivalent to the {@code "-}{@link #n n}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--lineNumber"}. If the option {@code "--lineNumber"}
     * is already set, the field {@code lineNumber} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final GrepOptionSet_Fcilnvx lineNumber;
    /**
     * Option {@code "-l"}: Suppress normal output; instead print the name of each input file
     * from which output would normally have been printed. The scanning
     * will stop on the first match.
     * <p>
     * The option {@code "-l"} is equivalent to the {@code "--}{@link #matchingFiles matchingFiles}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-l"}. If the option {@code "-l"}
     * is already set, the field {@code l} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final GrepOptionSet_Fcilnvx l;
    /**
     * Option {@code "--matchingFiles"}: Suppress normal output; instead print the name of each input file
     * from which output would normally have been printed. The scanning
     * will stop on the first match.
     * <p>
     * The option {@code "--matchingFiles"} is equivalent to the {@code "-}{@link #l l}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--matchingFiles"}. If the option {@code "--matchingFiles"}
     * is already set, the field {@code matchingFiles} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final GrepOptionSet_Fcilnvx matchingFiles;
    /**
     * Option {@code "-x"}: Select only those matches that exactly match the whole line
     * excluding the terminating line ending.
     * <p>
     * (This option is ignored if a {@code pattern} operand is specified
     * instead of the {@code regexp} string).
     * <p>
     * The option {@code "-x"} is equivalent to the {@code "--}{@link #wholeLine wholeLine}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-x"}. If the option {@code "-x"}
     * is already set, the field {@code x} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final GrepOptionSet_Fcilnvx x;
    /**
     * Option {@code "--wholeLine"}: Select only those matches that exactly match the whole line
     * excluding the terminating line ending.
     * <p>
     * (This option is ignored if a {@code pattern} operand is specified
     * instead of the {@code regexp} string).
     * <p>
     * The option {@code "--wholeLine"} is equivalent to the {@code "-}{@link #x x}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--wholeLine"}. If the option {@code "--wholeLine"}
     * is already set, the field {@code wholeLine} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final GrepOptionSet_Fcilnvx wholeLine;
    private final boolean useAcronym;
    private final EnumSet<GrepOption> options;

    private GrepOptionSet_Fcilnvx(
            GrepOptionSet_Fcilnvx c, GrepOptionSet_Fcilnvx count, GrepOptionSet_Fcilnvx F, GrepOptionSet_Fcilnvx fixedStrings, GrepOptionSet_Fcilnvx i, GrepOptionSet_Fcilnvx ignoreCase, GrepOptionSet_Fcilnvx v, GrepOptionSet_Fcilnvx invertMatch, GrepOptionSet_Fcilnvx n, GrepOptionSet_Fcilnvx lineNumber, GrepOptionSet_Fcilnvx l, GrepOptionSet_Fcilnvx matchingFiles, GrepOptionSet_Fcilnvx x, GrepOptionSet_Fcilnvx wholeLine,
            boolean useAcronym,
            GrepOption... activeOptions
    ) {
        this.c = c == null ? this : c;
        this.count = count == null ? this : count;
        this.F = F == null ? this : F;
        this.fixedStrings = fixedStrings == null ? this : fixedStrings;
        this.i = i == null ? this : i;
        this.ignoreCase = ignoreCase == null ? this : ignoreCase;
        this.v = v == null ? this : v;
        this.invertMatch = invertMatch == null ? this : invertMatch;
        this.n = n == null ? this : n;
        this.lineNumber = lineNumber == null ? this : lineNumber;
        this.l = l == null ? this : l;
        this.matchingFiles = matchingFiles == null ? this : matchingFiles;
        this.x = x == null ? this : x;
        this.wholeLine = wholeLine == null ? this : wholeLine;
        this.useAcronym = useAcronym;
        this.options = activeOptions.length == 0 ? EnumSet.noneOf(GrepOption.class) : EnumSet.copyOf(Arrays.asList(activeOptions));
    }

    //inherit javadoc
    @Override
    public Class<GrepOption> optionType() {
        return GrepOption.class;
    }

    //inherit javadoc
    @Override
    public boolean isSet(GrepOption option) {
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
    public EnumSet<GrepOption> asSet() {
        return EnumSet.copyOf(options);
    }

    /**
     * Returns an immutable iterator with the active options of this option set.
     *
     * @return an immutable iterator for over the active options
     */
    @Override
    public Iterator<GrepOption> iterator() {
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
     *    GrepOptionSet_Fcilnvx.count.F;
     * </pre>
     * uses acronyms, that is, this method always returns true for the above
     * set.
     * <p>
     * On the other hand, long option names are used and this method always
     * returns false for the set
     * <pre>
     *    GrepOptionSet_Fcilnvx.c.fixedStrings;
     * </pre>
     * <p>
     * Note that a repeated option is <i>not</i> treated as the last set option.
     * For instance, the first and last option of the following set are
     * equivalent and acronyms are used:
     * <pre>
     *    GrepOptionSet_Fcilnvx.c.F.count;
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
    public boolean useAcronymFor(GrepOption option) {
        return useAcronym;
    }
}
