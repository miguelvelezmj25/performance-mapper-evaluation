package org.unix4j.unix.sort;

import org.unix4j.option.Option;
import org.unix4j.unix.Sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Option sets for the {@link Sort sort} command with
 * the following options: {@link #d d}, {@link #f f}, {@link #b b}, {@link #m m}, {@link #n n}, {@link #r r}, {@link #u u}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Sort#Options} should be used instead to specify command
 * options. See also {@link org.unix4j.unix.sort.SortOptions} for more information.
 */
public enum SortOptionSet_bdfmnru implements SortOptions {
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bdfmnru(
        /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
        /*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.numericSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bdfmnru_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.numericSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #numericSort n}, {@link #unique u}.
     */
    Active_bdfmnu(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bdfmnru, /*reverse:*/Active_bdfmnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.numericSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #numericSort n}, {@link #unique u}.
     */
    Active_bdfmnu_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bdfmnru, /*reverse:*/Active_bdfmnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.numericSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bdmnru(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_bdfmnru, /*ignoreCase:*/Active_bdfmnru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.numericSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bdmnru_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_bdfmnru, /*ignoreCase:*/Active_bdfmnru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.numericSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bfmnru(
		/*d:*/Active_bdfmnru, /*dictionaryOrder:*/Active_bdfmnru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.numericSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bfmnru_long(
		/*d:*/Active_bdfmnru, /*dictionaryOrder:*/Active_bdfmnru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.numericSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #merge m}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.
     */
    Active_dfmnru(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfmnru, /*ignoreLeadingBlanks:*/Active_bdfmnru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.merge, SortOption.numericSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #merge m}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.
     */
    Active_dfmnru_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfmnru, /*ignoreLeadingBlanks:*/Active_bdfmnru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.merge, SortOption.numericSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #numericSort n}, {@link #reverse r}.
     */
    Active_bdfmnr(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bdfmnru, /*unique:*/Active_bdfmnru_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.numericSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #numericSort n}, {@link #reverse r}.
     */
    Active_bdfmnr_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bdfmnru, /*unique:*/Active_bdfmnru_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.numericSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #numericSort n}, {@link #unique u}.
     */
    Active_bdmnu(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_bdfmnu, /*ignoreCase:*/Active_bdfmnu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bdmnru, /*reverse:*/Active_bdmnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.numericSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #numericSort n}, {@link #unique u}.
     */
    Active_bdmnu_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_bdfmnu, /*ignoreCase:*/Active_bdfmnu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bdmnru, /*reverse:*/Active_bdmnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.numericSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #numericSort n}, {@link #unique u}.
     */
    Active_bfmnu(
		/*d:*/Active_bdfmnu, /*dictionaryOrder:*/Active_bdfmnu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bfmnru, /*reverse:*/Active_bfmnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.numericSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #numericSort n}, {@link #unique u}.
     */
    Active_bfmnu_long(
		/*d:*/Active_bdfmnu, /*dictionaryOrder:*/Active_bdfmnu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bfmnru, /*reverse:*/Active_bfmnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.numericSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bmnru(
		/*d:*/Active_bdmnru, /*dictionaryOrder:*/Active_bdmnru_long, /*f:*/Active_bfmnru, /*ignoreCase:*/Active_bfmnru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.numericSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bmnru_long(
		/*d:*/Active_bdmnru, /*dictionaryOrder:*/Active_bdmnru_long, /*f:*/Active_bfmnru, /*ignoreCase:*/Active_bfmnru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.numericSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #merge m}, {@link #numericSort n}, {@link #unique u}.
     */
    Active_dfmnu(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfmnu, /*ignoreLeadingBlanks:*/Active_bdfmnu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_dfmnru, /*reverse:*/Active_dfmnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.merge, SortOption.numericSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #merge m}, {@link #numericSort n}, {@link #unique u}.
     */
    Active_dfmnu_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfmnu, /*ignoreLeadingBlanks:*/Active_bdfmnu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_dfmnru, /*reverse:*/Active_dfmnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.merge, SortOption.numericSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #merge m}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.
     */
    Active_dmnru(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_dfmnru, /*ignoreCase:*/Active_dfmnru_long, /*b:*/Active_bdmnru, /*ignoreLeadingBlanks:*/Active_bdmnru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.merge, SortOption.numericSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #merge m}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.
     */
    Active_dmnru_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_dfmnru, /*ignoreCase:*/Active_dfmnru_long, /*b:*/Active_bdmnru, /*ignoreLeadingBlanks:*/Active_bdmnru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.merge, SortOption.numericSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #merge m}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.
     */
    Active_fmnru(
		/*d:*/Active_dfmnru, /*dictionaryOrder:*/Active_dfmnru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfmnru, /*ignoreLeadingBlanks:*/Active_bfmnru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.merge, SortOption.numericSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #merge m}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.
     */
    Active_fmnru_long(
		/*d:*/Active_dfmnru, /*dictionaryOrder:*/Active_dfmnru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfmnru, /*ignoreLeadingBlanks:*/Active_bfmnru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.merge, SortOption.numericSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #numericSort n}.
     */
    Active_bdfmn(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bdfmnr, /*reverse:*/Active_bdfmnr_long, /*u:*/Active_bdfmnu, /*unique:*/Active_bdfmnu_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.numericSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #numericSort n}.
     */
    Active_bdfmn_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bdfmnr, /*reverse:*/Active_bdfmnr_long, /*u:*/Active_bdfmnu, /*unique:*/Active_bdfmnu_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.numericSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #numericSort n}, {@link #reverse r}.
     */
    Active_bdmnr(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_bdfmnr, /*ignoreCase:*/Active_bdfmnr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bdmnru, /*unique:*/Active_bdmnru_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.numericSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #numericSort n}, {@link #reverse r}.
     */
    Active_bdmnr_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_bdfmnr, /*ignoreCase:*/Active_bdfmnr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bdmnru, /*unique:*/Active_bdmnru_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.numericSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #numericSort n}, {@link #reverse r}.
     */
    Active_bfmnr(
		/*d:*/Active_bdfmnr, /*dictionaryOrder:*/Active_bdfmnr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bfmnru, /*unique:*/Active_bfmnru_long,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.numericSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #numericSort n}, {@link #reverse r}.
     */
    Active_bfmnr_long(
		/*d:*/Active_bdfmnr, /*dictionaryOrder:*/Active_bdfmnr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bfmnru, /*unique:*/Active_bfmnru_long,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.numericSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #merge m}, {@link #numericSort n}, {@link #reverse r}.
     */
    Active_dfmnr(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfmnr, /*ignoreLeadingBlanks:*/Active_bdfmnr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_dfmnru, /*unique:*/Active_dfmnru_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.merge, SortOption.numericSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #merge m}, {@link #numericSort n}, {@link #reverse r}.
     */
    Active_dfmnr_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfmnr, /*ignoreLeadingBlanks:*/Active_bdfmnr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_dfmnru, /*unique:*/Active_dfmnru_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.merge, SortOption.numericSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #numericSort n}, {@link #unique u}.
     */
    Active_bmnu(
		/*d:*/Active_bdmnu, /*dictionaryOrder:*/Active_bdmnu_long, /*f:*/Active_bfmnu, /*ignoreCase:*/Active_bfmnu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bmnru, /*reverse:*/Active_bmnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.numericSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #numericSort n}, {@link #unique u}.
     */
    Active_bmnu_long(
		/*d:*/Active_bdmnu, /*dictionaryOrder:*/Active_bdmnu_long, /*f:*/Active_bfmnu, /*ignoreCase:*/Active_bfmnu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bmnru, /*reverse:*/Active_bmnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.numericSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #merge m}, {@link #numericSort n}, {@link #unique u}.
     */
    Active_dmnu(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_dfmnu, /*ignoreCase:*/Active_dfmnu_long, /*b:*/Active_bdmnu, /*ignoreLeadingBlanks:*/Active_bdmnu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_dmnru, /*reverse:*/Active_dmnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.merge, SortOption.numericSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #merge m}, {@link #numericSort n}, {@link #unique u}.
     */
    Active_dmnu_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_dfmnu, /*ignoreCase:*/Active_dfmnu_long, /*b:*/Active_bdmnu, /*ignoreLeadingBlanks:*/Active_bdmnu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_dmnru, /*reverse:*/Active_dmnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.merge, SortOption.numericSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #merge m}, {@link #numericSort n}, {@link #unique u}.
     */
    Active_fmnu(
		/*d:*/Active_dfmnu, /*dictionaryOrder:*/Active_dfmnu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfmnu, /*ignoreLeadingBlanks:*/Active_bfmnu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_fmnru, /*reverse:*/Active_fmnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.merge, SortOption.numericSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #merge m}, {@link #numericSort n}, {@link #unique u}.
     */
    Active_fmnu_long(
		/*d:*/Active_dfmnu, /*dictionaryOrder:*/Active_dfmnu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfmnu, /*ignoreLeadingBlanks:*/Active_bfmnu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_fmnru, /*reverse:*/Active_fmnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.merge, SortOption.numericSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #merge m}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.
     */
    Active_mnru(
		/*d:*/Active_dmnru, /*dictionaryOrder:*/Active_dmnru_long, /*f:*/Active_fmnru, /*ignoreCase:*/Active_fmnru_long, /*b:*/Active_bmnru, /*ignoreLeadingBlanks:*/Active_bmnru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.merge, SortOption.numericSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #merge m}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.
     */
    Active_mnru_long(
		/*d:*/Active_dmnru, /*dictionaryOrder:*/Active_dmnru_long, /*f:*/Active_fmnru, /*ignoreCase:*/Active_fmnru_long, /*b:*/Active_bmnru, /*ignoreLeadingBlanks:*/Active_bmnru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.merge, SortOption.numericSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #numericSort n}.
     */
    Active_bdmn(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_bdfmn, /*ignoreCase:*/Active_bdfmn_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bdmnr, /*reverse:*/Active_bdmnr_long, /*u:*/Active_bdmnu, /*unique:*/Active_bdmnu_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.numericSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #numericSort n}.
     */
    Active_bdmn_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_bdfmn, /*ignoreCase:*/Active_bdfmn_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bdmnr, /*reverse:*/Active_bdmnr_long, /*u:*/Active_bdmnu, /*unique:*/Active_bdmnu_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.numericSort
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #numericSort n}.
     */
    Active_bfmn(
		/*d:*/Active_bdfmn, /*dictionaryOrder:*/Active_bdfmn_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bfmnr, /*reverse:*/Active_bfmnr_long, /*u:*/Active_bfmnu, /*unique:*/Active_bfmnu_long,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.numericSort
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #numericSort n}.
     */
    Active_bfmn_long(
		/*d:*/Active_bdfmn, /*dictionaryOrder:*/Active_bdfmn_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bfmnr, /*reverse:*/Active_bfmnr_long, /*u:*/Active_bfmnu, /*unique:*/Active_bfmnu_long,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.numericSort
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #numericSort n}, {@link #reverse r}.
     */
    Active_bmnr(
		/*d:*/Active_bdmnr, /*dictionaryOrder:*/Active_bdmnr_long, /*f:*/Active_bfmnr, /*ignoreCase:*/Active_bfmnr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bmnru, /*unique:*/Active_bmnru_long,
            true,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.numericSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #numericSort n}, {@link #reverse r}.
     */
    Active_bmnr_long(
		/*d:*/Active_bdmnr, /*dictionaryOrder:*/Active_bdmnr_long, /*f:*/Active_bfmnr, /*ignoreCase:*/Active_bfmnr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bmnru, /*unique:*/Active_bmnru_long,
            false,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.numericSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #merge m}, {@link #numericSort n}.
     */
    Active_dfmn(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfmn, /*ignoreLeadingBlanks:*/Active_bdfmn_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_dfmnr, /*reverse:*/Active_dfmnr_long, /*u:*/Active_dfmnu, /*unique:*/Active_dfmnu_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.merge, SortOption.numericSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #merge m}, {@link #numericSort n}.
     */
    Active_dfmn_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfmn, /*ignoreLeadingBlanks:*/Active_bdfmn_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_dfmnr, /*reverse:*/Active_dfmnr_long, /*u:*/Active_dfmnu, /*unique:*/Active_dfmnu_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.merge, SortOption.numericSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #merge m}, {@link #numericSort n}, {@link #reverse r}.
     */
    Active_dmnr(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_dfmnr, /*ignoreCase:*/Active_dfmnr_long, /*b:*/Active_bdmnr, /*ignoreLeadingBlanks:*/Active_bdmnr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_dmnru, /*unique:*/Active_dmnru_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.merge, SortOption.numericSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #merge m}, {@link #numericSort n}, {@link #reverse r}.
     */
    Active_dmnr_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_dfmnr, /*ignoreCase:*/Active_dfmnr_long, /*b:*/Active_bdmnr, /*ignoreLeadingBlanks:*/Active_bdmnr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_dmnru, /*unique:*/Active_dmnru_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.merge, SortOption.numericSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #merge m}, {@link #numericSort n}, {@link #reverse r}.
     */
    Active_fmnr(
		/*d:*/Active_dfmnr, /*dictionaryOrder:*/Active_dfmnr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfmnr, /*ignoreLeadingBlanks:*/Active_bfmnr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_fmnru, /*unique:*/Active_fmnru_long,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.merge, SortOption.numericSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #merge m}, {@link #numericSort n}, {@link #reverse r}.
     */
    Active_fmnr_long(
		/*d:*/Active_dfmnr, /*dictionaryOrder:*/Active_dfmnr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfmnr, /*ignoreLeadingBlanks:*/Active_bfmnr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_fmnru, /*unique:*/Active_fmnru_long,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.merge, SortOption.numericSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #merge m}, {@link #numericSort n}, {@link #unique u}.
     */
    Active_mnu(
		/*d:*/Active_dmnu, /*dictionaryOrder:*/Active_dmnu_long, /*f:*/Active_fmnu, /*ignoreCase:*/Active_fmnu_long, /*b:*/Active_bmnu, /*ignoreLeadingBlanks:*/Active_bmnu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_mnru, /*reverse:*/Active_mnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.merge, SortOption.numericSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #merge m}, {@link #numericSort n}, {@link #unique u}.
     */
    Active_mnu_long(
		/*d:*/Active_dmnu, /*dictionaryOrder:*/Active_dmnu_long, /*f:*/Active_fmnu, /*ignoreCase:*/Active_fmnu_long, /*b:*/Active_bmnu, /*ignoreLeadingBlanks:*/Active_bmnu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_mnru, /*reverse:*/Active_mnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.merge, SortOption.numericSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #numericSort n}.
     */
    Active_bmn(
		/*d:*/Active_bdmn, /*dictionaryOrder:*/Active_bdmn_long, /*f:*/Active_bfmn, /*ignoreCase:*/Active_bfmn_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bmnr, /*reverse:*/Active_bmnr_long, /*u:*/Active_bmnu, /*unique:*/Active_bmnu_long,
            true,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.numericSort
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #numericSort n}.
     */
    Active_bmn_long(
		/*d:*/Active_bdmn, /*dictionaryOrder:*/Active_bdmn_long, /*f:*/Active_bfmn, /*ignoreCase:*/Active_bfmn_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bmnr, /*reverse:*/Active_bmnr_long, /*u:*/Active_bmnu, /*unique:*/Active_bmnu_long,
            false,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.numericSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #merge m}, {@link #numericSort n}.
     */
    Active_dmn(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_dfmn, /*ignoreCase:*/Active_dfmn_long, /*b:*/Active_bdmn, /*ignoreLeadingBlanks:*/Active_bdmn_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_dmnr, /*reverse:*/Active_dmnr_long, /*u:*/Active_dmnu, /*unique:*/Active_dmnu_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.merge, SortOption.numericSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #merge m}, {@link #numericSort n}.
     */
    Active_dmn_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_dfmn, /*ignoreCase:*/Active_dfmn_long, /*b:*/Active_bdmn, /*ignoreLeadingBlanks:*/Active_bdmn_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_dmnr, /*reverse:*/Active_dmnr_long, /*u:*/Active_dmnu, /*unique:*/Active_dmnu_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.merge, SortOption.numericSort
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #merge m}, {@link #numericSort n}.
     */
    Active_fmn(
		/*d:*/Active_dfmn, /*dictionaryOrder:*/Active_dfmn_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfmn, /*ignoreLeadingBlanks:*/Active_bfmn_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_fmnr, /*reverse:*/Active_fmnr_long, /*u:*/Active_fmnu, /*unique:*/Active_fmnu_long,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.merge, SortOption.numericSort
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #merge m}, {@link #numericSort n}.
     */
    Active_fmn_long(
		/*d:*/Active_dfmn, /*dictionaryOrder:*/Active_dfmn_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfmn, /*ignoreLeadingBlanks:*/Active_bfmn_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_fmnr, /*reverse:*/Active_fmnr_long, /*u:*/Active_fmnu, /*unique:*/Active_fmnu_long,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.merge, SortOption.numericSort
    ),
    /**
     * Option set with the following active options: {@link #merge m}, {@link #numericSort n}, {@link #reverse r}.
     */
    Active_mnr(
		/*d:*/Active_dmnr, /*dictionaryOrder:*/Active_dmnr_long, /*f:*/Active_fmnr, /*ignoreCase:*/Active_fmnr_long, /*b:*/Active_bmnr, /*ignoreLeadingBlanks:*/Active_bmnr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_mnru, /*unique:*/Active_mnru_long,
            true,
		/*active:*/SortOption.merge, SortOption.numericSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #merge m}, {@link #numericSort n}, {@link #reverse r}.
     */
    Active_mnr_long(
		/*d:*/Active_dmnr, /*dictionaryOrder:*/Active_dmnr_long, /*f:*/Active_fmnr, /*ignoreCase:*/Active_fmnr_long, /*b:*/Active_bmnr, /*ignoreLeadingBlanks:*/Active_bmnr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_mnru, /*unique:*/Active_mnru_long,
            false,
		/*active:*/SortOption.merge, SortOption.numericSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #merge m}, {@link #numericSort n}.
     */
    Active_mn(
		/*d:*/Active_dmn, /*dictionaryOrder:*/Active_dmn_long, /*f:*/Active_fmn, /*ignoreCase:*/Active_fmn_long, /*b:*/Active_bmn, /*ignoreLeadingBlanks:*/Active_bmn_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_mnr, /*reverse:*/Active_mnr_long, /*u:*/Active_mnu, /*unique:*/Active_mnu_long,
            true,
		/*active:*/SortOption.merge, SortOption.numericSort
    ),
    /**
     * Option set with the following active options: {@link #merge m}, {@link #numericSort n}.
     */
    Active_mn_long(
		/*d:*/Active_dmn, /*dictionaryOrder:*/Active_dmn_long, /*f:*/Active_fmn, /*ignoreCase:*/Active_fmn_long, /*b:*/Active_bmn, /*ignoreLeadingBlanks:*/Active_bmn_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_mnr, /*reverse:*/Active_mnr_long, /*u:*/Active_mnu, /*unique:*/Active_mnu_long,
            false,
		/*active:*/SortOption.merge, SortOption.numericSort
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
    public final SortOptionSet_bdfmnru d;
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
    public final SortOptionSet_bdfmnru dictionaryOrder;
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
    public final SortOptionSet_bdfmnru f;
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
    public final SortOptionSet_bdfmnru ignoreCase;
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
    public final SortOptionSet_bdfmnru b;
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
    public final SortOptionSet_bdfmnru ignoreLeadingBlanks;
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
    public final SortOptionSet_bdfmnru m;
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
    public final SortOptionSet_bdfmnru merge;
    /**
     * Option {@code "-n"}: Sort numerically; the number begins each line and consists of
     * optional blanks, an optional minus sign, and zero or more digits
     * possibly separated by thousands separators, optionally followed by a
     * decimal-point character and zero or more digits. An empty number is
     * treated as '0'. The current local specifies the decimal-point
     * character and thousands separator.
     * <p>
     * Comparison is exact; there is no rounding error.
     * <p>
     * Neither a leading '+' nor exponential notation is recognized. To
     * compare such strings numerically, use the
     * {@code -genericNumericSort (-g)} option.
     * <p>
     * (This option is ignored if a comparator operand is present).
     * <p>
     * The option {@code "-n"} is equivalent to the {@code "--}{@link #numericSort numericSort}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-n"}. If the option {@code "-n"}
     * is already set, the field {@code n} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final SortOptionSet_bdfmnru n;
    /**
     * Option {@code "--numericSort"}: Sort numerically; the number begins each line and consists of
     * optional blanks, an optional minus sign, and zero or more digits
     * possibly separated by thousands separators, optionally followed by a
     * decimal-point character and zero or more digits. An empty number is
     * treated as '0'. The current local specifies the decimal-point
     * character and thousands separator.
     * <p>
     * Comparison is exact; there is no rounding error.
     * <p>
     * Neither a leading '+' nor exponential notation is recognized. To
     * compare such strings numerically, use the
     * {@code -genericNumericSort (-g)} option.
     * <p>
     * (This option is ignored if a comparator operand is present).
     * <p>
     * The option {@code "--numericSort"} is equivalent to the {@code "-}{@link #n n}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--numericSort"}. If the option {@code "--numericSort"}
     * is already set, the field {@code numericSort} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final SortOptionSet_bdfmnru numericSort;
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
    public final SortOptionSet_bdfmnru r;
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
    public final SortOptionSet_bdfmnru reverse;
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
    public final SortOptionSet_bdfmnru u;
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
    public final SortOptionSet_bdfmnru unique;
    private final boolean useAcronym;
    private final EnumSet<SortOption> options;

    private SortOptionSet_bdfmnru(
            SortOptionSet_bdfmnru d, SortOptionSet_bdfmnru dictionaryOrder, SortOptionSet_bdfmnru f, SortOptionSet_bdfmnru ignoreCase, SortOptionSet_bdfmnru b, SortOptionSet_bdfmnru ignoreLeadingBlanks, SortOptionSet_bdfmnru m, SortOptionSet_bdfmnru merge, SortOptionSet_bdfmnru n, SortOptionSet_bdfmnru numericSort, SortOptionSet_bdfmnru r, SortOptionSet_bdfmnru reverse, SortOptionSet_bdfmnru u, SortOptionSet_bdfmnru unique,
            boolean useAcronym,
            SortOption... activeOptions
    ) {
        this.d = d == null ? this : d;
        this.dictionaryOrder = dictionaryOrder == null ? this : dictionaryOrder;
        this.f = f == null ? this : f;
        this.ignoreCase = ignoreCase == null ? this : ignoreCase;
        this.b = b == null ? this : b;
        this.ignoreLeadingBlanks = ignoreLeadingBlanks == null ? this : ignoreLeadingBlanks;
        this.m = m == null ? this : m;
        this.merge = merge == null ? this : merge;
        this.n = n == null ? this : n;
        this.numericSort = numericSort == null ? this : numericSort;
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
     *    SortOptionSet_bdfmnru.dictionaryOrder.f;
     * </pre>
     * uses acronyms, that is, this method always returns true for the above
     * set.
     * <p>
     * On the other hand, long option names are used and this method always
     * returns false for the set
     * <pre>
     *    SortOptionSet_bdfmnru.d.ignoreCase;
     * </pre>
     * <p>
     * Note that a repeated option is <i>not</i> treated as the last set option.
     * For instance, the first and last option of the following set are
     * equivalent and acronyms are used:
     * <pre>
     *    SortOptionSet_bdfmnru.d.f.dictionaryOrder;
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
