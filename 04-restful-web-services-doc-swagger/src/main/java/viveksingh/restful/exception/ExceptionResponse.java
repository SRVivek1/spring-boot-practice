/**
 * 
 */
package viveksingh.restful.exception;

import java.util.Date;

/**
 * @author vivek_xz2hujv
 *
 */
@SuppressWarnings("serial")
public class ExceptionResponse extends RuntimeException {

	// When error occurred
	private Date timestamp;

	// Cause of failure
	private String reason;

	// Other details about service and error
	private String details;

	/**
	 * @param timestamp
	 * @param reason
	 * @param details
	 */
	public ExceptionResponse(Date timestamp, String reason, String details) {
		super();
		this.timestamp = timestamp;
		this.reason = reason;
		this.details = details;
	}

	/**
	 * @return the timestamp
	 */
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * @return the reason
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * @return the details
	 */
	public String getDetails() {
		return details;
	}

}
