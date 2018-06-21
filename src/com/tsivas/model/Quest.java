package com.tsivas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Text;

/**
 * A simple object to represent a Quest.
 */
@Entity
public class Quest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Key id;
	
	private String questName;
	private String questImageID;
	private Text questDescription;
	private String questId;
	private String latitude;
	private String longitude;
	private String pathId;
	private String questCompleted;

	public Quest() {
	};

	public Quest(String questName, String questImageID,
			Text questDescription, String questId, String latitude,
			String longitude, String pathId, String questCompleted) {
		super();
		this.questName = questName;
		this.questImageID = questImageID;
		this.questDescription = questDescription;
		this.questId = questId;
		this.latitude = latitude;
		this.longitude = longitude;
		this.pathId = pathId;
		this.questCompleted = questCompleted;
	}

	public String getQuestName() {
		return questName;
	}

	public String getQuestImageID() {
		return questImageID;
	}

	public Text getQuestDescription() {
		return questDescription;
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

	public String getPathId() {
		return pathId;
	}

	public String getQuestCompleted() {
		return questCompleted;
	}

	public void setQuestName(String questName) {
		this.questName = questName;
	}

	public void setQuestImageID(String questImageID) {
		this.questImageID = questImageID;
	}

	public void setQuestDescription(Text questDescription) {
		this.questDescription = questDescription;
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

	public void setPathId(String pathId) {
		this.pathId = pathId;
	}

	public void setQuestCompleted(String questCompleted) {
		this.questCompleted = questCompleted;
	}
	
	public Key getId() {
		return id;
	}

	public void setId(Key id) {
		this.id = id;
	}
}
