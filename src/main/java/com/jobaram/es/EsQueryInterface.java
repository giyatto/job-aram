package com.jobaram.es;

import java.util.List;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.index.VersionType;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.search.aggregations.AbstractAggregationBuilder;
import org.elasticsearch.search.sort.SortBuilder;

public interface EsQueryInterface {
	void setIndexName(String var1);

    String getIndexName();

    void setTypeName(String var1);

    String getTypeName();

    void setSize(Integer var1);

    Integer getSize();

    void setStoredFields(String[] var1);

    String[] getStoredFields();

    void setIncludeSources(String[] var1);

    String[] getIncludeSources();

    void setExcludeSources(String[] var1);

    String[] getExcludeSources();

    void setScrollTimeLimit(Long var1);

    Long getScrollTimeLimit();

    void setVersionType(VersionType var1);

    VersionType getVersionType();

    void setSearchType(SearchType var1);

    SearchType getSearchType();

    void setFrom(Integer var1);

    Integer getFrom();

    void setDocumentId(String var1);

    String getDocumentId();

    QueryBuilder getQuery();

    void useAggregations();

    void useSorts();

    void usePostFilter();

    List<AbstractAggregationBuilder> getAggregations();

    List<SortBuilder> getSorts();

    QueryBuilder getPostFilter();

    void setQueryArgs(Object... var1);

    default void setScrollId(String scrollId) {
    }

    default String getScrollId() {
        return null;
    }

    default boolean isIgnoreVersion() {
        return true;
    }

}
