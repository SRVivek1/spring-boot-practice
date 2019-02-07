/**
 * 
 */
package viveksingh.restful.currency.conversion.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import viveksingh.restful.currency.conversion.bean.CurrencyConversionBean;

/**
 * @author vivek_xz2hujv
 *
 */
@FeignClient(name = "currency-exchange-service", url = "localhost:9000")
public interface CurrencyExchangeServiceProxy {

	@GetMapping(value = "/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionBean retrieveExchangeValue(@PathVariable(name = "from") final String from,
			@PathVariable(name = "to") final String to);
}