package com.nhnacademy.hello;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MultiServlet extends HttpServlet {
    private static final Logger log = Logger.getLogger(MultiServlet.class.getName());

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String[] values = req.getParameterValues("class");
        try(PrintWriter out = resp.getWriter()){
            out.println(String.join(",", values));
        }catch (IOException ex){
            log.info(ex.getMessage());
        }
    }

}
