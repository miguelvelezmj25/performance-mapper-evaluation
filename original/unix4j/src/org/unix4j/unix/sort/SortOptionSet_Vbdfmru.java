package org.unix4j.unix.sort;

import org.unix4j.option.Option;
import org.unix4j.unix.Sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Option sets for the {@link Sort sort} command with
 * the following options: {@link #d d}, {@link #f f}, {@link #b b}, {@link #m m}, {@link #r r}, {@link #u u}, {@link #V V}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Sort#Options} should be used instead to specify command
 * options. See also {@link org.unix4j.unix.sort.SortOptions} for more information.
 */
public enum SortOptionSet_Vbdfmru implements SortOptions {
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vbdfmru(
        /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
        /*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vbdfmru_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vbdfmu(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_Vbdfmru, /*reverse:*/Active_Vbdfmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vbdfmu_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_Vbdfmru, /*reverse:*/Active_Vbdfmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vbdmru(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vbdfmru, /*ignoreCase:*/Active_Vbdfmru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vbdmru_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vbdfmru, /*ignoreCase:*/Active_Vbdfmru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vbfmru(
		/*d:*/Active_Vbdfmru, /*dictionaryOrder:*/Active_Vbdfmru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vbfmru_long(
		/*d:*/Active_Vbdfmru, /*dictionaryOrder:*/Active_Vbdfmru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #merge m}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vdfmru(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbdfmru, /*ignoreLeadingBlanks:*/Active_Vbdfmru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.merge, SortOption.reverse, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #merge m}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vdfmru_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbdfmru, /*ignoreLeadingBlanks:*/Active_Vbdfmru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.merge, SortOption.reverse, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}, {@link #versionSort V}.
     */
    Active_Vbdfmr(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vbdfmru, /*unique:*/Active_Vbdfmru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}, {@link #versionSort V}.
     */
    Active_Vbdfmr_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vbdfmru, /*unique:*/Active_Vbdfmru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vbdmu(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vbdfmu, /*ignoreCase:*/Active_Vbdfmu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_Vbdmru, /*reverse:*/Active_Vbdmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vbdmu_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vbdfmu, /*ignoreCase:*/Active_Vbdfmu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_Vbdmru, /*reverse:*/Active_Vbdmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vbfmu(
		/*d:*/Active_Vbdfmu, /*dictionaryOrder:*/Active_Vbdfmu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_Vbfmru, /*reverse:*/Active_Vbfmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vbfmu_long(
		/*d:*/Active_Vbdfmu, /*dictionaryOrder:*/Active_Vbdfmu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_Vbfmru, /*reverse:*/Active_Vbfmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vbmru(
		/*d:*/Active_Vbdmru, /*dictionaryOrder:*/Active_Vbdmru_long, /*f:*/Active_Vbfmru, /*ignoreCase:*/Active_Vbfmru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vbmru_long(
		/*d:*/Active_Vbdmru, /*dictionaryOrder:*/Active_Vbdmru_long, /*f:*/Active_Vbfmru, /*ignoreCase:*/Active_Vbfmru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #merge m}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vdfmu(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbdfmu, /*ignoreLeadingBlanks:*/Active_Vbdfmu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_Vdfmru, /*reverse:*/Active_Vdfmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.merge, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #merge m}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vdfmu_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbdfmu, /*ignoreLeadingBlanks:*/Active_Vbdfmu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_Vdfmru, /*reverse:*/Active_Vdfmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.merge, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #merge m}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vdmru(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vdfmru, /*ignoreCase:*/Active_Vdfmru_long, /*b:*/Active_Vbdmru, /*ignoreLeadingBlanks:*/Active_Vbdmru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.merge, SortOption.reverse, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #merge m}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vdmru_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vdfmru, /*ignoreCase:*/Active_Vdfmru_long, /*b:*/Active_Vbdmru, /*ignoreLeadingBlanks:*/Active_Vbdmru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.merge, SortOption.reverse, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #merge m}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vfmru(
		/*d:*/Active_Vdfmru, /*dictionaryOrder:*/Active_Vdfmru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbfmru, /*ignoreLeadingBlanks:*/Active_Vbfmru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.merge, SortOption.reverse, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #merge m}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vfmru_long(
		/*d:*/Active_Vdfmru, /*dictionaryOrder:*/Active_Vdfmru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbfmru, /*ignoreLeadingBlanks:*/Active_Vbfmru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.merge, SortOption.reverse, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #versionSort V}.
     */
    Active_Vbdfm(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_Vbdfmr, /*reverse:*/Active_Vbdfmr_long, /*u:*/Active_Vbdfmu, /*unique:*/Active_Vbdfmu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #versionSort V}.
     */
    Active_Vbdfm_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_Vbdfmr, /*reverse:*/Active_Vbdfmr_long, /*u:*/Active_Vbdfmu, /*unique:*/Active_Vbdfmu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}, {@link #versionSort V}.
     */
    Active_Vbdmr(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vbdfmr, /*ignoreCase:*/Active_Vbdfmr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vbdmru, /*unique:*/Active_Vbdmru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}, {@link #versionSort V}.
     */
    Active_Vbdmr_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vbdfmr, /*ignoreCase:*/Active_Vbdfmr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vbdmru, /*unique:*/Active_Vbdmru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}, {@link #versionSort V}.
     */
    Active_Vbfmr(
		/*d:*/Active_Vbdfmr, /*dictionaryOrder:*/Active_Vbdfmr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vbfmru, /*unique:*/Active_Vbfmru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}, {@link #versionSort V}.
     */
    Active_Vbfmr_long(
		/*d:*/Active_Vbdfmr, /*dictionaryOrder:*/Active_Vbdfmr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vbfmru, /*unique:*/Active_Vbfmru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #merge m}, {@link #reverse r}, {@link #versionSort V}.
     */
    Active_Vdfmr(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbdfmr, /*ignoreLeadingBlanks:*/Active_Vbdfmr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vdfmru, /*unique:*/Active_Vdfmru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.merge, SortOption.reverse, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #merge m}, {@link #reverse r}, {@link #versionSort V}.
     */
    Active_Vdfmr_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbdfmr, /*ignoreLeadingBlanks:*/Active_Vbdfmr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vdfmru, /*unique:*/Active_Vdfmru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.merge, SortOption.reverse, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vbmu(
		/*d:*/Active_Vbdmu, /*dictionaryOrder:*/Active_Vbdmu_long, /*f:*/Active_Vbfmu, /*ignoreCase:*/Active_Vbfmu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_Vbmru, /*reverse:*/Active_Vbmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vbmu_long(
		/*d:*/Active_Vbdmu, /*dictionaryOrder:*/Active_Vbdmu_long, /*f:*/Active_Vbfmu, /*ignoreCase:*/Active_Vbfmu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_Vbmru, /*reverse:*/Active_Vbmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #merge m}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vdmu(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vdfmu, /*ignoreCase:*/Active_Vdfmu_long, /*b:*/Active_Vbdmu, /*ignoreLeadingBlanks:*/Active_Vbdmu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_Vdmru, /*reverse:*/Active_Vdmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.merge, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #merge m}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vdmu_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vdfmu, /*ignoreCase:*/Active_Vdfmu_long, /*b:*/Active_Vbdmu, /*ignoreLeadingBlanks:*/Active_Vbdmu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_Vdmru, /*reverse:*/Active_Vdmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.merge, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #merge m}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vfmu(
		/*d:*/Active_Vdfmu, /*dictionaryOrder:*/Active_Vdfmu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbfmu, /*ignoreLeadingBlanks:*/Active_Vbfmu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_Vfmru, /*reverse:*/Active_Vfmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.merge, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #merge m}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vfmu_long(
		/*d:*/Active_Vdfmu, /*dictionaryOrder:*/Active_Vdfmu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbfmu, /*ignoreLeadingBlanks:*/Active_Vbfmu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_Vfmru, /*reverse:*/Active_Vfmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.merge, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #merge m}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vmru(
		/*d:*/Active_Vdmru, /*dictionaryOrder:*/Active_Vdmru_long, /*f:*/Active_Vfmru, /*ignoreCase:*/Active_Vfmru_long, /*b:*/Active_Vbmru, /*ignoreLeadingBlanks:*/Active_Vbmru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.merge, SortOption.reverse, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #merge m}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vmru_long(
		/*d:*/Active_Vdmru, /*dictionaryOrder:*/Active_Vdmru_long, /*f:*/Active_Vfmru, /*ignoreCase:*/Active_Vfmru_long, /*b:*/Active_Vbmru, /*ignoreLeadingBlanks:*/Active_Vbmru_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.merge, SortOption.reverse, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #versionSort V}.
     */
    Active_Vbdm(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vbdfm, /*ignoreCase:*/Active_Vbdfm_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_Vbdmr, /*reverse:*/Active_Vbdmr_long, /*u:*/Active_Vbdmu, /*unique:*/Active_Vbdmu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #versionSort V}.
     */
    Active_Vbdm_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vbdfm, /*ignoreCase:*/Active_Vbdfm_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_Vbdmr, /*reverse:*/Active_Vbdmr_long, /*u:*/Active_Vbdmu, /*unique:*/Active_Vbdmu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #versionSort V}.
     */
    Active_Vbfm(
		/*d:*/Active_Vbdfm, /*dictionaryOrder:*/Active_Vbdfm_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_Vbfmr, /*reverse:*/Active_Vbfmr_long, /*u:*/Active_Vbfmu, /*unique:*/Active_Vbfmu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #versionSort V}.
     */
    Active_Vbfm_long(
		/*d:*/Active_Vbdfm, /*dictionaryOrder:*/Active_Vbdfm_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_Vbfmr, /*reverse:*/Active_Vbfmr_long, /*u:*/Active_Vbfmu, /*unique:*/Active_Vbfmu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}, {@link #versionSort V}.
     */
    Active_Vbmr(
		/*d:*/Active_Vbdmr, /*dictionaryOrder:*/Active_Vbdmr_long, /*f:*/Active_Vbfmr, /*ignoreCase:*/Active_Vbfmr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vbmru, /*unique:*/Active_Vbmru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #reverse r}, {@link #versionSort V}.
     */
    Active_Vbmr_long(
		/*d:*/Active_Vbdmr, /*dictionaryOrder:*/Active_Vbdmr_long, /*f:*/Active_Vbfmr, /*ignoreCase:*/Active_Vbfmr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vbmru, /*unique:*/Active_Vbmru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.reverse, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #merge m}, {@link #versionSort V}.
     */
    Active_Vdfm(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbdfm, /*ignoreLeadingBlanks:*/Active_Vbdfm_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_Vdfmr, /*reverse:*/Active_Vdfmr_long, /*u:*/Active_Vdfmu, /*unique:*/Active_Vdfmu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.merge, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #merge m}, {@link #versionSort V}.
     */
    Active_Vdfm_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbdfm, /*ignoreLeadingBlanks:*/Active_Vbdfm_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_Vdfmr, /*reverse:*/Active_Vdfmr_long, /*u:*/Active_Vdfmu, /*unique:*/Active_Vdfmu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.merge, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #merge m}, {@link #reverse r}, {@link #versionSort V}.
     */
    Active_Vdmr(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vdfmr, /*ignoreCase:*/Active_Vdfmr_long, /*b:*/Active_Vbdmr, /*ignoreLeadingBlanks:*/Active_Vbdmr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vdmru, /*unique:*/Active_Vdmru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.merge, SortOption.reverse, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #merge m}, {@link #reverse r}, {@link #versionSort V}.
     */
    Active_Vdmr_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vdfmr, /*ignoreCase:*/Active_Vdfmr_long, /*b:*/Active_Vbdmr, /*ignoreLeadingBlanks:*/Active_Vbdmr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vdmru, /*unique:*/Active_Vdmru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.merge, SortOption.reverse, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #merge m}, {@link #reverse r}, {@link #versionSort V}.
     */
    Active_Vfmr(
		/*d:*/Active_Vdfmr, /*dictionaryOrder:*/Active_Vdfmr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbfmr, /*ignoreLeadingBlanks:*/Active_Vbfmr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vfmru, /*unique:*/Active_Vfmru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.merge, SortOption.reverse, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #merge m}, {@link #reverse r}, {@link #versionSort V}.
     */
    Active_Vfmr_long(
		/*d:*/Active_Vdfmr, /*dictionaryOrder:*/Active_Vdfmr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbfmr, /*ignoreLeadingBlanks:*/Active_Vbfmr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vfmru, /*unique:*/Active_Vfmru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.merge, SortOption.reverse, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #merge m}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vmu(
		/*d:*/Active_Vdmu, /*dictionaryOrder:*/Active_Vdmu_long, /*f:*/Active_Vfmu, /*ignoreCase:*/Active_Vfmu_long, /*b:*/Active_Vbmu, /*ignoreLeadingBlanks:*/Active_Vbmu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_Vmru, /*reverse:*/Active_Vmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.merge, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #merge m}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vmu_long(
		/*d:*/Active_Vdmu, /*dictionaryOrder:*/Active_Vdmu_long, /*f:*/Active_Vfmu, /*ignoreCase:*/Active_Vfmu_long, /*b:*/Active_Vbmu, /*ignoreLeadingBlanks:*/Active_Vbmu_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_Vmru, /*reverse:*/Active_Vmru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.merge, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #versionSort V}.
     */
    Active_Vbm(
		/*d:*/Active_Vbdm, /*dictionaryOrder:*/Active_Vbdm_long, /*f:*/Active_Vbfm, /*ignoreCase:*/Active_Vbfm_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_Vbmr, /*reverse:*/Active_Vbmr_long, /*u:*/Active_Vbmu, /*unique:*/Active_Vbmu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #merge m}, {@link #versionSort V}.
     */
    Active_Vbm_long(
		/*d:*/Active_Vbdm, /*dictionaryOrder:*/Active_Vbdm_long, /*f:*/Active_Vbfm, /*ignoreCase:*/Active_Vbfm_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_Vbmr, /*reverse:*/Active_Vbmr_long, /*u:*/Active_Vbmu, /*unique:*/Active_Vbmu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.merge, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #merge m}, {@link #versionSort V}.
     */
    Active_Vdm(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vdfm, /*ignoreCase:*/Active_Vdfm_long, /*b:*/Active_Vbdm, /*ignoreLeadingBlanks:*/Active_Vbdm_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_Vdmr, /*reverse:*/Active_Vdmr_long, /*u:*/Active_Vdmu, /*unique:*/Active_Vdmu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.merge, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #merge m}, {@link #versionSort V}.
     */
    Active_Vdm_long(
		/*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vdfm, /*ignoreCase:*/Active_Vdfm_long, /*b:*/Active_Vbdm, /*ignoreLeadingBlanks:*/Active_Vbdm_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_Vdmr, /*reverse:*/Active_Vdmr_long, /*u:*/Active_Vdmu, /*unique:*/Active_Vdmu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.merge, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #merge m}, {@link #versionSort V}.
     */
    Active_Vfm(
		/*d:*/Active_Vdfm, /*dictionaryOrder:*/Active_Vdfm_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbfm, /*ignoreLeadingBlanks:*/Active_Vbfm_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_Vfmr, /*reverse:*/Active_Vfmr_long, /*u:*/Active_Vfmu, /*unique:*/Active_Vfmu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.merge, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #merge m}, {@link #versionSort V}.
     */
    Active_Vfm_long(
		/*d:*/Active_Vdfm, /*dictionaryOrder:*/Active_Vdfm_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbfm, /*ignoreLeadingBlanks:*/Active_Vbfm_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_Vfmr, /*reverse:*/Active_Vfmr_long, /*u:*/Active_Vfmu, /*unique:*/Active_Vfmu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.merge, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #merge m}, {@link #reverse r}, {@link #versionSort V}.
     */
    Active_Vmr(
		/*d:*/Active_Vdmr, /*dictionaryOrder:*/Active_Vdmr_long, /*f:*/Active_Vfmr, /*ignoreCase:*/Active_Vfmr_long, /*b:*/Active_Vbmr, /*ignoreLeadingBlanks:*/Active_Vbmr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vmru, /*unique:*/Active_Vmru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.merge, SortOption.reverse, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #merge m}, {@link #reverse r}, {@link #versionSort V}.
     */
    Active_Vmr_long(
		/*d:*/Active_Vdmr, /*dictionaryOrder:*/Active_Vdmr_long, /*f:*/Active_Vfmr, /*ignoreCase:*/Active_Vfmr_long, /*b:*/Active_Vbmr, /*ignoreLeadingBlanks:*/Active_Vbmr_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vmru, /*unique:*/Active_Vmru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.merge, SortOption.reverse, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #merge m}, {@link #versionSort V}.
     */
    Active_Vm(
		/*d:*/Active_Vdm, /*dictionaryOrder:*/Active_Vdm_long, /*f:*/Active_Vfm, /*ignoreCase:*/Active_Vfm_long, /*b:*/Active_Vbm, /*ignoreLeadingBlanks:*/Active_Vbm_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_Vmr, /*reverse:*/Active_Vmr_long, /*u:*/Active_Vmu, /*unique:*/Active_Vmu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.merge, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #merge m}, {@link #versionSort V}.
     */
    Active_Vm_long(
		/*d:*/Active_Vdm, /*dictionaryOrder:*/Active_Vdm_long, /*f:*/Active_Vfm, /*ignoreCase:*/Active_Vfm_long, /*b:*/Active_Vbm, /*ignoreLeadingBlanks:*/Active_Vbm_long, /*m:*/null /*already set*/, /*merge:*/null /*already set*/, /*r:*/Active_Vmr, /*reverse:*/Active_Vmr_long, /*u:*/Active_Vmu, /*unique:*/Active_Vmu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.merge, SortOption.versionSort
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
    public final SortOptionSet_Vbdfmru d;
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
    public final SortOptionSet_Vbdfmru dictionaryOrder;
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
    public final SortOptionSet_Vbdfmru f;
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
    public final SortOptionSet_Vbdfmru ignoreCase;
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
    public final SortOptionSet_Vbdfmru b;
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
    public final SortOptionSet_Vbdfmru ignoreLeadingBlanks;
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
    public final SortOptionSet_Vbdfmru m;
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
    public final SortOptionSet_Vbdfmru merge;
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
    public final SortOptionSet_Vbdfmru r;
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
    public final SortOptionSet_Vbdfmru reverse;
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
    public final SortOptionSet_Vbdfmru u;
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
    public final SortOptionSet_Vbdfmru unique;
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

    private SortOptionSet_Vbdfmru(
            SortOptionSet_Vbdfmru d, SortOptionSet_Vbdfmru dictionaryOrder, SortOptionSet_Vbdfmru f, SortOptionSet_Vbdfmru ignoreCase, SortOptionSet_Vbdfmru b, SortOptionSet_Vbdfmru ignoreLeadingBlanks, SortOptionSet_Vbdfmru m, SortOptionSet_Vbdfmru merge, SortOptionSet_Vbdfmru r, SortOptionSet_Vbdfmru reverse, SortOptionSet_Vbdfmru u, SortOptionSet_Vbdfmru unique, SortOptionSet_Vbdfmru V, SortOptionSet_Vbdfmru versionSort,
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
        this.r = r == null ? this : r;
        this.reverse = reverse == null ? this : reverse;
        this.u = u == null ? this : u;
        this.unique = unique == null ? this : unique;
        this.V = V == null ? this : V;
        this.versionSort = versionSort == null ? this : versionSort;
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
     *    SortOptionSet_Vbdfmru.dictionaryOrder.f;
     * </pre>
     * uses acronyms, that is, this method always returns true for the above
     * set.
     * <p>
     * On the other hand, long option names are used and this method always
     * returns false for the set
     * <pre>
     *    SortOptionSet_Vbdfmru.d.ignoreCase;
     * </pre>
     * <p>
     * Note that a repeated option is <i>not</i> treated as the last set option.
     * For instance, the first and last option of the following set are
     * equivalent and acronyms are used:
     * <pre>
     *    SortOptionSet_Vbdfmru.d.f.dictionaryOrder;
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
