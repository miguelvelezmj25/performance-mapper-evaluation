package org.unix4j.unix.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import org.unix4j.option.Option;

import org.unix4j.unix.Sort;

/**
 * Option sets for the {@link Sort sort} command with 
 * the following options: {@link #c c}, {@link #d d}, {@link #g g}, {@link #h h}, {@link #f f}, {@link #b b}, {@link #M M}, {@link #n n}, {@link #r r}, {@link #u u}, {@link #V V}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Sort#Options} should be used instead to specify command 
 * options. See also {@link org.unix4j.unix.sort.SortOptions} for more information.
 */
public enum SortOptionSet_MVbcdfghnru implements SortOptions {
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.*/
	Active_bcdfru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgru.Active_bcdfgru, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_bcdfgru_long, /*h:*/SortOptionSet_bcdfhru.Active_bcdfhru, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_bcdfhru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/SortOptionSet_Mbcdfru.Active_Mbcdfru, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mbcdfru_long, /*n:*/SortOptionSet_bcdfnru.Active_bcdfnru, /*numericSort:*/SortOptionSet_bcdfnru.Active_bcdfnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfru.Active_Vbcdfru, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vbcdfru_long, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.*/
	Active_bcdfru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgru.Active_bcdfgru, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_bcdfgru_long, /*h:*/SortOptionSet_bcdfhru.Active_bcdfhru, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_bcdfhru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/SortOptionSet_Mbcdfru.Active_Mbcdfru, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mbcdfru_long, /*n:*/SortOptionSet_bcdfnru.Active_bcdfnru, /*numericSort:*/SortOptionSet_bcdfnru.Active_bcdfnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfru.Active_Vbcdfru, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vbcdfru_long, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.*/
	Active_bcdfu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgru.Active_bcdfgu, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_bcdfgu_long, /*h:*/SortOptionSet_bcdfhru.Active_bcdfhu, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_bcdfhu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/SortOptionSet_Mbcdfru.Active_Mbcdfu, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mbcdfu_long, /*n:*/SortOptionSet_bcdfnru.Active_bcdfnu, /*numericSort:*/SortOptionSet_bcdfnru.Active_bcdfnu_long, /*r:*/Active_bcdfru, /*reverse:*/Active_bcdfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfru.Active_Vbcdfu, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vbcdfu_long, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.*/
	Active_bcdfu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgru.Active_bcdfgu, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_bcdfgu_long, /*h:*/SortOptionSet_bcdfhru.Active_bcdfhu, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_bcdfhu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/SortOptionSet_Mbcdfru.Active_Mbcdfu, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mbcdfu_long, /*n:*/SortOptionSet_bcdfnru.Active_bcdfnu, /*numericSort:*/SortOptionSet_bcdfnru.Active_bcdfnu_long, /*r:*/Active_bcdfru, /*reverse:*/Active_bcdfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfru.Active_Vbcdfu, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vbcdfu_long, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.*/
	Active_bcdru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgru.Active_bcdgru, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_bcdgru_long, /*h:*/SortOptionSet_bcdfhru.Active_bcdhru, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_bcdhru_long, /*f:*/Active_bcdfru, /*ignoreCase:*/Active_bcdfru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/SortOptionSet_Mbcdfru.Active_Mbcdru, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mbcdru_long, /*n:*/SortOptionSet_bcdfnru.Active_bcdnru, /*numericSort:*/SortOptionSet_bcdfnru.Active_bcdnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfru.Active_Vbcdru, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vbcdru_long, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.*/
	Active_bcdru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgru.Active_bcdgru, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_bcdgru_long, /*h:*/SortOptionSet_bcdfhru.Active_bcdhru, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_bcdhru_long, /*f:*/Active_bcdfru, /*ignoreCase:*/Active_bcdfru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/SortOptionSet_Mbcdfru.Active_Mbcdru, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mbcdru_long, /*n:*/SortOptionSet_bcdfnru.Active_bcdnru, /*numericSort:*/SortOptionSet_bcdfnru.Active_bcdnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfru.Active_Vbcdru, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vbcdru_long, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.*/
	Active_bcfru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdfru, /*dictionaryOrder:*/Active_bcdfru_long, /*g:*/SortOptionSet_bcdfgru.Active_bcfgru, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_bcfgru_long, /*h:*/SortOptionSet_bcdfhru.Active_bcfhru, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_bcfhru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/SortOptionSet_Mbcdfru.Active_Mbcfru, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mbcfru_long, /*n:*/SortOptionSet_bcdfnru.Active_bcfnru, /*numericSort:*/SortOptionSet_bcdfnru.Active_bcfnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfru.Active_Vbcfru, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vbcfru_long, 
		true, 
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.*/
	Active_bcfru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdfru, /*dictionaryOrder:*/Active_bcdfru_long, /*g:*/SortOptionSet_bcdfgru.Active_bcfgru, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_bcfgru_long, /*h:*/SortOptionSet_bcdfhru.Active_bcfhru, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_bcfhru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/SortOptionSet_Mbcdfru.Active_Mbcfru, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mbcfru_long, /*n:*/SortOptionSet_bcdfnru.Active_bcfnru, /*numericSort:*/SortOptionSet_bcdfnru.Active_bcfnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfru.Active_Vbcfru, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vbcfru_long, 
		false, 
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #reverse r}, {@link #unique u}.*/
	Active_cdfru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgru.Active_cdfgru, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_cdfgru_long, /*h:*/SortOptionSet_bcdfhru.Active_cdfhru, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_cdfhru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcdfru, /*ignoreLeadingBlanks:*/Active_bcdfru_long, /*M:*/SortOptionSet_Mbcdfru.Active_Mcdfru, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mcdfru_long, /*n:*/SortOptionSet_bcdfnru.Active_cdfnru, /*numericSort:*/SortOptionSet_bcdfnru.Active_cdfnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfru.Active_Vcdfru, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vcdfru_long, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #reverse r}, {@link #unique u}.*/
	Active_cdfru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgru.Active_cdfgru, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_cdfgru_long, /*h:*/SortOptionSet_bcdfhru.Active_cdfhru, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_cdfhru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcdfru, /*ignoreLeadingBlanks:*/Active_bcdfru_long, /*M:*/SortOptionSet_Mbcdfru.Active_Mcdfru, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mcdfru_long, /*n:*/SortOptionSet_bcdfnru.Active_cdfnru, /*numericSort:*/SortOptionSet_bcdfnru.Active_cdfnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfru.Active_Vcdfru, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vcdfru_long, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.*/
	Active_bcdfr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgru.Active_bcdfgr, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_bcdfgr_long, /*h:*/SortOptionSet_bcdfhru.Active_bcdfhr, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_bcdfhr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/SortOptionSet_Mbcdfru.Active_Mbcdfr, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mbcdfr_long, /*n:*/SortOptionSet_bcdfnru.Active_bcdfnr, /*numericSort:*/SortOptionSet_bcdfnru.Active_bcdfnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bcdfru, /*unique:*/Active_bcdfru_long, /*V:*/SortOptionSet_Vbcdfru.Active_Vbcdfr, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vbcdfr_long, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.*/
	Active_bcdfr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgru.Active_bcdfgr, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_bcdfgr_long, /*h:*/SortOptionSet_bcdfhru.Active_bcdfhr, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_bcdfhr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/SortOptionSet_Mbcdfru.Active_Mbcdfr, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mbcdfr_long, /*n:*/SortOptionSet_bcdfnru.Active_bcdfnr, /*numericSort:*/SortOptionSet_bcdfnru.Active_bcdfnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bcdfru, /*unique:*/Active_bcdfru_long, /*V:*/SortOptionSet_Vbcdfru.Active_Vbcdfr, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vbcdfr_long, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.*/
	Active_bcdu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgru.Active_bcdgu, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_bcdgu_long, /*h:*/SortOptionSet_bcdfhru.Active_bcdhu, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_bcdhu_long, /*f:*/Active_bcdfu, /*ignoreCase:*/Active_bcdfu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/SortOptionSet_Mbcdfru.Active_Mbcdu, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mbcdu_long, /*n:*/SortOptionSet_bcdfnru.Active_bcdnu, /*numericSort:*/SortOptionSet_bcdfnru.Active_bcdnu_long, /*r:*/Active_bcdru, /*reverse:*/Active_bcdru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfru.Active_Vbcdu, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vbcdu_long, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.*/
	Active_bcdu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgru.Active_bcdgu, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_bcdgu_long, /*h:*/SortOptionSet_bcdfhru.Active_bcdhu, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_bcdhu_long, /*f:*/Active_bcdfu, /*ignoreCase:*/Active_bcdfu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/SortOptionSet_Mbcdfru.Active_Mbcdu, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mbcdu_long, /*n:*/SortOptionSet_bcdfnru.Active_bcdnu, /*numericSort:*/SortOptionSet_bcdfnru.Active_bcdnu_long, /*r:*/Active_bcdru, /*reverse:*/Active_bcdru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfru.Active_Vbcdu, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vbcdu_long, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.*/
	Active_bcfu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdfu, /*dictionaryOrder:*/Active_bcdfu_long, /*g:*/SortOptionSet_bcdfgru.Active_bcfgu, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_bcfgu_long, /*h:*/SortOptionSet_bcdfhru.Active_bcfhu, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_bcfhu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/SortOptionSet_Mbcdfru.Active_Mbcfu, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mbcfu_long, /*n:*/SortOptionSet_bcdfnru.Active_bcfnu, /*numericSort:*/SortOptionSet_bcdfnru.Active_bcfnu_long, /*r:*/Active_bcfru, /*reverse:*/Active_bcfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfru.Active_Vbcfu, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vbcfu_long, 
		true, 
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.*/
	Active_bcfu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdfu, /*dictionaryOrder:*/Active_bcdfu_long, /*g:*/SortOptionSet_bcdfgru.Active_bcfgu, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_bcfgu_long, /*h:*/SortOptionSet_bcdfhru.Active_bcfhu, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_bcfhu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/SortOptionSet_Mbcdfru.Active_Mbcfu, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mbcfu_long, /*n:*/SortOptionSet_bcdfnru.Active_bcfnu, /*numericSort:*/SortOptionSet_bcdfnru.Active_bcfnu_long, /*r:*/Active_bcfru, /*reverse:*/Active_bcfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfru.Active_Vbcfu, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vbcfu_long, 
		false, 
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.*/
	Active_bcru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdru, /*dictionaryOrder:*/Active_bcdru_long, /*g:*/SortOptionSet_bcdfgru.Active_bcgru, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_bcgru_long, /*h:*/SortOptionSet_bcdfhru.Active_bchru, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_bchru_long, /*f:*/Active_bcfru, /*ignoreCase:*/Active_bcfru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/SortOptionSet_Mbcdfru.Active_Mbcru, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mbcru_long, /*n:*/SortOptionSet_bcdfnru.Active_bcnru, /*numericSort:*/SortOptionSet_bcdfnru.Active_bcnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfru.Active_Vbcru, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vbcru_long, 
		true, 
		/*active:*/SortOption.check, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.*/
	Active_bcru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdru, /*dictionaryOrder:*/Active_bcdru_long, /*g:*/SortOptionSet_bcdfgru.Active_bcgru, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_bcgru_long, /*h:*/SortOptionSet_bcdfhru.Active_bchru, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_bchru_long, /*f:*/Active_bcfru, /*ignoreCase:*/Active_bcfru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/SortOptionSet_Mbcdfru.Active_Mbcru, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mbcru_long, /*n:*/SortOptionSet_bcdfnru.Active_bcnru, /*numericSort:*/SortOptionSet_bcdfnru.Active_bcnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfru.Active_Vbcru, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vbcru_long, 
		false, 
		/*active:*/SortOption.check, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #unique u}.*/
	Active_cdfu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgru.Active_cdfgu, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_cdfgu_long, /*h:*/SortOptionSet_bcdfhru.Active_cdfhu, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_cdfhu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcdfu, /*ignoreLeadingBlanks:*/Active_bcdfu_long, /*M:*/SortOptionSet_Mbcdfru.Active_Mcdfu, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mcdfu_long, /*n:*/SortOptionSet_bcdfnru.Active_cdfnu, /*numericSort:*/SortOptionSet_bcdfnru.Active_cdfnu_long, /*r:*/Active_cdfru, /*reverse:*/Active_cdfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfru.Active_Vcdfu, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vcdfu_long, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #unique u}.*/
	Active_cdfu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgru.Active_cdfgu, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_cdfgu_long, /*h:*/SortOptionSet_bcdfhru.Active_cdfhu, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_cdfhu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcdfu, /*ignoreLeadingBlanks:*/Active_bcdfu_long, /*M:*/SortOptionSet_Mbcdfru.Active_Mcdfu, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mcdfu_long, /*n:*/SortOptionSet_bcdfnru.Active_cdfnu, /*numericSort:*/SortOptionSet_bcdfnru.Active_cdfnu_long, /*r:*/Active_cdfru, /*reverse:*/Active_cdfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfru.Active_Vcdfu, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vcdfu_long, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #reverse r}, {@link #unique u}.*/
	Active_cdru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgru.Active_cdgru, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_cdgru_long, /*h:*/SortOptionSet_bcdfhru.Active_cdhru, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_cdhru_long, /*f:*/Active_cdfru, /*ignoreCase:*/Active_cdfru_long, /*b:*/Active_bcdru, /*ignoreLeadingBlanks:*/Active_bcdru_long, /*M:*/SortOptionSet_Mbcdfru.Active_Mcdru, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mcdru_long, /*n:*/SortOptionSet_bcdfnru.Active_cdnru, /*numericSort:*/SortOptionSet_bcdfnru.Active_cdnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfru.Active_Vcdru, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vcdru_long, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #reverse r}, {@link #unique u}.*/
	Active_cdru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgru.Active_cdgru, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_cdgru_long, /*h:*/SortOptionSet_bcdfhru.Active_cdhru, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_cdhru_long, /*f:*/Active_cdfru, /*ignoreCase:*/Active_cdfru_long, /*b:*/Active_bcdru, /*ignoreLeadingBlanks:*/Active_bcdru_long, /*M:*/SortOptionSet_Mbcdfru.Active_Mcdru, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mcdru_long, /*n:*/SortOptionSet_bcdfnru.Active_cdnru, /*numericSort:*/SortOptionSet_bcdfnru.Active_cdnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfru.Active_Vcdru, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vcdru_long, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #reverse r}, {@link #unique u}.*/
	Active_cfru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdfru, /*dictionaryOrder:*/Active_cdfru_long, /*g:*/SortOptionSet_bcdfgru.Active_cfgru, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_cfgru_long, /*h:*/SortOptionSet_bcdfhru.Active_cfhru, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_cfhru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcfru, /*ignoreLeadingBlanks:*/Active_bcfru_long, /*M:*/SortOptionSet_Mbcdfru.Active_Mcfru, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mcfru_long, /*n:*/SortOptionSet_bcdfnru.Active_cfnru, /*numericSort:*/SortOptionSet_bcdfnru.Active_cfnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfru.Active_Vcfru, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vcfru_long, 
		true, 
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #reverse r}, {@link #unique u}.*/
	Active_cfru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdfru, /*dictionaryOrder:*/Active_cdfru_long, /*g:*/SortOptionSet_bcdfgru.Active_cfgru, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_cfgru_long, /*h:*/SortOptionSet_bcdfhru.Active_cfhru, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_cfhru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcfru, /*ignoreLeadingBlanks:*/Active_bcfru_long, /*M:*/SortOptionSet_Mbcdfru.Active_Mcfru, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mcfru_long, /*n:*/SortOptionSet_bcdfnru.Active_cfnru, /*numericSort:*/SortOptionSet_bcdfnru.Active_cfnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfru.Active_Vcfru, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vcfru_long, 
		false, 
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}.*/
	Active_bcdf(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgru.Active_bcdfg, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_bcdfg_long, /*h:*/SortOptionSet_bcdfhru.Active_bcdfh, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_bcdfh_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/SortOptionSet_Mbcdfru.Active_Mbcdf, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mbcdf_long, /*n:*/SortOptionSet_bcdfnru.Active_bcdfn, /*numericSort:*/SortOptionSet_bcdfnru.Active_bcdfn_long, /*r:*/Active_bcdfr, /*reverse:*/Active_bcdfr_long, /*u:*/Active_bcdfu, /*unique:*/Active_bcdfu_long, /*V:*/SortOptionSet_Vbcdfru.Active_Vbcdf, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vbcdf_long, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}.*/
	Active_bcdf_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgru.Active_bcdfg, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_bcdfg_long, /*h:*/SortOptionSet_bcdfhru.Active_bcdfh, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_bcdfh_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/SortOptionSet_Mbcdfru.Active_Mbcdf, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mbcdf_long, /*n:*/SortOptionSet_bcdfnru.Active_bcdfn, /*numericSort:*/SortOptionSet_bcdfnru.Active_bcdfn_long, /*r:*/Active_bcdfr, /*reverse:*/Active_bcdfr_long, /*u:*/Active_bcdfu, /*unique:*/Active_bcdfu_long, /*V:*/SortOptionSet_Vbcdfru.Active_Vbcdf, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vbcdf_long, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.*/
	Active_bcdr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgru.Active_bcdgr, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_bcdgr_long, /*h:*/SortOptionSet_bcdfhru.Active_bcdhr, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_bcdhr_long, /*f:*/Active_bcdfr, /*ignoreCase:*/Active_bcdfr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/SortOptionSet_Mbcdfru.Active_Mbcdr, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mbcdr_long, /*n:*/SortOptionSet_bcdfnru.Active_bcdnr, /*numericSort:*/SortOptionSet_bcdfnru.Active_bcdnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bcdru, /*unique:*/Active_bcdru_long, /*V:*/SortOptionSet_Vbcdfru.Active_Vbcdr, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vbcdr_long, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.*/
	Active_bcdr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgru.Active_bcdgr, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_bcdgr_long, /*h:*/SortOptionSet_bcdfhru.Active_bcdhr, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_bcdhr_long, /*f:*/Active_bcdfr, /*ignoreCase:*/Active_bcdfr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/SortOptionSet_Mbcdfru.Active_Mbcdr, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mbcdr_long, /*n:*/SortOptionSet_bcdfnru.Active_bcdnr, /*numericSort:*/SortOptionSet_bcdfnru.Active_bcdnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bcdru, /*unique:*/Active_bcdru_long, /*V:*/SortOptionSet_Vbcdfru.Active_Vbcdr, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vbcdr_long, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.*/
	Active_bcfr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdfr, /*dictionaryOrder:*/Active_bcdfr_long, /*g:*/SortOptionSet_bcdfgru.Active_bcfgr, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_bcfgr_long, /*h:*/SortOptionSet_bcdfhru.Active_bcfhr, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_bcfhr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/SortOptionSet_Mbcdfru.Active_Mbcfr, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mbcfr_long, /*n:*/SortOptionSet_bcdfnru.Active_bcfnr, /*numericSort:*/SortOptionSet_bcdfnru.Active_bcfnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bcfru, /*unique:*/Active_bcfru_long, /*V:*/SortOptionSet_Vbcdfru.Active_Vbcfr, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vbcfr_long, 
		true, 
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.*/
	Active_bcfr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdfr, /*dictionaryOrder:*/Active_bcdfr_long, /*g:*/SortOptionSet_bcdfgru.Active_bcfgr, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_bcfgr_long, /*h:*/SortOptionSet_bcdfhru.Active_bcfhr, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_bcfhr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/SortOptionSet_Mbcdfru.Active_Mbcfr, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mbcfr_long, /*n:*/SortOptionSet_bcdfnru.Active_bcfnr, /*numericSort:*/SortOptionSet_bcdfnru.Active_bcfnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bcfru, /*unique:*/Active_bcfru_long, /*V:*/SortOptionSet_Vbcdfru.Active_Vbcfr, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vbcfr_long, 
		false, 
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #reverse r}.*/
	Active_cdfr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgru.Active_cdfgr, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_cdfgr_long, /*h:*/SortOptionSet_bcdfhru.Active_cdfhr, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_cdfhr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcdfr, /*ignoreLeadingBlanks:*/Active_bcdfr_long, /*M:*/SortOptionSet_Mbcdfru.Active_Mcdfr, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mcdfr_long, /*n:*/SortOptionSet_bcdfnru.Active_cdfnr, /*numericSort:*/SortOptionSet_bcdfnru.Active_cdfnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_cdfru, /*unique:*/Active_cdfru_long, /*V:*/SortOptionSet_Vbcdfru.Active_Vcdfr, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vcdfr_long, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #reverse r}.*/
	Active_cdfr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgru.Active_cdfgr, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_cdfgr_long, /*h:*/SortOptionSet_bcdfhru.Active_cdfhr, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_cdfhr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcdfr, /*ignoreLeadingBlanks:*/Active_bcdfr_long, /*M:*/SortOptionSet_Mbcdfru.Active_Mcdfr, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mcdfr_long, /*n:*/SortOptionSet_bcdfnru.Active_cdfnr, /*numericSort:*/SortOptionSet_bcdfnru.Active_cdfnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_cdfru, /*unique:*/Active_cdfru_long, /*V:*/SortOptionSet_Vbcdfru.Active_Vcdfr, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vcdfr_long, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.*/
	Active_bcu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdu, /*dictionaryOrder:*/Active_bcdu_long, /*g:*/SortOptionSet_bcdfgru.Active_bcgu, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_bcgu_long, /*h:*/SortOptionSet_bcdfhru.Active_bchu, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_bchu_long, /*f:*/Active_bcfu, /*ignoreCase:*/Active_bcfu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/SortOptionSet_Mbcdfru.Active_Mbcu, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mbcu_long, /*n:*/SortOptionSet_bcdfnru.Active_bcnu, /*numericSort:*/SortOptionSet_bcdfnru.Active_bcnu_long, /*r:*/Active_bcru, /*reverse:*/Active_bcru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfru.Active_Vbcu, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vbcu_long, 
		true, 
		/*active:*/SortOption.check, SortOption.ignoreLeadingBlanks, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.*/
	Active_bcu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdu, /*dictionaryOrder:*/Active_bcdu_long, /*g:*/SortOptionSet_bcdfgru.Active_bcgu, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_bcgu_long, /*h:*/SortOptionSet_bcdfhru.Active_bchu, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_bchu_long, /*f:*/Active_bcfu, /*ignoreCase:*/Active_bcfu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/SortOptionSet_Mbcdfru.Active_Mbcu, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mbcu_long, /*n:*/SortOptionSet_bcdfnru.Active_bcnu, /*numericSort:*/SortOptionSet_bcdfnru.Active_bcnu_long, /*r:*/Active_bcru, /*reverse:*/Active_bcru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfru.Active_Vbcu, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vbcu_long, 
		false, 
		/*active:*/SortOption.check, SortOption.ignoreLeadingBlanks, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #unique u}.*/
	Active_cdu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgru.Active_cdgu, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_cdgu_long, /*h:*/SortOptionSet_bcdfhru.Active_cdhu, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_cdhu_long, /*f:*/Active_cdfu, /*ignoreCase:*/Active_cdfu_long, /*b:*/Active_bcdu, /*ignoreLeadingBlanks:*/Active_bcdu_long, /*M:*/SortOptionSet_Mbcdfru.Active_Mcdu, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mcdu_long, /*n:*/SortOptionSet_bcdfnru.Active_cdnu, /*numericSort:*/SortOptionSet_bcdfnru.Active_cdnu_long, /*r:*/Active_cdru, /*reverse:*/Active_cdru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfru.Active_Vcdu, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vcdu_long, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #unique u}.*/
	Active_cdu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgru.Active_cdgu, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_cdgu_long, /*h:*/SortOptionSet_bcdfhru.Active_cdhu, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_cdhu_long, /*f:*/Active_cdfu, /*ignoreCase:*/Active_cdfu_long, /*b:*/Active_bcdu, /*ignoreLeadingBlanks:*/Active_bcdu_long, /*M:*/SortOptionSet_Mbcdfru.Active_Mcdu, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mcdu_long, /*n:*/SortOptionSet_bcdfnru.Active_cdnu, /*numericSort:*/SortOptionSet_bcdfnru.Active_cdnu_long, /*r:*/Active_cdru, /*reverse:*/Active_cdru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfru.Active_Vcdu, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vcdu_long, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #unique u}.*/
	Active_cfu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdfu, /*dictionaryOrder:*/Active_cdfu_long, /*g:*/SortOptionSet_bcdfgru.Active_cfgu, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_cfgu_long, /*h:*/SortOptionSet_bcdfhru.Active_cfhu, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_cfhu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcfu, /*ignoreLeadingBlanks:*/Active_bcfu_long, /*M:*/SortOptionSet_Mbcdfru.Active_Mcfu, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mcfu_long, /*n:*/SortOptionSet_bcdfnru.Active_cfnu, /*numericSort:*/SortOptionSet_bcdfnru.Active_cfnu_long, /*r:*/Active_cfru, /*reverse:*/Active_cfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfru.Active_Vcfu, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vcfu_long, 
		true, 
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #unique u}.*/
	Active_cfu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdfu, /*dictionaryOrder:*/Active_cdfu_long, /*g:*/SortOptionSet_bcdfgru.Active_cfgu, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_cfgu_long, /*h:*/SortOptionSet_bcdfhru.Active_cfhu, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_cfhu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcfu, /*ignoreLeadingBlanks:*/Active_bcfu_long, /*M:*/SortOptionSet_Mbcdfru.Active_Mcfu, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mcfu_long, /*n:*/SortOptionSet_bcdfnru.Active_cfnu, /*numericSort:*/SortOptionSet_bcdfnru.Active_cfnu_long, /*r:*/Active_cfru, /*reverse:*/Active_cfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfru.Active_Vcfu, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vcfu_long, 
		false, 
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #reverse r}, {@link #unique u}.*/
	Active_cru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdru, /*dictionaryOrder:*/Active_cdru_long, /*g:*/SortOptionSet_bcdfgru.Active_cgru, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_cgru_long, /*h:*/SortOptionSet_bcdfhru.Active_chru, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_chru_long, /*f:*/Active_cfru, /*ignoreCase:*/Active_cfru_long, /*b:*/Active_bcru, /*ignoreLeadingBlanks:*/Active_bcru_long, /*M:*/SortOptionSet_Mbcdfru.Active_Mcru, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mcru_long, /*n:*/SortOptionSet_bcdfnru.Active_cnru, /*numericSort:*/SortOptionSet_bcdfnru.Active_cnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfru.Active_Vcru, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vcru_long, 
		true, 
		/*active:*/SortOption.check, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #reverse r}, {@link #unique u}.*/
	Active_cru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdru, /*dictionaryOrder:*/Active_cdru_long, /*g:*/SortOptionSet_bcdfgru.Active_cgru, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_cgru_long, /*h:*/SortOptionSet_bcdfhru.Active_chru, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_chru_long, /*f:*/Active_cfru, /*ignoreCase:*/Active_cfru_long, /*b:*/Active_bcru, /*ignoreLeadingBlanks:*/Active_bcru_long, /*M:*/SortOptionSet_Mbcdfru.Active_Mcru, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mcru_long, /*n:*/SortOptionSet_bcdfnru.Active_cnru, /*numericSort:*/SortOptionSet_bcdfnru.Active_cnru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfru.Active_Vcru, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vcru_long, 
		false, 
		/*active:*/SortOption.check, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}.*/
	Active_bcd(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgru.Active_bcdg, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_bcdg_long, /*h:*/SortOptionSet_bcdfhru.Active_bcdh, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_bcdh_long, /*f:*/Active_bcdf, /*ignoreCase:*/Active_bcdf_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/SortOptionSet_Mbcdfru.Active_Mbcd, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mbcd_long, /*n:*/SortOptionSet_bcdfnru.Active_bcdn, /*numericSort:*/SortOptionSet_bcdfnru.Active_bcdn_long, /*r:*/Active_bcdr, /*reverse:*/Active_bcdr_long, /*u:*/Active_bcdu, /*unique:*/Active_bcdu_long, /*V:*/SortOptionSet_Vbcdfru.Active_Vbcd, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vbcd_long, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}.*/
	Active_bcd_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgru.Active_bcdg, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_bcdg_long, /*h:*/SortOptionSet_bcdfhru.Active_bcdh, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_bcdh_long, /*f:*/Active_bcdf, /*ignoreCase:*/Active_bcdf_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/SortOptionSet_Mbcdfru.Active_Mbcd, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mbcd_long, /*n:*/SortOptionSet_bcdfnru.Active_bcdn, /*numericSort:*/SortOptionSet_bcdfnru.Active_bcdn_long, /*r:*/Active_bcdr, /*reverse:*/Active_bcdr_long, /*u:*/Active_bcdu, /*unique:*/Active_bcdu_long, /*V:*/SortOptionSet_Vbcdfru.Active_Vbcd, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vbcd_long, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}.*/
	Active_bcf(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdf, /*dictionaryOrder:*/Active_bcdf_long, /*g:*/SortOptionSet_bcdfgru.Active_bcfg, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_bcfg_long, /*h:*/SortOptionSet_bcdfhru.Active_bcfh, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_bcfh_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/SortOptionSet_Mbcdfru.Active_Mbcf, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mbcf_long, /*n:*/SortOptionSet_bcdfnru.Active_bcfn, /*numericSort:*/SortOptionSet_bcdfnru.Active_bcfn_long, /*r:*/Active_bcfr, /*reverse:*/Active_bcfr_long, /*u:*/Active_bcfu, /*unique:*/Active_bcfu_long, /*V:*/SortOptionSet_Vbcdfru.Active_Vbcf, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vbcf_long, 
		true, 
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}.*/
	Active_bcf_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdf, /*dictionaryOrder:*/Active_bcdf_long, /*g:*/SortOptionSet_bcdfgru.Active_bcfg, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_bcfg_long, /*h:*/SortOptionSet_bcdfhru.Active_bcfh, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_bcfh_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/SortOptionSet_Mbcdfru.Active_Mbcf, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mbcf_long, /*n:*/SortOptionSet_bcdfnru.Active_bcfn, /*numericSort:*/SortOptionSet_bcdfnru.Active_bcfn_long, /*r:*/Active_bcfr, /*reverse:*/Active_bcfr_long, /*u:*/Active_bcfu, /*unique:*/Active_bcfu_long, /*V:*/SortOptionSet_Vbcdfru.Active_Vbcf, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vbcf_long, 
		false, 
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.*/
	Active_bcr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdr, /*dictionaryOrder:*/Active_bcdr_long, /*g:*/SortOptionSet_bcdfgru.Active_bcgr, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_bcgr_long, /*h:*/SortOptionSet_bcdfhru.Active_bchr, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_bchr_long, /*f:*/Active_bcfr, /*ignoreCase:*/Active_bcfr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/SortOptionSet_Mbcdfru.Active_Mbcr, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mbcr_long, /*n:*/SortOptionSet_bcdfnru.Active_bcnr, /*numericSort:*/SortOptionSet_bcdfnru.Active_bcnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bcru, /*unique:*/Active_bcru_long, /*V:*/SortOptionSet_Vbcdfru.Active_Vbcr, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vbcr_long, 
		true, 
		/*active:*/SortOption.check, SortOption.ignoreLeadingBlanks, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.*/
	Active_bcr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdr, /*dictionaryOrder:*/Active_bcdr_long, /*g:*/SortOptionSet_bcdfgru.Active_bcgr, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_bcgr_long, /*h:*/SortOptionSet_bcdfhru.Active_bchr, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_bchr_long, /*f:*/Active_bcfr, /*ignoreCase:*/Active_bcfr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/SortOptionSet_Mbcdfru.Active_Mbcr, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mbcr_long, /*n:*/SortOptionSet_bcdfnru.Active_bcnr, /*numericSort:*/SortOptionSet_bcdfnru.Active_bcnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bcru, /*unique:*/Active_bcru_long, /*V:*/SortOptionSet_Vbcdfru.Active_Vbcr, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vbcr_long, 
		false, 
		/*active:*/SortOption.check, SortOption.ignoreLeadingBlanks, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}.*/
	Active_cdf(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgru.Active_cdfg, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_cdfg_long, /*h:*/SortOptionSet_bcdfhru.Active_cdfh, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_cdfh_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcdf, /*ignoreLeadingBlanks:*/Active_bcdf_long, /*M:*/SortOptionSet_Mbcdfru.Active_Mcdf, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mcdf_long, /*n:*/SortOptionSet_bcdfnru.Active_cdfn, /*numericSort:*/SortOptionSet_bcdfnru.Active_cdfn_long, /*r:*/Active_cdfr, /*reverse:*/Active_cdfr_long, /*u:*/Active_cdfu, /*unique:*/Active_cdfu_long, /*V:*/SortOptionSet_Vbcdfru.Active_Vcdf, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vcdf_long, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}.*/
	Active_cdf_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgru.Active_cdfg, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_cdfg_long, /*h:*/SortOptionSet_bcdfhru.Active_cdfh, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_cdfh_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcdf, /*ignoreLeadingBlanks:*/Active_bcdf_long, /*M:*/SortOptionSet_Mbcdfru.Active_Mcdf, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mcdf_long, /*n:*/SortOptionSet_bcdfnru.Active_cdfn, /*numericSort:*/SortOptionSet_bcdfnru.Active_cdfn_long, /*r:*/Active_cdfr, /*reverse:*/Active_cdfr_long, /*u:*/Active_cdfu, /*unique:*/Active_cdfu_long, /*V:*/SortOptionSet_Vbcdfru.Active_Vcdf, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vcdf_long, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #reverse r}.*/
	Active_cdr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgru.Active_cdgr, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_cdgr_long, /*h:*/SortOptionSet_bcdfhru.Active_cdhr, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_cdhr_long, /*f:*/Active_cdfr, /*ignoreCase:*/Active_cdfr_long, /*b:*/Active_bcdr, /*ignoreLeadingBlanks:*/Active_bcdr_long, /*M:*/SortOptionSet_Mbcdfru.Active_Mcdr, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mcdr_long, /*n:*/SortOptionSet_bcdfnru.Active_cdnr, /*numericSort:*/SortOptionSet_bcdfnru.Active_cdnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_cdru, /*unique:*/Active_cdru_long, /*V:*/SortOptionSet_Vbcdfru.Active_Vcdr, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vcdr_long, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #reverse r}.*/
	Active_cdr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgru.Active_cdgr, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_cdgr_long, /*h:*/SortOptionSet_bcdfhru.Active_cdhr, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_cdhr_long, /*f:*/Active_cdfr, /*ignoreCase:*/Active_cdfr_long, /*b:*/Active_bcdr, /*ignoreLeadingBlanks:*/Active_bcdr_long, /*M:*/SortOptionSet_Mbcdfru.Active_Mcdr, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mcdr_long, /*n:*/SortOptionSet_bcdfnru.Active_cdnr, /*numericSort:*/SortOptionSet_bcdfnru.Active_cdnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_cdru, /*unique:*/Active_cdru_long, /*V:*/SortOptionSet_Vbcdfru.Active_Vcdr, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vcdr_long, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #reverse r}.*/
	Active_cfr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdfr, /*dictionaryOrder:*/Active_cdfr_long, /*g:*/SortOptionSet_bcdfgru.Active_cfgr, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_cfgr_long, /*h:*/SortOptionSet_bcdfhru.Active_cfhr, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_cfhr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcfr, /*ignoreLeadingBlanks:*/Active_bcfr_long, /*M:*/SortOptionSet_Mbcdfru.Active_Mcfr, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mcfr_long, /*n:*/SortOptionSet_bcdfnru.Active_cfnr, /*numericSort:*/SortOptionSet_bcdfnru.Active_cfnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_cfru, /*unique:*/Active_cfru_long, /*V:*/SortOptionSet_Vbcdfru.Active_Vcfr, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vcfr_long, 
		true, 
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #reverse r}.*/
	Active_cfr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdfr, /*dictionaryOrder:*/Active_cdfr_long, /*g:*/SortOptionSet_bcdfgru.Active_cfgr, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_cfgr_long, /*h:*/SortOptionSet_bcdfhru.Active_cfhr, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_cfhr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcfr, /*ignoreLeadingBlanks:*/Active_bcfr_long, /*M:*/SortOptionSet_Mbcdfru.Active_Mcfr, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mcfr_long, /*n:*/SortOptionSet_bcdfnru.Active_cfnr, /*numericSort:*/SortOptionSet_bcdfnru.Active_cfnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_cfru, /*unique:*/Active_cfru_long, /*V:*/SortOptionSet_Vbcdfru.Active_Vcfr, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vcfr_long, 
		false, 
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #unique u}.*/
	Active_cu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdu, /*dictionaryOrder:*/Active_cdu_long, /*g:*/SortOptionSet_bcdfgru.Active_cgu, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_cgu_long, /*h:*/SortOptionSet_bcdfhru.Active_chu, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_chu_long, /*f:*/Active_cfu, /*ignoreCase:*/Active_cfu_long, /*b:*/Active_bcu, /*ignoreLeadingBlanks:*/Active_bcu_long, /*M:*/SortOptionSet_Mbcdfru.Active_Mcu, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mcu_long, /*n:*/SortOptionSet_bcdfnru.Active_cnu, /*numericSort:*/SortOptionSet_bcdfnru.Active_cnu_long, /*r:*/Active_cru, /*reverse:*/Active_cru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfru.Active_Vcu, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vcu_long, 
		true, 
		/*active:*/SortOption.check, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #unique u}.*/
	Active_cu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdu, /*dictionaryOrder:*/Active_cdu_long, /*g:*/SortOptionSet_bcdfgru.Active_cgu, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_cgu_long, /*h:*/SortOptionSet_bcdfhru.Active_chu, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_chu_long, /*f:*/Active_cfu, /*ignoreCase:*/Active_cfu_long, /*b:*/Active_bcu, /*ignoreLeadingBlanks:*/Active_bcu_long, /*M:*/SortOptionSet_Mbcdfru.Active_Mcu, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mcu_long, /*n:*/SortOptionSet_bcdfnru.Active_cnu, /*numericSort:*/SortOptionSet_bcdfnru.Active_cnu_long, /*r:*/Active_cru, /*reverse:*/Active_cru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/SortOptionSet_Vbcdfru.Active_Vcu, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vcu_long, 
		false, 
		/*active:*/SortOption.check, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreLeadingBlanks b}.*/
	Active_bc(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcd, /*dictionaryOrder:*/Active_bcd_long, /*g:*/SortOptionSet_bcdfgru.Active_bcg, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_bcg_long, /*h:*/SortOptionSet_bcdfhru.Active_bch, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_bch_long, /*f:*/Active_bcf, /*ignoreCase:*/Active_bcf_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/SortOptionSet_Mbcdfru.Active_Mbc, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mbc_long, /*n:*/SortOptionSet_bcdfnru.Active_bcn, /*numericSort:*/SortOptionSet_bcdfnru.Active_bcn_long, /*r:*/Active_bcr, /*reverse:*/Active_bcr_long, /*u:*/Active_bcu, /*unique:*/Active_bcu_long, /*V:*/SortOptionSet_Vbcdfru.Active_Vbc, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vbc_long, 
		true, 
		/*active:*/SortOption.check, SortOption.ignoreLeadingBlanks
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreLeadingBlanks b}.*/
	Active_bc_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcd, /*dictionaryOrder:*/Active_bcd_long, /*g:*/SortOptionSet_bcdfgru.Active_bcg, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_bcg_long, /*h:*/SortOptionSet_bcdfhru.Active_bch, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_bch_long, /*f:*/Active_bcf, /*ignoreCase:*/Active_bcf_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/SortOptionSet_Mbcdfru.Active_Mbc, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mbc_long, /*n:*/SortOptionSet_bcdfnru.Active_bcn, /*numericSort:*/SortOptionSet_bcdfnru.Active_bcn_long, /*r:*/Active_bcr, /*reverse:*/Active_bcr_long, /*u:*/Active_bcu, /*unique:*/Active_bcu_long, /*V:*/SortOptionSet_Vbcdfru.Active_Vbc, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vbc_long, 
		false, 
		/*active:*/SortOption.check, SortOption.ignoreLeadingBlanks
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}.*/
	Active_cd(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgru.Active_cdg, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_cdg_long, /*h:*/SortOptionSet_bcdfhru.Active_cdh, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_cdh_long, /*f:*/Active_cdf, /*ignoreCase:*/Active_cdf_long, /*b:*/Active_bcd, /*ignoreLeadingBlanks:*/Active_bcd_long, /*M:*/SortOptionSet_Mbcdfru.Active_Mcd, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mcd_long, /*n:*/SortOptionSet_bcdfnru.Active_cdn, /*numericSort:*/SortOptionSet_bcdfnru.Active_cdn_long, /*r:*/Active_cdr, /*reverse:*/Active_cdr_long, /*u:*/Active_cdu, /*unique:*/Active_cdu_long, /*V:*/SortOptionSet_Vbcdfru.Active_Vcd, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vcd_long, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}.*/
	Active_cd_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/SortOptionSet_bcdfgru.Active_cdg, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_cdg_long, /*h:*/SortOptionSet_bcdfhru.Active_cdh, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_cdh_long, /*f:*/Active_cdf, /*ignoreCase:*/Active_cdf_long, /*b:*/Active_bcd, /*ignoreLeadingBlanks:*/Active_bcd_long, /*M:*/SortOptionSet_Mbcdfru.Active_Mcd, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mcd_long, /*n:*/SortOptionSet_bcdfnru.Active_cdn, /*numericSort:*/SortOptionSet_bcdfnru.Active_cdn_long, /*r:*/Active_cdr, /*reverse:*/Active_cdr_long, /*u:*/Active_cdu, /*unique:*/Active_cdu_long, /*V:*/SortOptionSet_Vbcdfru.Active_Vcd, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vcd_long, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreCase f}.*/
	Active_cf(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdf, /*dictionaryOrder:*/Active_cdf_long, /*g:*/SortOptionSet_bcdfgru.Active_cfg, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_cfg_long, /*h:*/SortOptionSet_bcdfhru.Active_cfh, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_cfh_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcf, /*ignoreLeadingBlanks:*/Active_bcf_long, /*M:*/SortOptionSet_Mbcdfru.Active_Mcf, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mcf_long, /*n:*/SortOptionSet_bcdfnru.Active_cfn, /*numericSort:*/SortOptionSet_bcdfnru.Active_cfn_long, /*r:*/Active_cfr, /*reverse:*/Active_cfr_long, /*u:*/Active_cfu, /*unique:*/Active_cfu_long, /*V:*/SortOptionSet_Vbcdfru.Active_Vcf, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vcf_long, 
		true, 
		/*active:*/SortOption.check, SortOption.ignoreCase
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreCase f}.*/
	Active_cf_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdf, /*dictionaryOrder:*/Active_cdf_long, /*g:*/SortOptionSet_bcdfgru.Active_cfg, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_cfg_long, /*h:*/SortOptionSet_bcdfhru.Active_cfh, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_cfh_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcf, /*ignoreLeadingBlanks:*/Active_bcf_long, /*M:*/SortOptionSet_Mbcdfru.Active_Mcf, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mcf_long, /*n:*/SortOptionSet_bcdfnru.Active_cfn, /*numericSort:*/SortOptionSet_bcdfnru.Active_cfn_long, /*r:*/Active_cfr, /*reverse:*/Active_cfr_long, /*u:*/Active_cfu, /*unique:*/Active_cfu_long, /*V:*/SortOptionSet_Vbcdfru.Active_Vcf, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vcf_long, 
		false, 
		/*active:*/SortOption.check, SortOption.ignoreCase
	),
	/** Option set with the following active options: {@link #check c}, {@link #reverse r}.*/
	Active_cr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdr, /*dictionaryOrder:*/Active_cdr_long, /*g:*/SortOptionSet_bcdfgru.Active_cgr, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_cgr_long, /*h:*/SortOptionSet_bcdfhru.Active_chr, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_chr_long, /*f:*/Active_cfr, /*ignoreCase:*/Active_cfr_long, /*b:*/Active_bcr, /*ignoreLeadingBlanks:*/Active_bcr_long, /*M:*/SortOptionSet_Mbcdfru.Active_Mcr, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mcr_long, /*n:*/SortOptionSet_bcdfnru.Active_cnr, /*numericSort:*/SortOptionSet_bcdfnru.Active_cnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_cru, /*unique:*/Active_cru_long, /*V:*/SortOptionSet_Vbcdfru.Active_Vcr, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vcr_long, 
		true, 
		/*active:*/SortOption.check, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #reverse r}.*/
	Active_cr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdr, /*dictionaryOrder:*/Active_cdr_long, /*g:*/SortOptionSet_bcdfgru.Active_cgr, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_cgr_long, /*h:*/SortOptionSet_bcdfhru.Active_chr, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_chr_long, /*f:*/Active_cfr, /*ignoreCase:*/Active_cfr_long, /*b:*/Active_bcr, /*ignoreLeadingBlanks:*/Active_bcr_long, /*M:*/SortOptionSet_Mbcdfru.Active_Mcr, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mcr_long, /*n:*/SortOptionSet_bcdfnru.Active_cnr, /*numericSort:*/SortOptionSet_bcdfnru.Active_cnr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_cru, /*unique:*/Active_cru_long, /*V:*/SortOptionSet_Vbcdfru.Active_Vcr, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vcr_long, 
		false, 
		/*active:*/SortOption.check, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}.*/
	Active_c(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cd, /*dictionaryOrder:*/Active_cd_long, /*g:*/SortOptionSet_bcdfgru.Active_cg, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_cg_long, /*h:*/SortOptionSet_bcdfhru.Active_ch, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_ch_long, /*f:*/Active_cf, /*ignoreCase:*/Active_cf_long, /*b:*/Active_bc, /*ignoreLeadingBlanks:*/Active_bc_long, /*M:*/SortOptionSet_Mbcdfru.Active_Mc, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mc_long, /*n:*/SortOptionSet_bcdfnru.Active_cn, /*numericSort:*/SortOptionSet_bcdfnru.Active_cn_long, /*r:*/Active_cr, /*reverse:*/Active_cr_long, /*u:*/Active_cu, /*unique:*/Active_cu_long, /*V:*/SortOptionSet_Vbcdfru.Active_Vc, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vc_long, 
		true, 
		/*active:*/SortOption.check
	),
	/** Option set with the following active options: {@link #check c}.*/
	Active_c_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cd, /*dictionaryOrder:*/Active_cd_long, /*g:*/SortOptionSet_bcdfgru.Active_cg, /*generalNumericSort:*/SortOptionSet_bcdfgru.Active_cg_long, /*h:*/SortOptionSet_bcdfhru.Active_ch, /*humanNumericSort:*/SortOptionSet_bcdfhru.Active_ch_long, /*f:*/Active_cf, /*ignoreCase:*/Active_cf_long, /*b:*/Active_bc, /*ignoreLeadingBlanks:*/Active_bc_long, /*M:*/SortOptionSet_Mbcdfru.Active_Mc, /*monthSort:*/SortOptionSet_Mbcdfru.Active_Mc_long, /*n:*/SortOptionSet_bcdfnru.Active_cn, /*numericSort:*/SortOptionSet_bcdfnru.Active_cn_long, /*r:*/Active_cr, /*reverse:*/Active_cr_long, /*u:*/Active_cu, /*unique:*/Active_cu_long, /*V:*/SortOptionSet_Vbcdfru.Active_Vc, /*versionSort:*/SortOptionSet_Vbcdfru.Active_Vc_long, 
		false, 
		/*active:*/SortOption.check
	);
	private SortOptionSet_MVbcdfghnru(
		SortOptionSet_MVbcdfghnru c, SortOptionSet_MVbcdfghnru check, SortOptionSet_MVbcdfghnru d, SortOptionSet_MVbcdfghnru dictionaryOrder, SortOptionSet_bcdfgru g, SortOptionSet_bcdfgru generalNumericSort, SortOptionSet_bcdfhru h, SortOptionSet_bcdfhru humanNumericSort, SortOptionSet_MVbcdfghnru f, SortOptionSet_MVbcdfghnru ignoreCase, SortOptionSet_MVbcdfghnru b, SortOptionSet_MVbcdfghnru ignoreLeadingBlanks, SortOptionSet_Mbcdfru M, SortOptionSet_Mbcdfru monthSort, SortOptionSet_bcdfnru n, SortOptionSet_bcdfnru numericSort, SortOptionSet_MVbcdfghnru r, SortOptionSet_MVbcdfghnru reverse, SortOptionSet_MVbcdfghnru u, SortOptionSet_MVbcdfghnru unique, SortOptionSet_Vbcdfru V, SortOptionSet_Vbcdfru versionSort, 
		boolean useAcronym,
		SortOption... activeOptions
	) {
		this.c = c == null ? this : c;
		this.check = check == null ? this : check;
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
	private final boolean useAcronym;
	/**
	 * Option {@code "-c"}: Checks that the single input file is ordered as specified by the
			arguments and the collating sequence of the current locale. No 
			output is produced; only the exit code is affected.
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
			arguments and the collating sequence of the current locale. No 
			output is produced; only the exit code is affected.
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
			(This option is ignored if a comparator operand is present).
	 * <p>
	 * The option {@code "-d"} is equivalent to the {@code "--}{@link #dictionaryOrder dictionaryOrder}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "-d"}. If the option {@code "-d"}
	 * is already set, the field {@code d} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final SortOptionSet_MVbcdfghnru d;
	/**
	 * Option {@code "--dictionaryOrder"}: Consider only blanks and alphanumeric characters.
			(This option is ignored if a comparator operand is present).
	 * <p>
	 * The option {@code "--dictionaryOrder"} is equivalent to the {@code "-}{@link #d d}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "--dictionaryOrder"}. If the option {@code "--dictionaryOrder"}
	 * is already set, the field {@code dictionaryOrder} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final SortOptionSet_MVbcdfghnru dictionaryOrder;
	/**
	 * Option {@code "-g"}: Sort numerically, using the standard {@link Double#parseDouble(String)}  
			function to convert a trimmed line to a double-precision floating 
			point number. This allows floating point numbers to be specified in 
			scientific notation, like 1.0e-34 and 10e100. 
			<p>
			Uses the following collating sequence: Lines that cannot be parsed 
			because they do not represent valid double values (in alpha-numeric
			order); "-Infinity"; finite numbers in ascending numeric order 
			(with -0 < +0); "Infinity"; "NaN".
<p>
			This option is usually slower than {@code -numeric-sort (-n)} and it
			can lose information when converting to floating point.		
		<p>
			(This option is ignored if a comparator operand is present).
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
			function to convert a trimmed line to a double-precision floating 
			point number. This allows floating point numbers to be specified in 
			scientific notation, like 1.0e-34 and 10e100. 
			<p>
			Uses the following collating sequence: Lines that cannot be parsed 
			because they do not represent valid double values (in alpha-numeric
			order); "-Infinity"; finite numbers in ascending numeric order 
			(with -0 < +0); "Infinity"; "NaN".
<p>
			This option is usually slower than {@code -numeric-sort (-n)} and it
			can lose information when converting to floating point.		
		<p>
			(This option is ignored if a comparator operand is present).
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
	 * Option {@code "-h"}: Sort numerically, first by numeric sign (negative, zero, or 
			positive); then by SI suffix (either empty, or 'k' or 'K', or one 
			of 'MGTPEZY', in that order); and finally by numeric value. For
			example, '1023M' sorts before '1G' because 'M' (mega) precedes 'G' 
			(giga) as an SI suffix. 
			<p>
			This option sorts values that are consistently scaled to the nearest
			suffix, regardless of whether suffixes denote powers of 1000 or
			1024, and it therefore sorts the output of any single invocation of 
			the {@code ls} command that are invoked with the --human-readable 
			option. 
			<p>
			The syntax for numbers is the same as for the
			{@code --numericSort (-n)} option; the SI suffix must immediately 
			follow the number. 		
<p>
			(This option is ignored if a comparator operand is present).
	 * <p>
	 * The option {@code "-h"} is equivalent to the {@code "--}{@link #humanNumericSort humanNumericSort}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "-h"}. If the option {@code "-h"}
	 * is already set, the field {@code h} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final SortOptionSet_bcdfhru h;
	/**
	 * Option {@code "--humanNumericSort"}: Sort numerically, first by numeric sign (negative, zero, or 
			positive); then by SI suffix (either empty, or 'k' or 'K', or one 
			of 'MGTPEZY', in that order); and finally by numeric value. For
			example, '1023M' sorts before '1G' because 'M' (mega) precedes 'G' 
			(giga) as an SI suffix. 
			<p>
			This option sorts values that are consistently scaled to the nearest
			suffix, regardless of whether suffixes denote powers of 1000 or
			1024, and it therefore sorts the output of any single invocation of 
			the {@code ls} command that are invoked with the --human-readable 
			option. 
			<p>
			The syntax for numbers is the same as for the
			{@code --numericSort (-n)} option; the SI suffix must immediately 
			follow the number. 		
<p>
			(This option is ignored if a comparator operand is present).
	 * <p>
	 * The option {@code "--humanNumericSort"} is equivalent to the {@code "-}{@link #h h}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "--humanNumericSort"}. If the option {@code "--humanNumericSort"}
	 * is already set, the field {@code humanNumericSort} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final SortOptionSet_bcdfhru humanNumericSort;
	/**
	 * Option {@code "-f"}: Consider all lowercase characters that have uppercase equivalents to
			be the uppercase equivalent for the purposes of comparison.
			(This option is ignored if a comparator operand is present).
	 * <p>
	 * The option {@code "-f"} is equivalent to the {@code "--}{@link #ignoreCase ignoreCase}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "-f"}. If the option {@code "-f"}
	 * is already set, the field {@code f} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final SortOptionSet_MVbcdfghnru f;
	/**
	 * Option {@code "--ignoreCase"}: Consider all lowercase characters that have uppercase equivalents to
			be the uppercase equivalent for the purposes of comparison.
			(This option is ignored if a comparator operand is present).
	 * <p>
	 * The option {@code "--ignoreCase"} is equivalent to the {@code "-}{@link #f f}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "--ignoreCase"}. If the option {@code "--ignoreCase"}
	 * is already set, the field {@code ignoreCase} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final SortOptionSet_MVbcdfghnru ignoreCase;
	/**
	 * Option {@code "-b"}: Ignore leading blanks. 
			(This option is ignored if a comparator operand is present).
	 * <p>
	 * The option {@code "-b"} is equivalent to the {@code "--}{@link #ignoreLeadingBlanks ignoreLeadingBlanks}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "-b"}. If the option {@code "-b"}
	 * is already set, the field {@code b} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final SortOptionSet_MVbcdfghnru b;
	/**
	 * Option {@code "--ignoreLeadingBlanks"}: Ignore leading blanks. 
			(This option is ignored if a comparator operand is present).
	 * <p>
	 * The option {@code "--ignoreLeadingBlanks"} is equivalent to the {@code "-}{@link #b b}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "--ignoreLeadingBlanks"}. If the option {@code "--ignoreLeadingBlanks"}
	 * is already set, the field {@code ignoreLeadingBlanks} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final SortOptionSet_MVbcdfghnru ignoreLeadingBlanks;
	/**
	 * Option {@code "-M"}: An initial string, consisting of any amount of blanks, followed by a
			month name abbreviation, is folded to UPPER case and compared in the
			order: (unknown) < 'JAN' < ... < 'DEC'. The current locale
			determines the month spellings.
	 * <p>
	 * The option {@code "-M"} is equivalent to the {@code "--}{@link #monthSort monthSort}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "-M"}. If the option {@code "-M"}
	 * is already set, the field {@code M} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final SortOptionSet_Mbcdfru M;
	/**
	 * Option {@code "--monthSort"}: An initial string, consisting of any amount of blanks, followed by a
			month name abbreviation, is folded to UPPER case and compared in the
			order: (unknown) < 'JAN' < ... < 'DEC'. The current locale
			determines the month spellings.
	 * <p>
	 * The option {@code "--monthSort"} is equivalent to the {@code "-}{@link #M M}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "--monthSort"}. If the option {@code "--monthSort"}
	 * is already set, the field {@code monthSort} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final SortOptionSet_Mbcdfru monthSort;
	/**
	 * Option {@code "-n"}: Sort numerically; the number begins each line and consists of 
			optional blanks, an optional minus sign, and zero or more digits
			possibly separated by thousands separators, optionally followed by a
			decimal-point character and zero or more digits. An empty number is
			treated as '0'. The current local specifies the decimal-point 
			character and thousands separator.
			<p>
			Comparison is exact; there is no rounding error.
			<p>
			Neither a leading '+' nor exponential notation is recognized. To 
			compare such strings numerically, use the
			{@code -genericNumericSort (-g)} option. 
<p>
			(This option is ignored if a comparator operand is present).
	 * <p>
	 * The option {@code "-n"} is equivalent to the {@code "--}{@link #numericSort numericSort}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "-n"}. If the option {@code "-n"}
	 * is already set, the field {@code n} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final SortOptionSet_bcdfnru n;
	/**
	 * Option {@code "--numericSort"}: Sort numerically; the number begins each line and consists of 
			optional blanks, an optional minus sign, and zero or more digits
			possibly separated by thousands separators, optionally followed by a
			decimal-point character and zero or more digits. An empty number is
			treated as '0'. The current local specifies the decimal-point 
			character and thousands separator.
			<p>
			Comparison is exact; there is no rounding error.
			<p>
			Neither a leading '+' nor exponential notation is recognized. To 
			compare such strings numerically, use the
			{@code -genericNumericSort (-g)} option. 
<p>
			(This option is ignored if a comparator operand is present).
	 * <p>
	 * The option {@code "--numericSort"} is equivalent to the {@code "-}{@link #n n}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "--numericSort"}. If the option {@code "--numericSort"}
	 * is already set, the field {@code numericSort} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final SortOptionSet_bcdfnru numericSort;
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
	public final SortOptionSet_MVbcdfghnru r;
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
	public final SortOptionSet_MVbcdfghnru reverse;
	/**
	 * Option {@code "-u"}: Unique: suppress all but one in each set of lines having equal keys.
			If used with the {@code -c} option, checks that there are no lines 
			with duplicate keys, in addition to checking that the input file is 
			sorted.
	 * <p>
	 * The option {@code "-u"} is equivalent to the {@code "--}{@link #unique unique}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "-u"}. If the option {@code "-u"}
	 * is already set, the field {@code u} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final SortOptionSet_MVbcdfghnru u;
	/**
	 * Option {@code "--unique"}: Unique: suppress all but one in each set of lines having equal keys.
			If used with the {@code -c} option, checks that there are no lines 
			with duplicate keys, in addition to checking that the input file is 
			sorted.
	 * <p>
	 * The option {@code "--unique"} is equivalent to the {@code "-}{@link #u u}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "--unique"}. If the option {@code "--unique"}
	 * is already set, the field {@code unique} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final SortOptionSet_MVbcdfghnru unique;
	/**
	 * Option {@code "-V"}: Sort by version name and number. It behaves like a standard sort, 
			except that each sequence of decimal digits is treated numerically 
			as an index/version number.
			<p>
			(This option is ignored if a comparator operand is present).
	 * <p>
	 * The option {@code "-V"} is equivalent to the {@code "--}{@link #versionSort versionSort}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "-V"}. If the option {@code "-V"}
	 * is already set, the field {@code V} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final SortOptionSet_Vbcdfru V;
	/**
	 * Option {@code "--versionSort"}: Sort by version name and number. It behaves like a standard sort, 
			except that each sequence of decimal digits is treated numerically 
			as an index/version number.
			<p>
			(This option is ignored if a comparator operand is present).
	 * <p>
	 * The option {@code "--versionSort"} is equivalent to the {@code "-}{@link #V V}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "--versionSort"}. If the option {@code "--versionSort"}
	 * is already set, the field {@code versionSort} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final SortOptionSet_Vbcdfru versionSort;
	private final EnumSet<SortOption> options;
	
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
	 * Checks that the given {@code value} is not null and throws an exception 
	 * otherwise.
	 * 
	 * @param the value to check
	 * @return the given {@code value} if it is not null
	 * @throws NullPointerException if {@code value==null} 
	 */
	private static <T> T notNull(T value) {
		if (value != null) return value;
		throw new NullPointerException();
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
	 *    SortOptionSet_MVbcdfghnru.check.d;
	 * </pre>
	 * uses acronyms, that is, this method always returns true for the above 
	 * set. 
	 * <p>
	 * On the other hand, long option names are used and this method always 
	 * returns false for the set
	 * <pre>
	 *    SortOptionSet_MVbcdfghnru.c.dictionaryOrder;
	 * </pre>
	 * <p>
	 * Note that a repeated option is <i>not</i> treated as the last set option.
	 * For instance, the first and last option of the following set are 
	 * equivalent and acronyms are used:
	 * <pre>
	 *    SortOptionSet_MVbcdfghnru.c.d.check;
	 * </pre>
	 * <p>
	 * This method always returns true for the empty set with no active options.
	 *  
	 * @param option
	 *            the option of interest, has no impact on the result returned
	 *            by this method
	 * @return true if option acronyms should be used for string representations
	 *         of any option of this option set
	 */
	@Override
	public boolean useAcronymFor(SortOption option) {
		return useAcronym;
	}
}
