package com.nhnacademy.hello.session;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginServlet extends HttpServlet {
    private String initParamId;
    private String initParamPwd;

    private static Logger log = LoggerFactory.getLogger(LoginServlet.class.getName());

    @Override
    public void init(ServletConfig config) throws ServletException{

        initParamId = config.getInitParameter("id");
        initParamPwd = config.getInitParameter("pwd");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);

        if(Objects.isNull(session) || Objects.isNull(session.getAttribute("id"))){
            resp.sendRedirect("/login.html");
        }else {
            resp.setContentType("text/html");
            resp.setCharacterEncoding("UTF-8");


            try(PrintWriter out = resp.getWriter()){
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<meta charset='utf-8'>");
                out.println("</head>");
                out.println("<body>");
                out.println("Login Success, 확인된 ID = " + session.getAttribute("id") + "<br/>");
                out.println("<a href='/logout'>logout</a>");
                out.println("</body>");
                out.println("</html>");
            }
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String id = req.getParameter("id");
        String pwd = req.getParameter("pwd");

        if(initParamId.equals(id) && initParamPwd.equals(pwd)){
            HttpSession session = req.getSession();
            session.setAttribute("id", id);
            resp.sendRedirect("/login");
        }else {
            log.error("아이디/패스워드가 일치하지 않습니다.");
            resp.sendRedirect("/login.html");
        }
    }


}
