/**
 * 
 */
package viveksingh.restful.bean;

/**
 * @author vivek_xz2hujv
 *
 */
public class PersonV2 {

	private Name name;

	/**
	 * @param name
	 */
	public PersonV2(Name name) {
		super();
		this.name = name;
	}

	/**
	 * @param name
	 */
	public PersonV2(String fName, String lName) {
		super();
		this.name = new Name(fName, lName);
	}

	/**
	 * @return the name
	 */
	public Name getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(Name name) {
		this.name = name;
	}
}
