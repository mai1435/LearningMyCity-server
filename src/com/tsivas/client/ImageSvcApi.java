package com.tsivas.client;

import java.util.List;

import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;

import com.tsivas.model.Image;

/**
 * This interface defines an API for a ImageController. The interface is used to
 * provide a contract for client/server interactions.
 */
public interface ImageSvcApi {

	public static final String IMAGE_SVC_PATH = "/image";
	public static final String IMAGE_LIST_SVC_PATH = IMAGE_SVC_PATH + "/getAll";
	public static final String IMAGE_PATHID_SEARCH_PATH = IMAGE_SVC_PATH
			+ "/search/findByPathId";

	public static final String PATHID_PARAMETER = "pathId";

	@GET(IMAGE_LIST_SVC_PATH)
	public List<Image> getImages();

	@POST(IMAGE_SVC_PATH)
	public boolean addImage(@Body Image m);

	@GET(IMAGE_PATHID_SEARCH_PATH)
	public List<Image> getImagesByPathId(String pathId);

}
