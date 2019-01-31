/**
 * 
 */
package viveksingh.restful.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import viveksingh.restful.bean.User;
import viveksingh.restful.dao.UserDaoService;

/**
 * @author vivek_xz2hujv
 *
 */
@RestController
public class UserService {

	@Autowired
	private UserDaoService userDaoService;

	/**
	 * Get all the users.
	 * 
	 * @return
	 */
	@GetMapping(value = "/users")
	public List<User> getUsers() {
		return userDaoService.retrieveUsers();
		
	}
	
	/**
	 * Create a new User.
	 * @param user
	 * @return
	 */
	@PutMapping(value="/users")
	public User createUsers(@RequestBody User user) {
		return userDaoService.createUser(user);
		
	}
}
