package com.valor.practice.design.responsibility;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: 01368324(王刚勇)
 * @date: 2019/11/8 14:55
 * Description:
 */
@Service
public class ApplicationService {
    @Autowired
    private List<Filter> filters;

    public void mockedClient() {
        Task task = new Task(); // 这里task一般是通过数据库查询得到的
        for (Filter filter : filters) {
            if (!filter.filter(task)) {
                return;
            }
        }
    }
}