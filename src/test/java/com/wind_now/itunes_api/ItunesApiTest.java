package com.wind_now.itunes_api;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.wind_now.itunes_api.beans.SearchResponse;
import com.wind_now.itunes_api.beans.SearchResponse.Result;
import com.wind_now.itunes_api.util.OnoLogger;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ono
 */
public class ItunesApiTest {

    static final Logger logger = OnoLogger.getLogger();

    public ItunesApiTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void search() throws Exception{
        logger.info("search");
        String term = "シエナ・ウィンド";
        Search search = new Search();
        SearchResponse res = search.search(term);
        Integer actual = res.getResultCount();
        Integer expected = 50;
        assertThat(actual, is(actual));
        List<Result> results = res.getResults();
        results.forEach(result -> logger.info(result.getTrackName()));
//        logger.info(res.getResults().get(0).getCollectionName());
    }

}
