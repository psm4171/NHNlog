package com.nhnacademy.hello.filter.excepta;
//
////import com.nhnacademy.hello.filter.FilterChain;
////import com.nhnacademy.hello.filter.Filter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import javax.servlet.*;
//
//
//public class CharacterEncodingFilter implements Filter {
//    private String encoding;
//
//    @Override
//    public void init(FilterConfig filterConfig) {
//        this.encoding = filterConfig.getInitParameter("encoding");
//    }
//
////    @Override
////    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws UnsupportedEncodingException {
////        servletRequest.setCharacterEncoding(this.encoding);
////        filterChain.doFilter(servletRequest, servletResponse);
////    }
//
//    @Override
//    public void doFilter(Request request, FilterChain filterChain) {
//        servletRequest.setCharacterEncoding(this.encoding);
//        filterChain.doFilter(servletRequest, servletResponse);
//    }
//}

public class CharacterEncodingFilter implements Filter {
    private String encoding;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.encoding = filterConfig.getInitParameter("encoding");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException, IOException {
        servletRequest.setCharacterEncoding(this.encoding);
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
