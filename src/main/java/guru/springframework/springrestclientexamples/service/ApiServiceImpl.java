package guru.springframework.springrestclientexamples.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import guru.springframework.api.domain.User;
import guru.springframework.api.domain.UserData;

/**
 * 
 * @author ab 
 * Created on 01/09/18
 *
 */
@Service
public class ApiServiceImpl implements ApiService {
	
	private RestTemplate restTemplate;
	
	public ApiServiceImpl(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
		
	}
	

	@Override
	public List<User> getUsers(Integer limit) {
		
		// UserData.class tells what type of data we want to bind to 
		UserData userData = restTemplate.getForObject("http://www.apifaketory.com/api/user?limit="+limit, UserData.class);
		
		return userData.getData();
	}
	

}
