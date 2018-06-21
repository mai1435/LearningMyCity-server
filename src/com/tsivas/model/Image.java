package com.tsivas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Text;


/**
 * A simple object to represent an Image.
 */
@Entity
public class Image {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Key id;
	
	private String imageName;
	private String pathId;
	private String imageId;
	private Text imageString;

	public Image() {
	};

	public Image(String pathId, String imageName, String imageId,
			Text imageString) {
		super();
		this.pathId = pathId;
		this.imageName = imageName;
		this.imageId = imageId;
		this.imageString = imageString;
	}

	public String getImageName() {
		return imageName;
	}

	public String getImageId() {
		return imageId;
	}

	public Text getImageString() {
		return imageString;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public void setImageString(Text imageString) {
		this.imageString = imageString;
	}

	public String getPathId() {
		return pathId;
	}

	public void setPathId(String pathId) {
		this.pathId = pathId;
	}

	public Key getId() {
		return id;
	}

	public void setId(Key id) {
		this.id = id;
	}
}
