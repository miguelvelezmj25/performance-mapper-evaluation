package org.unix4j.unix.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import org.unix4j.option.Option;

import org.unix4j.unix.Sort;

/**
 * Option sets for the {@link Sort sort} command with 
 * the following options: {@link #c c}, {@link #d d}, {@link #f f}, {@link #b b}, {@link #M M}, {@link #r r}, {@link #u u}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Sort#Options} should be used instead to specify command 
 * options. See also {@link org.unix4j.unix.sort.SortOptions} for more information.
 */
public enum SortOptionSet_Mbcdfru implements SortOptions {
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.*/
	Active_Mbcdfru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.*/
	Active_Mbcdfru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #unique u}.*/
	Active_Mbcdfu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbcdfru, /*reverse:*/Active_Mbcdfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #unique u}.*/
	Active_Mbcdfu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbcdfru, /*reverse:*/Active_Mbcdfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.*/
	Active_Mbcdru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mbcdfru, /*ignoreCase:*/Active_Mbcdfru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.*/
	Active_Mbcdru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mbcdfru, /*ignoreCase:*/Active_Mbcdfru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.*/
	Active_Mbcfru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Mbcdfru, /*dictionaryOrder:*/Active_Mbcdfru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.*/
	Active_Mbcfru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Mbcdfru, /*dictionaryOrder:*/Active_Mbcdfru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.*/
	Active_Mcdfru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbcdfru, /*ignoreLeadingBlanks:*/Active_Mbcdfru_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.monthSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.*/
	Active_Mcdfru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbcdfru, /*ignoreLeadingBlanks:*/Active_Mbcdfru_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.monthSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #reverse r}.*/
	Active_Mbcdfr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mbcdfru, /*unique:*/Active_Mbcdfru_long, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #reverse r}.*/
	Active_Mbcdfr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mbcdfru, /*unique:*/Active_Mbcdfru_long, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #unique u}.*/
	Active_Mbcdu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mbcdfu, /*ignoreCase:*/Active_Mbcdfu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbcdru, /*reverse:*/Active_Mbcdru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #unique u}.*/
	Active_Mbcdu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mbcdfu, /*ignoreCase:*/Active_Mbcdfu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbcdru, /*reverse:*/Active_Mbcdru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #unique u}.*/
	Active_Mbcfu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Mbcdfu, /*dictionaryOrder:*/Active_Mbcdfu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbcfru, /*reverse:*/Active_Mbcfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #unique u}.*/
	Active_Mbcfu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Mbcdfu, /*dictionaryOrder:*/Active_Mbcdfu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbcfru, /*reverse:*/Active_Mbcfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.*/
	Active_Mbcru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Mbcdru, /*dictionaryOrder:*/Active_Mbcdru_long, /*f:*/Active_Mbcfru, /*ignoreCase:*/Active_Mbcfru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.check, SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.*/
	Active_Mbcru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Mbcdru, /*dictionaryOrder:*/Active_Mbcdru_long, /*f:*/Active_Mbcfru, /*ignoreCase:*/Active_Mbcfru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.check, SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #monthSort M}, {@link #unique u}.*/
	Active_Mcdfu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbcdfu, /*ignoreLeadingBlanks:*/Active_Mbcdfu_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mcdfru, /*reverse:*/Active_Mcdfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.monthSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #monthSort M}, {@link #unique u}.*/
	Active_Mcdfu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbcdfu, /*ignoreLeadingBlanks:*/Active_Mbcdfu_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mcdfru, /*reverse:*/Active_Mcdfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.monthSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.*/
	Active_Mcdru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mcdfru, /*ignoreCase:*/Active_Mcdfru_long, /*b:*/Active_Mbcdru, /*ignoreLeadingBlanks:*/Active_Mbcdru_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.monthSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.*/
	Active_Mcdru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mcdfru, /*ignoreCase:*/Active_Mcdfru_long, /*b:*/Active_Mbcdru, /*ignoreLeadingBlanks:*/Active_Mbcdru_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.monthSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.*/
	Active_Mcfru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Mcdfru, /*dictionaryOrder:*/Active_Mcdfru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbcfru, /*ignoreLeadingBlanks:*/Active_Mbcfru_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.monthSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.*/
	Active_Mcfru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Mcdfru, /*dictionaryOrder:*/Active_Mcdfru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbcfru, /*ignoreLeadingBlanks:*/Active_Mbcfru_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.monthSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}.*/
	Active_Mbcdf(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbcdfr, /*reverse:*/Active_Mbcdfr_long, /*u:*/Active_Mbcdfu, /*unique:*/Active_Mbcdfu_long, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.monthSort
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}.*/
	Active_Mbcdf_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbcdfr, /*reverse:*/Active_Mbcdfr_long, /*u:*/Active_Mbcdfu, /*unique:*/Active_Mbcdfu_long, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.monthSort
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #reverse r}.*/
	Active_Mbcdr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mbcdfr, /*ignoreCase:*/Active_Mbcdfr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mbcdru, /*unique:*/Active_Mbcdru_long, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #reverse r}.*/
	Active_Mbcdr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mbcdfr, /*ignoreCase:*/Active_Mbcdfr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mbcdru, /*unique:*/Active_Mbcdru_long, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #reverse r}.*/
	Active_Mbcfr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Mbcdfr, /*dictionaryOrder:*/Active_Mbcdfr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mbcfru, /*unique:*/Active_Mbcfru_long, 
		true, 
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #reverse r}.*/
	Active_Mbcfr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Mbcdfr, /*dictionaryOrder:*/Active_Mbcdfr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mbcfru, /*unique:*/Active_Mbcfru_long, 
		false, 
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #monthSort M}, {@link #reverse r}.*/
	Active_Mcdfr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbcdfr, /*ignoreLeadingBlanks:*/Active_Mbcdfr_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mcdfru, /*unique:*/Active_Mcdfru_long, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.monthSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #monthSort M}, {@link #reverse r}.*/
	Active_Mcdfr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbcdfr, /*ignoreLeadingBlanks:*/Active_Mbcdfr_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mcdfru, /*unique:*/Active_Mcdfru_long, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.monthSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #unique u}.*/
	Active_Mbcu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Mbcdu, /*dictionaryOrder:*/Active_Mbcdu_long, /*f:*/Active_Mbcfu, /*ignoreCase:*/Active_Mbcfu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbcru, /*reverse:*/Active_Mbcru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.check, SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #unique u}.*/
	Active_Mbcu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Mbcdu, /*dictionaryOrder:*/Active_Mbcdu_long, /*f:*/Active_Mbcfu, /*ignoreCase:*/Active_Mbcfu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbcru, /*reverse:*/Active_Mbcru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.check, SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #monthSort M}, {@link #unique u}.*/
	Active_Mcdu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mcdfu, /*ignoreCase:*/Active_Mcdfu_long, /*b:*/Active_Mbcdu, /*ignoreLeadingBlanks:*/Active_Mbcdu_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mcdru, /*reverse:*/Active_Mcdru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.monthSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #monthSort M}, {@link #unique u}.*/
	Active_Mcdu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mcdfu, /*ignoreCase:*/Active_Mcdfu_long, /*b:*/Active_Mbcdu, /*ignoreLeadingBlanks:*/Active_Mbcdu_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mcdru, /*reverse:*/Active_Mcdru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.monthSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #monthSort M}, {@link #unique u}.*/
	Active_Mcfu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Mcdfu, /*dictionaryOrder:*/Active_Mcdfu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbcfu, /*ignoreLeadingBlanks:*/Active_Mbcfu_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mcfru, /*reverse:*/Active_Mcfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.monthSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #monthSort M}, {@link #unique u}.*/
	Active_Mcfu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Mcdfu, /*dictionaryOrder:*/Active_Mcdfu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbcfu, /*ignoreLeadingBlanks:*/Active_Mbcfu_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mcfru, /*reverse:*/Active_Mcfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.monthSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.*/
	Active_Mcru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Mcdru, /*dictionaryOrder:*/Active_Mcdru_long, /*f:*/Active_Mcfru, /*ignoreCase:*/Active_Mcfru_long, /*b:*/Active_Mbcru, /*ignoreLeadingBlanks:*/Active_Mbcru_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.check, SortOption.monthSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #monthSort M}, {@link #reverse r}, {@link #unique u}.*/
	Active_Mcru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Mcdru, /*dictionaryOrder:*/Active_Mcdru_long, /*f:*/Active_Mcfru, /*ignoreCase:*/Active_Mcfru_long, /*b:*/Active_Mbcru, /*ignoreLeadingBlanks:*/Active_Mbcru_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.check, SortOption.monthSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}.*/
	Active_Mbcd(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mbcdf, /*ignoreCase:*/Active_Mbcdf_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbcdr, /*reverse:*/Active_Mbcdr_long, /*u:*/Active_Mbcdu, /*unique:*/Active_Mbcdu_long, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.monthSort
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}.*/
	Active_Mbcd_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mbcdf, /*ignoreCase:*/Active_Mbcdf_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbcdr, /*reverse:*/Active_Mbcdr_long, /*u:*/Active_Mbcdu, /*unique:*/Active_Mbcdu_long, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.monthSort
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}.*/
	Active_Mbcf(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Mbcdf, /*dictionaryOrder:*/Active_Mbcdf_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbcfr, /*reverse:*/Active_Mbcfr_long, /*u:*/Active_Mbcfu, /*unique:*/Active_Mbcfu_long, 
		true, 
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.monthSort
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}.*/
	Active_Mbcf_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Mbcdf, /*dictionaryOrder:*/Active_Mbcdf_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbcfr, /*reverse:*/Active_Mbcfr_long, /*u:*/Active_Mbcfu, /*unique:*/Active_Mbcfu_long, 
		false, 
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.monthSort
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #reverse r}.*/
	Active_Mbcr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Mbcdr, /*dictionaryOrder:*/Active_Mbcdr_long, /*f:*/Active_Mbcfr, /*ignoreCase:*/Active_Mbcfr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mbcru, /*unique:*/Active_Mbcru_long, 
		true, 
		/*active:*/SortOption.check, SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}, {@link #reverse r}.*/
	Active_Mbcr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Mbcdr, /*dictionaryOrder:*/Active_Mbcdr_long, /*f:*/Active_Mbcfr, /*ignoreCase:*/Active_Mbcfr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mbcru, /*unique:*/Active_Mbcru_long, 
		false, 
		/*active:*/SortOption.check, SortOption.ignoreLeadingBlanks, SortOption.monthSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #monthSort M}.*/
	Active_Mcdf(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbcdf, /*ignoreLeadingBlanks:*/Active_Mbcdf_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mcdfr, /*reverse:*/Active_Mcdfr_long, /*u:*/Active_Mcdfu, /*unique:*/Active_Mcdfu_long, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.monthSort
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #monthSort M}.*/
	Active_Mcdf_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbcdf, /*ignoreLeadingBlanks:*/Active_Mbcdf_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mcdfr, /*reverse:*/Active_Mcdfr_long, /*u:*/Active_Mcdfu, /*unique:*/Active_Mcdfu_long, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.monthSort
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #monthSort M}, {@link #reverse r}.*/
	Active_Mcdr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mcdfr, /*ignoreCase:*/Active_Mcdfr_long, /*b:*/Active_Mbcdr, /*ignoreLeadingBlanks:*/Active_Mbcdr_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mcdru, /*unique:*/Active_Mcdru_long, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.monthSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #monthSort M}, {@link #reverse r}.*/
	Active_Mcdr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mcdfr, /*ignoreCase:*/Active_Mcdfr_long, /*b:*/Active_Mbcdr, /*ignoreLeadingBlanks:*/Active_Mbcdr_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mcdru, /*unique:*/Active_Mcdru_long, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.monthSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #monthSort M}, {@link #reverse r}.*/
	Active_Mcfr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Mcdfr, /*dictionaryOrder:*/Active_Mcdfr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbcfr, /*ignoreLeadingBlanks:*/Active_Mbcfr_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mcfru, /*unique:*/Active_Mcfru_long, 
		true, 
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.monthSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #monthSort M}, {@link #reverse r}.*/
	Active_Mcfr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Mcdfr, /*dictionaryOrder:*/Active_Mcdfr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbcfr, /*ignoreLeadingBlanks:*/Active_Mbcfr_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mcfru, /*unique:*/Active_Mcfru_long, 
		false, 
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.monthSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #monthSort M}, {@link #unique u}.*/
	Active_Mcu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Mcdu, /*dictionaryOrder:*/Active_Mcdu_long, /*f:*/Active_Mcfu, /*ignoreCase:*/Active_Mcfu_long, /*b:*/Active_Mbcu, /*ignoreLeadingBlanks:*/Active_Mbcu_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mcru, /*reverse:*/Active_Mcru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.check, SortOption.monthSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #monthSort M}, {@link #unique u}.*/
	Active_Mcu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Mcdu, /*dictionaryOrder:*/Active_Mcdu_long, /*f:*/Active_Mcfu, /*ignoreCase:*/Active_Mcfu_long, /*b:*/Active_Mbcu, /*ignoreLeadingBlanks:*/Active_Mbcu_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mcru, /*reverse:*/Active_Mcru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.check, SortOption.monthSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}.*/
	Active_Mbc(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Mbcd, /*dictionaryOrder:*/Active_Mbcd_long, /*f:*/Active_Mbcf, /*ignoreCase:*/Active_Mbcf_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbcr, /*reverse:*/Active_Mbcr_long, /*u:*/Active_Mbcu, /*unique:*/Active_Mbcu_long, 
		true, 
		/*active:*/SortOption.check, SortOption.ignoreLeadingBlanks, SortOption.monthSort
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreLeadingBlanks b}, {@link #monthSort M}.*/
	Active_Mbc_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Mbcd, /*dictionaryOrder:*/Active_Mbcd_long, /*f:*/Active_Mbcf, /*ignoreCase:*/Active_Mbcf_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mbcr, /*reverse:*/Active_Mbcr_long, /*u:*/Active_Mbcu, /*unique:*/Active_Mbcu_long, 
		false, 
		/*active:*/SortOption.check, SortOption.ignoreLeadingBlanks, SortOption.monthSort
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #monthSort M}.*/
	Active_Mcd(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mcdf, /*ignoreCase:*/Active_Mcdf_long, /*b:*/Active_Mbcd, /*ignoreLeadingBlanks:*/Active_Mbcd_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mcdr, /*reverse:*/Active_Mcdr_long, /*u:*/Active_Mcdu, /*unique:*/Active_Mcdu_long, 
		true, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.monthSort
	),
	/** Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #monthSort M}.*/
	Active_Mcd_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Mcdf, /*ignoreCase:*/Active_Mcdf_long, /*b:*/Active_Mbcd, /*ignoreLeadingBlanks:*/Active_Mbcd_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mcdr, /*reverse:*/Active_Mcdr_long, /*u:*/Active_Mcdu, /*unique:*/Active_Mcdu_long, 
		false, 
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.monthSort
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #monthSort M}.*/
	Active_Mcf(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Mcdf, /*dictionaryOrder:*/Active_Mcdf_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbcf, /*ignoreLeadingBlanks:*/Active_Mbcf_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mcfr, /*reverse:*/Active_Mcfr_long, /*u:*/Active_Mcfu, /*unique:*/Active_Mcfu_long, 
		true, 
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.monthSort
	),
	/** Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #monthSort M}.*/
	Active_Mcf_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Mcdf, /*dictionaryOrder:*/Active_Mcdf_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Mbcf, /*ignoreLeadingBlanks:*/Active_Mbcf_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mcfr, /*reverse:*/Active_Mcfr_long, /*u:*/Active_Mcfu, /*unique:*/Active_Mcfu_long, 
		false, 
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.monthSort
	),
	/** Option set with the following active options: {@link #check c}, {@link #monthSort M}, {@link #reverse r}.*/
	Active_Mcr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Mcdr, /*dictionaryOrder:*/Active_Mcdr_long, /*f:*/Active_Mcfr, /*ignoreCase:*/Active_Mcfr_long, /*b:*/Active_Mbcr, /*ignoreLeadingBlanks:*/Active_Mbcr_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mcru, /*unique:*/Active_Mcru_long, 
		true, 
		/*active:*/SortOption.check, SortOption.monthSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #monthSort M}, {@link #reverse r}.*/
	Active_Mcr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Mcdr, /*dictionaryOrder:*/Active_Mcdr_long, /*f:*/Active_Mcfr, /*ignoreCase:*/Active_Mcfr_long, /*b:*/Active_Mbcr, /*ignoreLeadingBlanks:*/Active_Mbcr_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Mcru, /*unique:*/Active_Mcru_long, 
		false, 
		/*active:*/SortOption.check, SortOption.monthSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #check c}, {@link #monthSort M}.*/
	Active_Mc(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Mcd, /*dictionaryOrder:*/Active_Mcd_long, /*f:*/Active_Mcf, /*ignoreCase:*/Active_Mcf_long, /*b:*/Active_Mbc, /*ignoreLeadingBlanks:*/Active_Mbc_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mcr, /*reverse:*/Active_Mcr_long, /*u:*/Active_Mcu, /*unique:*/Active_Mcu_long, 
		true, 
		/*active:*/SortOption.check, SortOption.monthSort
	),
	/** Option set with the following active options: {@link #check c}, {@link #monthSort M}.*/
	Active_Mc_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Mcd, /*dictionaryOrder:*/Active_Mcd_long, /*f:*/Active_Mcf, /*ignoreCase:*/Active_Mcf_long, /*b:*/Active_Mbc, /*ignoreLeadingBlanks:*/Active_Mbc_long, /*M:*/null /*already set*/, /*monthSort:*/null /*already set*/, /*r:*/Active_Mcr, /*reverse:*/Active_Mcr_long, /*u:*/Active_Mcu, /*unique:*/Active_Mcu_long, 
		false, 
		/*active:*/SortOption.check, SortOption.monthSort
	);
	private SortOptionSet_Mbcdfru(
		SortOptionSet_Mbcdfru c, SortOptionSet_Mbcdfru check, SortOptionSet_Mbcdfru d, SortOptionSet_Mbcdfru dictionaryOrder, SortOptionSet_Mbcdfru f, SortOptionSet_Mbcdfru ignoreCase, SortOptionSet_Mbcdfru b, SortOptionSet_Mbcdfru ignoreLeadingBlanks, SortOptionSet_Mbcdfru M, SortOptionSet_Mbcdfru monthSort, SortOptionSet_Mbcdfru r, SortOptionSet_Mbcdfru reverse, SortOptionSet_Mbcdfru u, SortOptionSet_Mbcdfru unique, 
		boolean useAcronym,
		SortOption... activeOptions
	) {
		this.c = c == null ? this : c;
		this.check = check == null ? this : check;
		this.d = d == null ? this : d;
		this.dictionaryOrder = dictionaryOrder == null ? this : dictionaryOrder;
		this.f = f == null ? this : f;
		this.ignoreCase = ignoreCase == null ? this : ignoreCase;
		this.b = b == null ? this : b;
		this.ignoreLeadingBlanks = ignoreLeadingBlanks == null ? this : ignoreLeadingBlanks;
		this.M = M == null ? this : M;
		this.monthSort = monthSort == null ? this : monthSort;
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
	public final SortOptionSet_Mbcdfru c;
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
	public final SortOptionSet_Mbcdfru check;
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
	public final SortOptionSet_Mbcdfru d;
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
	public final SortOptionSet_Mbcdfru dictionaryOrder;
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
	public final SortOptionSet_Mbcdfru f;
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
	public final SortOptionSet_Mbcdfru ignoreCase;
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
	public final SortOptionSet_Mbcdfru b;
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
	public final SortOptionSet_Mbcdfru ignoreLeadingBlanks;
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
	 * Option {@code "-r"}: Reverse the sense of comparisons.
	 * <p>
	 * The option {@code "-r"} is equivalent to the {@code "--}{@link #reverse reverse}{@code "} option.
	 * <p>
	 * Technically speaking, this field points to a set with the options of the 
	 * current set plus the option {@code "-r"}. If the option {@code "-r"}
	 * is already set, the field {@code r} points to the enum constant itself
	 * as it already represents the current set of options.
	 */
	public final SortOptionSet_Mbcdfru r;
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
	public final SortOptionSet_Mbcdfru reverse;
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
	public final SortOptionSet_Mbcdfru u;
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
	public final SortOptionSet_Mbcdfru unique;
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
	 *    SortOptionSet_Mbcdfru.check.d;
	 * </pre>
	 * uses acronyms, that is, this method always returns true for the above 
	 * set. 
	 * <p>
	 * On the other hand, long option names are used and this method always 
	 * returns false for the set
	 * <pre>
	 *    SortOptionSet_Mbcdfru.c.dictionaryOrder;
	 * </pre>
	 * <p>
	 * Note that a repeated option is <i>not</i> treated as the last set option.
	 * For instance, the first and last option of the following set are 
	 * equivalent and acronyms are used:
	 * <pre>
	 *    SortOptionSet_Mbcdfru.c.d.check;
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
