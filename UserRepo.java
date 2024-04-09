package ToDoProject;

public interface UserRepo {

	/**
	 * 
	 * @param email
	 */
	User findByUserEmail(String email);

	/**
	 * 
	 * @param id
	 */
	User findByUserID(Long id);

	/**
	 * 
	 * @param username
	 */
	User findByUserName(String username);

}