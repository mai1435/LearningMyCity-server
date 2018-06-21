package com.tsivas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.google.appengine.api.datastore.Key;

/**
 * A simple object to represent a score.
 */
@Entity
public class Score {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Key id;
	
	private String pathId;
	private String userName;
	private String score;
	private String date;

	public Score() {
	}

	public Score(String pathId, String userName, String score, String date) {
		super();
		this.pathId = pathId;
		this.userName = userName;
		this.score = score;
		this.date = date;
	}

	public String getPathId() {
		return pathId;
	}

	public String getUserName() {
		return userName;
	}

	public String getScore() {
		return score;
	}

	public void setPathId(String pathId) {
		this.pathId = pathId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public Key getId() {
		return id;
	}

	public void setId(Key id) {
		this.id = id;
	}
}
