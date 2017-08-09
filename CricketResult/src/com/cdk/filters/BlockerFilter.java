package com.cdk.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


public class BlockerFilter implements Filter {

    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        String ipaddress = req.getRemoteAddr();
        if(ipaddress.endsWith(".38") || ipaddress.endsWith(".36")){
            resp.getWriter().write("<h1 style='color:red'>Hello ji, Bye Bye</h1>");
        }else{
            chain.doFilter(req, resp);
        }

    }

    public void init(FilterConfig config) throws ServletException {

    }

}
