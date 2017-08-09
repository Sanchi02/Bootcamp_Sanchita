package com.cdk.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class IPLogFilter implements Filter {

    FileWriter fileWriter = null;

    public void destroy() {
        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        String ipaddress = req.getRemoteAddr();
        fileWriter.write("=====================START=========================\n");
        fileWriter.write("User connected from "+ipaddress+" IP Address on !!!"+new Date()+"\n");
        fileWriter.write("=====================END=========================\n");
        fileWriter.flush();
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        try {
            fileWriter = new FileWriter("C:/log.txt",true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
