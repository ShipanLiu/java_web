package com.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


//  指定拦截路径   /* means filter all the paths
@WebFilter("/*")
public class Filter01 implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("the filter01 is on now");

        // 处理中文乱码
        servletResponse.setContentType("text/html;charset=UTF-8");
        // 放行
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
