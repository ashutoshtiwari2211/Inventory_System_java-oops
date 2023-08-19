package com.javaoo.store;

import java.util.Date;

public class CD extends Item{
	private Artist artist;
	private Date date;
	
	public CD(String title, double price, int quantity, Artist artist, Date releaseDate) {
		super(title, price, quantity);
		setArtist(artist);
		setDate(releaseDate);
	}
	public Artist getArtist() {
		return artist;
	}
	public void setArtist(Artist artist) {
		this.artist = artist;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

}
