package com.valor.practice.learn;

import java.lang.annotation.*;

/**
 * @author: 01368324(王刚勇)
 * @date: 2019/5/28 17:10
 * Description:
 */
public class RepeatingAnnotations {
    @Target( ElementType.TYPE )
    @Retention(RetentionPolicy.RUNTIME )
    public @interface Filters {
        Filter[] value();
    }

    @Target( ElementType.TYPE )
    @Retention( RetentionPolicy.RUNTIME )
    @Repeatable(Filters.class )
    public @interface Filter {
        String value();
    };

    @Filter( "filter1" )
    @Filter( "filter2" )
    public interface Filterable {
    }
}
