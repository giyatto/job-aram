package com.jobaram.es;

import java.util.Arrays;
import java.util.Collection;

import org.apache.lucene.search.join.ScoreMode;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;

public class EsQueryBuilder {
	
	public static QueryBuilder buildNestedTermQuery(String path, String field, Object value) {
		return QueryBuilders.nestedQuery(path, QueryBuilders.termQuery(field, value), ScoreMode.None);
	}

	public static QueryBuilder buildNestedTermsQuery(String path, String field, Collection value) {
		return QueryBuilders.nestedQuery(path, QueryBuilders.termsQuery(field, value), ScoreMode.None);
	}

	public static QueryBuilder buildTermsQuery(String field, Collection value) {
		return QueryBuilders.termsQuery(field, value);
	}

	public static QueryBuilder buildNestedRangeLtQuery(String path, String field, Object value) {
		return QueryBuilders.nestedQuery(path, QueryBuilders.rangeQuery(field).lt(value), ScoreMode.None);
	}

	public static QueryBuilder buildBoolTermQuery(String field, Object value) {
		return QueryBuilders.boolQuery().must(QueryBuilders.termQuery(field, value));
	}

	public static QueryBuilder buildBoolRangeLtQuery(String field, Object value) {
		return QueryBuilders.boolQuery().must(QueryBuilders.rangeQuery(field).lt(value));
	}

	public static QueryBuilder buildBoolRangeGteQuery(String field, Object value) {
		return QueryBuilders.boolQuery().must(QueryBuilders.rangeQuery(field).gte(value));
	}

	public static QueryBuilder buildBoolShouldQuery(QueryBuilder... queryBuilder) {
		BoolQueryBuilder resultQuery = QueryBuilders.boolQuery();
		Arrays.asList(queryBuilder).forEach(query -> {
			resultQuery.should(query);
		});
		return resultQuery;
	}

}
