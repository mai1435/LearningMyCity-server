package com.tsivas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.google.appengine.api.datastore.Key;

/**
 * A simple object to represent a Question.
 */
@Entity
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Key id;
	
	private String questionQuestion;
	private String questionSolution;
	private String taskId;

	public Question() {
	};

	public Question(String questionQuestion, String questionSolution,
			String taskId) {
		super();
		this.questionQuestion = questionQuestion;
		this.questionSolution = questionSolution;
		this.taskId = taskId;
	}

	public String getQuestionQuestion() {
		return questionQuestion;
	}

	public String getQuestionSolution() {
		return questionSolution;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setQuestionQuestion(String questionQuestion) {
		this.questionQuestion = questionQuestion;
	}

	public void setQuestionSolution(String questionSolution) {
		this.questionSolution = questionSolution;
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
