package com.davioooh.datatablespagination.data;

import com.davioooh.datatablespagination.PaginationCriteria;

import java.util.List;

/**
 * This interface is used to retrieve data to paginate. Classes implementing
 * {@link TableDataService} should also implement filter and ordering logic.
 *
 * @author David Castelletti
 *
 */
public interface TableDataService<T> {

	/**
	 * Used to get the total count of the entries before filtering.
	 * 
	 * @return the total count of the entries.
	 * @throws TableDataException
	 */
	long countTotalEntries() throws TableDataException;

	/**
	 * Used to get the number of total filtered result according to provided search
	 * criteria declared in {@code PaginationCriteria}}
	 * 
	 * @param paginationCriteria
	 *            pagination criteria.
	 * @return the count of filter entries.
	 * @throws TableDataException
	 */
	long countFilteredEntries(PaginationCriteria paginationCriteria) throws TableDataException;

	/**
	 * Used to select and filter the entries for a single page. It provides the
	 * entries filtered by search keys and sorted by ordering criteria declared in
	 * {@code PaginationCriteria}}
	 * 
	 * @param paginationCriteria
	 *            pagination criteria.
	 * @return filter and ordered entities.
	 * @throws TableDataException
	 */
	List<T> getPageEntries(PaginationCriteria paginationCriteria) throws TableDataException;

}
