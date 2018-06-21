package com.tsivas.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tsivas.client.PathSvcApi;
import com.tsivas.model.Path;
import com.tsivas.repository.Dao;

//Tell Spring that this class is a Controller that should 
//handle certain HTTP requests for the DispatcherServlet
@Controller
public class PathController implements PathSvcApi {

	public static final String PATH_SVC_PATH = "/path";
	public static final String PATH_LIST_SVC_PATH = PATH_SVC_PATH + "/getAll";

	// Receives GET requests to /path?pathId=1 and returns the current
	// path with the selected pathId from Google Data Store. Spring
	// automatically converts
	// the path to JSON because of the @ResponseBody annotation.
	@RequestMapping(method = RequestMethod.GET, value = { PATH_SVC_PATH })
	public @ResponseBody Path getPath(
			@RequestParam(value = "pathId", defaultValue = "1") String pathId) {
		return Dao.INSTANCE.getPath(pathId);
	}

	// Receives GET requests to /path/getAll and returns the current
	// list of paths from Google Data Store. Spring automatically converts
	// the list of paths to JSON because of the @ResponseBody
	// annotation.
	@RequestMapping(method = RequestMethod.GET, value = { PATH_LIST_SVC_PATH })
	public @ResponseBody List<Path> getPathList() {
		return Dao.INSTANCE.getPaths();
	}

	// Receives POST requests to /path and adds a path in Google Data Store.
	@RequestMapping(method = RequestMethod.POST, value = { PATH_SVC_PATH })
	public @ResponseBody boolean addPath(@RequestBody Path p) {
		Dao.INSTANCE.addPath(p.getPathName(), p.getPathId(),
				p.getPathDescription(), p.getQuests(), p.getTasks(),
				p.getQuestions(), p.getAlternatives(), p.getHints());
		return true;
	}

}