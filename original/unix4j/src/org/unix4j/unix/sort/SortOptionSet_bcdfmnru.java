package org.unix4j.unix.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import org.unix4j.option.Option;

import org.unix4j.unix.Sort;

/**
 * Option sets for the {@link Sort sort} command with 
 * the following options: {@link #c c}, {@link #d d}, {@link #f f}, {@link #b b}, {@link #m m}, {@link #n n}, {@link #r r}, {@link #u u}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Sort#Options} should be used instead to specify command 
 * options. See also {@link org.unix4j.unix.sort.SortOptions} for more information.
 */
public enum SortOptionSet_bcdfmnru implements SortOptions {
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.*/
	Active_bdfnru(
		/*c:*/SortOptionSet_bcdfnru.Active_bcdfnru, /*check:*/SortOptionSet_bcdfnru.Active_bcdfnru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfmnru.Active_bdfmnru, /*merge:*/SortOptionSet_bdfmnru.Active_bdfmnru_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.*/
	Active_bdfnru_long(
		/*c:*/SortOptionSet_bcdfnru.Active_bcdfnru, /*check:*/SortOptionSet_bcdfnru.Active_bcdfnru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfmnru.Active_bdfmnru, /*merge:*/SortOptionSet_bdfmnru.Active_bdfmnru_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #unique u}.*/
	Active_bdfnu(
		/*c:*/SortOptionSet_bcdfnru.Active_bcdfnu, /*check:*/SortOptionSet_bcdfnru.Active_bcdfnu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfmnru.Active_bdfmnu, /*merge:*/SortOptionSet_bdfmnru.Active_bdfmnu_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bdfnru, /*reverse:*/Active_bdfnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #unique u}.*/
	Active_bdfnu_long(
		/*c:*/SortOptionSet_bcdfnru.Active_bcdfnu, /*check:*/SortOptionSet_bcdfnru.Active_bcdfnu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfmnru.Active_bdfmnu, /*merge:*/SortOptionSet_bdfmnru.Active_bdfmnu_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bdfnru, /*reverse:*/Active_bdfnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.*/
	Active_bdnru(
		/*c:*/SortOptionSet_bcdfnru.Active_bcdnru, /*check:*/SortOptionSet_bcdfnru.Active_bcdnru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_bdfnru, /*ignoreCase:*/Active_bdfnru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfmnru.Active_bdmnru, /*merge:*/SortOptionSet_bdfmnru.Active_bdmnru_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.*/
	Active_bdnru_long(
		/*c:*/SortOptionSet_bcdfnru.Active_bcdnru, /*check:*/SortOptionSet_bcdfnru.Active_bcdnru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_bdfnru, /*ignoreCase:*/Active_bdfnru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfmnru.Active_bdmnru, /*merge:*/SortOptionSet_bdfmnru.Active_bdmnru_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.*/
	Active_bfnru(
		/*c:*/SortOptionSet_bcdfnru.Active_bcfnru, /*check:*/SortOptionSet_bcdfnru.Active_bcfnru_long, /*d:*/Active_bdfnru, /*dictionaryOrder:*/Active_bdfnru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfmnru.Active_bfmnru, /*merge:*/SortOptionSet_bdfmnru.Active_bfmnru_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.*/
	Active_bfnru_long(
		/*c:*/SortOptionSet_bcdfnru.Active_bcfnru, /*check:*/SortOptionSet_bcdfnru.Active_bcfnru_long, /*d:*/Active_bdfnru, /*dictionaryOrder:*/Active_bdfnru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfmnru.Active_bfmnru, /*merge:*/SortOptionSet_bdfmnru.Active_bfmnru_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.*/
	Active_dfnru(
		/*c:*/SortOptionSet_bcdfnru.Active_cdfnru, /*check:*/SortOptionSet_bcdfnru.Active_cdfnru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfnru, /*ignoreLeadingBlanks:*/Active_bdfnru_long, /*m:*/SortOptionSet_bdfmnru.Active_dfmnru, /*merge:*/SortOptionSet_bdfmnru.Active_dfmnru_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.numericSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.*/
	Active_dfnru_long(
		/*c:*/SortOptionSet_bcdfnru.Active_cdfnru, /*check:*/SortOptionSet_bcdfnru.Active_cdfnru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfnru, /*ignoreLeadingBlanks:*/Active_bdfnru_long, /*m:*/SortOptionSet_bdfmnru.Active_dfmnru, /*merge:*/SortOptionSet_bdfmnru.Active_dfmnru_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.numericSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #reverse r}.*/
	Active_bdfnr(
		/*c:*/SortOptionSet_bcdfnru.Active_bcdfnr, /*check:*/SortOptionSet_bcdfnru.Active_bcdfnr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfmnru.Active_bdfmnr, /*merge:*/SortOptionSet_bdfmnru.Active_bdfmnr_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bdfnru, /*unique:*/Active_bdfnru_long, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #reverse r}.*/
	Active_bdfnr_long(
		/*c:*/SortOptionSet_bcdfnru.Active_bcdfnr, /*check:*/SortOptionSet_bcdfnru.Active_bcdfnr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfmnru.Active_bdfmnr, /*merge:*/SortOptionSet_bdfmnru.Active_bdfmnr_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bdfnru, /*unique:*/Active_bdfnru_long, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #unique u}.*/
	Active_bdnu(
		/*c:*/SortOptionSet_bcdfnru.Active_bcdnu, /*check:*/SortOptionSet_bcdfnru.Active_bcdnu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_bdfnu, /*ignoreCase:*/Active_bdfnu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfmnru.Active_bdmnu, /*merge:*/SortOptionSet_bdfmnru.Active_bdmnu_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bdnru, /*reverse:*/Active_bdnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #unique u}.*/
	Active_bdnu_long(
		/*c:*/SortOptionSet_bcdfnru.Active_bcdnu, /*check:*/SortOptionSet_bcdfnru.Active_bcdnu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_bdfnu, /*ignoreCase:*/Active_bdfnu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfmnru.Active_bdmnu, /*merge:*/SortOptionSet_bdfmnru.Active_bdmnu_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bdnru, /*reverse:*/Active_bdnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #unique u}.*/
	Active_bfnu(
		/*c:*/SortOptionSet_bcdfnru.Active_bcfnu, /*check:*/SortOptionSet_bcdfnru.Active_bcfnu_long, /*d:*/Active_bdfnu, /*dictionaryOrder:*/Active_bdfnu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfmnru.Active_bfmnu, /*merge:*/SortOptionSet_bdfmnru.Active_bfmnu_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bfnru, /*reverse:*/Active_bfnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #unique u}.*/
	Active_bfnu_long(
		/*c:*/SortOptionSet_bcdfnru.Active_bcfnu, /*check:*/SortOptionSet_bcdfnru.Active_bcfnu_long, /*d:*/Active_bdfnu, /*dictionaryOrder:*/Active_bdfnu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfmnru.Active_bfmnu, /*merge:*/SortOptionSet_bdfmnru.Active_bfmnu_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bfnru, /*reverse:*/Active_bfnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.*/
	Active_bnru(
		/*c:*/SortOptionSet_bcdfnru.Active_bcnru, /*check:*/SortOptionSet_bcdfnru.Active_bcnru_long, /*d:*/Active_bdnru, /*dictionaryOrder:*/Active_bdnru_long, /*f:*/Active_bfnru, /*ignoreCase:*/Active_bfnru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfmnru.Active_bmnru, /*merge:*/SortOptionSet_bdfmnru.Active_bmnru_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.*/
	Active_bnru_long(
		/*c:*/SortOptionSet_bcdfnru.Active_bcnru, /*check:*/SortOptionSet_bcdfnru.Active_bcnru_long, /*d:*/Active_bdnru, /*dictionaryOrder:*/Active_bdnru_long, /*f:*/Active_bfnru, /*ignoreCase:*/Active_bfnru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfmnru.Active_bmnru, /*merge:*/SortOptionSet_bdfmnru.Active_bmnru_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #numericSort n}, {@link #unique u}.*/
	Active_dfnu(
		/*c:*/SortOptionSet_bcdfnru.Active_cdfnu, /*check:*/SortOptionSet_bcdfnru.Active_cdfnu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfnu, /*ignoreLeadingBlanks:*/Active_bdfnu_long, /*m:*/SortOptionSet_bdfmnru.Active_dfmnu, /*merge:*/SortOptionSet_bdfmnru.Active_dfmnu_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_dfnru, /*reverse:*/Active_dfnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.numericSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #numericSort n}, {@link #unique u}.*/
	Active_dfnu_long(
		/*c:*/SortOptionSet_bcdfnru.Active_cdfnu, /*check:*/SortOptionSet_bcdfnru.Active_cdfnu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfnu, /*ignoreLeadingBlanks:*/Active_bdfnu_long, /*m:*/SortOptionSet_bdfmnru.Active_dfmnu, /*merge:*/SortOptionSet_bdfmnru.Active_dfmnu_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_dfnru, /*reverse:*/Active_dfnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.numericSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.*/
	Active_dnru(
		/*c:*/SortOptionSet_bcdfnru.Active_cdnru, /*check:*/SortOptionSet_bcdfnru.Active_cdnru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_dfnru, /*ignoreCase:*/Active_dfnru_long, /*b:*/Active_bdnru, /*ignoreLeadingBlanks:*/Active_bdnru_long, /*m:*/SortOptionSet_bdfmnru.Active_dmnru, /*merge:*/SortOptionSet_bdfmnru.Active_dmnru_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.numericSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.*/
	Active_dnru_long(
		/*c:*/SortOptionSet_bcdfnru.Active_cdnru, /*check:*/SortOptionSet_bcdfnru.Active_cdnru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_dfnru, /*ignoreCase:*/Active_dfnru_long, /*b:*/Active_bdnru, /*ignoreLeadingBlanks:*/Active_bdnru_long, /*m:*/SortOptionSet_bdfmnru.Active_dmnru, /*merge:*/SortOptionSet_bdfmnru.Active_dmnru_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.numericSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #ignoreCase f}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.*/
	Active_fnru(
		/*c:*/SortOptionSet_bcdfnru.Active_cfnru, /*check:*/SortOptionSet_bcdfnru.Active_cfnru_long, /*d:*/Active_dfnru, /*dictionaryOrder:*/Active_dfnru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfnru, /*ignoreLeadingBlanks:*/Active_bfnru_long, /*m:*/SortOptionSet_bdfmnru.Active_fmnru, /*merge:*/SortOptionSet_bdfmnru.Active_fmnru_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.ignoreCase, SortOption.numericSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #ignoreCase f}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.*/
	Active_fnru_long(
		/*c:*/SortOptionSet_bcdfnru.Active_cfnru, /*check:*/SortOptionSet_bcdfnru.Active_cfnru_long, /*d:*/Active_dfnru, /*dictionaryOrder:*/Active_dfnru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfnru, /*ignoreLeadingBlanks:*/Active_bfnru_long, /*m:*/SortOptionSet_bdfmnru.Active_fmnru, /*merge:*/SortOptionSet_bdfmnru.Active_fmnru_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.ignoreCase, SortOption.numericSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}.*/
	Active_bdfn(
		/*c:*/SortOptionSet_bcdfnru.Active_bcdfn, /*check:*/SortOptionSet_bcdfnru.Active_bcdfn_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfmnru.Active_bdfmn, /*merge:*/SortOptionSet_bdfmnru.Active_bdfmn_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bdfnr, /*reverse:*/Active_bdfnr_long, /*u:*/Active_bdfnu, /*unique:*/Active_bdfnu_long, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.numericSort
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}.*/
	Active_bdfn_long(
		/*c:*/SortOptionSet_bcdfnru.Active_bcdfn, /*check:*/SortOptionSet_bcdfnru.Active_bcdfn_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfmnru.Active_bdfmn, /*merge:*/SortOptionSet_bdfmnru.Active_bdfmn_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bdfnr, /*reverse:*/Active_bdfnr_long, /*u:*/Active_bdfnu, /*unique:*/Active_bdfnu_long, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.numericSort
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #reverse r}.*/
	Active_bdnr(
		/*c:*/SortOptionSet_bcdfnru.Active_bcdnr, /*check:*/SortOptionSet_bcdfnru.Active_bcdnr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_bdfnr, /*ignoreCase:*/Active_bdfnr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfmnru.Active_bdmnr, /*merge:*/SortOptionSet_bdfmnru.Active_bdmnr_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bdnru, /*unique:*/Active_bdnru_long, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #reverse r}.*/
	Active_bdnr_long(
		/*c:*/SortOptionSet_bcdfnru.Active_bcdnr, /*check:*/SortOptionSet_bcdfnru.Active_bcdnr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_bdfnr, /*ignoreCase:*/Active_bdfnr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfmnru.Active_bdmnr, /*merge:*/SortOptionSet_bdfmnru.Active_bdmnr_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bdnru, /*unique:*/Active_bdnru_long, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #reverse r}.*/
	Active_bfnr(
		/*c:*/SortOptionSet_bcdfnru.Active_bcfnr, /*check:*/SortOptionSet_bcdfnru.Active_bcfnr_long, /*d:*/Active_bdfnr, /*dictionaryOrder:*/Active_bdfnr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfmnru.Active_bfmnr, /*merge:*/SortOptionSet_bdfmnru.Active_bfmnr_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bfnru, /*unique:*/Active_bfnru_long, 
		true, 
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #reverse r}.*/
	Active_bfnr_long(
		/*c:*/SortOptionSet_bcdfnru.Active_bcfnr, /*check:*/SortOptionSet_bcdfnru.Active_bcfnr_long, /*d:*/Active_bdfnr, /*dictionaryOrder:*/Active_bdfnr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfmnru.Active_bfmnr, /*merge:*/SortOptionSet_bdfmnru.Active_bfmnr_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bfnru, /*unique:*/Active_bfnru_long, 
		false, 
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #numericSort n}, {@link #reverse r}.*/
	Active_dfnr(
		/*c:*/SortOptionSet_bcdfnru.Active_cdfnr, /*check:*/SortOptionSet_bcdfnru.Active_cdfnr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfnr, /*ignoreLeadingBlanks:*/Active_bdfnr_long, /*m:*/SortOptionSet_bdfmnru.Active_dfmnr, /*merge:*/SortOptionSet_bdfmnru.Active_dfmnr_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_dfnru, /*unique:*/Active_dfnru_long, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.numericSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #numericSort n}, {@link #reverse r}.*/
	Active_dfnr_long(
		/*c:*/SortOptionSet_bcdfnru.Active_cdfnr, /*check:*/SortOptionSet_bcdfnru.Active_cdfnr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfnr, /*ignoreLeadingBlanks:*/Active_bdfnr_long, /*m:*/SortOptionSet_bdfmnru.Active_dfmnr, /*merge:*/SortOptionSet_bdfmnru.Active_dfmnr_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_dfnru, /*unique:*/Active_dfnru_long, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.numericSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #unique u}.*/
	Active_bnu(
		/*c:*/SortOptionSet_bcdfnru.Active_bcnu, /*check:*/SortOptionSet_bcdfnru.Active_bcnu_long, /*d:*/Active_bdnu, /*dictionaryOrder:*/Active_bdnu_long, /*f:*/Active_bfnu, /*ignoreCase:*/Active_bfnu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfmnru.Active_bmnu, /*merge:*/SortOptionSet_bdfmnru.Active_bmnu_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bnru, /*reverse:*/Active_bnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #unique u}.*/
	Active_bnu_long(
		/*c:*/SortOptionSet_bcdfnru.Active_bcnu, /*check:*/SortOptionSet_bcdfnru.Active_bcnu_long, /*d:*/Active_bdnu, /*dictionaryOrder:*/Active_bdnu_long, /*f:*/Active_bfnu, /*ignoreCase:*/Active_bfnu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfmnru.Active_bmnu, /*merge:*/SortOptionSet_bdfmnru.Active_bmnu_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bnru, /*reverse:*/Active_bnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #numericSort n}, {@link #unique u}.*/
	Active_dnu(
		/*c:*/SortOptionSet_bcdfnru.Active_cdnu, /*check:*/SortOptionSet_bcdfnru.Active_cdnu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_dfnu, /*ignoreCase:*/Active_dfnu_long, /*b:*/Active_bdnu, /*ignoreLeadingBlanks:*/Active_bdnu_long, /*m:*/SortOptionSet_bdfmnru.Active_dmnu, /*merge:*/SortOptionSet_bdfmnru.Active_dmnu_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_dnru, /*reverse:*/Active_dnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.numericSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #numericSort n}, {@link #unique u}.*/
	Active_dnu_long(
		/*c:*/SortOptionSet_bcdfnru.Active_cdnu, /*check:*/SortOptionSet_bcdfnru.Active_cdnu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_dfnu, /*ignoreCase:*/Active_dfnu_long, /*b:*/Active_bdnu, /*ignoreLeadingBlanks:*/Active_bdnu_long, /*m:*/SortOptionSet_bdfmnru.Active_dmnu, /*merge:*/SortOptionSet_bdfmnru.Active_dmnu_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_dnru, /*reverse:*/Active_dnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.numericSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #ignoreCase f}, {@link #numericSort n}, {@link #unique u}.*/
	Active_fnu(
		/*c:*/SortOptionSet_bcdfnru.Active_cfnu, /*check:*/SortOptionSet_bcdfnru.Active_cfnu_long, /*d:*/Active_dfnu, /*dictionaryOrder:*/Active_dfnu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfnu, /*ignoreLeadingBlanks:*/Active_bfnu_long, /*m:*/SortOptionSet_bdfmnru.Active_fmnu, /*merge:*/SortOptionSet_bdfmnru.Active_fmnu_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_fnru, /*reverse:*/Active_fnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.ignoreCase, SortOption.numericSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #ignoreCase f}, {@link #numericSort n}, {@link #unique u}.*/
	Active_fnu_long(
		/*c:*/SortOptionSet_bcdfnru.Active_cfnu, /*check:*/SortOptionSet_bcdfnru.Active_cfnu_long, /*d:*/Active_dfnu, /*dictionaryOrder:*/Active_dfnu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfnu, /*ignoreLeadingBlanks:*/Active_bfnu_long, /*m:*/SortOptionSet_bdfmnru.Active_fmnu, /*merge:*/SortOptionSet_bdfmnru.Active_fmnu_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_fnru, /*reverse:*/Active_fnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.ignoreCase, SortOption.numericSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.*/
	Active_nru(
		/*c:*/SortOptionSet_bcdfnru.Active_cnru, /*check:*/SortOptionSet_bcdfnru.Active_cnru_long, /*d:*/Active_dnru, /*dictionaryOrder:*/Active_dnru_long, /*f:*/Active_fnru, /*ignoreCase:*/Active_fnru_long, /*b:*/Active_bnru, /*ignoreLeadingBlanks:*/Active_bnru_long, /*m:*/SortOptionSet_bdfmnru.Active_mnru, /*merge:*/SortOptionSet_bdfmnru.Active_mnru_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.numericSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.*/
	Active_nru_long(
		/*c:*/SortOptionSet_bcdfnru.Active_cnru, /*check:*/SortOptionSet_bcdfnru.Active_cnru_long, /*d:*/Active_dnru, /*dictionaryOrder:*/Active_dnru_long, /*f:*/Active_fnru, /*ignoreCase:*/Active_fnru_long, /*b:*/Active_bnru, /*ignoreLeadingBlanks:*/Active_bnru_long, /*m:*/SortOptionSet_bdfmnru.Active_mnru, /*merge:*/SortOptionSet_bdfmnru.Active_mnru_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.numericSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}.*/
	Active_bdn(
		/*c:*/SortOptionSet_bcdfnru.Active_bcdn, /*check:*/SortOptionSet_bcdfnru.Active_bcdn_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_bdfn, /*ignoreCase:*/Active_bdfn_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfmnru.Active_bdmn, /*merge:*/SortOptionSet_bdfmnru.Active_bdmn_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bdnr, /*reverse:*/Active_bdnr_long, /*u:*/Active_bdnu, /*unique:*/Active_bdnu_long, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.numericSort
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}.*/
	Active_bdn_long(
		/*c:*/SortOptionSet_bcdfnru.Active_bcdn, /*check:*/SortOptionSet_bcdfnru.Active_bcdn_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_bdfn, /*ignoreCase:*/Active_bdfn_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfmnru.Active_bdmn, /*merge:*/SortOptionSet_bdfmnru.Active_bdmn_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bdnr, /*reverse:*/Active_bdnr_long, /*u:*/Active_bdnu, /*unique:*/Active_bdnu_long, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.numericSort
	),
	/** Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}.*/
	Active_bfn(
		/*c:*/SortOptionSet_bcdfnru.Active_bcfn, /*check:*/SortOptionSet_bcdfnru.Active_bcfn_long, /*d:*/Active_bdfn, /*dictionaryOrder:*/Active_bdfn_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfmnru.Active_bfmn, /*merge:*/SortOptionSet_bdfmnru.Active_bfmn_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bfnr, /*reverse:*/Active_bfnr_long, /*u:*/Active_bfnu, /*unique:*/Active_bfnu_long, 
		true, 
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.numericSort
	),
	/** Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}.*/
	Active_bfn_long(
		/*c:*/SortOptionSet_bcdfnru.Active_bcfn, /*check:*/SortOptionSet_bcdfnru.Active_bcfn_long, /*d:*/Active_bdfn, /*dictionaryOrder:*/Active_bdfn_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfmnru.Active_bfmn, /*merge:*/SortOptionSet_bdfmnru.Active_bfmn_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bfnr, /*reverse:*/Active_bfnr_long, /*u:*/Active_bfnu, /*unique:*/Active_bfnu_long, 
		false, 
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.numericSort
	),
	/** Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #reverse r}.*/
	Active_bnr(
		/*c:*/SortOptionSet_bcdfnru.Active_bcnr, /*check:*/SortOptionSet_bcdfnru.Active_bcnr_long, /*d:*/Active_bdnr, /*dictionaryOrder:*/Active_bdnr_long, /*f:*/Active_bfnr, /*ignoreCase:*/Active_bfnr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfmnru.Active_bmnr, /*merge:*/SortOptionSet_bdfmnru.Active_bmnr_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bnru, /*unique:*/Active_bnru_long, 
		true, 
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #reverse r}.*/
	Active_bnr_long(
		/*c:*/SortOptionSet_bcdfnru.Active_bcnr, /*check:*/SortOptionSet_bcdfnru.Active_bcnr_long, /*d:*/Active_bdnr, /*dictionaryOrder:*/Active_bdnr_long, /*f:*/Active_bfnr, /*ignoreCase:*/Active_bfnr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfmnru.Active_bmnr, /*merge:*/SortOptionSet_bdfmnru.Active_bmnr_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bnru, /*unique:*/Active_bnru_long, 
		false, 
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #numericSort n}.*/
	Active_dfn(
		/*c:*/SortOptionSet_bcdfnru.Active_cdfn, /*check:*/SortOptionSet_bcdfnru.Active_cdfn_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfn, /*ignoreLeadingBlanks:*/Active_bdfn_long, /*m:*/SortOptionSet_bdfmnru.Active_dfmn, /*merge:*/SortOptionSet_bdfmnru.Active_dfmn_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_dfnr, /*reverse:*/Active_dfnr_long, /*u:*/Active_dfnu, /*unique:*/Active_dfnu_long, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.numericSort
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #numericSort n}.*/
	Active_dfn_long(
		/*c:*/SortOptionSet_bcdfnru.Active_cdfn, /*check:*/SortOptionSet_bcdfnru.Active_cdfn_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfn, /*ignoreLeadingBlanks:*/Active_bdfn_long, /*m:*/SortOptionSet_bdfmnru.Active_dfmn, /*merge:*/SortOptionSet_bdfmnru.Active_dfmn_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_dfnr, /*reverse:*/Active_dfnr_long, /*u:*/Active_dfnu, /*unique:*/Active_dfnu_long, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.numericSort
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #numericSort n}, {@link #reverse r}.*/
	Active_dnr(
		/*c:*/SortOptionSet_bcdfnru.Active_cdnr, /*check:*/SortOptionSet_bcdfnru.Active_cdnr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_dfnr, /*ignoreCase:*/Active_dfnr_long, /*b:*/Active_bdnr, /*ignoreLeadingBlanks:*/Active_bdnr_long, /*m:*/SortOptionSet_bdfmnru.Active_dmnr, /*merge:*/SortOptionSet_bdfmnru.Active_dmnr_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_dnru, /*unique:*/Active_dnru_long, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.numericSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #numericSort n}, {@link #reverse r}.*/
	Active_dnr_long(
		/*c:*/SortOptionSet_bcdfnru.Active_cdnr, /*check:*/SortOptionSet_bcdfnru.Active_cdnr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_dfnr, /*ignoreCase:*/Active_dfnr_long, /*b:*/Active_bdnr, /*ignoreLeadingBlanks:*/Active_bdnr_long, /*m:*/SortOptionSet_bdfmnru.Active_dmnr, /*merge:*/SortOptionSet_bdfmnru.Active_dmnr_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_dnru, /*unique:*/Active_dnru_long, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.numericSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #ignoreCase f}, {@link #numericSort n}, {@link #reverse r}.*/
	Active_fnr(
		/*c:*/SortOptionSet_bcdfnru.Active_cfnr, /*check:*/SortOptionSet_bcdfnru.Active_cfnr_long, /*d:*/Active_dfnr, /*dictionaryOrder:*/Active_dfnr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfnr, /*ignoreLeadingBlanks:*/Active_bfnr_long, /*m:*/SortOptionSet_bdfmnru.Active_fmnr, /*merge:*/SortOptionSet_bdfmnru.Active_fmnr_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_fnru, /*unique:*/Active_fnru_long, 
		true, 
		/*active:*/SortOption.ignoreCase, SortOption.numericSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #ignoreCase f}, {@link #numericSort n}, {@link #reverse r}.*/
	Active_fnr_long(
		/*c:*/SortOptionSet_bcdfnru.Active_cfnr, /*check:*/SortOptionSet_bcdfnru.Active_cfnr_long, /*d:*/Active_dfnr, /*dictionaryOrder:*/Active_dfnr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfnr, /*ignoreLeadingBlanks:*/Active_bfnr_long, /*m:*/SortOptionSet_bdfmnru.Active_fmnr, /*merge:*/SortOptionSet_bdfmnru.Active_fmnr_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_fnru, /*unique:*/Active_fnru_long, 
		false, 
		/*active:*/SortOption.ignoreCase, SortOption.numericSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #numericSort n}, {@link #unique u}.*/
	Active_nu(
		/*c:*/SortOptionSet_bcdfnru.Active_cnu, /*check:*/SortOptionSet_bcdfnru.Active_cnu_long, /*d:*/Active_dnu, /*dictionaryOrder:*/Active_dnu_long, /*f:*/Active_fnu, /*ignoreCase:*/Active_fnu_long, /*b:*/Active_bnu, /*ignoreLeadingBlanks:*/Active_bnu_long, /*m:*/SortOptionSet_bdfmnru.Active_mnu, /*merge:*/SortOptionSet_bdfmnru.Active_mnu_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_nru, /*reverse:*/Active_nru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.numericSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #numericSort n}, {@link #unique u}.*/
	Active_nu_long(
		/*c:*/SortOptionSet_bcdfnru.Active_cnu, /*check:*/SortOptionSet_bcdfnru.Active_cnu_long, /*d:*/Active_dnu, /*dictionaryOrder:*/Active_dnu_long, /*f:*/Active_fnu, /*ignoreCase:*/Active_fnu_long, /*b:*/Active_bnu, /*ignoreLeadingBlanks:*/Active_bnu_long, /*m:*/SortOptionSet_bdfmnru.Active_mnu, /*merge:*/SortOptionSet_bdfmnru.Active_mnu_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_nru, /*reverse:*/Active_nru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.numericSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #numericSort n}.*/
	Active_bn(
		/*c:*/SortOptionSet_bcdfnru.Active_bcn, /*check:*/SortOptionSet_bcdfnru.Active_bcn_long, /*d:*/Active_bdn, /*dictionaryOrder:*/Active_bdn_long, /*f:*/Active_bfn, /*ignoreCase:*/Active_bfn_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfmnru.Active_bmn, /*merge:*/SortOptionSet_bdfmnru.Active_bmn_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bnr, /*reverse:*/Active_bnr_long, /*u:*/Active_bnu, /*unique:*/Active_bnu_long, 
		true, 
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.numericSort
	),
	/** Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #numericSort n}.*/
	Active_bn_long(
		/*c:*/SortOptionSet_bcdfnru.Active_bcn, /*check:*/SortOptionSet_bcdfnru.Active_bcn_long, /*d:*/Active_bdn, /*dictionaryOrder:*/Active_bdn_long, /*f:*/Active_bfn, /*ignoreCase:*/Active_bfn_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfmnru.Active_bmn, /*merge:*/SortOptionSet_bdfmnru.Active_bmn_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bnr, /*reverse:*/Active_bnr_long, /*u:*/Active_bnu, /*unique:*/Active_bnu_long, 
		false, 
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.numericSort
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #numericSort n}.*/
	Active_dn(
		/*c:*/SortOptionSet_bcdfnru.Active_cdn, /*check:*/SortOptionSet_bcdfnru.Active_cdn_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_dfn, /*ignoreCase:*/Active_dfn_long, /*b:*/Active_bdn, /*ignoreLeadingBlanks:*/Active_bdn_long, /*m:*/SortOptionSet_bdfmnru.Active_dmn, /*merge:*/SortOptionSet_bdfmnru.Active_dmn_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_dnr, /*reverse:*/Active_dnr_long, /*u:*/Active_dnu, /*unique:*/Active_dnu_long, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.numericSort
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #numericSort n}.*/
	Active_dn_long(
		/*c:*/SortOptionSet_bcdfnru.Active_cdn, /*check:*/SortOptionSet_bcdfnru.Active_cdn_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_dfn, /*ignoreCase:*/Active_dfn_long, /*b:*/Active_bdn, /*ignoreLeadingBlanks:*/Active_bdn_long, /*m:*/SortOptionSet_bdfmnru.Active_dmn, /*merge:*/SortOptionSet_bdfmnru.Active_dmn_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_dnr, /*reverse:*/Active_dnr_long, /*u:*/Active_dnu, /*unique:*/Active_dnu_long, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.numericSort
	),
	/** Option set with the following active options: {@link #ignoreCase f}, {@link #numericSort n}.*/
	Active_fn(
		/*c:*/SortOptionSet_bcdfnru.Active_cfn, /*check:*/SortOptionSet_bcdfnru.Active_cfn_long, /*d:*/Active_dfn, /*dictionaryOrder:*/Active_dfn_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfn, /*ignoreLeadingBlanks:*/Active_bfn_long, /*m:*/SortOptionSet_bdfmnru.Active_fmn, /*merge:*/SortOptionSet_bdfmnru.Active_fmn_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_fnr, /*reverse:*/Active_fnr_long, /*u:*/Active_fnu, /*unique:*/Active_fnu_long, 
		true, 
		/*active:*/SortOption.ignoreCase, SortOption.numericSort
	),
	/** Option set with the following active options: {@link #ignoreCase f}, {@link #numericSort n}.*/
	Active_fn_long(
		/*c:*/SortOptionSet_bcdfnru.Active_cfn, /*check:*/SortOptionSet_bcdfnru.Active_cfn_long, /*d:*/Active_dfn, /*dictionaryOrder:*/Active_dfn_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfn, /*ignoreLeadingBlanks:*/Active_bfn_long, /*m:*/SortOptionSet_bdfmnru.Active_fmn, /*merge:*/SortOptionSet_bdfmnru.Active_fmn_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_fnr, /*reverse:*/Active_fnr_long, /*u:*/Active_fnu, /*unique:*/Active_fnu_long, 
		false, 
		/*active:*/SortOption.ignoreCase, SortOption.numericSort
	),
	/** Option set with the following active options: {@link #numericSort n}, {@link #reverse r}.*/
	Active_nr(
		/*c:*/SortOptionSet_bcdfnru.Active_cnr, /*check:*/SortOptionSet_bcdfnru.Active_cnr_long, /*d:*/Active_dnr, /*dictionaryOrder:*/Active_dnr_long, /*f:*/Active_fnr, /*ignoreCase:*/Active_fnr_long, /*b:*/Active_bnr, /*ignoreLeadingBlanks:*/Active_bnr_long, /*m:*/SortOptionSet_bdfmnru.Active_mnr, /*merge:*/SortOptionSet_bdfmnru.Active_mnr_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_nru, /*unique:*/Active_nru_long, 
		true, 
		/*active:*/SortOption.numericSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #numericSort n}, {@link #reverse r}.*/
	Active_nr_long(
		/*c:*/SortOptionSet_bcdfnru.Active_cnr, /*check:*/SortOptionSet_bcdfnru.Active_cnr_long, /*d:*/Active_dnr, /*dictionaryOrder:*/Active_dnr_long, /*f:*/Active_fnr, /*ignoreCase:*/Active_fnr_long, /*b:*/Active_bnr, /*ignoreLeadingBlanks:*/Active_bnr_long, /*m:*/SortOptionSet_bdfmnru.Active_mnr, /*merge:*/SortOptionSet_bdfmnru.Active_mnr_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_nru, /*unique:*/Active_nru_long, 
		false, 
		/*active:*/SortOption.numericSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #numericSort n}.*/
	Active_n(
		/*c:*/SortOptionSet_bcdfnru.Active_cn, /*check:*/SortOptionSet_bcdfnru.Active_cn_long, /*d:*/Active_dn, /*dictionaryOrder:*/Active_dn_long, /*f:*/Active_fn, /*ignoreCase:*/Active_fn_long, /*b:*/Active_bn, /*ignoreLeadingBlanks:*/Active_bn_long, /*m:*/SortOptionSet_bdfmnru.Active_mn, /*merge:*/SortOptionSet_bdfmnru.Active_mn_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_nr, /*reverse:*/Active_nr_long, /*u:*/Active_nu, /*unique:*/Active_nu_long, 
		true, 
		/*active:*/SortOption.numericSort
	),
	/** Option set with the following active options: {@link #numericSort n}.*/
	Active_n_long(
		/*c:*/SortOptionSet_bcdfnru.Active_cn, /*check:*/SortOptionSet_bcdfnru.Active_cn_long, /*d:*/Active_dn, /*dictionaryOrder:*/Active_dn_long, /*f:*/Active_fn, /*ignoreCase:*/Active_fn_long, /*b:*/Active_bn, /*ignoreLeadingBlanks:*/Active_bn_long, /*m:*/SortOptionSet_bdfmnru.Active_mn, /*merge:*/SortOptionSet_bdfmnru.Active_mn_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_nr, /*reverse:*/Active_nr_long, /*u:*/Active_nu, /*unique:*/Active_nu_long, 
		false, 
		/*active:*/SortOption.numericSort
	);
	private SortOptionSet_bcdfmnru(
		SortOptionSet_bcdfnru c, SortOptionSet_bcdfnru check, SortOptionSet_bcdfmnru d, SortOptionSet_bcdfmnru dictionaryOrder, SortOptionSet_bcdfmnru f, SortOptionSet_bcdfmnru ignoreCase, SortOptionSet_bcdfmnru b, SortOptionSet_bcdfmnru ignoreLeadingBlanks, SortOptionSet_bdfmnru m, SortOptionSet_bdfmnru merge, SortOptionSet_bcdfmnru n, SortOptionSet_bcdfmnru numericSort, SortOptionSet_bcdfmnru r, SortOptionSet_bcdfmnru reverse, SortOptionSet_bcdfmnru u, SortOptionSet_bcdfmnru unique, 
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
		this.n = n == null ? this : n;
		this.numericSort = numericSort == null ? this : numericSort;
		this.r = r == null ? this : r;
		this.reverse = reverse == null ? this : reverse;
		this.u = u == null ? this : u;
		this.unique = unique == null ? this : unique;
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
	public final SortOptionSet_bcdfnru c;
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
	public final SortOptionSet_bcdfnru check;
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
	public final SortOptionSet_bcdfmnru d;
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
	public final SortOptionSet_bcdfmnru dictionaryOrder;
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
	public final SortOptionSet_bcdfmnru f;
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
	public final SortOptionSet_bcdfmnru ignoreCase;
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
	public final SortOptionSet_bcdfmnru b;
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
	public final SortOptionSet_bcdfmnru ignoreLeadingBlanks;
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
	public final SortOptionSet_bcdfmnru n;
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
	public final SortOptionSet_bcdfmnru r;
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
	public final SortOptionSet_bcdfmnru reverse;
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
	public final SortOptionSet_bcdfmnru u;
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
	public final SortOptionSet_bcdfmnru unique;
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
	 *    SortOptionSet_bcdfmnru.check.d;
	 * </pre>
	 * uses acronyms, that is, this method always returns true for the above 
	 * set. 
	 * <p>
	 * On the other hand, long option names are used and this method always 
	 * returns false for the set
	 * <pre>
	 *    SortOptionSet_bcdfmnru.c.dictionaryOrder;
	 * </pre>
	 * <p>
	 * Note that a repeated option is <i>not</i> treated as the last set option.
	 * For instance, the first and last option of the following set are 
	 * equivalent and acronyms are used:
	 * <pre>
	 *    SortOptionSet_bcdfmnru.c.d.check;
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
