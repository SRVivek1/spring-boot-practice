/**
 * 
 */
package viveksingh.restful.bean;

/**
 * @author vivek_xz2hujv
 *
 */
public class PersonV1 {

	private String name;

	/**
	 * @param fName
	 * @param lName
	 */
	public PersonV1(String name) {
		super();
		this.name = name;
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

}
