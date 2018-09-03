package com.example.backend.dao;


import java.util.HashMap;
import java.util.Map;

public class MockStoreDao {

    static MockStoreDao instance;

    private MockStoreDao() {
    }

    public static MockStoreDao getInstance() {
        if (instance == null)
            instance = new MockStoreDao();

        return instance;
    }

    public Map getInfo(String storeName) {

        HashMap infoMap = null;
        HashMap seoMeta = null;

        if (storeName.equals("test")) {
            infoMap = new HashMap();
            seoMeta = new HashMap();

            seoMeta.put("description", "test 매장의 간략한 설명 설명");
            seoMeta.put("subject", "test 매장에 대한 주제");
            seoMeta.put("classification", "test 매장 분류");
            seoMeta.put("keywords", "test 매장에 대한 설명 해시태그");
            seoMeta.put("robots", "all");
            infoMap.put("title", "test 매장 홈페이지 제목");
            infoMap.put("seoMeta", seoMeta);

        } else if (storeName.equals("dummy")) {
            infoMap = new HashMap();
            seoMeta = new HashMap();

            seoMeta.put("description", "dummy 매장의 간략한 설명 설명");
            seoMeta.put("subject", "dummy 매장에 대한 주제");
            seoMeta.put("classification", "dummy 매장 분류");
            seoMeta.put("keywords", "dummy 매장에 대한 설명 해시태그");
            seoMeta.put("robots", "all");
            infoMap.put("title", "dummy 매장 홈페이지 제목");
            infoMap.put("seoMeta", seoMeta);

        }

        return infoMap;
    }
}