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
public class PostNotFoundException extends RuntimeException {

	public PostNotFoundException(final String reason) {
		super(reason);
	}

}
