package org.unix4j.unix.sort;

import org.unix4j.option.Option;
import org.unix4j.unix.Sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Option sets for the {@link Sort sort} command with
 * the following options: {@link #d d}, {@link #h h}, {@link #f f}, {@link #b b}, {@link #m m}, {@link #r r}, {@link #u u}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Sort#Options} should be used instead to specify command
 * options. See also {@link org.unix4j.unix.sort.SortOptions} for more information.
 */
public enum SortOptionSet_bdfhmru implements SortOptions {
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bdfhmru(
        /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
        /*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bdfhmru_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #unique u}.
     */
    Active_bdfhmu(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_bdfhmru, /*reverse:*/Active_bdfhmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #unique u}.
     */
    Active_bdfhmu_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_bdfhmru, /*reverse:*/Active_bdfhmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bdhmru(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bdfhmru, /*ignoreCase:*/Active_bdfhmru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bdhmru_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bdfhmru, /*ignoreCase:*/Active_bdfhmru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bfhmru(
		/*d:*/Active_bdfhmru, /*dictionaryOrder:*/Active_bdfhmru_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bfhmru_long(
		/*d:*/Active_bdfhmru, /*dictionaryOrder:*/Active_bdfhmru_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_dfhmru(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfhmru, /*ignoreLeadingBlanks:*/Active_bdfhmru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_dfhmru_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfhmru, /*ignoreLeadingBlanks:*/Active_bdfhmru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}.
     */
    Active_bdfhmr(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bdfhmru, /*unique:*/Active_bdfhmru_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}.
     */
    Active_bdfhmr_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bdfhmru, /*unique:*/Active_bdfhmru_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #unique u}.
     */
    Active_bdhmu(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bdfhmu, /*ignoreCase:*/Active_bdfhmu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_bdhmru, /*reverse:*/Active_bdhmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #unique u}.
     */
    Active_bdhmu_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bdfhmu, /*ignoreCase:*/Active_bdfhmu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_bdhmru, /*reverse:*/Active_bdhmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #unique u}.
     */
    Active_bfhmu(
		/*d:*/Active_bdfhmu, /*dictionaryOrder:*/Active_bdfhmu_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_bfhmru, /*reverse:*/Active_bfhmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #unique u}.
     */
    Active_bfhmu_long(
		/*d:*/Active_bdfhmu, /*dictionaryOrder:*/Active_bdfhmu_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_bfhmru, /*reverse:*/Active_bfhmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bhmru(
		/*d:*/Active_bdhmru, /*dictionaryOrder:*/Active_bdhmru_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bfhmru, /*ignoreCase:*/Active_bfhmru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bhmru_long(
		/*d:*/Active_bdhmru, /*dictionaryOrder:*/Active_bdhmru_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bfhmru, /*ignoreCase:*/Active_bfhmru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #merge m}, {@link #unique u}.
     */
    Active_dfhmu(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfhmu, /*ignoreLeadingBlanks:*/Active_bdfhmu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_dfhmru, /*reverse:*/Active_dfhmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #merge m}, {@link #unique u}.
     */
    Active_dfhmu_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfhmu, /*ignoreLeadingBlanks:*/Active_bdfhmu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_dfhmru, /*reverse:*/Active_dfhmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_dhmru(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_dfhmru, /*ignoreCase:*/Active_dfhmru_long, /*b:*/Active_bdhmru, /*ignoreLeadingBlanks:*/Active_bdhmru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_dhmru_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_dfhmru, /*ignoreCase:*/Active_dfhmru_long, /*b:*/Active_bdhmru, /*ignoreLeadingBlanks:*/Active_bdhmru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_fhmru(
		/*d:*/Active_dfhmru, /*dictionaryOrder:*/Active_dfhmru_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfhmru, /*ignoreLeadingBlanks:*/Active_bfhmru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_fhmru_long(
		/*d:*/Active_dfhmru, /*dictionaryOrder:*/Active_dfhmru_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfhmru, /*ignoreLeadingBlanks:*/Active_bfhmru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}.
     */
    Active_bdfhm(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_bdfhmr, /*reverse:*/Active_bdfhmr_long, /*u:*/Active_bdfhmu, /*unique:*/Active_bdfhmu_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}.
     */
    Active_bdfhm_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_bdfhmr, /*reverse:*/Active_bdfhmr_long, /*u:*/Active_bdfhmu, /*unique:*/Active_bdfhmu_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}.
     */
    Active_bdhmr(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bdfhmr, /*ignoreCase:*/Active_bdfhmr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bdhmru, /*unique:*/Active_bdhmru_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}.
     */
    Active_bdhmr_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bdfhmr, /*ignoreCase:*/Active_bdfhmr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bdhmru, /*unique:*/Active_bdhmru_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}.
     */
    Active_bfhmr(
		/*d:*/Active_bdfhmr, /*dictionaryOrder:*/Active_bdfhmr_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bfhmru, /*unique:*/Active_bfhmru_long,
            true,
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}.
     */
    Active_bfhmr_long(
		/*d:*/Active_bdfhmr, /*dictionaryOrder:*/Active_bdfhmr_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bfhmru, /*unique:*/Active_bfhmru_long,
            false,
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #merge m}, {@link #reverse r}.
     */
    Active_dfhmr(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfhmr, /*ignoreLeadingBlanks:*/Active_bdfhmr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_dfhmru, /*unique:*/Active_dfhmru_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #merge m}, {@link #reverse r}.
     */
    Active_dfhmr_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfhmr, /*ignoreLeadingBlanks:*/Active_bdfhmr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_dfhmru, /*unique:*/Active_dfhmru_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #unique u}.
     */
    Active_bhmu(
		/*d:*/Active_bdhmu, /*dictionaryOrder:*/Active_bdhmu_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bfhmu, /*ignoreCase:*/Active_bfhmu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_bhmru, /*reverse:*/Active_bhmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #unique u}.
     */
    Active_bhmu_long(
		/*d:*/Active_bdhmu, /*dictionaryOrder:*/Active_bdhmu_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bfhmu, /*ignoreCase:*/Active_bfhmu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_bhmru, /*reverse:*/Active_bhmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #merge m}, {@link #unique u}.
     */
    Active_dhmu(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_dfhmu, /*ignoreCase:*/Active_dfhmu_long, /*b:*/Active_bdhmu, /*ignoreLeadingBlanks:*/Active_bdhmu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_dhmru, /*reverse:*/Active_dhmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #merge m}, {@link #unique u}.
     */
    Active_dhmu_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_dfhmu, /*ignoreCase:*/Active_dfhmu_long, /*b:*/Active_bdhmu, /*ignoreLeadingBlanks:*/Active_bdhmu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_dhmru, /*reverse:*/Active_dhmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #merge m}, {@link #unique u}.
     */
    Active_fhmu(
		/*d:*/Active_dfhmu, /*dictionaryOrder:*/Active_dfhmu_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfhmu, /*ignoreLeadingBlanks:*/Active_bfhmu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_fhmru, /*reverse:*/Active_fhmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #merge m}, {@link #unique u}.
     */
    Active_fhmu_long(
		/*d:*/Active_dfhmu, /*dictionaryOrder:*/Active_dfhmu_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfhmu, /*ignoreLeadingBlanks:*/Active_bfhmu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_fhmru, /*reverse:*/Active_fhmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #humanNumericSort h}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_hmru(
		/*d:*/Active_dhmru, /*dictionaryOrder:*/Active_dhmru_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_fhmru, /*ignoreCase:*/Active_fhmru_long, /*b:*/Active_bhmru, /*ignoreLeadingBlanks:*/Active_bhmru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.humanNumericSort, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #humanNumericSort h}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_hmru_long(
		/*d:*/Active_dhmru, /*dictionaryOrder:*/Active_dhmru_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_fhmru, /*ignoreCase:*/Active_fhmru_long, /*b:*/Active_bhmru, /*ignoreLeadingBlanks:*/Active_bhmru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.humanNumericSort, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}, {@link #merge m}.
     */
    Active_bdhm(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bdfhm, /*ignoreCase:*/Active_bdfhm_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_bdhmr, /*reverse:*/Active_bdhmr_long, /*u:*/Active_bdhmu, /*unique:*/Active_bdhmu_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}, {@link #merge m}.
     */
    Active_bdhm_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bdfhm, /*ignoreCase:*/Active_bdfhm_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_bdhmr, /*reverse:*/Active_bdhmr_long, /*u:*/Active_bdhmu, /*unique:*/Active_bdhmu_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}.
     */
    Active_bfhm(
		/*d:*/Active_bdfhm, /*dictionaryOrder:*/Active_bdfhm_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_bfhmr, /*reverse:*/Active_bfhmr_long, /*u:*/Active_bfhmu, /*unique:*/Active_bfhmu_long,
            true,
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}.
     */
    Active_bfhm_long(
		/*d:*/Active_bdfhm, /*dictionaryOrder:*/Active_bdfhm_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_bfhmr, /*reverse:*/Active_bfhmr_long, /*u:*/Active_bfhmu, /*unique:*/Active_bfhmu_long,
            false,
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}.
     */
    Active_bhmr(
		/*d:*/Active_bdhmr, /*dictionaryOrder:*/Active_bdhmr_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bfhmr, /*ignoreCase:*/Active_bfhmr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bhmru, /*unique:*/Active_bhmru_long,
            true,
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}.
     */
    Active_bhmr_long(
		/*d:*/Active_bdhmr, /*dictionaryOrder:*/Active_bdhmr_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bfhmr, /*ignoreCase:*/Active_bfhmr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bhmru, /*unique:*/Active_bhmru_long,
            false,
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #merge m}.
     */
    Active_dfhm(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfhm, /*ignoreLeadingBlanks:*/Active_bdfhm_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_dfhmr, /*reverse:*/Active_dfhmr_long, /*u:*/Active_dfhmu, /*unique:*/Active_dfhmu_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #merge m}.
     */
    Active_dfhm_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfhm, /*ignoreLeadingBlanks:*/Active_bdfhm_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_dfhmr, /*reverse:*/Active_dfhmr_long, /*u:*/Active_dfhmu, /*unique:*/Active_dfhmu_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #merge m}, {@link #reverse r}.
     */
    Active_dhmr(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_dfhmr, /*ignoreCase:*/Active_dfhmr_long, /*b:*/Active_bdhmr, /*ignoreLeadingBlanks:*/Active_bdhmr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_dhmru, /*unique:*/Active_dhmru_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #merge m}, {@link #reverse r}.
     */
    Active_dhmr_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_dfhmr, /*ignoreCase:*/Active_dfhmr_long, /*b:*/Active_bdhmr, /*ignoreLeadingBlanks:*/Active_bdhmr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_dhmru, /*unique:*/Active_dhmru_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #merge m}, {@link #reverse r}.
     */
    Active_fhmr(
		/*d:*/Active_dfhmr, /*dictionaryOrder:*/Active_dfhmr_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfhmr, /*ignoreLeadingBlanks:*/Active_bfhmr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_fhmru, /*unique:*/Active_fhmru_long,
            true,
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #merge m}, {@link #reverse r}.
     */
    Active_fhmr_long(
		/*d:*/Active_dfhmr, /*dictionaryOrder:*/Active_dfhmr_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfhmr, /*ignoreLeadingBlanks:*/Active_bfhmr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_fhmru, /*unique:*/Active_fhmru_long,
            false,
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #humanNumericSort h}, {@link #merge m}, {@link #unique u}.
     */
    Active_hmu(
		/*d:*/Active_dhmu, /*dictionaryOrder:*/Active_dhmu_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_fhmu, /*ignoreCase:*/Active_fhmu_long, /*b:*/Active_bhmu, /*ignoreLeadingBlanks:*/Active_bhmu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_hmru, /*reverse:*/Active_hmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.humanNumericSort, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #humanNumericSort h}, {@link #merge m}, {@link #unique u}.
     */
    Active_hmu_long(
		/*d:*/Active_dhmu, /*dictionaryOrder:*/Active_dhmu_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_fhmu, /*ignoreCase:*/Active_fhmu_long, /*b:*/Active_bhmu, /*ignoreLeadingBlanks:*/Active_bhmu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_hmru, /*reverse:*/Active_hmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.humanNumericSort, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}, {@link #merge m}.
     */
    Active_bhm(
		/*d:*/Active_bdhm, /*dictionaryOrder:*/Active_bdhm_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bfhm, /*ignoreCase:*/Active_bfhm_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_bhmr, /*reverse:*/Active_bhmr_long, /*u:*/Active_bhmu, /*unique:*/Active_bhmu_long,
            true,
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}, {@link #merge m}.
     */
    Active_bhm_long(
		/*d:*/Active_bdhm, /*dictionaryOrder:*/Active_bdhm_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bfhm, /*ignoreCase:*/Active_bfhm_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_bhmr, /*reverse:*/Active_bhmr_long, /*u:*/Active_bhmu, /*unique:*/Active_bhmu_long,
            false,
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #merge m}.
     */
    Active_dhm(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_dfhm, /*ignoreCase:*/Active_dfhm_long, /*b:*/Active_bdhm, /*ignoreLeadingBlanks:*/Active_bdhm_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_dhmr, /*reverse:*/Active_dhmr_long, /*u:*/Active_dhmu, /*unique:*/Active_dhmu_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #merge m}.
     */
    Active_dhm_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_dfhm, /*ignoreCase:*/Active_dfhm_long, /*b:*/Active_bdhm, /*ignoreLeadingBlanks:*/Active_bdhm_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_dhmr, /*reverse:*/Active_dhmr_long, /*u:*/Active_dhmu, /*unique:*/Active_dhmu_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #merge m}.
     */
    Active_fhm(
		/*d:*/Active_dfhm, /*dictionaryOrder:*/Active_dfhm_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfhm, /*ignoreLeadingBlanks:*/Active_bfhm_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_fhmr, /*reverse:*/Active_fhmr_long, /*u:*/Active_fhmu, /*unique:*/Active_fhmu_long,
            true,
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #merge m}.
     */
    Active_fhm_long(
		/*d:*/Active_dfhm, /*dictionaryOrder:*/Active_dfhm_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfhm, /*ignoreLeadingBlanks:*/Active_bfhm_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_fhmr, /*reverse:*/Active_fhmr_long, /*u:*/Active_fhmu, /*unique:*/Active_fhmu_long,
            false,
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #humanNumericSort h}, {@link #merge m}, {@link #reverse r}.
     */
    Active_hmr(
		/*d:*/Active_dhmr, /*dictionaryOrder:*/Active_dhmr_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_fhmr, /*ignoreCase:*/Active_fhmr_long, /*b:*/Active_bhmr, /*ignoreLeadingBlanks:*/Active_bhmr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_hmru, /*unique:*/Active_hmru_long,
            true,
		/*active:*/SortOption.humanNumericSort, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #humanNumericSort h}, {@link #merge m}, {@link #reverse r}.
     */
    Active_hmr_long(
		/*d:*/Active_dhmr, /*dictionaryOrder:*/Active_dhmr_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_fhmr, /*ignoreCase:*/Active_fhmr_long, /*b:*/Active_bhmr, /*ignoreLeadingBlanks:*/Active_bhmr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_hmru, /*unique:*/Active_hmru_long,
            false,
		/*active:*/SortOption.humanNumericSort, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #humanNumericSort h}, {@link #merge m}.
     */
    Active_hm(
		/*d:*/Active_dhm, /*dictionaryOrder:*/Active_dhm_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_fhm, /*ignoreCase:*/Active_fhm_long, /*b:*/Active_bhm, /*ignoreLeadingBlanks:*/Active_bhm_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_hmr, /*reverse:*/Active_hmr_long, /*u:*/Active_hmu, /*unique:*/Active_hmu_long,
            true,
		/*active:*/SortOption.humanNumericSort, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #humanNumericSort h}, {@link #merge m}.
     */
    Active_hm_long(
		/*d:*/Active_dhm, /*dictionaryOrder:*/Active_dhm_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_fhm, /*ignoreCase:*/Active_fhm_long, /*b:*/Active_bhm, /*ignoreLeadingBlanks:*/Active_bhm_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_hmr, /*reverse:*/Active_hmr_long, /*u:*/Active_hmu, /*unique:*/Active_hmu_long,
            false,
		/*active:*/SortOption.humanNumericSort, SortOption.merge
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
    public final SortOptionSet_bdfhmru d;
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
    public final SortOptionSet_bdfhmru dictionaryOrder;
    /**
     * Option {@code "-h"}: Sort numerically, first by numeric sign (negative, zero, or
     * positive); then by SI suffix (either empty, or 'k' or 'K', or one
     * of 'MGTPEZY', in that order); and finally by numeric value. For
     * example, '1023M' sorts before '1G' because 'M' (mega) precedes 'G'
     * (giga) as an SI suffix.
     * <p>
     * This option sorts values that are consistently scaled to the nearest
     * suffix, regardless of whether suffixes denote powers of 1000 or
     * 1024, and it therefore sorts the output of any single invocation of
     * the {@code ls} command that are invoked with the --human-readable
     * option.
     * <p>
     * The syntax for numbers is the same as for the
     * {@code --numericSort (-n)} option; the SI suffix must immediately
     * follow the number.
     * <p>
     * (This option is ignored if a comparator operand is present).
     * <p>
     * The option {@code "-h"} is equivalent to the {@code "--}{@link #humanNumericSort humanNumericSort}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-h"}. If the option {@code "-h"}
     * is already set, the field {@code h} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final SortOptionSet_bdfhmru h;
    /**
     * Option {@code "--humanNumericSort"}: Sort numerically, first by numeric sign (negative, zero, or
     * positive); then by SI suffix (either empty, or 'k' or 'K', or one
     * of 'MGTPEZY', in that order); and finally by numeric value. For
     * example, '1023M' sorts before '1G' because 'M' (mega) precedes 'G'
     * (giga) as an SI suffix.
     * <p>
     * This option sorts values that are consistently scaled to the nearest
     * suffix, regardless of whether suffixes denote powers of 1000 or
     * 1024, and it therefore sorts the output of any single invocation of
     * the {@code ls} command that are invoked with the --human-readable
     * option.
     * <p>
     * The syntax for numbers is the same as for the
     * {@code --numericSort (-n)} option; the SI suffix must immediately
     * follow the number.
     * <p>
     * (This option is ignored if a comparator operand is present).
     * <p>
     * The option {@code "--humanNumericSort"} is equivalent to the {@code "-}{@link #h h}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--humanNumericSort"}. If the option {@code "--humanNumericSort"}
     * is already set, the field {@code humanNumericSort} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final SortOptionSet_bdfhmru humanNumericSort;
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
    public final SortOptionSet_bdfhmru f;
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
    public final SortOptionSet_bdfhmru ignoreCase;
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
    public final SortOptionSet_bdfhmru b;
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
    public final SortOptionSet_bdfhmru ignoreLeadingBlanks;
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
    public final SortOptionSet_bdfhmru m;
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
    public final SortOptionSet_bdfhmru merge;
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
    public final SortOptionSet_bdfhmru r;
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
    public final SortOptionSet_bdfhmru reverse;
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
    public final SortOptionSet_bdfhmru u;
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
    public final SortOptionSet_bdfhmru unique;
    private final boolean useAcronym;
    private final EnumSet<SortOption> options;

    private SortOptionSet_bdfhmru(
            SortOptionSet_bdfhmru d, SortOptionSet_bdfhmru dictionaryOrder, SortOptionSet_bdfhmru h, SortOptionSet_bdfhmru humanNumericSort, SortOptionSet_bdfhmru f, SortOptionSet_bdfhmru ignoreCase, SortOptionSet_bdfhmru b, SortOptionSet_bdfhmru ignoreLeadingBlanks, SortOptionSet_bdfhmru m, SortOptionSet_bdfhmru merge, SortOptionSet_bdfhmru r, SortOptionSet_bdfhmru reverse, SortOptionSet_bdfhmru u, SortOptionSet_bdfhmru unique,
            boolean useAcronym,
            SortOption... activeOptions
    ) {
        this.d = d == null ? this : d;
        this.dictionaryOrder = dictionaryOrder == null ? this : dictionaryOrder;
        this.h = h == null ? this : h;
        this.humanNumericSort = humanNumericSort == null ? this : humanNumericSort;
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
     *    SortOptionSet_bdfhmru.dictionaryOrder.h;
     * </pre>
     * uses acronyms, that is, this method always returns true for the above
     * set.
     * <p>
     * On the other hand, long option names are used and this method always
     * returns false for the set
     * <pre>
     *    SortOptionSet_bdfhmru.d.humanNumericSort;
     * </pre>
     * <p>
     * Note that a repeated option is <i>not</i> treated as the last set option.
     * For instance, the first and last option of the following set are
     * equivalent and acronyms are used:
     * <pre>
     *    SortOptionSet_bdfhmru.d.h.dictionaryOrder;
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
