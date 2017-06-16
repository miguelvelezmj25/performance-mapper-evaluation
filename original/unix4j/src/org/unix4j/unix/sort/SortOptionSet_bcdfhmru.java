package org.unix4j.unix.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import org.unix4j.option.Option;

import org.unix4j.unix.Sort;

/**
 * Option sets for the {@link Sort sort} command with 
 * the following options: {@link #c c}, {@link #d d}, {@link #h h}, {@link #f f}, {@link #b b}, {@link #m m}, {@link #r r}, {@link #u u}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Sort#Options} should be used instead to specify command 
 * options. See also {@link org.unix4j.unix.sort.SortOptions} for more information.
 */
public enum SortOptionSet_bcdfhmru implements SortOptions {
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.*/
	Active_bdfhru(
		/*c:*/SortOptionSet_bcdfhru.Active_bcdfhru, /*check:*/SortOptionSet_bcdfhru.Active_bcdfhru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfhmru.Active_bdfhmru, /*merge:*/SortOptionSet_bdfhmru.Active_bdfhmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.*/
	Active_bdfhru_long(
		/*c:*/SortOptionSet_bcdfhru.Active_bcdfhru, /*check:*/SortOptionSet_bcdfhru.Active_bcdfhru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfhmru.Active_bdfhmru, /*merge:*/SortOptionSet_bdfhmru.Active_bdfhmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.*/
	Active_bdfhu(
		/*c:*/SortOptionSet_bcdfhru.Active_bcdfhu, /*check:*/SortOptionSet_bcdfhru.Active_bcdfhu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfhmru.Active_bdfhmu, /*merge:*/SortOptionSet_bdfhmru.Active_bdfhmu_long, /*r:*/Active_bdfhru, /*reverse:*/Active_bdfhru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.*/
	Active_bdfhu_long(
		/*c:*/SortOptionSet_bcdfhru.Active_bcdfhu, /*check:*/SortOptionSet_bcdfhru.Active_bcdfhu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfhmru.Active_bdfhmu, /*merge:*/SortOptionSet_bdfhmru.Active_bdfhmu_long, /*r:*/Active_bdfhru, /*reverse:*/Active_bdfhru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.*/
	Active_bdhru(
		/*c:*/SortOptionSet_bcdfhru.Active_bcdhru, /*check:*/SortOptionSet_bcdfhru.Active_bcdhru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bdfhru, /*ignoreCase:*/Active_bdfhru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfhmru.Active_bdhmru, /*merge:*/SortOptionSet_bdfhmru.Active_bdhmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.*/
	Active_bdhru_long(
		/*c:*/SortOptionSet_bcdfhru.Active_bcdhru, /*check:*/SortOptionSet_bcdfhru.Active_bcdhru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bdfhru, /*ignoreCase:*/Active_bdfhru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfhmru.Active_bdhmru, /*merge:*/SortOptionSet_bdfhmru.Active_bdhmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.*/
	Active_bfhru(
		/*c:*/SortOptionSet_bcdfhru.Active_bcfhru, /*check:*/SortOptionSet_bcdfhru.Active_bcfhru_long, /*d:*/Active_bdfhru, /*dictionaryOrder:*/Active_bdfhru_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfhmru.Active_bfhmru, /*merge:*/SortOptionSet_bdfhmru.Active_bfhmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.*/
	Active_bfhru_long(
		/*c:*/SortOptionSet_bcdfhru.Active_bcfhru, /*check:*/SortOptionSet_bcdfhru.Active_bcfhru_long, /*d:*/Active_bdfhru, /*dictionaryOrder:*/Active_bdfhru_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfhmru.Active_bfhmru, /*merge:*/SortOptionSet_bdfhmru.Active_bfhmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #reverse r}, {@link #unique u}.*/
	Active_dfhru(
		/*c:*/SortOptionSet_bcdfhru.Active_cdfhru, /*check:*/SortOptionSet_bcdfhru.Active_cdfhru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfhru, /*ignoreLeadingBlanks:*/Active_bdfhru_long, /*m:*/SortOptionSet_bdfhmru.Active_dfhmru, /*merge:*/SortOptionSet_bdfhmru.Active_dfhmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #reverse r}, {@link #unique u}.*/
	Active_dfhru_long(
		/*c:*/SortOptionSet_bcdfhru.Active_cdfhru, /*check:*/SortOptionSet_bcdfhru.Active_cdfhru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfhru, /*ignoreLeadingBlanks:*/Active_bdfhru_long, /*m:*/SortOptionSet_bdfhmru.Active_dfhmru, /*merge:*/SortOptionSet_bdfhmru.Active_dfhmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.*/
	Active_bdfhr(
		/*c:*/SortOptionSet_bcdfhru.Active_bcdfhr, /*check:*/SortOptionSet_bcdfhru.Active_bcdfhr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfhmru.Active_bdfhmr, /*merge:*/SortOptionSet_bdfhmru.Active_bdfhmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bdfhru, /*unique:*/Active_bdfhru_long, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.*/
	Active_bdfhr_long(
		/*c:*/SortOptionSet_bcdfhru.Active_bcdfhr, /*check:*/SortOptionSet_bcdfhru.Active_bcdfhr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfhmru.Active_bdfhmr, /*merge:*/SortOptionSet_bdfhmru.Active_bdfhmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bdfhru, /*unique:*/Active_bdfhru_long, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.*/
	Active_bdhu(
		/*c:*/SortOptionSet_bcdfhru.Active_bcdhu, /*check:*/SortOptionSet_bcdfhru.Active_bcdhu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bdfhu, /*ignoreCase:*/Active_bdfhu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfhmru.Active_bdhmu, /*merge:*/SortOptionSet_bdfhmru.Active_bdhmu_long, /*r:*/Active_bdhru, /*reverse:*/Active_bdhru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.*/
	Active_bdhu_long(
		/*c:*/SortOptionSet_bcdfhru.Active_bcdhu, /*check:*/SortOptionSet_bcdfhru.Active_bcdhu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bdfhu, /*ignoreCase:*/Active_bdfhu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfhmru.Active_bdhmu, /*merge:*/SortOptionSet_bdfhmru.Active_bdhmu_long, /*r:*/Active_bdhru, /*reverse:*/Active_bdhru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks, SortOption.unique
	),
	/** Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.*/
	Active_bfhu(
		/*c:*/SortOptionSet_bcdfhru.Active_bcfhu, /*check:*/SortOptionSet_bcdfhru.Active_bcfhu_long, /*d:*/Active_bdfhu, /*dictionaryOrder:*/Active_bdfhu_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfhmru.Active_bfhmu, /*merge:*/SortOptionSet_bdfhmru.Active_bfhmu_long, /*r:*/Active_bfhru, /*reverse:*/Active_bfhru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.unique
	),
	/** Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.*/
	Active_bfhu_long(
		/*c:*/SortOptionSet_bcdfhru.Active_bcfhu, /*check:*/SortOptionSet_bcdfhru.Active_bcfhu_long, /*d:*/Active_bdfhu, /*dictionaryOrder:*/Active_bdfhu_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfhmru.Active_bfhmu, /*merge:*/SortOptionSet_bdfhmru.Active_bfhmu_long, /*r:*/Active_bfhru, /*reverse:*/Active_bfhru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.unique
	),
	/** Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.*/
	Active_bhru(
		/*c:*/SortOptionSet_bcdfhru.Active_bchru, /*check:*/SortOptionSet_bcdfhru.Active_bchru_long, /*d:*/Active_bdhru, /*dictionaryOrder:*/Active_bdhru_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bfhru, /*ignoreCase:*/Active_bfhru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfhmru.Active_bhmru, /*merge:*/SortOptionSet_bdfhmru.Active_bhmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.*/
	Active_bhru_long(
		/*c:*/SortOptionSet_bcdfhru.Active_bchru, /*check:*/SortOptionSet_bcdfhru.Active_bchru_long, /*d:*/Active_bdhru, /*dictionaryOrder:*/Active_bdhru_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bfhru, /*ignoreCase:*/Active_bfhru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfhmru.Active_bhmru, /*merge:*/SortOptionSet_bdfhmru.Active_bhmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #unique u}.*/
	Active_dfhu(
		/*c:*/SortOptionSet_bcdfhru.Active_cdfhu, /*check:*/SortOptionSet_bcdfhru.Active_cdfhu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfhu, /*ignoreLeadingBlanks:*/Active_bdfhu_long, /*m:*/SortOptionSet_bdfhmru.Active_dfhmu, /*merge:*/SortOptionSet_bdfhmru.Active_dfhmu_long, /*r:*/Active_dfhru, /*reverse:*/Active_dfhru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #unique u}.*/
	Active_dfhu_long(
		/*c:*/SortOptionSet_bcdfhru.Active_cdfhu, /*check:*/SortOptionSet_bcdfhru.Active_cdfhu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfhu, /*ignoreLeadingBlanks:*/Active_bdfhu_long, /*m:*/SortOptionSet_bdfhmru.Active_dfhmu, /*merge:*/SortOptionSet_bdfhmru.Active_dfhmu_long, /*r:*/Active_dfhru, /*reverse:*/Active_dfhru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #reverse r}, {@link #unique u}.*/
	Active_dhru(
		/*c:*/SortOptionSet_bcdfhru.Active_cdhru, /*check:*/SortOptionSet_bcdfhru.Active_cdhru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_dfhru, /*ignoreCase:*/Active_dfhru_long, /*b:*/Active_bdhru, /*ignoreLeadingBlanks:*/Active_bdhru_long, /*m:*/SortOptionSet_bdfhmru.Active_dhmru, /*merge:*/SortOptionSet_bdfhmru.Active_dhmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #reverse r}, {@link #unique u}.*/
	Active_dhru_long(
		/*c:*/SortOptionSet_bcdfhru.Active_cdhru, /*check:*/SortOptionSet_bcdfhru.Active_cdhru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_dfhru, /*ignoreCase:*/Active_dfhru_long, /*b:*/Active_bdhru, /*ignoreLeadingBlanks:*/Active_bdhru_long, /*m:*/SortOptionSet_bdfhmru.Active_dhmru, /*merge:*/SortOptionSet_bdfhmru.Active_dhmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #reverse r}, {@link #unique u}.*/
	Active_fhru(
		/*c:*/SortOptionSet_bcdfhru.Active_cfhru, /*check:*/SortOptionSet_bcdfhru.Active_cfhru_long, /*d:*/Active_dfhru, /*dictionaryOrder:*/Active_dfhru_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfhru, /*ignoreLeadingBlanks:*/Active_bfhru_long, /*m:*/SortOptionSet_bdfhmru.Active_fhmru, /*merge:*/SortOptionSet_bdfhmru.Active_fhmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #reverse r}, {@link #unique u}.*/
	Active_fhru_long(
		/*c:*/SortOptionSet_bcdfhru.Active_cfhru, /*check:*/SortOptionSet_bcdfhru.Active_cfhru_long, /*d:*/Active_dfhru, /*dictionaryOrder:*/Active_dfhru_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfhru, /*ignoreLeadingBlanks:*/Active_bfhru_long, /*m:*/SortOptionSet_bdfhmru.Active_fhmru, /*merge:*/SortOptionSet_bdfhmru.Active_fhmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}.*/
	Active_bdfh(
		/*c:*/SortOptionSet_bcdfhru.Active_bcdfh, /*check:*/SortOptionSet_bcdfhru.Active_bcdfh_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfhmru.Active_bdfhm, /*merge:*/SortOptionSet_bdfhmru.Active_bdfhm_long, /*r:*/Active_bdfhr, /*reverse:*/Active_bdfhr_long, /*u:*/Active_bdfhu, /*unique:*/Active_bdfhu_long, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}.*/
	Active_bdfh_long(
		/*c:*/SortOptionSet_bcdfhru.Active_bcdfh, /*check:*/SortOptionSet_bcdfhru.Active_bcdfh_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfhmru.Active_bdfhm, /*merge:*/SortOptionSet_bdfhmru.Active_bdfhm_long, /*r:*/Active_bdfhr, /*reverse:*/Active_bdfhr_long, /*u:*/Active_bdfhu, /*unique:*/Active_bdfhu_long, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.*/
	Active_bdhr(
		/*c:*/SortOptionSet_bcdfhru.Active_bcdhr, /*check:*/SortOptionSet_bcdfhru.Active_bcdhr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bdfhr, /*ignoreCase:*/Active_bdfhr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfhmru.Active_bdhmr, /*merge:*/SortOptionSet_bdfhmru.Active_bdhmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bdhru, /*unique:*/Active_bdhru_long, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks, SortOption.reverse
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.*/
	Active_bdhr_long(
		/*c:*/SortOptionSet_bcdfhru.Active_bcdhr, /*check:*/SortOptionSet_bcdfhru.Active_bcdhr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bdfhr, /*ignoreCase:*/Active_bdfhr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfhmru.Active_bdhmr, /*merge:*/SortOptionSet_bdfhmru.Active_bdhmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bdhru, /*unique:*/Active_bdhru_long, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks, SortOption.reverse
	),
	/** Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.*/
	Active_bfhr(
		/*c:*/SortOptionSet_bcdfhru.Active_bcfhr, /*check:*/SortOptionSet_bcdfhru.Active_bcfhr_long, /*d:*/Active_bdfhr, /*dictionaryOrder:*/Active_bdfhr_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfhmru.Active_bfhmr, /*merge:*/SortOptionSet_bdfhmru.Active_bfhmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bfhru, /*unique:*/Active_bfhru_long, 
		true, 
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse
	),
	/** Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.*/
	Active_bfhr_long(
		/*c:*/SortOptionSet_bcdfhru.Active_bcfhr, /*check:*/SortOptionSet_bcdfhru.Active_bcfhr_long, /*d:*/Active_bdfhr, /*dictionaryOrder:*/Active_bdfhr_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfhmru.Active_bfhmr, /*merge:*/SortOptionSet_bdfhmru.Active_bfhmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bfhru, /*unique:*/Active_bfhru_long, 
		false, 
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #reverse r}.*/
	Active_dfhr(
		/*c:*/SortOptionSet_bcdfhru.Active_cdfhr, /*check:*/SortOptionSet_bcdfhru.Active_cdfhr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfhr, /*ignoreLeadingBlanks:*/Active_bdfhr_long, /*m:*/SortOptionSet_bdfhmru.Active_dfhmr, /*merge:*/SortOptionSet_bdfhmru.Active_dfhmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_dfhru, /*unique:*/Active_dfhru_long, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.reverse
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #reverse r}.*/
	Active_dfhr_long(
		/*c:*/SortOptionSet_bcdfhru.Active_cdfhr, /*check:*/SortOptionSet_bcdfhru.Active_cdfhr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfhr, /*ignoreLeadingBlanks:*/Active_bdfhr_long, /*m:*/SortOptionSet_bdfhmru.Active_dfhmr, /*merge:*/SortOptionSet_bdfhmru.Active_dfhmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_dfhru, /*unique:*/Active_dfhru_long, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.reverse
	),
	/** Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.*/
	Active_bhu(
		/*c:*/SortOptionSet_bcdfhru.Active_bchu, /*check:*/SortOptionSet_bcdfhru.Active_bchu_long, /*d:*/Active_bdhu, /*dictionaryOrder:*/Active_bdhu_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bfhu, /*ignoreCase:*/Active_bfhu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfhmru.Active_bhmu, /*merge:*/SortOptionSet_bdfhmru.Active_bhmu_long, /*r:*/Active_bhru, /*reverse:*/Active_bhru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks, SortOption.unique
	),
	/** Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.*/
	Active_bhu_long(
		/*c:*/SortOptionSet_bcdfhru.Active_bchu, /*check:*/SortOptionSet_bcdfhru.Active_bchu_long, /*d:*/Active_bdhu, /*dictionaryOrder:*/Active_bdhu_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bfhu, /*ignoreCase:*/Active_bfhu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfhmru.Active_bhmu, /*merge:*/SortOptionSet_bdfhmru.Active_bhmu_long, /*r:*/Active_bhru, /*reverse:*/Active_bhru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #unique u}.*/
	Active_dhu(
		/*c:*/SortOptionSet_bcdfhru.Active_cdhu, /*check:*/SortOptionSet_bcdfhru.Active_cdhu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_dfhu, /*ignoreCase:*/Active_dfhu_long, /*b:*/Active_bdhu, /*ignoreLeadingBlanks:*/Active_bdhu_long, /*m:*/SortOptionSet_bdfhmru.Active_dhmu, /*merge:*/SortOptionSet_bdfhmru.Active_dhmu_long, /*r:*/Active_dhru, /*reverse:*/Active_dhru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #unique u}.*/
	Active_dhu_long(
		/*c:*/SortOptionSet_bcdfhru.Active_cdhu, /*check:*/SortOptionSet_bcdfhru.Active_cdhu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_dfhu, /*ignoreCase:*/Active_dfhu_long, /*b:*/Active_bdhu, /*ignoreLeadingBlanks:*/Active_bdhu_long, /*m:*/SortOptionSet_bdfhmru.Active_dhmu, /*merge:*/SortOptionSet_bdfhmru.Active_dhmu_long, /*r:*/Active_dhru, /*reverse:*/Active_dhru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #unique u}.*/
	Active_fhu(
		/*c:*/SortOptionSet_bcdfhru.Active_cfhu, /*check:*/SortOptionSet_bcdfhru.Active_cfhu_long, /*d:*/Active_dfhu, /*dictionaryOrder:*/Active_dfhu_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfhu, /*ignoreLeadingBlanks:*/Active_bfhu_long, /*m:*/SortOptionSet_bdfhmru.Active_fhmu, /*merge:*/SortOptionSet_bdfhmru.Active_fhmu_long, /*r:*/Active_fhru, /*reverse:*/Active_fhru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.unique
	),
	/** Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #unique u}.*/
	Active_fhu_long(
		/*c:*/SortOptionSet_bcdfhru.Active_cfhu, /*check:*/SortOptionSet_bcdfhru.Active_cfhu_long, /*d:*/Active_dfhu, /*dictionaryOrder:*/Active_dfhu_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfhu, /*ignoreLeadingBlanks:*/Active_bfhu_long, /*m:*/SortOptionSet_bdfhmru.Active_fhmu, /*merge:*/SortOptionSet_bdfhmru.Active_fhmu_long, /*r:*/Active_fhru, /*reverse:*/Active_fhru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.unique
	),
	/** Option set with the following active options: {@link #humanNumericSort h}, {@link #reverse r}, {@link #unique u}.*/
	Active_hru(
		/*c:*/SortOptionSet_bcdfhru.Active_chru, /*check:*/SortOptionSet_bcdfhru.Active_chru_long, /*d:*/Active_dhru, /*dictionaryOrder:*/Active_dhru_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_fhru, /*ignoreCase:*/Active_fhru_long, /*b:*/Active_bhru, /*ignoreLeadingBlanks:*/Active_bhru_long, /*m:*/SortOptionSet_bdfhmru.Active_hmru, /*merge:*/SortOptionSet_bdfhmru.Active_hmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.humanNumericSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #humanNumericSort h}, {@link #reverse r}, {@link #unique u}.*/
	Active_hru_long(
		/*c:*/SortOptionSet_bcdfhru.Active_chru, /*check:*/SortOptionSet_bcdfhru.Active_chru_long, /*d:*/Active_dhru, /*dictionaryOrder:*/Active_dhru_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_fhru, /*ignoreCase:*/Active_fhru_long, /*b:*/Active_bhru, /*ignoreLeadingBlanks:*/Active_bhru_long, /*m:*/SortOptionSet_bdfhmru.Active_hmru, /*merge:*/SortOptionSet_bdfhmru.Active_hmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.humanNumericSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}.*/
	Active_bdh(
		/*c:*/SortOptionSet_bcdfhru.Active_bcdh, /*check:*/SortOptionSet_bcdfhru.Active_bcdh_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bdfh, /*ignoreCase:*/Active_bdfh_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfhmru.Active_bdhm, /*merge:*/SortOptionSet_bdfhmru.Active_bdhm_long, /*r:*/Active_bdhr, /*reverse:*/Active_bdhr_long, /*u:*/Active_bdhu, /*unique:*/Active_bdhu_long, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}.*/
	Active_bdh_long(
		/*c:*/SortOptionSet_bcdfhru.Active_bcdh, /*check:*/SortOptionSet_bcdfhru.Active_bcdh_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bdfh, /*ignoreCase:*/Active_bdfh_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfhmru.Active_bdhm, /*merge:*/SortOptionSet_bdfhmru.Active_bdhm_long, /*r:*/Active_bdhr, /*reverse:*/Active_bdhr_long, /*u:*/Active_bdhu, /*unique:*/Active_bdhu_long, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks
	),
	/** Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}.*/
	Active_bfh(
		/*c:*/SortOptionSet_bcdfhru.Active_bcfh, /*check:*/SortOptionSet_bcdfhru.Active_bcfh_long, /*d:*/Active_bdfh, /*dictionaryOrder:*/Active_bdfh_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfhmru.Active_bfhm, /*merge:*/SortOptionSet_bdfhmru.Active_bfhm_long, /*r:*/Active_bfhr, /*reverse:*/Active_bfhr_long, /*u:*/Active_bfhu, /*unique:*/Active_bfhu_long, 
		true, 
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks
	),
	/** Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}.*/
	Active_bfh_long(
		/*c:*/SortOptionSet_bcdfhru.Active_bcfh, /*check:*/SortOptionSet_bcdfhru.Active_bcfh_long, /*d:*/Active_bdfh, /*dictionaryOrder:*/Active_bdfh_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfhmru.Active_bfhm, /*merge:*/SortOptionSet_bdfhmru.Active_bfhm_long, /*r:*/Active_bfhr, /*reverse:*/Active_bfhr_long, /*u:*/Active_bfhu, /*unique:*/Active_bfhu_long, 
		false, 
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks
	),
	/** Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.*/
	Active_bhr(
		/*c:*/SortOptionSet_bcdfhru.Active_bchr, /*check:*/SortOptionSet_bcdfhru.Active_bchr_long, /*d:*/Active_bdhr, /*dictionaryOrder:*/Active_bdhr_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bfhr, /*ignoreCase:*/Active_bfhr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfhmru.Active_bhmr, /*merge:*/SortOptionSet_bdfhmru.Active_bhmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bhru, /*unique:*/Active_bhru_long, 
		true, 
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks, SortOption.reverse
	),
	/** Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.*/
	Active_bhr_long(
		/*c:*/SortOptionSet_bcdfhru.Active_bchr, /*check:*/SortOptionSet_bcdfhru.Active_bchr_long, /*d:*/Active_bdhr, /*dictionaryOrder:*/Active_bdhr_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bfhr, /*ignoreCase:*/Active_bfhr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfhmru.Active_bhmr, /*merge:*/SortOptionSet_bdfhmru.Active_bhmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bhru, /*unique:*/Active_bhru_long, 
		false, 
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks, SortOption.reverse
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}.*/
	Active_dfh(
		/*c:*/SortOptionSet_bcdfhru.Active_cdfh, /*check:*/SortOptionSet_bcdfhru.Active_cdfh_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfh, /*ignoreLeadingBlanks:*/Active_bdfh_long, /*m:*/SortOptionSet_bdfhmru.Active_dfhm, /*merge:*/SortOptionSet_bdfhmru.Active_dfhm_long, /*r:*/Active_dfhr, /*reverse:*/Active_dfhr_long, /*u:*/Active_dfhu, /*unique:*/Active_dfhu_long, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}.*/
	Active_dfh_long(
		/*c:*/SortOptionSet_bcdfhru.Active_cdfh, /*check:*/SortOptionSet_bcdfhru.Active_cdfh_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfh, /*ignoreLeadingBlanks:*/Active_bdfh_long, /*m:*/SortOptionSet_bdfhmru.Active_dfhm, /*merge:*/SortOptionSet_bdfhmru.Active_dfhm_long, /*r:*/Active_dfhr, /*reverse:*/Active_dfhr_long, /*u:*/Active_dfhu, /*unique:*/Active_dfhu_long, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #reverse r}.*/
	Active_dhr(
		/*c:*/SortOptionSet_bcdfhru.Active_cdhr, /*check:*/SortOptionSet_bcdfhru.Active_cdhr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_dfhr, /*ignoreCase:*/Active_dfhr_long, /*b:*/Active_bdhr, /*ignoreLeadingBlanks:*/Active_bdhr_long, /*m:*/SortOptionSet_bdfhmru.Active_dhmr, /*merge:*/SortOptionSet_bdfhmru.Active_dhmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_dhru, /*unique:*/Active_dhru_long, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #reverse r}.*/
	Active_dhr_long(
		/*c:*/SortOptionSet_bcdfhru.Active_cdhr, /*check:*/SortOptionSet_bcdfhru.Active_cdhr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_dfhr, /*ignoreCase:*/Active_dfhr_long, /*b:*/Active_bdhr, /*ignoreLeadingBlanks:*/Active_bdhr_long, /*m:*/SortOptionSet_bdfhmru.Active_dhmr, /*merge:*/SortOptionSet_bdfhmru.Active_dhmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_dhru, /*unique:*/Active_dhru_long, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #reverse r}.*/
	Active_fhr(
		/*c:*/SortOptionSet_bcdfhru.Active_cfhr, /*check:*/SortOptionSet_bcdfhru.Active_cfhr_long, /*d:*/Active_dfhr, /*dictionaryOrder:*/Active_dfhr_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfhr, /*ignoreLeadingBlanks:*/Active_bfhr_long, /*m:*/SortOptionSet_bdfhmru.Active_fhmr, /*merge:*/SortOptionSet_bdfhmru.Active_fhmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_fhru, /*unique:*/Active_fhru_long, 
		true, 
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.reverse
	),
	/** Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #reverse r}.*/
	Active_fhr_long(
		/*c:*/SortOptionSet_bcdfhru.Active_cfhr, /*check:*/SortOptionSet_bcdfhru.Active_cfhr_long, /*d:*/Active_dfhr, /*dictionaryOrder:*/Active_dfhr_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfhr, /*ignoreLeadingBlanks:*/Active_bfhr_long, /*m:*/SortOptionSet_bdfhmru.Active_fhmr, /*merge:*/SortOptionSet_bdfhmru.Active_fhmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_fhru, /*unique:*/Active_fhru_long, 
		false, 
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.reverse
	),
	/** Option set with the following active options: {@link #humanNumericSort h}, {@link #unique u}.*/
	Active_hu(
		/*c:*/SortOptionSet_bcdfhru.Active_chu, /*check:*/SortOptionSet_bcdfhru.Active_chu_long, /*d:*/Active_dhu, /*dictionaryOrder:*/Active_dhu_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_fhu, /*ignoreCase:*/Active_fhu_long, /*b:*/Active_bhu, /*ignoreLeadingBlanks:*/Active_bhu_long, /*m:*/SortOptionSet_bdfhmru.Active_hmu, /*merge:*/SortOptionSet_bdfhmru.Active_hmu_long, /*r:*/Active_hru, /*reverse:*/Active_hru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.humanNumericSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #humanNumericSort h}, {@link #unique u}.*/
	Active_hu_long(
		/*c:*/SortOptionSet_bcdfhru.Active_chu, /*check:*/SortOptionSet_bcdfhru.Active_chu_long, /*d:*/Active_dhu, /*dictionaryOrder:*/Active_dhu_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_fhu, /*ignoreCase:*/Active_fhu_long, /*b:*/Active_bhu, /*ignoreLeadingBlanks:*/Active_bhu_long, /*m:*/SortOptionSet_bdfhmru.Active_hmu, /*merge:*/SortOptionSet_bdfhmru.Active_hmu_long, /*r:*/Active_hru, /*reverse:*/Active_hru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.humanNumericSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}.*/
	Active_bh(
		/*c:*/SortOptionSet_bcdfhru.Active_bch, /*check:*/SortOptionSet_bcdfhru.Active_bch_long, /*d:*/Active_bdh, /*dictionaryOrder:*/Active_bdh_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bfh, /*ignoreCase:*/Active_bfh_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfhmru.Active_bhm, /*merge:*/SortOptionSet_bdfhmru.Active_bhm_long, /*r:*/Active_bhr, /*reverse:*/Active_bhr_long, /*u:*/Active_bhu, /*unique:*/Active_bhu_long, 
		true, 
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks
	),
	/** Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}.*/
	Active_bh_long(
		/*c:*/SortOptionSet_bcdfhru.Active_bch, /*check:*/SortOptionSet_bcdfhru.Active_bch_long, /*d:*/Active_bdh, /*dictionaryOrder:*/Active_bdh_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bfh, /*ignoreCase:*/Active_bfh_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfhmru.Active_bhm, /*merge:*/SortOptionSet_bdfhmru.Active_bhm_long, /*r:*/Active_bhr, /*reverse:*/Active_bhr_long, /*u:*/Active_bhu, /*unique:*/Active_bhu_long, 
		false, 
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}.*/
	Active_dh(
		/*c:*/SortOptionSet_bcdfhru.Active_cdh, /*check:*/SortOptionSet_bcdfhru.Active_cdh_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_dfh, /*ignoreCase:*/Active_dfh_long, /*b:*/Active_bdh, /*ignoreLeadingBlanks:*/Active_bdh_long, /*m:*/SortOptionSet_bdfhmru.Active_dhm, /*merge:*/SortOptionSet_bdfhmru.Active_dhm_long, /*r:*/Active_dhr, /*reverse:*/Active_dhr_long, /*u:*/Active_dhu, /*unique:*/Active_dhu_long, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #humanNumericSort h}.*/
	Active_dh_long(
		/*c:*/SortOptionSet_bcdfhru.Active_cdh, /*check:*/SortOptionSet_bcdfhru.Active_cdh_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_dfh, /*ignoreCase:*/Active_dfh_long, /*b:*/Active_bdh, /*ignoreLeadingBlanks:*/Active_bdh_long, /*m:*/SortOptionSet_bdfhmru.Active_dhm, /*merge:*/SortOptionSet_bdfhmru.Active_dhm_long, /*r:*/Active_dhr, /*reverse:*/Active_dhr_long, /*u:*/Active_dhu, /*unique:*/Active_dhu_long, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.humanNumericSort
	),
	/** Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreCase f}.*/
	Active_fh(
		/*c:*/SortOptionSet_bcdfhru.Active_cfh, /*check:*/SortOptionSet_bcdfhru.Active_cfh_long, /*d:*/Active_dfh, /*dictionaryOrder:*/Active_dfh_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfh, /*ignoreLeadingBlanks:*/Active_bfh_long, /*m:*/SortOptionSet_bdfhmru.Active_fhm, /*merge:*/SortOptionSet_bdfhmru.Active_fhm_long, /*r:*/Active_fhr, /*reverse:*/Active_fhr_long, /*u:*/Active_fhu, /*unique:*/Active_fhu_long, 
		true, 
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreCase
	),
	/** Option set with the following active options: {@link #humanNumericSort h}, {@link #ignoreCase f}.*/
	Active_fh_long(
		/*c:*/SortOptionSet_bcdfhru.Active_cfh, /*check:*/SortOptionSet_bcdfhru.Active_cfh_long, /*d:*/Active_dfh, /*dictionaryOrder:*/Active_dfh_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfh, /*ignoreLeadingBlanks:*/Active_bfh_long, /*m:*/SortOptionSet_bdfhmru.Active_fhm, /*merge:*/SortOptionSet_bdfhmru.Active_fhm_long, /*r:*/Active_fhr, /*reverse:*/Active_fhr_long, /*u:*/Active_fhu, /*unique:*/Active_fhu_long, 
		false, 
		/*active:*/SortOption.humanNumericSort, SortOption.ignoreCase
	),
	/** Option set with the following active options: {@link #humanNumericSort h}, {@link #reverse r}.*/
	Active_hr(
		/*c:*/SortOptionSet_bcdfhru.Active_chr, /*check:*/SortOptionSet_bcdfhru.Active_chr_long, /*d:*/Active_dhr, /*dictionaryOrder:*/Active_dhr_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_fhr, /*ignoreCase:*/Active_fhr_long, /*b:*/Active_bhr, /*ignoreLeadingBlanks:*/Active_bhr_long, /*m:*/SortOptionSet_bdfhmru.Active_hmr, /*merge:*/SortOptionSet_bdfhmru.Active_hmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_hru, /*unique:*/Active_hru_long, 
		true, 
		/*active:*/SortOption.humanNumericSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #humanNumericSort h}, {@link #reverse r}.*/
	Active_hr_long(
		/*c:*/SortOptionSet_bcdfhru.Active_chr, /*check:*/SortOptionSet_bcdfhru.Active_chr_long, /*d:*/Active_dhr, /*dictionaryOrder:*/Active_dhr_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_fhr, /*ignoreCase:*/Active_fhr_long, /*b:*/Active_bhr, /*ignoreLeadingBlanks:*/Active_bhr_long, /*m:*/SortOptionSet_bdfhmru.Active_hmr, /*merge:*/SortOptionSet_bdfhmru.Active_hmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_hru, /*unique:*/Active_hru_long, 
		false, 
		/*active:*/SortOption.humanNumericSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #humanNumericSort h}.*/
	Active_h(
		/*c:*/SortOptionSet_bcdfhru.Active_ch, /*check:*/SortOptionSet_bcdfhru.Active_ch_long, /*d:*/Active_dh, /*dictionaryOrder:*/Active_dh_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_fh, /*ignoreCase:*/Active_fh_long, /*b:*/Active_bh, /*ignoreLeadingBlanks:*/Active_bh_long, /*m:*/SortOptionSet_bdfhmru.Active_hm, /*merge:*/SortOptionSet_bdfhmru.Active_hm_long, /*r:*/Active_hr, /*reverse:*/Active_hr_long, /*u:*/Active_hu, /*unique:*/Active_hu_long, 
		true, 
		/*active:*/SortOption.humanNumericSort
	),
	/** Option set with the following active options: {@link #humanNumericSort h}.*/
	Active_h_long(
		/*c:*/SortOptionSet_bcdfhru.Active_ch, /*check:*/SortOptionSet_bcdfhru.Active_ch_long, /*d:*/Active_dh, /*dictionaryOrder:*/Active_dh_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_fh, /*ignoreCase:*/Active_fh_long, /*b:*/Active_bh, /*ignoreLeadingBlanks:*/Active_bh_long, /*m:*/SortOptionSet_bdfhmru.Active_hm, /*merge:*/SortOptionSet_bdfhmru.Active_hm_long, /*r:*/Active_hr, /*reverse:*/Active_hr_long, /*u:*/Active_hu, /*unique:*/Active_hu_long, 
		false, 
		/*active:*/SortOption.humanNumericSort
	);
	private SortOptionSet_bcdfhmru(
		SortOptionSet_bcdfhru c, SortOptionSet_bcdfhru check, SortOptionSet_bcdfhmru d, SortOptionSet_bcdfhmru dictionaryOrder, SortOptionSet_bcdfhmru h, SortOptionSet_bcdfhmru humanNumericSort, SortOptionSet_bcdfhmru f, SortOptionSet_bcdfhmru ignoreCase, SortOptionSet_bcdfhmru b, SortOptionSet_bcdfhmru ignoreLeadingBlanks, SortOptionSet_bdfhmru m, SortOptionSet_bdfhmru merge, SortOptionSet_bcdfhmru r, SortOptionSet_bcdfhmru reverse, SortOptionSet_bcdfhmru u, SortOptionSet_bcdfhmru unique, 
		boolean useAcronym,
		SortOption... activeOptions
	) {
		this.c = notNull(c);
		this.check = notNull(check);
		this.d = d == null ? this : d;
		this.dictionaryOrder = dictionaryOrder == null ? this : dictionaryOrder;
		this.h = h == null ? this : h;
		this.humanNumericSort = humanNumericSort == null ? this : humanNumericSort;
		this.f = f == null ? this : f;
		this.ignoreCase = ignoreCase == null ? this : ignoreCase;
		this.b = b == null ? this : b;
		this.ignoreLeadingBlanks = ignoreLeadingBlanks == null ? this : ignoreLeadingBlanks;
		this.m = notNull(m);
		this.merge = notNull(merge);
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
	public final SortOptionSet_bcdfhru c;
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
	public final SortOptionSet_bcdfhru check;
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
	public final SortOptionSet_bcdfhmru d;
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
	public final SortOptionSet_bcdfhmru dictionaryOrder;
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
	public final SortOptionSet_bcdfhmru h;
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
	public final SortOptionSet_bcdfhmru humanNumericSort;
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
	public final SortOptionSet_bcdfhmru f;
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
	public final SortOptionSet_bcdfhmru ignoreCase;
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
	public final SortOptionSet_bcdfhmru b;
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
	public final SortOptionSet_bcdfhmru ignoreLeadingBlanks;
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
	public final SortOptionSet_bcdfhmru r;
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
	public final SortOptionSet_bcdfhmru reverse;
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
	public final SortOptionSet_bcdfhmru u;
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
	public final SortOptionSet_bcdfhmru unique;
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
	 *    SortOptionSet_bcdfhmru.check.d;
	 * </pre>
	 * uses acronyms, that is, this method always returns true for the above 
	 * set. 
	 * <p>
	 * On the other hand, long option names are used and this method always 
	 * returns false for the set
	 * <pre>
	 *    SortOptionSet_bcdfhmru.c.dictionaryOrder;
	 * </pre>
	 * <p>
	 * Note that a repeated option is <i>not</i> treated as the last set option.
	 * For instance, the first and last option of the following set are 
	 * equivalent and acronyms are used:
	 * <pre>
	 *    SortOptionSet_bcdfhmru.c.d.check;
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
