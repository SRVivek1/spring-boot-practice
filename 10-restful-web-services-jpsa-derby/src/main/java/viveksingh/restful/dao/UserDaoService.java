/**
 * 
 */
package viveksingh.restful.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import viveksingh.restful.bean.User;

/**
 * @author vivek_xz2hujv
 *
 */
@Service
public class UserDaoService {

	private static int userIdCounter = 0;

	@Autowired
	private UserRepository userRepository;

	/**
	 * Retrieve all users.
	 * 
	 * @return
	 */
	public List<User> retrieveUsers() {

		List<User> users = new ArrayList<>();

		System.out.println("userRepository : " + userRepository);

		userRepository.findAll().forEach(users::add);

		return users;
	}

	/**
	 * Create a new User.
	 * 
	 * @param user
	 * @return
	 */
	public User createUser(final User user) {

		user.setId("" + (++userIdCounter));

		userRepository.save(user);

		final Optional<User> optional = userRepository.findById(user.getId());

		return (optional != null) ? optional.get() : null;
	}

}
