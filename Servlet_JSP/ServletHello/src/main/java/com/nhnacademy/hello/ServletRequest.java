package com.nhnacademy.hello;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Objects;
import javax.servlet.ServletInputStream;

public interface ServletRequest {
    Object getAttribute(String var1);
    void setAttribute(String var1, Object var2);

    String getParameter(String var1);

    Locale getLocale();

    String getContentType();

    int getContentLength();

    BufferedReader getReader() throws IOException;

    ServletInputStream getInputStream() throws  IOException;

    String getContentLengthLong();
}
