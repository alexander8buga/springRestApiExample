package guru.springframework.springrestclientexamples.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 
 * @author ab 
 * Created on 01/09/18
 *
 */
@Configuration
public class RestTempleteConfig {
	
	@Bean
	public RestTemplate restTemlate(RestTemplateBuilder builderTemplate) {
		return builderTemplate.build();
		
	}
	
}
