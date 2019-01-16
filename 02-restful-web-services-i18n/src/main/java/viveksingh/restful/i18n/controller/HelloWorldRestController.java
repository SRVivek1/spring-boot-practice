package viveksingh.restful.i18n.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

	@Autowired
	private MessageSource messageSource;

	@GetMapping(path = "/hello-i18n")
	private String sayHello(@RequestHeader(name = "Accept-Language") Locale locale) {

		String message = "Hello X";

		System.out.println(messageSource.getMessage("message.one", null, locale));

		return message;
	}
}