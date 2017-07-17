package org.unix4j.unix.sort;

import org.unix4j.option.Option;
import org.unix4j.unix.Sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Option sets for the {@link Sort sort} command with
 * the following options: {@link #c c}, {@link #d d}, {@link #f f}, {@link #b b}, {@link #m m}, {@link #M M}, {@link #r r}, {@link #u u}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Sort#Options} should be used instead to specify command
 * options. See also {@link org.unix4j.unix.sort.SortOptions} for more information.
 */
public enum SortOptionSet_Mbcdfmru implements SortOptions {
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.
     */
    Active_Mbdfru(
        /*c:*/SortOptionSet_Mbcdfru.Active_Mbcdfru, /*check:*/SortOptionSet_Mbcdfru.Active_Mbcdfru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Mbdfmru.Active_Mbdfmru, /*merge:*/SortOptionSet_Mbdfmru.Active_Mbdfmru_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.
     */
    Active_Mbdfru_long(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mbcdfru, /*check:*/SortOptionSet_Mbcdfru.Active_Mbcdfru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Mbdfmru.Active_Mbdfmru, /*merge:*/SortOptionSet_Mbdfmru.Active_Mbdfmru_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #unique u}.
     */
    Active_Mbdfu(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mbcdfu, /*check:*/SortOptionSet_Mbcdfru.Active_Mbcdfu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Mbdfmru.Active_Mbdfmu, /*merge:*/SortOptionSet_Mbdfmru.Active_Mbdfmu_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbdfru, /*reverse:*/Active_Mbdfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #unique u}.
     */
    Active_Mbdfu_long(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mbcdfu, /*check:*/SortOptionSet_Mbcdfru.Active_Mbcdfu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Mbdfmru.Active_Mbdfmu, /*merge:*/SortOptionSet_Mbdfmru.Active_Mbdfmu_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbdfru, /*reverse:*/Active_Mbdfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.
     */
    Active_Mbdru(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mbcdru, /*check:*/SortOptionSet_Mbcdfru.Active_Mbcdru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mbdfru, /*ignoreCase:*/Active_Mbdfru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Mbdfmru.Active_Mbdmru, /*merge:*/SortOptionSet_Mbdfmru.Active_Mbdmru_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.
     */
    Active_Mbdru_long(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mbcdru, /*check:*/SortOptionSet_Mbcdfru.Active_Mbcdru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mbdfru, /*ignoreCase:*/Active_Mbdfru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Mbdfmru.Active_Mbdmru, /*merge:*/SortOptionSet_Mbdfmru.Active_Mbdmru_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.
     */
    Active_Mbfru(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mbcfru, /*check:*/SortOptionSet_Mbcdfru.Active_Mbcfru_long, /*d:*/Active_Mbdfru, /*dictionaryOrder:*/Active_Mbdfru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Mbdfmru.Active_Mbfmru, /*merge:*/SortOptionSet_Mbdfmru.Active_Mbfmru_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.
     */
    Active_Mbfru_long(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mbcfru, /*check:*/SortOptionSet_Mbcdfru.Active_Mbcfru_long, /*d:*/Active_Mbdfru, /*dictionaryOrder:*/Active_Mbdfru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Mbdfmru.Active_Mbfmru, /*merge:*/SortOptionSet_Mbdfmru.Active_Mbfmru_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.
     */
    Active_Mdfru(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mcdfru, /*check:*/SortOptionSet_Mbcdfru.Active_Mcdfru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbdfru, /*ignoreLeadingBlanks:*/Active_Mbdfru_long, /*m:*/SortOptionSet_Mbdfmru.Active_Mdfmru, /*merge:*/SortOptionSet_Mbdfmru.Active_Mdfmru_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.monthSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.
     */
    Active_Mdfru_long(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mcdfru, /*check:*/SortOptionSet_Mbcdfru.Active_Mcdfru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbdfru, /*ignoreLeadingBlanks:*/Active_Mbdfru_long, /*m:*/SortOptionSet_Mbdfmru.Active_Mdfmru, /*merge:*/SortOptionSet_Mbdfmru.Active_Mdfmru_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.monthSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #reverse r}.
     */
    Active_Mbdfr(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mbcdfr, /*check:*/SortOptionSet_Mbcdfru.Active_Mbcdfr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Mbdfmru.Active_Mbdfmr, /*merge:*/SortOptionSet_Mbdfmru.Active_Mbdfmr_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mbdfru, /*unique:*/Active_Mbdfru_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #reverse r}.
     */
    Active_Mbdfr_long(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mbcdfr, /*check:*/SortOptionSet_Mbcdfru.Active_Mbcdfr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Mbdfmru.Active_Mbdfmr, /*merge:*/SortOptionSet_Mbdfmru.Active_Mbdfmr_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mbdfru, /*unique:*/Active_Mbdfru_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #unique u}.
     */
    Active_Mbdu(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mbcdu, /*check:*/SortOptionSet_Mbcdfru.Active_Mbcdu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mbdfu, /*ignoreCase:*/Active_Mbdfu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Mbdfmru.Active_Mbdmu, /*merge:*/SortOptionSet_Mbdfmru.Active_Mbdmu_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbdru, /*reverse:*/Active_Mbdru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #unique u}.
     */
    Active_Mbdu_long(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mbcdu, /*check:*/SortOptionSet_Mbcdfru.Active_Mbcdu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mbdfu, /*ignoreCase:*/Active_Mbdfu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Mbdfmru.Active_Mbdmu, /*merge:*/SortOptionSet_Mbdfmru.Active_Mbdmu_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbdru, /*reverse:*/Active_Mbdru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #unique u}.
     */
    Active_Mbfu(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mbcfu, /*check:*/SortOptionSet_Mbcdfru.Active_Mbcfu_long, /*d:*/Active_Mbdfu, /*dictionaryOrder:*/Active_Mbdfu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Mbdfmru.Active_Mbfmu, /*merge:*/SortOptionSet_Mbdfmru.Active_Mbfmu_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbfru, /*reverse:*/Active_Mbfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #unique u}.
     */
    Active_Mbfu_long(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mbcfu, /*check:*/SortOptionSet_Mbcdfru.Active_Mbcfu_long, /*d:*/Active_Mbdfu, /*dictionaryOrder:*/Active_Mbdfu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Mbdfmru.Active_Mbfmu, /*merge:*/SortOptionSet_Mbdfmru.Active_Mbfmu_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbfru, /*reverse:*/Active_Mbfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.
     */
    Active_Mbru(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mbcru, /*check:*/SortOptionSet_Mbcdfru.Active_Mbcru_long, /*d:*/Active_Mbdru, /*dictionaryOrder:*/Active_Mbdru_long, /*f:*/Active_Mbfru, /*ignoreCase:*/Active_Mbfru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Mbdfmru.Active_Mbmru, /*merge:*/SortOptionSet_Mbdfmru.Active_Mbmru_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.
     */
    Active_Mbru_long(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mbcru, /*check:*/SortOptionSet_Mbcdfru.Active_Mbcru_long, /*d:*/Active_Mbdru, /*dictionaryOrder:*/Active_Mbdru_long, /*f:*/Active_Mbfru, /*ignoreCase:*/Active_Mbfru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Mbdfmru.Active_Mbmru, /*merge:*/SortOptionSet_Mbdfmru.Active_Mbmru_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #monthSort M}, {@link #unique u}.
     */
    Active_Mdfu(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mcdfu, /*check:*/SortOptionSet_Mbcdfru.Active_Mcdfu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbdfu, /*ignoreLeadingBlanks:*/Active_Mbdfu_long, /*m:*/SortOptionSet_Mbdfmru.Active_Mdfmu, /*merge:*/SortOptionSet_Mbdfmru.Active_Mdfmu_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mdfru, /*reverse:*/Active_Mdfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.monthSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #monthSort M}, {@link #unique u}.
     */
    Active_Mdfu_long(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mcdfu, /*check:*/SortOptionSet_Mbcdfru.Active_Mcdfu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbdfu, /*ignoreLeadingBlanks:*/Active_Mbdfu_long, /*m:*/SortOptionSet_Mbdfmru.Active_Mdfmu, /*merge:*/SortOptionSet_Mbdfmru.Active_Mdfmu_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mdfru, /*reverse:*/Active_Mdfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.monthSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.
     */
    Active_Mdru(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mcdru, /*check:*/SortOptionSet_Mbcdfru.Active_Mcdru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mdfru, /*ignoreCase:*/Active_Mdfru_long, /*b:*/Active_Mbdru, /*ignoreLeadingBlanks:*/Active_Mbdru_long, /*m:*/SortOptionSet_Mbdfmru.Active_Mdmru, /*merge:*/SortOptionSet_Mbdfmru.Active_Mdmru_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.monthSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.
     */
    Active_Mdru_long(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mcdru, /*check:*/SortOptionSet_Mbcdfru.Active_Mcdru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mdfru, /*ignoreCase:*/Active_Mdfru_long, /*b:*/Active_Mbdru, /*ignoreLeadingBlanks:*/Active_Mbdru_long, /*m:*/SortOptionSet_Mbdfmru.Active_Mdmru, /*merge:*/SortOptionSet_Mbdfmru.Active_Mdmru_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.monthSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.
     */
    Active_Mfru(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mcfru, /*check:*/SortOptionSet_Mbcdfru.Active_Mcfru_long, /*d:*/Active_Mdfru, /*dictionaryOrder:*/Active_Mdfru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbfru, /*ignoreLeadingBlanks:*/Active_Mbfru_long, /*m:*/SortOptionSet_Mbdfmru.Active_Mfmru, /*merge:*/SortOptionSet_Mbdfmru.Active_Mfmru_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.monthSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.
     */
    Active_Mfru_long(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mcfru, /*check:*/SortOptionSet_Mbcdfru.Active_Mcfru_long, /*d:*/Active_Mdfru, /*dictionaryOrder:*/Active_Mdfru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbfru, /*ignoreLeadingBlanks:*/Active_Mbfru_long, /*m:*/SortOptionSet_Mbdfmru.Active_Mfmru, /*merge:*/SortOptionSet_Mbdfmru.Active_Mfmru_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.monthSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}.
     */
    Active_Mbdf(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mbcdf, /*check:*/SortOptionSet_Mbcdfru.Active_Mbcdf_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Mbdfmru.Active_Mbdfm, /*merge:*/SortOptionSet_Mbdfmru.Active_Mbdfm_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbdfr, /*reverse:*/Active_Mbdfr_long, /*u:*/Active_Mbdfu, /*unique:*/Active_Mbdfu_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.monthSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}.
     */
    Active_Mbdf_long(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mbcdf, /*check:*/SortOptionSet_Mbcdfru.Active_Mbcdf_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Mbdfmru.Active_Mbdfm, /*merge:*/SortOptionSet_Mbdfmru.Active_Mbdfm_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbdfr, /*reverse:*/Active_Mbdfr_long, /*u:*/Active_Mbdfu, /*unique:*/Active_Mbdfu_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.monthSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #reverse r}.
     */
    Active_Mbdr(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mbcdr, /*check:*/SortOptionSet_Mbcdfru.Active_Mbcdr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mbdfr, /*ignoreCase:*/Active_Mbdfr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Mbdfmru.Active_Mbdmr, /*merge:*/SortOptionSet_Mbdfmru.Active_Mbdmr_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mbdru, /*unique:*/Active_Mbdru_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #reverse r}.
     */
    Active_Mbdr_long(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mbcdr, /*check:*/SortOptionSet_Mbcdfru.Active_Mbcdr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mbdfr, /*ignoreCase:*/Active_Mbdfr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Mbdfmru.Active_Mbdmr, /*merge:*/SortOptionSet_Mbdfmru.Active_Mbdmr_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mbdru, /*unique:*/Active_Mbdru_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #reverse r}.
     */
    Active_Mbfr(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mbcfr, /*check:*/SortOptionSet_Mbcdfru.Active_Mbcfr_long, /*d:*/Active_Mbdfr, /*dictionaryOrder:*/Active_Mbdfr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Mbdfmru.Active_Mbfmr, /*merge:*/SortOptionSet_Mbdfmru.Active_Mbfmr_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mbfru, /*unique:*/Active_Mbfru_long,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #reverse r}.
     */
    Active_Mbfr_long(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mbcfr, /*check:*/SortOptionSet_Mbcdfru.Active_Mbcfr_long, /*d:*/Active_Mbdfr, /*dictionaryOrder:*/Active_Mbdfr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Mbdfmru.Active_Mbfmr, /*merge:*/SortOptionSet_Mbdfmru.Active_Mbfmr_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mbfru, /*unique:*/Active_Mbfru_long,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #monthSort M}, {@link #reverse r}.
     */
    Active_Mdfr(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mcdfr, /*check:*/SortOptionSet_Mbcdfru.Active_Mcdfr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbdfr, /*ignoreLeadingBlanks:*/Active_Mbdfr_long, /*m:*/SortOptionSet_Mbdfmru.Active_Mdfmr, /*merge:*/SortOptionSet_Mbdfmru.Active_Mdfmr_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mdfru, /*unique:*/Active_Mdfru_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.monthSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #monthSort M}, {@link #reverse r}.
     */
    Active_Mdfr_long(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mcdfr, /*check:*/SortOptionSet_Mbcdfru.Active_Mcdfr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbdfr, /*ignoreLeadingBlanks:*/Active_Mbdfr_long, /*m:*/SortOptionSet_Mbdfmru.Active_Mdfmr, /*merge:*/SortOptionSet_Mbdfmru.Active_Mdfmr_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mdfru, /*unique:*/Active_Mdfru_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.monthSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #unique u}.
     */
    Active_Mbu(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mbcu, /*check:*/SortOptionSet_Mbcdfru.Active_Mbcu_long, /*d:*/Active_Mbdu, /*dictionaryOrder:*/Active_Mbdu_long, /*f:*/Active_Mbfu, /*ignoreCase:*/Active_Mbfu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Mbdfmru.Active_Mbmu, /*merge:*/SortOptionSet_Mbdfmru.Active_Mbmu_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbru, /*reverse:*/Active_Mbru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #unique u}.
     */
    Active_Mbu_long(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mbcu, /*check:*/SortOptionSet_Mbcdfru.Active_Mbcu_long, /*d:*/Active_Mbdu, /*dictionaryOrder:*/Active_Mbdu_long, /*f:*/Active_Mbfu, /*ignoreCase:*/Active_Mbfu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Mbdfmru.Active_Mbmu, /*merge:*/SortOptionSet_Mbdfmru.Active_Mbmu_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbru, /*reverse:*/Active_Mbru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #monthSort M}, {@link #unique u}.
     */
    Active_Mdu(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mcdu, /*check:*/SortOptionSet_Mbcdfru.Active_Mcdu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mdfu, /*ignoreCase:*/Active_Mdfu_long, /*b:*/Active_Mbdu, /*ignoreLeadingBlanks:*/Active_Mbdu_long, /*m:*/SortOptionSet_Mbdfmru.Active_Mdmu, /*merge:*/SortOptionSet_Mbdfmru.Active_Mdmu_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mdru, /*reverse:*/Active_Mdru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.monthSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #monthSort M}, {@link #unique u}.
     */
    Active_Mdu_long(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mcdu, /*check:*/SortOptionSet_Mbcdfru.Active_Mcdu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mdfu, /*ignoreCase:*/Active_Mdfu_long, /*b:*/Active_Mbdu, /*ignoreLeadingBlanks:*/Active_Mbdu_long, /*m:*/SortOptionSet_Mbdfmru.Active_Mdmu, /*merge:*/SortOptionSet_Mbdfmru.Active_Mdmu_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mdru, /*reverse:*/Active_Mdru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.monthSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #monthSort M}, {@link #unique u}.
     */
    Active_Mfu(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mcfu, /*check:*/SortOptionSet_Mbcdfru.Active_Mcfu_long, /*d:*/Active_Mdfu, /*dictionaryOrder:*/Active_Mdfu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbfu, /*ignoreLeadingBlanks:*/Active_Mbfu_long, /*m:*/SortOptionSet_Mbdfmru.Active_Mfmu, /*merge:*/SortOptionSet_Mbdfmru.Active_Mfmu_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mfru, /*reverse:*/Active_Mfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.monthSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #monthSort M}, {@link #unique u}.
     */
    Active_Mfu_long(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mcfu, /*check:*/SortOptionSet_Mbcdfru.Active_Mcfu_long, /*d:*/Active_Mdfu, /*dictionaryOrder:*/Active_Mdfu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbfu, /*ignoreLeadingBlanks:*/Active_Mbfu_long, /*m:*/SortOptionSet_Mbdfmru.Active_Mfmu, /*merge:*/SortOptionSet_Mbdfmru.Active_Mfmu_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mfru, /*reverse:*/Active_Mfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.monthSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.
     */
    Active_Mru(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mcru, /*check:*/SortOptionSet_Mbcdfru.Active_Mcru_long, /*d:*/Active_Mdru, /*dictionaryOrder:*/Active_Mdru_long, /*f:*/Active_Mfru, /*ignoreCase:*/Active_Mfru_long, /*b:*/Active_Mbru, /*ignoreLeadingBlanks:*/Active_Mbru_long, /*m:*/SortOptionSet_Mbdfmru.Active_Mmru, /*merge:*/SortOptionSet_Mbdfmru.Active_Mmru_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.monthSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.
     */
    Active_Mru_long(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mcru, /*check:*/SortOptionSet_Mbcdfru.Active_Mcru_long, /*d:*/Active_Mdru, /*dictionaryOrder:*/Active_Mdru_long, /*f:*/Active_Mfru, /*ignoreCase:*/Active_Mfru_long, /*b:*/Active_Mbru, /*ignoreLeadingBlanks:*/Active_Mbru_long, /*m:*/SortOptionSet_Mbdfmru.Active_Mmru, /*merge:*/SortOptionSet_Mbdfmru.Active_Mmru_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.monthSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}.
     */
    Active_Mbd(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mbcd, /*check:*/SortOptionSet_Mbcdfru.Active_Mbcd_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mbdf, /*ignoreCase:*/Active_Mbdf_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Mbdfmru.Active_Mbdm, /*merge:*/SortOptionSet_Mbdfmru.Active_Mbdm_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbdr, /*reverse:*/Active_Mbdr_long, /*u:*/Active_Mbdu, /*unique:*/Active_Mbdu_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.monthSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}.
     */
    Active_Mbd_long(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mbcd, /*check:*/SortOptionSet_Mbcdfru.Active_Mbcd_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mbdf, /*ignoreCase:*/Active_Mbdf_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Mbdfmru.Active_Mbdm, /*merge:*/SortOptionSet_Mbdfmru.Active_Mbdm_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbdr, /*reverse:*/Active_Mbdr_long, /*u:*/Active_Mbdu, /*unique:*/Active_Mbdu_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.monthSort
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}.
     */
    Active_Mbf(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mbcf, /*check:*/SortOptionSet_Mbcdfru.Active_Mbcf_long, /*d:*/Active_Mbdf, /*dictionaryOrder:*/Active_Mbdf_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Mbdfmru.Active_Mbfm, /*merge:*/SortOptionSet_Mbdfmru.Active_Mbfm_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbfr, /*reverse:*/Active_Mbfr_long, /*u:*/Active_Mbfu, /*unique:*/Active_Mbfu_long,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.monthSort
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}.
     */
    Active_Mbf_long(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mbcf, /*check:*/SortOptionSet_Mbcdfru.Active_Mbcf_long, /*d:*/Active_Mbdf, /*dictionaryOrder:*/Active_Mbdf_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Mbdfmru.Active_Mbfm, /*merge:*/SortOptionSet_Mbdfmru.Active_Mbfm_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbfr, /*reverse:*/Active_Mbfr_long, /*u:*/Active_Mbfu, /*unique:*/Active_Mbfu_long,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.monthSort
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #reverse r}.
     */
    Active_Mbr(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mbcr, /*check:*/SortOptionSet_Mbcdfru.Active_Mbcr_long, /*d:*/Active_Mbdr, /*dictionaryOrder:*/Active_Mbdr_long, /*f:*/Active_Mbfr, /*ignoreCase:*/Active_Mbfr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Mbdfmru.Active_Mbmr, /*merge:*/SortOptionSet_Mbdfmru.Active_Mbmr_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mbru, /*unique:*/Active_Mbru_long,
            true,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #reverse r}.
     */
    Active_Mbr_long(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mbcr, /*check:*/SortOptionSet_Mbcdfru.Active_Mbcr_long, /*d:*/Active_Mbdr, /*dictionaryOrder:*/Active_Mbdr_long, /*f:*/Active_Mbfr, /*ignoreCase:*/Active_Mbfr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Mbdfmru.Active_Mbmr, /*merge:*/SortOptionSet_Mbdfmru.Active_Mbmr_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mbru, /*unique:*/Active_Mbru_long,
            false,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #monthSort M}.
     */
    Active_Mdf(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mcdf, /*check:*/SortOptionSet_Mbcdfru.Active_Mcdf_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbdf, /*ignoreLeadingBlanks:*/Active_Mbdf_long, /*m:*/SortOptionSet_Mbdfmru.Active_Mdfm, /*merge:*/SortOptionSet_Mbdfmru.Active_Mdfm_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mdfr, /*reverse:*/Active_Mdfr_long, /*u:*/Active_Mdfu, /*unique:*/Active_Mdfu_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.monthSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #monthSort M}.
     */
    Active_Mdf_long(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mcdf, /*check:*/SortOptionSet_Mbcdfru.Active_Mcdf_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbdf, /*ignoreLeadingBlanks:*/Active_Mbdf_long, /*m:*/SortOptionSet_Mbdfmru.Active_Mdfm, /*merge:*/SortOptionSet_Mbdfmru.Active_Mdfm_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mdfr, /*reverse:*/Active_Mdfr_long, /*u:*/Active_Mdfu, /*unique:*/Active_Mdfu_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.monthSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #monthSort M}, {@link #reverse r}.
     */
    Active_Mdr(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mcdr, /*check:*/SortOptionSet_Mbcdfru.Active_Mcdr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mdfr, /*ignoreCase:*/Active_Mdfr_long, /*b:*/Active_Mbdr, /*ignoreLeadingBlanks:*/Active_Mbdr_long, /*m:*/SortOptionSet_Mbdfmru.Active_Mdmr, /*merge:*/SortOptionSet_Mbdfmru.Active_Mdmr_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mdru, /*unique:*/Active_Mdru_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.monthSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #monthSort M}, {@link #reverse r}.
     */
    Active_Mdr_long(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mcdr, /*check:*/SortOptionSet_Mbcdfru.Active_Mcdr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mdfr, /*ignoreCase:*/Active_Mdfr_long, /*b:*/Active_Mbdr, /*ignoreLeadingBlanks:*/Active_Mbdr_long, /*m:*/SortOptionSet_Mbdfmru.Active_Mdmr, /*merge:*/SortOptionSet_Mbdfmru.Active_Mdmr_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mdru, /*unique:*/Active_Mdru_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.monthSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #monthSort M}, {@link #reverse r}.
     */
    Active_Mfr(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mcfr, /*check:*/SortOptionSet_Mbcdfru.Active_Mcfr_long, /*d:*/Active_Mdfr, /*dictionaryOrder:*/Active_Mdfr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbfr, /*ignoreLeadingBlanks:*/Active_Mbfr_long, /*m:*/SortOptionSet_Mbdfmru.Active_Mfmr, /*merge:*/SortOptionSet_Mbdfmru.Active_Mfmr_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mfru, /*unique:*/Active_Mfru_long,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.monthSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #monthSort M}, {@link #reverse r}.
     */
    Active_Mfr_long(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mcfr, /*check:*/SortOptionSet_Mbcdfru.Active_Mcfr_long, /*d:*/Active_Mdfr, /*dictionaryOrder:*/Active_Mdfr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbfr, /*ignoreLeadingBlanks:*/Active_Mbfr_long, /*m:*/SortOptionSet_Mbdfmru.Active_Mfmr, /*merge:*/SortOptionSet_Mbdfmru.Active_Mfmr_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mfru, /*unique:*/Active_Mfru_long,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.monthSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #monthSort M}, {@link #unique u}.
     */
    Active_Mu(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mcu, /*check:*/SortOptionSet_Mbcdfru.Active_Mcu_long, /*d:*/Active_Mdu, /*dictionaryOrder:*/Active_Mdu_long, /*f:*/Active_Mfu, /*ignoreCase:*/Active_Mfu_long, /*b:*/Active_Mbu, /*ignoreLeadingBlanks:*/Active_Mbu_long, /*m:*/SortOptionSet_Mbdfmru.Active_Mmu, /*merge:*/SortOptionSet_Mbdfmru.Active_Mmu_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mru, /*reverse:*/Active_Mru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.monthSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #monthSort M}, {@link #unique u}.
     */
    Active_Mu_long(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mcu, /*check:*/SortOptionSet_Mbcdfru.Active_Mcu_long, /*d:*/Active_Mdu, /*dictionaryOrder:*/Active_Mdu_long, /*f:*/Active_Mfu, /*ignoreCase:*/Active_Mfu_long, /*b:*/Active_Mbu, /*ignoreLeadingBlanks:*/Active_Mbu_long, /*m:*/SortOptionSet_Mbdfmru.Active_Mmu, /*merge:*/SortOptionSet_Mbdfmru.Active_Mmu_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mru, /*reverse:*/Active_Mru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.monthSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #monthSort M}.
     */
    Active_Mb(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mbc, /*check:*/SortOptionSet_Mbcdfru.Active_Mbc_long, /*d:*/Active_Mbd, /*dictionaryOrder:*/Active_Mbd_long, /*f:*/Active_Mbf, /*ignoreCase:*/Active_Mbf_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Mbdfmru.Active_Mbm, /*merge:*/SortOptionSet_Mbdfmru.Active_Mbm_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbr, /*reverse:*/Active_Mbr_long, /*u:*/Active_Mbu, /*unique:*/Active_Mbu_long,
            true,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.monthSort
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #monthSort M}.
     */
    Active_Mb_long(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mbc, /*check:*/SortOptionSet_Mbcdfru.Active_Mbc_long, /*d:*/Active_Mbd, /*dictionaryOrder:*/Active_Mbd_long, /*f:*/Active_Mbf, /*ignoreCase:*/Active_Mbf_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Mbdfmru.Active_Mbm, /*merge:*/SortOptionSet_Mbdfmru.Active_Mbm_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbr, /*reverse:*/Active_Mbr_long, /*u:*/Active_Mbu, /*unique:*/Active_Mbu_long,
            false,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.monthSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #monthSort M}.
     */
    Active_Md(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mcd, /*check:*/SortOptionSet_Mbcdfru.Active_Mcd_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mdf, /*ignoreCase:*/Active_Mdf_long, /*b:*/Active_Mbd, /*ignoreLeadingBlanks:*/Active_Mbd_long, /*m:*/SortOptionSet_Mbdfmru.Active_Mdm, /*merge:*/SortOptionSet_Mbdfmru.Active_Mdm_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mdr, /*reverse:*/Active_Mdr_long, /*u:*/Active_Mdu, /*unique:*/Active_Mdu_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.monthSort
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #monthSort M}.
     */
    Active_Md_long(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mcd, /*check:*/SortOptionSet_Mbcdfru.Active_Mcd_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mdf, /*ignoreCase:*/Active_Mdf_long, /*b:*/Active_Mbd, /*ignoreLeadingBlanks:*/Active_Mbd_long, /*m:*/SortOptionSet_Mbdfmru.Active_Mdm, /*merge:*/SortOptionSet_Mbdfmru.Active_Mdm_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mdr, /*reverse:*/Active_Mdr_long, /*u:*/Active_Mdu, /*unique:*/Active_Mdu_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.monthSort
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #monthSort M}.
     */
    Active_Mf(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mcf, /*check:*/SortOptionSet_Mbcdfru.Active_Mcf_long, /*d:*/Active_Mdf, /*dictionaryOrder:*/Active_Mdf_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbf, /*ignoreLeadingBlanks:*/Active_Mbf_long, /*m:*/SortOptionSet_Mbdfmru.Active_Mfm, /*merge:*/SortOptionSet_Mbdfmru.Active_Mfm_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mfr, /*reverse:*/Active_Mfr_long, /*u:*/Active_Mfu, /*unique:*/Active_Mfu_long,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.monthSort
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #monthSort M}.
     */
    Active_Mf_long(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mcf, /*check:*/SortOptionSet_Mbcdfru.Active_Mcf_long, /*d:*/Active_Mdf, /*dictionaryOrder:*/Active_Mdf_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbf, /*ignoreLeadingBlanks:*/Active_Mbf_long, /*m:*/SortOptionSet_Mbdfmru.Active_Mfm, /*merge:*/SortOptionSet_Mbdfmru.Active_Mfm_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mfr, /*reverse:*/Active_Mfr_long, /*u:*/Active_Mfu, /*unique:*/Active_Mfu_long,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.monthSort
    ),
    /**
     * Option set with the following active options: {@link #monthSort M}, {@link #reverse r}.
     */
    Active_Mr(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mcr, /*check:*/SortOptionSet_Mbcdfru.Active_Mcr_long, /*d:*/Active_Mdr, /*dictionaryOrder:*/Active_Mdr_long, /*f:*/Active_Mfr, /*ignoreCase:*/Active_Mfr_long, /*b:*/Active_Mbr, /*ignoreLeadingBlanks:*/Active_Mbr_long, /*m:*/SortOptionSet_Mbdfmru.Active_Mmr, /*merge:*/SortOptionSet_Mbdfmru.Active_Mmr_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mru, /*unique:*/Active_Mru_long,
            true,
		/*active:*/SortOption.monthSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #monthSort M}, {@link #reverse r}.
     */
    Active_Mr_long(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mcr, /*check:*/SortOptionSet_Mbcdfru.Active_Mcr_long, /*d:*/Active_Mdr, /*dictionaryOrder:*/Active_Mdr_long, /*f:*/Active_Mfr, /*ignoreCase:*/Active_Mfr_long, /*b:*/Active_Mbr, /*ignoreLeadingBlanks:*/Active_Mbr_long, /*m:*/SortOptionSet_Mbdfmru.Active_Mmr, /*merge:*/SortOptionSet_Mbdfmru.Active_Mmr_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mru, /*unique:*/Active_Mru_long,
            false,
		/*active:*/SortOption.monthSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #monthSort M}.
     */
    Active_M(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mc, /*check:*/SortOptionSet_Mbcdfru.Active_Mc_long, /*d:*/Active_Md, /*dictionaryOrder:*/Active_Md_long, /*f:*/Active_Mf, /*ignoreCase:*/Active_Mf_long, /*b:*/Active_Mb, /*ignoreLeadingBlanks:*/Active_Mb_long, /*m:*/SortOptionSet_Mbdfmru.Active_Mm, /*merge:*/SortOptionSet_Mbdfmru.Active_Mm_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mr, /*reverse:*/Active_Mr_long, /*u:*/Active_Mu, /*unique:*/Active_Mu_long,
            true,
		/*active:*/SortOption.monthSort
    ),
    /**
     * Option set with the following active options: {@link #monthSort M}.
     */
    Active_M_long(
		/*c:*/SortOptionSet_Mbcdfru.Active_Mc, /*check:*/SortOptionSet_Mbcdfru.Active_Mc_long, /*d:*/Active_Md, /*dictionaryOrder:*/Active_Md_long, /*f:*/Active_Mf, /*ignoreCase:*/Active_Mf_long, /*b:*/Active_Mb, /*ignoreLeadingBlanks:*/Active_Mb_long, /*m:*/SortOptionSet_Mbdfmru.Active_Mm, /*merge:*/SortOptionSet_Mbdfmru.Active_Mm_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mr, /*reverse:*/Active_Mr_long, /*u:*/Active_Mu, /*unique:*/Active_Mu_long,
            false,
		/*active:*/SortOption.monthSort
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
    public final SortOptionSet_Mbcdfru c;
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
    public final SortOptionSet_Mbcdfru check;
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
    public final SortOptionSet_Mbcdfmru d;
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
    public final SortOptionSet_Mbcdfmru dictionaryOrder;
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
    public final SortOptionSet_Mbcdfmru f;
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
    public final SortOptionSet_Mbcdfmru ignoreCase;
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
    public final SortOptionSet_Mbcdfmru b;
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
    public final SortOptionSet_Mbcdfmru ignoreLeadingBlanks;
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
    public final SortOptionSet_Mbcdfmru M;
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
    public final SortOptionSet_Mbcdfmru monthSort;
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
    public final SortOptionSet_Mbcdfmru r;
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
    public final SortOptionSet_Mbcdfmru reverse;
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
    public final SortOptionSet_Mbcdfmru u;
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
    public final SortOptionSet_Mbcdfmru unique;
    private final boolean useAcronym;
    private final EnumSet<SortOption> options;
    private SortOptionSet_Mbcdfmru(
            SortOptionSet_Mbcdfru c, SortOptionSet_Mbcdfru check, SortOptionSet_Mbcdfmru d, SortOptionSet_Mbcdfmru dictionaryOrder, SortOptionSet_Mbcdfmru f, SortOptionSet_Mbcdfmru ignoreCase, SortOptionSet_Mbcdfmru b, SortOptionSet_Mbcdfmru ignoreLeadingBlanks, SortOptionSet_Mbdfmru m, SortOptionSet_Mbdfmru merge, SortOptionSet_Mbcdfmru M, SortOptionSet_Mbcdfmru monthSort, SortOptionSet_Mbcdfmru r, SortOptionSet_Mbcdfmru reverse, SortOptionSet_Mbcdfmru u, SortOptionSet_Mbcdfmru unique,
            boolean useAcronym,
            SortOption... activeOptions
    ) {
        this.c = notNull(c);
        this.check = notNull(check);
        this.d = d == null ? this : d;
        this.dictionaryOrder = dictionaryOrder == null ? this : dictionaryOrder;
        this.f = f == null ? this : f;
        this.ignoreCase = ignoreCase == null ? this : ignoreCase;
        this.b = b == null ? this : b;
        this.ignoreLeadingBlanks = ignoreLeadingBlanks == null ? this : ignoreLeadingBlanks;
        this.m = notNull(m);
        this.merge = notNull(merge);
        this.M = M == null ? this : M;
        this.monthSort = monthSort == null ? this : monthSort;
        this.r = r == null ? this : r;
        this.reverse = reverse == null ? this : reverse;
        this.u = u == null ? this : u;
        this.unique = unique == null ? this : unique;
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
     *    SortOptionSet_Mbcdfmru.check.d;
     * </pre>
     * uses acronyms, that is, this method always returns true for the above
     * set.
     * <p>
     * On the other hand, long option names are used and this method always
     * returns false for the set
     * <pre>
     *    SortOptionSet_Mbcdfmru.c.dictionaryOrder;
     * </pre>
     * <p>
     * Note that a repeated option is <i>not</i> treated as the last set option.
     * For instance, the first and last option of the following set are
     * equivalent and acronyms are used:
     * <pre>
     *    SortOptionSet_Mbcdfmru.c.d.check;
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
