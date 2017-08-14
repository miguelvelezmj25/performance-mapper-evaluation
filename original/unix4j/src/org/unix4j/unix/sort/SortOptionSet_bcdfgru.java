package org.unix4j.unix.sort;

import org.unix4j.option.Option;
import org.unix4j.unix.Sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Option sets for the {@link Sort sort} command with
 * the following options: {@link #c c}, {@link #d d}, {@link #g g}, {@link #f f}, {@link #b b}, {@link #r r}, {@link #u u}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Sort#Options} should be used instead to specify command
 * options. See also {@link org.unix4j.unix.sort.SortOptions} for more information.
 */
public enum SortOptionSet_bcdfgru implements SortOptions {
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bcdfgru(
        /*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
        /*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bcdfgru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.
     */
    Active_bcdfgu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_bcdfgru, /*reverse:*/Active_bcdfgru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.
     */
    Active_bcdfgu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_bcdfgru, /*reverse:*/Active_bcdfgru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bcdgru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bcdfgru, /*ignoreCase:*/Active_bcdfgru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bcdgru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bcdfgru, /*ignoreCase:*/Active_bcdfgru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bcfgru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdfgru, /*dictionaryOrder:*/Active_bcdfgru_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bcfgru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdfgru, /*dictionaryOrder:*/Active_bcdfgru_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #reverse r}, {@link #unique u}.
     */
    Active_cdfgru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcdfgru, /*ignoreLeadingBlanks:*/Active_bcdfgru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #reverse r}, {@link #unique u}.
     */
    Active_cdfgru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcdfgru, /*ignoreLeadingBlanks:*/Active_bcdfgru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.
     */
    Active_bcdfgr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bcdfgru, /*unique:*/Active_bcdfgru_long,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.
     */
    Active_bcdfgr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bcdfgru, /*unique:*/Active_bcdfgru_long,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.
     */
    Active_bcdgu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bcdfgu, /*ignoreCase:*/Active_bcdfgu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_bcdgru, /*reverse:*/Active_bcdgru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.
     */
    Active_bcdgu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bcdfgu, /*ignoreCase:*/Active_bcdfgu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_bcdgru, /*reverse:*/Active_bcdgru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.
     */
    Active_bcfgu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdfgu, /*dictionaryOrder:*/Active_bcdfgu_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_bcfgru, /*reverse:*/Active_bcfgru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.
     */
    Active_bcfgu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdfgu, /*dictionaryOrder:*/Active_bcdfgu_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_bcfgru, /*reverse:*/Active_bcfgru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bcgru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdgru, /*dictionaryOrder:*/Active_bcdgru_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bcfgru, /*ignoreCase:*/Active_bcfgru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bcgru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdgru, /*dictionaryOrder:*/Active_bcdgru_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bcfgru, /*ignoreCase:*/Active_bcfgru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #unique u}.
     */
    Active_cdfgu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcdfgu, /*ignoreLeadingBlanks:*/Active_bcdfgu_long, /*r:*/Active_cdfgru, /*reverse:*/Active_cdfgru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #unique u}.
     */
    Active_cdfgu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcdfgu, /*ignoreLeadingBlanks:*/Active_bcdfgu_long, /*r:*/Active_cdfgru, /*reverse:*/Active_cdfgru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #reverse r}, {@link #unique u}.
     */
    Active_cdgru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_cdfgru, /*ignoreCase:*/Active_cdfgru_long, /*b:*/Active_bcdgru, /*ignoreLeadingBlanks:*/Active_bcdgru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #reverse r}, {@link #unique u}.
     */
    Active_cdgru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_cdfgru, /*ignoreCase:*/Active_cdfgru_long, /*b:*/Active_bcdgru, /*ignoreLeadingBlanks:*/Active_bcdgru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #reverse r}, {@link #unique u}.
     */
    Active_cfgru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdfgru, /*dictionaryOrder:*/Active_cdfgru_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcfgru, /*ignoreLeadingBlanks:*/Active_bcfgru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #reverse r}, {@link #unique u}.
     */
    Active_cfgru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdfgru, /*dictionaryOrder:*/Active_cdfgru_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcfgru, /*ignoreLeadingBlanks:*/Active_bcfgru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}.
     */
    Active_bcdfg(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_bcdfgr, /*reverse:*/Active_bcdfgr_long, /*u:*/Active_bcdfgu, /*unique:*/Active_bcdfgu_long,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}.
     */
    Active_bcdfg_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_bcdfgr, /*reverse:*/Active_bcdfgr_long, /*u:*/Active_bcdfgu, /*unique:*/Active_bcdfgu_long,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.
     */
    Active_bcdgr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bcdfgr, /*ignoreCase:*/Active_bcdfgr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bcdgru, /*unique:*/Active_bcdgru_long,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.
     */
    Active_bcdgr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bcdfgr, /*ignoreCase:*/Active_bcdfgr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bcdgru, /*unique:*/Active_bcdgru_long,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.
     */
    Active_bcfgr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdfgr, /*dictionaryOrder:*/Active_bcdfgr_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bcfgru, /*unique:*/Active_bcfgru_long,
            true,
		/*active:*/SortOption.check, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.
     */
    Active_bcfgr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdfgr, /*dictionaryOrder:*/Active_bcdfgr_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bcfgru, /*unique:*/Active_bcfgru_long,
            false,
		/*active:*/SortOption.check, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #reverse r}.
     */
    Active_cdfgr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcdfgr, /*ignoreLeadingBlanks:*/Active_bcdfgr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_cdfgru, /*unique:*/Active_cdfgru_long,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #reverse r}.
     */
    Active_cdfgr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcdfgr, /*ignoreLeadingBlanks:*/Active_bcdfgr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_cdfgru, /*unique:*/Active_cdfgru_long,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.
     */
    Active_bcgu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdgu, /*dictionaryOrder:*/Active_bcdgu_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bcfgu, /*ignoreCase:*/Active_bcfgu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_bcgru, /*reverse:*/Active_bcgru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.
     */
    Active_bcgu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdgu, /*dictionaryOrder:*/Active_bcdgu_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bcfgu, /*ignoreCase:*/Active_bcfgu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_bcgru, /*reverse:*/Active_bcgru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #unique u}.
     */
    Active_cdgu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_cdfgu, /*ignoreCase:*/Active_cdfgu_long, /*b:*/Active_bcdgu, /*ignoreLeadingBlanks:*/Active_bcdgu_long, /*r:*/Active_cdgru, /*reverse:*/Active_cdgru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #unique u}.
     */
    Active_cdgu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_cdfgu, /*ignoreCase:*/Active_cdfgu_long, /*b:*/Active_bcdgu, /*ignoreLeadingBlanks:*/Active_bcdgu_long, /*r:*/Active_cdgru, /*reverse:*/Active_cdgru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #unique u}.
     */
    Active_cfgu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdfgu, /*dictionaryOrder:*/Active_cdfgu_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcfgu, /*ignoreLeadingBlanks:*/Active_bcfgu_long, /*r:*/Active_cfgru, /*reverse:*/Active_cfgru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #unique u}.
     */
    Active_cfgu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdfgu, /*dictionaryOrder:*/Active_cdfgu_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcfgu, /*ignoreLeadingBlanks:*/Active_bcfgu_long, /*r:*/Active_cfgru, /*reverse:*/Active_cfgru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #generalNumericSort g}, {@link #reverse r}, {@link #unique u}.
     */
    Active_cgru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdgru, /*dictionaryOrder:*/Active_cdgru_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_cfgru, /*ignoreCase:*/Active_cfgru_long, /*b:*/Active_bcgru, /*ignoreLeadingBlanks:*/Active_bcgru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.generalNumericSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #generalNumericSort g}, {@link #reverse r}, {@link #unique u}.
     */
    Active_cgru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdgru, /*dictionaryOrder:*/Active_cdgru_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_cfgru, /*ignoreCase:*/Active_cfgru_long, /*b:*/Active_bcgru, /*ignoreLeadingBlanks:*/Active_bcgru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.generalNumericSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}.
     */
    Active_bcdg(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bcdfg, /*ignoreCase:*/Active_bcdfg_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_bcdgr, /*reverse:*/Active_bcdgr_long, /*u:*/Active_bcdgu, /*unique:*/Active_bcdgu_long,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}.
     */
    Active_bcdg_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bcdfg, /*ignoreCase:*/Active_bcdfg_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_bcdgr, /*reverse:*/Active_bcdgr_long, /*u:*/Active_bcdgu, /*unique:*/Active_bcdgu_long,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}.
     */
    Active_bcfg(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdfg, /*dictionaryOrder:*/Active_bcdfg_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_bcfgr, /*reverse:*/Active_bcfgr_long, /*u:*/Active_bcfgu, /*unique:*/Active_bcfgu_long,
            true,
		/*active:*/SortOption.check, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}.
     */
    Active_bcfg_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdfg, /*dictionaryOrder:*/Active_bcdfg_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_bcfgr, /*reverse:*/Active_bcfgr_long, /*u:*/Active_bcfgu, /*unique:*/Active_bcfgu_long,
            false,
		/*active:*/SortOption.check, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.
     */
    Active_bcgr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdgr, /*dictionaryOrder:*/Active_bcdgr_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bcfgr, /*ignoreCase:*/Active_bcfgr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bcgru, /*unique:*/Active_bcgru_long,
            true,
		/*active:*/SortOption.check, SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.
     */
    Active_bcgr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdgr, /*dictionaryOrder:*/Active_bcdgr_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bcfgr, /*ignoreCase:*/Active_bcfgr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bcgru, /*unique:*/Active_bcgru_long,
            false,
		/*active:*/SortOption.check, SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}.
     */
    Active_cdfg(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcdfg, /*ignoreLeadingBlanks:*/Active_bcdfg_long, /*r:*/Active_cdfgr, /*reverse:*/Active_cdfgr_long, /*u:*/Active_cdfgu, /*unique:*/Active_cdfgu_long,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}.
     */
    Active_cdfg_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcdfg, /*ignoreLeadingBlanks:*/Active_bcdfg_long, /*r:*/Active_cdfgr, /*reverse:*/Active_cdfgr_long, /*u:*/Active_cdfgu, /*unique:*/Active_cdfgu_long,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #reverse r}.
     */
    Active_cdgr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_cdfgr, /*ignoreCase:*/Active_cdfgr_long, /*b:*/Active_bcdgr, /*ignoreLeadingBlanks:*/Active_bcdgr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_cdgru, /*unique:*/Active_cdgru_long,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #reverse r}.
     */
    Active_cdgr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_cdfgr, /*ignoreCase:*/Active_cdfgr_long, /*b:*/Active_bcdgr, /*ignoreLeadingBlanks:*/Active_bcdgr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_cdgru, /*unique:*/Active_cdgru_long,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #reverse r}.
     */
    Active_cfgr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdfgr, /*dictionaryOrder:*/Active_cdfgr_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcfgr, /*ignoreLeadingBlanks:*/Active_bcfgr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_cfgru, /*unique:*/Active_cfgru_long,
            true,
		/*active:*/SortOption.check, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #reverse r}.
     */
    Active_cfgr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdfgr, /*dictionaryOrder:*/Active_cdfgr_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcfgr, /*ignoreLeadingBlanks:*/Active_bcfgr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_cfgru, /*unique:*/Active_cfgru_long,
            false,
		/*active:*/SortOption.check, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #generalNumericSort g}, {@link #unique u}.
     */
    Active_cgu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdgu, /*dictionaryOrder:*/Active_cdgu_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_cfgu, /*ignoreCase:*/Active_cfgu_long, /*b:*/Active_bcgu, /*ignoreLeadingBlanks:*/Active_bcgu_long, /*r:*/Active_cgru, /*reverse:*/Active_cgru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.generalNumericSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #generalNumericSort g}, {@link #unique u}.
     */
    Active_cgu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdgu, /*dictionaryOrder:*/Active_cdgu_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_cfgu, /*ignoreCase:*/Active_cfgu_long, /*b:*/Active_bcgu, /*ignoreLeadingBlanks:*/Active_bcgu_long, /*r:*/Active_cgru, /*reverse:*/Active_cgru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.generalNumericSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}.
     */
    Active_bcg(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdg, /*dictionaryOrder:*/Active_bcdg_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bcfg, /*ignoreCase:*/Active_bcfg_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_bcgr, /*reverse:*/Active_bcgr_long, /*u:*/Active_bcgu, /*unique:*/Active_bcgu_long,
            true,
		/*active:*/SortOption.check, SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}.
     */
    Active_bcg_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdg, /*dictionaryOrder:*/Active_bcdg_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bcfg, /*ignoreCase:*/Active_bcfg_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_bcgr, /*reverse:*/Active_bcgr_long, /*u:*/Active_bcgu, /*unique:*/Active_bcgu_long,
            false,
		/*active:*/SortOption.check, SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #generalNumericSort g}.
     */
    Active_cdg(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_cdfg, /*ignoreCase:*/Active_cdfg_long, /*b:*/Active_bcdg, /*ignoreLeadingBlanks:*/Active_bcdg_long, /*r:*/Active_cdgr, /*reverse:*/Active_cdgr_long, /*u:*/Active_cdgu, /*unique:*/Active_cdgu_long,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.generalNumericSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #generalNumericSort g}.
     */
    Active_cdg_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_cdfg, /*ignoreCase:*/Active_cdfg_long, /*b:*/Active_bcdg, /*ignoreLeadingBlanks:*/Active_bcdg_long, /*r:*/Active_cdgr, /*reverse:*/Active_cdgr_long, /*u:*/Active_cdgu, /*unique:*/Active_cdgu_long,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.generalNumericSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #generalNumericSort g}, {@link #ignoreCase f}.
     */
    Active_cfg(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdfg, /*dictionaryOrder:*/Active_cdfg_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcfg, /*ignoreLeadingBlanks:*/Active_bcfg_long, /*r:*/Active_cfgr, /*reverse:*/Active_cfgr_long, /*u:*/Active_cfgu, /*unique:*/Active_cfgu_long,
            true,
		/*active:*/SortOption.check, SortOption.generalNumericSort, SortOption.ignoreCase
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #generalNumericSort g}, {@link #ignoreCase f}.
     */
    Active_cfg_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdfg, /*dictionaryOrder:*/Active_cdfg_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcfg, /*ignoreLeadingBlanks:*/Active_bcfg_long, /*r:*/Active_cfgr, /*reverse:*/Active_cfgr_long, /*u:*/Active_cfgu, /*unique:*/Active_cfgu_long,
            false,
		/*active:*/SortOption.check, SortOption.generalNumericSort, SortOption.ignoreCase
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #generalNumericSort g}, {@link #reverse r}.
     */
    Active_cgr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdgr, /*dictionaryOrder:*/Active_cdgr_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_cfgr, /*ignoreCase:*/Active_cfgr_long, /*b:*/Active_bcgr, /*ignoreLeadingBlanks:*/Active_bcgr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_cgru, /*unique:*/Active_cgru_long,
            true,
		/*active:*/SortOption.check, SortOption.generalNumericSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #generalNumericSort g}, {@link #reverse r}.
     */
    Active_cgr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdgr, /*dictionaryOrder:*/Active_cdgr_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_cfgr, /*ignoreCase:*/Active_cfgr_long, /*b:*/Active_bcgr, /*ignoreLeadingBlanks:*/Active_bcgr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_cgru, /*unique:*/Active_cgru_long,
            false,
		/*active:*/SortOption.check, SortOption.generalNumericSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #generalNumericSort g}.
     */
    Active_cg(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdg, /*dictionaryOrder:*/Active_cdg_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_cfg, /*ignoreCase:*/Active_cfg_long, /*b:*/Active_bcg, /*ignoreLeadingBlanks:*/Active_bcg_long, /*r:*/Active_cgr, /*reverse:*/Active_cgr_long, /*u:*/Active_cgu, /*unique:*/Active_cgu_long,
            true,
		/*active:*/SortOption.check, SortOption.generalNumericSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #generalNumericSort g}.
     */
    Active_cg_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdg, /*dictionaryOrder:*/Active_cdg_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_cfg, /*ignoreCase:*/Active_cfg_long, /*b:*/Active_bcg, /*ignoreLeadingBlanks:*/Active_bcg_long, /*r:*/Active_cgr, /*reverse:*/Active_cgr_long, /*u:*/Active_cgu, /*unique:*/Active_cgu_long,
            false,
		/*active:*/SortOption.check, SortOption.generalNumericSort
    );

    /**
     * Option {@code "-c"}: Checks that the single input file is ordered as specified by the
     * arguments and the collating sequence of the current locale. No
     * output is produced; only the exit code is affected.
     * <p>
     * The option {@code "-c"} is equivalent to the {@code "--}{@link #check check}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-c"}. If the option {@code "-c"}
     * is already set, the field {@code c} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final SortOptionSet_bcdfgru c;
    /**
     * Option {@code "--check"}: Checks that the single input file is ordered as specified by the
     * arguments and the collating sequence of the current locale. No
     * output is produced; only the exit code is affected.
     * <p>
     * The option {@code "--check"} is equivalent to the {@code "-}{@link #c c}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--check"}. If the option {@code "--check"}
     * is already set, the field {@code check} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final SortOptionSet_bcdfgru check;
    /**
     * Option {@code "-d"}: Consider only blanks and alphanumeric characters.
     * (This option is ignored if a comparator operand is present).
     * <p>
     * The option {@code "-d"} is equivalent to the {@code "--}{@link #dictionaryOrder dictionaryOrder}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-d"}. If the option {@code "-d"}
     * is already set, the field {@code d} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final SortOptionSet_bcdfgru d;
    /**
     * Option {@code "--dictionaryOrder"}: Consider only blanks and alphanumeric characters.
     * (This option is ignored if a comparator operand is present).
     * <p>
     * The option {@code "--dictionaryOrder"} is equivalent to the {@code "-}{@link #d d}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--dictionaryOrder"}. If the option {@code "--dictionaryOrder"}
     * is already set, the field {@code dictionaryOrder} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final SortOptionSet_bcdfgru dictionaryOrder;
    /**
     * Option {@code "-g"}: Sort numerically, using the standard {@link Double#parseDouble(String)}
     * function to convert a trimmed line to a double-precision floating
     * point number. This allows floating point numbers to be specified in
     * scientific notation, like 1.0e-34 and 10e100.
     * <p>
     * Uses the following collating sequence: Lines that cannot be parsed
     * because they do not represent valid double values (in alpha-numeric
     * order); "-Infinity"; finite numbers in ascending numeric order
     * (with -0 < +0); "Infinity"; "NaN".
     * <p>
     * This option is usually slower than {@code -numeric-sort (-n)} and it
     * can lose information when converting to floating point.
     * <p>
     * (This option is ignored if a comparator operand is present).
     * <p>
     * The option {@code "-g"} is equivalent to the {@code "--}{@link #generalNumericSort generalNumericSort}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-g"}. If the option {@code "-g"}
     * is already set, the field {@code g} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final SortOptionSet_bcdfgru g;
    /**
     * Option {@code "--generalNumericSort"}: Sort numerically, using the standard {@link Double#parseDouble(String)}
     * function to convert a trimmed line to a double-precision floating
     * point number. This allows floating point numbers to be specified in
     * scientific notation, like 1.0e-34 and 10e100.
     * <p>
     * Uses the following collating sequence: Lines that cannot be parsed
     * because they do not represent valid double values (in alpha-numeric
     * order); "-Infinity"; finite numbers in ascending numeric order
     * (with -0 < +0); "Infinity"; "NaN".
     * <p>
     * This option is usually slower than {@code -numeric-sort (-n)} and it
     * can lose information when converting to floating point.
     * <p>
     * (This option is ignored if a comparator operand is present).
     * <p>
     * The option {@code "--generalNumericSort"} is equivalent to the {@code "-}{@link #g g}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--generalNumericSort"}. If the option {@code "--generalNumericSort"}
     * is already set, the field {@code generalNumericSort} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final SortOptionSet_bcdfgru generalNumericSort;
    /**
     * Option {@code "-f"}: Consider all lowercase characters that have uppercase equivalents to
     * be the uppercase equivalent for the purposes of comparison.
     * (This option is ignored if a comparator operand is present).
     * <p>
     * The option {@code "-f"} is equivalent to the {@code "--}{@link #ignoreCase ignoreCase}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-f"}. If the option {@code "-f"}
     * is already set, the field {@code f} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final SortOptionSet_bcdfgru f;
    /**
     * Option {@code "--ignoreCase"}: Consider all lowercase characters that have uppercase equivalents to
     * be the uppercase equivalent for the purposes of comparison.
     * (This option is ignored if a comparator operand is present).
     * <p>
     * The option {@code "--ignoreCase"} is equivalent to the {@code "-}{@link #f f}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--ignoreCase"}. If the option {@code "--ignoreCase"}
     * is already set, the field {@code ignoreCase} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final SortOptionSet_bcdfgru ignoreCase;
    /**
     * Option {@code "-b"}: Ignore leading blanks.
     * (This option is ignored if a comparator operand is present).
     * <p>
     * The option {@code "-b"} is equivalent to the {@code "--}{@link #ignoreLeadingBlanks ignoreLeadingBlanks}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-b"}. If the option {@code "-b"}
     * is already set, the field {@code b} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final SortOptionSet_bcdfgru b;
    /**
     * Option {@code "--ignoreLeadingBlanks"}: Ignore leading blanks.
     * (This option is ignored if a comparator operand is present).
     * <p>
     * The option {@code "--ignoreLeadingBlanks"} is equivalent to the {@code "-}{@link #b b}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--ignoreLeadingBlanks"}. If the option {@code "--ignoreLeadingBlanks"}
     * is already set, the field {@code ignoreLeadingBlanks} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final SortOptionSet_bcdfgru ignoreLeadingBlanks;
    /**
     * Option {@code "-r"}: Reverse the sense of comparisons.
     * <p>
     * The option {@code "-r"} is equivalent to the {@code "--}{@link #reverse reverse}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-r"}. If the option {@code "-r"}
     * is already set, the field {@code r} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final SortOptionSet_bcdfgru r;
    /**
     * Option {@code "--reverse"}: Reverse the sense of comparisons.
     * <p>
     * The option {@code "--reverse"} is equivalent to the {@code "-}{@link #r r}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--reverse"}. If the option {@code "--reverse"}
     * is already set, the field {@code reverse} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final SortOptionSet_bcdfgru reverse;
    /**
     * Option {@code "-u"}: Unique: suppress all but one in each set of lines having equal keys.
     * If used with the {@code -c} option, checks that there are no lines
     * with duplicate keys, in addition to checking that the input file is
     * sorted.
     * <p>
     * The option {@code "-u"} is equivalent to the {@code "--}{@link #unique unique}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-u"}. If the option {@code "-u"}
     * is already set, the field {@code u} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final SortOptionSet_bcdfgru u;
    /**
     * Option {@code "--unique"}: Unique: suppress all but one in each set of lines having equal keys.
     * If used with the {@code -c} option, checks that there are no lines
     * with duplicate keys, in addition to checking that the input file is
     * sorted.
     * <p>
     * The option {@code "--unique"} is equivalent to the {@code "-}{@link #u u}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--unique"}. If the option {@code "--unique"}
     * is already set, the field {@code unique} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final SortOptionSet_bcdfgru unique;
    private final boolean useAcronym;
    private final EnumSet<SortOption> options;

    private SortOptionSet_bcdfgru(
            SortOptionSet_bcdfgru c, SortOptionSet_bcdfgru check, SortOptionSet_bcdfgru d, SortOptionSet_bcdfgru dictionaryOrder, SortOptionSet_bcdfgru g, SortOptionSet_bcdfgru generalNumericSort, SortOptionSet_bcdfgru f, SortOptionSet_bcdfgru ignoreCase, SortOptionSet_bcdfgru b, SortOptionSet_bcdfgru ignoreLeadingBlanks, SortOptionSet_bcdfgru r, SortOptionSet_bcdfgru reverse, SortOptionSet_bcdfgru u, SortOptionSet_bcdfgru unique,
            boolean useAcronym,
            SortOption... activeOptions
    ) {
        this.c = c == null ? this : c;
        this.check = check == null ? this : check;
        this.d = d == null ? this : d;
        this.dictionaryOrder = dictionaryOrder == null ? this : dictionaryOrder;
        this.g = g == null ? this : g;
        this.generalNumericSort = generalNumericSort == null ? this : generalNumericSort;
        this.f = f == null ? this : f;
        this.ignoreCase = ignoreCase == null ? this : ignoreCase;
        this.b = b == null ? this : b;
        this.ignoreLeadingBlanks = ignoreLeadingBlanks == null ? this : ignoreLeadingBlanks;
        this.r = r == null ? this : r;
        this.reverse = reverse == null ? this : reverse;
        this.u = u == null ? this : u;
        this.unique = unique == null ? this : unique;
        this.useAcronym = useAcronym;
        this.options = activeOptions.length == 0 ? EnumSet.noneOf(SortOption.class) : EnumSet.copyOf(Arrays.asList(activeOptions));
    }

    //inherit javadoc
    @Override
    public Class<SortOption> optionType() {
        return SortOption.class;
    }

    //inherit javadoc
    @Override
    public boolean isSet(SortOption option) {
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
    public EnumSet<SortOption> asSet() {
        return EnumSet.copyOf(options);
    }

    /**
     * Returns an immutable iterator with the active options of this option set.
     *
     * @return an immutable iterator for over the active options
     */
    @Override
    public Iterator<SortOption> iterator() {
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
     *    SortOptionSet_bcdfgru.check.d;
     * </pre>
     * uses acronyms, that is, this method always returns true for the above
     * set.
     * <p>
     * On the other hand, long option names are used and this method always
     * returns false for the set
     * <pre>
     *    SortOptionSet_bcdfgru.c.dictionaryOrder;
     * </pre>
     * <p>
     * Note that a repeated option is <i>not</i> treated as the last set option.
     * For instance, the first and last option of the following set are
     * equivalent and acronyms are used:
     * <pre>
     *    SortOptionSet_bcdfgru.c.d.check;
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
    public boolean useAcronymFor(SortOption option) {
        return useAcronym;
    }
}
