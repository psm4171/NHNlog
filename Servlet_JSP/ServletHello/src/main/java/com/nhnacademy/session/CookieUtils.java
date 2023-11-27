package com.nhnacademy.hello.session;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Objects;

public class CookieUtils {
    public static Cookie getCookie(HttpServletRequest request, String name) {
        Cookie[] cookies = request.getCookies();
        if (Objects.nonNull(cookies)) {
            return Arrays.stream(cookies)
                    .filter(cookie -> name.equals(cookie.getName()))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    public static void updateCookie(Cookie cookie, String value, int maxAge) {
        if (Objects.nonNull(cookie)) {
            cookie.setValue(value);
            cookie.setMaxAge(maxAge);
        }
    }
}