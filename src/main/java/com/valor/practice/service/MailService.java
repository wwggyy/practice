package com.valor.practice.service;

import javax.mail.MessagingException;

/**
 * @Description 邮件服务
 * @Author valor.wang
 * Date  2019-04-07 20:04
 **/
public interface MailService {

    void sayHello();

    /**
     * 发送简单文本邮件
     * @param to 接收人
     * @param subject 邮件主题
     * @param content  邮件内容
     */
    void sendSampleMail(String to, String subject, String content);
    /**
     * 发送HTML邮件
     * @param to 接收人
     * @param subject 邮件主题
     * @param content  邮件内容
     */
    void sendHtmlMail(String to, String subject, String content) throws MessagingException;
}
