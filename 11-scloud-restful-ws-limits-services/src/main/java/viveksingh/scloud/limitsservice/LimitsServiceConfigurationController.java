/**
 * 
 */
package viveksingh.scloud.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import viveksingh.scloud.limitsservice.bean.LimitConfiguration;
import viveksingh.scloud.limitsservice.config.Configuration;

/**
 * @author vivek_xz2hujv
 *
 */
@RestController
public class LimitsServiceConfigurationController {

	@Autowired
	Configuration configuration;

	@GetMapping(path = "/limits")
	public LimitConfiguration retreveLimitsFromCongiguration() {

		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());

	}
}
