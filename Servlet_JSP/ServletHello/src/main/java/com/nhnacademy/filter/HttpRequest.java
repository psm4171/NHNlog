package com.nhnacademy.hello.filter;

import com.nhnacademy.hello.filter.AdminPageFilter;
import com.nhnacademy.hello.filter.MyPageFilter;
import com.nhnacademy.hello.filter.Request;

public class HttpRequest {
    private final FilterChain filterChain = new FilterChain();

    public HttpRequest(){
        initFilter();
    }

    public void doRequest(Request myPageRequest) {
    }

    public void initFilter(){
        filterChain.addFilter(new MyPageFilter());
        filterChain.addFilter(new AdminPageFilter());
    }
}
