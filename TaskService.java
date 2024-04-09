package ToDoProject;

public interface TaskService {

	/**
	 * 
	 * @param task
	 */
	Task createTask(Task task);

	/**
	 * 
	 * @param taskId
	 */
	void deleteTask(Long taskId);

	/**
	 * 
	 * @param id
	 * @param task
	 * @param Task
	 */
	Task updateTask(int id, Long task, int Task);

	List<Task> getAllTasks();

}