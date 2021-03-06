package com.valor.practice.design.responsibility;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author: 01368324(王刚勇)
 * @date: 2019/11/8 14:58
 * Description:
 */
@Component
@Slf4j
public class RiskFilter implements Filter {
    @Override
    public boolean filter(Task task) {
        log.info("风控拦截");
        return true;
    }
}
