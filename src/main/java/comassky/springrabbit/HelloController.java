package comassky.springrabbit;

import comassky.springrabbit.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	private MessageService messageService;

	@GetMapping(path = "/{nombre}")
	public void generateMessage (@PathVariable(required = true) final Integer  nombre) {
		this.messageService.genererMessages(nombre);
	}
}
