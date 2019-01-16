/**
 * 
 */
package viveksingh.restful.controller;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import viveksingh.restful.exception.ExceptionResponse;
import viveksingh.restful.exception.PostNotFoundException;
import viveksingh.restful.exception.UserNotFoundException;

/**
 * @author vivek_xz2hujv
 *
 */
@ControllerAdvice()
@RestController
public class ServiceResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	/**
	 * Generic exception processor.
	 * 
	 * @param ex
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ExceptionResponse> handleExceptions(Exception ex, WebRequest request) throws Exception {

		final ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(),
				request.getDescription(false));

		final ResponseEntity<ExceptionResponse> responseEntity = new ResponseEntity<>(exceptionResponse,
				HttpStatus.INTERNAL_SERVER_ERROR);

		return responseEntity;
	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {

		final ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), "Validation failed.",
				ex.getBindingResult().toString());

		final ResponseEntity<Object> responseEntity = new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);

		return responseEntity;
	}

	/**
	 * Post Query exception processor.
	 * 
	 * @param ex
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@ExceptionHandler(PostNotFoundException.class)
	public final ResponseEntity<ExceptionResponse> handlePostNotFoundException(PostNotFoundException ex,
			WebRequest request) throws Exception {

		final ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(),
				request.getDescription(false));

		final ResponseEntity<ExceptionResponse> responseEntity = new ResponseEntity<>(exceptionResponse,
				HttpStatus.NOT_FOUND);

		return responseEntity;
	}

	/**
	 * User API Exception handler.
	 * 
	 * @param ex
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@ExceptionHandler(UserNotFoundException.class)
	public final ResponseEntity<ExceptionResponse> handleUserNotFoundException(UserNotFoundException ex,
			WebRequest request) throws Exception {

		final ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage(),
				request.getDescription(false));

		final ResponseEntity<ExceptionResponse> responseEntity = new ResponseEntity<ExceptionResponse>(
				exceptionResponse, HttpStatus.NOT_FOUND);

		return responseEntity;

	}

}
