package com.valor.practice.producer;

import com.valor.practice.entity.Order;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description TODO
 * @Author valor.wang
 * Date  2019-04-21 20:17
 **/
@Component
public class OrderSender {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(Order order){
        CorrelationData correlationData = new CorrelationData();
        correlationData.setId(order.getId());
        //correlationData  消息唯一Id
        rabbitTemplate.convertAndSend("order_exchange","order.routing.key",order,correlationData);
    }
}
