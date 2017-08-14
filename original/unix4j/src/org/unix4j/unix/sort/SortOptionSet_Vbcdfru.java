package org.unix4j.unix.sort;

import org.unix4j.option.Option;
import org.unix4j.unix.Sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;

/**
 * Option sets for the {@link Sort sort} command with
 * the following options: {@link #c c}, {@link #d d}, {@link #f f}, {@link #b b}, {@link #r r}, {@link #u u}, {@link #V V}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Sort#Options} should be used instead to specify command
 * options. See also {@link org.unix4j.unix.sort.SortOptions} for more information.
 */
public enum SortOptionSet_Vbcdfru implements SortOptions {
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vbcdfru(
        /*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
        /*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vbcdfru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vbcdfu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_Vbcdfru, /*reverse:*/Active_Vbcdfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vbcdfu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_Vbcdfru, /*reverse:*/Active_Vbcdfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vbcdru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vbcdfru, /*ignoreCase:*/Active_Vbcdfru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vbcdru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vbcdfru, /*ignoreCase:*/Active_Vbcdfru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vbcfru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Vbcdfru, /*dictionaryOrder:*/Active_Vbcdfru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vbcfru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Vbcdfru, /*dictionaryOrder:*/Active_Vbcdfru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vcdfru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbcdfru, /*ignoreLeadingBlanks:*/Active_Vbcdfru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.reverse, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vcdfru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbcdfru, /*ignoreLeadingBlanks:*/Active_Vbcdfru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.reverse, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #versionSort V}.
     */
    Active_Vbcdfr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vbcdfru, /*unique:*/Active_Vbcdfru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #versionSort V}.
     */
    Active_Vbcdfr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vbcdfru, /*unique:*/Active_Vbcdfru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vbcdu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vbcdfu, /*ignoreCase:*/Active_Vbcdfu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_Vbcdru, /*reverse:*/Active_Vbcdru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vbcdu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vbcdfu, /*ignoreCase:*/Active_Vbcdfu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_Vbcdru, /*reverse:*/Active_Vbcdru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vbcfu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Vbcdfu, /*dictionaryOrder:*/Active_Vbcdfu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_Vbcfru, /*reverse:*/Active_Vbcfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vbcfu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Vbcdfu, /*dictionaryOrder:*/Active_Vbcdfu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_Vbcfru, /*reverse:*/Active_Vbcfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vbcru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Vbcdru, /*dictionaryOrder:*/Active_Vbcdru_long, /*f:*/Active_Vbcfru, /*ignoreCase:*/Active_Vbcfru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vbcru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Vbcdru, /*dictionaryOrder:*/Active_Vbcdru_long, /*f:*/Active_Vbcfru, /*ignoreCase:*/Active_Vbcfru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vcdfu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbcdfu, /*ignoreLeadingBlanks:*/Active_Vbcdfu_long, /*r:*/Active_Vcdfru, /*reverse:*/Active_Vcdfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vcdfu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbcdfu, /*ignoreLeadingBlanks:*/Active_Vbcdfu_long, /*r:*/Active_Vcdfru, /*reverse:*/Active_Vcdfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vcdru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vcdfru, /*ignoreCase:*/Active_Vcdfru_long, /*b:*/Active_Vbcdru, /*ignoreLeadingBlanks:*/Active_Vbcdru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.reverse, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vcdru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vcdfru, /*ignoreCase:*/Active_Vcdfru_long, /*b:*/Active_Vbcdru, /*ignoreLeadingBlanks:*/Active_Vbcdru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.reverse, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vcfru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Vcdfru, /*dictionaryOrder:*/Active_Vcdfru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbcfru, /*ignoreLeadingBlanks:*/Active_Vbcfru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.reverse, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vcfru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Vcdfru, /*dictionaryOrder:*/Active_Vcdfru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbcfru, /*ignoreLeadingBlanks:*/Active_Vbcfru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.reverse, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #versionSort V}.
     */
    Active_Vbcdf(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_Vbcdfr, /*reverse:*/Active_Vbcdfr_long, /*u:*/Active_Vbcdfu, /*unique:*/Active_Vbcdfu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #versionSort V}.
     */
    Active_Vbcdf_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_Vbcdfr, /*reverse:*/Active_Vbcdfr_long, /*u:*/Active_Vbcdfu, /*unique:*/Active_Vbcdfu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #versionSort V}.
     */
    Active_Vbcdr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vbcdfr, /*ignoreCase:*/Active_Vbcdfr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vbcdru, /*unique:*/Active_Vbcdru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #versionSort V}.
     */
    Active_Vbcdr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vbcdfr, /*ignoreCase:*/Active_Vbcdfr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vbcdru, /*unique:*/Active_Vbcdru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #versionSort V}.
     */
    Active_Vbcfr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Vbcdfr, /*dictionaryOrder:*/Active_Vbcdfr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vbcfru, /*unique:*/Active_Vbcfru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #versionSort V}.
     */
    Active_Vbcfr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Vbcdfr, /*dictionaryOrder:*/Active_Vbcdfr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vbcfru, /*unique:*/Active_Vbcfru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #reverse r}, {@link #versionSort V}.
     */
    Active_Vcdfr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbcdfr, /*ignoreLeadingBlanks:*/Active_Vbcdfr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vcdfru, /*unique:*/Active_Vcdfru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.reverse, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #reverse r}, {@link #versionSort V}.
     */
    Active_Vcdfr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbcdfr, /*ignoreLeadingBlanks:*/Active_Vbcdfr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vcdfru, /*unique:*/Active_Vcdfru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.reverse, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreLeadingBlanks b}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vbcu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Vbcdu, /*dictionaryOrder:*/Active_Vbcdu_long, /*f:*/Active_Vbcfu, /*ignoreCase:*/Active_Vbcfu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_Vbcru, /*reverse:*/Active_Vbcru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.ignoreLeadingBlanks, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreLeadingBlanks b}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vbcu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Vbcdu, /*dictionaryOrder:*/Active_Vbcdu_long, /*f:*/Active_Vbcfu, /*ignoreCase:*/Active_Vbcfu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_Vbcru, /*reverse:*/Active_Vbcru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.ignoreLeadingBlanks, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vcdu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vcdfu, /*ignoreCase:*/Active_Vcdfu_long, /*b:*/Active_Vbcdu, /*ignoreLeadingBlanks:*/Active_Vbcdu_long, /*r:*/Active_Vcdru, /*reverse:*/Active_Vcdru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vcdu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vcdfu, /*ignoreCase:*/Active_Vcdfu_long, /*b:*/Active_Vbcdu, /*ignoreLeadingBlanks:*/Active_Vbcdu_long, /*r:*/Active_Vcdru, /*reverse:*/Active_Vcdru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vcfu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Vcdfu, /*dictionaryOrder:*/Active_Vcdfu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbcfu, /*ignoreLeadingBlanks:*/Active_Vbcfu_long, /*r:*/Active_Vcfru, /*reverse:*/Active_Vcfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vcfu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Vcdfu, /*dictionaryOrder:*/Active_Vcdfu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbcfu, /*ignoreLeadingBlanks:*/Active_Vbcfu_long, /*r:*/Active_Vcfru, /*reverse:*/Active_Vcfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vcru(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Vcdru, /*dictionaryOrder:*/Active_Vcdru_long, /*f:*/Active_Vcfru, /*ignoreCase:*/Active_Vcfru_long, /*b:*/Active_Vbcru, /*ignoreLeadingBlanks:*/Active_Vbcru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.reverse, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vcru_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Vcdru, /*dictionaryOrder:*/Active_Vcdru_long, /*f:*/Active_Vcfru, /*ignoreCase:*/Active_Vcfru_long, /*b:*/Active_Vbcru, /*ignoreLeadingBlanks:*/Active_Vbcru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.reverse, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #versionSort V}.
     */
    Active_Vbcd(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vbcdf, /*ignoreCase:*/Active_Vbcdf_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_Vbcdr, /*reverse:*/Active_Vbcdr_long, /*u:*/Active_Vbcdu, /*unique:*/Active_Vbcdu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #versionSort V}.
     */
    Active_Vbcd_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vbcdf, /*ignoreCase:*/Active_Vbcdf_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_Vbcdr, /*reverse:*/Active_Vbcdr_long, /*u:*/Active_Vbcdu, /*unique:*/Active_Vbcdu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #versionSort V}.
     */
    Active_Vbcf(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Vbcdf, /*dictionaryOrder:*/Active_Vbcdf_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_Vbcfr, /*reverse:*/Active_Vbcfr_long, /*u:*/Active_Vbcfu, /*unique:*/Active_Vbcfu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #versionSort V}.
     */
    Active_Vbcf_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Vbcdf, /*dictionaryOrder:*/Active_Vbcdf_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_Vbcfr, /*reverse:*/Active_Vbcfr_long, /*u:*/Active_Vbcfu, /*unique:*/Active_Vbcfu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #versionSort V}.
     */
    Active_Vbcr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Vbcdr, /*dictionaryOrder:*/Active_Vbcdr_long, /*f:*/Active_Vbcfr, /*ignoreCase:*/Active_Vbcfr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vbcru, /*unique:*/Active_Vbcru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #versionSort V}.
     */
    Active_Vbcr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Vbcdr, /*dictionaryOrder:*/Active_Vbcdr_long, /*f:*/Active_Vbcfr, /*ignoreCase:*/Active_Vbcfr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vbcru, /*unique:*/Active_Vbcru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #versionSort V}.
     */
    Active_Vcdf(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbcdf, /*ignoreLeadingBlanks:*/Active_Vbcdf_long, /*r:*/Active_Vcdfr, /*reverse:*/Active_Vcdfr_long, /*u:*/Active_Vcdfu, /*unique:*/Active_Vcdfu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #versionSort V}.
     */
    Active_Vcdf_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbcdf, /*ignoreLeadingBlanks:*/Active_Vbcdf_long, /*r:*/Active_Vcdfr, /*reverse:*/Active_Vcdfr_long, /*u:*/Active_Vcdfu, /*unique:*/Active_Vcdfu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #reverse r}, {@link #versionSort V}.
     */
    Active_Vcdr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vcdfr, /*ignoreCase:*/Active_Vcdfr_long, /*b:*/Active_Vbcdr, /*ignoreLeadingBlanks:*/Active_Vbcdr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vcdru, /*unique:*/Active_Vcdru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.reverse, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #reverse r}, {@link #versionSort V}.
     */
    Active_Vcdr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vcdfr, /*ignoreCase:*/Active_Vcdfr_long, /*b:*/Active_Vbcdr, /*ignoreLeadingBlanks:*/Active_Vbcdr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vcdru, /*unique:*/Active_Vcdru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.reverse, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #reverse r}, {@link #versionSort V}.
     */
    Active_Vcfr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Vcdfr, /*dictionaryOrder:*/Active_Vcdfr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbcfr, /*ignoreLeadingBlanks:*/Active_Vbcfr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vcfru, /*unique:*/Active_Vcfru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.reverse, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #reverse r}, {@link #versionSort V}.
     */
    Active_Vcfr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Vcdfr, /*dictionaryOrder:*/Active_Vcdfr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbcfr, /*ignoreLeadingBlanks:*/Active_Vbcfr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vcfru, /*unique:*/Active_Vcfru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.reverse, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vcu(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Vcdu, /*dictionaryOrder:*/Active_Vcdu_long, /*f:*/Active_Vcfu, /*ignoreCase:*/Active_Vcfu_long, /*b:*/Active_Vbcu, /*ignoreLeadingBlanks:*/Active_Vbcu_long, /*r:*/Active_Vcru, /*reverse:*/Active_Vcru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #unique u}, {@link #versionSort V}.
     */
    Active_Vcu_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Vcdu, /*dictionaryOrder:*/Active_Vcdu_long, /*f:*/Active_Vcfu, /*ignoreCase:*/Active_Vcfu_long, /*b:*/Active_Vbcu, /*ignoreLeadingBlanks:*/Active_Vbcu_long, /*r:*/Active_Vcru, /*reverse:*/Active_Vcru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.unique, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreLeadingBlanks b}, {@link #versionSort V}.
     */
    Active_Vbc(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Vbcd, /*dictionaryOrder:*/Active_Vbcd_long, /*f:*/Active_Vbcf, /*ignoreCase:*/Active_Vbcf_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_Vbcr, /*reverse:*/Active_Vbcr_long, /*u:*/Active_Vbcu, /*unique:*/Active_Vbcu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.ignoreLeadingBlanks, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreLeadingBlanks b}, {@link #versionSort V}.
     */
    Active_Vbc_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Vbcd, /*dictionaryOrder:*/Active_Vbcd_long, /*f:*/Active_Vbcf, /*ignoreCase:*/Active_Vbcf_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*r:*/Active_Vbcr, /*reverse:*/Active_Vbcr_long, /*u:*/Active_Vbcu, /*unique:*/Active_Vbcu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.ignoreLeadingBlanks, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #versionSort V}.
     */
    Active_Vcd(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vcdf, /*ignoreCase:*/Active_Vcdf_long, /*b:*/Active_Vbcd, /*ignoreLeadingBlanks:*/Active_Vbcd_long, /*r:*/Active_Vcdr, /*reverse:*/Active_Vcdr_long, /*u:*/Active_Vcdu, /*unique:*/Active_Vcdu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #dictionaryOrder d}, {@link #versionSort V}.
     */
    Active_Vcd_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vcdf, /*ignoreCase:*/Active_Vcdf_long, /*b:*/Active_Vbcd, /*ignoreLeadingBlanks:*/Active_Vbcd_long, /*r:*/Active_Vcdr, /*reverse:*/Active_Vcdr_long, /*u:*/Active_Vcdu, /*unique:*/Active_Vcdu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.dictionaryOrder, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #versionSort V}.
     */
    Active_Vcf(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Vcdf, /*dictionaryOrder:*/Active_Vcdf_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbcf, /*ignoreLeadingBlanks:*/Active_Vbcf_long, /*r:*/Active_Vcfr, /*reverse:*/Active_Vcfr_long, /*u:*/Active_Vcfu, /*unique:*/Active_Vcfu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #ignoreCase f}, {@link #versionSort V}.
     */
    Active_Vcf_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Vcdf, /*dictionaryOrder:*/Active_Vcdf_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbcf, /*ignoreLeadingBlanks:*/Active_Vbcf_long, /*r:*/Active_Vcfr, /*reverse:*/Active_Vcfr_long, /*u:*/Active_Vcfu, /*unique:*/Active_Vcfu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.ignoreCase, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #reverse r}, {@link #versionSort V}.
     */
    Active_Vcr(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Vcdr, /*dictionaryOrder:*/Active_Vcdr_long, /*f:*/Active_Vcfr, /*ignoreCase:*/Active_Vcfr_long, /*b:*/Active_Vbcr, /*ignoreLeadingBlanks:*/Active_Vbcr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vcru, /*unique:*/Active_Vcru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.reverse, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #reverse r}, {@link #versionSort V}.
     */
    Active_Vcr_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Vcdr, /*dictionaryOrder:*/Active_Vcdr_long, /*f:*/Active_Vcfr, /*ignoreCase:*/Active_Vcfr_long, /*b:*/Active_Vbcr, /*ignoreLeadingBlanks:*/Active_Vbcr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vcru, /*unique:*/Active_Vcru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.reverse, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #versionSort V}.
     */
    Active_Vc(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Vcd, /*dictionaryOrder:*/Active_Vcd_long, /*f:*/Active_Vcf, /*ignoreCase:*/Active_Vcf_long, /*b:*/Active_Vbc, /*ignoreLeadingBlanks:*/Active_Vbc_long, /*r:*/Active_Vcr, /*reverse:*/Active_Vcr_long, /*u:*/Active_Vcu, /*unique:*/Active_Vcu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            true,
		/*active:*/SortOption.check, SortOption.versionSort
    ),
    /**
     * Option set with the following active options: {@link #check c}, {@link #versionSort V}.
     */
    Active_Vc_long(
		/*c:*/null /*already set*/, /*check:*/null /*already set*/, /*d:*/Active_Vcd, /*dictionaryOrder:*/Active_Vcd_long, /*f:*/Active_Vcf, /*ignoreCase:*/Active_Vcf_long, /*b:*/Active_Vbc, /*ignoreLeadingBlanks:*/Active_Vbc_long, /*r:*/Active_Vcr, /*reverse:*/Active_Vcr_long, /*u:*/Active_Vcu, /*unique:*/Active_Vcu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/,
            false,
		/*active:*/SortOption.check, SortOption.versionSort
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
    public final SortOptionSet_Vbcdfru c;
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
    public final SortOptionSet_Vbcdfru check;
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
    public final SortOptionSet_Vbcdfru d;
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
    public final SortOptionSet_Vbcdfru dictionaryOrder;
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
    public final SortOptionSet_Vbcdfru f;
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
    public final SortOptionSet_Vbcdfru ignoreCase;
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
    public final SortOptionSet_Vbcdfru b;
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
    public final SortOptionSet_Vbcdfru ignoreLeadingBlanks;
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
    public final SortOptionSet_Vbcdfru r;
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
    public final SortOptionSet_Vbcdfru reverse;
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
    public final SortOptionSet_Vbcdfru u;
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
    public final SortOptionSet_Vbcdfru unique;
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
    public final SortOptionSet_Vbcdfru V;
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
    public final SortOptionSet_Vbcdfru versionSort;
    private final boolean useAcronym;
    private final EnumSet<SortOption> options;

    private SortOptionSet_Vbcdfru(
            SortOptionSet_Vbcdfru c, SortOptionSet_Vbcdfru check, SortOptionSet_Vbcdfru d, SortOptionSet_Vbcdfru dictionaryOrder, SortOptionSet_Vbcdfru f, SortOptionSet_Vbcdfru ignoreCase, SortOptionSet_Vbcdfru b, SortOptionSet_Vbcdfru ignoreLeadingBlanks, SortOptionSet_Vbcdfru r, SortOptionSet_Vbcdfru reverse, SortOptionSet_Vbcdfru u, SortOptionSet_Vbcdfru unique, SortOptionSet_Vbcdfru V, SortOptionSet_Vbcdfru versionSort,
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
     *    SortOptionSet_Vbcdfru.check.d;
     * </pre>
     * uses acronyms, that is, this method always returns true for the above
     * set.
     * <p>
     * On the other hand, long option names are used and this method always
     * returns false for the set
     * <pre>
     *    SortOptionSet_Vbcdfru.c.dictionaryOrder;
     * </pre>
     * <p>
     * Note that a repeated option is <i>not</i> treated as the last set option.
     * For instance, the first and last option of the following set are
     * equivalent and acronyms are used:
     * <pre>
     *    SortOptionSet_Vbcdfru.c.d.check;
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
