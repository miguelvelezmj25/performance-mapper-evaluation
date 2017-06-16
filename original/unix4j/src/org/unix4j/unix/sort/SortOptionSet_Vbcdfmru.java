package org.unix4j.unix.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import org.unix4j.option.Option;

import org.unix4j.unix.Sort;

/**
 * Option sets for the {@link Sort sort} command with 
 * the following options: {@link #c c}, {@link #d d}, {@link #f f}, {@link #b b}, {@link #m m}, {@link #r r}, {@link #u u}, {@link #V V}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Sort#Options} should be used instead to specify command 
 * options. See also {@link org.unix4j.unix.sort.SortOptions} for more information.
 */
public enum SortOptionSet_Vbcdfmru implements SortOptions {
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.*/
	Active_Vbdfru(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vbcdfru, /*check:*/SortOptionSet_Vbcdfru.Active_Vbcdfru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Vbdfmru.Active_Vbdfmru, /*merge:*/SortOptionSet_Vbdfmru.Active_Vbdfmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.*/
	Active_Vbdfru_long(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vbcdfru, /*check:*/SortOptionSet_Vbcdfru.Active_Vbcdfru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Vbdfmru.Active_Vbdfmru, /*merge:*/SortOptionSet_Vbdfmru.Active_Vbdfmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #unique u}, {@link #versionSort V}.*/
	Active_Vbdfu(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vbcdfu, /*check:*/SortOptionSet_Vbcdfru.Active_Vbcdfu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Vbdfmru.Active_Vbdfmu, /*merge:*/SortOptionSet_Vbdfmru.Active_Vbdfmu_long, /*r:*/Active_Vbdfru, /*reverse:*/Active_Vbdfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.unique, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #unique u}, {@link #versionSort V}.*/
	Active_Vbdfu_long(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vbcdfu, /*check:*/SortOptionSet_Vbcdfru.Active_Vbcdfu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Vbdfmru.Active_Vbdfmu, /*merge:*/SortOptionSet_Vbdfmru.Active_Vbdfmu_long, /*r:*/Active_Vbdfru, /*reverse:*/Active_Vbdfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.unique, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.*/
	Active_Vbdru(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vbcdru, /*check:*/SortOptionSet_Vbcdfru.Active_Vbcdru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vbdfru, /*ignoreCase:*/Active_Vbdfru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Vbdfmru.Active_Vbdmru, /*merge:*/SortOptionSet_Vbdfmru.Active_Vbdmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.*/
	Active_Vbdru_long(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vbcdru, /*check:*/SortOptionSet_Vbcdfru.Active_Vbcdru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vbdfru, /*ignoreCase:*/Active_Vbdfru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Vbdfmru.Active_Vbdmru, /*merge:*/SortOptionSet_Vbdfmru.Active_Vbdmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.*/
	Active_Vbfru(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vbcfru, /*check:*/SortOptionSet_Vbcdfru.Active_Vbcfru_long, /*d:*/Active_Vbdfru, /*dictionaryOrder:*/Active_Vbdfru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Vbdfmru.Active_Vbfmru, /*merge:*/SortOptionSet_Vbdfmru.Active_Vbfmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.*/
	Active_Vbfru_long(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vbcfru, /*check:*/SortOptionSet_Vbcdfru.Active_Vbcfru_long, /*d:*/Active_Vbdfru, /*dictionaryOrder:*/Active_Vbdfru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Vbdfmru.Active_Vbfmru, /*merge:*/SortOptionSet_Vbdfmru.Active_Vbfmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.*/
	Active_Vdfru(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vcdfru, /*check:*/SortOptionSet_Vbcdfru.Active_Vcdfru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbdfru, /*ignoreLeadingBlanks:*/Active_Vbdfru_long, /*m:*/SortOptionSet_Vbdfmru.Active_Vdfmru, /*merge:*/SortOptionSet_Vbdfmru.Active_Vdfmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.reverse, SortOption.unique, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.*/
	Active_Vdfru_long(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vcdfru, /*check:*/SortOptionSet_Vbcdfru.Active_Vcdfru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbdfru, /*ignoreLeadingBlanks:*/Active_Vbdfru_long, /*m:*/SortOptionSet_Vbdfmru.Active_Vdfmru, /*merge:*/SortOptionSet_Vbdfmru.Active_Vdfmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.reverse, SortOption.unique, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #versionSort V}.*/
	Active_Vbdfr(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vbcdfr, /*check:*/SortOptionSet_Vbcdfru.Active_Vbcdfr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Vbdfmru.Active_Vbdfmr, /*merge:*/SortOptionSet_Vbdfmru.Active_Vbdfmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vbdfru, /*unique:*/Active_Vbdfru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #versionSort V}.*/
	Active_Vbdfr_long(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vbcdfr, /*check:*/SortOptionSet_Vbcdfru.Active_Vbcdfr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Vbdfmru.Active_Vbdfmr, /*merge:*/SortOptionSet_Vbdfmru.Active_Vbdfmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vbdfru, /*unique:*/Active_Vbdfru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #unique u}, {@link #versionSort V}.*/
	Active_Vbdu(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vbcdu, /*check:*/SortOptionSet_Vbcdfru.Active_Vbcdu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vbdfu, /*ignoreCase:*/Active_Vbdfu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Vbdfmru.Active_Vbdmu, /*merge:*/SortOptionSet_Vbdfmru.Active_Vbdmu_long, /*r:*/Active_Vbdru, /*reverse:*/Active_Vbdru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.unique, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #unique u}, {@link #versionSort V}.*/
	Active_Vbdu_long(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vbcdu, /*check:*/SortOptionSet_Vbcdfru.Active_Vbcdu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vbdfu, /*ignoreCase:*/Active_Vbdfu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Vbdfmru.Active_Vbdmu, /*merge:*/SortOptionSet_Vbdfmru.Active_Vbdmu_long, /*r:*/Active_Vbdru, /*reverse:*/Active_Vbdru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.unique, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #unique u}, {@link #versionSort V}.*/
	Active_Vbfu(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vbcfu, /*check:*/SortOptionSet_Vbcdfru.Active_Vbcfu_long, /*d:*/Active_Vbdfu, /*dictionaryOrder:*/Active_Vbdfu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Vbdfmru.Active_Vbfmu, /*merge:*/SortOptionSet_Vbdfmru.Active_Vbfmu_long, /*r:*/Active_Vbfru, /*reverse:*/Active_Vbfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.unique, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #unique u}, {@link #versionSort V}.*/
	Active_Vbfu_long(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vbcfu, /*check:*/SortOptionSet_Vbcdfru.Active_Vbcfu_long, /*d:*/Active_Vbdfu, /*dictionaryOrder:*/Active_Vbdfu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Vbdfmru.Active_Vbfmu, /*merge:*/SortOptionSet_Vbdfmru.Active_Vbfmu_long, /*r:*/Active_Vbfru, /*reverse:*/Active_Vbfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.unique, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.*/
	Active_Vbru(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vbcru, /*check:*/SortOptionSet_Vbcdfru.Active_Vbcru_long, /*d:*/Active_Vbdru, /*dictionaryOrder:*/Active_Vbdru_long, /*f:*/Active_Vbfru, /*ignoreCase:*/Active_Vbfru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Vbdfmru.Active_Vbmru, /*merge:*/SortOptionSet_Vbdfmru.Active_Vbmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.*/
	Active_Vbru_long(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vbcru, /*check:*/SortOptionSet_Vbcdfru.Active_Vbcru_long, /*d:*/Active_Vbdru, /*dictionaryOrder:*/Active_Vbdru_long, /*f:*/Active_Vbfru, /*ignoreCase:*/Active_Vbfru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Vbdfmru.Active_Vbmru, /*merge:*/SortOptionSet_Vbdfmru.Active_Vbmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #unique u}, {@link #versionSort V}.*/
	Active_Vdfu(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vcdfu, /*check:*/SortOptionSet_Vbcdfru.Active_Vcdfu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbdfu, /*ignoreLeadingBlanks:*/Active_Vbdfu_long, /*m:*/SortOptionSet_Vbdfmru.Active_Vdfmu, /*merge:*/SortOptionSet_Vbdfmru.Active_Vdfmu_long, /*r:*/Active_Vdfru, /*reverse:*/Active_Vdfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.unique, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #unique u}, {@link #versionSort V}.*/
	Active_Vdfu_long(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vcdfu, /*check:*/SortOptionSet_Vbcdfru.Active_Vcdfu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbdfu, /*ignoreLeadingBlanks:*/Active_Vbdfu_long, /*m:*/SortOptionSet_Vbdfmru.Active_Vdfmu, /*merge:*/SortOptionSet_Vbdfmru.Active_Vdfmu_long, /*r:*/Active_Vdfru, /*reverse:*/Active_Vdfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.unique, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.*/
	Active_Vdru(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vcdru, /*check:*/SortOptionSet_Vbcdfru.Active_Vcdru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vdfru, /*ignoreCase:*/Active_Vdfru_long, /*b:*/Active_Vbdru, /*ignoreLeadingBlanks:*/Active_Vbdru_long, /*m:*/SortOptionSet_Vbdfmru.Active_Vdmru, /*merge:*/SortOptionSet_Vbdfmru.Active_Vdmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.reverse, SortOption.unique, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.*/
	Active_Vdru_long(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vcdru, /*check:*/SortOptionSet_Vbcdfru.Active_Vcdru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vdfru, /*ignoreCase:*/Active_Vdfru_long, /*b:*/Active_Vbdru, /*ignoreLeadingBlanks:*/Active_Vbdru_long, /*m:*/SortOptionSet_Vbdfmru.Active_Vdmru, /*merge:*/SortOptionSet_Vbdfmru.Active_Vdmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.reverse, SortOption.unique, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #ignoreCase f}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.*/
	Active_Vfru(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vcfru, /*check:*/SortOptionSet_Vbcdfru.Active_Vcfru_long, /*d:*/Active_Vdfru, /*dictionaryOrder:*/Active_Vdfru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbfru, /*ignoreLeadingBlanks:*/Active_Vbfru_long, /*m:*/SortOptionSet_Vbdfmru.Active_Vfmru, /*merge:*/SortOptionSet_Vbdfmru.Active_Vfmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.ignoreCase, SortOption.reverse, SortOption.unique, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #ignoreCase f}, {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.*/
	Active_Vfru_long(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vcfru, /*check:*/SortOptionSet_Vbcdfru.Active_Vcfru_long, /*d:*/Active_Vdfru, /*dictionaryOrder:*/Active_Vdfru_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbfru, /*ignoreLeadingBlanks:*/Active_Vbfru_long, /*m:*/SortOptionSet_Vbdfmru.Active_Vfmru, /*merge:*/SortOptionSet_Vbdfmru.Active_Vfmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.ignoreCase, SortOption.reverse, SortOption.unique, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #versionSort V}.*/
	Active_Vbdf(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vbcdf, /*check:*/SortOptionSet_Vbcdfru.Active_Vbcdf_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Vbdfmru.Active_Vbdfm, /*merge:*/SortOptionSet_Vbdfmru.Active_Vbdfm_long, /*r:*/Active_Vbdfr, /*reverse:*/Active_Vbdfr_long, /*u:*/Active_Vbdfu, /*unique:*/Active_Vbdfu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #versionSort V}.*/
	Active_Vbdf_long(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vbcdf, /*check:*/SortOptionSet_Vbcdfru.Active_Vbcdf_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Vbdfmru.Active_Vbdfm, /*merge:*/SortOptionSet_Vbdfmru.Active_Vbdfm_long, /*r:*/Active_Vbdfr, /*reverse:*/Active_Vbdfr_long, /*u:*/Active_Vbdfu, /*unique:*/Active_Vbdfu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #versionSort V}.*/
	Active_Vbdr(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vbcdr, /*check:*/SortOptionSet_Vbcdfru.Active_Vbcdr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vbdfr, /*ignoreCase:*/Active_Vbdfr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Vbdfmru.Active_Vbdmr, /*merge:*/SortOptionSet_Vbdfmru.Active_Vbdmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vbdru, /*unique:*/Active_Vbdru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #versionSort V}.*/
	Active_Vbdr_long(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vbcdr, /*check:*/SortOptionSet_Vbcdfru.Active_Vbcdr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vbdfr, /*ignoreCase:*/Active_Vbdfr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Vbdfmru.Active_Vbdmr, /*merge:*/SortOptionSet_Vbdfmru.Active_Vbdmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vbdru, /*unique:*/Active_Vbdru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #versionSort V}.*/
	Active_Vbfr(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vbcfr, /*check:*/SortOptionSet_Vbcdfru.Active_Vbcfr_long, /*d:*/Active_Vbdfr, /*dictionaryOrder:*/Active_Vbdfr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Vbdfmru.Active_Vbfmr, /*merge:*/SortOptionSet_Vbdfmru.Active_Vbfmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vbfru, /*unique:*/Active_Vbfru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #versionSort V}.*/
	Active_Vbfr_long(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vbcfr, /*check:*/SortOptionSet_Vbcdfru.Active_Vbcfr_long, /*d:*/Active_Vbdfr, /*dictionaryOrder:*/Active_Vbdfr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Vbdfmru.Active_Vbfmr, /*merge:*/SortOptionSet_Vbdfmru.Active_Vbfmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vbfru, /*unique:*/Active_Vbfru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #reverse r}, {@link #versionSort V}.*/
	Active_Vdfr(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vcdfr, /*check:*/SortOptionSet_Vbcdfru.Active_Vcdfr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbdfr, /*ignoreLeadingBlanks:*/Active_Vbdfr_long, /*m:*/SortOptionSet_Vbdfmru.Active_Vdfmr, /*merge:*/SortOptionSet_Vbdfmru.Active_Vdfmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vdfru, /*unique:*/Active_Vdfru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.reverse, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #reverse r}, {@link #versionSort V}.*/
	Active_Vdfr_long(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vcdfr, /*check:*/SortOptionSet_Vbcdfru.Active_Vcdfr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbdfr, /*ignoreLeadingBlanks:*/Active_Vbdfr_long, /*m:*/SortOptionSet_Vbdfmru.Active_Vdfmr, /*merge:*/SortOptionSet_Vbdfmru.Active_Vdfmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vdfru, /*unique:*/Active_Vdfru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.reverse, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #unique u}, {@link #versionSort V}.*/
	Active_Vbu(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vbcu, /*check:*/SortOptionSet_Vbcdfru.Active_Vbcu_long, /*d:*/Active_Vbdu, /*dictionaryOrder:*/Active_Vbdu_long, /*f:*/Active_Vbfu, /*ignoreCase:*/Active_Vbfu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Vbdfmru.Active_Vbmu, /*merge:*/SortOptionSet_Vbdfmru.Active_Vbmu_long, /*r:*/Active_Vbru, /*reverse:*/Active_Vbru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.unique, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #unique u}, {@link #versionSort V}.*/
	Active_Vbu_long(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vbcu, /*check:*/SortOptionSet_Vbcdfru.Active_Vbcu_long, /*d:*/Active_Vbdu, /*dictionaryOrder:*/Active_Vbdu_long, /*f:*/Active_Vbfu, /*ignoreCase:*/Active_Vbfu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Vbdfmru.Active_Vbmu, /*merge:*/SortOptionSet_Vbdfmru.Active_Vbmu_long, /*r:*/Active_Vbru, /*reverse:*/Active_Vbru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.unique, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #unique u}, {@link #versionSort V}.*/
	Active_Vdu(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vcdu, /*check:*/SortOptionSet_Vbcdfru.Active_Vcdu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vdfu, /*ignoreCase:*/Active_Vdfu_long, /*b:*/Active_Vbdu, /*ignoreLeadingBlanks:*/Active_Vbdu_long, /*m:*/SortOptionSet_Vbdfmru.Active_Vdmu, /*merge:*/SortOptionSet_Vbdfmru.Active_Vdmu_long, /*r:*/Active_Vdru, /*reverse:*/Active_Vdru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.unique, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #unique u}, {@link #versionSort V}.*/
	Active_Vdu_long(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vcdu, /*check:*/SortOptionSet_Vbcdfru.Active_Vcdu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vdfu, /*ignoreCase:*/Active_Vdfu_long, /*b:*/Active_Vbdu, /*ignoreLeadingBlanks:*/Active_Vbdu_long, /*m:*/SortOptionSet_Vbdfmru.Active_Vdmu, /*merge:*/SortOptionSet_Vbdfmru.Active_Vdmu_long, /*r:*/Active_Vdru, /*reverse:*/Active_Vdru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.unique, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #ignoreCase f}, {@link #unique u}, {@link #versionSort V}.*/
	Active_Vfu(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vcfu, /*check:*/SortOptionSet_Vbcdfru.Active_Vcfu_long, /*d:*/Active_Vdfu, /*dictionaryOrder:*/Active_Vdfu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbfu, /*ignoreLeadingBlanks:*/Active_Vbfu_long, /*m:*/SortOptionSet_Vbdfmru.Active_Vfmu, /*merge:*/SortOptionSet_Vbdfmru.Active_Vfmu_long, /*r:*/Active_Vfru, /*reverse:*/Active_Vfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.ignoreCase, SortOption.unique, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #ignoreCase f}, {@link #unique u}, {@link #versionSort V}.*/
	Active_Vfu_long(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vcfu, /*check:*/SortOptionSet_Vbcdfru.Active_Vcfu_long, /*d:*/Active_Vdfu, /*dictionaryOrder:*/Active_Vdfu_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbfu, /*ignoreLeadingBlanks:*/Active_Vbfu_long, /*m:*/SortOptionSet_Vbdfmru.Active_Vfmu, /*merge:*/SortOptionSet_Vbdfmru.Active_Vfmu_long, /*r:*/Active_Vfru, /*reverse:*/Active_Vfru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.ignoreCase, SortOption.unique, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.*/
	Active_Vru(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vcru, /*check:*/SortOptionSet_Vbcdfru.Active_Vcru_long, /*d:*/Active_Vdru, /*dictionaryOrder:*/Active_Vdru_long, /*f:*/Active_Vfru, /*ignoreCase:*/Active_Vfru_long, /*b:*/Active_Vbru, /*ignoreLeadingBlanks:*/Active_Vbru_long, /*m:*/SortOptionSet_Vbdfmru.Active_Vmru, /*merge:*/SortOptionSet_Vbdfmru.Active_Vmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.reverse, SortOption.unique, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #reverse r}, {@link #unique u}, {@link #versionSort V}.*/
	Active_Vru_long(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vcru, /*check:*/SortOptionSet_Vbcdfru.Active_Vcru_long, /*d:*/Active_Vdru, /*dictionaryOrder:*/Active_Vdru_long, /*f:*/Active_Vfru, /*ignoreCase:*/Active_Vfru_long, /*b:*/Active_Vbru, /*ignoreLeadingBlanks:*/Active_Vbru_long, /*m:*/SortOptionSet_Vbdfmru.Active_Vmru, /*merge:*/SortOptionSet_Vbdfmru.Active_Vmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.reverse, SortOption.unique, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #versionSort V}.*/
	Active_Vbd(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vbcd, /*check:*/SortOptionSet_Vbcdfru.Active_Vbcd_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vbdf, /*ignoreCase:*/Active_Vbdf_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Vbdfmru.Active_Vbdm, /*merge:*/SortOptionSet_Vbdfmru.Active_Vbdm_long, /*r:*/Active_Vbdr, /*reverse:*/Active_Vbdr_long, /*u:*/Active_Vbdu, /*unique:*/Active_Vbdu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreLeadingBlanks b}, {@link #versionSort V}.*/
	Active_Vbd_long(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vbcd, /*check:*/SortOptionSet_Vbcdfru.Active_Vbcd_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vbdf, /*ignoreCase:*/Active_Vbdf_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Vbdfmru.Active_Vbdm, /*merge:*/SortOptionSet_Vbdfmru.Active_Vbdm_long, /*r:*/Active_Vbdr, /*reverse:*/Active_Vbdr_long, /*u:*/Active_Vbdu, /*unique:*/Active_Vbdu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreLeadingBlanks, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #versionSort V}.*/
	Active_Vbf(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vbcf, /*check:*/SortOptionSet_Vbcdfru.Active_Vbcf_long, /*d:*/Active_Vbdf, /*dictionaryOrder:*/Active_Vbdf_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Vbdfmru.Active_Vbfm, /*merge:*/SortOptionSet_Vbdfmru.Active_Vbfm_long, /*r:*/Active_Vbfr, /*reverse:*/Active_Vbfr_long, /*u:*/Active_Vbfu, /*unique:*/Active_Vbfu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #versionSort V}.*/
	Active_Vbf_long(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vbcf, /*check:*/SortOptionSet_Vbcdfru.Active_Vbcf_long, /*d:*/Active_Vbdf, /*dictionaryOrder:*/Active_Vbdf_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Vbdfmru.Active_Vbfm, /*merge:*/SortOptionSet_Vbdfmru.Active_Vbfm_long, /*r:*/Active_Vbfr, /*reverse:*/Active_Vbfr_long, /*u:*/Active_Vbfu, /*unique:*/Active_Vbfu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #versionSort V}.*/
	Active_Vbr(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vbcr, /*check:*/SortOptionSet_Vbcdfru.Active_Vbcr_long, /*d:*/Active_Vbdr, /*dictionaryOrder:*/Active_Vbdr_long, /*f:*/Active_Vbfr, /*ignoreCase:*/Active_Vbfr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Vbdfmru.Active_Vbmr, /*merge:*/SortOptionSet_Vbdfmru.Active_Vbmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vbru, /*unique:*/Active_Vbru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #versionSort V}.*/
	Active_Vbr_long(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vbcr, /*check:*/SortOptionSet_Vbcdfru.Active_Vbcr_long, /*d:*/Active_Vbdr, /*dictionaryOrder:*/Active_Vbdr_long, /*f:*/Active_Vbfr, /*ignoreCase:*/Active_Vbfr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Vbdfmru.Active_Vbmr, /*merge:*/SortOptionSet_Vbdfmru.Active_Vbmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vbru, /*unique:*/Active_Vbru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #versionSort V}.*/
	Active_Vdf(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vcdf, /*check:*/SortOptionSet_Vbcdfru.Active_Vcdf_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbdf, /*ignoreLeadingBlanks:*/Active_Vbdf_long, /*m:*/SortOptionSet_Vbdfmru.Active_Vdfm, /*merge:*/SortOptionSet_Vbdfmru.Active_Vdfm_long, /*r:*/Active_Vdfr, /*reverse:*/Active_Vdfr_long, /*u:*/Active_Vdfu, /*unique:*/Active_Vdfu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #ignoreCase f}, {@link #versionSort V}.*/
	Active_Vdf_long(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vcdf, /*check:*/SortOptionSet_Vbcdfru.Active_Vcdf_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbdf, /*ignoreLeadingBlanks:*/Active_Vbdf_long, /*m:*/SortOptionSet_Vbdfmru.Active_Vdfm, /*merge:*/SortOptionSet_Vbdfmru.Active_Vdfm_long, /*r:*/Active_Vdfr, /*reverse:*/Active_Vdfr_long, /*u:*/Active_Vdfu, /*unique:*/Active_Vdfu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.ignoreCase, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #reverse r}, {@link #versionSort V}.*/
	Active_Vdr(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vcdr, /*check:*/SortOptionSet_Vbcdfru.Active_Vcdr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vdfr, /*ignoreCase:*/Active_Vdfr_long, /*b:*/Active_Vbdr, /*ignoreLeadingBlanks:*/Active_Vbdr_long, /*m:*/SortOptionSet_Vbdfmru.Active_Vdmr, /*merge:*/SortOptionSet_Vbdfmru.Active_Vdmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vdru, /*unique:*/Active_Vdru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.reverse, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #reverse r}, {@link #versionSort V}.*/
	Active_Vdr_long(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vcdr, /*check:*/SortOptionSet_Vbcdfru.Active_Vcdr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vdfr, /*ignoreCase:*/Active_Vdfr_long, /*b:*/Active_Vbdr, /*ignoreLeadingBlanks:*/Active_Vbdr_long, /*m:*/SortOptionSet_Vbdfmru.Active_Vdmr, /*merge:*/SortOptionSet_Vbdfmru.Active_Vdmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vdru, /*unique:*/Active_Vdru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.reverse, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #ignoreCase f}, {@link #reverse r}, {@link #versionSort V}.*/
	Active_Vfr(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vcfr, /*check:*/SortOptionSet_Vbcdfru.Active_Vcfr_long, /*d:*/Active_Vdfr, /*dictionaryOrder:*/Active_Vdfr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbfr, /*ignoreLeadingBlanks:*/Active_Vbfr_long, /*m:*/SortOptionSet_Vbdfmru.Active_Vfmr, /*merge:*/SortOptionSet_Vbdfmru.Active_Vfmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vfru, /*unique:*/Active_Vfru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.ignoreCase, SortOption.reverse, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #ignoreCase f}, {@link #reverse r}, {@link #versionSort V}.*/
	Active_Vfr_long(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vcfr, /*check:*/SortOptionSet_Vbcdfru.Active_Vcfr_long, /*d:*/Active_Vdfr, /*dictionaryOrder:*/Active_Vdfr_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbfr, /*ignoreLeadingBlanks:*/Active_Vbfr_long, /*m:*/SortOptionSet_Vbdfmru.Active_Vfmr, /*merge:*/SortOptionSet_Vbdfmru.Active_Vfmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vfru, /*unique:*/Active_Vfru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.ignoreCase, SortOption.reverse, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #unique u}, {@link #versionSort V}.*/
	Active_Vu(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vcu, /*check:*/SortOptionSet_Vbcdfru.Active_Vcu_long, /*d:*/Active_Vdu, /*dictionaryOrder:*/Active_Vdu_long, /*f:*/Active_Vfu, /*ignoreCase:*/Active_Vfu_long, /*b:*/Active_Vbu, /*ignoreLeadingBlanks:*/Active_Vbu_long, /*m:*/SortOptionSet_Vbdfmru.Active_Vmu, /*merge:*/SortOptionSet_Vbdfmru.Active_Vmu_long, /*r:*/Active_Vru, /*reverse:*/Active_Vru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.unique, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #unique u}, {@link #versionSort V}.*/
	Active_Vu_long(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vcu, /*check:*/SortOptionSet_Vbcdfru.Active_Vcu_long, /*d:*/Active_Vdu, /*dictionaryOrder:*/Active_Vdu_long, /*f:*/Active_Vfu, /*ignoreCase:*/Active_Vfu_long, /*b:*/Active_Vbu, /*ignoreLeadingBlanks:*/Active_Vbu_long, /*m:*/SortOptionSet_Vbdfmru.Active_Vmu, /*merge:*/SortOptionSet_Vbdfmru.Active_Vmu_long, /*r:*/Active_Vru, /*reverse:*/Active_Vru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.unique, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #versionSort V}.*/
	Active_Vb(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vbc, /*check:*/SortOptionSet_Vbcdfru.Active_Vbc_long, /*d:*/Active_Vbd, /*dictionaryOrder:*/Active_Vbd_long, /*f:*/Active_Vbf, /*ignoreCase:*/Active_Vbf_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Vbdfmru.Active_Vbm, /*merge:*/SortOptionSet_Vbdfmru.Active_Vbm_long, /*r:*/Active_Vbr, /*reverse:*/Active_Vbr_long, /*u:*/Active_Vbu, /*unique:*/Active_Vbu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #ignoreLeadingBlanks b}, {@link #versionSort V}.*/
	Active_Vb_long(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vbc, /*check:*/SortOptionSet_Vbcdfru.Active_Vbc_long, /*d:*/Active_Vbd, /*dictionaryOrder:*/Active_Vbd_long, /*f:*/Active_Vbf, /*ignoreCase:*/Active_Vbf_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_Vbdfmru.Active_Vbm, /*merge:*/SortOptionSet_Vbdfmru.Active_Vbm_long, /*r:*/Active_Vbr, /*reverse:*/Active_Vbr_long, /*u:*/Active_Vbu, /*unique:*/Active_Vbu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.ignoreLeadingBlanks, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #versionSort V}.*/
	Active_Vd(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vcd, /*check:*/SortOptionSet_Vbcdfru.Active_Vcd_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vdf, /*ignoreCase:*/Active_Vdf_long, /*b:*/Active_Vbd, /*ignoreLeadingBlanks:*/Active_Vbd_long, /*m:*/SortOptionSet_Vbdfmru.Active_Vdm, /*merge:*/SortOptionSet_Vbdfmru.Active_Vdm_long, /*r:*/Active_Vdr, /*reverse:*/Active_Vdr_long, /*u:*/Active_Vdu, /*unique:*/Active_Vdu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #versionSort V}.*/
	Active_Vd_long(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vcd, /*check:*/SortOptionSet_Vbcdfru.Active_Vcd_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*f:*/Active_Vdf, /*ignoreCase:*/Active_Vdf_long, /*b:*/Active_Vbd, /*ignoreLeadingBlanks:*/Active_Vbd_long, /*m:*/SortOptionSet_Vbdfmru.Active_Vdm, /*merge:*/SortOptionSet_Vbdfmru.Active_Vdm_long, /*r:*/Active_Vdr, /*reverse:*/Active_Vdr_long, /*u:*/Active_Vdu, /*unique:*/Active_Vdu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #ignoreCase f}, {@link #versionSort V}.*/
	Active_Vf(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vcf, /*check:*/SortOptionSet_Vbcdfru.Active_Vcf_long, /*d:*/Active_Vdf, /*dictionaryOrder:*/Active_Vdf_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbf, /*ignoreLeadingBlanks:*/Active_Vbf_long, /*m:*/SortOptionSet_Vbdfmru.Active_Vfm, /*merge:*/SortOptionSet_Vbdfmru.Active_Vfm_long, /*r:*/Active_Vfr, /*reverse:*/Active_Vfr_long, /*u:*/Active_Vfu, /*unique:*/Active_Vfu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.ignoreCase, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #ignoreCase f}, {@link #versionSort V}.*/
	Active_Vf_long(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vcf, /*check:*/SortOptionSet_Vbcdfru.Active_Vcf_long, /*d:*/Active_Vdf, /*dictionaryOrder:*/Active_Vdf_long, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_Vbf, /*ignoreLeadingBlanks:*/Active_Vbf_long, /*m:*/SortOptionSet_Vbdfmru.Active_Vfm, /*merge:*/SortOptionSet_Vbdfmru.Active_Vfm_long, /*r:*/Active_Vfr, /*reverse:*/Active_Vfr_long, /*u:*/Active_Vfu, /*unique:*/Active_Vfu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.ignoreCase, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #reverse r}, {@link #versionSort V}.*/
	Active_Vr(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vcr, /*check:*/SortOptionSet_Vbcdfru.Active_Vcr_long, /*d:*/Active_Vdr, /*dictionaryOrder:*/Active_Vdr_long, /*f:*/Active_Vfr, /*ignoreCase:*/Active_Vfr_long, /*b:*/Active_Vbr, /*ignoreLeadingBlanks:*/Active_Vbr_long, /*m:*/SortOptionSet_Vbdfmru.Active_Vmr, /*merge:*/SortOptionSet_Vbdfmru.Active_Vmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vru, /*unique:*/Active_Vru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.reverse, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #reverse r}, {@link #versionSort V}.*/
	Active_Vr_long(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vcr, /*check:*/SortOptionSet_Vbcdfru.Active_Vcr_long, /*d:*/Active_Vdr, /*dictionaryOrder:*/Active_Vdr_long, /*f:*/Active_Vfr, /*ignoreCase:*/Active_Vfr_long, /*b:*/Active_Vbr, /*ignoreLeadingBlanks:*/Active_Vbr_long, /*m:*/SortOptionSet_Vbdfmru.Active_Vmr, /*merge:*/SortOptionSet_Vbdfmru.Active_Vmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_Vru, /*unique:*/Active_Vru_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.reverse, SortOption.versionSort
	),
	/** Option set with the following active options: {@link #versionSort V}.*/
	Active_V(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vc, /*check:*/SortOptionSet_Vbcdfru.Active_Vc_long, /*d:*/Active_Vd, /*dictionaryOrder:*/Active_Vd_long, /*f:*/Active_Vf, /*ignoreCase:*/Active_Vf_long, /*b:*/Active_Vb, /*ignoreLeadingBlanks:*/Active_Vb_long, /*m:*/SortOptionSet_Vbdfmru.Active_Vm, /*merge:*/SortOptionSet_Vbdfmru.Active_Vm_long, /*r:*/Active_Vr, /*reverse:*/Active_Vr_long, /*u:*/Active_Vu, /*unique:*/Active_Vu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.versionSort
	),
	/** Option set with the following active options: {@link #versionSort V}.*/
	Active_V_long(
		/*c:*/SortOptionSet_Vbcdfru.Active_Vc, /*check:*/SortOptionSet_Vbcdfru.Active_Vc_long, /*d:*/Active_Vd, /*dictionaryOrder:*/Active_Vd_long, /*f:*/Active_Vf, /*ignoreCase:*/Active_Vf_long, /*b:*/Active_Vb, /*ignoreLeadingBlanks:*/Active_Vb_long, /*m:*/SortOptionSet_Vbdfmru.Active_Vm, /*merge:*/SortOptionSet_Vbdfmru.Active_Vm_long, /*r:*/Active_Vr, /*reverse:*/Active_Vr_long, /*u:*/Active_Vu, /*unique:*/Active_Vu_long, /*V:*/null /*already set*/, /*versionSort:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.versionSort
	);
	private SortOptionSet_Vbcdfmru(
		SortOptionSet_Vbcdfru c, SortOptionSet_Vbcdfru check, SortOptionSet_Vbcdfmru d, SortOptionSet_Vbcdfmru dictionaryOrder, SortOptionSet_Vbcdfmru f, SortOptionSet_Vbcdfmru ignoreCase, SortOptionSet_Vbcdfmru b, SortOptionSet_Vbcdfmru ignoreLeadingBlanks, SortOptionSet_Vbdfmru m, SortOptionSet_Vbdfmru merge, SortOptionSet_Vbcdfmru r, SortOptionSet_Vbcdfmru reverse, SortOptionSet_Vbcdfmru u, SortOptionSet_Vbcdfmru unique, SortOptionSet_Vbcdfmru V, SortOptionSet_Vbcdfmru versionSort, 
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
		this.r = r == null ? this : r;
		this.reverse = reverse == null ? this : reverse;
		this.u = u == null ? this : u;
		this.unique = unique == null ? this : unique;
		this.V = V == null ? this : V;
		this.versionSort = versionSort == null ? this : versionSort;
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
	public final SortOptionSet_Vbcdfru c;
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
	public final SortOptionSet_Vbcdfru check;
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
	public final SortOptionSet_Vbcdfmru d;
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
	public final SortOptionSet_Vbcdfmru dictionaryOrder;
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
	public final SortOptionSet_Vbcdfmru f;
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
	public final SortOptionSet_Vbcdfmru ignoreCase;
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
	public final SortOptionSet_Vbcdfmru b;
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
	public final SortOptionSet_Vbcdfmru ignoreLeadingBlanks;
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
	public final SortOptionSet_Vbcdfmru r;
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
	public final SortOptionSet_Vbcdfmru reverse;
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
	public final SortOptionSet_Vbcdfmru u;
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
	public final SortOptionSet_Vbcdfmru unique;
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
	public final SortOptionSet_Vbcdfmru V;
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
	public final SortOptionSet_Vbcdfmru versionSort;
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
	 *    SortOptionSet_Vbcdfmru.check.d;
	 * </pre>
	 * uses acronyms, that is, this method always returns true for the above 
	 * set. 
	 * <p>
	 * On the other hand, long option names are used and this method always 
	 * returns false for the set
	 * <pre>
	 *    SortOptionSet_Vbcdfmru.c.dictionaryOrder;
	 * </pre>
	 * <p>
	 * Note that a repeated option is <i>not</i> treated as the last set option.
	 * For instance, the first and last option of the following set are 
	 * equivalent and acronyms are used:
	 * <pre>
	 *    SortOptionSet_Vbcdfmru.c.d.check;
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
