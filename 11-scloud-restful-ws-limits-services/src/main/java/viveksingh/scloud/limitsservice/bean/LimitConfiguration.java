/**
 * 
 */
package viveksingh.scloud.limitsservice.bean;

/**
 * @author vivek_xz2hujv
 *
 */
public class LimitConfiguration {

	private int maximum;

	private int minimum;

	/**
	 * @param maximum
	 * @param minimum
	 */
	public LimitConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}

	/**
	 * @return the maximum
	 */
	public int getMaximum() {
		return maximum;
	}

	/**
	 * @return the minimum
	 */
	public int getMinimum() {
		return minimum;
	}

}
