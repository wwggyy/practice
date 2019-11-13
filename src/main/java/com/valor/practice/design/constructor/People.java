package com.valor.practice.design.constructor;

import lombok.Data;

/**
 * @author: 01368324(王刚勇)
 * @date: 2019/10/10 16:09
 * Description:  构造器模式
 * 构建器模式(Builder模式)创建对象在参数越来越多的情况下是个不错的选择，尤其是在有些参数是可选的时候，
 * 构建器模式使代码简介且易于阅读。在构建对象过程中，
 * 在调用build方法之前可以进行一些数据校验，如果校验失败者放弃创建对象。
 */
@Data
public class People {
    private String name;
    /** 手机号 */
    private String phone;
    /** 邮箱 */
    private String email;
    /** 年龄 */
    private Integer age;
    /** 性别 */
    private String sex;
    /** 地址 */
    private String address;

    public People(Builder builder) {
        this.address = builder.address;
        this.age = builder.age;
        this.email = builder.email;
        this.name = builder.name;
        this.phone = builder.phone;
        this.sex = builder.sex;
    }
    public static class Builder {
        /**
         * 用户名
         */
        private String name;
        /**
         * 手机号
         */
        private String phone;
        /**
         * 邮箱
         */
        private String email;
        /**
         * 年龄
         */
        private Integer age;
        /**
         * 性别
         */
        private String sex;
        /**
         * 地址
         */
        private String address;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Builder sex(String sex) {
            this.sex = sex;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public People build() {
            return new People(this);
        }
    }
}
