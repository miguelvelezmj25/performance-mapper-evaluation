package org.unix4j.unix.sort;

import org.unix4j.option.Option;
import org.unix4j.unix.Sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Option sets for the {@link Sort sort} command with
 * the following options: {@link #d d}, {@link #g g}, {@link #f f}, {@link #b b}, {@link #m m}, {@link #r r}, {@link #u u}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Sort#Options} should be used instead to specify command
 * options. See also {@link org.unix4j.unix.sort.SortOptions} for more information.
 */
public enum SortOptionSet_bdfgmru implements SortOptions {
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bdfgmru(
        /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bdfgmru_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #unique u}.
     */
    Active_bdfgmu(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_bdfgmru, /*reverse:*/Active_bdfgmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #unique u}.
     */
    Active_bdfgmu_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_bdfgmru, /*reverse:*/Active_bdfgmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bdgmru(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bdfgmru, /*ignoreCase:*/Active_bdfgmru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bdgmru_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bdfgmru, /*ignoreCase:*/Active_bdfgmru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bfgmru(
		/*d:*/Active_bdfgmru, /*dictionaryOrder:*/Active_bdfgmru_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bfgmru_long(
		/*d:*/Active_bdfgmru, /*dictionaryOrder:*/Active_bdfgmru_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_dfgmru(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfgmru, /*ignoreLeadingBlanks:*/Active_bdfgmru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_dfgmru_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfgmru, /*ignoreLeadingBlanks:*/Active_bdfgmru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}.
     */
    Active_bdfgmr(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bdfgmru, /*unique:*/Active_bdfgmru_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}.
     */
    Active_bdfgmr_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bdfgmru, /*unique:*/Active_bdfgmru_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #unique u}.
     */
    Active_bdgmu(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bdfgmu, /*ignoreCase:*/Active_bdfgmu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_bdgmru, /*reverse:*/Active_bdgmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #unique u}.
     */
    Active_bdgmu_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bdfgmu, /*ignoreCase:*/Active_bdfgmu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_bdgmru, /*reverse:*/Active_bdgmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #unique u}.
     */
    Active_bfgmu(
		/*d:*/Active_bdfgmu, /*dictionaryOrder:*/Active_bdfgmu_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_bfgmru, /*reverse:*/Active_bfgmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #unique u}.
     */
    Active_bfgmu_long(
		/*d:*/Active_bdfgmu, /*dictionaryOrder:*/Active_bdfgmu_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_bfgmru, /*reverse:*/Active_bfgmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bgmru(
		/*d:*/Active_bdgmru, /*dictionaryOrder:*/Active_bdgmru_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bfgmru, /*ignoreCase:*/Active_bfgmru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bgmru_long(
		/*d:*/Active_bdgmru, /*dictionaryOrder:*/Active_bdgmru_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bfgmru, /*ignoreCase:*/Active_bfgmru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #merge m}, {@link #unique u}.
     */
    Active_dfgmu(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfgmu, /*ignoreLeadingBlanks:*/Active_bdfgmu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_dfgmru, /*reverse:*/Active_dfgmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #merge m}, {@link #unique u}.
     */
    Active_dfgmu_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfgmu, /*ignoreLeadingBlanks:*/Active_bdfgmu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_dfgmru, /*reverse:*/Active_dfgmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_dgmru(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_dfgmru, /*ignoreCase:*/Active_dfgmru_long, /*b:*/Active_bdgmru, /*ignoreLeadingBlanks:*/Active_bdgmru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_dgmru_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_dfgmru, /*ignoreCase:*/Active_dfgmru_long, /*b:*/Active_bdgmru, /*ignoreLeadingBlanks:*/Active_bdgmru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_fgmru(
		/*d:*/Active_dfgmru, /*dictionaryOrder:*/Active_dfgmru_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfgmru, /*ignoreLeadingBlanks:*/Active_bfgmru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_fgmru_long(
		/*d:*/Active_dfgmru, /*dictionaryOrder:*/Active_dfgmru_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfgmru, /*ignoreLeadingBlanks:*/Active_bfgmru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}.
     */
    Active_bdfgm(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_bdfgmr, /*reverse:*/Active_bdfgmr_long, /*u:*/Active_bdfgmu, /*unique:*/Active_bdfgmu_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}.
     */
    Active_bdfgm_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_bdfgmr, /*reverse:*/Active_bdfgmr_long, /*u:*/Active_bdfgmu, /*unique:*/Active_bdfgmu_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}.
     */
    Active_bdgmr(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bdfgmr, /*ignoreCase:*/Active_bdfgmr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bdgmru, /*unique:*/Active_bdgmru_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}.
     */
    Active_bdgmr_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bdfgmr, /*ignoreCase:*/Active_bdfgmr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bdgmru, /*unique:*/Active_bdgmru_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}.
     */
    Active_bfgmr(
		/*d:*/Active_bdfgmr, /*dictionaryOrder:*/Active_bdfgmr_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bfgmru, /*unique:*/Active_bfgmru_long,
            true,
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}.
     */
    Active_bfgmr_long(
		/*d:*/Active_bdfgmr, /*dictionaryOrder:*/Active_bdfgmr_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bfgmru, /*unique:*/Active_bfgmru_long,
            false,
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #merge m}, {@link #reverse r}.
     */
    Active_dfgmr(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfgmr, /*ignoreLeadingBlanks:*/Active_bdfgmr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_dfgmru, /*unique:*/Active_dfgmru_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #merge m}, {@link #reverse r}.
     */
    Active_dfgmr_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfgmr, /*ignoreLeadingBlanks:*/Active_bdfgmr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_dfgmru, /*unique:*/Active_dfgmru_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #unique u}.
     */
    Active_bgmu(
		/*d:*/Active_bdgmu, /*dictionaryOrder:*/Active_bdgmu_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bfgmu, /*ignoreCase:*/Active_bfgmu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_bgmru, /*reverse:*/Active_bgmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #unique u}.
     */
    Active_bgmu_long(
		/*d:*/Active_bdgmu, /*dictionaryOrder:*/Active_bdgmu_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bfgmu, /*ignoreCase:*/Active_bfgmu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_bgmru, /*reverse:*/Active_bgmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #merge m}, {@link #unique u}.
     */
    Active_dgmu(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_dfgmu, /*ignoreCase:*/Active_dfgmu_long, /*b:*/Active_bdgmu, /*ignoreLeadingBlanks:*/Active_bdgmu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_dgmru, /*reverse:*/Active_dgmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #merge m}, {@link #unique u}.
     */
    Active_dgmu_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_dfgmu, /*ignoreCase:*/Active_dfgmu_long, /*b:*/Active_bdgmu, /*ignoreLeadingBlanks:*/Active_bdgmu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_dgmru, /*reverse:*/Active_dgmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #merge m}, {@link #unique u}.
     */
    Active_fgmu(
		/*d:*/Active_dfgmu, /*dictionaryOrder:*/Active_dfgmu_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfgmu, /*ignoreLeadingBlanks:*/Active_bfgmu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_fgmru, /*reverse:*/Active_fgmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #merge m}, {@link #unique u}.
     */
    Active_fgmu_long(
		/*d:*/Active_dfgmu, /*dictionaryOrder:*/Active_dfgmu_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfgmu, /*ignoreLeadingBlanks:*/Active_bfgmu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_fgmru, /*reverse:*/Active_fgmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #generalNumericSort g}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_gmru(
		/*d:*/Active_dgmru, /*dictionaryOrder:*/Active_dgmru_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_fgmru, /*ignoreCase:*/Active_fgmru_long, /*b:*/Active_bgmru, /*ignoreLeadingBlanks:*/Active_bgmru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.generalNumericSort, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #generalNumericSort g}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_gmru_long(
		/*d:*/Active_dgmru, /*dictionaryOrder:*/Active_dgmru_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_fgmru, /*ignoreCase:*/Active_fgmru_long, /*b:*/Active_bgmru, /*ignoreLeadingBlanks:*/Active_bgmru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.generalNumericSort, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}, {@link #merge m}.
     */
    Active_bdgm(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bdfgm, /*ignoreCase:*/Active_bdfgm_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_bdgmr, /*reverse:*/Active_bdgmr_long, /*u:*/Active_bdgmu, /*unique:*/Active_bdgmu_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}, {@link #merge m}.
     */
    Active_bdgm_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bdfgm, /*ignoreCase:*/Active_bdfgm_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_bdgmr, /*reverse:*/Active_bdgmr_long, /*u:*/Active_bdgmu, /*unique:*/Active_bdgmu_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}.
     */
    Active_bfgm(
		/*d:*/Active_bdfgm, /*dictionaryOrder:*/Active_bdfgm_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_bfgmr, /*reverse:*/Active_bfgmr_long, /*u:*/Active_bfgmu, /*unique:*/Active_bfgmu_long,
            true,
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}.
     */
    Active_bfgm_long(
		/*d:*/Active_bdfgm, /*dictionaryOrder:*/Active_bdfgm_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_bfgmr, /*reverse:*/Active_bfgmr_long, /*u:*/Active_bfgmu, /*unique:*/Active_bfgmu_long,
            false,
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}.
     */
    Active_bgmr(
		/*d:*/Active_bdgmr, /*dictionaryOrder:*/Active_bdgmr_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bfgmr, /*ignoreCase:*/Active_bfgmr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bgmru, /*unique:*/Active_bgmru_long,
            true,
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}.
     */
    Active_bgmr_long(
		/*d:*/Active_bdgmr, /*dictionaryOrder:*/Active_bdgmr_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bfgmr, /*ignoreCase:*/Active_bfgmr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bgmru, /*unique:*/Active_bgmru_long,
            false,
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #merge m}.
     */
    Active_dfgm(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfgm, /*ignoreLeadingBlanks:*/Active_bdfgm_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_dfgmr, /*reverse:*/Active_dfgmr_long, /*u:*/Active_dfgmu, /*unique:*/Active_dfgmu_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #merge m}.
     */
    Active_dfgm_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfgm, /*ignoreLeadingBlanks:*/Active_bdfgm_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_dfgmr, /*reverse:*/Active_dfgmr_long, /*u:*/Active_dfgmu, /*unique:*/Active_dfgmu_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #merge m}, {@link #reverse r}.
     */
    Active_dgmr(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_dfgmr, /*ignoreCase:*/Active_dfgmr_long, /*b:*/Active_bdgmr, /*ignoreLeadingBlanks:*/Active_bdgmr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_dgmru, /*unique:*/Active_dgmru_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #merge m}, {@link #reverse r}.
     */
    Active_dgmr_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_dfgmr, /*ignoreCase:*/Active_dfgmr_long, /*b:*/Active_bdgmr, /*ignoreLeadingBlanks:*/Active_bdgmr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_dgmru, /*unique:*/Active_dgmru_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #merge m}, {@link #reverse r}.
     */
    Active_fgmr(
		/*d:*/Active_dfgmr, /*dictionaryOrder:*/Active_dfgmr_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfgmr, /*ignoreLeadingBlanks:*/Active_bfgmr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_fgmru, /*unique:*/Active_fgmru_long,
            true,
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #merge m}, {@link #reverse r}.
     */
    Active_fgmr_long(
		/*d:*/Active_dfgmr, /*dictionaryOrder:*/Active_dfgmr_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfgmr, /*ignoreLeadingBlanks:*/Active_bfgmr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_fgmru, /*unique:*/Active_fgmru_long,
            false,
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #generalNumericSort g}, {@link #merge m}, {@link #unique u}.
     */
    Active_gmu(
		/*d:*/Active_dgmu, /*dictionaryOrder:*/Active_dgmu_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_fgmu, /*ignoreCase:*/Active_fgmu_long, /*b:*/Active_bgmu, /*ignoreLeadingBlanks:*/Active_bgmu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_gmru, /*reverse:*/Active_gmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.generalNumericSort, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #generalNumericSort g}, {@link #merge m}, {@link #unique u}.
     */
    Active_gmu_long(
		/*d:*/Active_dgmu, /*dictionaryOrder:*/Active_dgmu_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_fgmu, /*ignoreCase:*/Active_fgmu_long, /*b:*/Active_bgmu, /*ignoreLeadingBlanks:*/Active_bgmu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_gmru, /*reverse:*/Active_gmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.generalNumericSort, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}, {@link #merge m}.
     */
    Active_bgm(
		/*d:*/Active_bdgm, /*dictionaryOrder:*/Active_bdgm_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bfgm, /*ignoreCase:*/Active_bfgm_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_bgmr, /*reverse:*/Active_bgmr_long, /*u:*/Active_bgmu, /*unique:*/Active_bgmu_long,
            true,
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}, {@link #merge m}.
     */
    Active_bgm_long(
		/*d:*/Active_bdgm, /*dictionaryOrder:*/Active_bdgm_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bfgm, /*ignoreCase:*/Active_bfgm_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_bgmr, /*reverse:*/Active_bgmr_long, /*u:*/Active_bgmu, /*unique:*/Active_bgmu_long,
            false,
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #merge m}.
     */
    Active_dgm(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_dfgm, /*ignoreCase:*/Active_dfgm_long, /*b:*/Active_bdgm, /*ignoreLeadingBlanks:*/Active_bdgm_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_dgmr, /*reverse:*/Active_dgmr_long, /*u:*/Active_dgmu, /*unique:*/Active_dgmu_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #merge m}.
     */
    Active_dgm_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_dfgm, /*ignoreCase:*/Active_dfgm_long, /*b:*/Active_bdgm, /*ignoreLeadingBlanks:*/Active_bdgm_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_dgmr, /*reverse:*/Active_dgmr_long, /*u:*/Active_dgmu, /*unique:*/Active_dgmu_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #merge m}.
     */
    Active_fgm(
		/*d:*/Active_dfgm, /*dictionaryOrder:*/Active_dfgm_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfgm, /*ignoreLeadingBlanks:*/Active_bfgm_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_fgmr, /*reverse:*/Active_fgmr_long, /*u:*/Active_fgmu, /*unique:*/Active_fgmu_long,
            true,
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #merge m}.
     */
    Active_fgm_long(
		/*d:*/Active_dfgm, /*dictionaryOrder:*/Active_dfgm_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfgm, /*ignoreLeadingBlanks:*/Active_bfgm_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_fgmr, /*reverse:*/Active_fgmr_long, /*u:*/Active_fgmu, /*unique:*/Active_fgmu_long,
            false,
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #generalNumericSort g}, {@link #merge m}, {@link #reverse r}.
     */
    Active_gmr(
		/*d:*/Active_dgmr, /*dictionaryOrder:*/Active_dgmr_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_fgmr, /*ignoreCase:*/Active_fgmr_long, /*b:*/Active_bgmr, /*ignoreLeadingBlanks:*/Active_bgmr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_gmru, /*unique:*/Active_gmru_long,
            true,
		/*active:*/SortOption.generalNumericSort, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #generalNumericSort g}, {@link #merge m}, {@link #reverse r}.
     */
    Active_gmr_long(
		/*d:*/Active_dgmr, /*dictionaryOrder:*/Active_dgmr_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_fgmr, /*ignoreCase:*/Active_fgmr_long, /*b:*/Active_bgmr, /*ignoreLeadingBlanks:*/Active_bgmr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_gmru, /*unique:*/Active_gmru_long,
            false,
		/*active:*/SortOption.generalNumericSort, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #generalNumericSort g}, {@link #merge m}.
     */
    Active_gm(
		/*d:*/Active_dgm, /*dictionaryOrder:*/Active_dgm_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_fgm, /*ignoreCase:*/Active_fgm_long, /*b:*/Active_bgm, /*ignoreLeadingBlanks:*/Active_bgm_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_gmr, /*reverse:*/Active_gmr_long, /*u:*/Active_gmu, /*unique:*/Active_gmu_long,
            true,
		/*active:*/SortOption.generalNumericSort, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #generalNumericSort g}, {@link #merge m}.
     */
    Active_gm_long(
		/*d:*/Active_dgm, /*dictionaryOrder:*/Active_dgm_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_fgm, /*ignoreCase:*/Active_fgm_long, /*b:*/Active_bgm, /*ignoreLeadingBlanks:*/Active_bgm_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_gmr, /*reverse:*/Active_gmr_long, /*u:*/Active_gmu, /*unique:*/Active_gmu_long,
            false,
		/*active:*/SortOption.generalNumericSort, SortOption.merge
    );

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
    public final SortOptionSet_bdfgmru d;
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
    public final SortOptionSet_bdfgmru dictionaryOrder;
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
    public final SortOptionSet_bdfgmru g;
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
    public final SortOptionSet_bdfgmru generalNumericSort;
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
    public final SortOptionSet_bdfgmru f;
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
    public final SortOptionSet_bdfgmru ignoreCase;
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
    public final SortOptionSet_bdfgmru b;
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
    public final SortOptionSet_bdfgmru ignoreLeadingBlanks;
    /**
     * Option {@code "-m"}: Merge only; the input file are assumed to be already sorted.
     * <p>
     * The option {@code "-m"} is equivalent to the {@code "--}{@link #merge merge}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-m"}. If the option {@code "-m"}
     * is already set, the field {@code m} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final SortOptionSet_bdfgmru m;
    /**
     * Option {@code "--merge"}: Merge only; the input file are assumed to be already sorted.
     * <p>
     * The option {@code "--merge"} is equivalent to the {@code "-}{@link #m m}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--merge"}. If the option {@code "--merge"}
     * is already set, the field {@code merge} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final SortOptionSet_bdfgmru merge;
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
    public final SortOptionSet_bdfgmru r;
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
    public final SortOptionSet_bdfgmru reverse;
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
    public final SortOptionSet_bdfgmru u;
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
    public final SortOptionSet_bdfgmru unique;
    private final boolean useAcronym;
    private final EnumSet<SortOption> options;
    private SortOptionSet_bdfgmru(
            SortOptionSet_bdfgmru d, SortOptionSet_bdfgmru dictionaryOrder, SortOptionSet_bdfgmru g, SortOptionSet_bdfgmru generalNumericSort, SortOptionSet_bdfgmru f, SortOptionSet_bdfgmru ignoreCase, SortOptionSet_bdfgmru b, SortOptionSet_bdfgmru ignoreLeadingBlanks, SortOptionSet_bdfgmru m, SortOptionSet_bdfgmru merge, SortOptionSet_bdfgmru r, SortOptionSet_bdfgmru reverse, SortOptionSet_bdfgmru u, SortOptionSet_bdfgmru unique,
            boolean useAcronym,
            SortOption... activeOptions
    ) {
        this.d = d == null ? this : d;
        this.dictionaryOrder = dictionaryOrder == null ? this : dictionaryOrder;
        this.g = g == null ? this : g;
        this.generalNumericSort = generalNumericSort == null ? this : generalNumericSort;
        this.f = f == null ? this : f;
        this.ignoreCase = ignoreCase == null ? this : ignoreCase;
        this.b = b == null ? this : b;
        this.ignoreLeadingBlanks = ignoreLeadingBlanks == null ? this : ignoreLeadingBlanks;
        this.m = m == null ? this : m;
        this.merge = merge == null ? this : merge;
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
     *    SortOptionSet_bdfgmru.dictionaryOrder.g;
     * </pre>
     * uses acronyms, that is, this method always returns true for the above
     * set.
     * <p>
     * On the other hand, long option names are used and this method always
     * returns false for the set
     * <pre>
     *    SortOptionSet_bdfgmru.d.generalNumericSort;
     * </pre>
     * <p>
     * Note that a repeated option is <i>not</i> treated as the last set option.
     * For instance, the first and last option of the following set are
     * equivalent and acronyms are used:
     * <pre>
     *    SortOptionSet_bdfgmru.d.g.dictionaryOrder;
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
