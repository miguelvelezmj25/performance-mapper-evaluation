package org.unix4j.unix.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import org.unix4j.option.Option;

import org.unix4j.unix.Sort;

/**
 * Option sets for the {@link Sort sort} command with 
 * the following options: {@link #c c}, {@link #d d}, {@link #g g}, {@link #f f}, {@link #b b}, {@link #m m}, {@link #r r}, {@link #u u}.
 * <p>
 * Application code does normally not directly refer to this class;
 * {@link Sort#Options} should be used instead to specify command 
 * options. See also {@link org.unix4j.unix.sort.SortOptions} for more information.
 */
public enum SortOptionSet_bcdfgmru implements SortOptions {
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.*/
	Active_bdfgru(
		/*c:*/SortOptionSet_bcdfgru.Active_bcdfgru, /*check:*/SortOptionSet_bcdfgru.Active_bcdfgru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfgmru.Active_bdfgmru, /*merge:*/SortOptionSet_bdfgmru.Active_bdfgmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.*/
	Active_bdfgru_long(
		/*c:*/SortOptionSet_bcdfgru.Active_bcdfgru, /*check:*/SortOptionSet_bcdfgru.Active_bcdfgru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfgmru.Active_bdfgmru, /*merge:*/SortOptionSet_bdfgmru.Active_bdfgmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.*/
	Active_bdfgu(
		/*c:*/SortOptionSet_bcdfgru.Active_bcdfgu, /*check:*/SortOptionSet_bcdfgru.Active_bcdfgu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfgmru.Active_bdfgmu, /*merge:*/SortOptionSet_bdfgmru.Active_bdfgmu_long, /*r:*/Active_bdfgru, /*reverse:*/Active_bdfgru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.*/
	Active_bdfgu_long(
		/*c:*/SortOptionSet_bcdfgru.Active_bcdfgu, /*check:*/SortOptionSet_bcdfgru.Active_bcdfgu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfgmru.Active_bdfgmu, /*merge:*/SortOptionSet_bdfgmru.Active_bdfgmu_long, /*r:*/Active_bdfgru, /*reverse:*/Active_bdfgru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.*/
	Active_bdgru(
		/*c:*/SortOptionSet_bcdfgru.Active_bcdgru, /*check:*/SortOptionSet_bcdfgru.Active_bcdgru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bdfgru, /*ignoreCase:*/Active_bdfgru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfgmru.Active_bdgmru, /*merge:*/SortOptionSet_bdfgmru.Active_bdgmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.*/
	Active_bdgru_long(
		/*c:*/SortOptionSet_bcdfgru.Active_bcdgru, /*check:*/SortOptionSet_bcdfgru.Active_bcdgru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bdfgru, /*ignoreCase:*/Active_bdfgru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfgmru.Active_bdgmru, /*merge:*/SortOptionSet_bdfgmru.Active_bdgmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.*/
	Active_bfgru(
		/*c:*/SortOptionSet_bcdfgru.Active_bcfgru, /*check:*/SortOptionSet_bcdfgru.Active_bcfgru_long, /*d:*/Active_bdfgru, /*dictionaryOrder:*/Active_bdfgru_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfgmru.Active_bfgmru, /*merge:*/SortOptionSet_bdfgmru.Active_bfgmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.*/
	Active_bfgru_long(
		/*c:*/SortOptionSet_bcdfgru.Active_bcfgru, /*check:*/SortOptionSet_bcdfgru.Active_bcfgru_long, /*d:*/Active_bdfgru, /*dictionaryOrder:*/Active_bdfgru_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfgmru.Active_bfgmru, /*merge:*/SortOptionSet_bdfgmru.Active_bfgmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #reverse r}, {@link #unique u}.*/
	Active_dfgru(
		/*c:*/SortOptionSet_bcdfgru.Active_cdfgru, /*check:*/SortOptionSet_bcdfgru.Active_cdfgru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfgru, /*ignoreLeadingBlanks:*/Active_bdfgru_long, /*m:*/SortOptionSet_bdfgmru.Active_dfgmru, /*merge:*/SortOptionSet_bdfgmru.Active_dfgmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #reverse r}, {@link #unique u}.*/
	Active_dfgru_long(
		/*c:*/SortOptionSet_bcdfgru.Active_cdfgru, /*check:*/SortOptionSet_bcdfgru.Active_cdfgru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfgru, /*ignoreLeadingBlanks:*/Active_bdfgru_long, /*m:*/SortOptionSet_bdfgmru.Active_dfgmru, /*merge:*/SortOptionSet_bdfgmru.Active_dfgmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.*/
	Active_bdfgr(
		/*c:*/SortOptionSet_bcdfgru.Active_bcdfgr, /*check:*/SortOptionSet_bcdfgru.Active_bcdfgr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfgmru.Active_bdfgmr, /*merge:*/SortOptionSet_bdfgmru.Active_bdfgmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bdfgru, /*unique:*/Active_bdfgru_long, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.*/
	Active_bdfgr_long(
		/*c:*/SortOptionSet_bcdfgru.Active_bcdfgr, /*check:*/SortOptionSet_bcdfgru.Active_bcdfgr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfgmru.Active_bdfgmr, /*merge:*/SortOptionSet_bdfgmru.Active_bdfgmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bdfgru, /*unique:*/Active_bdfgru_long, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.*/
	Active_bdgu(
		/*c:*/SortOptionSet_bcdfgru.Active_bcdgu, /*check:*/SortOptionSet_bcdfgru.Active_bcdgu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bdfgu, /*ignoreCase:*/Active_bdfgu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfgmru.Active_bdgmu, /*merge:*/SortOptionSet_bdfgmru.Active_bdgmu_long, /*r:*/Active_bdgru, /*reverse:*/Active_bdgru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.*/
	Active_bdgu_long(
		/*c:*/SortOptionSet_bcdfgru.Active_bcdgu, /*check:*/SortOptionSet_bcdfgru.Active_bcdgu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bdfgu, /*ignoreCase:*/Active_bdfgu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfgmru.Active_bdgmu, /*merge:*/SortOptionSet_bdfgmru.Active_bdgmu_long, /*r:*/Active_bdgru, /*reverse:*/Active_bdgru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks, SortOption.unique
	),
	/** Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.*/
	Active_bfgu(
		/*c:*/SortOptionSet_bcdfgru.Active_bcfgu, /*check:*/SortOptionSet_bcdfgru.Active_bcfgu_long, /*d:*/Active_bdfgu, /*dictionaryOrder:*/Active_bdfgu_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfgmru.Active_bfgmu, /*merge:*/SortOptionSet_bdfgmru.Active_bfgmu_long, /*r:*/Active_bfgru, /*reverse:*/Active_bfgru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.unique
	),
	/** Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.*/
	Active_bfgu_long(
		/*c:*/SortOptionSet_bcdfgru.Active_bcfgu, /*check:*/SortOptionSet_bcdfgru.Active_bcfgu_long, /*d:*/Active_bdfgu, /*dictionaryOrder:*/Active_bdfgu_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfgmru.Active_bfgmu, /*merge:*/SortOptionSet_bdfgmru.Active_bfgmu_long, /*r:*/Active_bfgru, /*reverse:*/Active_bfgru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.unique
	),
	/** Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.*/
	Active_bgru(
		/*c:*/SortOptionSet_bcdfgru.Active_bcgru, /*check:*/SortOptionSet_bcdfgru.Active_bcgru_long, /*d:*/Active_bdgru, /*dictionaryOrder:*/Active_bdgru_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bfgru, /*ignoreCase:*/Active_bfgru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfgmru.Active_bgmru, /*merge:*/SortOptionSet_bdfgmru.Active_bgmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}, {@link #unique u}.*/
	Active_bgru_long(
		/*c:*/SortOptionSet_bcdfgru.Active_bcgru, /*check:*/SortOptionSet_bcdfgru.Active_bcgru_long, /*d:*/Active_bdgru, /*dictionaryOrder:*/Active_bdgru_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bfgru, /*ignoreCase:*/Active_bfgru_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfgmru.Active_bgmru, /*merge:*/SortOptionSet_bdfgmru.Active_bgmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #unique u}.*/
	Active_dfgu(
		/*c:*/SortOptionSet_bcdfgru.Active_cdfgu, /*check:*/SortOptionSet_bcdfgru.Active_cdfgu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfgu, /*ignoreLeadingBlanks:*/Active_bdfgu_long, /*m:*/SortOptionSet_bdfgmru.Active_dfgmu, /*merge:*/SortOptionSet_bdfgmru.Active_dfgmu_long, /*r:*/Active_dfgru, /*reverse:*/Active_dfgru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #unique u}.*/
	Active_dfgu_long(
		/*c:*/SortOptionSet_bcdfgru.Active_cdfgu, /*check:*/SortOptionSet_bcdfgru.Active_cdfgu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfgu, /*ignoreLeadingBlanks:*/Active_bdfgu_long, /*m:*/SortOptionSet_bdfgmru.Active_dfgmu, /*merge:*/SortOptionSet_bdfgmru.Active_dfgmu_long, /*r:*/Active_dfgru, /*reverse:*/Active_dfgru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #reverse r}, {@link #unique u}.*/
	Active_dgru(
		/*c:*/SortOptionSet_bcdfgru.Active_cdgru, /*check:*/SortOptionSet_bcdfgru.Active_cdgru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_dfgru, /*ignoreCase:*/Active_dfgru_long, /*b:*/Active_bdgru, /*ignoreLeadingBlanks:*/Active_bdgru_long, /*m:*/SortOptionSet_bdfgmru.Active_dgmru, /*merge:*/SortOptionSet_bdfgmru.Active_dgmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #reverse r}, {@link #unique u}.*/
	Active_dgru_long(
		/*c:*/SortOptionSet_bcdfgru.Active_cdgru, /*check:*/SortOptionSet_bcdfgru.Active_cdgru_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_dfgru, /*ignoreCase:*/Active_dfgru_long, /*b:*/Active_bdgru, /*ignoreLeadingBlanks:*/Active_bdgru_long, /*m:*/SortOptionSet_bdfgmru.Active_dgmru, /*merge:*/SortOptionSet_bdfgmru.Active_dgmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #reverse r}, {@link #unique u}.*/
	Active_fgru(
		/*c:*/SortOptionSet_bcdfgru.Active_cfgru, /*check:*/SortOptionSet_bcdfgru.Active_cfgru_long, /*d:*/Active_dfgru, /*dictionaryOrder:*/Active_dfgru_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfgru, /*ignoreLeadingBlanks:*/Active_bfgru_long, /*m:*/SortOptionSet_bdfgmru.Active_fgmru, /*merge:*/SortOptionSet_bdfgmru.Active_fgmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #reverse r}, {@link #unique u}.*/
	Active_fgru_long(
		/*c:*/SortOptionSet_bcdfgru.Active_cfgru, /*check:*/SortOptionSet_bcdfgru.Active_cfgru_long, /*d:*/Active_dfgru, /*dictionaryOrder:*/Active_dfgru_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfgru, /*ignoreLeadingBlanks:*/Active_bfgru_long, /*m:*/SortOptionSet_bdfgmru.Active_fgmru, /*merge:*/SortOptionSet_bdfgmru.Active_fgmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}.*/
	Active_bdfg(
		/*c:*/SortOptionSet_bcdfgru.Active_bcdfg, /*check:*/SortOptionSet_bcdfgru.Active_bcdfg_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfgmru.Active_bdfgm, /*merge:*/SortOptionSet_bdfgmru.Active_bdfgm_long, /*r:*/Active_bdfgr, /*reverse:*/Active_bdfgr_long, /*u:*/Active_bdfgu, /*unique:*/Active_bdfgu_long, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}.*/
	Active_bdfg_long(
		/*c:*/SortOptionSet_bcdfgru.Active_bcdfg, /*check:*/SortOptionSet_bcdfgru.Active_bcdfg_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfgmru.Active_bdfgm, /*merge:*/SortOptionSet_bdfgmru.Active_bdfgm_long, /*r:*/Active_bdfgr, /*reverse:*/Active_bdfgr_long, /*u:*/Active_bdfgu, /*unique:*/Active_bdfgu_long, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.*/
	Active_bdgr(
		/*c:*/SortOptionSet_bcdfgru.Active_bcdgr, /*check:*/SortOptionSet_bcdfgru.Active_bcdgr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bdfgr, /*ignoreCase:*/Active_bdfgr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfgmru.Active_bdgmr, /*merge:*/SortOptionSet_bdfgmru.Active_bdgmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bdgru, /*unique:*/Active_bdgru_long, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks, SortOption.reverse
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.*/
	Active_bdgr_long(
		/*c:*/SortOptionSet_bcdfgru.Active_bcdgr, /*check:*/SortOptionSet_bcdfgru.Active_bcdgr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bdfgr, /*ignoreCase:*/Active_bdfgr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfgmru.Active_bdgmr, /*merge:*/SortOptionSet_bdfgmru.Active_bdgmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bdgru, /*unique:*/Active_bdgru_long, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks, SortOption.reverse
	),
	/** Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.*/
	Active_bfgr(
		/*c:*/SortOptionSet_bcdfgru.Active_bcfgr, /*check:*/SortOptionSet_bcdfgru.Active_bcfgr_long, /*d:*/Active_bdfgr, /*dictionaryOrder:*/Active_bdfgr_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfgmru.Active_bfgmr, /*merge:*/SortOptionSet_bdfgmru.Active_bfgmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bfgru, /*unique:*/Active_bfgru_long, 
		true, 
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse
	),
	/** Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.*/
	Active_bfgr_long(
		/*c:*/SortOptionSet_bcdfgru.Active_bcfgr, /*check:*/SortOptionSet_bcdfgru.Active_bcfgr_long, /*d:*/Active_bdfgr, /*dictionaryOrder:*/Active_bdfgr_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfgmru.Active_bfgmr, /*merge:*/SortOptionSet_bdfgmru.Active_bfgmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bfgru, /*unique:*/Active_bfgru_long, 
		false, 
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks, SortOption.reverse
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #reverse r}.*/
	Active_dfgr(
		/*c:*/SortOptionSet_bcdfgru.Active_cdfgr, /*check:*/SortOptionSet_bcdfgru.Active_cdfgr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfgr, /*ignoreLeadingBlanks:*/Active_bdfgr_long, /*m:*/SortOptionSet_bdfgmru.Active_dfgmr, /*merge:*/SortOptionSet_bdfgmru.Active_dfgmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_dfgru, /*unique:*/Active_dfgru_long, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.reverse
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #reverse r}.*/
	Active_dfgr_long(
		/*c:*/SortOptionSet_bcdfgru.Active_cdfgr, /*check:*/SortOptionSet_bcdfgru.Active_cdfgr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfgr, /*ignoreLeadingBlanks:*/Active_bdfgr_long, /*m:*/SortOptionSet_bdfgmru.Active_dfgmr, /*merge:*/SortOptionSet_bdfgmru.Active_dfgmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_dfgru, /*unique:*/Active_dfgru_long, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.reverse
	),
	/** Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.*/
	Active_bgu(
		/*c:*/SortOptionSet_bcdfgru.Active_bcgu, /*check:*/SortOptionSet_bcdfgru.Active_bcgu_long, /*d:*/Active_bdgu, /*dictionaryOrder:*/Active_bdgu_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bfgu, /*ignoreCase:*/Active_bfgu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfgmru.Active_bgmu, /*merge:*/SortOptionSet_bdfgmru.Active_bgmu_long, /*r:*/Active_bgru, /*reverse:*/Active_bgru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks, SortOption.unique
	),
	/** Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}, {@link #unique u}.*/
	Active_bgu_long(
		/*c:*/SortOptionSet_bcdfgru.Active_bcgu, /*check:*/SortOptionSet_bcdfgru.Active_bcgu_long, /*d:*/Active_bdgu, /*dictionaryOrder:*/Active_bdgu_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bfgu, /*ignoreCase:*/Active_bfgu_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfgmru.Active_bgmu, /*merge:*/SortOptionSet_bdfgmru.Active_bgmu_long, /*r:*/Active_bgru, /*reverse:*/Active_bgru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #unique u}.*/
	Active_dgu(
		/*c:*/SortOptionSet_bcdfgru.Active_cdgu, /*check:*/SortOptionSet_bcdfgru.Active_cdgu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_dfgu, /*ignoreCase:*/Active_dfgu_long, /*b:*/Active_bdgu, /*ignoreLeadingBlanks:*/Active_bdgu_long, /*m:*/SortOptionSet_bdfgmru.Active_dgmu, /*merge:*/SortOptionSet_bdfgmru.Active_dgmu_long, /*r:*/Active_dgru, /*reverse:*/Active_dgru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #unique u}.*/
	Active_dgu_long(
		/*c:*/SortOptionSet_bcdfgru.Active_cdgu, /*check:*/SortOptionSet_bcdfgru.Active_cdgu_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_dfgu, /*ignoreCase:*/Active_dfgu_long, /*b:*/Active_bdgu, /*ignoreLeadingBlanks:*/Active_bdgu_long, /*m:*/SortOptionSet_bdfgmru.Active_dgmu, /*merge:*/SortOptionSet_bdfgmru.Active_dgmu_long, /*r:*/Active_dgru, /*reverse:*/Active_dgru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #unique u}.*/
	Active_fgu(
		/*c:*/SortOptionSet_bcdfgru.Active_cfgu, /*check:*/SortOptionSet_bcdfgru.Active_cfgu_long, /*d:*/Active_dfgu, /*dictionaryOrder:*/Active_dfgu_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfgu, /*ignoreLeadingBlanks:*/Active_bfgu_long, /*m:*/SortOptionSet_bdfgmru.Active_fgmu, /*merge:*/SortOptionSet_bdfgmru.Active_fgmu_long, /*r:*/Active_fgru, /*reverse:*/Active_fgru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.unique
	),
	/** Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #unique u}.*/
	Active_fgu_long(
		/*c:*/SortOptionSet_bcdfgru.Active_cfgu, /*check:*/SortOptionSet_bcdfgru.Active_cfgu_long, /*d:*/Active_dfgu, /*dictionaryOrder:*/Active_dfgu_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfgu, /*ignoreLeadingBlanks:*/Active_bfgu_long, /*m:*/SortOptionSet_bdfgmru.Active_fgmu, /*merge:*/SortOptionSet_bdfgmru.Active_fgmu_long, /*r:*/Active_fgru, /*reverse:*/Active_fgru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.unique
	),
	/** Option set with the following active options: {@link #generalNumericSort g}, {@link #reverse r}, {@link #unique u}.*/
	Active_gru(
		/*c:*/SortOptionSet_bcdfgru.Active_cgru, /*check:*/SortOptionSet_bcdfgru.Active_cgru_long, /*d:*/Active_dgru, /*dictionaryOrder:*/Active_dgru_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_fgru, /*ignoreCase:*/Active_fgru_long, /*b:*/Active_bgru, /*ignoreLeadingBlanks:*/Active_bgru_long, /*m:*/SortOptionSet_bdfgmru.Active_gmru, /*merge:*/SortOptionSet_bdfgmru.Active_gmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.generalNumericSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #generalNumericSort g}, {@link #reverse r}, {@link #unique u}.*/
	Active_gru_long(
		/*c:*/SortOptionSet_bcdfgru.Active_cgru, /*check:*/SortOptionSet_bcdfgru.Active_cgru_long, /*d:*/Active_dgru, /*dictionaryOrder:*/Active_dgru_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_fgru, /*ignoreCase:*/Active_fgru_long, /*b:*/Active_bgru, /*ignoreLeadingBlanks:*/Active_bgru_long, /*m:*/SortOptionSet_bdfgmru.Active_gmru, /*merge:*/SortOptionSet_bdfgmru.Active_gmru_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.generalNumericSort, SortOption.reverse, SortOption.unique
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}.*/
	Active_bdg(
		/*c:*/SortOptionSet_bcdfgru.Active_bcdg, /*check:*/SortOptionSet_bcdfgru.Active_bcdg_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bdfg, /*ignoreCase:*/Active_bdfg_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfgmru.Active_bdgm, /*merge:*/SortOptionSet_bdfgmru.Active_bdgm_long, /*r:*/Active_bdgr, /*reverse:*/Active_bdgr_long, /*u:*/Active_bdgu, /*unique:*/Active_bdgu_long, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}.*/
	Active_bdg_long(
		/*c:*/SortOptionSet_bcdfgru.Active_bcdg, /*check:*/SortOptionSet_bcdfgru.Active_bcdg_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bdfg, /*ignoreCase:*/Active_bdfg_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfgmru.Active_bdgm, /*merge:*/SortOptionSet_bdfgmru.Active_bdgm_long, /*r:*/Active_bdgr, /*reverse:*/Active_bdgr_long, /*u:*/Active_bdgu, /*unique:*/Active_bdgu_long, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks
	),
	/** Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}.*/
	Active_bfg(
		/*c:*/SortOptionSet_bcdfgru.Active_bcfg, /*check:*/SortOptionSet_bcdfgru.Active_bcfg_long, /*d:*/Active_bdfg, /*dictionaryOrder:*/Active_bdfg_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfgmru.Active_bfgm, /*merge:*/SortOptionSet_bdfgmru.Active_bfgm_long, /*r:*/Active_bfgr, /*reverse:*/Active_bfgr_long, /*u:*/Active_bfgu, /*unique:*/Active_bfgu_long, 
		true, 
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks
	),
	/** Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #ignoreLeadingBlanks b}.*/
	Active_bfg_long(
		/*c:*/SortOptionSet_bcdfgru.Active_bcfg, /*check:*/SortOptionSet_bcdfgru.Active_bcfg_long, /*d:*/Active_bdfg, /*dictionaryOrder:*/Active_bdfg_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfgmru.Active_bfgm, /*merge:*/SortOptionSet_bdfgmru.Active_bfgm_long, /*r:*/Active_bfgr, /*reverse:*/Active_bfgr_long, /*u:*/Active_bfgu, /*unique:*/Active_bfgu_long, 
		false, 
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.ignoreLeadingBlanks
	),
	/** Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.*/
	Active_bgr(
		/*c:*/SortOptionSet_bcdfgru.Active_bcgr, /*check:*/SortOptionSet_bcdfgru.Active_bcgr_long, /*d:*/Active_bdgr, /*dictionaryOrder:*/Active_bdgr_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bfgr, /*ignoreCase:*/Active_bfgr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfgmru.Active_bgmr, /*merge:*/SortOptionSet_bdfgmru.Active_bgmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bgru, /*unique:*/Active_bgru_long, 
		true, 
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks, SortOption.reverse
	),
	/** Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}, {@link #reverse r}.*/
	Active_bgr_long(
		/*c:*/SortOptionSet_bcdfgru.Active_bcgr, /*check:*/SortOptionSet_bcdfgru.Active_bcgr_long, /*d:*/Active_bdgr, /*dictionaryOrder:*/Active_bdgr_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bfgr, /*ignoreCase:*/Active_bfgr_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfgmru.Active_bgmr, /*merge:*/SortOptionSet_bdfgmru.Active_bgmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_bgru, /*unique:*/Active_bgru_long, 
		false, 
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks, SortOption.reverse
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}.*/
	Active_dfg(
		/*c:*/SortOptionSet_bcdfgru.Active_cdfg, /*check:*/SortOptionSet_bcdfgru.Active_cdfg_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfg, /*ignoreLeadingBlanks:*/Active_bdfg_long, /*m:*/SortOptionSet_bdfgmru.Active_dfgm, /*merge:*/SortOptionSet_bdfgmru.Active_dfgm_long, /*r:*/Active_dfgr, /*reverse:*/Active_dfgr_long, /*u:*/Active_dfgu, /*unique:*/Active_dfgu_long, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #ignoreCase f}.*/
	Active_dfg_long(
		/*c:*/SortOptionSet_bcdfgru.Active_cdfg, /*check:*/SortOptionSet_bcdfgru.Active_cdfg_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bdfg, /*ignoreLeadingBlanks:*/Active_bdfg_long, /*m:*/SortOptionSet_bdfgmru.Active_dfgm, /*merge:*/SortOptionSet_bdfgmru.Active_dfgm_long, /*r:*/Active_dfgr, /*reverse:*/Active_dfgr_long, /*u:*/Active_dfgu, /*unique:*/Active_dfgu_long, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.ignoreCase
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #reverse r}.*/
	Active_dgr(
		/*c:*/SortOptionSet_bcdfgru.Active_cdgr, /*check:*/SortOptionSet_bcdfgru.Active_cdgr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_dfgr, /*ignoreCase:*/Active_dfgr_long, /*b:*/Active_bdgr, /*ignoreLeadingBlanks:*/Active_bdgr_long, /*m:*/SortOptionSet_bdfgmru.Active_dgmr, /*merge:*/SortOptionSet_bdfgmru.Active_dgmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_dgru, /*unique:*/Active_dgru_long, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}, {@link #reverse r}.*/
	Active_dgr_long(
		/*c:*/SortOptionSet_bcdfgru.Active_cdgr, /*check:*/SortOptionSet_bcdfgru.Active_cdgr_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_dfgr, /*ignoreCase:*/Active_dfgr_long, /*b:*/Active_bdgr, /*ignoreLeadingBlanks:*/Active_bdgr_long, /*m:*/SortOptionSet_bdfgmru.Active_dgmr, /*merge:*/SortOptionSet_bdfgmru.Active_dgmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_dgru, /*unique:*/Active_dgru_long, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #reverse r}.*/
	Active_fgr(
		/*c:*/SortOptionSet_bcdfgru.Active_cfgr, /*check:*/SortOptionSet_bcdfgru.Active_cfgr_long, /*d:*/Active_dfgr, /*dictionaryOrder:*/Active_dfgr_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfgr, /*ignoreLeadingBlanks:*/Active_bfgr_long, /*m:*/SortOptionSet_bdfgmru.Active_fgmr, /*merge:*/SortOptionSet_bdfgmru.Active_fgmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_fgru, /*unique:*/Active_fgru_long, 
		true, 
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.reverse
	),
	/** Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreCase f}, {@link #reverse r}.*/
	Active_fgr_long(
		/*c:*/SortOptionSet_bcdfgru.Active_cfgr, /*check:*/SortOptionSet_bcdfgru.Active_cfgr_long, /*d:*/Active_dfgr, /*dictionaryOrder:*/Active_dfgr_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfgr, /*ignoreLeadingBlanks:*/Active_bfgr_long, /*m:*/SortOptionSet_bdfgmru.Active_fgmr, /*merge:*/SortOptionSet_bdfgmru.Active_fgmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_fgru, /*unique:*/Active_fgru_long, 
		false, 
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreCase, SortOption.reverse
	),
	/** Option set with the following active options: {@link #generalNumericSort g}, {@link #unique u}.*/
	Active_gu(
		/*c:*/SortOptionSet_bcdfgru.Active_cgu, /*check:*/SortOptionSet_bcdfgru.Active_cgu_long, /*d:*/Active_dgu, /*dictionaryOrder:*/Active_dgu_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_fgu, /*ignoreCase:*/Active_fgu_long, /*b:*/Active_bgu, /*ignoreLeadingBlanks:*/Active_bgu_long, /*m:*/SortOptionSet_bdfgmru.Active_gmu, /*merge:*/SortOptionSet_bdfgmru.Active_gmu_long, /*r:*/Active_gru, /*reverse:*/Active_gru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		true, 
		/*active:*/SortOption.generalNumericSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #generalNumericSort g}, {@link #unique u}.*/
	Active_gu_long(
		/*c:*/SortOptionSet_bcdfgru.Active_cgu, /*check:*/SortOptionSet_bcdfgru.Active_cgu_long, /*d:*/Active_dgu, /*dictionaryOrder:*/Active_dgu_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_fgu, /*ignoreCase:*/Active_fgu_long, /*b:*/Active_bgu, /*ignoreLeadingBlanks:*/Active_bgu_long, /*m:*/SortOptionSet_bdfgmru.Active_gmu, /*merge:*/SortOptionSet_bdfgmru.Active_gmu_long, /*r:*/Active_gru, /*reverse:*/Active_gru_long, /*u:*/null /*already set*/, /*unique:*/null /*already set*/, 
		false, 
		/*active:*/SortOption.generalNumericSort, SortOption.unique
	),
	/** Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}.*/
	Active_bg(
		/*c:*/SortOptionSet_bcdfgru.Active_bcg, /*check:*/SortOptionSet_bcdfgru.Active_bcg_long, /*d:*/Active_bdg, /*dictionaryOrder:*/Active_bdg_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bfg, /*ignoreCase:*/Active_bfg_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfgmru.Active_bgm, /*merge:*/SortOptionSet_bdfgmru.Active_bgm_long, /*r:*/Active_bgr, /*reverse:*/Active_bgr_long, /*u:*/Active_bgu, /*unique:*/Active_bgu_long, 
		true, 
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks
	),
	/** Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreLeadingBlanks b}.*/
	Active_bg_long(
		/*c:*/SortOptionSet_bcdfgru.Active_bcg, /*check:*/SortOptionSet_bcdfgru.Active_bcg_long, /*d:*/Active_bdg, /*dictionaryOrder:*/Active_bdg_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_bfg, /*ignoreCase:*/Active_bfg_long, /*b:*/null /*already set*/, /*ignoreLeadingBlanks:*/null /*already set*/, /*m:*/SortOptionSet_bdfgmru.Active_bgm, /*merge:*/SortOptionSet_bdfgmru.Active_bgm_long, /*r:*/Active_bgr, /*reverse:*/Active_bgr_long, /*u:*/Active_bgu, /*unique:*/Active_bgu_long, 
		false, 
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreLeadingBlanks
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}.*/
	Active_dg(
		/*c:*/SortOptionSet_bcdfgru.Active_cdg, /*check:*/SortOptionSet_bcdfgru.Active_cdg_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_dfg, /*ignoreCase:*/Active_dfg_long, /*b:*/Active_bdg, /*ignoreLeadingBlanks:*/Active_bdg_long, /*m:*/SortOptionSet_bdfgmru.Active_dgm, /*merge:*/SortOptionSet_bdfgmru.Active_dgm_long, /*r:*/Active_dgr, /*reverse:*/Active_dgr_long, /*u:*/Active_dgu, /*unique:*/Active_dgu_long, 
		true, 
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort
	),
	/** Option set with the following active options: {@link #dictionaryOrder d}, {@link #generalNumericSort g}.*/
	Active_dg_long(
		/*c:*/SortOptionSet_bcdfgru.Active_cdg, /*check:*/SortOptionSet_bcdfgru.Active_cdg_long, /*d:*/null /*already set*/, /*dictionaryOrder:*/null /*already set*/, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_dfg, /*ignoreCase:*/Active_dfg_long, /*b:*/Active_bdg, /*ignoreLeadingBlanks:*/Active_bdg_long, /*m:*/SortOptionSet_bdfgmru.Active_dgm, /*merge:*/SortOptionSet_bdfgmru.Active_dgm_long, /*r:*/Active_dgr, /*reverse:*/Active_dgr_long, /*u:*/Active_dgu, /*unique:*/Active_dgu_long, 
		false, 
		/*active:*/SortOption.dictionaryOrder, SortOption.generalNumericSort
	),
	/** Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreCase f}.*/
	Active_fg(
		/*c:*/SortOptionSet_bcdfgru.Active_cfg, /*check:*/SortOptionSet_bcdfgru.Active_cfg_long, /*d:*/Active_dfg, /*dictionaryOrder:*/Active_dfg_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfg, /*ignoreLeadingBlanks:*/Active_bfg_long, /*m:*/SortOptionSet_bdfgmru.Active_fgm, /*merge:*/SortOptionSet_bdfgmru.Active_fgm_long, /*r:*/Active_fgr, /*reverse:*/Active_fgr_long, /*u:*/Active_fgu, /*unique:*/Active_fgu_long, 
		true, 
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreCase
	),
	/** Option set with the following active options: {@link #generalNumericSort g}, {@link #ignoreCase f}.*/
	Active_fg_long(
		/*c:*/SortOptionSet_bcdfgru.Active_cfg, /*check:*/SortOptionSet_bcdfgru.Active_cfg_long, /*d:*/Active_dfg, /*dictionaryOrder:*/Active_dfg_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/null /*already set*/, /*ignoreCase:*/null /*already set*/, /*b:*/Active_bfg, /*ignoreLeadingBlanks:*/Active_bfg_long, /*m:*/SortOptionSet_bdfgmru.Active_fgm, /*merge:*/SortOptionSet_bdfgmru.Active_fgm_long, /*r:*/Active_fgr, /*reverse:*/Active_fgr_long, /*u:*/Active_fgu, /*unique:*/Active_fgu_long, 
		false, 
		/*active:*/SortOption.generalNumericSort, SortOption.ignoreCase
	),
	/** Option set with the following active options: {@link #generalNumericSort g}, {@link #reverse r}.*/
	Active_gr(
		/*c:*/SortOptionSet_bcdfgru.Active_cgr, /*check:*/SortOptionSet_bcdfgru.Active_cgr_long, /*d:*/Active_dgr, /*dictionaryOrder:*/Active_dgr_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_fgr, /*ignoreCase:*/Active_fgr_long, /*b:*/Active_bgr, /*ignoreLeadingBlanks:*/Active_bgr_long, /*m:*/SortOptionSet_bdfgmru.Active_gmr, /*merge:*/SortOptionSet_bdfgmru.Active_gmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_gru, /*unique:*/Active_gru_long, 
		true, 
		/*active:*/SortOption.generalNumericSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #generalNumericSort g}, {@link #reverse r}.*/
	Active_gr_long(
		/*c:*/SortOptionSet_bcdfgru.Active_cgr, /*check:*/SortOptionSet_bcdfgru.Active_cgr_long, /*d:*/Active_dgr, /*dictionaryOrder:*/Active_dgr_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_fgr, /*ignoreCase:*/Active_fgr_long, /*b:*/Active_bgr, /*ignoreLeadingBlanks:*/Active_bgr_long, /*m:*/SortOptionSet_bdfgmru.Active_gmr, /*merge:*/SortOptionSet_bdfgmru.Active_gmr_long, /*r:*/null /*already set*/, /*reverse:*/null /*already set*/, /*u:*/Active_gru, /*unique:*/Active_gru_long, 
		false, 
		/*active:*/SortOption.generalNumericSort, SortOption.reverse
	),
	/** Option set with the following active options: {@link #generalNumericSort g}.*/
	Active_g(
		/*c:*/SortOptionSet_bcdfgru.Active_cg, /*check:*/SortOptionSet_bcdfgru.Active_cg_long, /*d:*/Active_dg, /*dictionaryOrder:*/Active_dg_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_fg, /*ignoreCase:*/Active_fg_long, /*b:*/Active_bg, /*ignoreLeadingBlanks:*/Active_bg_long, /*m:*/SortOptionSet_bdfgmru.Active_gm, /*merge:*/SortOptionSet_bdfgmru.Active_gm_long, /*r:*/Active_gr, /*reverse:*/Active_gr_long, /*u:*/Active_gu, /*unique:*/Active_gu_long, 
		true, 
		/*active:*/SortOption.generalNumericSort
	),
	/** Option set with the following active options: {@link #generalNumericSort g}.*/
	Active_g_long(
		/*c:*/SortOptionSet_bcdfgru.Active_cg, /*check:*/SortOptionSet_bcdfgru.Active_cg_long, /*d:*/Active_dg, /*dictionaryOrder:*/Active_dg_long, /*g:*/null /*already set*/, /*generalNumericSort:*/null /*already set*/, /*f:*/Active_fg, /*ignoreCase:*/Active_fg_long, /*b:*/Active_bg, /*ignoreLeadingBlanks:*/Active_bg_long, /*m:*/SortOptionSet_bdfgmru.Active_gm, /*merge:*/SortOptionSet_bdfgmru.Active_gm_long, /*r:*/Active_gr, /*reverse:*/Active_gr_long, /*u:*/Active_gu, /*unique:*/Active_gu_long, 
		false, 
		/*active:*/SortOption.generalNumericSort
	);
	private SortOptionSet_bcdfgmru(
		SortOptionSet_bcdfgru c, SortOptionSet_bcdfgru check, SortOptionSet_bcdfgmru d, SortOptionSet_bcdfgmru dictionaryOrder, SortOptionSet_bcdfgmru g, SortOptionSet_bcdfgmru generalNumericSort, SortOptionSet_bcdfgmru f, SortOptionSet_bcdfgmru ignoreCase, SortOptionSet_bcdfgmru b, SortOptionSet_bcdfgmru ignoreLeadingBlanks, SortOptionSet_bdfgmru m, SortOptionSet_bdfgmru merge, SortOptionSet_bcdfgmru r, SortOptionSet_bcdfgmru reverse, SortOptionSet_bcdfgmru u, SortOptionSet_bcdfgmru unique, 
		boolean useAcronym,
		SortOption... activeOptions
	) {
		this.c = notNull(c);
		this.check = notNull(check);
		this.d = d == null ? this : d;
		this.dictionaryOrder = dictionaryOrder == null ? this : dictionaryOrder;
		this.g = g == null ? this : g;
		this.generalNumericSort = generalNumericSort == null ? this : generalNumericSort;
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
	public final SortOptionSet_bcdfgru c;
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
	public final SortOptionSet_bcdfgru check;
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
	public final SortOptionSet_bcdfgmru d;
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
	public final SortOptionSet_bcdfgmru dictionaryOrder;
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
	public final SortOptionSet_bcdfgmru g;
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
	public final SortOptionSet_bcdfgmru generalNumericSort;
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
	public final SortOptionSet_bcdfgmru f;
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
	public final SortOptionSet_bcdfgmru ignoreCase;
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
	public final SortOptionSet_bcdfgmru b;
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
	public final SortOptionSet_bcdfgmru ignoreLeadingBlanks;
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
	public final SortOptionSet_bdfgmru m;
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
	public final SortOptionSet_bdfgmru merge;
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
	public final SortOptionSet_bcdfgmru r;
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
	public final SortOptionSet_bcdfgmru reverse;
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
	public final SortOptionSet_bcdfgmru u;
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
	public final SortOptionSet_bcdfgmru unique;
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
	 *    SortOptionSet_bcdfgmru.check.d;
	 * </pre>
	 * uses acronyms, that is, this method always returns true for the above 
	 * set. 
	 * <p>
	 * On the other hand, long option names are used and this method always 
	 * returns false for the set
	 * <pre>
	 *    SortOptionSet_bcdfgmru.c.dictionaryOrder;
	 * </pre>
	 * <p>
	 * Note that a repeated option is <i>not</i> treated as the last set option.
	 * For instance, the first and last option of the following set are 
	 * equivalent and acronyms are used:
	 * <pre>
	 *    SortOptionSet_bcdfgmru.c.d.check;
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
