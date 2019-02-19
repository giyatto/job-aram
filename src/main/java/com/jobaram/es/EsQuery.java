package com.jobaram.es;

import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;

public class EsQuery extends EsQueryAbstract{
	
	private QueryBuilder queryBuilder;

	@Override
	public QueryBuilder getQuery() {
		return this.queryBuilder;
	}

	@Override
	public void useAggregations() {

	}

	@Override
	public void useSorts() {
		this.sorts.add(SortBuilders.fieldSort("_doc"));
	}

	@Override
	public void usePostFilter() {

	}

	@Override
	public void setQueryArgs(Object... args) {
		this.queryBuilder = (QueryBuilder) args[0];
	}

}
