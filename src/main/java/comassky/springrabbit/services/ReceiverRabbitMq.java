package comassky.springrabbit.services;

import comassky.springrabbit.dto.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ReceiverRabbitMq {

	@RabbitListener(queues = "Chat")
	public void listen(Message in) {
		System.out.println("Message read from myQueue : " + in.toString());
	}
}
