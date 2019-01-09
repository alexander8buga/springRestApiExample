package guru.springframework.springrestclientexamples.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import guru.springframework.api.domain.User;
import guru.springframework.springrestclientexamples.service.ApiService;

/**
 * 
 * @author ab 
 * Created on 01/09/18
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest {
	
	@Autowired
	ApiService apiService;
	
	@Before
	public void setUp() throws Exception {}
	
	@Test
	public void getUsers() throws Exception{
		
		List<User> users = apiService.getUsers(1);
		assertEquals(2, users.size());
	}
	

}
