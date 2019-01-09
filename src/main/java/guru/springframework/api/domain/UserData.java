package guru.springframework.api.domain;

import java.util.List;

/**
 * 
 * @author ab 
 * Created on 01/09/18
 *
 */
public class UserData {
	
	List<User> data;

	public List<User> getData() {
		return data;
	}

	public void setData(List<User> data) {
		this.data = data;
	}
	

}
