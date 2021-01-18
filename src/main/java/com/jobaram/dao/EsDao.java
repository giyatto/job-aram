package com.jobaram.dao;

import com.google.gson.Gson;
import com.jobaram.model.StudentInfo;
import org.apache.http.HttpHost;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.common.unit.TimeValue;
import org.elasticsearch.index.query.MatchQueryBuilder;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.elasticsearch.search.sort.FieldSortBuilder;
import org.elasticsearch.search.sort.SortOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.elasticsearch.client.RestHighLevelClient;

public class EsDao {

    Gson gson = new Gson();


    public List<StudentInfo> getStudentInfoListByMultiGetQuery() {
        List<StudentInfo> students = new ArrayList<StudentInfo>();


        RestHighLevelClient client = new RestHighLevelClient(
                RestClient.builder(
                        new HttpHost("192.168.0.13", 9200, "http"),
                        new HttpHost("192.168.0.13", 9201, "http")));


        SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();
        sourceBuilder.query(new MatchQueryBuilder("classroom", "3"));
        sourceBuilder.from(0);
        sourceBuilder.size(100);
        sourceBuilder.timeout(new TimeValue(60, TimeUnit.SECONDS));
        sourceBuilder.sort(new FieldSortBuilder("stdId").order(SortOrder.ASC));  // 정렬

        SearchRequest searchRequest = new SearchRequest();
        searchRequest.indices("students");
        searchRequest.source(sourceBuilder);


        try {

            SearchResponse searchResponse = client.search(searchRequest, RequestOptions.DEFAULT);


            SearchHits hits = searchResponse.getHits();

            for (SearchHit hit : hits.getHits()) {
                // do something with the SearchHit
                System.out.println("dd");

                


            }

        } catch (Exception e) {

        }


        return students;
    }




}
