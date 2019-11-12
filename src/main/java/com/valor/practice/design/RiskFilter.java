package com.valor.practice.design;

import org.springframework.stereotype.Component;

/**
 * @author: 01368324(王刚勇)
 * @date: 2019/11/8 14:58
 * Description:
 */
@Component
public class RiskFilter implements Filter{
    @Override
    public boolean filter(Task task) {
        System.out.println("风控拦截");
        return true;
    }
}
