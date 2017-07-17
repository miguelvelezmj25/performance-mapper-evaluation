package org.unix4j.unix.sort;

import org.unix4j.option.Option;
import org.unix4j.unix.Sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Option sets for the {@link Sort sort} command with
 * the following options: {@link #c c}, {@link #d d}, {@link #f f}, {@link #b b}, {@link #n n}, {@link #r r}, {@link #u u}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Sort#Options} should be used instead to specify command
 * options. See also {@link org.unix4j.unix.sort.SortOptions} for more information.
 */
public enum SortOptionSet_bcdfnru implements SortOptions {
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bcdfnru(
        /*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bcdfnru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #unique u}.
     */
    Active_bcdfnu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bcdfnru, /*reverse:*/Active_bcdfnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #unique u}.
     */
    Active_bcdfnu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bcdfnru, /*reverse:*/Active_bcdfnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bcdnru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_bcdfnru, /*ignoreCase:*/Active_bcdfnru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bcdnru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_bcdfnru, /*ignoreCase:*/Active_bcdfnru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bcfnru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdfnru, /*dictionaryOrder:*/Active_bcdfnru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bcfnru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdfnru, /*dictionaryOrder:*/Active_bcdfnru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.
     */
    Active_cdfnru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcdfnru, /*ignoreLeadingBlanks:*/Active_bcdfnru_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.numericSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.
     */
    Active_cdfnru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcdfnru, /*ignoreLeadingBlanks:*/Active_bcdfnru_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.numericSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #reverse r}.
     */
    Active_bcdfnr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bcdfnru, /*unique:*/Active_bcdfnru_long,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #reverse r}.
     */
    Active_bcdfnr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bcdfnru, /*unique:*/Active_bcdfnru_long,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #unique u}.
     */
    Active_bcdnu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_bcdfnu, /*ignoreCase:*/Active_bcdfnu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bcdnru, /*reverse:*/Active_bcdnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #unique u}.
     */
    Active_bcdnu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_bcdfnu, /*ignoreCase:*/Active_bcdfnu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bcdnru, /*reverse:*/Active_bcdnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #unique u}.
     */
    Active_bcfnu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdfnu, /*dictionaryOrder:*/Active_bcdfnu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bcfnru, /*reverse:*/Active_bcfnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #unique u}.
     */
    Active_bcfnu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdfnu, /*dictionaryOrder:*/Active_bcdfnu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bcfnru, /*reverse:*/Active_bcfnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bcnru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdnru, /*dictionaryOrder:*/Active_bcdnru_long, /*f:*/Active_bcfnru, /*ignoreCase:*/Active_bcfnru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.
     */
    Active_bcnru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdnru, /*dictionaryOrder:*/Active_bcdnru_long, /*f:*/Active_bcfnru, /*ignoreCase:*/Active_bcfnru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #numericSort n}, {@link #unique u}.
     */
    Active_cdfnu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcdfnu, /*ignoreLeadingBlanks:*/Active_bcdfnu_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_cdfnru, /*reverse:*/Active_cdfnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.numericSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #numericSort n}, {@link #unique u}.
     */
    Active_cdfnu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcdfnu, /*ignoreLeadingBlanks:*/Active_bcdfnu_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_cdfnru, /*reverse:*/Active_cdfnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.numericSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.
     */
    Active_cdnru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_cdfnru, /*ignoreCase:*/Active_cdfnru_long, /*b:*/Active_bcdnru, /*ignoreLeadingBlanks:*/Active_bcdnru_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.numericSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.
     */
    Active_cdnru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_cdfnru, /*ignoreCase:*/Active_cdfnru_long, /*b:*/Active_bcdnru, /*ignoreLeadingBlanks:*/Active_bcdnru_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.numericSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.
     */
    Active_cfnru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdfnru, /*dictionaryOrder:*/Active_cdfnru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcfnru, /*ignoreLeadingBlanks:*/Active_bcfnru_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.numericSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.
     */
    Active_cfnru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdfnru, /*dictionaryOrder:*/Active_cdfnru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcfnru, /*ignoreLeadingBlanks:*/Active_bcfnru_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.numericSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}.
     */
    Active_bcdfn(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bcdfnr, /*reverse:*/Active_bcdfnr_long, /*u:*/Active_bcdfnu, /*unique:*/Active_bcdfnu_long,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.numericSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}.
     */
    Active_bcdfn_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bcdfnr, /*reverse:*/Active_bcdfnr_long, /*u:*/Active_bcdfnu, /*unique:*/Active_bcdfnu_long,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.numericSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #reverse r}.
     */
    Active_bcdnr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_bcdfnr, /*ignoreCase:*/Active_bcdfnr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bcdnru, /*unique:*/Active_bcdnru_long,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #reverse r}.
     */
    Active_bcdnr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_bcdfnr, /*ignoreCase:*/Active_bcdfnr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bcdnru, /*unique:*/Active_bcdnru_long,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #reverse r}.
     */
    Active_bcfnr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdfnr, /*dictionaryOrder:*/Active_bcdfnr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bcfnru, /*unique:*/Active_bcfnru_long,
            true,
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #reverse r}.
     */
    Active_bcfnr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdfnr, /*dictionaryOrder:*/Active_bcdfnr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bcfnru, /*unique:*/Active_bcfnru_long,
            false,
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #numericSort n}, {@link #reverse r}.
     */
    Active_cdfnr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcdfnr, /*ignoreLeadingBlanks:*/Active_bcdfnr_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_cdfnru, /*unique:*/Active_cdfnru_long,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.numericSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #numericSort n}, {@link #reverse r}.
     */
    Active_cdfnr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcdfnr, /*ignoreLeadingBlanks:*/Active_bcdfnr_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_cdfnru, /*unique:*/Active_cdfnru_long,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.numericSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #unique u}.
     */
    Active_bcnu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdnu, /*dictionaryOrder:*/Active_bcdnu_long, /*f:*/Active_bcfnu, /*ignoreCase:*/Active_bcfnu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bcnru, /*reverse:*/Active_bcnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #unique u}.
     */
    Active_bcnu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdnu, /*dictionaryOrder:*/Active_bcdnu_long, /*f:*/Active_bcfnu, /*ignoreCase:*/Active_bcfnu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bcnru, /*reverse:*/Active_bcnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #numericSort n}, {@link #unique u}.
     */
    Active_cdnu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_cdfnu, /*ignoreCase:*/Active_cdfnu_long, /*b:*/Active_bcdnu, /*ignoreLeadingBlanks:*/Active_bcdnu_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_cdnru, /*reverse:*/Active_cdnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.numericSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #numericSort n}, {@link #unique u}.
     */
    Active_cdnu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_cdfnu, /*ignoreCase:*/Active_cdfnu_long, /*b:*/Active_bcdnu, /*ignoreLeadingBlanks:*/Active_bcdnu_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_cdnru, /*reverse:*/Active_cdnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.numericSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #numericSort n}, {@link #unique u}.
     */
    Active_cfnu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdfnu, /*dictionaryOrder:*/Active_cdfnu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcfnu, /*ignoreLeadingBlanks:*/Active_bcfnu_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_cfnru, /*reverse:*/Active_cfnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.numericSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #numericSort n}, {@link #unique u}.
     */
    Active_cfnu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdfnu, /*dictionaryOrder:*/Active_cdfnu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcfnu, /*ignoreLeadingBlanks:*/Active_bcfnu_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_cfnru, /*reverse:*/Active_cfnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.numericSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.
     */
    Active_cnru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdnru, /*dictionaryOrder:*/Active_cdnru_long, /*f:*/Active_cfnru, /*ignoreCase:*/Active_cfnru_long, /*b:*/Active_bcnru, /*ignoreLeadingBlanks:*/Active_bcnru_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.numericSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #numericSort n}, {@link #reverse r}, {@link #unique u}.
     */
    Active_cnru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdnru, /*dictionaryOrder:*/Active_cdnru_long, /*f:*/Active_cfnru, /*ignoreCase:*/Active_cfnru_long, /*b:*/Active_bcnru, /*ignoreLeadingBlanks:*/Active_bcnru_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.numericSort, SortOption.reverse, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}.
     */
    Active_bcdn(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_bcdfn, /*ignoreCase:*/Active_bcdfn_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bcdnr, /*reverse:*/Active_bcdnr_long, /*u:*/Active_bcdnu, /*unique:*/Active_bcdnu_long,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.numericSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}.
     */
    Active_bcdn_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_bcdfn, /*ignoreCase:*/Active_bcdfn_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bcdnr, /*reverse:*/Active_bcdnr_long, /*u:*/Active_bcdnu, /*unique:*/Active_bcdnu_long,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.numericSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}.
     */
    Active_bcfn(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdfn, /*dictionaryOrder:*/Active_bcdfn_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bcfnr, /*reverse:*/Active_bcfnr_long, /*u:*/Active_bcfnu, /*unique:*/Active_bcfnu_long,
            true,
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.numericSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}.
     */
    Active_bcfn_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdfn, /*dictionaryOrder:*/Active_bcdfn_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bcfnr, /*reverse:*/Active_bcfnr_long, /*u:*/Active_bcfnu, /*unique:*/Active_bcfnu_long,
            false,
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.numericSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #reverse r}.
     */
    Active_bcnr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdnr, /*dictionaryOrder:*/Active_bcdnr_long, /*f:*/Active_bcfnr, /*ignoreCase:*/Active_bcfnr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bcnru, /*unique:*/Active_bcnru_long,
            true,
		/*active:*/SortOption.check, SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}, {@link #reverse r}.
     */
    Active_bcnr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdnr, /*dictionaryOrder:*/Active_bcdnr_long, /*f:*/Active_bcfnr, /*ignoreCase:*/Active_bcfnr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bcnru, /*unique:*/Active_bcnru_long,
            false,
		/*active:*/SortOption.check, SortOption.ignoreLeadingBlanks, SortOption.numericSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #numericSort n}.
     */
    Active_cdfn(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcdfn, /*ignoreLeadingBlanks:*/Active_bcdfn_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_cdfnr, /*reverse:*/Active_cdfnr_long, /*u:*/Active_cdfnu, /*unique:*/Active_cdfnu_long,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.numericSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #numericSort n}.
     */
    Active_cdfn_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcdfn, /*ignoreLeadingBlanks:*/Active_bcdfn_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_cdfnr, /*reverse:*/Active_cdfnr_long, /*u:*/Active_cdfnu, /*unique:*/Active_cdfnu_long,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.numericSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #numericSort n}, {@link #reverse r}.
     */
    Active_cdnr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_cdfnr, /*ignoreCase:*/Active_cdfnr_long, /*b:*/Active_bcdnr, /*ignoreLeadingBlanks:*/Active_bcdnr_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_cdnru, /*unique:*/Active_cdnru_long,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.numericSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #numericSort n}, {@link #reverse r}.
     */
    Active_cdnr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_cdfnr, /*ignoreCase:*/Active_cdfnr_long, /*b:*/Active_bcdnr, /*ignoreLeadingBlanks:*/Active_bcdnr_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_cdnru, /*unique:*/Active_cdnru_long,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.numericSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #numericSort n}, {@link #reverse r}.
     */
    Active_cfnr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdfnr, /*dictionaryOrder:*/Active_cdfnr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcfnr, /*ignoreLeadingBlanks:*/Active_bcfnr_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_cfnru, /*unique:*/Active_cfnru_long,
            true,
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.numericSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #numericSort n}, {@link #reverse r}.
     */
    Active_cfnr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdfnr, /*dictionaryOrder:*/Active_cdfnr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcfnr, /*ignoreLeadingBlanks:*/Active_bcfnr_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_cfnru, /*unique:*/Active_cfnru_long,
            false,
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.numericSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #numericSort n}, {@link #unique u}.
     */
    Active_cnu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdnu, /*dictionaryOrder:*/Active_cdnu_long, /*f:*/Active_cfnu, /*ignoreCase:*/Active_cfnu_long, /*b:*/Active_bcnu, /*ignoreLeadingBlanks:*/Active_bcnu_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_cnru, /*reverse:*/Active_cnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.numericSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #numericSort n}, {@link #unique u}.
     */
    Active_cnu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdnu, /*dictionaryOrder:*/Active_cdnu_long, /*f:*/Active_cfnu, /*ignoreCase:*/Active_cfnu_long, /*b:*/Active_bcnu, /*ignoreLeadingBlanks:*/Active_bcnu_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_cnru, /*reverse:*/Active_cnru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.numericSort, SortOption.unique
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}.
     */
    Active_bcn(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdn, /*dictionaryOrder:*/Active_bcdn_long, /*f:*/Active_bcfn, /*ignoreCase:*/Active_bcfn_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bcnr, /*reverse:*/Active_bcnr_long, /*u:*/Active_bcnu, /*unique:*/Active_bcnu_long,
            true,
		/*active:*/SortOption.check, SortOption.ignoreLeadingBlanks, SortOption.numericSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreLeadingBlanks b}, {@link #numericSort n}.
     */
    Active_bcn_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_bcdn, /*dictionaryOrder:*/Active_bcdn_long, /*f:*/Active_bcfn, /*ignoreCase:*/Active_bcfn_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_bcnr, /*reverse:*/Active_bcnr_long, /*u:*/Active_bcnu, /*unique:*/Active_bcnu_long,
            false,
		/*active:*/SortOption.check, SortOption.ignoreLeadingBlanks, SortOption.numericSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #numericSort n}.
     */
    Active_cdn(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_cdfn, /*ignoreCase:*/Active_cdfn_long, /*b:*/Active_bcdn, /*ignoreLeadingBlanks:*/Active_bcdn_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_cdnr, /*reverse:*/Active_cdnr_long, /*u:*/Active_cdnu, /*unique:*/Active_cdnu_long,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.numericSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #numericSort n}.
     */
    Active_cdn_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_cdfn, /*ignoreCase:*/Active_cdfn_long, /*b:*/Active_bcdn, /*ignoreLeadingBlanks:*/Active_bcdn_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_cdnr, /*reverse:*/Active_cdnr_long, /*u:*/Active_cdnu, /*unique:*/Active_cdnu_long,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.numericSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #numericSort n}.
     */
    Active_cfn(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdfn, /*dictionaryOrder:*/Active_cdfn_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcfn, /*ignoreLeadingBlanks:*/Active_bcfn_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_cfnr, /*reverse:*/Active_cfnr_long, /*u:*/Active_cfnu, /*unique:*/Active_cfnu_long,
            true,
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.numericSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #numericSort n}.
     */
    Active_cfn_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdfn, /*dictionaryOrder:*/Active_cdfn_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bcfn, /*ignoreLeadingBlanks:*/Active_bcfn_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_cfnr, /*reverse:*/Active_cfnr_long, /*u:*/Active_cfnu, /*unique:*/Active_cfnu_long,
            false,
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.numericSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #numericSort n}, {@link #reverse r}.
     */
    Active_cnr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdnr, /*dictionaryOrder:*/Active_cdnr_long, /*f:*/Active_cfnr, /*ignoreCase:*/Active_cfnr_long, /*b:*/Active_bcnr, /*ignoreLeadingBlanks:*/Active_bcnr_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_cnru, /*unique:*/Active_cnru_long,
            true,
		/*active:*/SortOption.check, SortOption.numericSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #numericSort n}, {@link #reverse r}.
     */
    Active_cnr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdnr, /*dictionaryOrder:*/Active_cdnr_long, /*f:*/Active_cfnr, /*ignoreCase:*/Active_cfnr_long, /*b:*/Active_bcnr, /*ignoreLeadingBlanks:*/Active_bcnr_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_cnru, /*unique:*/Active_cnru_long,
            false,
		/*active:*/SortOption.check, SortOption.numericSort, SortOption.reverse
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #numericSort n}.
     */
    Active_cn(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdn, /*dictionaryOrder:*/Active_cdn_long, /*f:*/Active_cfn, /*ignoreCase:*/Active_cfn_long, /*b:*/Active_bcn, /*ignoreLeadingBlanks:*/Active_bcn_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_cnr, /*reverse:*/Active_cnr_long, /*u:*/Active_cnu, /*unique:*/Active_cnu_long,
            true,
		/*active:*/SortOption.check, SortOption.numericSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #numericSort n}.
     */
    Active_cn_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_cdn, /*dictionaryOrder:*/Active_cdn_long, /*f:*/Active_cfn, /*ignoreCase:*/Active_cfn_long, /*b:*/Active_bcn, /*ignoreLeadingBlanks:*/Active_bcn_long, /*n:*/null /*already set*/, /*numericSort:*/null /*already set*/, /*r:*/Active_cnr, /*reverse:*/Active_cnr_long, /*u:*/Active_cnu, /*unique:*/Active_cnu_long,
            false,
		/*active:*/SortOption.check, SortOption.numericSort
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
    public final SortOptionSet_bcdfnru c;
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
    public final SortOptionSet_bcdfnru check;
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
    public final SortOptionSet_bcdfnru d;
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
    public final SortOptionSet_bcdfnru dictionaryOrder;
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
    public final SortOptionSet_bcdfnru f;
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
    public final SortOptionSet_bcdfnru ignoreCase;
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
    public final SortOptionSet_bcdfnru b;
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
    public final SortOptionSet_bcdfnru ignoreLeadingBlanks;
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
    public final SortOptionSet_bcdfnru n;
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
    public final SortOptionSet_bcdfnru r;
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
    public final SortOptionSet_bcdfnru reverse;
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
    public final SortOptionSet_bcdfnru u;
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
    public final SortOptionSet_bcdfnru unique;
    private final boolean useAcronym;
    private final EnumSet<SortOption> options;
    private SortOptionSet_bcdfnru(
            SortOptionSet_bcdfnru c, SortOptionSet_bcdfnru check, SortOptionSet_bcdfnru d, SortOptionSet_bcdfnru dictionaryOrder, SortOptionSet_bcdfnru f, SortOptionSet_bcdfnru ignoreCase, SortOptionSet_bcdfnru b, SortOptionSet_bcdfnru ignoreLeadingBlanks, SortOptionSet_bcdfnru n, SortOptionSet_bcdfnru numericSort, SortOptionSet_bcdfnru r, SortOptionSet_bcdfnru reverse, SortOptionSet_bcdfnru u, SortOptionSet_bcdfnru unique,
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
        this.n = n == null ? this : n;
        this.numericSort = numericSort == null ? this : numericSort;
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
     *    SortOptionSet_bcdfnru.check.d;
     * </pre>
     * uses acronyms, that is, this method always returns true for the above
     * set.
     * <p>
     * On the other hand, long option names are used and this method always
     * returns false for the set
     * <pre>
     *    SortOptionSet_bcdfnru.c.dictionaryOrder;
     * </pre>
     * <p>
     * Note that a repeated option is <i>not</i> treated as the last set option.
     * For instance, the first and last option of the following set are
     * equivalent and acronyms are used:
     * <pre>
     *    SortOptionSet_bcdfnru.c.d.check;
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
