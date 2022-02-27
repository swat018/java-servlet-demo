package com.swat018;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Filter Init");
    }

    @Override
    public void doFilter(ServletRequest requst, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Filter");
        chain.doFilter(requst, response);
    }

    @Override
    public void destroy() {
        System.out.println("Filter Destroy");
    }
}
