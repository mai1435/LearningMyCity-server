package com.tsivas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Text;

/**
 * A simple object to represent a Task.
 */
@Entity
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Key id;
	
	private Text taskDescription;
	private String taskCompleted;
	private String taskImageID;
	private String taskType;
	private String taskPenalty;
	private String taskWrongAnswers;
	private String questId;
	private String latitude;
	private String longitude;
	private String radius;

	public Task() {
	};

	public Task(Text taskDescription, String taskCompleted,
			String taskImageID, String taskType, String taskPenalty,
			String taskWrongAnswers, String questId, String latitude,
			String longitude, String radius) {
		super();
		this.taskDescription = taskDescription;
		this.taskCompleted = taskCompleted;
		this.taskImageID = taskImageID;
		this.taskType = taskType;
		this.taskPenalty = taskPenalty;
		this.taskWrongAnswers = taskWrongAnswers;
		this.questId = questId;
		this.latitude = latitude;
		this.longitude = longitude;
		this.radius = radius;
	}

	public Text getTaskDescription() {
		return taskDescription;
	}

	public String getTaskCompleted() {
		return taskCompleted;
	}

	public String getTaskImageID() {
		return taskImageID;
	}

	public String getTaskType() {
		return taskType;
	}

	public String getTaskPenalty() {
		return taskPenalty;
	}

	public String getTaskWrongAnswers() {
		return taskWrongAnswers;
	}

	public String getQuestId() {
		return questId;
	}

	public String getLatitude() {
		return latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public String getRadius() {
		return radius;
	}

	public void setTaskDescription(Text taskDescription) {
		this.taskDescription = taskDescription;
	}

	public void setTaskCompleted(String taskCompleted) {
		this.taskCompleted = taskCompleted;
	}

	public void setTaskImageID(String taskImageID) {
		this.taskImageID = taskImageID;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public void setTaskPenalty(String taskPenalty) {
		this.taskPenalty = taskPenalty;
	}

	public void setTaskWrongAnswers(String taskWrongAnswers) {
		this.taskWrongAnswers = taskWrongAnswers;
	}

	public void setQuestId(String questId) {
		this.questId = questId;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public void setRadius(String radius) {
		this.radius = radius;
	}

	public Key getId() {
		return id;
	}

	public void setId(Key id) {
		this.id = id;
	}
}
