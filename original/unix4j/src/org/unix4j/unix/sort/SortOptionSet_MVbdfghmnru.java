package org.unix4j.unix.sort;

import org.unix4j.option.Option;
import org.unix4j.unix.Sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Option sets for the {@link Sort sort} command with
 * the following options: {@link #d d}, {@link #g g}, {@link #h h}, {@link #f f}, {@link #b b}, {@link #m m}, {@link #M M}, {@link #n n}, {@link #r r}, {@link #u u}, {@link #V V}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Sort#Options} should be used instead to specify command
 * options. See also {@link org.unix4j.unix.sort.SortOptions} for more information.
 */
public enum SortOptionSet_MVbdfghmnru implements SortOptions {
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bdfmru(
        /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bdfgmru.Active_bdfgmru, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_bdfgmru_long, /*h:*/SortOptionSet_bdfhmru.Active_bdfhmru, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_bdfhmru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mbdfmru, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mbdfmru_long, /*n:*/SortOptionSet_bdfmnru.Active_bdfmnru, /*numericSort:*/SortOptionSet_bdfmnru.Active_bdfmnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbdfmru.Active_Vbdfmru, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vbdfmru_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bdfmru_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bdfgmru.Active_bdfgmru, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_bdfgmru_long, /*h:*/SortOptionSet_bdfhmru.Active_bdfhmru, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_bdfhmru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mbdfmru, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mbdfmru_long, /*n:*/SortOptionSet_bdfmnru.Active_bdfmnru, /*numericSort:*/SortOptionSet_bdfmnru.Active_bdfmnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbdfmru.Active_Vbdfmru, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vbdfmru_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #unique u}.
     */
    Active_bdfmu(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bdfgmru.Active_bdfgmu, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_bdfgmu_long, /*h:*/SortOptionSet_bdfhmru.Active_bdfhmu, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_bdfhmu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mbdfmu, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mbdfmu_long, /*n:*/SortOptionSet_bdfmnru.Active_bdfmnu, /*numericSort:*/SortOptionSet_bdfmnru.Active_bdfmnu_long, /*r:*/Active_bdfmru, /*reverse:*/Active_bdfmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbdfmru.Active_Vbdfmu, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vbdfmu_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #unique u}.
     */
    Active_bdfmu_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bdfgmru.Active_bdfgmu, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_bdfgmu_long, /*h:*/SortOptionSet_bdfhmru.Active_bdfhmu, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_bdfhmu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mbdfmu, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mbdfmu_long, /*n:*/SortOptionSet_bdfmnru.Active_bdfmnu, /*numericSort:*/SortOptionSet_bdfmnru.Active_bdfmnu_long, /*r:*/Active_bdfmru, /*reverse:*/Active_bdfmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbdfmru.Active_Vbdfmu, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vbdfmu_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bdmru(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bdfgmru.Active_bdgmru, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_bdgmru_long, /*h:*/SortOptionSet_bdfhmru.Active_bdhmru, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_bdhmru_long, /*f:*/Active_bdfmru, /*ignoreCase:*/Active_bdfmru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mbdmru, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mbdmru_long, /*n:*/SortOptionSet_bdfmnru.Active_bdmnru, /*numericSort:*/SortOptionSet_bdfmnru.Active_bdmnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbdfmru.Active_Vbdmru, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vbdmru_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bdmru_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bdfgmru.Active_bdgmru, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_bdgmru_long, /*h:*/SortOptionSet_bdfhmru.Active_bdhmru, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_bdhmru_long, /*f:*/Active_bdfmru, /*ignoreCase:*/Active_bdfmru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mbdmru, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mbdmru_long, /*n:*/SortOptionSet_bdfmnru.Active_bdmnru, /*numericSort:*/SortOptionSet_bdfmnru.Active_bdmnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbdfmru.Active_Vbdmru, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vbdmru_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bfmru(
		/*d:*/Active_bdfmru, /*dictionaryOrder:*/Active_bdfmru_long, /*g:*/SortOptionSet_bdfgmru.Active_bfgmru, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_bfgmru_long, /*h:*/SortOptionSet_bdfhmru.Active_bfhmru, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_bfhmru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mbfmru, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mbfmru_long, /*n:*/SortOptionSet_bdfmnru.Active_bfmnru, /*numericSort:*/SortOptionSet_bdfmnru.Active_bfmnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbdfmru.Active_Vbfmru, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vbfmru_long,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bfmru_long(
		/*d:*/Active_bdfmru, /*dictionaryOrder:*/Active_bdfmru_long, /*g:*/SortOptionSet_bdfgmru.Active_bfgmru, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_bfgmru_long, /*h:*/SortOptionSet_bdfhmru.Active_bfhmru, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_bfhmru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mbfmru, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mbfmru_long, /*n:*/SortOptionSet_bdfmnru.Active_bfmnru, /*numericSort:*/SortOptionSet_bdfmnru.Active_bfmnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbdfmru.Active_Vbfmru, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vbfmru_long,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_dfmru(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bdfgmru.Active_dfgmru, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_dfgmru_long, /*h:*/SortOptionSet_bdfhmru.Active_dfhmru, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_dfhmru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfmru, /*ignoreLeadingBlanks:*/Active_bdfmru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mdfmru, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mdfmru_long, /*n:*/SortOptionSet_bdfmnru.Active_dfmnru, /*numericSort:*/SortOptionSet_bdfmnru.Active_dfmnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbdfmru.Active_Vdfmru, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vdfmru_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_dfmru_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bdfgmru.Active_dfgmru, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_dfgmru_long, /*h:*/SortOptionSet_bdfhmru.Active_dfhmru, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_dfhmru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfmru, /*ignoreLeadingBlanks:*/Active_bdfmru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mdfmru, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mdfmru_long, /*n:*/SortOptionSet_bdfmnru.Active_dfmnru, /*numericSort:*/SortOptionSet_bdfmnru.Active_dfmnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbdfmru.Active_Vdfmru, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vdfmru_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}.
     */
    Active_bdfmr(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bdfgmru.Active_bdfgmr, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_bdfgmr_long, /*h:*/SortOptionSet_bdfhmru.Active_bdfhmr, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_bdfhmr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mbdfmr, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mbdfmr_long, /*n:*/SortOptionSet_bdfmnru.Active_bdfmnr, /*numericSort:*/SortOptionSet_bdfmnru.Active_bdfmnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bdfmru, /*unique:*/Active_bdfmru_long, /*V:*/SortOptionSet_Vbdfmru.Active_Vbdfmr, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vbdfmr_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}.
     */
    Active_bdfmr_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bdfgmru.Active_bdfgmr, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_bdfgmr_long, /*h:*/SortOptionSet_bdfhmru.Active_bdfhmr, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_bdfhmr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mbdfmr, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mbdfmr_long, /*n:*/SortOptionSet_bdfmnru.Active_bdfmnr, /*numericSort:*/SortOptionSet_bdfmnru.Active_bdfmnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bdfmru, /*unique:*/Active_bdfmru_long, /*V:*/SortOptionSet_Vbdfmru.Active_Vbdfmr, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vbdfmr_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #unique u}.
     */
    Active_bdmu(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bdfgmru.Active_bdgmu, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_bdgmu_long, /*h:*/SortOptionSet_bdfhmru.Active_bdhmu, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_bdhmu_long, /*f:*/Active_bdfmu, /*ignoreCase:*/Active_bdfmu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mbdmu, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mbdmu_long, /*n:*/SortOptionSet_bdfmnru.Active_bdmnu, /*numericSort:*/SortOptionSet_bdfmnru.Active_bdmnu_long, /*r:*/Active_bdmru, /*reverse:*/Active_bdmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbdfmru.Active_Vbdmu, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vbdmu_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #unique u}.
     */
    Active_bdmu_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bdfgmru.Active_bdgmu, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_bdgmu_long, /*h:*/SortOptionSet_bdfhmru.Active_bdhmu, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_bdhmu_long, /*f:*/Active_bdfmu, /*ignoreCase:*/Active_bdfmu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mbdmu, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mbdmu_long, /*n:*/SortOptionSet_bdfmnru.Active_bdmnu, /*numericSort:*/SortOptionSet_bdfmnru.Active_bdmnu_long, /*r:*/Active_bdmru, /*reverse:*/Active_bdmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbdfmru.Active_Vbdmu, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vbdmu_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #unique u}.
     */
    Active_bfmu(
		/*d:*/Active_bdfmu, /*dictionaryOrder:*/Active_bdfmu_long, /*g:*/SortOptionSet_bdfgmru.Active_bfgmu, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_bfgmu_long, /*h:*/SortOptionSet_bdfhmru.Active_bfhmu, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_bfhmu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mbfmu, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mbfmu_long, /*n:*/SortOptionSet_bdfmnru.Active_bfmnu, /*numericSort:*/SortOptionSet_bdfmnru.Active_bfmnu_long, /*r:*/Active_bfmru, /*reverse:*/Active_bfmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbdfmru.Active_Vbfmu, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vbfmu_long,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #unique u}.
     */
    Active_bfmu_long(
		/*d:*/Active_bdfmu, /*dictionaryOrder:*/Active_bdfmu_long, /*g:*/SortOptionSet_bdfgmru.Active_bfgmu, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_bfgmu_long, /*h:*/SortOptionSet_bdfhmru.Active_bfhmu, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_bfhmu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mbfmu, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mbfmu_long, /*n:*/SortOptionSet_bdfmnru.Active_bfmnu, /*numericSort:*/SortOptionSet_bdfmnru.Active_bfmnu_long, /*r:*/Active_bfmru, /*reverse:*/Active_bfmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbdfmru.Active_Vbfmu, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vbfmu_long,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bmru(
		/*d:*/Active_bdmru, /*dictionaryOrder:*/Active_bdmru_long, /*g:*/SortOptionSet_bdfgmru.Active_bgmru, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_bgmru_long, /*h:*/SortOptionSet_bdfhmru.Active_bhmru, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_bhmru_long, /*f:*/Active_bfmru, /*ignoreCase:*/Active_bfmru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mbmru, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mbmru_long, /*n:*/SortOptionSet_bdfmnru.Active_bmnru, /*numericSort:*/SortOptionSet_bdfmnru.Active_bmnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbdfmru.Active_Vbmru, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vbmru_long,
            true,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bmru_long(
		/*d:*/Active_bdmru, /*dictionaryOrder:*/Active_bdmru_long, /*g:*/SortOptionSet_bdfgmru.Active_bgmru, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_bgmru_long, /*h:*/SortOptionSet_bdfhmru.Active_bhmru, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_bhmru_long, /*f:*/Active_bfmru, /*ignoreCase:*/Active_bfmru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mbmru, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mbmru_long, /*n:*/SortOptionSet_bdfmnru.Active_bmnru, /*numericSort:*/SortOptionSet_bdfmnru.Active_bmnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbdfmru.Active_Vbmru, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vbmru_long,
            false,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #merge m}, {@link #unique u}.
     */
    Active_dfmu(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bdfgmru.Active_dfgmu, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_dfgmu_long, /*h:*/SortOptionSet_bdfhmru.Active_dfhmu, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_dfhmu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfmu, /*ignoreLeadingBlanks:*/Active_bdfmu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mdfmu, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mdfmu_long, /*n:*/SortOptionSet_bdfmnru.Active_dfmnu, /*numericSort:*/SortOptionSet_bdfmnru.Active_dfmnu_long, /*r:*/Active_dfmru, /*reverse:*/Active_dfmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbdfmru.Active_Vdfmu, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vdfmu_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #merge m}, {@link #unique u}.
     */
    Active_dfmu_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bdfgmru.Active_dfgmu, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_dfgmu_long, /*h:*/SortOptionSet_bdfhmru.Active_dfhmu, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_dfhmu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfmu, /*ignoreLeadingBlanks:*/Active_bdfmu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mdfmu, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mdfmu_long, /*n:*/SortOptionSet_bdfmnru.Active_dfmnu, /*numericSort:*/SortOptionSet_bdfmnru.Active_dfmnu_long, /*r:*/Active_dfmru, /*reverse:*/Active_dfmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbdfmru.Active_Vdfmu, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vdfmu_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_dmru(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bdfgmru.Active_dgmru, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_dgmru_long, /*h:*/SortOptionSet_bdfhmru.Active_dhmru, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_dhmru_long, /*f:*/Active_dfmru, /*ignoreCase:*/Active_dfmru_long, /*b:*/Active_bdmru, /*ignoreLeadingBlanks:*/Active_bdmru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mdmru, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mdmru_long, /*n:*/SortOptionSet_bdfmnru.Active_dmnru, /*numericSort:*/SortOptionSet_bdfmnru.Active_dmnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbdfmru.Active_Vdmru, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vdmru_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_dmru_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bdfgmru.Active_dgmru, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_dgmru_long, /*h:*/SortOptionSet_bdfhmru.Active_dhmru, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_dhmru_long, /*f:*/Active_dfmru, /*ignoreCase:*/Active_dfmru_long, /*b:*/Active_bdmru, /*ignoreLeadingBlanks:*/Active_bdmru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mdmru, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mdmru_long, /*n:*/SortOptionSet_bdfmnru.Active_dmnru, /*numericSort:*/SortOptionSet_bdfmnru.Active_dmnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbdfmru.Active_Vdmru, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vdmru_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_fmru(
		/*d:*/Active_dfmru, /*dictionaryOrder:*/Active_dfmru_long, /*g:*/SortOptionSet_bdfgmru.Active_fgmru, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_fgmru_long, /*h:*/SortOptionSet_bdfhmru.Active_fhmru, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_fhmru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfmru, /*ignoreLeadingBlanks:*/Active_bfmru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mfmru, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mfmru_long, /*n:*/SortOptionSet_bdfmnru.Active_fmnru, /*numericSort:*/SortOptionSet_bdfmnru.Active_fmnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbdfmru.Active_Vfmru, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vfmru_long,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_fmru_long(
		/*d:*/Active_dfmru, /*dictionaryOrder:*/Active_dfmru_long, /*g:*/SortOptionSet_bdfgmru.Active_fgmru, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_fgmru_long, /*h:*/SortOptionSet_bdfhmru.Active_fhmru, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_fhmru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfmru, /*ignoreLeadingBlanks:*/Active_bfmru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mfmru, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mfmru_long, /*n:*/SortOptionSet_bdfmnru.Active_fmnru, /*numericSort:*/SortOptionSet_bdfmnru.Active_fmnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbdfmru.Active_Vfmru, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vfmru_long,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}.
     */
    Active_bdfm(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bdfgmru.Active_bdfgm, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_bdfgm_long, /*h:*/SortOptionSet_bdfhmru.Active_bdfhm, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_bdfhm_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mbdfm, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mbdfm_long, /*n:*/SortOptionSet_bdfmnru.Active_bdfmn, /*numericSort:*/SortOptionSet_bdfmnru.Active_bdfmn_long, /*r:*/Active_bdfmr, /*reverse:*/Active_bdfmr_long, /*u:*/Active_bdfmu, /*unique:*/Active_bdfmu_long, /*V:*/SortOptionSet_Vbdfmru.Active_Vbdfm, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vbdfm_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}.
     */
    Active_bdfm_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bdfgmru.Active_bdfgm, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_bdfgm_long, /*h:*/SortOptionSet_bdfhmru.Active_bdfhm, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_bdfhm_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mbdfm, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mbdfm_long, /*n:*/SortOptionSet_bdfmnru.Active_bdfmn, /*numericSort:*/SortOptionSet_bdfmnru.Active_bdfmn_long, /*r:*/Active_bdfmr, /*reverse:*/Active_bdfmr_long, /*u:*/Active_bdfmu, /*unique:*/Active_bdfmu_long, /*V:*/SortOptionSet_Vbdfmru.Active_Vbdfm, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vbdfm_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}.
     */
    Active_bdmr(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bdfgmru.Active_bdgmr, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_bdgmr_long, /*h:*/SortOptionSet_bdfhmru.Active_bdhmr, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_bdhmr_long, /*f:*/Active_bdfmr, /*ignoreCase:*/Active_bdfmr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mbdmr, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mbdmr_long, /*n:*/SortOptionSet_bdfmnru.Active_bdmnr, /*numericSort:*/SortOptionSet_bdfmnru.Active_bdmnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bdmru, /*unique:*/Active_bdmru_long, /*V:*/SortOptionSet_Vbdfmru.Active_Vbdmr, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vbdmr_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}.
     */
    Active_bdmr_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bdfgmru.Active_bdgmr, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_bdgmr_long, /*h:*/SortOptionSet_bdfhmru.Active_bdhmr, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_bdhmr_long, /*f:*/Active_bdfmr, /*ignoreCase:*/Active_bdfmr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mbdmr, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mbdmr_long, /*n:*/SortOptionSet_bdfmnru.Active_bdmnr, /*numericSort:*/SortOptionSet_bdfmnru.Active_bdmnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bdmru, /*unique:*/Active_bdmru_long, /*V:*/SortOptionSet_Vbdfmru.Active_Vbdmr, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vbdmr_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}.
     */
    Active_bfmr(
		/*d:*/Active_bdfmr, /*dictionaryOrder:*/Active_bdfmr_long, /*g:*/SortOptionSet_bdfgmru.Active_bfgmr, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_bfgmr_long, /*h:*/SortOptionSet_bdfhmru.Active_bfhmr, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_bfhmr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mbfmr, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mbfmr_long, /*n:*/SortOptionSet_bdfmnru.Active_bfmnr, /*numericSort:*/SortOptionSet_bdfmnru.Active_bfmnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bfmru, /*unique:*/Active_bfmru_long, /*V:*/SortOptionSet_Vbdfmru.Active_Vbfmr, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vbfmr_long,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}.
     */
    Active_bfmr_long(
		/*d:*/Active_bdfmr, /*dictionaryOrder:*/Active_bdfmr_long, /*g:*/SortOptionSet_bdfgmru.Active_bfgmr, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_bfgmr_long, /*h:*/SortOptionSet_bdfhmru.Active_bfhmr, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_bfhmr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mbfmr, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mbfmr_long, /*n:*/SortOptionSet_bdfmnru.Active_bfmnr, /*numericSort:*/SortOptionSet_bdfmnru.Active_bfmnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bfmru, /*unique:*/Active_bfmru_long, /*V:*/SortOptionSet_Vbdfmru.Active_Vbfmr, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vbfmr_long,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #merge m}, {@link #reverse r}.
     */
    Active_dfmr(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bdfgmru.Active_dfgmr, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_dfgmr_long, /*h:*/SortOptionSet_bdfhmru.Active_dfhmr, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_dfhmr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfmr, /*ignoreLeadingBlanks:*/Active_bdfmr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mdfmr, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mdfmr_long, /*n:*/SortOptionSet_bdfmnru.Active_dfmnr, /*numericSort:*/SortOptionSet_bdfmnru.Active_dfmnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_dfmru, /*unique:*/Active_dfmru_long, /*V:*/SortOptionSet_Vbdfmru.Active_Vdfmr, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vdfmr_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #merge m}, {@link #reverse r}.
     */
    Active_dfmr_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bdfgmru.Active_dfgmr, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_dfgmr_long, /*h:*/SortOptionSet_bdfhmru.Active_dfhmr, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_dfhmr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfmr, /*ignoreLeadingBlanks:*/Active_bdfmr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mdfmr, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mdfmr_long, /*n:*/SortOptionSet_bdfmnru.Active_dfmnr, /*numericSort:*/SortOptionSet_bdfmnru.Active_dfmnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_dfmru, /*unique:*/Active_dfmru_long, /*V:*/SortOptionSet_Vbdfmru.Active_Vdfmr, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vdfmr_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #unique u}.
     */
    Active_bmu(
		/*d:*/Active_bdmu, /*dictionaryOrder:*/Active_bdmu_long, /*g:*/SortOptionSet_bdfgmru.Active_bgmu, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_bgmu_long, /*h:*/SortOptionSet_bdfhmru.Active_bhmu, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_bhmu_long, /*f:*/Active_bfmu, /*ignoreCase:*/Active_bfmu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mbmu, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mbmu_long, /*n:*/SortOptionSet_bdfmnru.Active_bmnu, /*numericSort:*/SortOptionSet_bdfmnru.Active_bmnu_long, /*r:*/Active_bmru, /*reverse:*/Active_bmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbdfmru.Active_Vbmu, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vbmu_long,
            true,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #unique u}.
     */
    Active_bmu_long(
		/*d:*/Active_bdmu, /*dictionaryOrder:*/Active_bdmu_long, /*g:*/SortOptionSet_bdfgmru.Active_bgmu, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_bgmu_long, /*h:*/SortOptionSet_bdfhmru.Active_bhmu, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_bhmu_long, /*f:*/Active_bfmu, /*ignoreCase:*/Active_bfmu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mbmu, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mbmu_long, /*n:*/SortOptionSet_bdfmnru.Active_bmnu, /*numericSort:*/SortOptionSet_bdfmnru.Active_bmnu_long, /*r:*/Active_bmru, /*reverse:*/Active_bmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbdfmru.Active_Vbmu, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vbmu_long,
            false,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #merge m}, {@link #unique u}.
     */
    Active_dmu(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bdfgmru.Active_dgmu, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_dgmu_long, /*h:*/SortOptionSet_bdfhmru.Active_dhmu, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_dhmu_long, /*f:*/Active_dfmu, /*ignoreCase:*/Active_dfmu_long, /*b:*/Active_bdmu, /*ignoreLeadingBlanks:*/Active_bdmu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mdmu, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mdmu_long, /*n:*/SortOptionSet_bdfmnru.Active_dmnu, /*numericSort:*/SortOptionSet_bdfmnru.Active_dmnu_long, /*r:*/Active_dmru, /*reverse:*/Active_dmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbdfmru.Active_Vdmu, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vdmu_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #merge m}, {@link #unique u}.
     */
    Active_dmu_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bdfgmru.Active_dgmu, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_dgmu_long, /*h:*/SortOptionSet_bdfhmru.Active_dhmu, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_dhmu_long, /*f:*/Active_dfmu, /*ignoreCase:*/Active_dfmu_long, /*b:*/Active_bdmu, /*ignoreLeadingBlanks:*/Active_bdmu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mdmu, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mdmu_long, /*n:*/SortOptionSet_bdfmnru.Active_dmnu, /*numericSort:*/SortOptionSet_bdfmnru.Active_dmnu_long, /*r:*/Active_dmru, /*reverse:*/Active_dmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbdfmru.Active_Vdmu, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vdmu_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #merge m}, {@link #unique u}.
     */
    Active_fmu(
		/*d:*/Active_dfmu, /*dictionaryOrder:*/Active_dfmu_long, /*g:*/SortOptionSet_bdfgmru.Active_fgmu, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_fgmu_long, /*h:*/SortOptionSet_bdfhmru.Active_fhmu, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_fhmu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfmu, /*ignoreLeadingBlanks:*/Active_bfmu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mfmu, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mfmu_long, /*n:*/SortOptionSet_bdfmnru.Active_fmnu, /*numericSort:*/SortOptionSet_bdfmnru.Active_fmnu_long, /*r:*/Active_fmru, /*reverse:*/Active_fmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbdfmru.Active_Vfmu, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vfmu_long,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #merge m}, {@link #unique u}.
     */
    Active_fmu_long(
		/*d:*/Active_dfmu, /*dictionaryOrder:*/Active_dfmu_long, /*g:*/SortOptionSet_bdfgmru.Active_fgmu, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_fgmu_long, /*h:*/SortOptionSet_bdfhmru.Active_fhmu, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_fhmu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfmu, /*ignoreLeadingBlanks:*/Active_bfmu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mfmu, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mfmu_long, /*n:*/SortOptionSet_bdfmnru.Active_fmnu, /*numericSort:*/SortOptionSet_bdfmnru.Active_fmnu_long, /*r:*/Active_fmru, /*reverse:*/Active_fmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbdfmru.Active_Vfmu, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vfmu_long,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_mru(
		/*d:*/Active_dmru, /*dictionaryOrder:*/Active_dmru_long, /*g:*/SortOptionSet_bdfgmru.Active_gmru, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_gmru_long, /*h:*/SortOptionSet_bdfhmru.Active_hmru, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_hmru_long, /*f:*/Active_fmru, /*ignoreCase:*/Active_fmru_long, /*b:*/Active_bmru, /*ignoreLeadingBlanks:*/Active_bmru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mmru, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mmru_long, /*n:*/SortOptionSet_bdfmnru.Active_mnru, /*numericSort:*/SortOptionSet_bdfmnru.Active_mnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbdfmru.Active_Vmru, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vmru_long,
            true,
		/*active:*/SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #merge m}, {@link #reverse r}, {@link #unique u}.
     */
    Active_mru_long(
		/*d:*/Active_dmru, /*dictionaryOrder:*/Active_dmru_long, /*g:*/SortOptionSet_bdfgmru.Active_gmru, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_gmru_long, /*h:*/SortOptionSet_bdfhmru.Active_hmru, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_hmru_long, /*f:*/Active_fmru, /*ignoreCase:*/Active_fmru_long, /*b:*/Active_bmru, /*ignoreLeadingBlanks:*/Active_bmru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mmru, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mmru_long, /*n:*/SortOptionSet_bdfmnru.Active_mnru, /*numericSort:*/SortOptionSet_bdfmnru.Active_mnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbdfmru.Active_Vmru, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vmru_long,
            false,
		/*active:*/SortOption.merge, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #merge m}.
     */
    Active_bdm(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bdfgmru.Active_bdgm, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_bdgm_long, /*h:*/SortOptionSet_bdfhmru.Active_bdhm, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_bdhm_long, /*f:*/Active_bdfm, /*ignoreCase:*/Active_bdfm_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mbdm, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mbdm_long, /*n:*/SortOptionSet_bdfmnru.Active_bdmn, /*numericSort:*/SortOptionSet_bdfmnru.Active_bdmn_long, /*r:*/Active_bdmr, /*reverse:*/Active_bdmr_long, /*u:*/Active_bdmu, /*unique:*/Active_bdmu_long, /*V:*/SortOptionSet_Vbdfmru.Active_Vbdm, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vbdm_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #merge m}.
     */
    Active_bdm_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bdfgmru.Active_bdgm, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_bdgm_long, /*h:*/SortOptionSet_bdfhmru.Active_bdhm, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_bdhm_long, /*f:*/Active_bdfm, /*ignoreCase:*/Active_bdfm_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mbdm, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mbdm_long, /*n:*/SortOptionSet_bdfmnru.Active_bdmn, /*numericSort:*/SortOptionSet_bdfmnru.Active_bdmn_long, /*r:*/Active_bdmr, /*reverse:*/Active_bdmr_long, /*u:*/Active_bdmu, /*unique:*/Active_bdmu_long, /*V:*/SortOptionSet_Vbdfmru.Active_Vbdm, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vbdm_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}.
     */
    Active_bfm(
		/*d:*/Active_bdfm, /*dictionaryOrder:*/Active_bdfm_long, /*g:*/SortOptionSet_bdfgmru.Active_bfgm, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_bfgm_long, /*h:*/SortOptionSet_bdfhmru.Active_bfhm, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_bfhm_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mbfm, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mbfm_long, /*n:*/SortOptionSet_bdfmnru.Active_bfmn, /*numericSort:*/SortOptionSet_bdfmnru.Active_bfmn_long, /*r:*/Active_bfmr, /*reverse:*/Active_bfmr_long, /*u:*/Active_bfmu, /*unique:*/Active_bfmu_long, /*V:*/SortOptionSet_Vbdfmru.Active_Vbfm, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vbfm_long,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}.
     */
    Active_bfm_long(
		/*d:*/Active_bdfm, /*dictionaryOrder:*/Active_bdfm_long, /*g:*/SortOptionSet_bdfgmru.Active_bfgm, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_bfgm_long, /*h:*/SortOptionSet_bdfhmru.Active_bfhm, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_bfhm_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mbfm, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mbfm_long, /*n:*/SortOptionSet_bdfmnru.Active_bfmn, /*numericSort:*/SortOptionSet_bdfmnru.Active_bfmn_long, /*r:*/Active_bfmr, /*reverse:*/Active_bfmr_long, /*u:*/Active_bfmu, /*unique:*/Active_bfmu_long, /*V:*/SortOptionSet_Vbdfmru.Active_Vbfm, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vbfm_long,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}.
     */
    Active_bmr(
		/*d:*/Active_bdmr, /*dictionaryOrder:*/Active_bdmr_long, /*g:*/SortOptionSet_bdfgmru.Active_bgmr, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_bgmr_long, /*h:*/SortOptionSet_bdfhmru.Active_bhmr, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_bhmr_long, /*f:*/Active_bfmr, /*ignoreCase:*/Active_bfmr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mbmr, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mbmr_long, /*n:*/SortOptionSet_bdfmnru.Active_bmnr, /*numericSort:*/SortOptionSet_bdfmnru.Active_bmnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bmru, /*unique:*/Active_bmru_long, /*V:*/SortOptionSet_Vbdfmru.Active_Vbmr, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vbmr_long,
            true,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}.
     */
    Active_bmr_long(
		/*d:*/Active_bdmr, /*dictionaryOrder:*/Active_bdmr_long, /*g:*/SortOptionSet_bdfgmru.Active_bgmr, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_bgmr_long, /*h:*/SortOptionSet_bdfhmru.Active_bhmr, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_bhmr_long, /*f:*/Active_bfmr, /*ignoreCase:*/Active_bfmr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mbmr, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mbmr_long, /*n:*/SortOptionSet_bdfmnru.Active_bmnr, /*numericSort:*/SortOptionSet_bdfmnru.Active_bmnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bmru, /*unique:*/Active_bmru_long, /*V:*/SortOptionSet_Vbdfmru.Active_Vbmr, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vbmr_long,
            false,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #merge m}.
     */
    Active_dfm(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bdfgmru.Active_dfgm, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_dfgm_long, /*h:*/SortOptionSet_bdfhmru.Active_dfhm, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_dfhm_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfm, /*ignoreLeadingBlanks:*/Active_bdfm_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mdfm, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mdfm_long, /*n:*/SortOptionSet_bdfmnru.Active_dfmn, /*numericSort:*/SortOptionSet_bdfmnru.Active_dfmn_long, /*r:*/Active_dfmr, /*reverse:*/Active_dfmr_long, /*u:*/Active_dfmu, /*unique:*/Active_dfmu_long, /*V:*/SortOptionSet_Vbdfmru.Active_Vdfm, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vdfm_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #merge m}.
     */
    Active_dfm_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bdfgmru.Active_dfgm, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_dfgm_long, /*h:*/SortOptionSet_bdfhmru.Active_dfhm, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_dfhm_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfm, /*ignoreLeadingBlanks:*/Active_bdfm_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mdfm, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mdfm_long, /*n:*/SortOptionSet_bdfmnru.Active_dfmn, /*numericSort:*/SortOptionSet_bdfmnru.Active_dfmn_long, /*r:*/Active_dfmr, /*reverse:*/Active_dfmr_long, /*u:*/Active_dfmu, /*unique:*/Active_dfmu_long, /*V:*/SortOptionSet_Vbdfmru.Active_Vdfm, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vdfm_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #merge m}, {@link #reverse r}.
     */
    Active_dmr(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bdfgmru.Active_dgmr, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_dgmr_long, /*h:*/SortOptionSet_bdfhmru.Active_dhmr, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_dhmr_long, /*f:*/Active_dfmr, /*ignoreCase:*/Active_dfmr_long, /*b:*/Active_bdmr, /*ignoreLeadingBlanks:*/Active_bdmr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mdmr, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mdmr_long, /*n:*/SortOptionSet_bdfmnru.Active_dmnr, /*numericSort:*/SortOptionSet_bdfmnru.Active_dmnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_dmru, /*unique:*/Active_dmru_long, /*V:*/SortOptionSet_Vbdfmru.Active_Vdmr, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vdmr_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #merge m}, {@link #reverse r}.
     */
    Active_dmr_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bdfgmru.Active_dgmr, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_dgmr_long, /*h:*/SortOptionSet_bdfhmru.Active_dhmr, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_dhmr_long, /*f:*/Active_dfmr, /*ignoreCase:*/Active_dfmr_long, /*b:*/Active_bdmr, /*ignoreLeadingBlanks:*/Active_bdmr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mdmr, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mdmr_long, /*n:*/SortOptionSet_bdfmnru.Active_dmnr, /*numericSort:*/SortOptionSet_bdfmnru.Active_dmnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_dmru, /*unique:*/Active_dmru_long, /*V:*/SortOptionSet_Vbdfmru.Active_Vdmr, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vdmr_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #merge m}, {@link #reverse r}.
     */
    Active_fmr(
		/*d:*/Active_dfmr, /*dictionaryOrder:*/Active_dfmr_long, /*g:*/SortOptionSet_bdfgmru.Active_fgmr, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_fgmr_long, /*h:*/SortOptionSet_bdfhmru.Active_fhmr, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_fhmr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfmr, /*ignoreLeadingBlanks:*/Active_bfmr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mfmr, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mfmr_long, /*n:*/SortOptionSet_bdfmnru.Active_fmnr, /*numericSort:*/SortOptionSet_bdfmnru.Active_fmnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_fmru, /*unique:*/Active_fmru_long, /*V:*/SortOptionSet_Vbdfmru.Active_Vfmr, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vfmr_long,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #merge m}, {@link #reverse r}.
     */
    Active_fmr_long(
		/*d:*/Active_dfmr, /*dictionaryOrder:*/Active_dfmr_long, /*g:*/SortOptionSet_bdfgmru.Active_fgmr, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_fgmr_long, /*h:*/SortOptionSet_bdfhmru.Active_fhmr, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_fhmr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfmr, /*ignoreLeadingBlanks:*/Active_bfmr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mfmr, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mfmr_long, /*n:*/SortOptionSet_bdfmnru.Active_fmnr, /*numericSort:*/SortOptionSet_bdfmnru.Active_fmnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_fmru, /*unique:*/Active_fmru_long, /*V:*/SortOptionSet_Vbdfmru.Active_Vfmr, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vfmr_long,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #merge m}, {@link #unique u}.
     */
    Active_mu(
		/*d:*/Active_dmu, /*dictionaryOrder:*/Active_dmu_long, /*g:*/SortOptionSet_bdfgmru.Active_gmu, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_gmu_long, /*h:*/SortOptionSet_bdfhmru.Active_hmu, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_hmu_long, /*f:*/Active_fmu, /*ignoreCase:*/Active_fmu_long, /*b:*/Active_bmu, /*ignoreLeadingBlanks:*/Active_bmu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mmu, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mmu_long, /*n:*/SortOptionSet_bdfmnru.Active_mnu, /*numericSort:*/SortOptionSet_bdfmnru.Active_mnu_long, /*r:*/Active_mru, /*reverse:*/Active_mru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbdfmru.Active_Vmu, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vmu_long,
            true,
		/*active:*/SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #merge m}, {@link #unique u}.
     */
    Active_mu_long(
		/*d:*/Active_dmu, /*dictionaryOrder:*/Active_dmu_long, /*g:*/SortOptionSet_bdfgmru.Active_gmu, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_gmu_long, /*h:*/SortOptionSet_bdfhmru.Active_hmu, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_hmu_long, /*f:*/Active_fmu, /*ignoreCase:*/Active_fmu_long, /*b:*/Active_bmu, /*ignoreLeadingBlanks:*/Active_bmu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mmu, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mmu_long, /*n:*/SortOptionSet_bdfmnru.Active_mnu, /*numericSort:*/SortOptionSet_bdfmnru.Active_mnu_long, /*r:*/Active_mru, /*reverse:*/Active_mru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbdfmru.Active_Vmu, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vmu_long,
            false,
		/*active:*/SortOption.merge, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #merge m}.
     */
    Active_bm(
		/*d:*/Active_bdm, /*dictionaryOrder:*/Active_bdm_long, /*g:*/SortOptionSet_bdfgmru.Active_bgm, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_bgm_long, /*h:*/SortOptionSet_bdfhmru.Active_bhm, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_bhm_long, /*f:*/Active_bfm, /*ignoreCase:*/Active_bfm_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mbm, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mbm_long, /*n:*/SortOptionSet_bdfmnru.Active_bmn, /*numericSort:*/SortOptionSet_bdfmnru.Active_bmn_long, /*r:*/Active_bmr, /*reverse:*/Active_bmr_long, /*u:*/Active_bmu, /*unique:*/Active_bmu_long, /*V:*/SortOptionSet_Vbdfmru.Active_Vbm, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vbm_long,
            true,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #merge m}.
     */
    Active_bm_long(
		/*d:*/Active_bdm, /*dictionaryOrder:*/Active_bdm_long, /*g:*/SortOptionSet_bdfgmru.Active_bgm, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_bgm_long, /*h:*/SortOptionSet_bdfhmru.Active_bhm, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_bhm_long, /*f:*/Active_bfm, /*ignoreCase:*/Active_bfm_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mbm, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mbm_long, /*n:*/SortOptionSet_bdfmnru.Active_bmn, /*numericSort:*/SortOptionSet_bdfmnru.Active_bmn_long, /*r:*/Active_bmr, /*reverse:*/Active_bmr_long, /*u:*/Active_bmu, /*unique:*/Active_bmu_long, /*V:*/SortOptionSet_Vbdfmru.Active_Vbm, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vbm_long,
            false,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #merge m}.
     */
    Active_dm(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bdfgmru.Active_dgm, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_dgm_long, /*h:*/SortOptionSet_bdfhmru.Active_dhm, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_dhm_long, /*f:*/Active_dfm, /*ignoreCase:*/Active_dfm_long, /*b:*/Active_bdm, /*ignoreLeadingBlanks:*/Active_bdm_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mdm, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mdm_long, /*n:*/SortOptionSet_bdfmnru.Active_dmn, /*numericSort:*/SortOptionSet_bdfmnru.Active_dmn_long, /*r:*/Active_dmr, /*reverse:*/Active_dmr_long, /*u:*/Active_dmu, /*unique:*/Active_dmu_long, /*V:*/SortOptionSet_Vbdfmru.Active_Vdm, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vdm_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #merge m}.
     */
    Active_dm_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bdfgmru.Active_dgm, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_dgm_long, /*h:*/SortOptionSet_bdfhmru.Active_dhm, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_dhm_long, /*f:*/Active_dfm, /*ignoreCase:*/Active_dfm_long, /*b:*/Active_bdm, /*ignoreLeadingBlanks:*/Active_bdm_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mdm, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mdm_long, /*n:*/SortOptionSet_bdfmnru.Active_dmn, /*numericSort:*/SortOptionSet_bdfmnru.Active_dmn_long, /*r:*/Active_dmr, /*reverse:*/Active_dmr_long, /*u:*/Active_dmu, /*unique:*/Active_dmu_long, /*V:*/SortOptionSet_Vbdfmru.Active_Vdm, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vdm_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #merge m}.
     */
    Active_fm(
		/*d:*/Active_dfm, /*dictionaryOrder:*/Active_dfm_long, /*g:*/SortOptionSet_bdfgmru.Active_fgm, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_fgm_long, /*h:*/SortOptionSet_bdfhmru.Active_fhm, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_fhm_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfm, /*ignoreLeadingBlanks:*/Active_bfm_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mfm, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mfm_long, /*n:*/SortOptionSet_bdfmnru.Active_fmn, /*numericSort:*/SortOptionSet_bdfmnru.Active_fmn_long, /*r:*/Active_fmr, /*reverse:*/Active_fmr_long, /*u:*/Active_fmu, /*unique:*/Active_fmu_long, /*V:*/SortOptionSet_Vbdfmru.Active_Vfm, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vfm_long,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #merge m}.
     */
    Active_fm_long(
		/*d:*/Active_dfm, /*dictionaryOrder:*/Active_dfm_long, /*g:*/SortOptionSet_bdfgmru.Active_fgm, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_fgm_long, /*h:*/SortOptionSet_bdfhmru.Active_fhm, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_fhm_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfm, /*ignoreLeadingBlanks:*/Active_bfm_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mfm, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mfm_long, /*n:*/SortOptionSet_bdfmnru.Active_fmn, /*numericSort:*/SortOptionSet_bdfmnru.Active_fmn_long, /*r:*/Active_fmr, /*reverse:*/Active_fmr_long, /*u:*/Active_fmu, /*unique:*/Active_fmu_long, /*V:*/SortOptionSet_Vbdfmru.Active_Vfm, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vfm_long,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #merge m}, {@link #reverse r}.
     */
    Active_mr(
		/*d:*/Active_dmr, /*dictionaryOrder:*/Active_dmr_long, /*g:*/SortOptionSet_bdfgmru.Active_gmr, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_gmr_long, /*h:*/SortOptionSet_bdfhmru.Active_hmr, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_hmr_long, /*f:*/Active_fmr, /*ignoreCase:*/Active_fmr_long, /*b:*/Active_bmr, /*ignoreLeadingBlanks:*/Active_bmr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mmr, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mmr_long, /*n:*/SortOptionSet_bdfmnru.Active_mnr, /*numericSort:*/SortOptionSet_bdfmnru.Active_mnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_mru, /*unique:*/Active_mru_long, /*V:*/SortOptionSet_Vbdfmru.Active_Vmr, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vmr_long,
            true,
		/*active:*/SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #merge m}, {@link #reverse r}.
     */
    Active_mr_long(
		/*d:*/Active_dmr, /*dictionaryOrder:*/Active_dmr_long, /*g:*/SortOptionSet_bdfgmru.Active_gmr, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_gmr_long, /*h:*/SortOptionSet_bdfhmru.Active_hmr, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_hmr_long, /*f:*/Active_fmr, /*ignoreCase:*/Active_fmr_long, /*b:*/Active_bmr, /*ignoreLeadingBlanks:*/Active_bmr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mmr, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mmr_long, /*n:*/SortOptionSet_bdfmnru.Active_mnr, /*numericSort:*/SortOptionSet_bdfmnru.Active_mnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_mru, /*unique:*/Active_mru_long, /*V:*/SortOptionSet_Vbdfmru.Active_Vmr, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vmr_long,
            false,
		/*active:*/SortOption.merge, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #merge m}.
     */
    Active_m(
		/*d:*/Active_dm, /*dictionaryOrder:*/Active_dm_long, /*g:*/SortOptionSet_bdfgmru.Active_gm, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_gm_long, /*h:*/SortOptionSet_bdfhmru.Active_hm, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_hm_long, /*f:*/Active_fm, /*ignoreCase:*/Active_fm_long, /*b:*/Active_bm, /*ignoreLeadingBlanks:*/Active_bm_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mm, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mm_long, /*n:*/SortOptionSet_bdfmnru.Active_mn, /*numericSort:*/SortOptionSet_bdfmnru.Active_mn_long, /*r:*/Active_mr, /*reverse:*/Active_mr_long, /*u:*/Active_mu, /*unique:*/Active_mu_long, /*V:*/SortOptionSet_Vbdfmru.Active_Vm, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vm_long,
            true,
		/*active:*/SortOption.merge
    ),
    /**
     * Option set with the following active options: {@link #merge m}.
     */
    Active_m_long(
		/*d:*/Active_dm, /*dictionaryOrder:*/Active_dm_long, /*g:*/SortOptionSet_bdfgmru.Active_gm, /*generalNumericSort:*/SortOptionSet_bdfgmru.Active_gm_long, /*h:*/SortOptionSet_bdfhmru.Active_hm, /*humanNumericSort:*/SortOptionSet_bdfhmru.Active_hm_long, /*f:*/Active_fm, /*ignoreCase:*/Active_fm_long, /*b:*/Active_bm, /*ignoreLeadingBlanks:*/Active_bm_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*M:*/SortOptionSet_Mbdfmru.Active_Mm, /*monthSort:*/SortOptionSet_Mbdfmru.Active_Mm_long, /*n:*/SortOptionSet_bdfmnru.Active_mn, /*numericSort:*/SortOptionSet_bdfmnru.Active_mn_long, /*r:*/Active_mr, /*reverse:*/Active_mr_long, /*u:*/Active_mu, /*unique:*/Active_mu_long, /*V:*/SortOptionSet_Vbdfmru.Active_Vm, /*versionSort:*/SortOptionSet_Vbdfmru.Active_Vm_long,
            false,
		/*active:*/SortOption.merge
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
    public final SortOptionSet_MVbdfghmnru d;
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
    public final SortOptionSet_MVbdfghmnru dictionaryOrder;
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
    public final SortOptionSet_MVbdfghmnru f;
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
    public final SortOptionSet_MVbdfghmnru ignoreCase;
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
    public final SortOptionSet_MVbdfghmnru b;
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
    public final SortOptionSet_MVbdfghmnru ignoreLeadingBlanks;
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
    public final SortOptionSet_MVbdfghmnru m;
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
    public final SortOptionSet_MVbdfghmnru merge;
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
    public final SortOptionSet_MVbdfghmnru r;
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
    public final SortOptionSet_MVbdfghmnru reverse;
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
    public final SortOptionSet_MVbdfghmnru u;
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
    public final SortOptionSet_MVbdfghmnru unique;
    /**
     * Option {@code "-V"}: Sort by version name and number. It behaves like a standard sort,
     * except that each sequence of decimal digits is treated numerically
     * as an index/version number.
     * <p>
     * (This option is ignored if a comparator operand is present).
     * <p>
     * The option {@code "-V"} is equivalent to the {@code "--}{@link #versionSort versionSort}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "-V"}. If the option {@code "-V"}
     * is already set, the field {@code V} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final SortOptionSet_Vbdfmru V;
    /**
     * Option {@code "--versionSort"}: Sort by version name and number. It behaves like a standard sort,
     * except that each sequence of decimal digits is treated numerically
     * as an index/version number.
     * <p>
     * (This option is ignored if a comparator operand is present).
     * <p>
     * The option {@code "--versionSort"} is equivalent to the {@code "-}{@link #V V}{@code "} option.
     * <p>
     * Technically speaking, this field points to a set with the options of the
     * current set plus the option {@code "--versionSort"}. If the option {@code "--versionSort"}
     * is already set, the field {@code versionSort} points to the enum constant itself
     * as it already represents the current set of options.
     */
    public final SortOptionSet_Vbdfmru versionSort;
    private final boolean useAcronym;
    private final EnumSet<SortOption> options;
    private SortOptionSet_MVbdfghmnru(
            SortOptionSet_MVbdfghmnru d, SortOptionSet_MVbdfghmnru dictionaryOrder, SortOptionSet_bdfgmru g, SortOptionSet_bdfgmru generalNumericSort, SortOptionSet_bdfhmru h, SortOptionSet_bdfhmru humanNumericSort, SortOptionSet_MVbdfghmnru f, SortOptionSet_MVbdfghmnru ignoreCase, SortOptionSet_MVbdfghmnru b, SortOptionSet_MVbdfghmnru ignoreLeadingBlanks, SortOptionSet_MVbdfghmnru m, SortOptionSet_MVbdfghmnru merge, SortOptionSet_Mbdfmru M, SortOptionSet_Mbdfmru monthSort, SortOptionSet_bdfmnru n, SortOptionSet_bdfmnru numericSort, SortOptionSet_MVbdfghmnru r, SortOptionSet_MVbdfghmnru reverse, SortOptionSet_MVbdfghmnru u, SortOptionSet_MVbdfghmnru unique, SortOptionSet_Vbdfmru V, SortOptionSet_Vbdfmru versionSort,
            boolean useAcronym,
            SortOption... activeOptions
    ) {
        this.d = d == null ? this : d;
        this.dictionaryOrder = dictionaryOrder == null ? this : dictionaryOrder;
        this.g = notNull(g);
        this.generalNumericSort = notNull(generalNumericSort);
        this.h = notNull(h);
        this.humanNumericSort = notNull(humanNumericSort);
        this.f = f == null ? this : f;
        this.ignoreCase = ignoreCase == null ? this : ignoreCase;
        this.b = b == null ? this : b;
        this.ignoreLeadingBlanks = ignoreLeadingBlanks == null ? this : ignoreLeadingBlanks;
        this.m = m == null ? this : m;
        this.merge = merge == null ? this : merge;
        this.M = notNull(M);
        this.monthSort = notNull(monthSort);
        this.n = notNull(n);
        this.numericSort = notNull(numericSort);
        this.r = r == null ? this : r;
        this.reverse = reverse == null ? this : reverse;
        this.u = u == null ? this : u;
        this.unique = unique == null ? this : unique;
        this.V = notNull(V);
        this.versionSort = notNull(versionSort);
        this.useAcronym = useAcronym;
        this.options = activeOptions.length == 0 ? EnumSet.noneOf(SortOption.class) : EnumSet.copyOf(Arrays.asList(activeOptions));
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
     *    SortOptionSet_MVbdfghmnru.dictionaryOrder.g;
     * </pre>
     * uses acronyms, that is, this method always returns true for the above
     * set.
     * <p>
     * On the other hand, long option names are used and this method always
     * returns false for the set
     * <pre>
     *    SortOptionSet_MVbdfghmnru.d.generalNumericSort;
     * </pre>
     * <p>
     * Note that a repeated option is <i>not</i> treated as the last set option.
     * For instance, the first and last option of the following set are
     * equivalent and acronyms are used:
     * <pre>
     *    SortOptionSet_MVbdfghmnru.d.g.dictionaryOrder;
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
