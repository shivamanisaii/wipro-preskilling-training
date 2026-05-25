package com.wipro.Day_seven;

public class Movie {
    private String title;
    private String genre;

    public Movie(){
    	
    }

    public String getTitle(){
    	return title; 
    }
    public void setTitle(String title){
    	this.title = title; 
    }

    public String getGenre(){ 
    	return genre; 
    }
    public void setGenre(String genre){ 
    	this.genre = genre; 
    }

    @Override
    public String toString() {
        return "Movie [title=" + title + ", genre=" + genre + "]";
    }
}