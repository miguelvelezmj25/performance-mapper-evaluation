package org.unix4j.unix.sort;

import org.unix4j.option.Option;
import org.unix4j.unix.Sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Option sets for the {@link Sort sort} command with
 * the following options: {@link #d d}, {@link #f f}, {@link #b b}, {@link #m m}, {@link #M M}, {@link #r r}, {@link #u u}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Sort#Options} should be used instead to specify command
 * options. See also {@link org.unix4j.unix.sort.SortOptions} for more information.
 */
public enum SortOptionSet_Mbdfmru implements SortOptions {
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.
     */
    Active_Mbdfmru(
        /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.monthSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.
     */
    Active_Mbdfmru_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.monthSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #monthSort M}, {@link #unique u}.
     */
    Active_Mbdfmu(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbdfmru, /*reverse:*/Active_Mbdfmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.monthSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #monthSort M}, {@link #unique u}.
     */
    Active_Mbdfmu_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbdfmru, /*reverse:*/Active_Mbdfmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.monthSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.
     */
    Active_Mbdmru(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mbdfmru, /*ignoreCase:*/Active_Mbdfmru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.monthSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.
     */
    Active_Mbdmru_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mbdfmru, /*ignoreCase:*/Active_Mbdfmru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.monthSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.
     */
    Active_Mbfmru(
		/*d:*/Active_Mbdfmru, /*dictionaryOrder:*/Active_Mbdfmru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.monthSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.
     */
    Active_Mbfmru_long(
		/*d:*/Active_Mbdfmru, /*dictionaryOrder:*/Active_Mbdfmru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.monthSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #merge m}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.
     */
    Active_Mdfmru(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbdfmru, /*ignoreLeadingBlanks:*/Active_Mbdfmru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.merge, SortOption.monthSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #merge m}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.
     */
    Active_Mdfmru_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbdfmru, /*ignoreLeadingBlanks:*/Active_Mbdfmru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.merge, SortOption.monthSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #monthSort M}, {@link #reverse r}.
     */
    Active_Mbdfmr(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mbdfmru, /*unique:*/Active_Mbdfmru_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.monthSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #monthSort M}, {@link #reverse r}.
     */
    Active_Mbdfmr_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mbdfmru, /*unique:*/Active_Mbdfmru_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.monthSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #monthSort M}, {@link #unique u}.
     */
    Active_Mbdmu(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mbdfmu, /*ignoreCase:*/Active_Mbdfmu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbdmru, /*reverse:*/Active_Mbdmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.monthSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #monthSort M}, {@link #unique u}.
     */
    Active_Mbdmu_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mbdfmu, /*ignoreCase:*/Active_Mbdfmu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbdmru, /*reverse:*/Active_Mbdmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.monthSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #monthSort M}, {@link #unique u}.
     */
    Active_Mbfmu(
		/*d:*/Active_Mbdfmu, /*dictionaryOrder:*/Active_Mbdfmu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbfmru, /*reverse:*/Active_Mbfmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.monthSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #monthSort M}, {@link #unique u}.
     */
    Active_Mbfmu_long(
		/*d:*/Active_Mbdfmu, /*dictionaryOrder:*/Active_Mbdfmu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbfmru, /*reverse:*/Active_Mbfmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.monthSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.
     */
    Active_Mbmru(
		/*d:*/Active_Mbdmru, /*dictionaryOrder:*/Active_Mbdmru_long, /*f:*/Active_Mbfmru, /*ignoreCase:*/Active_Mbfmru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.monthSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.
     */
    Active_Mbmru_long(
		/*d:*/Active_Mbdmru, /*dictionaryOrder:*/Active_Mbdmru_long, /*f:*/Active_Mbfmru, /*ignoreCase:*/Active_Mbfmru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.monthSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #merge m}, {@link #monthSort M}, {@link #unique u}.
     */
    Active_Mdfmu(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbdfmu, /*ignoreLeadingBlanks:*/Active_Mbdfmu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mdfmru, /*reverse:*/Active_Mdfmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.merge, SortOption.monthSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #merge m}, {@link #monthSort M}, {@link #unique u}.
     */
    Active_Mdfmu_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbdfmu, /*ignoreLeadingBlanks:*/Active_Mbdfmu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mdfmru, /*reverse:*/Active_Mdfmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.merge, SortOption.monthSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #merge m}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.
     */
    Active_Mdmru(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mdfmru, /*ignoreCase:*/Active_Mdfmru_long, /*b:*/Active_Mbdmru, /*ignoreLeadingBlanks:*/Active_Mbdmru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.merge, SortOption.monthSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #merge m}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.
     */
    Active_Mdmru_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mdfmru, /*ignoreCase:*/Active_Mdfmru_long, /*b:*/Active_Mbdmru, /*ignoreLeadingBlanks:*/Active_Mbdmru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.merge, SortOption.monthSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #merge m}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.
     */
    Active_Mfmru(
		/*d:*/Active_Mdfmru, /*dictionaryOrder:*/Active_Mdfmru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbfmru, /*ignoreLeadingBlanks:*/Active_Mbfmru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.merge, SortOption.monthSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #merge m}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.
     */
    Active_Mfmru_long(
		/*d:*/Active_Mdfmru, /*dictionaryOrder:*/Active_Mdfmru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbfmru, /*ignoreLeadingBlanks:*/Active_Mbfmru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.merge, SortOption.monthSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #monthSort M}.
     */
    Active_Mbdfm(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbdfmr, /*reverse:*/Active_Mbdfmr_long, /*u:*/Active_Mbdfmu, /*unique:*/Active_Mbdfmu_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.monthSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #monthSort M}.
     */
    Active_Mbdfm_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbdfmr, /*reverse:*/Active_Mbdfmr_long, /*u:*/Active_Mbdfmu, /*unique:*/Active_Mbdfmu_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.monthSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #monthSort M}, {@link #reverse r}.
     */
    Active_Mbdmr(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mbdfmr, /*ignoreCase:*/Active_Mbdfmr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mbdmru, /*unique:*/Active_Mbdmru_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.monthSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #monthSort M}, {@link #reverse r}.
     */
    Active_Mbdmr_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mbdfmr, /*ignoreCase:*/Active_Mbdfmr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mbdmru, /*unique:*/Active_Mbdmru_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.monthSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #monthSort M}, {@link #reverse r}.
     */
    Active_Mbfmr(
		/*d:*/Active_Mbdfmr, /*dictionaryOrder:*/Active_Mbdfmr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mbfmru, /*unique:*/Active_Mbfmru_long,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.monthSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #monthSort M}, {@link #reverse r}.
     */
    Active_Mbfmr_long(
		/*d:*/Active_Mbdfmr, /*dictionaryOrder:*/Active_Mbdfmr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mbfmru, /*unique:*/Active_Mbfmru_long,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.monthSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #merge m}, {@link #monthSort M}, {@link #reverse r}.
     */
    Active_Mdfmr(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbdfmr, /*ignoreLeadingBlanks:*/Active_Mbdfmr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mdfmru, /*unique:*/Active_Mdfmru_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.merge, SortOption.monthSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #merge m}, {@link #monthSort M}, {@link #reverse r}.
     */
    Active_Mdfmr_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbdfmr, /*ignoreLeadingBlanks:*/Active_Mbdfmr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mdfmru, /*unique:*/Active_Mdfmru_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.merge, SortOption.monthSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #monthSort M}, {@link #unique u}.
     */
    Active_Mbmu(
		/*d:*/Active_Mbdmu, /*dictionaryOrder:*/Active_Mbdmu_long, /*f:*/Active_Mbfmu, /*ignoreCase:*/Active_Mbfmu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbmru, /*reverse:*/Active_Mbmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.monthSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #monthSort M}, {@link #unique u}.
     */
    Active_Mbmu_long(
		/*d:*/Active_Mbdmu, /*dictionaryOrder:*/Active_Mbdmu_long, /*f:*/Active_Mbfmu, /*ignoreCase:*/Active_Mbfmu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbmru, /*reverse:*/Active_Mbmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.monthSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #merge m}, {@link #monthSort M}, {@link #unique u}.
     */
    Active_Mdmu(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mdfmu, /*ignoreCase:*/Active_Mdfmu_long, /*b:*/Active_Mbdmu, /*ignoreLeadingBlanks:*/Active_Mbdmu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mdmru, /*reverse:*/Active_Mdmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.merge, SortOption.monthSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #merge m}, {@link #monthSort M}, {@link #unique u}.
     */
    Active_Mdmu_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mdfmu, /*ignoreCase:*/Active_Mdfmu_long, /*b:*/Active_Mbdmu, /*ignoreLeadingBlanks:*/Active_Mbdmu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mdmru, /*reverse:*/Active_Mdmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.merge, SortOption.monthSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #merge m}, {@link #monthSort M}, {@link #unique u}.
     */
    Active_Mfmu(
		/*d:*/Active_Mdfmu, /*dictionaryOrder:*/Active_Mdfmu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbfmu, /*ignoreLeadingBlanks:*/Active_Mbfmu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mfmru, /*reverse:*/Active_Mfmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.merge, SortOption.monthSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #merge m}, {@link #monthSort M}, {@link #unique u}.
     */
    Active_Mfmu_long(
		/*d:*/Active_Mdfmu, /*dictionaryOrder:*/Active_Mdfmu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbfmu, /*ignoreLeadingBlanks:*/Active_Mbfmu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mfmru, /*reverse:*/Active_Mfmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.merge, SortOption.monthSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #merge m}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.
     */
    Active_Mmru(
		/*d:*/Active_Mdmru, /*dictionaryOrder:*/Active_Mdmru_long, /*f:*/Active_Mfmru, /*ignoreCase:*/Active_Mfmru_long, /*b:*/Active_Mbmru, /*ignoreLeadingBlanks:*/Active_Mbmru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.merge, SortOption.monthSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #merge m}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.
     */
    Active_Mmru_long(
		/*d:*/Active_Mdmru, /*dictionaryOrder:*/Active_Mdmru_long, /*f:*/Active_Mfmru, /*ignoreCase:*/Active_Mfmru_long, /*b:*/Active_Mbmru, /*ignoreLeadingBlanks:*/Active_Mbmru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.merge, SortOption.monthSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #monthSort M}.
     */
    Active_Mbdm(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mbdfm, /*ignoreCase:*/Active_Mbdfm_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbdmr, /*reverse:*/Active_Mbdmr_long, /*u:*/Active_Mbdmu, /*unique:*/Active_Mbdmu_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.monthSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #monthSort M}.
     */
    Active_Mbdm_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mbdfm, /*ignoreCase:*/Active_Mbdfm_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbdmr, /*reverse:*/Active_Mbdmr_long, /*u:*/Active_Mbdmu, /*unique:*/Active_Mbdmu_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.monthSort
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #monthSort M}.
     */
    Active_Mbfm(
		/*d:*/Active_Mbdfm, /*dictionaryOrder:*/Active_Mbdfm_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbfmr, /*reverse:*/Active_Mbfmr_long, /*u:*/Active_Mbfmu, /*unique:*/Active_Mbfmu_long,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.monthSort
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #monthSort M}.
     */
    Active_Mbfm_long(
		/*d:*/Active_Mbdfm, /*dictionaryOrder:*/Active_Mbdfm_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbfmr, /*reverse:*/Active_Mbfmr_long, /*u:*/Active_Mbfmu, /*unique:*/Active_Mbfmu_long,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.monthSort
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #monthSort M}, {@link #reverse r}.
     */
    Active_Mbmr(
		/*d:*/Active_Mbdmr, /*dictionaryOrder:*/Active_Mbdmr_long, /*f:*/Active_Mbfmr, /*ignoreCase:*/Active_Mbfmr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mbmru, /*unique:*/Active_Mbmru_long,
            true,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.monthSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #monthSort M}, {@link #reverse r}.
     */
    Active_Mbmr_long(
		/*d:*/Active_Mbdmr, /*dictionaryOrder:*/Active_Mbdmr_long, /*f:*/Active_Mbfmr, /*ignoreCase:*/Active_Mbfmr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mbmru, /*unique:*/Active_Mbmru_long,
            false,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.monthSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #merge m}, {@link #monthSort M}.
     */
    Active_Mdfm(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbdfm, /*ignoreLeadingBlanks:*/Active_Mbdfm_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mdfmr, /*reverse:*/Active_Mdfmr_long, /*u:*/Active_Mdfmu, /*unique:*/Active_Mdfmu_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.merge, SortOption.monthSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #merge m}, {@link #monthSort M}.
     */
    Active_Mdfm_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbdfm, /*ignoreLeadingBlanks:*/Active_Mbdfm_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mdfmr, /*reverse:*/Active_Mdfmr_long, /*u:*/Active_Mdfmu, /*unique:*/Active_Mdfmu_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.merge, SortOption.monthSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #merge m}, {@link #monthSort M}, {@link #reverse r}.
     */
    Active_Mdmr(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mdfmr, /*ignoreCase:*/Active_Mdfmr_long, /*b:*/Active_Mbdmr, /*ignoreLeadingBlanks:*/Active_Mbdmr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mdmru, /*unique:*/Active_Mdmru_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.merge, SortOption.monthSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #merge m}, {@link #monthSort M}, {@link #reverse r}.
     */
    Active_Mdmr_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mdfmr, /*ignoreCase:*/Active_Mdfmr_long, /*b:*/Active_Mbdmr, /*ignoreLeadingBlanks:*/Active_Mbdmr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mdmru, /*unique:*/Active_Mdmru_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.merge, SortOption.monthSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #merge m}, {@link #monthSort M}, {@link #reverse r}.
     */
    Active_Mfmr(
		/*d:*/Active_Mdfmr, /*dictionaryOrder:*/Active_Mdfmr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbfmr, /*ignoreLeadingBlanks:*/Active_Mbfmr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mfmru, /*unique:*/Active_Mfmru_long,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.merge, SortOption.monthSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #merge m}, {@link #monthSort M}, {@link #reverse r}.
     */
    Active_Mfmr_long(
		/*d:*/Active_Mdfmr, /*dictionaryOrder:*/Active_Mdfmr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbfmr, /*ignoreLeadingBlanks:*/Active_Mbfmr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mfmru, /*unique:*/Active_Mfmru_long,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.merge, SortOption.monthSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #merge m}, {@link #monthSort M}, {@link #unique u}.
     */
    Active_Mmu(
		/*d:*/Active_Mdmu, /*dictionaryOrder:*/Active_Mdmu_long, /*f:*/Active_Mfmu, /*ignoreCase:*/Active_Mfmu_long, /*b:*/Active_Mbmu, /*ignoreLeadingBlanks:*/Active_Mbmu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mmru, /*reverse:*/Active_Mmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.merge, SortOption.monthSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #merge m}, {@link #monthSort M}, {@link #unique u}.
     */
    Active_Mmu_long(
		/*d:*/Active_Mdmu, /*dictionaryOrder:*/Active_Mdmu_long, /*f:*/Active_Mfmu, /*ignoreCase:*/Active_Mfmu_long, /*b:*/Active_Mbmu, /*ignoreLeadingBlanks:*/Active_Mbmu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mmru, /*reverse:*/Active_Mmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.merge, SortOption.monthSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #monthSort M}.
     */
    Active_Mbm(
		/*d:*/Active_Mbdm, /*dictionaryOrder:*/Active_Mbdm_long, /*f:*/Active_Mbfm, /*ignoreCase:*/Active_Mbfm_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbmr, /*reverse:*/Active_Mbmr_long, /*u:*/Active_Mbmu, /*unique:*/Active_Mbmu_long,
            true,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.monthSort
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #monthSort M}.
     */
    Active_Mbm_long(
		/*d:*/Active_Mbdm, /*dictionaryOrder:*/Active_Mbdm_long, /*f:*/Active_Mbfm, /*ignoreCase:*/Active_Mbfm_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbmr, /*reverse:*/Active_Mbmr_long, /*u:*/Active_Mbmu, /*unique:*/Active_Mbmu_long,
            false,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.monthSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #merge m}, {@link #monthSort M}.
     */
    Active_Mdm(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mdfm, /*ignoreCase:*/Active_Mdfm_long, /*b:*/Active_Mbdm, /*ignoreLeadingBlanks:*/Active_Mbdm_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mdmr, /*reverse:*/Active_Mdmr_long, /*u:*/Active_Mdmu, /*unique:*/Active_Mdmu_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.merge, SortOption.monthSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #merge m}, {@link #monthSort M}.
     */
    Active_Mdm_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mdfm, /*ignoreCase:*/Active_Mdfm_long, /*b:*/Active_Mbdm, /*ignoreLeadingBlanks:*/Active_Mbdm_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mdmr, /*reverse:*/Active_Mdmr_long, /*u:*/Active_Mdmu, /*unique:*/Active_Mdmu_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.merge, SortOption.monthSort
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #merge m}, {@link #monthSort M}.
     */
    Active_Mfm(
		/*d:*/Active_Mdfm, /*dictionaryOrder:*/Active_Mdfm_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbfm, /*ignoreLeadingBlanks:*/Active_Mbfm_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mfmr, /*reverse:*/Active_Mfmr_long, /*u:*/Active_Mfmu, /*unique:*/Active_Mfmu_long,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.merge, SortOption.monthSort
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #merge m}, {@link #monthSort M}.
     */
    Active_Mfm_long(
		/*d:*/Active_Mdfm, /*dictionaryOrder:*/Active_Mdfm_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbfm, /*ignoreLeadingBlanks:*/Active_Mbfm_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mfmr, /*reverse:*/Active_Mfmr_long, /*u:*/Active_Mfmu, /*unique:*/Active_Mfmu_long,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.merge, SortOption.monthSort
    ),
    /**
     * Option set with the following active options: {@link #merge m}, {@link #monthSort M}, {@link #reverse r}.
     */
    Active_Mmr(
		/*d:*/Active_Mdmr, /*dictionaryOrder:*/Active_Mdmr_long, /*f:*/Active_Mfmr, /*ignoreCase:*/Active_Mfmr_long, /*b:*/Active_Mbmr, /*ignoreLeadingBlanks:*/Active_Mbmr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mmru, /*unique:*/Active_Mmru_long,
            true,
		/*active:*/SortOption.merge, SortOption.monthSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #merge m}, {@link #monthSort M}, {@link #reverse r}.
     */
    Active_Mmr_long(
		/*d:*/Active_Mdmr, /*dictionaryOrder:*/Active_Mdmr_long, /*f:*/Active_Mfmr, /*ignoreCase:*/Active_Mfmr_long, /*b:*/Active_Mbmr, /*ignoreLeadingBlanks:*/Active_Mbmr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mmru, /*unique:*/Active_Mmru_long,
            false,
		/*active:*/SortOption.merge, SortOption.monthSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #merge m}, {@link #monthSort M}.
     */
    Active_Mm(
		/*d:*/Active_Mdm, /*dictionaryOrder:*/Active_Mdm_long, /*f:*/Active_Mfm, /*ignoreCase:*/Active_Mfm_long, /*b:*/Active_Mbm, /*ignoreLeadingBlanks:*/Active_Mbm_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mmr, /*reverse:*/Active_Mmr_long, /*u:*/Active_Mmu, /*unique:*/Active_Mmu_long,
            true,
		/*active:*/SortOption.merge, SortOption.monthSort
    ),
    /**
     * Option set with the following active options: {@link #merge m}, {@link #monthSort M}.
     */
    Active_Mm_long(
		/*d:*/Active_Mdm, /*dictionaryOrder:*/Active_Mdm_long, /*f:*/Active_Mfm, /*ignoreCase:*/Active_Mfm_long, /*b:*/Active_Mbm, /*ignoreLeadingBlanks:*/Active_Mbm_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mmr, /*reverse:*/Active_Mmr_long, /*u:*/Active_Mmu, /*unique:*/Active_Mmu_long,
            false,
		/*active:*/SortOption.merge, SortOption.monthSort
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
    public final SortOptionSet_Mbdfmru d;
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
    public final SortOptionSet_Mbdfmru dictionaryOrder;
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
    public final SortOptionSet_Mbdfmru f;
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
    public final SortOptionSet_Mbdfmru ignoreCase;
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
    public final SortOptionSet_Mbdfmru b;
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
    public final SortOptionSet_Mbdfmru ignoreLeadingBlanks;
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
    public final SortOptionSet_Mbdfmru m;
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
    public final SortOptionSet_Mbdfmru merge;
    /**
     * Option {@code "-M"}: An initial string, consisting of any amount of blanks, followed by a
     * month name abbreviation, is folded to UPPER case and compared in the
     * order: (unknown) < 'JAN' < ... < 'DEC'. The current locale
     * determines the month spellings.
     * <p>
     * The option {@code "-M"} is equivalent to the {@code "--}{@link #monthSort monthSort}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-M"}. If the option {@code "-M"}
     * is already set, the field {@code M} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final SortOptionSet_Mbdfmru M;
    /**
     * Option {@code "--monthSort"}: An initial string, consisting of any amount of blanks, followed by a
     * month name abbreviation, is folded to UPPER case and compared in the
     * order: (unknown) < 'JAN' < ... < 'DEC'. The current locale
     * determines the month spellings.
     * <p>
     * The option {@code "--monthSort"} is equivalent to the {@code "-}{@link #M M}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--monthSort"}. If the option {@code "--monthSort"}
     * is already set, the field {@code monthSort} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final SortOptionSet_Mbdfmru monthSort;
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
    public final SortOptionSet_Mbdfmru r;
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
    public final SortOptionSet_Mbdfmru reverse;
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
    public final SortOptionSet_Mbdfmru u;
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
    public final SortOptionSet_Mbdfmru unique;
    private final boolean useAcronym;
    private final EnumSet<SortOption> options;
    private SortOptionSet_Mbdfmru(
            SortOptionSet_Mbdfmru d, SortOptionSet_Mbdfmru dictionaryOrder, SortOptionSet_Mbdfmru f, SortOptionSet_Mbdfmru ignoreCase, SortOptionSet_Mbdfmru b, SortOptionSet_Mbdfmru ignoreLeadingBlanks, SortOptionSet_Mbdfmru m, SortOptionSet_Mbdfmru merge, SortOptionSet_Mbdfmru M, SortOptionSet_Mbdfmru monthSort, SortOptionSet_Mbdfmru r, SortOptionSet_Mbdfmru reverse, SortOptionSet_Mbdfmru u, SortOptionSet_Mbdfmru unique,
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
        this.M = M == null ? this : M;
        this.monthSort = monthSort == null ? this : monthSort;
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
     *    SortOptionSet_Mbdfmru.dictionaryOrder.f;
     * </pre>
     * uses acronyms, that is, this method always returns true for the above
     * set.
     * <p>
     * On the other hand, long option names are used and this method always
     * returns false for the set
     * <pre>
     *    SortOptionSet_Mbdfmru.d.ignoreCase;
     * </pre>
     * <p>
     * Note that a repeated option is <i>not</i> treated as the last set option.
     * For instance, the first and last option of the following set are
     * equivalent and acronyms are used:
     * <pre>
     *    SortOptionSet_Mbdfmru.d.f.dictionaryOrder;
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
