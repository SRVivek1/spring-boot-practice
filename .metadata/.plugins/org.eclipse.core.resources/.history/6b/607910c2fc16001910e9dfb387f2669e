/**
 * 
 */
package viveksingh.restful.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author vivek_xz2hujv
 *
 */
@RestController
public class I18nTestController {

	@Autowired
	private MessageSource messageSource;

	@GetMapping(path = "/hello-i18n")
	public String sayHello(@RequestHeader(value = "Accept-Language") Locale locale) {

		final String message = messageSource.getMessage("message", null, locale);
		return message;
	}
}
