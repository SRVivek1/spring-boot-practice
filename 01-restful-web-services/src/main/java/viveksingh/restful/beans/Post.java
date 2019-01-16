/**
 * 
 */
package viveksingh.restful.beans;

import java.util.Date;

/**
 * @author vivek_xz2hujv
 *
 */
public class Post {

	// User
	private int userId;
	
	// Post ID
	private long id;
	
	// Post message
	private String message;
	
	// Date of creation
	private Date created;
	
	// Date of last modification.
	private Date lastModified;

	/**
	 * Default Constructor.
	 */
	public Post() {
		// No-args
	}
	
	/**
	 * @param userId
	 * @param id
	 * @param message
	 */
	public Post(int userId, long id, String message) {
		super();
		this.userId = userId;
		this.id = id;
		this.message = message;
		this.created = new Date();
	}
	
	/**
	 * @param userId
	 * @param id
	 * @param message
	 * @param created
	 * @param lastModified
	 */
	public Post(int userId, long id, String message, Date created, Date lastModified) {
		super();
		this.id = id;
		this.message = message;
		this.created = created;
		this.lastModified = lastModified;
	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the created
	 */
	public Date getCreated() {
		return created;
	}

	/**
	 * @param created the created to set
	 */
	public void setCreated(Date created) {
		this.created = created;
	}

	/**
	 * @return the lastModified
	 */
	public Date getLastModified() {
		return lastModified;
	}

	/**
	 * @param lastModified the lastModified to set
	 */
	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}
	
}
