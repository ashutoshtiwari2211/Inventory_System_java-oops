package com.javaoo.store;

import java.util.Date;

public class ClassicalCD extends Item{
	private String composer;
	private String performers[] = new String[5];
	private String recordingLocation;
	private Date releaseDate;
	private int performersCount=0;
	public String getComposer() {
		return composer;
	}
	
	public ClassicalCD(String title, double price, int quantity, String composer, String[] performers, String recordingLocation, Date releaseDate) {
		super(title, price, quantity);
		setComposer(composer);
		for(int i=0; i<performers.length; i++) {
			addPerformer(performers[i]);
		}
		setRecordingLocation(recordingLocation);
		setReleaseDate(releaseDate);
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}
	public String getRecordingLocation() {
		return recordingLocation;
	}
	public void setRecordingLocation(String recordingLocation) {
		this.recordingLocation = recordingLocation;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	public void addPerformer(String performer) {
		if(performersCount == performers.length)
			System.out.println("No more Performers will allowed to add");
		else {
			performers[performersCount++] = performer;
		}
	}
	public void showPerformers() {
		for(int i=0; i<=performersCount; i++)
			System.out.println(performers[i]);
	}
	

}
