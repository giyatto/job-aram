package com.jobaram.es;

import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.index.VersionType;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.search.aggregations.AbstractAggregationBuilder;
import org.elasticsearch.search.sort.SortBuilder;
import org.slf4j.Logger;

public abstract class EsQueryAbstract implements EsQueryInterface {
	
	protected static Logger LOGGER = LoggerFactory.getLogger(EsQueryAbstract.class);
	
    protected List<AbstractAggregationBuilder> aggregations = new ArrayList();
    protected List<SortBuilder> sorts = new ArrayList();
    protected QueryBuilder postFilter;
    protected String indexName;
    protected String typeName;
    protected Integer size;
    protected Integer from;
    protected String[] storedFields;
    protected String[] includeSources;
    protected String[] excludeSources;
    protected Long scrollTimeLimit;
    protected Long version;
    protected Long ttl;
    protected VersionType versionType;
    protected SearchType searchType;
    protected String documentId;
    protected String scrollId;

    public EsQueryAbstract() {
    }

    public void setIndexName(String indexName) {
        this.indexName = indexName;
    }

    public String getIndexName() {
        return this.indexName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return this.typeName;
    }

    public void setSize(Integer maxResult) {
        this.size = maxResult;
    }

    public Integer getSize() {
        return this.size;
    }

    public void setStoredFields(String[] storedFields) {
        this.storedFields = storedFields;
    }

    public String[] getStoredFields() {
        return this.storedFields;
    }

    public void setIncludeSources(String[] sources) {
        this.includeSources = sources;
    }

    public String[] getIncludeSources() {
        return this.includeSources;
    }

    public void setExcludeSources(String[] sources) {
        this.excludeSources = sources;
    }

    public String[] getExcludeSources() {
        return this.excludeSources;
    }

    public void setScrollTimeLimit(Long limit) {
        this.scrollTimeLimit = limit;
    }

    public Long getScrollTimeLimit() {
        return this.scrollTimeLimit;
    }

    public void setVersionType(VersionType type) {
        this.versionType = type;
    }

    public VersionType getVersionType() {
        return this.versionType;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public Integer getFrom() {
        return this.from;
    }

    public SearchType getSearchType() {
        return this.searchType;
    }

    public void setSearchType(SearchType searchType) {
        this.searchType = searchType;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getDocumentId() {
        return this.documentId;
    }

    public void setPostFilter(QueryBuilder filter) {
        this.postFilter = filter;
    }

    public QueryBuilder getPostFilter() {
        return this.postFilter;
    }

    public List<AbstractAggregationBuilder> getAggregations() {
        return this.aggregations;
    }

    public List<SortBuilder> getSorts() {
        return this.sorts;
    }

    public void setScrollId(String scrollId) {
        this.scrollId = scrollId;
    }

    public String getScrollId() {
        return this.scrollId;
    }

    public String toString() {
        return "TmonEsAbstractQuery{aggregations=" + this.aggregations + ", sorts=" + this.sorts + ", postFilter=" + this.postFilter + ", indexName=\'" + this.indexName + '\'' + ", typeName=\'" + this.typeName + '\'' + ", size=" + this.size + ", from=" + this.from + ", storedFields=" + Arrays.toString(this.storedFields) + ", includeSources=" + Arrays.toString(this.includeSources) + ", excludeSources=" + Arrays.toString(this.excludeSources) + ", scrollTimeLimit=" + this.scrollTimeLimit + ", version=" + this.version + ", ttl=" + this.ttl + ", versionType=" + this.versionType + ", searchType=" + this.searchType + ", documentId=\'" + this.documentId + '\'' + ", scrollId=\'" + this.scrollId + '\'' + '}';
    }

}
