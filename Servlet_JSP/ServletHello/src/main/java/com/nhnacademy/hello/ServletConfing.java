package com.nhnacademy.hello;

import java.util.Enumeration;
import javax.servlet.ServletContext;

public interface ServletConfig {
    public String getServletName();
    public String getInitParameter(String name);
    public Enumeration<String> getInitParameterNames();
    public ServletContext getServletContext();
}
