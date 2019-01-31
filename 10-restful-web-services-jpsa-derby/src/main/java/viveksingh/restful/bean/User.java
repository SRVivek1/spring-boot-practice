/**
 * 
 */
package viveksingh.restful.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author vivek_xz2hujv
 *
 */
@Entity
@Table(name="t_user")
public class User {

	@Id
	private String id;
	private String name;
	private String email;

	
	
	/**
	 * Default constructor.
	 */
	public User() {
		super();
	}

	/**
	 * @param id
	 * @param name
	 * @param email
	 */
	public User(String id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}