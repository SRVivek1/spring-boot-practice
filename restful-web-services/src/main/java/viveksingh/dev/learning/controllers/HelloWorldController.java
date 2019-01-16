package viveksingh.dev.learning.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("/hellow")
	public String sayHellow() {
		return "Hello Mr. X.";
	}
}
