package oc.oose;

import java.util.Date;

public class Task {

	private Long taskID;
	private String title;
	private String description;
	private Date date;
	private Boolean completed;

	public Long getTaskID() {
		return this.taskID;
	}

	/**
	 * 
	 * @param taskID
	 */
	public void setTaskID(Long taskID) {
		this.taskID = taskID;
	}

	public String getTitle() {
		return this.title;
	}

	/**
	 * 
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return this.description;
	}

	/**
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return this.date;
	}

	/**
	 * 
	 * @param date
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	public Boolean getCompleted() {
		return this.completed;
	}

	/**
	 * 
	 * @param completed
	 */
	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}

}