package com.tsivas.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tsivas.client.ScoreSvcApi;
import com.tsivas.model.Score;
import com.tsivas.repository.Dao;

//Tell Spring that this class is a Controller that should 
//handle certain HTTP requests for the DispatcherServlet
@Controller
public class ScoreController implements ScoreSvcApi {

	public static final String SCORE_SVC_PATH = "/score";
	public static final String SCORE_LIST_SVC_PATH = SCORE_SVC_PATH + "/getAll";
	public static final String SCORE_PATHID_SEARCH_PATH = SCORE_SVC_PATH
			+ "/search/findByPathId";

	// Receives GET requests to /score/getAll and returns the current
	// list of scores from Google Data Store. Spring automatically converts
	// the list of scores to JSON because of the @ResponseBody
	// annotation.
	@RequestMapping(method = RequestMethod.GET, value = { SCORE_LIST_SVC_PATH })
	public @ResponseBody List<Score> getScores() {
		return Dao.INSTANCE.getScores();
	}

	// Receives POST requests to /score and adds a score in Google Data Store.
	@RequestMapping(method = RequestMethod.POST, value = { SCORE_SVC_PATH })
	public @ResponseBody boolean addScore(@RequestBody Score s) {
		Dao.INSTANCE.addScore(s.getPathId(), s.getUserName(), s.getScore(),
				s.getDate());
		return true;
	}

	// Receives GET requests to /score/search/findByPathId and returns the
	// current list of scores with the given pathId from Google Data Store.
	// Spring
	// automatically
	// converts the list of scores to JSON because of the @ResponseBody
	// annotation.
	@RequestMapping(method = RequestMethod.GET, value = { SCORE_PATHID_SEARCH_PATH })
	public @ResponseBody List<Score> getScoresByPathId(
			@RequestParam(value = "pathId", defaultValue = "1") String pathId) {
		return Dao.INSTANCE.getScoresByPathId(pathId);

	}

}
