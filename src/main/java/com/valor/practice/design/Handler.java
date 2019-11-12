package com.valor.practice.design;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: 01368324(王刚勇)
 * @date: 2019/11/8 14:13
 * Description:  抽象处理者
 */
@Getter
@Setter
public abstract class Handler {
    private Handler next;
    public abstract void handleRequest(int request);
}
