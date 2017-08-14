package org.unix4j.unix.sort;

import org.unix4j.option.Option;
import org.unix4j.unix.Sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Option sets for the {@link Sort sort} command with
 * the following options: {@link #c c}, {@link #d d}, {@link #g g}, {@link #h h}, {@link #f f}, {@link #b b}, {@link #m m}, {@link #M M}, {@link #n n}, {@link #r r}, {@link #u u}, {@link #V V}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Sort#Options} should be used instead to specify command
 * options. See also {@link org.unix4j.unix.sort.SortOptions} for more information.
 */
public enum SortOptionSet_MVbcdfghmnru implements SortOptions {
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bdfru(
        /*c:*/SortOptionSet_MVbcdfghnru.Active_bcdfru, /*check:*/SortOptionSet_MVbcdfghnru.Active_bcdfru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgmru.Active_bdfgru, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_bdfgru_long, /*h:*/SortOptionSet_bcdfhmru.Active_bdfhru, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_bdfhru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_MVbdfghmnru.Active_bdfmru, /*merge:*/SortOptionSet_MVbdfghmnru.Active_bdfmru_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mbdfru, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mbdfru_long, /*n:*/SortOptionSet_bcdfmnru.Active_bdfnru, /*numericSort:*/SortOptionSet_bcdfmnru.Active_bdfnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfmru.Active_Vbdfru, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vbdfru_long,
            true,
        /*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bdfru_long(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_bcdfru, /*check:*/SortOptionSet_MVbcdfghnru.Active_bcdfru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgmru.Active_bdfgru, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_bdfgru_long, /*h:*/SortOptionSet_bcdfhmru.Active_bdfhru, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_bdfhru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_MVbdfghmnru.Active_bdfmru, /*merge:*/SortOptionSet_MVbdfghmnru.Active_bdfmru_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mbdfru, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mbdfru_long, /*n:*/SortOptionSet_bcdfmnru.Active_bdfnru, /*numericSort:*/SortOptionSet_bcdfmnru.Active_bdfnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfmru.Active_Vbdfru, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vbdfru_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.
     */
    Active_bdfu(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_bcdfu, /*check:*/SortOptionSet_MVbcdfghnru.Active_bcdfu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgmru.Active_bdfgu, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_bdfgu_long, /*h:*/SortOptionSet_bcdfhmru.Active_bdfhu, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_bdfhu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_MVbdfghmnru.Active_bdfmu, /*merge:*/SortOptionSet_MVbdfghmnru.Active_bdfmu_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mbdfu, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mbdfu_long, /*n:*/SortOptionSet_bcdfmnru.Active_bdfnu, /*numericSort:*/SortOptionSet_bcdfmnru.Active_bdfnu_long, /*r:*/Active_bdfru, /*reverse:*/Active_bdfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfmru.Active_Vbdfu, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vbdfu_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.
     */
    Active_bdfu_long(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_bcdfu, /*check:*/SortOptionSet_MVbcdfghnru.Active_bcdfu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgmru.Active_bdfgu, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_bdfgu_long, /*h:*/SortOptionSet_bcdfhmru.Active_bdfhu, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_bdfhu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_MVbdfghmnru.Active_bdfmu, /*merge:*/SortOptionSet_MVbdfghmnru.Active_bdfmu_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mbdfu, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mbdfu_long, /*n:*/SortOptionSet_bcdfmnru.Active_bdfnu, /*numericSort:*/SortOptionSet_bcdfmnru.Active_bdfnu_long, /*r:*/Active_bdfru, /*reverse:*/Active_bdfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfmru.Active_Vbdfu, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vbdfu_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bdru(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_bcdru, /*check:*/SortOptionSet_MVbcdfghnru.Active_bcdru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgmru.Active_bdgru, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_bdgru_long, /*h:*/SortOptionSet_bcdfhmru.Active_bdhru, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_bdhru_long, /*f:*/Active_bdfru, /*ignoreCase:*/Active_bdfru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_MVbdfghmnru.Active_bdmru, /*merge:*/SortOptionSet_MVbdfghmnru.Active_bdmru_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mbdru, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mbdru_long, /*n:*/SortOptionSet_bcdfmnru.Active_bdnru, /*numericSort:*/SortOptionSet_bcdfmnru.Active_bdnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfmru.Active_Vbdru, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vbdru_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bdru_long(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_bcdru, /*check:*/SortOptionSet_MVbcdfghnru.Active_bcdru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgmru.Active_bdgru, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_bdgru_long, /*h:*/SortOptionSet_bcdfhmru.Active_bdhru, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_bdhru_long, /*f:*/Active_bdfru, /*ignoreCase:*/Active_bdfru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_MVbdfghmnru.Active_bdmru, /*merge:*/SortOptionSet_MVbdfghmnru.Active_bdmru_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mbdru, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mbdru_long, /*n:*/SortOptionSet_bcdfmnru.Active_bdnru, /*numericSort:*/SortOptionSet_bcdfmnru.Active_bdnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfmru.Active_Vbdru, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vbdru_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bfru(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_bcfru, /*check:*/SortOptionSet_MVbcdfghnru.Active_bcfru_long, /*d:*/Active_bdfru, /*dictionaryOrder:*/Active_bdfru_long, /*g:*/SortOptionSet_bcdfgmru.Active_bfgru, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_bfgru_long, /*h:*/SortOptionSet_bcdfhmru.Active_bfhru, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_bfhru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_MVbdfghmnru.Active_bfmru, /*merge:*/SortOptionSet_MVbdfghmnru.Active_bfmru_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mbfru, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mbfru_long, /*n:*/SortOptionSet_bcdfmnru.Active_bfnru, /*numericSort:*/SortOptionSet_bcdfmnru.Active_bfnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfmru.Active_Vbfru, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vbfru_long,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bfru_long(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_bcfru, /*check:*/SortOptionSet_MVbcdfghnru.Active_bcfru_long, /*d:*/Active_bdfru, /*dictionaryOrder:*/Active_bdfru_long, /*g:*/SortOptionSet_bcdfgmru.Active_bfgru, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_bfgru_long, /*h:*/SortOptionSet_bcdfhmru.Active_bfhru, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_bfhru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_MVbdfghmnru.Active_bfmru, /*merge:*/SortOptionSet_MVbdfghmnru.Active_bfmru_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mbfru, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mbfru_long, /*n:*/SortOptionSet_bcdfmnru.Active_bfnru, /*numericSort:*/SortOptionSet_bcdfmnru.Active_bfnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfmru.Active_Vbfru, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vbfru_long,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #reverse r}, {@link #unique u}.
     */
    Active_dfru(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_cdfru, /*check:*/SortOptionSet_MVbcdfghnru.Active_cdfru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgmru.Active_dfgru, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_dfgru_long, /*h:*/SortOptionSet_bcdfhmru.Active_dfhru, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_dfhru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfru, /*ignoreLeadingBlanks:*/Active_bdfru_long, /*m:*/SortOptionSet_MVbdfghmnru.Active_dfmru, /*merge:*/SortOptionSet_MVbdfghmnru.Active_dfmru_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mdfru, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mdfru_long, /*n:*/SortOptionSet_bcdfmnru.Active_dfnru, /*numericSort:*/SortOptionSet_bcdfmnru.Active_dfnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfmru.Active_Vdfru, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vdfru_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #reverse r}, {@link #unique u}.
     */
    Active_dfru_long(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_cdfru, /*check:*/SortOptionSet_MVbcdfghnru.Active_cdfru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgmru.Active_dfgru, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_dfgru_long, /*h:*/SortOptionSet_bcdfhmru.Active_dfhru, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_dfhru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfru, /*ignoreLeadingBlanks:*/Active_bdfru_long, /*m:*/SortOptionSet_MVbdfghmnru.Active_dfmru, /*merge:*/SortOptionSet_MVbdfghmnru.Active_dfmru_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mdfru, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mdfru_long, /*n:*/SortOptionSet_bcdfmnru.Active_dfnru, /*numericSort:*/SortOptionSet_bcdfmnru.Active_dfnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfmru.Active_Vdfru, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vdfru_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.
     */
    Active_bdfr(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_bcdfr, /*check:*/SortOptionSet_MVbcdfghnru.Active_bcdfr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgmru.Active_bdfgr, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_bdfgr_long, /*h:*/SortOptionSet_bcdfhmru.Active_bdfhr, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_bdfhr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_MVbdfghmnru.Active_bdfmr, /*merge:*/SortOptionSet_MVbdfghmnru.Active_bdfmr_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mbdfr, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mbdfr_long, /*n:*/SortOptionSet_bcdfmnru.Active_bdfnr, /*numericSort:*/SortOptionSet_bcdfmnru.Active_bdfnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bdfru, /*unique:*/Active_bdfru_long, /*V:*/SortOptionSet_Vbcdfmru.Active_Vbdfr, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vbdfr_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.
     */
    Active_bdfr_long(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_bcdfr, /*check:*/SortOptionSet_MVbcdfghnru.Active_bcdfr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgmru.Active_bdfgr, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_bdfgr_long, /*h:*/SortOptionSet_bcdfhmru.Active_bdfhr, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_bdfhr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_MVbdfghmnru.Active_bdfmr, /*merge:*/SortOptionSet_MVbdfghmnru.Active_bdfmr_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mbdfr, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mbdfr_long, /*n:*/SortOptionSet_bcdfmnru.Active_bdfnr, /*numericSort:*/SortOptionSet_bcdfmnru.Active_bdfnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bdfru, /*unique:*/Active_bdfru_long, /*V:*/SortOptionSet_Vbcdfmru.Active_Vbdfr, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vbdfr_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.
     */
    Active_bdu(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_bcdu, /*check:*/SortOptionSet_MVbcdfghnru.Active_bcdu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgmru.Active_bdgu, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_bdgu_long, /*h:*/SortOptionSet_bcdfhmru.Active_bdhu, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_bdhu_long, /*f:*/Active_bdfu, /*ignoreCase:*/Active_bdfu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_MVbdfghmnru.Active_bdmu, /*merge:*/SortOptionSet_MVbdfghmnru.Active_bdmu_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mbdu, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mbdu_long, /*n:*/SortOptionSet_bcdfmnru.Active_bdnu, /*numericSort:*/SortOptionSet_bcdfmnru.Active_bdnu_long, /*r:*/Active_bdru, /*reverse:*/Active_bdru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfmru.Active_Vbdu, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vbdu_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.
     */
    Active_bdu_long(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_bcdu, /*check:*/SortOptionSet_MVbcdfghnru.Active_bcdu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgmru.Active_bdgu, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_bdgu_long, /*h:*/SortOptionSet_bcdfhmru.Active_bdhu, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_bdhu_long, /*f:*/Active_bdfu, /*ignoreCase:*/Active_bdfu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_MVbdfghmnru.Active_bdmu, /*merge:*/SortOptionSet_MVbdfghmnru.Active_bdmu_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mbdu, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mbdu_long, /*n:*/SortOptionSet_bcdfmnru.Active_bdnu, /*numericSort:*/SortOptionSet_bcdfmnru.Active_bdnu_long, /*r:*/Active_bdru, /*reverse:*/Active_bdru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfmru.Active_Vbdu, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vbdu_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.
     */
    Active_bfu(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_bcfu, /*check:*/SortOptionSet_MVbcdfghnru.Active_bcfu_long, /*d:*/Active_bdfu, /*dictionaryOrder:*/Active_bdfu_long, /*g:*/SortOptionSet_bcdfgmru.Active_bfgu, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_bfgu_long, /*h:*/SortOptionSet_bcdfhmru.Active_bfhu, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_bfhu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_MVbdfghmnru.Active_bfmu, /*merge:*/SortOptionSet_MVbdfghmnru.Active_bfmu_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mbfu, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mbfu_long, /*n:*/SortOptionSet_bcdfmnru.Active_bfnu, /*numericSort:*/SortOptionSet_bcdfmnru.Active_bfnu_long, /*r:*/Active_bfru, /*reverse:*/Active_bfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfmru.Active_Vbfu, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vbfu_long,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.
     */
    Active_bfu_long(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_bcfu, /*check:*/SortOptionSet_MVbcdfghnru.Active_bcfu_long, /*d:*/Active_bdfu, /*dictionaryOrder:*/Active_bdfu_long, /*g:*/SortOptionSet_bcdfgmru.Active_bfgu, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_bfgu_long, /*h:*/SortOptionSet_bcdfhmru.Active_bfhu, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_bfhu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_MVbdfghmnru.Active_bfmu, /*merge:*/SortOptionSet_MVbdfghmnru.Active_bfmu_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mbfu, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mbfu_long, /*n:*/SortOptionSet_bcdfmnru.Active_bfnu, /*numericSort:*/SortOptionSet_bcdfmnru.Active_bfnu_long, /*r:*/Active_bfru, /*reverse:*/Active_bfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfmru.Active_Vbfu, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vbfu_long,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bru(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_bcru, /*check:*/SortOptionSet_MVbcdfghnru.Active_bcru_long, /*d:*/Active_bdru, /*dictionaryOrder:*/Active_bdru_long, /*g:*/SortOptionSet_bcdfgmru.Active_bgru, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_bgru_long, /*h:*/SortOptionSet_bcdfhmru.Active_bhru, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_bhru_long, /*f:*/Active_bfru, /*ignoreCase:*/Active_bfru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_MVbdfghmnru.Active_bmru, /*merge:*/SortOptionSet_MVbdfghmnru.Active_bmru_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mbru, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mbru_long, /*n:*/SortOptionSet_bcdfmnru.Active_bnru, /*numericSort:*/SortOptionSet_bcdfmnru.Active_bnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfmru.Active_Vbru, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vbru_long,
            true,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bru_long(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_bcru, /*check:*/SortOptionSet_MVbcdfghnru.Active_bcru_long, /*d:*/Active_bdru, /*dictionaryOrder:*/Active_bdru_long, /*g:*/SortOptionSet_bcdfgmru.Active_bgru, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_bgru_long, /*h:*/SortOptionSet_bcdfhmru.Active_bhru, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_bhru_long, /*f:*/Active_bfru, /*ignoreCase:*/Active_bfru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_MVbdfghmnru.Active_bmru, /*merge:*/SortOptionSet_MVbdfghmnru.Active_bmru_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mbru, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mbru_long, /*n:*/SortOptionSet_bcdfmnru.Active_bnru, /*numericSort:*/SortOptionSet_bcdfmnru.Active_bnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfmru.Active_Vbru, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vbru_long,
            false,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #unique u}.
     */
    Active_dfu(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_cdfu, /*check:*/SortOptionSet_MVbcdfghnru.Active_cdfu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgmru.Active_dfgu, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_dfgu_long, /*h:*/SortOptionSet_bcdfhmru.Active_dfhu, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_dfhu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfu, /*ignoreLeadingBlanks:*/Active_bdfu_long, /*m:*/SortOptionSet_MVbdfghmnru.Active_dfmu, /*merge:*/SortOptionSet_MVbdfghmnru.Active_dfmu_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mdfu, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mdfu_long, /*n:*/SortOptionSet_bcdfmnru.Active_dfnu, /*numericSort:*/SortOptionSet_bcdfmnru.Active_dfnu_long, /*r:*/Active_dfru, /*reverse:*/Active_dfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfmru.Active_Vdfu, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vdfu_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #unique u}.
     */
    Active_dfu_long(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_cdfu, /*check:*/SortOptionSet_MVbcdfghnru.Active_cdfu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgmru.Active_dfgu, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_dfgu_long, /*h:*/SortOptionSet_bcdfhmru.Active_dfhu, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_dfhu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfu, /*ignoreLeadingBlanks:*/Active_bdfu_long, /*m:*/SortOptionSet_MVbdfghmnru.Active_dfmu, /*merge:*/SortOptionSet_MVbdfghmnru.Active_dfmu_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mdfu, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mdfu_long, /*n:*/SortOptionSet_bcdfmnru.Active_dfnu, /*numericSort:*/SortOptionSet_bcdfmnru.Active_dfnu_long, /*r:*/Active_dfru, /*reverse:*/Active_dfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfmru.Active_Vdfu, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vdfu_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #reverse r}, {@link #unique u}.
     */
    Active_dru(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_cdru, /*check:*/SortOptionSet_MVbcdfghnru.Active_cdru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgmru.Active_dgru, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_dgru_long, /*h:*/SortOptionSet_bcdfhmru.Active_dhru, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_dhru_long, /*f:*/Active_dfru, /*ignoreCase:*/Active_dfru_long, /*b:*/Active_bdru, /*ignoreLeadingBlanks:*/Active_bdru_long, /*m:*/SortOptionSet_MVbdfghmnru.Active_dmru, /*merge:*/SortOptionSet_MVbdfghmnru.Active_dmru_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mdru, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mdru_long, /*n:*/SortOptionSet_bcdfmnru.Active_dnru, /*numericSort:*/SortOptionSet_bcdfmnru.Active_dnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfmru.Active_Vdru, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vdru_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #reverse r}, {@link #unique u}.
     */
    Active_dru_long(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_cdru, /*check:*/SortOptionSet_MVbcdfghnru.Active_cdru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgmru.Active_dgru, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_dgru_long, /*h:*/SortOptionSet_bcdfhmru.Active_dhru, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_dhru_long, /*f:*/Active_dfru, /*ignoreCase:*/Active_dfru_long, /*b:*/Active_bdru, /*ignoreLeadingBlanks:*/Active_bdru_long, /*m:*/SortOptionSet_MVbdfghmnru.Active_dmru, /*merge:*/SortOptionSet_MVbdfghmnru.Active_dmru_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mdru, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mdru_long, /*n:*/SortOptionSet_bcdfmnru.Active_dnru, /*numericSort:*/SortOptionSet_bcdfmnru.Active_dnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfmru.Active_Vdru, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vdru_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #reverse r}, {@link #unique u}.
     */
    Active_fru(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_cfru, /*check:*/SortOptionSet_MVbcdfghnru.Active_cfru_long, /*d:*/Active_dfru, /*dictionaryOrder:*/Active_dfru_long, /*g:*/SortOptionSet_bcdfgmru.Active_fgru, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_fgru_long, /*h:*/SortOptionSet_bcdfhmru.Active_fhru, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_fhru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfru, /*ignoreLeadingBlanks:*/Active_bfru_long, /*m:*/SortOptionSet_MVbdfghmnru.Active_fmru, /*merge:*/SortOptionSet_MVbdfghmnru.Active_fmru_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mfru, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mfru_long, /*n:*/SortOptionSet_bcdfmnru.Active_fnru, /*numericSort:*/SortOptionSet_bcdfmnru.Active_fnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfmru.Active_Vfru, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vfru_long,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #reverse r}, {@link #unique u}.
     */
    Active_fru_long(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_cfru, /*check:*/SortOptionSet_MVbcdfghnru.Active_cfru_long, /*d:*/Active_dfru, /*dictionaryOrder:*/Active_dfru_long, /*g:*/SortOptionSet_bcdfgmru.Active_fgru, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_fgru_long, /*h:*/SortOptionSet_bcdfhmru.Active_fhru, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_fhru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfru, /*ignoreLeadingBlanks:*/Active_bfru_long, /*m:*/SortOptionSet_MVbdfghmnru.Active_fmru, /*merge:*/SortOptionSet_MVbdfghmnru.Active_fmru_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mfru, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mfru_long, /*n:*/SortOptionSet_bcdfmnru.Active_fnru, /*numericSort:*/SortOptionSet_bcdfmnru.Active_fnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfmru.Active_Vfru, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vfru_long,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}.
     */
    Active_bdf(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_bcdf, /*check:*/SortOptionSet_MVbcdfghnru.Active_bcdf_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgmru.Active_bdfg, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_bdfg_long, /*h:*/SortOptionSet_bcdfhmru.Active_bdfh, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_bdfh_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_MVbdfghmnru.Active_bdfm, /*merge:*/SortOptionSet_MVbdfghmnru.Active_bdfm_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mbdf, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mbdf_long, /*n:*/SortOptionSet_bcdfmnru.Active_bdfn, /*numericSort:*/SortOptionSet_bcdfmnru.Active_bdfn_long, /*r:*/Active_bdfr, /*reverse:*/Active_bdfr_long, /*u:*/Active_bdfu, /*unique:*/Active_bdfu_long, /*V:*/SortOptionSet_Vbcdfmru.Active_Vbdf, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vbdf_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}.
     */
    Active_bdf_long(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_bcdf, /*check:*/SortOptionSet_MVbcdfghnru.Active_bcdf_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgmru.Active_bdfg, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_bdfg_long, /*h:*/SortOptionSet_bcdfhmru.Active_bdfh, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_bdfh_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_MVbdfghmnru.Active_bdfm, /*merge:*/SortOptionSet_MVbdfghmnru.Active_bdfm_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mbdf, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mbdf_long, /*n:*/SortOptionSet_bcdfmnru.Active_bdfn, /*numericSort:*/SortOptionSet_bcdfmnru.Active_bdfn_long, /*r:*/Active_bdfr, /*reverse:*/Active_bdfr_long, /*u:*/Active_bdfu, /*unique:*/Active_bdfu_long, /*V:*/SortOptionSet_Vbcdfmru.Active_Vbdf, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vbdf_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.
     */
    Active_bdr(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_bcdr, /*check:*/SortOptionSet_MVbcdfghnru.Active_bcdr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgmru.Active_bdgr, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_bdgr_long, /*h:*/SortOptionSet_bcdfhmru.Active_bdhr, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_bdhr_long, /*f:*/Active_bdfr, /*ignoreCase:*/Active_bdfr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_MVbdfghmnru.Active_bdmr, /*merge:*/SortOptionSet_MVbdfghmnru.Active_bdmr_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mbdr, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mbdr_long, /*n:*/SortOptionSet_bcdfmnru.Active_bdnr, /*numericSort:*/SortOptionSet_bcdfmnru.Active_bdnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bdru, /*unique:*/Active_bdru_long, /*V:*/SortOptionSet_Vbcdfmru.Active_Vbdr, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vbdr_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.
     */
    Active_bdr_long(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_bcdr, /*check:*/SortOptionSet_MVbcdfghnru.Active_bcdr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgmru.Active_bdgr, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_bdgr_long, /*h:*/SortOptionSet_bcdfhmru.Active_bdhr, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_bdhr_long, /*f:*/Active_bdfr, /*ignoreCase:*/Active_bdfr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_MVbdfghmnru.Active_bdmr, /*merge:*/SortOptionSet_MVbdfghmnru.Active_bdmr_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mbdr, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mbdr_long, /*n:*/SortOptionSet_bcdfmnru.Active_bdnr, /*numericSort:*/SortOptionSet_bcdfmnru.Active_bdnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bdru, /*unique:*/Active_bdru_long, /*V:*/SortOptionSet_Vbcdfmru.Active_Vbdr, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vbdr_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.
     */
    Active_bfr(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_bcfr, /*check:*/SortOptionSet_MVbcdfghnru.Active_bcfr_long, /*d:*/Active_bdfr, /*dictionaryOrder:*/Active_bdfr_long, /*g:*/SortOptionSet_bcdfgmru.Active_bfgr, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_bfgr_long, /*h:*/SortOptionSet_bcdfhmru.Active_bfhr, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_bfhr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_MVbdfghmnru.Active_bfmr, /*merge:*/SortOptionSet_MVbdfghmnru.Active_bfmr_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mbfr, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mbfr_long, /*n:*/SortOptionSet_bcdfmnru.Active_bfnr, /*numericSort:*/SortOptionSet_bcdfmnru.Active_bfnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bfru, /*unique:*/Active_bfru_long, /*V:*/SortOptionSet_Vbcdfmru.Active_Vbfr, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vbfr_long,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.
     */
    Active_bfr_long(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_bcfr, /*check:*/SortOptionSet_MVbcdfghnru.Active_bcfr_long, /*d:*/Active_bdfr, /*dictionaryOrder:*/Active_bdfr_long, /*g:*/SortOptionSet_bcdfgmru.Active_bfgr, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_bfgr_long, /*h:*/SortOptionSet_bcdfhmru.Active_bfhr, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_bfhr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_MVbdfghmnru.Active_bfmr, /*merge:*/SortOptionSet_MVbdfghmnru.Active_bfmr_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mbfr, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mbfr_long, /*n:*/SortOptionSet_bcdfmnru.Active_bfnr, /*numericSort:*/SortOptionSet_bcdfmnru.Active_bfnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bfru, /*unique:*/Active_bfru_long, /*V:*/SortOptionSet_Vbcdfmru.Active_Vbfr, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vbfr_long,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #reverse r}.
     */
    Active_dfr(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_cdfr, /*check:*/SortOptionSet_MVbcdfghnru.Active_cdfr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgmru.Active_dfgr, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_dfgr_long, /*h:*/SortOptionSet_bcdfhmru.Active_dfhr, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_dfhr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfr, /*ignoreLeadingBlanks:*/Active_bdfr_long, /*m:*/SortOptionSet_MVbdfghmnru.Active_dfmr, /*merge:*/SortOptionSet_MVbdfghmnru.Active_dfmr_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mdfr, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mdfr_long, /*n:*/SortOptionSet_bcdfmnru.Active_dfnr, /*numericSort:*/SortOptionSet_bcdfmnru.Active_dfnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_dfru, /*unique:*/Active_dfru_long, /*V:*/SortOptionSet_Vbcdfmru.Active_Vdfr, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vdfr_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #reverse r}.
     */
    Active_dfr_long(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_cdfr, /*check:*/SortOptionSet_MVbcdfghnru.Active_cdfr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgmru.Active_dfgr, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_dfgr_long, /*h:*/SortOptionSet_bcdfhmru.Active_dfhr, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_dfhr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfr, /*ignoreLeadingBlanks:*/Active_bdfr_long, /*m:*/SortOptionSet_MVbdfghmnru.Active_dfmr, /*merge:*/SortOptionSet_MVbdfghmnru.Active_dfmr_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mdfr, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mdfr_long, /*n:*/SortOptionSet_bcdfmnru.Active_dfnr, /*numericSort:*/SortOptionSet_bcdfmnru.Active_dfnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_dfru, /*unique:*/Active_dfru_long, /*V:*/SortOptionSet_Vbcdfmru.Active_Vdfr, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vdfr_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #unique u}.
     */
    Active_bu(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_bcu, /*check:*/SortOptionSet_MVbcdfghnru.Active_bcu_long, /*d:*/Active_bdu, /*dictionaryOrder:*/Active_bdu_long, /*g:*/SortOptionSet_bcdfgmru.Active_bgu, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_bgu_long, /*h:*/SortOptionSet_bcdfhmru.Active_bhu, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_bhu_long, /*f:*/Active_bfu, /*ignoreCase:*/Active_bfu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_MVbdfghmnru.Active_bmu, /*merge:*/SortOptionSet_MVbdfghmnru.Active_bmu_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mbu, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mbu_long, /*n:*/SortOptionSet_bcdfmnru.Active_bnu, /*numericSort:*/SortOptionSet_bcdfmnru.Active_bnu_long, /*r:*/Active_bru, /*reverse:*/Active_bru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfmru.Active_Vbu, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vbu_long,
            true,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #unique u}.
     */
    Active_bu_long(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_bcu, /*check:*/SortOptionSet_MVbcdfghnru.Active_bcu_long, /*d:*/Active_bdu, /*dictionaryOrder:*/Active_bdu_long, /*g:*/SortOptionSet_bcdfgmru.Active_bgu, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_bgu_long, /*h:*/SortOptionSet_bcdfhmru.Active_bhu, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_bhu_long, /*f:*/Active_bfu, /*ignoreCase:*/Active_bfu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_MVbdfghmnru.Active_bmu, /*merge:*/SortOptionSet_MVbdfghmnru.Active_bmu_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mbu, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mbu_long, /*n:*/SortOptionSet_bcdfmnru.Active_bnu, /*numericSort:*/SortOptionSet_bcdfmnru.Active_bnu_long, /*r:*/Active_bru, /*reverse:*/Active_bru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfmru.Active_Vbu, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vbu_long,
            false,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #unique u}.
     */
    Active_du(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_cdu, /*check:*/SortOptionSet_MVbcdfghnru.Active_cdu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgmru.Active_dgu, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_dgu_long, /*h:*/SortOptionSet_bcdfhmru.Active_dhu, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_dhu_long, /*f:*/Active_dfu, /*ignoreCase:*/Active_dfu_long, /*b:*/Active_bdu, /*ignoreLeadingBlanks:*/Active_bdu_long, /*m:*/SortOptionSet_MVbdfghmnru.Active_dmu, /*merge:*/SortOptionSet_MVbdfghmnru.Active_dmu_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mdu, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mdu_long, /*n:*/SortOptionSet_bcdfmnru.Active_dnu, /*numericSort:*/SortOptionSet_bcdfmnru.Active_dnu_long, /*r:*/Active_dru, /*reverse:*/Active_dru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfmru.Active_Vdu, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vdu_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #unique u}.
     */
    Active_du_long(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_cdu, /*check:*/SortOptionSet_MVbcdfghnru.Active_cdu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgmru.Active_dgu, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_dgu_long, /*h:*/SortOptionSet_bcdfhmru.Active_dhu, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_dhu_long, /*f:*/Active_dfu, /*ignoreCase:*/Active_dfu_long, /*b:*/Active_bdu, /*ignoreLeadingBlanks:*/Active_bdu_long, /*m:*/SortOptionSet_MVbdfghmnru.Active_dmu, /*merge:*/SortOptionSet_MVbdfghmnru.Active_dmu_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mdu, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mdu_long, /*n:*/SortOptionSet_bcdfmnru.Active_dnu, /*numericSort:*/SortOptionSet_bcdfmnru.Active_dnu_long, /*r:*/Active_dru, /*reverse:*/Active_dru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfmru.Active_Vdu, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vdu_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #unique u}.
     */
    Active_fu(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_cfu, /*check:*/SortOptionSet_MVbcdfghnru.Active_cfu_long, /*d:*/Active_dfu, /*dictionaryOrder:*/Active_dfu_long, /*g:*/SortOptionSet_bcdfgmru.Active_fgu, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_fgu_long, /*h:*/SortOptionSet_bcdfhmru.Active_fhu, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_fhu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfu, /*ignoreLeadingBlanks:*/Active_bfu_long, /*m:*/SortOptionSet_MVbdfghmnru.Active_fmu, /*merge:*/SortOptionSet_MVbdfghmnru.Active_fmu_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mfu, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mfu_long, /*n:*/SortOptionSet_bcdfmnru.Active_fnu, /*numericSort:*/SortOptionSet_bcdfmnru.Active_fnu_long, /*r:*/Active_fru, /*reverse:*/Active_fru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfmru.Active_Vfu, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vfu_long,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #unique u}.
     */
    Active_fu_long(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_cfu, /*check:*/SortOptionSet_MVbcdfghnru.Active_cfu_long, /*d:*/Active_dfu, /*dictionaryOrder:*/Active_dfu_long, /*g:*/SortOptionSet_bcdfgmru.Active_fgu, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_fgu_long, /*h:*/SortOptionSet_bcdfhmru.Active_fhu, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_fhu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfu, /*ignoreLeadingBlanks:*/Active_bfu_long, /*m:*/SortOptionSet_MVbdfghmnru.Active_fmu, /*merge:*/SortOptionSet_MVbdfghmnru.Active_fmu_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mfu, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mfu_long, /*n:*/SortOptionSet_bcdfmnru.Active_fnu, /*numericSort:*/SortOptionSet_bcdfmnru.Active_fnu_long, /*r:*/Active_fru, /*reverse:*/Active_fru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfmru.Active_Vfu, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vfu_long,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #reverse r}, {@link #unique u}.
     */
    Active_ru(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_cru, /*check:*/SortOptionSet_MVbcdfghnru.Active_cru_long, /*d:*/Active_dru, /*dictionaryOrder:*/Active_dru_long, /*g:*/SortOptionSet_bcdfgmru.Active_gru, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_gru_long, /*h:*/SortOptionSet_bcdfhmru.Active_hru, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_hru_long, /*f:*/Active_fru, /*ignoreCase:*/Active_fru_long, /*b:*/Active_bru, /*ignoreLeadingBlanks:*/Active_bru_long, /*m:*/SortOptionSet_MVbdfghmnru.Active_mru, /*merge:*/SortOptionSet_MVbdfghmnru.Active_mru_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mru, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mru_long, /*n:*/SortOptionSet_bcdfmnru.Active_nru, /*numericSort:*/SortOptionSet_bcdfmnru.Active_nru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfmru.Active_Vru, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vru_long,
            true,
		/*active:*/SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #reverse r}, {@link #unique u}.
     */
    Active_ru_long(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_cru, /*check:*/SortOptionSet_MVbcdfghnru.Active_cru_long, /*d:*/Active_dru, /*dictionaryOrder:*/Active_dru_long, /*g:*/SortOptionSet_bcdfgmru.Active_gru, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_gru_long, /*h:*/SortOptionSet_bcdfhmru.Active_hru, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_hru_long, /*f:*/Active_fru, /*ignoreCase:*/Active_fru_long, /*b:*/Active_bru, /*ignoreLeadingBlanks:*/Active_bru_long, /*m:*/SortOptionSet_MVbdfghmnru.Active_mru, /*merge:*/SortOptionSet_MVbdfghmnru.Active_mru_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mru, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mru_long, /*n:*/SortOptionSet_bcdfmnru.Active_nru, /*numericSort:*/SortOptionSet_bcdfmnru.Active_nru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfmru.Active_Vru, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vru_long,
            false,
		/*active:*/SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}.
     */
    Active_bd(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_bcd, /*check:*/SortOptionSet_MVbcdfghnru.Active_bcd_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgmru.Active_bdg, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_bdg_long, /*h:*/SortOptionSet_bcdfhmru.Active_bdh, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_bdh_long, /*f:*/Active_bdf, /*ignoreCase:*/Active_bdf_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_MVbdfghmnru.Active_bdm, /*merge:*/SortOptionSet_MVbdfghmnru.Active_bdm_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mbd, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mbd_long, /*n:*/SortOptionSet_bcdfmnru.Active_bdn, /*numericSort:*/SortOptionSet_bcdfmnru.Active_bdn_long, /*r:*/Active_bdr, /*reverse:*/Active_bdr_long, /*u:*/Active_bdu, /*unique:*/Active_bdu_long, /*V:*/SortOptionSet_Vbcdfmru.Active_Vbd, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vbd_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}.
     */
    Active_bd_long(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_bcd, /*check:*/SortOptionSet_MVbcdfghnru.Active_bcd_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgmru.Active_bdg, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_bdg_long, /*h:*/SortOptionSet_bcdfhmru.Active_bdh, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_bdh_long, /*f:*/Active_bdf, /*ignoreCase:*/Active_bdf_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_MVbdfghmnru.Active_bdm, /*merge:*/SortOptionSet_MVbdfghmnru.Active_bdm_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mbd, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mbd_long, /*n:*/SortOptionSet_bcdfmnru.Active_bdn, /*numericSort:*/SortOptionSet_bcdfmnru.Active_bdn_long, /*r:*/Active_bdr, /*reverse:*/Active_bdr_long, /*u:*/Active_bdu, /*unique:*/Active_bdu_long, /*V:*/SortOptionSet_Vbcdfmru.Active_Vbd, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vbd_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}.
     */
    Active_bf(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_bcf, /*check:*/SortOptionSet_MVbcdfghnru.Active_bcf_long, /*d:*/Active_bdf, /*dictionaryOrder:*/Active_bdf_long, /*g:*/SortOptionSet_bcdfgmru.Active_bfg, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_bfg_long, /*h:*/SortOptionSet_bcdfhmru.Active_bfh, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_bfh_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_MVbdfghmnru.Active_bfm, /*merge:*/SortOptionSet_MVbdfghmnru.Active_bfm_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mbf, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mbf_long, /*n:*/SortOptionSet_bcdfmnru.Active_bfn, /*numericSort:*/SortOptionSet_bcdfmnru.Active_bfn_long, /*r:*/Active_bfr, /*reverse:*/Active_bfr_long, /*u:*/Active_bfu, /*unique:*/Active_bfu_long, /*V:*/SortOptionSet_Vbcdfmru.Active_Vbf, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vbf_long,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}.
     */
    Active_bf_long(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_bcf, /*check:*/SortOptionSet_MVbcdfghnru.Active_bcf_long, /*d:*/Active_bdf, /*dictionaryOrder:*/Active_bdf_long, /*g:*/SortOptionSet_bcdfgmru.Active_bfg, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_bfg_long, /*h:*/SortOptionSet_bcdfhmru.Active_bfh, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_bfh_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_MVbdfghmnru.Active_bfm, /*merge:*/SortOptionSet_MVbdfghmnru.Active_bfm_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mbf, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mbf_long, /*n:*/SortOptionSet_bcdfmnru.Active_bfn, /*numericSort:*/SortOptionSet_bcdfmnru.Active_bfn_long, /*r:*/Active_bfr, /*reverse:*/Active_bfr_long, /*u:*/Active_bfu, /*unique:*/Active_bfu_long, /*V:*/SortOptionSet_Vbcdfmru.Active_Vbf, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vbf_long,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #reverse r}.
     */
    Active_br(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_bcr, /*check:*/SortOptionSet_MVbcdfghnru.Active_bcr_long, /*d:*/Active_bdr, /*dictionaryOrder:*/Active_bdr_long, /*g:*/SortOptionSet_bcdfgmru.Active_bgr, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_bgr_long, /*h:*/SortOptionSet_bcdfhmru.Active_bhr, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_bhr_long, /*f:*/Active_bfr, /*ignoreCase:*/Active_bfr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_MVbdfghmnru.Active_bmr, /*merge:*/SortOptionSet_MVbdfghmnru.Active_bmr_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mbr, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mbr_long, /*n:*/SortOptionSet_bcdfmnru.Active_bnr, /*numericSort:*/SortOptionSet_bcdfmnru.Active_bnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bru, /*unique:*/Active_bru_long, /*V:*/SortOptionSet_Vbcdfmru.Active_Vbr, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vbr_long,
            true,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #reverse r}.
     */
    Active_br_long(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_bcr, /*check:*/SortOptionSet_MVbcdfghnru.Active_bcr_long, /*d:*/Active_bdr, /*dictionaryOrder:*/Active_bdr_long, /*g:*/SortOptionSet_bcdfgmru.Active_bgr, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_bgr_long, /*h:*/SortOptionSet_bcdfhmru.Active_bhr, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_bhr_long, /*f:*/Active_bfr, /*ignoreCase:*/Active_bfr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_MVbdfghmnru.Active_bmr, /*merge:*/SortOptionSet_MVbdfghmnru.Active_bmr_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mbr, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mbr_long, /*n:*/SortOptionSet_bcdfmnru.Active_bnr, /*numericSort:*/SortOptionSet_bcdfmnru.Active_bnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bru, /*unique:*/Active_bru_long, /*V:*/SortOptionSet_Vbcdfmru.Active_Vbr, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vbr_long,
            false,
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}.
     */
    Active_df(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_cdf, /*check:*/SortOptionSet_MVbcdfghnru.Active_cdf_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgmru.Active_dfg, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_dfg_long, /*h:*/SortOptionSet_bcdfhmru.Active_dfh, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_dfh_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdf, /*ignoreLeadingBlanks:*/Active_bdf_long, /*m:*/SortOptionSet_MVbdfghmnru.Active_dfm, /*merge:*/SortOptionSet_MVbdfghmnru.Active_dfm_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mdf, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mdf_long, /*n:*/SortOptionSet_bcdfmnru.Active_dfn, /*numericSort:*/SortOptionSet_bcdfmnru.Active_dfn_long, /*r:*/Active_dfr, /*reverse:*/Active_dfr_long, /*u:*/Active_dfu, /*unique:*/Active_dfu_long, /*V:*/SortOptionSet_Vbcdfmru.Active_Vdf, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vdf_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}.
     */
    Active_df_long(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_cdf, /*check:*/SortOptionSet_MVbcdfghnru.Active_cdf_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgmru.Active_dfg, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_dfg_long, /*h:*/SortOptionSet_bcdfhmru.Active_dfh, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_dfh_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdf, /*ignoreLeadingBlanks:*/Active_bdf_long, /*m:*/SortOptionSet_MVbdfghmnru.Active_dfm, /*merge:*/SortOptionSet_MVbdfghmnru.Active_dfm_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mdf, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mdf_long, /*n:*/SortOptionSet_bcdfmnru.Active_dfn, /*numericSort:*/SortOptionSet_bcdfmnru.Active_dfn_long, /*r:*/Active_dfr, /*reverse:*/Active_dfr_long, /*u:*/Active_dfu, /*unique:*/Active_dfu_long, /*V:*/SortOptionSet_Vbcdfmru.Active_Vdf, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vdf_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #reverse r}.
     */
    Active_dr(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_cdr, /*check:*/SortOptionSet_MVbcdfghnru.Active_cdr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgmru.Active_dgr, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_dgr_long, /*h:*/SortOptionSet_bcdfhmru.Active_dhr, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_dhr_long, /*f:*/Active_dfr, /*ignoreCase:*/Active_dfr_long, /*b:*/Active_bdr, /*ignoreLeadingBlanks:*/Active_bdr_long, /*m:*/SortOptionSet_MVbdfghmnru.Active_dmr, /*merge:*/SortOptionSet_MVbdfghmnru.Active_dmr_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mdr, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mdr_long, /*n:*/SortOptionSet_bcdfmnru.Active_dnr, /*numericSort:*/SortOptionSet_bcdfmnru.Active_dnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_dru, /*unique:*/Active_dru_long, /*V:*/SortOptionSet_Vbcdfmru.Active_Vdr, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vdr_long,
            true,
		/*active:*/SortOption.dictionaryOrder, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}, {@link #reverse r}.
     */
    Active_dr_long(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_cdr, /*check:*/SortOptionSet_MVbcdfghnru.Active_cdr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgmru.Active_dgr, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_dgr_long, /*h:*/SortOptionSet_bcdfhmru.Active_dhr, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_dhr_long, /*f:*/Active_dfr, /*ignoreCase:*/Active_dfr_long, /*b:*/Active_bdr, /*ignoreLeadingBlanks:*/Active_bdr_long, /*m:*/SortOptionSet_MVbdfghmnru.Active_dmr, /*merge:*/SortOptionSet_MVbdfghmnru.Active_dmr_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mdr, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mdr_long, /*n:*/SortOptionSet_bcdfmnru.Active_dnr, /*numericSort:*/SortOptionSet_bcdfmnru.Active_dnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_dru, /*unique:*/Active_dru_long, /*V:*/SortOptionSet_Vbcdfmru.Active_Vdr, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vdr_long,
            false,
		/*active:*/SortOption.dictionaryOrder, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #reverse r}.
     */
    Active_fr(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_cfr, /*check:*/SortOptionSet_MVbcdfghnru.Active_cfr_long, /*d:*/Active_dfr, /*dictionaryOrder:*/Active_dfr_long, /*g:*/SortOptionSet_bcdfgmru.Active_fgr, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_fgr_long, /*h:*/SortOptionSet_bcdfhmru.Active_fhr, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_fhr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfr, /*ignoreLeadingBlanks:*/Active_bfr_long, /*m:*/SortOptionSet_MVbdfghmnru.Active_fmr, /*merge:*/SortOptionSet_MVbdfghmnru.Active_fmr_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mfr, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mfr_long, /*n:*/SortOptionSet_bcdfmnru.Active_fnr, /*numericSort:*/SortOptionSet_bcdfmnru.Active_fnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_fru, /*unique:*/Active_fru_long, /*V:*/SortOptionSet_Vbcdfmru.Active_Vfr, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vfr_long,
            true,
		/*active:*/SortOption.ignoreCase, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}, {@link #reverse r}.
     */
    Active_fr_long(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_cfr, /*check:*/SortOptionSet_MVbcdfghnru.Active_cfr_long, /*d:*/Active_dfr, /*dictionaryOrder:*/Active_dfr_long, /*g:*/SortOptionSet_bcdfgmru.Active_fgr, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_fgr_long, /*h:*/SortOptionSet_bcdfhmru.Active_fhr, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_fhr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfr, /*ignoreLeadingBlanks:*/Active_bfr_long, /*m:*/SortOptionSet_MVbdfghmnru.Active_fmr, /*merge:*/SortOptionSet_MVbdfghmnru.Active_fmr_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mfr, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mfr_long, /*n:*/SortOptionSet_bcdfmnru.Active_fnr, /*numericSort:*/SortOptionSet_bcdfmnru.Active_fnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_fru, /*unique:*/Active_fru_long, /*V:*/SortOptionSet_Vbcdfmru.Active_Vfr, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vfr_long,
            false,
		/*active:*/SortOption.ignoreCase, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #unique u}.
     */
    Active_u(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_cu, /*check:*/SortOptionSet_MVbcdfghnru.Active_cu_long, /*d:*/Active_du, /*dictionaryOrder:*/Active_du_long, /*g:*/SortOptionSet_bcdfgmru.Active_gu, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_gu_long, /*h:*/SortOptionSet_bcdfhmru.Active_hu, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_hu_long, /*f:*/Active_fu, /*ignoreCase:*/Active_fu_long, /*b:*/Active_bu, /*ignoreLeadingBlanks:*/Active_bu_long, /*m:*/SortOptionSet_MVbdfghmnru.Active_mu, /*merge:*/SortOptionSet_MVbdfghmnru.Active_mu_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mu, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mu_long, /*n:*/SortOptionSet_bcdfmnru.Active_nu, /*numericSort:*/SortOptionSet_bcdfmnru.Active_nu_long, /*r:*/Active_ru, /*reverse:*/Active_ru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfmru.Active_Vu, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vu_long,
            true,
		/*active:*/SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #unique u}.
     */
    Active_u_long(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_cu, /*check:*/SortOptionSet_MVbcdfghnru.Active_cu_long, /*d:*/Active_du, /*dictionaryOrder:*/Active_du_long, /*g:*/SortOptionSet_bcdfgmru.Active_gu, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_gu_long, /*h:*/SortOptionSet_bcdfhmru.Active_hu, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_hu_long, /*f:*/Active_fu, /*ignoreCase:*/Active_fu_long, /*b:*/Active_bu, /*ignoreLeadingBlanks:*/Active_bu_long, /*m:*/SortOptionSet_MVbdfghmnru.Active_mu, /*merge:*/SortOptionSet_MVbdfghmnru.Active_mu_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mu, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mu_long, /*n:*/SortOptionSet_bcdfmnru.Active_nu, /*numericSort:*/SortOptionSet_bcdfmnru.Active_nu_long, /*r:*/Active_ru, /*reverse:*/Active_ru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfmru.Active_Vu, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vu_long,
            false,
		/*active:*/SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}.
     */
    Active_b(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_bc, /*check:*/SortOptionSet_MVbcdfghnru.Active_bc_long, /*d:*/Active_bd, /*dictionaryOrder:*/Active_bd_long, /*g:*/SortOptionSet_bcdfgmru.Active_bg, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_bg_long, /*h:*/SortOptionSet_bcdfhmru.Active_bh, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_bh_long, /*f:*/Active_bf, /*ignoreCase:*/Active_bf_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_MVbdfghmnru.Active_bm, /*merge:*/SortOptionSet_MVbdfghmnru.Active_bm_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mb, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mb_long, /*n:*/SortOptionSet_bcdfmnru.Active_bn, /*numericSort:*/SortOptionSet_bcdfmnru.Active_bn_long, /*r:*/Active_br, /*reverse:*/Active_br_long, /*u:*/Active_bu, /*unique:*/Active_bu_long, /*V:*/SortOptionSet_Vbcdfmru.Active_Vb, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vb_long,
            true,
		/*active:*/SortOption.ignoreLeadingBlanks
    ),
    /**
     * Option set with the following active options: {@link #ignoreLeadingBlanks b}.
     */
    Active_b_long(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_bc, /*check:*/SortOptionSet_MVbcdfghnru.Active_bc_long, /*d:*/Active_bd, /*dictionaryOrder:*/Active_bd_long, /*g:*/SortOptionSet_bcdfgmru.Active_bg, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_bg_long, /*h:*/SortOptionSet_bcdfhmru.Active_bh, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_bh_long, /*f:*/Active_bf, /*ignoreCase:*/Active_bf_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_MVbdfghmnru.Active_bm, /*merge:*/SortOptionSet_MVbdfghmnru.Active_bm_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mb, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mb_long, /*n:*/SortOptionSet_bcdfmnru.Active_bn, /*numericSort:*/SortOptionSet_bcdfmnru.Active_bn_long, /*r:*/Active_br, /*reverse:*/Active_br_long, /*u:*/Active_bu, /*unique:*/Active_bu_long, /*V:*/SortOptionSet_Vbcdfmru.Active_Vb, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vb_long,
            false,
		/*active:*/SortOption.ignoreLeadingBlanks
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}.
     */
    Active_d(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_cd, /*check:*/SortOptionSet_MVbcdfghnru.Active_cd_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgmru.Active_dg, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_dg_long, /*h:*/SortOptionSet_bcdfhmru.Active_dh, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_dh_long, /*f:*/Active_df, /*ignoreCase:*/Active_df_long, /*b:*/Active_bd, /*ignoreLeadingBlanks:*/Active_bd_long, /*m:*/SortOptionSet_MVbdfghmnru.Active_dm, /*merge:*/SortOptionSet_MVbdfghmnru.Active_dm_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Md, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Md_long, /*n:*/SortOptionSet_bcdfmnru.Active_dn, /*numericSort:*/SortOptionSet_bcdfmnru.Active_dn_long, /*r:*/Active_dr, /*reverse:*/Active_dr_long, /*u:*/Active_du, /*unique:*/Active_du_long, /*V:*/SortOptionSet_Vbcdfmru.Active_Vd, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vd_long,
            true,
		/*active:*/SortOption.dictionaryOrder
    ),
    /**
     * Option set with the following active options: {@link #dictionaryOrder d}.
     */
    Active_d_long(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_cd, /*check:*/SortOptionSet_MVbcdfghnru.Active_cd_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgmru.Active_dg, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_dg_long, /*h:*/SortOptionSet_bcdfhmru.Active_dh, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_dh_long, /*f:*/Active_df, /*ignoreCase:*/Active_df_long, /*b:*/Active_bd, /*ignoreLeadingBlanks:*/Active_bd_long, /*m:*/SortOptionSet_MVbdfghmnru.Active_dm, /*merge:*/SortOptionSet_MVbdfghmnru.Active_dm_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Md, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Md_long, /*n:*/SortOptionSet_bcdfmnru.Active_dn, /*numericSort:*/SortOptionSet_bcdfmnru.Active_dn_long, /*r:*/Active_dr, /*reverse:*/Active_dr_long, /*u:*/Active_du, /*unique:*/Active_du_long, /*V:*/SortOptionSet_Vbcdfmru.Active_Vd, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vd_long,
            false,
		/*active:*/SortOption.dictionaryOrder
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}.
     */
    Active_f(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_cf, /*check:*/SortOptionSet_MVbcdfghnru.Active_cf_long, /*d:*/Active_df, /*dictionaryOrder:*/Active_df_long, /*g:*/SortOptionSet_bcdfgmru.Active_fg, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_fg_long, /*h:*/SortOptionSet_bcdfhmru.Active_fh, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_fh_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bf, /*ignoreLeadingBlanks:*/Active_bf_long, /*m:*/SortOptionSet_MVbdfghmnru.Active_fm, /*merge:*/SortOptionSet_MVbdfghmnru.Active_fm_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mf, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mf_long, /*n:*/SortOptionSet_bcdfmnru.Active_fn, /*numericSort:*/SortOptionSet_bcdfmnru.Active_fn_long, /*r:*/Active_fr, /*reverse:*/Active_fr_long, /*u:*/Active_fu, /*unique:*/Active_fu_long, /*V:*/SortOptionSet_Vbcdfmru.Active_Vf, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vf_long,
            true,
		/*active:*/SortOption.ignoreCase
    ),
    /**
     * Option set with the following active options: {@link #ignoreCase f}.
     */
    Active_f_long(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_cf, /*check:*/SortOptionSet_MVbcdfghnru.Active_cf_long, /*d:*/Active_df, /*dictionaryOrder:*/Active_df_long, /*g:*/SortOptionSet_bcdfgmru.Active_fg, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_fg_long, /*h:*/SortOptionSet_bcdfhmru.Active_fh, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_fh_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bf, /*ignoreLeadingBlanks:*/Active_bf_long, /*m:*/SortOptionSet_MVbdfghmnru.Active_fm, /*merge:*/SortOptionSet_MVbdfghmnru.Active_fm_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mf, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mf_long, /*n:*/SortOptionSet_bcdfmnru.Active_fn, /*numericSort:*/SortOptionSet_bcdfmnru.Active_fn_long, /*r:*/Active_fr, /*reverse:*/Active_fr_long, /*u:*/Active_fu, /*unique:*/Active_fu_long, /*V:*/SortOptionSet_Vbcdfmru.Active_Vf, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vf_long,
            false,
		/*active:*/SortOption.ignoreCase
    ),
    /**
     * Option set with the following active options: {@link #reverse r}.
     */
    Active_r(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_cr, /*check:*/SortOptionSet_MVbcdfghnru.Active_cr_long, /*d:*/Active_dr, /*dictionaryOrder:*/Active_dr_long, /*g:*/SortOptionSet_bcdfgmru.Active_gr, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_gr_long, /*h:*/SortOptionSet_bcdfhmru.Active_hr, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_hr_long, /*f:*/Active_fr, /*ignoreCase:*/Active_fr_long, /*b:*/Active_br, /*ignoreLeadingBlanks:*/Active_br_long, /*m:*/SortOptionSet_MVbdfghmnru.Active_mr, /*merge:*/SortOptionSet_MVbdfghmnru.Active_mr_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mr, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mr_long, /*n:*/SortOptionSet_bcdfmnru.Active_nr, /*numericSort:*/SortOptionSet_bcdfmnru.Active_nr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_ru, /*unique:*/Active_ru_long, /*V:*/SortOptionSet_Vbcdfmru.Active_Vr, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vr_long,
            true,
		/*active:*/SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #reverse r}.
     */
    Active_r_long(
		/*c:*/SortOptionSet_MVbcdfghnru.Active_cr, /*check:*/SortOptionSet_MVbcdfghnru.Active_cr_long, /*d:*/Active_dr, /*dictionaryOrder:*/Active_dr_long, /*g:*/SortOptionSet_bcdfgmru.Active_gr, /*generalNumericSort:*/SortOptionSet_bcdfgmru.Active_gr_long, /*h:*/SortOptionSet_bcdfhmru.Active_hr, /*humanNumericSort:*/SortOptionSet_bcdfhmru.Active_hr_long, /*f:*/Active_fr, /*ignoreCase:*/Active_fr_long, /*b:*/Active_br, /*ignoreLeadingBlanks:*/Active_br_long, /*m:*/SortOptionSet_MVbdfghmnru.Active_mr, /*merge:*/SortOptionSet_MVbdfghmnru.Active_mr_long, /*M:*/SortOptionSet_Mbcdfmru.Active_Mr, /*monthSort:*/SortOptionSet_Mbcdfmru.Active_Mr_long, /*n:*/SortOptionSet_bcdfmnru.Active_nr, /*numericSort:*/SortOptionSet_bcdfmnru.Active_nr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_ru, /*unique:*/Active_ru_long, /*V:*/SortOptionSet_Vbcdfmru.Active_Vr, /*versionSort:*/SortOptionSet_Vbcdfmru.Active_Vr_long,
            false,
		/*active:*/SortOption.reverse
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
    public final SortOptionSet_MVbcdfghnru c;
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
    public final SortOptionSet_MVbcdfghnru check;
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
    public final SortOptionSet_MVbcdfghmnru d;
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
    public final SortOptionSet_MVbcdfghmnru dictionaryOrder;
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
    public final SortOptionSet_bcdfgmru g;
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
    public final SortOptionSet_bcdfgmru generalNumericSort;
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
    public final SortOptionSet_bcdfhmru h;
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
    public final SortOptionSet_bcdfhmru humanNumericSort;
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
    public final SortOptionSet_MVbcdfghmnru f;
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
    public final SortOptionSet_MVbcdfghmnru ignoreCase;
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
    public final SortOptionSet_MVbcdfghmnru b;
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
    public final SortOptionSet_MVbcdfghmnru ignoreLeadingBlanks;
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
    public final SortOptionSet_bcdfmnru n;
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
    public final SortOptionSet_bcdfmnru numericSort;
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
    public final SortOptionSet_MVbcdfghmnru r;
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
    public final SortOptionSet_MVbcdfghmnru reverse;
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
    public final SortOptionSet_MVbcdfghmnru u;
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
    public final SortOptionSet_MVbcdfghmnru unique;
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
    public final SortOptionSet_Vbcdfmru V;
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
    public final SortOptionSet_Vbcdfmru versionSort;
    private final boolean useAcronym;
    private final EnumSet<SortOption> options;

    private SortOptionSet_MVbcdfghmnru(
            SortOptionSet_MVbcdfghnru c, SortOptionSet_MVbcdfghnru check, SortOptionSet_MVbcdfghmnru d, SortOptionSet_MVbcdfghmnru dictionaryOrder, SortOptionSet_bcdfgmru g, SortOptionSet_bcdfgmru generalNumericSort, SortOptionSet_bcdfhmru h, SortOptionSet_bcdfhmru humanNumericSort, SortOptionSet_MVbcdfghmnru f, SortOptionSet_MVbcdfghmnru ignoreCase, SortOptionSet_MVbcdfghmnru b, SortOptionSet_MVbcdfghmnru ignoreLeadingBlanks, SortOptionSet_MVbdfghmnru m, SortOptionSet_MVbdfghmnru merge, SortOptionSet_Mbcdfmru M, SortOptionSet_Mbcdfmru monthSort, SortOptionSet_bcdfmnru n, SortOptionSet_bcdfmnru numericSort, SortOptionSet_MVbcdfghmnru r, SortOptionSet_MVbcdfghmnru reverse, SortOptionSet_MVbcdfghmnru u, SortOptionSet_MVbcdfghmnru unique, SortOptionSet_Vbcdfmru V, SortOptionSet_Vbcdfmru versionSort,
            boolean useAcronym,
            SortOption... activeOptions
    ) {
        this.c = notNull(c);
        this.check = notNull(check);
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
        this.m = notNull(m);
        this.merge = notNull(merge);
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
     *    SortOptionSet_MVbcdfghmnru.check.d;
     * </pre>
     * uses acronyms, that is, this method always returns true for the above
     * set.
     * <p>
     * On the other hand, long option names are used and this method always
     * returns false for the set
     * <pre>
     *    SortOptionSet_MVbcdfghmnru.c.dictionaryOrder;
     * </pre>
     * <p>
     * Note that a repeated option is <i>not</i> treated as the last set option.
     * For instance, the first and last option of the following set are
     * equivalent and acronyms are used:
     * <pre>
     *    SortOptionSet_MVbcdfghmnru.c.d.check;
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
