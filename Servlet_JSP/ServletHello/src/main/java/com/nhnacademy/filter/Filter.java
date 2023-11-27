package com.nhnacademy.hello.filter;

//import com.nhnacademy.hello.chainPattern.FilterChain;
import java.io.UnsupportedEncodingException;
//import javax.servlet.*;

public interface Filter {
   // void init(FilterConfig filterConfig);

  //   void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws UnsupportedEncodingException;

  //  void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws UnsupportedEncodingException;

    void doFilter(Request request, FilterChain filterChain);

    //void doFilter(Request request, FilterChain filterChain);

}
