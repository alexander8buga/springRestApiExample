package guru.springframework.springrestclientexamples.service;

import java.util.List;

import guru.springframework.api.domain.User;

/**
 * 
 * @author ab 
 * Created on 01/09/18
 *
 */
public interface ApiService {
	
	List<User> getUsers(Integer limit);

}
