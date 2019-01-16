/**
 * 
 */
package viveksingh.restful.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author vivek_xz2hujv
 *
 */
@SuppressWarnings("serial")
@ResponseStatus(code=HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {

	public UserNotFoundException(final String message) {
		super(message);
	}

}
