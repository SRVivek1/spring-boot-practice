package viveksingh.restful.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import viveksingh.restful.beans.Post;

@Component
public class PostDaoService {

	/**
	 * Post DB repository.
	 */
	private static final List<Post> posts = new ArrayList<>();

	private static int postCounter = 0;

	static {
		posts.add(new Post(1, 1, "User-1, Post-1"));
		posts.add(new Post(1, 2, "User-1, Post-2"));

		posts.add(new Post(2, 3, "User-2, Post-1"));
		posts.add(new Post(2, 4, "User-2, Post-2"));

		posts.add(new Post(3, 5, "User-3, Post-1"));
		posts.add(new Post(3, 6, "User-3, Post-2"));

		postCounter = 6;

	}

	// - Retrieve all posts of a user
	/**
	 * Get all the posts of user with specified userId.
	 * 
	 * @param userId
	 * @return
	 */
	public List<Post> retrieveAllPosts(int userId) {
		return posts.stream().filter(post -> post.getUserId() == userId).collect(Collectors.toList());
	}

	// - Retrieve a post for a user
	/**
	 * Get the posts with provided postId for user with specified userId.
	 * 
	 * @param userId
	 * @param postId
	 * @return
	 */
	public List<Post> retrievePost(int userId, long postId) {

		return posts.parallelStream().filter(post -> post.getId() == postId && post.getUserId() == userId)
				.collect(Collectors.toList());
	}

	// - Create a post for a user
	/**
	 * Create a post for provided user.
	 * 
	 * @param userId
	 * @param post
	 * @return
	 */
	public Post createPost(final int userId, final Post post) {

		post.setUserId(userId);
		post.setId(++postCounter);
		post.setCreated(new Date());

		return (posts.add(post)) ? post : null;
	}

}
