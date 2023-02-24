package spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author ：Polarbear
 * @date ：Created 2023/2/24 11:58
 * @description：SpringAmqp测试使用
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringAmqpTest {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void testSendMessage2SimleQueue(){
        String queueName = "simple.queue";
        String message = "hello,spring amqp";
        rabbitTemplate.convertAndSend(queueName,message);
    }
}
