package com.nhnacademy.hello.filter.excepta;
//
//import java.io.IOException;
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.Objects;
//import java.util.Set;
//import javax.servlet.Filter;
//import javax.servlet.FilterConfig;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import java.util.logging.Logger;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//
//public class LoginCheckFilter implements Filter {
//    private final Set<String> excludeUrls = new HashSet<>();
//    private static final Logger log = Logger.getLogger(LoginCheckFilter.class.getName());
//
//    @Override
//    public void init(FilterConfig filterConfig) {
//        String urls = filterConfig.getInitParameter("exclude-urls");
//        Arrays.stream(urls.split("\n"))
//                .map(String::trim)
//                .forEach(excludeUrls::add);
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException {
//        String requsetUri = ((HttpServletRequest) servletRequest).getRequestURI();
//
//        if(!excludeUrls.contains(requsetUri)){
//            HttpSession session = ((HttpServletRequest) servletRequest).getSession(false);
//            if(Objects.isNull(session)){
//                ((HttpServletResponse) servletResponse).sendRedirect("/login.html");
//                return;
//            }
//        }
//
//        filterChain.doFilter(servletRequest, servletResponse);
//    }
//}


public class LoginCheckFilter implements Filter {
    private final Set<String> excludeUrls = new HashSet<>();

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String urls = filterConfig.getInitParameter("exclude-urls");
        Arrays.stream(urls.split("\n"))
                .map(String::trim)
                .forEach(excludeUrls::add);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException, IOException {
        String requestUri = ((HttpServletRequest) servletRequest).getRequestURI();
        // excludeUrls에 포함되지 않는다면 ..
        if(!excludeUrls.contains(requestUri)){
            HttpSession session = ((HttpServletRequest) servletRequest).getSession(false);
            if(Objects.isNull(session)){
                ((HttpServletResponse) servletResponse).sendRedirect("/login.html");
            }
        }

        filterChain.doFilter(servletRequest, servletResponse);
    }
}