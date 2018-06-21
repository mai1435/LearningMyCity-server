package com.tsivas.client;

import java.util.List;

import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;

import com.tsivas.model.Score;

/**
 * This interface defines an API for a ScoreController. The interface is used to
 * provide a contract for client/server interactions.
 */
public interface ScoreSvcApi {

	public static final String SCORE_SVC_PATH = "/score";
	public static final String SCORE_LIST_SVC_PATH = SCORE_SVC_PATH + "/getAll";
	public static final String SCORE_PATHID_SEARCH_PATH = SCORE_SVC_PATH
			+ "/search/findByPathId";

	@GET(SCORE_SVC_PATH)
	public List<Score> getScores();

	@POST(SCORE_SVC_PATH)
	public boolean addScore(@Body Score s);

	@GET(SCORE_PATHID_SEARCH_PATH)
	public List<Score> getScoresByPathId(String pathId);
}
