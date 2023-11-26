package com.nhnacademy.hello.session;

import java.io.IOException;
import java.util.Objects;
import javax.servlet.http.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogoutServlet extends HttpServlet {
    private static Logger log = LoggerFactory.getLogger(LogoutServlet.class.getName());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        HttpSession session = req.getSession(false);
        //현재 세션이 없으면 새로운 세션 생성없이 null 반환

        if(Objects.nonNull(session)){
            session.invalidate(); //세션 무효화 -> 사용자를 로그아웃 상태로.
        }

        //JSESSIONID라는 이름의 쿠키를 가져옴
        Cookie cookie = CookieUtils.getCookie(req, "JSESSIONID");
        if(Objects.nonNull(cookie)){ //null이 아니면
            cookie.setValue(""); //쿠키의 값을 빈 문자열로 설정하고 만료일을 0으로 설정
            cookie.setMaxAge(0);
            resp.addCookie(cookie);
        }

        resp.sendRedirect("/login.html"); //로그아웃이 성공적으로 이루어진 후에는 사용자를 다시 로그인 페이지로 리다이렉트
    }
}
