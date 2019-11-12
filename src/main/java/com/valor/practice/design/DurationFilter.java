package com.valor.practice.design;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author: 01368324(王刚勇)
 * @date: 2019/11/8 14:57
 * Description:
 */
@Slf4j
@Component
public class DurationFilter implements Filter{
    @Override
    public boolean filter(Task task) {
        log.info("时效性检验");
        return true;
    }
}
