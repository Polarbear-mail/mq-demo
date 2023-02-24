package cn.itcast.mq.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author ：Polarbear
 * @date ：Created 2023/2/24 13:44
 * @description：
 */
@Component
public class SpringRabbitListener {
    @RabbitListener(queues = "simple.queue")
    public void listenSimpleQueue(String msg){
        System.out.println("消费者接收到消息["+msg+"]");
    }
}
