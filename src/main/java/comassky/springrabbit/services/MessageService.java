package comassky.springrabbit.services;

import comassky.springrabbit.dto.Message;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class MessageService {

	@Autowired
	private SenderRabbitMq sender;

	public void genererMessages(Integer nombre) {
		final List<Message> messages = IntStream.range(0, nombre).mapToObj(i -> new Message(RandomStringUtils.random(50, true, true), LocalDateTime.now())).collect(Collectors.toList());
		messages.forEach(message -> this.sender.envoyerMessage(message));
	}
}
