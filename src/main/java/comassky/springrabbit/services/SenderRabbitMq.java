package comassky.springrabbit.services;

import comassky.springrabbit.dto.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SenderRabbitMq {

	@Value("${javainuse.rabbitmq.queue}")
	String queueName;

	@Autowired
	RabbitTemplate rabbitTemplate;

	public void envoyerMessage(final Message message){
		this.rabbitTemplate.convertAndSend(queueName, message);
	}

}
