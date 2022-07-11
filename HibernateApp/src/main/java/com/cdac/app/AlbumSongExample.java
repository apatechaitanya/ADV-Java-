package com.cdac.app;

import java.time.LocalDate;
import java.util.List;

import com.cdac.dao.GenericDao;
import com.cdac.entity.Album;
import com.cdac.entity.Song;

public class AlbumSongExample {

	public static void main(String[] args) {
		// TODO add album
		AlbumSongDao albumSongDao = new AlbumSongDao();
		// GenericDao genericDao = new GenericDao();
		/*
		Album album = new Album();
		album.setName("Hits of BTS");
		album.setReleaseDate(LocalDate.of(2020,11,04));
		album.setCopyright("BTS Corporation");
		genericDao.save(album);
		*/
		/*
		Album album = (Album) genericDao.fetchById(Album.class, 1);
		Song song = new  Song();
		song.setTitle("Dynamite");
		song.setArtist("Chang");
		song.setDuration(4.40);
		song.setAlbum(album);
		genericDao.save(song);
		*/
		
		/*
		Album album = new Album();
		album.setName("Top 10 hits");
		album.setReleaseDate(LocalDate.of(2020,11,04));
		album.setCopyright("T Series Corporation");
		genericDao.save(album);
		*/
		/*
		Album album = (Album) genericDao.fetchById(Album.class, 2);
		Song song = new Song();
		song.setTitle("MNO");
		song.setArtist("Taylor Swift");
		song.setDuration(3.45);
		song.setAlbum(album);
		
		genericDao.save(song);
		*/
		
		// adding song to existing album
		/*
		Album album = (Album) genericDao.fetchById(Album.class, 2);
		Song song = new Song();
		song.setTitle("Blank space");
		song.setArtist("Taylor Swift");
		song.setDuration(5.05);
		song.setAlbum(album);
		genericDao.save(song);
		
		*/
		
		List<Song> songs = albumSongDao.fetchSongByArtist("BTS");
		for(Song song:songs)
			System.out.println(song.getArtist() + " "+song.getTitle()+" "+song.getDuration());
		
	}

}
