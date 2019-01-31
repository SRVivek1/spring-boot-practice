/**
 * 
 */
package viveksingh.restful.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author vivek_xz2hujv
 *
 */
@Component
@ConfigurationProperties(prefix = "service-configuration")
public class ServiceConfiguration {

	private int cone;

	private int ctwo;

	private int cthree;

	/**
	 * Default.
	 */
	public ServiceConfiguration() {
	}

	/**
	 * @param cone
	 */
	public ServiceConfiguration(int cone, int ctwo, int cthree) {
		super();
		this.cone = cone;
		this.ctwo = ctwo;
		this.cthree = cthree;
	}

	/**
	 * @return the cone
	 */
	public int getCone() {
		return cone;
	}

	/**
	 * @param cone the cone to set
	 */
	public void setCone(int cone) {
		this.cone = cone;
	}

	/**
	 * @return the ctwo
	 */
	public int getCtwo() {
		return ctwo;
	}

	/**
	 * @param ctwo the ctwo to set
	 */
	public void setCtwo(int ctwo) {
		this.ctwo = ctwo;
	}

	/**
	 * @return the cthree
	 */
	public int getCthree() {
		return cthree;
	}

	/**
	 * @param cthree the cthree to set
	 */
	public void setCthree(int cthree) {
		this.cthree = cthree;
	}
}
