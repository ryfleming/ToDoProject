package oc.oose;

import java.util.Date;
import java.util.List;

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
	List<Task> findByUserName(String username);

}