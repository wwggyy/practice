package com.valor.practice;

import com.valor.practice.service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PracticeApplicationTests {

    @Resource
    private MailService service;

    @Test
    public void sendSampleMailTest() {
        service.sendSampleMail("565637570@qq.com","a test"," sth is going!");
    }

}
