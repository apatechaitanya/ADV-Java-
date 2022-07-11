package com.cdac.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name="tbl_album")
public class Album {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String name;
		private LocalDate releaseDate;
		private String copyright;
		
		@OneToMany(mappedBy = "album")
		private List<Song> song;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public LocalDate getReleaseDate() {
			return releaseDate;
		}

		public void setReleaseDate(LocalDate releaseDate) {
			this.releaseDate = releaseDate;
		}

		public String getCopyright() {
			return copyright;
		}

		public void setCopyright(String copyright) {
			this.copyright = copyright;
		}

		public List<Song> getSong() {
			return song;
		}

		public void setSong(List<Song> song) {
			this.song = song;
		}
		
		
}	
