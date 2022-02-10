package com.example.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/*
 *   使用过滤器就要继承filter 并实现方法
 *
 * */

//配置拦截路径
@WebFilter("/*")
public class filterDemo implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //放行前对 servletRequest 进行处理
        System.out.println("filter执行了");
        //放行
        filterChain.doFilter(servletRequest, servletResponse);
        //放行后 servletResponse 进行处理
        System.out.println("filter放行了");

    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
