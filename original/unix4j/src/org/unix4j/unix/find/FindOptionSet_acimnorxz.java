package org.unix4j.unix.find;

import org.unix4j.option.Option;
import org.unix4j.unix.Find;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Option sets for the {@link Find find} command with
 * the following options: {@link #i i}, {@link #z z}, {@link #r r}, {@link #a a}, {@link #c c}, {@link #m m}, {@link #n n}, {@link #o o}, {@link #x x}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Find#Options} should be used instead to specify command
 * options. See also {@link org.unix4j.unix.find.FindOptions} for more information.
 */
public enum FindOptionSet_acimnorxz implements FindOptions {
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_inorxz(
        /*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ainorxz.Active_ainorxz, /*timeAccess:*/FindOptionSet_ainorxz.Active_ainorxz_long, /*c:*/FindOptionSet_cinorxz.Active_cinorxz, /*timeCreate:*/FindOptionSet_cinorxz.Active_cinorxz_long, /*m:*/FindOptionSet_imnorxz.Active_imnorxz, /*timeModified:*/FindOptionSet_imnorxz.Active_imnorxz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
        /*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_inorxz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ainorxz.Active_ainorxz, /*timeAccess:*/FindOptionSet_ainorxz.Active_ainorxz_long, /*c:*/FindOptionSet_cinorxz.Active_cinorxz, /*timeCreate:*/FindOptionSet_cinorxz.Active_cinorxz_long, /*m:*/FindOptionSet_imnorxz.Active_imnorxz, /*timeModified:*/FindOptionSet_imnorxz.Active_imnorxz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_inorx(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_inorxz, /*print0:*/Active_inorxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ainorxz.Active_ainorx, /*timeAccess:*/FindOptionSet_ainorxz.Active_ainorx_long, /*c:*/FindOptionSet_cinorxz.Active_cinorx, /*timeCreate:*/FindOptionSet_cinorxz.Active_cinorx_long, /*m:*/FindOptionSet_imnorxz.Active_imnorx, /*timeModified:*/FindOptionSet_imnorxz.Active_imnorx_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_inorx_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_inorxz, /*print0:*/Active_inorxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ainorxz.Active_ainorx, /*timeAccess:*/FindOptionSet_ainorxz.Active_ainorx_long, /*c:*/FindOptionSet_cinorxz.Active_cinorx, /*timeCreate:*/FindOptionSet_cinorxz.Active_cinorx_long, /*m:*/FindOptionSet_imnorxz.Active_imnorx, /*timeModified:*/FindOptionSet_imnorxz.Active_imnorx_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeNewer n}, {@link #typeOther x}.
     */
    Active_inrxz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ainorxz.Active_ainrxz, /*timeAccess:*/FindOptionSet_ainorxz.Active_ainrxz_long, /*c:*/FindOptionSet_cinorxz.Active_cinrxz, /*timeCreate:*/FindOptionSet_cinorxz.Active_cinrxz_long, /*m:*/FindOptionSet_imnorxz.Active_imnrxz, /*timeModified:*/FindOptionSet_imnorxz.Active_imnrxz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_inorxz, /*timeOlder:*/Active_inorxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeNewer, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeNewer n}, {@link #typeOther x}.
     */
    Active_inrxz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ainorxz.Active_ainrxz, /*timeAccess:*/FindOptionSet_ainorxz.Active_ainrxz_long, /*c:*/FindOptionSet_cinorxz.Active_cinrxz, /*timeCreate:*/FindOptionSet_cinorxz.Active_cinrxz_long, /*m:*/FindOptionSet_imnorxz.Active_imnrxz, /*timeModified:*/FindOptionSet_imnorxz.Active_imnrxz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_inorxz, /*timeOlder:*/Active_inorxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeNewer, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_iorxz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ainorxz.Active_aiorxz, /*timeAccess:*/FindOptionSet_ainorxz.Active_aiorxz_long, /*c:*/FindOptionSet_cinorxz.Active_ciorxz, /*timeCreate:*/FindOptionSet_cinorxz.Active_ciorxz_long, /*m:*/FindOptionSet_imnorxz.Active_imorxz, /*timeModified:*/FindOptionSet_imnorxz.Active_imorxz_long, /*n:*/Active_inorxz, /*timeNewer:*/Active_inorxz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_iorxz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ainorxz.Active_aiorxz, /*timeAccess:*/FindOptionSet_ainorxz.Active_aiorxz_long, /*c:*/FindOptionSet_cinorxz.Active_ciorxz, /*timeCreate:*/FindOptionSet_cinorxz.Active_ciorxz_long, /*m:*/FindOptionSet_imnorxz.Active_imorxz, /*timeModified:*/FindOptionSet_imnorxz.Active_imorxz_long, /*n:*/Active_inorxz, /*timeNewer:*/Active_inorxz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_norxz(
		/*i:*/Active_inorxz, /*ignoreCase:*/Active_inorxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ainorxz.Active_anorxz, /*timeAccess:*/FindOptionSet_ainorxz.Active_anorxz_long, /*c:*/FindOptionSet_cinorxz.Active_cnorxz, /*timeCreate:*/FindOptionSet_cinorxz.Active_cnorxz_long, /*m:*/FindOptionSet_imnorxz.Active_mnorxz, /*timeModified:*/FindOptionSet_imnorxz.Active_mnorxz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_norxz_long(
		/*i:*/Active_inorxz, /*ignoreCase:*/Active_inorxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ainorxz.Active_anorxz, /*timeAccess:*/FindOptionSet_ainorxz.Active_anorxz_long, /*c:*/FindOptionSet_cinorxz.Active_cnorxz, /*timeCreate:*/FindOptionSet_cinorxz.Active_cnorxz_long, /*m:*/FindOptionSet_imnorxz.Active_mnorxz, /*timeModified:*/FindOptionSet_imnorxz.Active_mnorxz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_inoxz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_inorxz, /*regex:*/Active_inorxz_long, /*a:*/FindOptionSet_ainorxz.Active_ainoxz, /*timeAccess:*/FindOptionSet_ainorxz.Active_ainoxz_long, /*c:*/FindOptionSet_cinorxz.Active_cinoxz, /*timeCreate:*/FindOptionSet_cinorxz.Active_cinoxz_long, /*m:*/FindOptionSet_imnorxz.Active_imnoxz, /*timeModified:*/FindOptionSet_imnorxz.Active_imnoxz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_inoxz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_inorxz, /*regex:*/Active_inorxz_long, /*a:*/FindOptionSet_ainorxz.Active_ainoxz, /*timeAccess:*/FindOptionSet_ainorxz.Active_ainoxz_long, /*c:*/FindOptionSet_cinorxz.Active_cinoxz, /*timeCreate:*/FindOptionSet_cinorxz.Active_cinoxz_long, /*m:*/FindOptionSet_imnorxz.Active_imnoxz, /*timeModified:*/FindOptionSet_imnorxz.Active_imnoxz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeNewer n}, {@link #typeOther x}.
     */
    Active_inrx(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_inrxz, /*print0:*/Active_inrxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ainorxz.Active_ainrx, /*timeAccess:*/FindOptionSet_ainorxz.Active_ainrx_long, /*c:*/FindOptionSet_cinorxz.Active_cinrx, /*timeCreate:*/FindOptionSet_cinorxz.Active_cinrx_long, /*m:*/FindOptionSet_imnorxz.Active_imnrx, /*timeModified:*/FindOptionSet_imnorxz.Active_imnrx_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_inorx, /*timeOlder:*/Active_inorx_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeNewer, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeNewer n}, {@link #typeOther x}.
     */
    Active_inrx_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_inrxz, /*print0:*/Active_inrxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ainorxz.Active_ainrx, /*timeAccess:*/FindOptionSet_ainorxz.Active_ainrx_long, /*c:*/FindOptionSet_cinorxz.Active_cinrx, /*timeCreate:*/FindOptionSet_cinorxz.Active_cinrx_long, /*m:*/FindOptionSet_imnorxz.Active_imnrx, /*timeModified:*/FindOptionSet_imnorxz.Active_imnrx_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_inorx, /*timeOlder:*/Active_inorx_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeNewer, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_iorx(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_iorxz, /*print0:*/Active_iorxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ainorxz.Active_aiorx, /*timeAccess:*/FindOptionSet_ainorxz.Active_aiorx_long, /*c:*/FindOptionSet_cinorxz.Active_ciorx, /*timeCreate:*/FindOptionSet_cinorxz.Active_ciorx_long, /*m:*/FindOptionSet_imnorxz.Active_imorx, /*timeModified:*/FindOptionSet_imnorxz.Active_imorx_long, /*n:*/Active_inorx, /*timeNewer:*/Active_inorx_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_iorx_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_iorxz, /*print0:*/Active_iorxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ainorxz.Active_aiorx, /*timeAccess:*/FindOptionSet_ainorxz.Active_aiorx_long, /*c:*/FindOptionSet_cinorxz.Active_ciorx, /*timeCreate:*/FindOptionSet_cinorxz.Active_ciorx_long, /*m:*/FindOptionSet_imnorxz.Active_imorx, /*timeModified:*/FindOptionSet_imnorxz.Active_imorx_long, /*n:*/Active_inorx, /*timeNewer:*/Active_inorx_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #typeOther x}.
     */
    Active_irxz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ainorxz.Active_airxz, /*timeAccess:*/FindOptionSet_ainorxz.Active_airxz_long, /*c:*/FindOptionSet_cinorxz.Active_cirxz, /*timeCreate:*/FindOptionSet_cinorxz.Active_cirxz_long, /*m:*/FindOptionSet_imnorxz.Active_imrxz, /*timeModified:*/FindOptionSet_imnorxz.Active_imrxz_long, /*n:*/Active_inrxz, /*timeNewer:*/Active_inrxz_long, /*o:*/Active_iorxz, /*timeOlder:*/Active_iorxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #regex r}, {@link #typeOther x}.
     */
    Active_irxz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ainorxz.Active_airxz, /*timeAccess:*/FindOptionSet_ainorxz.Active_airxz_long, /*c:*/FindOptionSet_cinorxz.Active_cirxz, /*timeCreate:*/FindOptionSet_cinorxz.Active_cirxz_long, /*m:*/FindOptionSet_imnorxz.Active_imrxz, /*timeModified:*/FindOptionSet_imnorxz.Active_imrxz_long, /*n:*/Active_inrxz, /*timeNewer:*/Active_inrxz_long, /*o:*/Active_iorxz, /*timeOlder:*/Active_iorxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.regex, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_norx(
		/*i:*/Active_inorx, /*ignoreCase:*/Active_inorx_long, /*z:*/Active_norxz, /*print0:*/Active_norxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ainorxz.Active_anorx, /*timeAccess:*/FindOptionSet_ainorxz.Active_anorx_long, /*c:*/FindOptionSet_cinorxz.Active_cnorx, /*timeCreate:*/FindOptionSet_cinorxz.Active_cnorx_long, /*m:*/FindOptionSet_imnorxz.Active_mnorx, /*timeModified:*/FindOptionSet_imnorxz.Active_mnorx_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.regex, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_norx_long(
		/*i:*/Active_inorx, /*ignoreCase:*/Active_inorx_long, /*z:*/Active_norxz, /*print0:*/Active_norxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ainorxz.Active_anorx, /*timeAccess:*/FindOptionSet_ainorxz.Active_anorx_long, /*c:*/FindOptionSet_cinorxz.Active_cnorx, /*timeCreate:*/FindOptionSet_cinorxz.Active_cnorx_long, /*m:*/FindOptionSet_imnorxz.Active_mnorx, /*timeModified:*/FindOptionSet_imnorxz.Active_mnorx_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.regex, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeNewer n}, {@link #typeOther x}.
     */
    Active_nrxz(
		/*i:*/Active_inrxz, /*ignoreCase:*/Active_inrxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ainorxz.Active_anrxz, /*timeAccess:*/FindOptionSet_ainorxz.Active_anrxz_long, /*c:*/FindOptionSet_cinorxz.Active_cnrxz, /*timeCreate:*/FindOptionSet_cinorxz.Active_cnrxz_long, /*m:*/FindOptionSet_imnorxz.Active_mnrxz, /*timeModified:*/FindOptionSet_imnorxz.Active_mnrxz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_norxz, /*timeOlder:*/Active_norxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeNewer, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeNewer n}, {@link #typeOther x}.
     */
    Active_nrxz_long(
		/*i:*/Active_inrxz, /*ignoreCase:*/Active_inrxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ainorxz.Active_anrxz, /*timeAccess:*/FindOptionSet_ainorxz.Active_anrxz_long, /*c:*/FindOptionSet_cinorxz.Active_cnrxz, /*timeCreate:*/FindOptionSet_cinorxz.Active_cnrxz_long, /*m:*/FindOptionSet_imnorxz.Active_mnrxz, /*timeModified:*/FindOptionSet_imnorxz.Active_mnrxz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_norxz, /*timeOlder:*/Active_norxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeNewer, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_orxz(
		/*i:*/Active_iorxz, /*ignoreCase:*/Active_iorxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ainorxz.Active_aorxz, /*timeAccess:*/FindOptionSet_ainorxz.Active_aorxz_long, /*c:*/FindOptionSet_cinorxz.Active_corxz, /*timeCreate:*/FindOptionSet_cinorxz.Active_corxz_long, /*m:*/FindOptionSet_imnorxz.Active_morxz, /*timeModified:*/FindOptionSet_imnorxz.Active_morxz_long, /*n:*/Active_norxz, /*timeNewer:*/Active_norxz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_orxz_long(
		/*i:*/Active_iorxz, /*ignoreCase:*/Active_iorxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ainorxz.Active_aorxz, /*timeAccess:*/FindOptionSet_ainorxz.Active_aorxz_long, /*c:*/FindOptionSet_cinorxz.Active_corxz, /*timeCreate:*/FindOptionSet_cinorxz.Active_corxz_long, /*m:*/FindOptionSet_imnorxz.Active_morxz, /*timeModified:*/FindOptionSet_imnorxz.Active_morxz_long, /*n:*/Active_norxz, /*timeNewer:*/Active_norxz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_inox(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_inoxz, /*print0:*/Active_inoxz_long, /*r:*/Active_inorx, /*regex:*/Active_inorx_long, /*a:*/FindOptionSet_ainorxz.Active_ainox, /*timeAccess:*/FindOptionSet_ainorxz.Active_ainox_long, /*c:*/FindOptionSet_cinorxz.Active_cinox, /*timeCreate:*/FindOptionSet_cinorxz.Active_cinox_long, /*m:*/FindOptionSet_imnorxz.Active_imnox, /*timeModified:*/FindOptionSet_imnorxz.Active_imnox_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_inox_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_inoxz, /*print0:*/Active_inoxz_long, /*r:*/Active_inorx, /*regex:*/Active_inorx_long, /*a:*/FindOptionSet_ainorxz.Active_ainox, /*timeAccess:*/FindOptionSet_ainorxz.Active_ainox_long, /*c:*/FindOptionSet_cinorxz.Active_cinox, /*timeCreate:*/FindOptionSet_cinorxz.Active_cinox_long, /*m:*/FindOptionSet_imnorxz.Active_imnox, /*timeModified:*/FindOptionSet_imnorxz.Active_imnox_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeNewer n}, {@link #typeOther x}.
     */
    Active_inxz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_inrxz, /*regex:*/Active_inrxz_long, /*a:*/FindOptionSet_ainorxz.Active_ainxz, /*timeAccess:*/FindOptionSet_ainorxz.Active_ainxz_long, /*c:*/FindOptionSet_cinorxz.Active_cinxz, /*timeCreate:*/FindOptionSet_cinorxz.Active_cinxz_long, /*m:*/FindOptionSet_imnorxz.Active_imnxz, /*timeModified:*/FindOptionSet_imnorxz.Active_imnxz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_inoxz, /*timeOlder:*/Active_inoxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeNewer, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeNewer n}, {@link #typeOther x}.
     */
    Active_inxz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_inrxz, /*regex:*/Active_inrxz_long, /*a:*/FindOptionSet_ainorxz.Active_ainxz, /*timeAccess:*/FindOptionSet_ainorxz.Active_ainxz_long, /*c:*/FindOptionSet_cinorxz.Active_cinxz, /*timeCreate:*/FindOptionSet_cinorxz.Active_cinxz_long, /*m:*/FindOptionSet_imnorxz.Active_imnxz, /*timeModified:*/FindOptionSet_imnorxz.Active_imnxz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_inoxz, /*timeOlder:*/Active_inoxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeNewer, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_ioxz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_iorxz, /*regex:*/Active_iorxz_long, /*a:*/FindOptionSet_ainorxz.Active_aioxz, /*timeAccess:*/FindOptionSet_ainorxz.Active_aioxz_long, /*c:*/FindOptionSet_cinorxz.Active_cioxz, /*timeCreate:*/FindOptionSet_cinorxz.Active_cioxz_long, /*m:*/FindOptionSet_imnorxz.Active_imoxz, /*timeModified:*/FindOptionSet_imnorxz.Active_imoxz_long, /*n:*/Active_inoxz, /*timeNewer:*/Active_inoxz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_ioxz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_iorxz, /*regex:*/Active_iorxz_long, /*a:*/FindOptionSet_ainorxz.Active_aioxz, /*timeAccess:*/FindOptionSet_ainorxz.Active_aioxz_long, /*c:*/FindOptionSet_cinorxz.Active_cioxz, /*timeCreate:*/FindOptionSet_cinorxz.Active_cioxz_long, /*m:*/FindOptionSet_imnorxz.Active_imoxz, /*timeModified:*/FindOptionSet_imnorxz.Active_imoxz_long, /*n:*/Active_inoxz, /*timeNewer:*/Active_inoxz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_noxz(
		/*i:*/Active_inoxz, /*ignoreCase:*/Active_inoxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_norxz, /*regex:*/Active_norxz_long, /*a:*/FindOptionSet_ainorxz.Active_anoxz, /*timeAccess:*/FindOptionSet_ainorxz.Active_anoxz_long, /*c:*/FindOptionSet_cinorxz.Active_cnoxz, /*timeCreate:*/FindOptionSet_cinorxz.Active_cnoxz_long, /*m:*/FindOptionSet_imnorxz.Active_mnoxz, /*timeModified:*/FindOptionSet_imnorxz.Active_mnoxz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_noxz_long(
		/*i:*/Active_inoxz, /*ignoreCase:*/Active_inoxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_norxz, /*regex:*/Active_norxz_long, /*a:*/FindOptionSet_ainorxz.Active_anoxz, /*timeAccess:*/FindOptionSet_ainorxz.Active_anoxz_long, /*c:*/FindOptionSet_cinorxz.Active_cnoxz, /*timeCreate:*/FindOptionSet_cinorxz.Active_cnoxz_long, /*m:*/FindOptionSet_imnorxz.Active_mnoxz, /*timeModified:*/FindOptionSet_imnorxz.Active_mnoxz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #typeOther x}.
     */
    Active_irx(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_irxz, /*print0:*/Active_irxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ainorxz.Active_airx, /*timeAccess:*/FindOptionSet_ainorxz.Active_airx_long, /*c:*/FindOptionSet_cinorxz.Active_cirx, /*timeCreate:*/FindOptionSet_cinorxz.Active_cirx_long, /*m:*/FindOptionSet_imnorxz.Active_imrx, /*timeModified:*/FindOptionSet_imnorxz.Active_imrx_long, /*n:*/Active_inrx, /*timeNewer:*/Active_inrx_long, /*o:*/Active_iorx, /*timeOlder:*/Active_iorx_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #regex r}, {@link #typeOther x}.
     */
    Active_irx_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_irxz, /*print0:*/Active_irxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ainorxz.Active_airx, /*timeAccess:*/FindOptionSet_ainorxz.Active_airx_long, /*c:*/FindOptionSet_cinorxz.Active_cirx, /*timeCreate:*/FindOptionSet_cinorxz.Active_cirx_long, /*m:*/FindOptionSet_imnorxz.Active_imrx, /*timeModified:*/FindOptionSet_imnorxz.Active_imrx_long, /*n:*/Active_inrx, /*timeNewer:*/Active_inrx_long, /*o:*/Active_iorx, /*timeOlder:*/Active_iorx_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.regex, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeNewer n}, {@link #typeOther x}.
     */
    Active_nrx(
		/*i:*/Active_inrx, /*ignoreCase:*/Active_inrx_long, /*z:*/Active_nrxz, /*print0:*/Active_nrxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ainorxz.Active_anrx, /*timeAccess:*/FindOptionSet_ainorxz.Active_anrx_long, /*c:*/FindOptionSet_cinorxz.Active_cnrx, /*timeCreate:*/FindOptionSet_cinorxz.Active_cnrx_long, /*m:*/FindOptionSet_imnorxz.Active_mnrx, /*timeModified:*/FindOptionSet_imnorxz.Active_mnrx_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_norx, /*timeOlder:*/Active_norx_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.regex, FindOption.timeNewer, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeNewer n}, {@link #typeOther x}.
     */
    Active_nrx_long(
		/*i:*/Active_inrx, /*ignoreCase:*/Active_inrx_long, /*z:*/Active_nrxz, /*print0:*/Active_nrxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ainorxz.Active_anrx, /*timeAccess:*/FindOptionSet_ainorxz.Active_anrx_long, /*c:*/FindOptionSet_cinorxz.Active_cnrx, /*timeCreate:*/FindOptionSet_cinorxz.Active_cnrx_long, /*m:*/FindOptionSet_imnorxz.Active_mnrx, /*timeModified:*/FindOptionSet_imnorxz.Active_mnrx_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_norx, /*timeOlder:*/Active_norx_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.regex, FindOption.timeNewer, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_orx(
		/*i:*/Active_iorx, /*ignoreCase:*/Active_iorx_long, /*z:*/Active_orxz, /*print0:*/Active_orxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ainorxz.Active_aorx, /*timeAccess:*/FindOptionSet_ainorxz.Active_aorx_long, /*c:*/FindOptionSet_cinorxz.Active_corx, /*timeCreate:*/FindOptionSet_cinorxz.Active_corx_long, /*m:*/FindOptionSet_imnorxz.Active_morx, /*timeModified:*/FindOptionSet_imnorxz.Active_morx_long, /*n:*/Active_norx, /*timeNewer:*/Active_norx_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.regex, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_orx_long(
		/*i:*/Active_iorx, /*ignoreCase:*/Active_iorx_long, /*z:*/Active_orxz, /*print0:*/Active_orxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ainorxz.Active_aorx, /*timeAccess:*/FindOptionSet_ainorxz.Active_aorx_long, /*c:*/FindOptionSet_cinorxz.Active_corx, /*timeCreate:*/FindOptionSet_cinorxz.Active_corx_long, /*m:*/FindOptionSet_imnorxz.Active_morx, /*timeModified:*/FindOptionSet_imnorxz.Active_morx_long, /*n:*/Active_norx, /*timeNewer:*/Active_norx_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.regex, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #typeOther x}.
     */
    Active_rxz(
		/*i:*/Active_irxz, /*ignoreCase:*/Active_irxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ainorxz.Active_arxz, /*timeAccess:*/FindOptionSet_ainorxz.Active_arxz_long, /*c:*/FindOptionSet_cinorxz.Active_crxz, /*timeCreate:*/FindOptionSet_cinorxz.Active_crxz_long, /*m:*/FindOptionSet_imnorxz.Active_mrxz, /*timeModified:*/FindOptionSet_imnorxz.Active_mrxz_long, /*n:*/Active_nrxz, /*timeNewer:*/Active_nrxz_long, /*o:*/Active_orxz, /*timeOlder:*/Active_orxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #regex r}, {@link #typeOther x}.
     */
    Active_rxz_long(
		/*i:*/Active_irxz, /*ignoreCase:*/Active_irxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ainorxz.Active_arxz, /*timeAccess:*/FindOptionSet_ainorxz.Active_arxz_long, /*c:*/FindOptionSet_cinorxz.Active_crxz, /*timeCreate:*/FindOptionSet_cinorxz.Active_crxz_long, /*m:*/FindOptionSet_imnorxz.Active_mrxz, /*timeModified:*/FindOptionSet_imnorxz.Active_mrxz_long, /*n:*/Active_nrxz, /*timeNewer:*/Active_nrxz_long, /*o:*/Active_orxz, /*timeOlder:*/Active_orxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.regex, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeNewer n}, {@link #typeOther x}.
     */
    Active_inx(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_inxz, /*print0:*/Active_inxz_long, /*r:*/Active_inrx, /*regex:*/Active_inrx_long, /*a:*/FindOptionSet_ainorxz.Active_ainx, /*timeAccess:*/FindOptionSet_ainorxz.Active_ainx_long, /*c:*/FindOptionSet_cinorxz.Active_cinx, /*timeCreate:*/FindOptionSet_cinorxz.Active_cinx_long, /*m:*/FindOptionSet_imnorxz.Active_imnx, /*timeModified:*/FindOptionSet_imnorxz.Active_imnx_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_inox, /*timeOlder:*/Active_inox_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeNewer, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeNewer n}, {@link #typeOther x}.
     */
    Active_inx_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_inxz, /*print0:*/Active_inxz_long, /*r:*/Active_inrx, /*regex:*/Active_inrx_long, /*a:*/FindOptionSet_ainorxz.Active_ainx, /*timeAccess:*/FindOptionSet_ainorxz.Active_ainx_long, /*c:*/FindOptionSet_cinorxz.Active_cinx, /*timeCreate:*/FindOptionSet_cinorxz.Active_cinx_long, /*m:*/FindOptionSet_imnorxz.Active_imnx, /*timeModified:*/FindOptionSet_imnorxz.Active_imnx_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_inox, /*timeOlder:*/Active_inox_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeNewer, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_iox(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ioxz, /*print0:*/Active_ioxz_long, /*r:*/Active_iorx, /*regex:*/Active_iorx_long, /*a:*/FindOptionSet_ainorxz.Active_aiox, /*timeAccess:*/FindOptionSet_ainorxz.Active_aiox_long, /*c:*/FindOptionSet_cinorxz.Active_ciox, /*timeCreate:*/FindOptionSet_cinorxz.Active_ciox_long, /*m:*/FindOptionSet_imnorxz.Active_imox, /*timeModified:*/FindOptionSet_imnorxz.Active_imox_long, /*n:*/Active_inox, /*timeNewer:*/Active_inox_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_iox_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ioxz, /*print0:*/Active_ioxz_long, /*r:*/Active_iorx, /*regex:*/Active_iorx_long, /*a:*/FindOptionSet_ainorxz.Active_aiox, /*timeAccess:*/FindOptionSet_ainorxz.Active_aiox_long, /*c:*/FindOptionSet_cinorxz.Active_ciox, /*timeCreate:*/FindOptionSet_cinorxz.Active_ciox_long, /*m:*/FindOptionSet_imnorxz.Active_imox, /*timeModified:*/FindOptionSet_imnorxz.Active_imox_long, /*n:*/Active_inox, /*timeNewer:*/Active_inox_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #typeOther x}.
     */
    Active_ixz(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_irxz, /*regex:*/Active_irxz_long, /*a:*/FindOptionSet_ainorxz.Active_aixz, /*timeAccess:*/FindOptionSet_ainorxz.Active_aixz_long, /*c:*/FindOptionSet_cinorxz.Active_cixz, /*timeCreate:*/FindOptionSet_cinorxz.Active_cixz_long, /*m:*/FindOptionSet_imnorxz.Active_imxz, /*timeModified:*/FindOptionSet_imnorxz.Active_imxz_long, /*n:*/Active_inxz, /*timeNewer:*/Active_inxz_long, /*o:*/Active_ioxz, /*timeOlder:*/Active_ioxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #print0 z}, {@link #typeOther x}.
     */
    Active_ixz_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_irxz, /*regex:*/Active_irxz_long, /*a:*/FindOptionSet_ainorxz.Active_aixz, /*timeAccess:*/FindOptionSet_ainorxz.Active_aixz_long, /*c:*/FindOptionSet_cinorxz.Active_cixz, /*timeCreate:*/FindOptionSet_cinorxz.Active_cixz_long, /*m:*/FindOptionSet_imnorxz.Active_imxz, /*timeModified:*/FindOptionSet_imnorxz.Active_imxz_long, /*n:*/Active_inxz, /*timeNewer:*/Active_inxz_long, /*o:*/Active_ioxz, /*timeOlder:*/Active_ioxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.print0, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_nox(
		/*i:*/Active_inox, /*ignoreCase:*/Active_inox_long, /*z:*/Active_noxz, /*print0:*/Active_noxz_long, /*r:*/Active_norx, /*regex:*/Active_norx_long, /*a:*/FindOptionSet_ainorxz.Active_anox, /*timeAccess:*/FindOptionSet_ainorxz.Active_anox_long, /*c:*/FindOptionSet_cinorxz.Active_cnox, /*timeCreate:*/FindOptionSet_cinorxz.Active_cnox_long, /*m:*/FindOptionSet_imnorxz.Active_mnox, /*timeModified:*/FindOptionSet_imnorxz.Active_mnox_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #timeNewer n}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_nox_long(
		/*i:*/Active_inox, /*ignoreCase:*/Active_inox_long, /*z:*/Active_noxz, /*print0:*/Active_noxz_long, /*r:*/Active_norx, /*regex:*/Active_norx_long, /*a:*/FindOptionSet_ainorxz.Active_anox, /*timeAccess:*/FindOptionSet_ainorxz.Active_anox_long, /*c:*/FindOptionSet_cinorxz.Active_cnox, /*timeCreate:*/FindOptionSet_cinorxz.Active_cnox_long, /*m:*/FindOptionSet_imnorxz.Active_mnox, /*timeModified:*/FindOptionSet_imnorxz.Active_mnox_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.timeNewer, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeNewer n}, {@link #typeOther x}.
     */
    Active_nxz(
		/*i:*/Active_inxz, /*ignoreCase:*/Active_inxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_nrxz, /*regex:*/Active_nrxz_long, /*a:*/FindOptionSet_ainorxz.Active_anxz, /*timeAccess:*/FindOptionSet_ainorxz.Active_anxz_long, /*c:*/FindOptionSet_cinorxz.Active_cnxz, /*timeCreate:*/FindOptionSet_cinorxz.Active_cnxz_long, /*m:*/FindOptionSet_imnorxz.Active_mnxz, /*timeModified:*/FindOptionSet_imnorxz.Active_mnxz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_noxz, /*timeOlder:*/Active_noxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.timeNewer, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeNewer n}, {@link #typeOther x}.
     */
    Active_nxz_long(
		/*i:*/Active_inxz, /*ignoreCase:*/Active_inxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_nrxz, /*regex:*/Active_nrxz_long, /*a:*/FindOptionSet_ainorxz.Active_anxz, /*timeAccess:*/FindOptionSet_ainorxz.Active_anxz_long, /*c:*/FindOptionSet_cinorxz.Active_cnxz, /*timeCreate:*/FindOptionSet_cinorxz.Active_cnxz_long, /*m:*/FindOptionSet_imnorxz.Active_mnxz, /*timeModified:*/FindOptionSet_imnorxz.Active_mnxz_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_noxz, /*timeOlder:*/Active_noxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.timeNewer, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_oxz(
		/*i:*/Active_ioxz, /*ignoreCase:*/Active_ioxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_orxz, /*regex:*/Active_orxz_long, /*a:*/FindOptionSet_ainorxz.Active_aoxz, /*timeAccess:*/FindOptionSet_ainorxz.Active_aoxz_long, /*c:*/FindOptionSet_cinorxz.Active_coxz, /*timeCreate:*/FindOptionSet_cinorxz.Active_coxz_long, /*m:*/FindOptionSet_imnorxz.Active_moxz, /*timeModified:*/FindOptionSet_imnorxz.Active_moxz_long, /*n:*/Active_noxz, /*timeNewer:*/Active_noxz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_oxz_long(
		/*i:*/Active_ioxz, /*ignoreCase:*/Active_ioxz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_orxz, /*regex:*/Active_orxz_long, /*a:*/FindOptionSet_ainorxz.Active_aoxz, /*timeAccess:*/FindOptionSet_ainorxz.Active_aoxz_long, /*c:*/FindOptionSet_cinorxz.Active_coxz, /*timeCreate:*/FindOptionSet_cinorxz.Active_coxz_long, /*m:*/FindOptionSet_imnorxz.Active_moxz, /*timeModified:*/FindOptionSet_imnorxz.Active_moxz_long, /*n:*/Active_noxz, /*timeNewer:*/Active_noxz_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #typeOther x}.
     */
    Active_rx(
		/*i:*/Active_irx, /*ignoreCase:*/Active_irx_long, /*z:*/Active_rxz, /*print0:*/Active_rxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ainorxz.Active_arx, /*timeAccess:*/FindOptionSet_ainorxz.Active_arx_long, /*c:*/FindOptionSet_cinorxz.Active_crx, /*timeCreate:*/FindOptionSet_cinorxz.Active_crx_long, /*m:*/FindOptionSet_imnorxz.Active_mrx, /*timeModified:*/FindOptionSet_imnorxz.Active_mrx_long, /*n:*/Active_nrx, /*timeNewer:*/Active_nrx_long, /*o:*/Active_orx, /*timeOlder:*/Active_orx_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.regex, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #regex r}, {@link #typeOther x}.
     */
    Active_rx_long(
		/*i:*/Active_irx, /*ignoreCase:*/Active_irx_long, /*z:*/Active_rxz, /*print0:*/Active_rxz_long, /*r:*/null /*already set*/, /*regex:*/null /*already set*/, /*a:*/FindOptionSet_ainorxz.Active_arx, /*timeAccess:*/FindOptionSet_ainorxz.Active_arx_long, /*c:*/FindOptionSet_cinorxz.Active_crx, /*timeCreate:*/FindOptionSet_cinorxz.Active_crx_long, /*m:*/FindOptionSet_imnorxz.Active_mrx, /*timeModified:*/FindOptionSet_imnorxz.Active_mrx_long, /*n:*/Active_nrx, /*timeNewer:*/Active_nrx_long, /*o:*/Active_orx, /*timeOlder:*/Active_orx_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.regex, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #typeOther x}.
     */
    Active_ix(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ixz, /*print0:*/Active_ixz_long, /*r:*/Active_irx, /*regex:*/Active_irx_long, /*a:*/FindOptionSet_ainorxz.Active_aix, /*timeAccess:*/FindOptionSet_ainorxz.Active_aix_long, /*c:*/FindOptionSet_cinorxz.Active_cix, /*timeCreate:*/FindOptionSet_cinorxz.Active_cix_long, /*m:*/FindOptionSet_imnorxz.Active_imx, /*timeModified:*/FindOptionSet_imnorxz.Active_imx_long, /*n:*/Active_inx, /*timeNewer:*/Active_inx_long, /*o:*/Active_iox, /*timeOlder:*/Active_iox_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.ignoreCase, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase i}, {@link #typeOther x}.
     */
    Active_ix_long(
		/*i:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*z:*/Active_ixz, /*print0:*/Active_ixz_long, /*r:*/Active_irx, /*regex:*/Active_irx_long, /*a:*/FindOptionSet_ainorxz.Active_aix, /*timeAccess:*/FindOptionSet_ainorxz.Active_aix_long, /*c:*/FindOptionSet_cinorxz.Active_cix, /*timeCreate:*/FindOptionSet_cinorxz.Active_cix_long, /*m:*/FindOptionSet_imnorxz.Active_imx, /*timeModified:*/FindOptionSet_imnorxz.Active_imx_long, /*n:*/Active_inx, /*timeNewer:*/Active_inx_long, /*o:*/Active_iox, /*timeOlder:*/Active_iox_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.ignoreCase, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #timeNewer n}, {@link #typeOther x}.
     */
    Active_nx(
		/*i:*/Active_inx, /*ignoreCase:*/Active_inx_long, /*z:*/Active_nxz, /*print0:*/Active_nxz_long, /*r:*/Active_nrx, /*regex:*/Active_nrx_long, /*a:*/FindOptionSet_ainorxz.Active_anx, /*timeAccess:*/FindOptionSet_ainorxz.Active_anx_long, /*c:*/FindOptionSet_cinorxz.Active_cnx, /*timeCreate:*/FindOptionSet_cinorxz.Active_cnx_long, /*m:*/FindOptionSet_imnorxz.Active_mnx, /*timeModified:*/FindOptionSet_imnorxz.Active_mnx_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_nox, /*timeOlder:*/Active_nox_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.timeNewer, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #timeNewer n}, {@link #typeOther x}.
     */
    Active_nx_long(
		/*i:*/Active_inx, /*ignoreCase:*/Active_inx_long, /*z:*/Active_nxz, /*print0:*/Active_nxz_long, /*r:*/Active_nrx, /*regex:*/Active_nrx_long, /*a:*/FindOptionSet_ainorxz.Active_anx, /*timeAccess:*/FindOptionSet_ainorxz.Active_anx_long, /*c:*/FindOptionSet_cinorxz.Active_cnx, /*timeCreate:*/FindOptionSet_cinorxz.Active_cnx_long, /*m:*/FindOptionSet_imnorxz.Active_mnx, /*timeModified:*/FindOptionSet_imnorxz.Active_mnx_long, /*n:*/null /*already set*/, /*timeNewer:*/null /*already set*/, /*o:*/Active_nox, /*timeOlder:*/Active_nox_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.timeNewer, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_ox(
		/*i:*/Active_iox, /*ignoreCase:*/Active_iox_long, /*z:*/Active_oxz, /*print0:*/Active_oxz_long, /*r:*/Active_orx, /*regex:*/Active_orx_long, /*a:*/FindOptionSet_ainorxz.Active_aox, /*timeAccess:*/FindOptionSet_ainorxz.Active_aox_long, /*c:*/FindOptionSet_cinorxz.Active_cox, /*timeCreate:*/FindOptionSet_cinorxz.Active_cox_long, /*m:*/FindOptionSet_imnorxz.Active_mox, /*timeModified:*/FindOptionSet_imnorxz.Active_mox_long, /*n:*/Active_nox, /*timeNewer:*/Active_nox_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #timeOlder o}, {@link #typeOther x}.
     */
    Active_ox_long(
		/*i:*/Active_iox, /*ignoreCase:*/Active_iox_long, /*z:*/Active_oxz, /*print0:*/Active_oxz_long, /*r:*/Active_orx, /*regex:*/Active_orx_long, /*a:*/FindOptionSet_ainorxz.Active_aox, /*timeAccess:*/FindOptionSet_ainorxz.Active_aox_long, /*c:*/FindOptionSet_cinorxz.Active_cox, /*timeCreate:*/FindOptionSet_cinorxz.Active_cox_long, /*m:*/FindOptionSet_imnorxz.Active_mox, /*timeModified:*/FindOptionSet_imnorxz.Active_mox_long, /*n:*/Active_nox, /*timeNewer:*/Active_nox_long, /*o:*/null /*already set*/, /*timeOlder:*/null /*already set*/, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.timeOlder, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #typeOther x}.
     */
    Active_xz(
		/*i:*/Active_ixz, /*ignoreCase:*/Active_ixz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_rxz, /*regex:*/Active_rxz_long, /*a:*/FindOptionSet_ainorxz.Active_axz, /*timeAccess:*/FindOptionSet_ainorxz.Active_axz_long, /*c:*/FindOptionSet_cinorxz.Active_cxz, /*timeCreate:*/FindOptionSet_cinorxz.Active_cxz_long, /*m:*/FindOptionSet_imnorxz.Active_mxz, /*timeModified:*/FindOptionSet_imnorxz.Active_mxz_long, /*n:*/Active_nxz, /*timeNewer:*/Active_nxz_long, /*o:*/Active_oxz, /*timeOlder:*/Active_oxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.print0, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #print0 z}, {@link #typeOther x}.
     */
    Active_xz_long(
		/*i:*/Active_ixz, /*ignoreCase:*/Active_ixz_long, /*z:*/null /*already set*/, /*print0:*/null /*already set*/, /*r:*/Active_rxz, /*regex:*/Active_rxz_long, /*a:*/FindOptionSet_ainorxz.Active_axz, /*timeAccess:*/FindOptionSet_ainorxz.Active_axz_long, /*c:*/FindOptionSet_cinorxz.Active_cxz, /*timeCreate:*/FindOptionSet_cinorxz.Active_cxz_long, /*m:*/FindOptionSet_imnorxz.Active_mxz, /*timeModified:*/FindOptionSet_imnorxz.Active_mxz_long, /*n:*/Active_nxz, /*timeNewer:*/Active_nxz_long, /*o:*/Active_oxz, /*timeOlder:*/Active_oxz_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.print0, FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #typeOther x}.
     */
    Active_x(
		/*i:*/Active_ix, /*ignoreCase:*/Active_ix_long, /*z:*/Active_xz, /*print0:*/Active_xz_long, /*r:*/Active_rx, /*regex:*/Active_rx_long, /*a:*/FindOptionSet_ainorxz.Active_ax, /*timeAccess:*/FindOptionSet_ainorxz.Active_ax_long, /*c:*/FindOptionSet_cinorxz.Active_cx, /*timeCreate:*/FindOptionSet_cinorxz.Active_cx_long, /*m:*/FindOptionSet_imnorxz.Active_mx, /*timeModified:*/FindOptionSet_imnorxz.Active_mx_long, /*n:*/Active_nx, /*timeNewer:*/Active_nx_long, /*o:*/Active_ox, /*timeOlder:*/Active_ox_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            true,
		/*active:*/FindOption.typeOther
    ),
    /**
     * Option set with the following active options: {@link #typeOther x}.
     */
    Active_x_long(
		/*i:*/Active_ix, /*ignoreCase:*/Active_ix_long, /*z:*/Active_xz, /*print0:*/Active_xz_long, /*r:*/Active_rx, /*regex:*/Active_rx_long, /*a:*/FindOptionSet_ainorxz.Active_ax, /*timeAccess:*/FindOptionSet_ainorxz.Active_ax_long, /*c:*/FindOptionSet_cinorxz.Active_cx, /*timeCreate:*/FindOptionSet_cinorxz.Active_cx_long, /*m:*/FindOptionSet_imnorxz.Active_mx, /*timeModified:*/FindOptionSet_imnorxz.Active_mx_long, /*n:*/Active_nx, /*timeNewer:*/Active_nx_long, /*o:*/Active_ox, /*timeOlder:*/Active_ox_long, /*x:*/null /*already set*/, /*typeOther:*/null /*already set*/,
            false,
		/*active:*/FindOption.typeOther
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
    public final FindOptionSet_acimnorxz i;
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
    public final FindOptionSet_acimnorxz ignoreCase;
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
    public final FindOptionSet_acimnorxz z;
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
    public final FindOptionSet_acimnorxz print0;
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
    public final FindOptionSet_acimnorxz r;
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
    public final FindOptionSet_acimnorxz regex;
    /**
     * Option {@code "-a"}: The time operand refers to the last access time of the file
     * <p>
     * (This option is ignored if no time operand is specified).
     * <p>
     * The option {@code "-a"} is equivalent to the {@code "--}{@link #timeAccess timeAccess}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-a"}. If the option {@code "-a"}
     * is already set, the field {@code a} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final FindOptionSet_ainorxz a;
    /**
     * Option {@code "--timeAccess"}: The time operand refers to the last access time of the file
     * <p>
     * (This option is ignored if no time operand is specified).
     * <p>
     * The option {@code "--timeAccess"} is equivalent to the {@code "-}{@link #a a}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--timeAccess"}. If the option {@code "--timeAccess"}
     * is already set, the field {@code timeAccess} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final FindOptionSet_ainorxz timeAccess;
    /**
     * Option {@code "-c"}: The time operand refers to the creation time of the file
     * <p>
     * (This option is ignored if no time operand is specified).
     * <p>
     * The option {@code "-c"} is equivalent to the {@code "--}{@link #timeCreate timeCreate}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-c"}. If the option {@code "-c"}
     * is already set, the field {@code c} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final FindOptionSet_cinorxz c;
    /**
     * Option {@code "--timeCreate"}: The time operand refers to the creation time of the file
     * <p>
     * (This option is ignored if no time operand is specified).
     * <p>
     * The option {@code "--timeCreate"} is equivalent to the {@code "-}{@link #c c}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--timeCreate"}. If the option {@code "--timeCreate"}
     * is already set, the field {@code timeCreate} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final FindOptionSet_cinorxz timeCreate;
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
    public final FindOptionSet_acimnorxz n;
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
    public final FindOptionSet_acimnorxz timeNewer;
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
    public final FindOptionSet_acimnorxz o;
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
    public final FindOptionSet_acimnorxz timeOlder;
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
    public final FindOptionSet_acimnorxz x;
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
    public final FindOptionSet_acimnorxz typeOther;
    private final boolean useAcronym;
    private final EnumSet<FindOption> options;

    private FindOptionSet_acimnorxz(
            FindOptionSet_acimnorxz i, FindOptionSet_acimnorxz ignoreCase, FindOptionSet_acimnorxz z, FindOptionSet_acimnorxz print0, FindOptionSet_acimnorxz r, FindOptionSet_acimnorxz regex, FindOptionSet_ainorxz a, FindOptionSet_ainorxz timeAccess, FindOptionSet_cinorxz c, FindOptionSet_cinorxz timeCreate, FindOptionSet_imnorxz m, FindOptionSet_imnorxz timeModified, FindOptionSet_acimnorxz n, FindOptionSet_acimnorxz timeNewer, FindOptionSet_acimnorxz o, FindOptionSet_acimnorxz timeOlder, FindOptionSet_acimnorxz x, FindOptionSet_acimnorxz typeOther,
            boolean useAcronym,
            FindOption... activeOptions
    ) {
        this.i = i == null ? this : i;
        this.ignoreCase = ignoreCase == null ? this : ignoreCase;
        this.z = z == null ? this : z;
        this.print0 = print0 == null ? this : print0;
        this.r = r == null ? this : r;
        this.regex = regex == null ? this : regex;
        this.a = notNull(a);
        this.timeAccess = notNull(timeAccess);
        this.c = notNull(c);
        this.timeCreate = notNull(timeCreate);
        this.m = notNull(m);
        this.timeModified = notNull(timeModified);
        this.n = n == null ? this : n;
        this.timeNewer = timeNewer == null ? this : timeNewer;
        this.o = o == null ? this : o;
        this.timeOlder = timeOlder == null ? this : timeOlder;
        this.x = x == null ? this : x;
        this.typeOther = typeOther == null ? this : typeOther;
        this.useAcronym = useAcronym;
        this.options = activeOptions.length == 0 ? EnumSet.noneOf(FindOption.class) : EnumSet.copyOf(Arrays.asList(activeOptions));
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
     *    FindOptionSet_acimnorxz.ignoreCase.z;
     * </pre>
     * uses acronyms, that is, this method always returns true for the above
     * set.
     * <p>
     * On the other hand, long option names are used and this method always
     * returns false for the set
     * <pre>
     *    FindOptionSet_acimnorxz.i.print0;
     * </pre>
     * <p>
     * Note that a repeated option is <i>not</i> treated as the last set option.
     * For instance, the first and last option of the following set are
     * equivalent and acronyms are used:
     * <pre>
     *    FindOptionSet_acimnorxz.i.z.ignoreCase;
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
