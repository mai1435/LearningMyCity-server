package com.tsivas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.google.appengine.api.datastore.Key;

/**
 * A simple object to represent a Hint.
 */
@Entity
public class Hint {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Key id;

	private String hintDescription;
	private String taskId;
	private String hintPenalty;
	private String hintImageId;

	public Hint() {
	};

	public Hint(String hintDescription, String taskId, String hintPenalty,
			String hintImageId) {
		super();
		this.hintDescription = hintDescription;
		this.taskId = taskId;
		this.hintPenalty = hintPenalty;
		this.hintImageId = hintImageId;
	}

	public String getHintDescription() {
		return hintDescription;
	}

	public String getTaskId() {
		return taskId;
	}

	public String getHintPenalty() {
		return hintPenalty;
	}

	public String getHintImageId() {
		return hintImageId;
	}

	public void setHintDescription(String hintDescription) {
		this.hintDescription = hintDescription;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public void setHintPenalty(String hintPenalty) {
		this.hintPenalty = hintPenalty;
	}

	public void setHintImageId(String hintImageId) {
		this.hintImageId = hintImageId;
	}

	public Key getId() {
		return id;
	}

	public void setId(Key id) {
		this.id = id;
	}
}
