package com.valor.practice.design;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @author: 01368324(王刚勇)
 * @date: 2019/11/8 14:43
 * Description:
 */
public interface FilterChain {
    void doFilter(ServletRequest request, ServletResponse response);
}
