package com.valor.practice.service.impl;

import com.valor.practice.service.MailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

/**
 * @Description 邮件服务
 * @Author valor.wang
 * Date  2019-04-07 20:09
 **/
@Service
@Slf4j
public class MailServiceImpl implements MailService {
    /**
     * 发送人
     */
    @Value("${spring.mail.username}")
    private String from;

    @Autowired
    private JavaMailSender mailSender;

    @Override
    public void sayHello() {
        log.info("say hello ...");
    }

    /**
     * 发送简单文本邮件
     *
     * @param to      接收人
     * @param subject 邮件主题
     * @param content 邮件内容
     */
    @Override
    public void sendSampleMail(String to, String subject, String content) {
        log.info("开始发送简单文本邮件>>>");
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(content);
        message.setFrom(from);
        mailSender.send(message);
        log.info("发送简单文本邮件结束<<<");
    }

    /**
     * 发送HTML邮件
     *
     * @param to      接收人
     * @param subject 邮件主题
     * @param content 邮件内容
     */
    @Override
    public void sendHtmlMail(String to, String subject, String content) throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message,true);
    }

}
