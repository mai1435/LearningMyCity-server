package com.tsivas.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tsivas.client.ImageSvcApi;
import com.tsivas.model.Image;
import com.tsivas.repository.Dao;

//Tell Spring that this class is a Controller that should 
//handle certain HTTP requests for the DispatcherServlet
@Controller
public class ImageController implements ImageSvcApi {

	public static final String IMAGE_SVC_PATH = "/image";
	public static final String IMAGE_LIST_SVC_PATH = IMAGE_SVC_PATH + "/getAll";
	public static final String IMAGE_PATHID_SEARCH_PATH = IMAGE_SVC_PATH
			+ "/search/findByPathId";

	// Receives GET requests to /image/getAll and returns the current
	// list of images from Google Data Store. Spring automatically converts
	// the list of images to JSON because of the @ResponseBody
	// annotation.
	@RequestMapping(method = RequestMethod.GET, value = { IMAGE_LIST_SVC_PATH })
	public @ResponseBody List<Image> getImages() {
		return Dao.INSTANCE.getImages();
	}

	// Receives POST requests to /image and adds an image in Google Data Store.
	@RequestMapping(method = RequestMethod.POST, value = { IMAGE_SVC_PATH })
	public @ResponseBody boolean addImage(@RequestBody Image m) {
		Dao.INSTANCE.addImage(m.getPathId(), m.getImageName(), m.getImageId(),
				m.getImageString());
		return true;
	}

	// Receives GET requests to /image/search/findByPathId and returns the
	// current list of images with the given pathId from Google Data Store.
	// Spring
	// automatically converts the list of images to JSON because of the
	// @ResponseBody annotation.
	@RequestMapping(method = RequestMethod.GET, value = { IMAGE_PATHID_SEARCH_PATH })
	public @ResponseBody List<Image> getImagesByPathId(
			@RequestParam(value = "pathId", defaultValue = "1") String pathId) {
		return Dao.INSTANCE.geImagesByPathId(pathId);
	}
}