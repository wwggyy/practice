package com.valor.practice.design;

import org.apache.catalina.core.ApplicationFilterConfig;

import javax.servlet.Servlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @author: 01368324(王刚勇)
 * @date: 2019/11/8 14:41
 * Description:
 */
public class ApplicationFilterChain implements FilterChain{
    private int pos = 0;
    private int n;
    private ApplicationFilterConfig[] filters;
    private Servlet servlet;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response) {
        if (pos < n) {
//            ApplicationFilterConfig  = filters[pos++];
//            Filter filter = filterConfig.getFilter();
//            filter.doFilter(request, response,filterConfig this);
        } else {
//            servlet.service(request, response);
        }
    }
}
