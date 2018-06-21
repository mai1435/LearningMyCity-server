package com.tsivas.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.google.appengine.api.datastore.Text;
import com.tsivas.model.Alternative;
import com.tsivas.model.Hint;
import com.tsivas.model.Image;
import com.tsivas.model.Path;
import com.tsivas.model.Quest;
import com.tsivas.model.Question;
import com.tsivas.model.Score;
import com.tsivas.model.Task;

public enum Dao {
	INSTANCE;

	@SuppressWarnings("unchecked")
	public List<Score> getScores() {
		EntityManager em = EMFService.get().createEntityManager();
		Query q = em.createQuery("select s from Score s");
		List<Score> scores = q.getResultList();
		return scores;
	}

	public void addScore(String pathId, String userName, String score, String date) {
		synchronized (this) {
			EntityManager em = EMFService.get().createEntityManager();
			Score new_score = new Score(pathId, userName, score, date);
			em.persist(new_score);
			em.close();
		}
	}

	@SuppressWarnings("unchecked")
	public List<Score> getScoresByPathId(String pathId) {
		EntityManager em = EMFService.get().createEntityManager();
		Query q = em
				.createQuery("select s from Score s where s.pathId = :pathId");
		q.setParameter("pathId", pathId);
		List<Score> scores = q.getResultList();
		return scores;
	}

	public void removeScore(long id) {
		EntityManager em = EMFService.get().createEntityManager();
		try {
			Score score = em.find(Score.class, id);
			em.remove(score);
		} finally {
			em.close();
		}
	}
	
	public Path getPath(String pathId) {
		EntityManager em = EMFService.get().createEntityManager();
		Query q = em
				.createQuery("select p from Path p where p.pathId = :pathId");
		q.setParameter("pathId", pathId);
		Path path = (Path) q.getSingleResult();
		return path;
	}
	
	public void addPath(String pathName, String pathId, String pathDescription, ArrayList<Quest> quests, ArrayList<Task> tasks, ArrayList<Question> questions, ArrayList<Alternative> alternatives, ArrayList<Hint> hints) {
		synchronized (this) {
			EntityManager em = EMFService.get().createEntityManager();
			Path new_path = new Path(pathName, pathId, pathDescription, quests, tasks, questions, alternatives, hints);
			em.persist(new_path);
			em.close();
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Path> getPaths() {
		EntityManager em = EMFService.get().createEntityManager();
		Query q = em.createQuery("select p from Path p");
		List<Path> paths = q.getResultList();
		return paths;
	}
	
	@SuppressWarnings("unchecked")
	public List<Image> getImages() {
		EntityManager em = EMFService.get().createEntityManager();
		Query q = em.createQuery("select i from Image i");
		List<Image> images = q.getResultList();
		return images;
	}
	
	public void addImage(String pathId, String imageName, String imageId, Text imageString) {
		synchronized (this) {
			EntityManager em = EMFService.get().createEntityManager();
			Image new_image = new Image(pathId, imageName, imageId, imageString);
			em.persist(new_image);
			em.close();
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Image> geImagesByPathId(String pathId) {
		EntityManager em = EMFService.get().createEntityManager();
		Query q = em
				.createQuery("select i from Image i where i.pathId = :pathId");
		q.setParameter("pathId", pathId);
		List<Image> images = q.getResultList();
		return images;
	}
}
