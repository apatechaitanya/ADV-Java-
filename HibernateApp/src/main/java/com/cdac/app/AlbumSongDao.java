package com.cdac.app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cdac.dao.GenericDao;
import com.cdac.entity.Song;

public class AlbumSongDao extends GenericDao {
		public List<Song> fetchSongByArtist(String artist){
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("learning-hibernate");
			try {
			EntityManager em = emf.createEntityManager();
			Query query = em.createQuery("select s from Song s where s.artist= :artist");
			query.setParameter("artist", artist);
			List<Song> list = query.getResultList();
			return list;
			}finally {
				emf.close();
			}

		}
}
