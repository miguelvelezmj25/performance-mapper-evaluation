package org.unix4j.unix.find;

import org.unix4j.option.Option;
import org.unix4j.unix.Find;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Option sets for the {@link Find find} command with
 * the following options: {@link #i i}, {@link #z z}, {@link #r r}, {@link #m m}, {@link #n n}, {@link #o o}, {@link #x x}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Find#Options} should be used instead to specify command
 * options. See also {@link org.unix4j.unix.find.FindOptions} for more information.
 */
public enum FindOptionSet_imnorxz implements FindOptions {
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_imnorxz(
        /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
        /*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_imnorxz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_imnorx(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_imnorxz, /*print0:*/Active_imnorxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_imnorx_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_imnorxz, /*print0:*/Active_imnorxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeOther x}.
     */
    Active_imnrxz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_imnorxz, /*timeOlder:*/Active_imnorxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeOther x}.
     */
    Active_imnrxz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_imnorxz, /*timeOlder:*/Active_imnorxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_imorxz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_imnorxz, /*timeNewer:*/Active_imnorxz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_imorxz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_imnorxz, /*timeNewer:*/Active_imnorxz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_mnorxz(
		/*i:*/Active_imnorxz, /*ignoreCase:*/Active_imnorxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_mnorxz_long(
		/*i:*/Active_imnorxz, /*ignoreCase:*/Active_imnorxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_imnoxz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_imnorxz, /*regex:*/Active_imnorxz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_imnoxz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_imnorxz, /*regex:*/Active_imnorxz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeOther x}.
     */
    Active_imnrx(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_imnrxz, /*print0:*/Active_imnrxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_imnorx, /*timeOlder:*/Active_imnorx_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeOther x}.
     */
    Active_imnrx_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_imnrxz, /*print0:*/Active_imnrxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_imnorx, /*timeOlder:*/Active_imnorx_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_imorx(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_imorxz, /*print0:*/Active_imorxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_imnorx, /*timeNewer:*/Active_imnorx_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeModified, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_imorx_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_imorxz, /*print0:*/Active_imorxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_imnorx, /*timeNewer:*/Active_imnorx_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeModified, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #typeOther x}.
     */
    Active_imrxz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_imnrxz, /*timeNewer:*/Active_imnrxz_long, /*o:*/Active_imorxz, /*timeOlder:*/Active_imorxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #typeOther x}.
     */
    Active_imrxz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_imnrxz, /*timeNewer:*/Active_imnrxz_long, /*o:*/Active_imorxz, /*timeOlder:*/Active_imorxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_mnorx(
		/*i:*/Active_imnorx, /*ignoreCase:*/Active_imnorx_long, /*z:*/Active_mnorxz, /*print0:*/Active_mnorxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_mnorx_long(
		/*i:*/Active_imnorx, /*ignoreCase:*/Active_imnorx_long, /*z:*/Active_mnorxz, /*print0:*/Active_mnorxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeOther x}.
     */
    Active_mnrxz(
		/*i:*/Active_imnrxz, /*ignoreCase:*/Active_imnrxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_mnorxz, /*timeOlder:*/Active_mnorxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeOther x}.
     */
    Active_mnrxz_long(
		/*i:*/Active_imnrxz, /*ignoreCase:*/Active_imnrxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_mnorxz, /*timeOlder:*/Active_mnorxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_morxz(
		/*i:*/Active_imorxz, /*ignoreCase:*/Active_imorxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_mnorxz, /*timeNewer:*/Active_mnorxz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_morxz_long(
		/*i:*/Active_imorxz, /*ignoreCase:*/Active_imorxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_mnorxz, /*timeNewer:*/Active_mnorxz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_imnox(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_imnoxz, /*print0:*/Active_imnoxz_long, /*r:*/Active_imnorx, /*regex:*/Active_imnorx_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_imnox_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_imnoxz, /*print0:*/Active_imnoxz_long, /*r:*/Active_imnorx, /*regex:*/Active_imnorx_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeOther x}.
     */
    Active_imnxz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_imnrxz, /*regex:*/Active_imnrxz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_imnoxz, /*timeOlder:*/Active_imnoxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeModified, FindOption.timeNewer, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeOther x}.
     */
    Active_imnxz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_imnrxz, /*regex:*/Active_imnrxz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_imnoxz, /*timeOlder:*/Active_imnoxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeModified, FindOption.timeNewer, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_imoxz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_imorxz, /*regex:*/Active_imorxz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_imnoxz, /*timeNewer:*/Active_imnoxz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeModified, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_imoxz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_imorxz, /*regex:*/Active_imorxz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_imnoxz, /*timeNewer:*/Active_imnoxz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeModified, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_mnoxz(
		/*i:*/Active_imnoxz, /*ignoreCase:*/Active_imnoxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_mnorxz, /*regex:*/Active_mnorxz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_mnoxz_long(
		/*i:*/Active_imnoxz, /*ignoreCase:*/Active_imnoxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_mnorxz, /*regex:*/Active_mnorxz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeModified m}, {@link #typeOther x}.
     */
    Active_imrx(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_imrxz, /*print0:*/Active_imrxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_imnrx, /*timeNewer:*/Active_imnrx_long, /*o:*/Active_imorx, /*timeOlder:*/Active_imorx_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeModified, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeModified m}, {@link #typeOther x}.
     */
    Active_imrx_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_imrxz, /*print0:*/Active_imrxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_imnrx, /*timeNewer:*/Active_imnrx_long, /*o:*/Active_imorx, /*timeOlder:*/Active_imorx_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeModified, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeOther x}.
     */
    Active_mnrx(
		/*i:*/Active_imnrx, /*ignoreCase:*/Active_imnrx_long, /*z:*/Active_mnrxz, /*print0:*/Active_mnrxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_mnorx, /*timeOlder:*/Active_mnorx_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeOther x}.
     */
    Active_mnrx_long(
		/*i:*/Active_imnrx, /*ignoreCase:*/Active_imnrx_long, /*z:*/Active_mnrxz, /*print0:*/Active_mnrxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_mnorx, /*timeOlder:*/Active_mnorx_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.regex, FindOption.timeModified, FindOption.timeNewer, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_morx(
		/*i:*/Active_imorx, /*ignoreCase:*/Active_imorx_long, /*z:*/Active_morxz, /*print0:*/Active_morxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_mnorx, /*timeNewer:*/Active_mnorx_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.regex, FindOption.timeModified, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_morx_long(
		/*i:*/Active_imorx, /*ignoreCase:*/Active_imorx_long, /*z:*/Active_morxz, /*print0:*/Active_morxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_mnorx, /*timeNewer:*/Active_mnorx_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.regex, FindOption.timeModified, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #typeOther x}.
     */
    Active_mrxz(
		/*i:*/Active_imrxz, /*ignoreCase:*/Active_imrxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_mnrxz, /*timeNewer:*/Active_mnrxz_long, /*o:*/Active_morxz, /*timeOlder:*/Active_morxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeModified m}, {@link #typeOther x}.
     */
    Active_mrxz_long(
		/*i:*/Active_imrxz, /*ignoreCase:*/Active_imrxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_mnrxz, /*timeNewer:*/Active_mnrxz_long, /*o:*/Active_morxz, /*timeOlder:*/Active_morxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeModified, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeOther x}.
     */
    Active_imnx(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_imnxz, /*print0:*/Active_imnxz_long, /*r:*/Active_imnrx, /*regex:*/Active_imnrx_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_imnox, /*timeOlder:*/Active_imnox_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeModified, FindOption.timeNewer, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeOther x}.
     */
    Active_imnx_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_imnxz, /*print0:*/Active_imnxz_long, /*r:*/Active_imnrx, /*regex:*/Active_imnrx_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_imnox, /*timeOlder:*/Active_imnox_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeModified, FindOption.timeNewer, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_imox(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_imoxz, /*print0:*/Active_imoxz_long, /*r:*/Active_imorx, /*regex:*/Active_imorx_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_imnox, /*timeNewer:*/Active_imnox_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeModified, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_imox_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_imoxz, /*print0:*/Active_imoxz_long, /*r:*/Active_imorx, /*regex:*/Active_imorx_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_imnox, /*timeNewer:*/Active_imnox_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeModified, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeModified m}, {@link #typeOther x}.
     */
    Active_imxz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_imrxz, /*regex:*/Active_imrxz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_imnxz, /*timeNewer:*/Active_imnxz_long, /*o:*/Active_imoxz, /*timeOlder:*/Active_imoxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeModified, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeModified m}, {@link #typeOther x}.
     */
    Active_imxz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_imrxz, /*regex:*/Active_imrxz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_imnxz, /*timeNewer:*/Active_imnxz_long, /*o:*/Active_imoxz, /*timeOlder:*/Active_imoxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeModified, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_mnox(
		/*i:*/Active_imnox, /*ignoreCase:*/Active_imnox_long, /*z:*/Active_mnoxz, /*print0:*/Active_mnoxz_long, /*r:*/Active_mnorx, /*regex:*/Active_mnorx_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #timeModified m}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_mnox_long(
		/*i:*/Active_imnox, /*ignoreCase:*/Active_imnox_long, /*z:*/Active_mnoxz, /*print0:*/Active_mnoxz_long, /*r:*/Active_mnorx, /*regex:*/Active_mnorx_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.timeModified, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeOther x}.
     */
    Active_mnxz(
		/*i:*/Active_imnxz, /*ignoreCase:*/Active_imnxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_mnrxz, /*regex:*/Active_mnrxz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_mnoxz, /*timeOlder:*/Active_mnoxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.timeModified, FindOption.timeNewer, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeModified m}, {@link #timeNewer n}, {@link #typeOther x}.
     */
    Active_mnxz_long(
		/*i:*/Active_imnxz, /*ignoreCase:*/Active_imnxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_mnrxz, /*regex:*/Active_mnrxz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_mnoxz, /*timeOlder:*/Active_mnoxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.timeModified, FindOption.timeNewer, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_moxz(
		/*i:*/Active_imoxz, /*ignoreCase:*/Active_imoxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_morxz, /*regex:*/Active_morxz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_mnoxz, /*timeNewer:*/Active_mnoxz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.timeModified, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeModified m}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_moxz_long(
		/*i:*/Active_imoxz, /*ignoreCase:*/Active_imoxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_morxz, /*regex:*/Active_morxz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_mnoxz, /*timeNewer:*/Active_mnoxz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.timeModified, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeModified m}, {@link #typeOther x}.
     */
    Active_mrx(
		/*i:*/Active_imrx, /*ignoreCase:*/Active_imrx_long, /*z:*/Active_mrxz, /*print0:*/Active_mrxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_mnrx, /*timeNewer:*/Active_mnrx_long, /*o:*/Active_morx, /*timeOlder:*/Active_morx_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.regex, FindOption.timeModified, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeModified m}, {@link #typeOther x}.
     */
    Active_mrx_long(
		/*i:*/Active_imrx, /*ignoreCase:*/Active_imrx_long, /*z:*/Active_mrxz, /*print0:*/Active_mrxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_mnrx, /*timeNewer:*/Active_mnrx_long, /*o:*/Active_morx, /*timeOlder:*/Active_morx_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.regex, FindOption.timeModified, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeModified m}, {@link #typeOther x}.
     */
    Active_imx(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_imxz, /*print0:*/Active_imxz_long, /*r:*/Active_imrx, /*regex:*/Active_imrx_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_imnx, /*timeNewer:*/Active_imnx_long, /*o:*/Active_imox, /*timeOlder:*/Active_imox_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeModified, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeModified m}, {@link #typeOther x}.
     */
    Active_imx_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_imxz, /*print0:*/Active_imxz_long, /*r:*/Active_imrx, /*regex:*/Active_imrx_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_imnx, /*timeNewer:*/Active_imnx_long, /*o:*/Active_imox, /*timeOlder:*/Active_imox_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeModified, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #timeModified m}, {@link #timeNewer n}, {@link #typeOther x}.
     */
    Active_mnx(
		/*i:*/Active_imnx, /*ignoreCase:*/Active_imnx_long, /*z:*/Active_mnxz, /*print0:*/Active_mnxz_long, /*r:*/Active_mnrx, /*regex:*/Active_mnrx_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_mnox, /*timeOlder:*/Active_mnox_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.timeModified, FindOption.timeNewer, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #timeModified m}, {@link #timeNewer n}, {@link #typeOther x}.
     */
    Active_mnx_long(
		/*i:*/Active_imnx, /*ignoreCase:*/Active_imnx_long, /*z:*/Active_mnxz, /*print0:*/Active_mnxz_long, /*r:*/Active_mnrx, /*regex:*/Active_mnrx_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_mnox, /*timeOlder:*/Active_mnox_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.timeModified, FindOption.timeNewer, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #timeModified m}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_mox(
		/*i:*/Active_imox, /*ignoreCase:*/Active_imox_long, /*z:*/Active_moxz, /*print0:*/Active_moxz_long, /*r:*/Active_morx, /*regex:*/Active_morx_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_mnox, /*timeNewer:*/Active_mnox_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.timeModified, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #timeModified m}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_mox_long(
		/*i:*/Active_imox, /*ignoreCase:*/Active_imox_long, /*z:*/Active_moxz, /*print0:*/Active_moxz_long, /*r:*/Active_morx, /*regex:*/Active_morx_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_mnox, /*timeNewer:*/Active_mnox_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.timeModified, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeModified m}, {@link #typeOther x}.
     */
    Active_mxz(
		/*i:*/Active_imxz, /*ignoreCase:*/Active_imxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_mrxz, /*regex:*/Active_mrxz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_mnxz, /*timeNewer:*/Active_mnxz_long, /*o:*/Active_moxz, /*timeOlder:*/Active_moxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.timeModified, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeModified m}, {@link #typeOther x}.
     */
    Active_mxz_long(
		/*i:*/Active_imxz, /*ignoreCase:*/Active_imxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_mrxz, /*regex:*/Active_mrxz_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_mnxz, /*timeNewer:*/Active_mnxz_long, /*o:*/Active_moxz, /*timeOlder:*/Active_moxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.timeModified, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #timeModified m}, {@link #typeOther x}.
     */
    Active_mx(
		/*i:*/Active_imx, /*ignoreCase:*/Active_imx_long, /*z:*/Active_mxz, /*print0:*/Active_mxz_long, /*r:*/Active_mrx, /*regex:*/Active_mrx_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_mnx, /*timeNewer:*/Active_mnx_long, /*o:*/Active_mox, /*timeOlder:*/Active_mox_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.timeModified, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #timeModified m}, {@link #typeOther x}.
     */
    Active_mx_long(
		/*i:*/Active_imx, /*ignoreCase:*/Active_imx_long, /*z:*/Active_mxz, /*print0:*/Active_mxz_long, /*r:*/Active_mrx, /*regex:*/Active_mrx_long, /*m:*/null /*already set*/, /*timeModified:*/null /*already set*/, /*n:*/Active_mnx, /*timeNewer:*/Active_mnx_long, /*o:*/Active_mox, /*timeOlder:*/Active_mox_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.timeModified, FindOption.typeOther
    );

    /**
     * Option {@code "-i"}: Use case insensitive matching when applying the file name pattern
     * specified by the name operand
     * <p>
     * (This option is ignored if no name operand is specified).
     * <p>
     * The option {@code "-i"} is equivalent to the {@code "--}{@link #ignoreCase ignoreCase}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-i"}. If the option {@code "-i"}
     * is already set, the field {@code i} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final FindOptionSet_imnorxz i;
    /**
     * Option {@code "--ignoreCase"}: Use case insensitive matching when applying the file name pattern
     * specified by the name operand
     * <p>
     * (This option is ignored if no name operand is specified).
     * <p>
     * The option {@code "--ignoreCase"} is equivalent to the {@code "-}{@link #i i}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--ignoreCase"}. If the option {@code "--ignoreCase"}
     * is already set, the field {@code ignoreCase} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final FindOptionSet_imnorxz ignoreCase;
    /**
     * Option {@code "-z"}: Print the full file name on the standard output, followed by a null
     * character (instead of the newline character used by default). This
     * allows file names that contain newlines or other types of white
     * space to be correctly interpreted by programs that process the find
     * output. This option corresponds to the --delimiter0 option of xargs.
     * <p>
     * The option {@code "-z"} is equivalent to the {@code "--}{@link #print0 print0}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-z"}. If the option {@code "-z"}
     * is already set, the field {@code z} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final FindOptionSet_imnorxz z;
    /**
     * Option {@code "--print0"}: Print the full file name on the standard output, followed by a null
     * character (instead of the newline character used by default). This
     * allows file names that contain newlines or other types of white
     * space to be correctly interpreted by programs that process the find
     * output. This option corresponds to the --delimiter0 option of xargs.
     * <p>
     * The option {@code "--print0"} is equivalent to the {@code "-}{@link #z z}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--print0"}. If the option {@code "--print0"}
     * is already set, the field {@code print0} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final FindOptionSet_imnorxz print0;
    /**
     * Option {@code "-r"}: Use full regular expression syntax for the patterns specified by the
     * name operand
     * <p>
     * (This option is ignored if no name operand is specified).
     * <p>
     * The option {@code "-r"} is equivalent to the {@code "--}{@link #regex regex}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-r"}. If the option {@code "-r"}
     * is already set, the field {@code r} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final FindOptionSet_imnorxz r;
    /**
     * Option {@code "--regex"}: Use full regular expression syntax for the patterns specified by the
     * name operand
     * <p>
     * (This option is ignored if no name operand is specified).
     * <p>
     * The option {@code "--regex"} is equivalent to the {@code "-}{@link #r r}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--regex"}. If the option {@code "--regex"}
     * is already set, the field {@code regex} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final FindOptionSet_imnorxz regex;
    /**
     * Option {@code "-m"}: The time operand refers to the last modification time of the file
     * (the default)
     * <p>
     * (This option is ignored if no time operand is specified).
     * <p>
     * The option {@code "-m"} is equivalent to the {@code "--}{@link #timeModified timeModified}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-m"}. If the option {@code "-m"}
     * is already set, the field {@code m} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final FindOptionSet_imnorxz m;
    /**
     * Option {@code "--timeModified"}: The time operand refers to the last modification time of the file
     * (the default)
     * <p>
     * (This option is ignored if no time operand is specified).
     * <p>
     * The option {@code "--timeModified"} is equivalent to the {@code "-}{@link #m m}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--timeModified"}. If the option {@code "--timeModified"}
     * is already set, the field {@code timeModified} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final FindOptionSet_imnorxz timeModified;
    /**
     * Option {@code "-n"}: Consider only files that have been created, modified or accessed
     * after or at the time specified by the time operand (the default)
     * <p>
     * (This option is ignored if no time operand is specified).
     * <p>
     * The option {@code "-n"} is equivalent to the {@code "--}{@link #timeNewer timeNewer}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-n"}. If the option {@code "-n"}
     * is already set, the field {@code n} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final FindOptionSet_imnorxz n;
    /**
     * Option {@code "--timeNewer"}: Consider only files that have been created, modified or accessed
     * after or at the time specified by the time operand (the default)
     * <p>
     * (This option is ignored if no time operand is specified).
     * <p>
     * The option {@code "--timeNewer"} is equivalent to the {@code "-}{@link #n n}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--timeNewer"}. If the option {@code "--timeNewer"}
     * is already set, the field {@code timeNewer} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final FindOptionSet_imnorxz timeNewer;
    /**
     * Option {@code "-o"}: Consider only files that have been created, modified or accessed
     * before or at the time specified by the time operand
     * <p>
     * (This option is ignored if no time operand is specified).
     * <p>
     * The option {@code "-o"} is equivalent to the {@code "--}{@link #timeOlder timeOlder}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-o"}. If the option {@code "-o"}
     * is already set, the field {@code o} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final FindOptionSet_imnorxz o;
    /**
     * Option {@code "--timeOlder"}: Consider only files that have been created, modified or accessed
     * before or at the time specified by the time operand
     * <p>
     * (This option is ignored if no time operand is specified).
     * <p>
     * The option {@code "--timeOlder"} is equivalent to the {@code "-}{@link #o o}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--timeOlder"}. If the option {@code "--timeOlder"}
     * is already set, the field {@code timeOlder} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final FindOptionSet_imnorxz timeOlder;
    /**
     * Option {@code "-x"}: Consider only files that are neither of directory (d),
     * regular file (f) or symlink (l).
     * <p>
     * The option {@code "-x"} is equivalent to the {@code "--}{@link #typeOther typeOther}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-x"}. If the option {@code "-x"}
     * is already set, the field {@code x} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final FindOptionSet_imnorxz x;
    /**
     * Option {@code "--typeOther"}: Consider only files that are neither of directory (d),
     * regular file (f) or symlink (l).
     * <p>
     * The option {@code "--typeOther"} is equivalent to the {@code "-}{@link #x x}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--typeOther"}. If the option {@code "--typeOther"}
     * is already set, the field {@code typeOther} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final FindOptionSet_imnorxz typeOther;
    private final boolean useAcronym;
    private final EnumSet<FindOption> options;

    private FindOptionSet_imnorxz(
            FindOptionSet_imnorxz i, FindOptionSet_imnorxz ignoreCase, FindOptionSet_imnorxz z, FindOptionSet_imnorxz print0, FindOptionSet_imnorxz r, FindOptionSet_imnorxz regex, FindOptionSet_imnorxz m, FindOptionSet_imnorxz timeModified, FindOptionSet_imnorxz n, FindOptionSet_imnorxz timeNewer, FindOptionSet_imnorxz o, FindOptionSet_imnorxz timeOlder, FindOptionSet_imnorxz x, FindOptionSet_imnorxz typeOther,
            boolean useAcronym,
            FindOption... activeOptions
    ) {
        this.i = i == null ? this : i;
        this.ignoreCase = ignoreCase == null ? this : ignoreCase;
        this.z = z == null ? this : z;
        this.print0 = print0 == null ? this : print0;
        this.r = r == null ? this : r;
        this.regex = regex == null ? this : regex;
        this.m = m == null ? this : m;
        this.timeModified = timeModified == null ? this : timeModified;
        this.n = n == null ? this : n;
        this.timeNewer = timeNewer == null ? this : timeNewer;
        this.o = o == null ? this : o;
        this.timeOlder = timeOlder == null ? this : timeOlder;
        this.x = x == null ? this : x;
        this.typeOther = typeOther == null ? this : typeOther;
        this.useAcronym = useAcronym;
        this.options = activeOptions.length == 0 ? EnumSet.noneOf(FindOption.class) : EnumSet.copyOf(Arrays.asList(activeOptions));
    }

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
     *    FindOptionSet_imnorxz.ignoreCase.z;
     * </pre>
     * uses acronyms, that is, this method always returns true for the above
     * set.
     * <p>
     * On the other hand, long option names are used and this method always
     * returns false for the set
     * <pre>
     *    FindOptionSet_imnorxz.i.print0;
     * </pre>
     * <p>
     * Note that a repeated option is <i>not</i> treated as the last set option.
     * For instance, the first and last option of the following set are
     * equivalent and acronyms are used:
     * <pre>
     *    FindOptionSet_imnorxz.i.z.ignoreCase;
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
    public boolean useAcronymFor(FindOption option) {
        return useAcronym;
    }
}
