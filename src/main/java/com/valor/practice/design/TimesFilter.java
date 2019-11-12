package com.valor.practice.design;

import org.springframework.stereotype.Component;

/**
 * @author: 01368324(王刚勇)
 * @date: 2019/11/8 14:59
 * Description:
 */
@Component
public class TimesFilter implements Filter{
    @Override
    public boolean filter(Task task) {
        System.out.println("次数限制检验");
        return true;
    }
}
