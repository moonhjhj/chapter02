package com.javaex.ex03;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;

	/*
	 * public Song(String artist, String title, String album, int year, int track,
	 * String composer) { this.title = title; this.artist = artist; this.album =
	 * album; this.year = year; this.track = track; this.composer = composer; }
	 */

	public void setTitle(String title) {
		this.title = title;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public void setCompower(String composer) {
		this.composer = composer;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setTrack(int track) {
		this.track = track;
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

	public void showInfo() {
		System.out.println(
				artist + ", " + title + "(" + album + ", " + year + ", " + track + "번 트랙, " + composer + " 작곡" + ")");
	}

}
