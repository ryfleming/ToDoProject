package ToDoProject;

public interface TaskRepo {

	/**
	 * 
	 * @param date
	 */
	List<Task> findByDate(Date date);

	/**
	 * 
	 * @param userID
	 */
	List<Task> findByUserID(Long userID);

	/**
	 * 
	 * @param username
	 */
	List findByUserName(String username);

}