package com.javaex.oop.song.v2;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;

	public Song() {
		// TODO Auto-generated constructor stub
	}
	
	public Song(String artist, String title, String album,
			int year, int track, String composer) {
		this.artist = artist;
		this.title = title;
		this.album = album;
		this.year = year;
		this.track = track;
		this.composer = composer;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public String getAlbum() {
		return album;
	}
	
	public String getComposer() {
		return composer;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getTrack() {
		return track;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public void setAlbum(String album) {
		this.album = album;
	}
	
	public void setComposer(String composer) {
		this.composer = composer;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setTrack(int track) {
		this.track = track;
	}
	
	public void showInfo() {
		System.out.printf("%s, %s ( %s, %d, %d번 track, %s 작곡 )\n",
				artist, title, album, year, track, composer);
	}
}
