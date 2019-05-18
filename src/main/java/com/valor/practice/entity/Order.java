package com.valor.practice.entity;

import java.io.Serializable;

/**
 * @Description   订单管理
 * @Author valor.wang
 * Date  2019-04-21 20:01
 **/
public class Order implements Serializable {


    private static final long serialVersionUID = -4123278783848555519L;

    private String id;

    private String name;

    //存储消息发送的唯一标示
    private String messageId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }
}
