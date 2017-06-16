package org.unix4j.unix.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import org.unix4j.option.Option;

import org.unix4j.unix.Sort;

/**
 * Option sets for the {@link Sort sort} command with 
 * the following options: {@link #c c}, {@link #d d}, {@link #h h}, {@link #f f}, {@link #b b}, {@link #r r}, {@link #u u}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Sort#Options} should be used instead to specify command 
 * options. See also {@link org.unix4j.unix.sort.SortOptions} for more information.
 */
public enum SortOptionSet_bcdfhru implements SortOptions {
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.*/
	Active_bcdfhru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.*/
	Active_bcdfhru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.*/
	Active_bcdfhu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_bcdfhru, /*reverse:*/Active_bcdfhru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.*/
	Active_bcdfhu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_bcdfhru, /*reverse:*/Active_bcdfhru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.*/
	Active_bcdhru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bcdfhru, /*ignoreCase:*/Active_bcdfhru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.*/
	Active_bcdhru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bcdfhru, /*ignoreCase:*/Active_bcdfhru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.*/
	Active_bcfhru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdfhru, /*dictionaryOrder:*/Active_bcdfhru_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.check, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.*/
	Active_bcfhru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdfhru, /*dictionaryOrder:*/Active_bcdfhru_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.check, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #reverse r}, {@link #unique u}.*/
	Active_cdfhru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcdfhru, /*ignoreLeadingBlanks:*/Active_bcdfhru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #reverse r}, {@link #unique u}.*/
	Active_cdfhru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcdfhru, /*ignoreLeadingBlanks:*/Active_bcdfhru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.*/
	Active_bcdfhr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bcdfhru, /*unique:*/Active_bcdfhru_long, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.*/
	Active_bcdfhr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bcdfhru, /*unique:*/Active_bcdfhru_long, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.*/
	Active_bcdhu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bcdfhu, /*ignoreCase:*/Active_bcdfhu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_bcdhru, /*reverse:*/Active_bcdhru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.*/
	Active_bcdhu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bcdfhu, /*ignoreCase:*/Active_bcdfhu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_bcdhru, /*reverse:*/Active_bcdhru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.*/
	Active_bcfhu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdfhu, /*dictionaryOrder:*/Active_bcdfhu_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_bcfhru, /*reverse:*/Active_bcfhru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.check, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.*/
	Active_bcfhu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdfhu, /*dictionaryOrder:*/Active_bcdfhu_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_bcfhru, /*reverse:*/Active_bcfhru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.check, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.*/
	Active_bchru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdhru, /*dictionaryOrder:*/Active_bcdhru_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bcfhru, /*ignoreCase:*/Active_bcfhru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.check, SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.*/
	Active_bchru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdhru, /*dictionaryOrder:*/Active_bcdhru_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bcfhru, /*ignoreCase:*/Active_bcfhru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.check, SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #unique u}.*/
	Active_cdfhu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcdfhu, /*ignoreLeadingBlanks:*/Active_bcdfhu_long, /*r:*/Active_cdfhru, /*reverse:*/Active_cdfhru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #unique u}.*/
	Active_cdfhu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcdfhu, /*ignoreLeadingBlanks:*/Active_bcdfhu_long, /*r:*/Active_cdfhru, /*reverse:*/Active_cdfhru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #reverse r}, {@link #unique u}.*/
	Active_cdhru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_cdfhru, /*ignoreCase:*/Active_cdfhru_long, /*b:*/Active_bcdhru, /*ignoreLeadingBlanks:*/Active_bcdhru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #reverse r}, {@link #unique u}.*/
	Active_cdhru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_cdfhru, /*ignoreCase:*/Active_cdfhru_long, /*b:*/Active_bcdhru, /*ignoreLeadingBlanks:*/Active_bcdhru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #reverse r}, {@link #unique u}.*/
	Active_cfhru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdfhru, /*dictionaryOrder:*/Active_cdfhru_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcfhru, /*ignoreLeadingBlanks:*/Active_bcfhru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.check, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #reverse r}, {@link #unique u}.*/
	Active_cfhru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdfhru, /*dictionaryOrder:*/Active_cdfhru_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcfhru, /*ignoreLeadingBlanks:*/Active_bcfhru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.check, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}.*/
	Active_bcdfh(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_bcdfhr, /*reverse:*/Active_bcdfhr_long, /*u:*/Active_bcdfhu, /*unique:*/Active_bcdfhu_long, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}.*/
	Active_bcdfh_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_bcdfhr, /*reverse:*/Active_bcdfhr_long, /*u:*/Active_bcdfhu, /*unique:*/Active_bcdfhu_long, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.*/
	Active_bcdhr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bcdfhr, /*ignoreCase:*/Active_bcdfhr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bcdhru, /*unique:*/Active_bcdhru_long, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.*/
	Active_bcdhr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bcdfhr, /*ignoreCase:*/Active_bcdfhr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bcdhru, /*unique:*/Active_bcdhru_long, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.*/
	Active_bcfhr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdfhr, /*dictionaryOrder:*/Active_bcdfhr_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bcfhru, /*unique:*/Active_bcfhru_long, 
		true, 
		/*active:*/SortOption.check, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.*/
	Active_bcfhr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdfhr, /*dictionaryOrder:*/Active_bcdfhr_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bcfhru, /*unique:*/Active_bcfhru_long, 
		false, 
		/*active:*/SortOption.check, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #reverse r}.*/
	Active_cdfhr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcdfhr, /*ignoreLeadingBlanks:*/Active_bcdfhr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_cdfhru, /*unique:*/Active_cdfhru_long, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #reverse r}.*/
	Active_cdfhr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcdfhr, /*ignoreLeadingBlanks:*/Active_bcdfhr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_cdfhru, /*unique:*/Active_cdfhru_long, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.*/
	Active_bchu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdhu, /*dictionaryOrder:*/Active_bcdhu_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bcfhu, /*ignoreCase:*/Active_bcfhu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_bchru, /*reverse:*/Active_bchru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.check, SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.*/
	Active_bchu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdhu, /*dictionaryOrder:*/Active_bcdhu_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bcfhu, /*ignoreCase:*/Active_bcfhu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_bchru, /*reverse:*/Active_bchru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.check, SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #unique u}.*/
	Active_cdhu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_cdfhu, /*ignoreCase:*/Active_cdfhu_long, /*b:*/Active_bcdhu, /*ignoreLeadingBlanks:*/Active_bcdhu_long, /*r:*/Active_cdhru, /*reverse:*/Active_cdhru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #unique u}.*/
	Active_cdhu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_cdfhu, /*ignoreCase:*/Active_cdfhu_long, /*b:*/Active_bcdhu, /*ignoreLeadingBlanks:*/Active_bcdhu_long, /*r:*/Active_cdhru, /*reverse:*/Active_cdhru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #unique u}.*/
	Active_cfhu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdfhu, /*dictionaryOrder:*/Active_cdfhu_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcfhu, /*ignoreLeadingBlanks:*/Active_bcfhu_long, /*r:*/Active_cfhru, /*reverse:*/Active_cfhru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.check, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #unique u}.*/
	Active_cfhu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdfhu, /*dictionaryOrder:*/Active_cdfhu_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcfhu, /*ignoreLeadingBlanks:*/Active_bcfhu_long, /*r:*/Active_cfhru, /*reverse:*/Active_cfhru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.check, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #humanNumericSort h}, {@link #reverse r}, {@link #unique u}.*/
	Active_chru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdhru, /*dictionaryOrder:*/Active_cdhru_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_cfhru, /*ignoreCase:*/Active_cfhru_long, /*b:*/Active_bchru, /*ignoreLeadingBlanks:*/Active_bchru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.check, SortOption.humanNumericSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #humanNumericSort h}, {@link #reverse r}, {@link #unique u}.*/
	Active_chru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdhru, /*dictionaryOrder:*/Active_cdhru_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_cfhru, /*ignoreCase:*/Active_cfhru_long, /*b:*/Active_bchru, /*ignoreLeadingBlanks:*/Active_bchru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.check, SortOption.humanNumericSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}.*/
	Active_bcdh(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bcdfh, /*ignoreCase:*/Active_bcdfh_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_bcdhr, /*reverse:*/Active_bcdhr_long, /*u:*/Active_bcdhu, /*unique:*/Active_bcdhu_long, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}.*/
	Active_bcdh_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bcdfh, /*ignoreCase:*/Active_bcdfh_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_bcdhr, /*reverse:*/Active_bcdhr_long, /*u:*/Active_bcdhu, /*unique:*/Active_bcdhu_long, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks
	),
	/** Option set with the following active options: {@link #check c}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}.*/
	Active_bcfh(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdfh, /*dictionaryOrder:*/Active_bcdfh_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_bcfhr, /*reverse:*/Active_bcfhr_long, /*u:*/Active_bcfhu, /*unique:*/Active_bcfhu_long, 
		true, 
		/*active:*/SortOption.check, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks
	),
	/** Option set with the following active options: {@link #check c}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}.*/
	Active_bcfh_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdfh, /*dictionaryOrder:*/Active_bcdfh_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_bcfhr, /*reverse:*/Active_bcfhr_long, /*u:*/Active_bcfhu, /*unique:*/Active_bcfhu_long, 
		false, 
		/*active:*/SortOption.check, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks
	),
	/** Option set with the following active options: {@link #check c}, {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.*/
	Active_bchr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdhr, /*dictionaryOrder:*/Active_bcdhr_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bcfhr, /*ignoreCase:*/Active_bcfhr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bchru, /*unique:*/Active_bchru_long, 
		true, 
		/*active:*/SortOption.check, SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.*/
	Active_bchr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdhr, /*dictionaryOrder:*/Active_bcdhr_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bcfhr, /*ignoreCase:*/Active_bcfhr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bchru, /*unique:*/Active_bchru_long, 
		false, 
		/*active:*/SortOption.check, SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}.*/
	Active_cdfh(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcdfh, /*ignoreLeadingBlanks:*/Active_bcdfh_long, /*r:*/Active_cdfhr, /*reverse:*/Active_cdfhr_long, /*u:*/Active_cdfhu, /*unique:*/Active_cdfhu_long, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #ignoreCase f}.*/
	Active_cdfh_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcdfh, /*ignoreLeadingBlanks:*/Active_bcdfh_long, /*r:*/Active_cdfhr, /*reverse:*/Active_cdfhr_long, /*u:*/Active_cdfhu, /*unique:*/Active_cdfhu_long, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.ignoreCase
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #reverse r}.*/
	Active_cdhr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_cdfhr, /*ignoreCase:*/Active_cdfhr_long, /*b:*/Active_bcdhr, /*ignoreLeadingBlanks:*/Active_bcdhr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_cdhru, /*unique:*/Active_cdhru_long, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #humanNumericSort h}, {@link #reverse r}.*/
	Active_cdhr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_cdfhr, /*ignoreCase:*/Active_cdfhr_long, /*b:*/Active_bcdhr, /*ignoreLeadingBlanks:*/Active_bcdhr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_cdhru, /*unique:*/Active_cdhru_long, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.humanNumericSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #reverse r}.*/
	Active_cfhr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdfhr, /*dictionaryOrder:*/Active_cdfhr_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcfhr, /*ignoreLeadingBlanks:*/Active_bcfhr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_cfhru, /*unique:*/Active_cfhru_long, 
		true, 
		/*active:*/SortOption.check, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #humanNumericSort h}, {@link #ignoreCase f}, {@link #reverse r}.*/
	Active_cfhr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdfhr, /*dictionaryOrder:*/Active_cdfhr_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcfhr, /*ignoreLeadingBlanks:*/Active_bcfhr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_cfhru, /*unique:*/Active_cfhru_long, 
		false, 
		/*active:*/SortOption.check, SortOption.humanNumericSort, SortOption.ignoreCase, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #humanNumericSort h}, {@link #unique u}.*/
	Active_chu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdhu, /*dictionaryOrder:*/Active_cdhu_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_cfhu, /*ignoreCase:*/Active_cfhu_long, /*b:*/Active_bchu, /*ignoreLeadingBlanks:*/Active_bchu_long, /*r:*/Active_chru, /*reverse:*/Active_chru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.check, SortOption.humanNumericSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #humanNumericSort h}, {@link #unique u}.*/
	Active_chu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdhu, /*dictionaryOrder:*/Active_cdhu_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_cfhu, /*ignoreCase:*/Active_cfhu_long, /*b:*/Active_bchu, /*ignoreLeadingBlanks:*/Active_bchu_long, /*r:*/Active_chru, /*reverse:*/Active_chru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.check, SortOption.humanNumericSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}.*/
	Active_bch(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdh, /*dictionaryOrder:*/Active_bcdh_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bcfh, /*ignoreCase:*/Active_bcfh_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_bchr, /*reverse:*/Active_bchr_long, /*u:*/Active_bchu, /*unique:*/Active_bchu_long, 
		true, 
		/*active:*/SortOption.check, SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks
	),
	/** Option set with the following active options: {@link #check c}, {@link #humanNumericSort h}, {@link #ignoreLeadingBlanks b}.*/
	Active_bch_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdh, /*dictionaryOrder:*/Active_bcdh_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_bcfh, /*ignoreCase:*/Active_bcfh_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_bchr, /*reverse:*/Active_bchr_long, /*u:*/Active_bchu, /*unique:*/Active_bchu_long, 
		false, 
		/*active:*/SortOption.check, SortOption.humanNumericSort, SortOption.ignoreLeadingBlanks
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #humanNumericSort h}.*/
	Active_cdh(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_cdfh, /*ignoreCase:*/Active_cdfh_long, /*b:*/Active_bcdh, /*ignoreLeadingBlanks:*/Active_bcdh_long, /*r:*/Active_cdhr, /*reverse:*/Active_cdhr_long, /*u:*/Active_cdhu, /*unique:*/Active_cdhu_long, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.humanNumericSort
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #humanNumericSort h}.*/
	Active_cdh_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_cdfh, /*ignoreCase:*/Active_cdfh_long, /*b:*/Active_bcdh, /*ignoreLeadingBlanks:*/Active_bcdh_long, /*r:*/Active_cdhr, /*reverse:*/Active_cdhr_long, /*u:*/Active_cdhu, /*unique:*/Active_cdhu_long, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.humanNumericSort
	),
	/** Option set with the following active options: {@link #check c}, {@link #humanNumericSort h}, {@link #ignoreCase f}.*/
	Active_cfh(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdfh, /*dictionaryOrder:*/Active_cdfh_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcfh, /*ignoreLeadingBlanks:*/Active_bcfh_long, /*r:*/Active_cfhr, /*reverse:*/Active_cfhr_long, /*u:*/Active_cfhu, /*unique:*/Active_cfhu_long, 
		true, 
		/*active:*/SortOption.check, SortOption.humanNumericSort, SortOption.ignoreCase
	),
	/** Option set with the following active options: {@link #check c}, {@link #humanNumericSort h}, {@link #ignoreCase f}.*/
	Active_cfh_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdfh, /*dictionaryOrder:*/Active_cdfh_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcfh, /*ignoreLeadingBlanks:*/Active_bcfh_long, /*r:*/Active_cfhr, /*reverse:*/Active_cfhr_long, /*u:*/Active_cfhu, /*unique:*/Active_cfhu_long, 
		false, 
		/*active:*/SortOption.check, SortOption.humanNumericSort, SortOption.ignoreCase
	),
	/** Option set with the following active options: {@link #check c}, {@link #humanNumericSort h}, {@link #reverse r}.*/
	Active_chr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdhr, /*dictionaryOrder:*/Active_cdhr_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_cfhr, /*ignoreCase:*/Active_cfhr_long, /*b:*/Active_bchr, /*ignoreLeadingBlanks:*/Active_bchr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_chru, /*unique:*/Active_chru_long, 
		true, 
		/*active:*/SortOption.check, SortOption.humanNumericSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #humanNumericSort h}, {@link #reverse r}.*/
	Active_chr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdhr, /*dictionaryOrder:*/Active_cdhr_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_cfhr, /*ignoreCase:*/Active_cfhr_long, /*b:*/Active_bchr, /*ignoreLeadingBlanks:*/Active_bchr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_chru, /*unique:*/Active_chru_long, 
		false, 
		/*active:*/SortOption.check, SortOption.humanNumericSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #humanNumericSort h}.*/
	Active_ch(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdh, /*dictionaryOrder:*/Active_cdh_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_cfh, /*ignoreCase:*/Active_cfh_long, /*b:*/Active_bch, /*ignoreLeadingBlanks:*/Active_bch_long, /*r:*/Active_chr, /*reverse:*/Active_chr_long, /*u:*/Active_chu, /*unique:*/Active_chu_long, 
		true, 
		/*active:*/SortOption.check, SortOption.humanNumericSort
	),
	/** Option set with the following active options: {@link #check c}, {@link #humanNumericSort h}.*/
	Active_ch_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdh, /*dictionaryOrder:*/Active_cdh_long, /*h:*/null /*already set*/, /*humanNumericSort:*/null /*already set*/, /*f:*/Active_cfh, /*ignoreCase:*/Active_cfh_long, /*b:*/Active_bch, /*ignoreLeadingBlanks:*/Active_bch_long, /*r:*/Active_chr, /*reverse:*/Active_chr_long, /*u:*/Active_chu, /*unique:*/Active_chu_long, 
		false, 
		/*active:*/SortOption.check, SortOption.humanNumericSort
	);
	private SortOptionSet_bcdfhru(
		SortOptionSet_bcdfhru c, SortOptionSet_bcdfhru check, SortOptionSet_bcdfhru d, SortOptionSet_bcdfhru dictionaryOrder, SortOptionSet_bcdfhru h, SortOptionSet_bcdfhru humanNumericSort, SortOptionSet_bcdfhru f, SortOptionSet_bcdfhru ignoreCase, SortOptionSet_bcdfhru b, SortOptionSet_bcdfhru ignoreLeadingBlanks, SortOptionSet_bcdfhru r, SortOptionSet_bcdfhru reverse, SortOptionSet_bcdfhru u, SortOptionSet_bcdfhru unique, 
		boolean useAcronym,
		SortOption... activeOptions
	) {
		this.c = c == null ? this : c;
		this.check = check == null ? this : check;
		this.d = d == null ? this : d;
		this.dictionaryOrder = dictionaryOrder == null ? this : dictionaryOrder;
		this.h = h == null ? this : h;
		this.humanNumericSort = humanNumericSort == null ? this : humanNumericSort;
		this.f = f == null ? this : f;
		this.ignoreCase = ignoreCase == null ? this : ignoreCase;
		this.b = b == null ? this : b;
		this.ignoreLeadingBlanks = ignoreLeadingBlanks == null ? this : ignoreLeadingBlanks;
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
	public final SortOptionSet_bcdfhru d;
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
	public final SortOptionSet_bcdfhru dictionaryOrder;
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
	public final SortOptionSet_bcdfhru f;
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
	public final SortOptionSet_bcdfhru ignoreCase;
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
	public final SortOptionSet_bcdfhru b;
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
	public final SortOptionSet_bcdfhru ignoreLeadingBlanks;
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
	public final SortOptionSet_bcdfhru r;
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
	public final SortOptionSet_bcdfhru reverse;
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
	public final SortOptionSet_bcdfhru u;
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
	public final SortOptionSet_bcdfhru unique;
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
	 *    SortOptionSet_bcdfhru.check.d;
	 * </pre>
	 * uses acronyms, that is, this method always returns true for the above 
	 * set. 
	 * <p>
	 * On the other hand, long option names are used and this method always 
	 * returns false for the set
	 * <pre>
	 *    SortOptionSet_bcdfhru.c.dictionaryOrder;
	 * </pre>
	 * <p>
	 * Note that a repeated option is <i>not</i> treated as the last set option.
	 * For instance, the first and last option of the following set are 
	 * equivalent and acronyms are used:
	 * <pre>
	 *    SortOptionSet_bcdfhru.c.d.check;
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
