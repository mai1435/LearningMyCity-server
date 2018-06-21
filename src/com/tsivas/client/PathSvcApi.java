package com.tsivas.client;

import java.util.List;

import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;

import com.tsivas.model.Path;

/**
 * This interface defines an API for a PathController. The interface is used to
 * provide a contract for client/server interactions.
 */
public interface PathSvcApi {

	public static final String PATH_SVC_PATH = "/path";
	public static final String PATH_LIST_SVC_PATH = PATH_SVC_PATH + "/getAll";

	@GET(PATH_LIST_SVC_PATH)
	public List<Path> getPathList();

	@GET(PATH_SVC_PATH)
	public Path getPath(String pathId);

	@POST(PATH_SVC_PATH)
	public boolean addPath(@Body Path p);

}
