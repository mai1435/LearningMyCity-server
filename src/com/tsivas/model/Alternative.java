package com.tsivas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.google.appengine.api.datastore.Key;

/**
 * A simple object to represent an Alternative.
 */
@Entity
public class Alternative {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Key id;

	private String alternativeAlternative;
	private String taskId;

	public Alternative() {
	};

	public Alternative(String alternativeAlternative, String taskId) {
		super();
		this.alternativeAlternative = alternativeAlternative;
		this.taskId = taskId;
	}

	public String getAlternativeAlternative() {
		return alternativeAlternative;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setAlternativeAlternative(String alternativeAlternative) {
		this.alternativeAlternative = alternativeAlternative;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public Key getId() {
		return id;
	}

	public void setId(Key id) {
		this.id = id;
	}
}
