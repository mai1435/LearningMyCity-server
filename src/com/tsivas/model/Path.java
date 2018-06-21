package com.tsivas.model;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.google.appengine.api.datastore.Key;

/**
 * A simple object to represent a Path.
 */
@Entity
public class Path {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Key id;
	
	private String pathName;
	private String pathId;
	private String pathDescription;

	@OneToMany(cascade = CascadeType.ALL)
	private ArrayList<Quest> quests;
	@OneToMany(cascade = CascadeType.ALL)
	private ArrayList<Task> tasks;
	@OneToMany(cascade = CascadeType.ALL)
	private ArrayList<Question> questions;
	@OneToMany(cascade = CascadeType.ALL)
	private ArrayList<Alternative> alternatives;
	@OneToMany(cascade = CascadeType.ALL)
	private ArrayList<Hint> hints;

	public Path() {
	};

	public Path(String pathName, String pathId, String pathDescription,
			ArrayList<Quest> quests, ArrayList<Task> tasks,
			ArrayList<Question> questions, ArrayList<Alternative> alternatives,
			ArrayList<Hint> hints) {
		super();
		this.pathName = pathName;
		this.pathId = pathId;
		this.pathDescription = pathDescription;
		this.quests = quests;
		this.tasks = tasks;
		this.questions = questions;
		this.alternatives = alternatives;
		this.hints = hints;
	}

	public String getPathName() {
		return pathName;
	}

	public String getPathId() {
		return pathId;
	}

	public String getPathDescription() {
		return pathDescription;
	}

	public ArrayList<Quest> getQuests() {
		return quests;
	}

	public ArrayList<Task> getTasks() {
		return tasks;
	}

	public ArrayList<Question> getQuestions() {
		return questions;
	}

	public ArrayList<Alternative> getAlternatives() {
		return alternatives;
	}

	public ArrayList<Hint> getHints() {
		return hints;
	}

	public void setPathName(String pathName) {
		this.pathName = pathName;
	}

	public void setPathId(String pathId) {
		this.pathId = pathId;
	}

	public void setPathDescription(String pathDescription) {
		this.pathDescription = pathDescription;
	}

	public void setQuests(ArrayList<Quest> quests) {
		this.quests = quests;
	}

	public void setTasks(ArrayList<Task> tasks) {
		this.tasks = tasks;
	}

	public void setQuestions(ArrayList<Question> questions) {
		this.questions = questions;
	}

	public void setAlternatives(ArrayList<Alternative> alternatives) {
		this.alternatives = alternatives;
	}

	public void setHints(ArrayList<Hint> hints) {
		this.hints = hints;
	}
	
	public Key getId() {
		return id;
	}

	public void setId(Key id) {
		this.id = id;
	}
}
