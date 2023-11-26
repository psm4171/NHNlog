package com.nhnacademy.hello;

import java.util.Optional;
import javax.servlet.ServletContext;

public final class CounterUtils {
    private CounterUtils(){
        throw new IllegalArgumentException("Utils class");
    }

    public static void increaseCounter(ServletContext servletContext){
        Long counter = Optional.ofNullable((Long)servletContext.getAttribute("Counter")).orElse(0l);
        counter = counter + 1;
        servletContext.setAttribute("Counter", counter);
    }
}
