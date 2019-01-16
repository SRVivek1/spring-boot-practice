/**
 * 
 */
package viveksingh.restful.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import viveksingh.restful.beans.User;

/**
 * @author vivek_xz2hujv
 *
 */
@Component
public class UserDaoService {

	// Users List.
	private static List<User> users = new ArrayList<>();

	// user count
	private static int userCount = 3;

	// initialize dummy users
	static {
		users.add(new User(1, "Adam", new Date()));
		users.add(new User(2, "Eve", new Date()));
		users.add(new User(3, "jack", new Date()));
	}

	// List of all users
	public List<User> findAll() {
		return users;
	}

	// find user with specified id.
	public User findOne(int id) {

		final Optional<User> optional = users.stream().filter(user -> user.getId() == id).findFirst();

		return optional.isPresent() ? optional.get() : null;
	}

	// Save a new user
	public User save(User user) {

		if (user.getId() == null) {
			user.setId(++userCount);
		}

		users.add(user);

		return user;
	}

	/**
	 * Delete user with specified ID.
	 * 
	 * @param id
	 */
	public User deleteUser(int id) {

		final Optional<User> optional = users.parallelStream().filter(user -> user.getId() == id).findFirst();
		final User user = (optional != null) ? optional.get() : null;

		if (user != null) {
			users.remove(user);
		}
		return user;

	}
}
