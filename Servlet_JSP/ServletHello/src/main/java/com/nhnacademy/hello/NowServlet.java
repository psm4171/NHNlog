package com.nhnacademy.hello;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Logger;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NowServlet extends HelloServlet{
    private static Logger log = Logger.getLogger(NowServlet.class.getName());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp){
        resp.setCharacterEncoding("UTF-8");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        LocalDateTime localDateTime = LocalDateTime.now();
        String nowDateTimeString = localDateTime.format(dateTimeFormatter);

        try(PrintWriter writer = resp.getWriter()){
            writer.println("<!DOCTYPE html>");
            writer.println("<html>");
            writer.println("<head>");
            writer.println("<meta charset='utf-8'>");
            writer.println("</head>");
            writer.println("<body>");
            writer.println("<h1>현재 시간</h1>");
            writer.println("<h1>"+nowDateTimeString+"</h1>");
            writer.println("</body>");
            writer.println("</html>");
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }


    @Override
    public void init(ServletConfig config) throws ServletException {
        log.info("before init!");
        super.init(config);
    }
}
