package oc.oose;

import java.util.List;

public class TaskList {

	private String name;
	private List<Task> tasks;

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public List<Task> getTasks() {
		return this.tasks;
	}

	/**
	 * 
	 * @param tasks
	 */
	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

}