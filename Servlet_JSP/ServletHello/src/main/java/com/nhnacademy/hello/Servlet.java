package com.nhnacademy.hello;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Servlet extends HttpServlet {
    private static final Logger log = LoggerFactory.getLogger(Servlet.class.getName());
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain");
        resp.setCharacterEncoding("UTF-8");

        log.info("default buffer size : {}", resp.getBufferSize());
        resp.setBufferSize(1024);

        resp.setContentType("text/plain");
        resp.setCharacterEncoding("UTF-8");

        try(PrintWriter out = resp.getWriter()){
            out.println("locale=" + req.getLocale());
            out.println("parameter name=" + req.getParameter("name"));

            String userId = req.getParameter("userId");
            log.info("userId:{}", userId);

            if(userId == null || userId.isEmpty()){
                resp.reset();
                resp.setStatus(500); // 에러코드 500으로 설정
                return;
            }

            String redirect = req.getParameter("redirect");
            if(Objects.nonNull(redirect)){
                resp.sendRedirect(redirect);
                return;
            }

            out.println("method = "+ req.getMethod());
            out.println("request uri = " + req.getRequestURI());

            resp.resetBuffer();
            out.println("User-Agent header = " + req.getHeader("user-Agent"));

        }catch (Exception e){
            log.error("/req : {}",e.getMessage(),e);
        }
    }


}
