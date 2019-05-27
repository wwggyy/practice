package com.valor.practice;

import com.valor.practice.entity.Order;
import com.valor.practice.producer.OrderSender;
import com.valor.practice.service.MailService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class PracticeApplicationTests {
   @Autowired
   private OrderSender orderSender;

    @Test
    public void testSend() {
        Order order = new Order();
        order.setId(UUID.randomUUID().toString());
        order.setName("ooo");
        order.setMessageId(UUID.randomUUID().toString());
        orderSender.send(order);
    }

}
