package com.practice.springcloud.microservices.currencyconversionservice;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {
	@Autowired
	private CurrencyExchangeServiceProxy proxy;
	private Logger logger=LoggerFactory.getLogger(this.getClass());
@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
public CurrencyConversionBean CurrencyConversion(@PathVariable String from,@PathVariable String to,@PathVariable int quantity) {
	Map<String,String> uriResponse = new HashMap<String,String>();
	uriResponse.put("from", from);
	uriResponse.put("to", to);
	ResponseEntity<CurrencyConversionBean> responseEntity=new RestTemplate().getForEntity("http://localhost:8000//currency-exchange/from/USD/to/INR",CurrencyConversionBean.class,uriResponse);
	CurrencyConversionBean reponse=responseEntity.getBody();
	return new CurrencyConversionBean(reponse.getId(),from,to,reponse.getConversionMultiplier(),quantity,reponse.getConversionMultiplier()*quantity,reponse.getPort());
}

@GetMapping("/currency-conversion-feign/from/{from}/to/{to}/quantity/{quantity}")
public CurrencyConversionBean CurrencyConversionfeign(@PathVariable String from,@PathVariable String to,@PathVariable int quantity) {
	CurrencyConversionBean reponse=proxy.retreiveExchangeValue(from, to);
	logger.info("{}",reponse);
	return new CurrencyConversionBean(reponse.getId(),from,to,reponse.getConversionMultiplier(),quantity,reponse.getConversionMultiplier()*quantity,reponse.getPort());

}

}
