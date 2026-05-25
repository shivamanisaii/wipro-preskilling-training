package com.wipro.Day_seven;

import java.util.*;

public class MovieWatchlist {
    public static void main(String[] args) {
        List<Movie> watchlist = new ArrayList<Movie>();

        Movie m1 = new Movie();
        m1.setTitle("Your Lie in April");
        m1.setGenre("Anime");

        Movie m2 = new Movie();
        m2.setTitle("The Dark Knight");
        m2.setGenre("Action");

        Movie m3 = new Movie();
        m3.setTitle("Interstellar");
        m3.setGenre("Sci-Fi");

        Movie m4 = new Movie();
        m4.setTitle("Catch me if you can");
        m4.setGenre("Drama");
        
        Movie m5 = new Movie();
        m5.setTitle("Inception");
        m5.setGenre("Sci-Fi");
        
        Movie m6= new Movie();
        m6.setTitle("Ghosted");
        m6.setGenre("Drama");

        watchlist.add(m1);
        watchlist.add(m2);
        watchlist.add(m3);
        watchlist.add(m4);
        watchlist.add(m5);
        watchlist.add(m6);

        System.out.println("Current Watchlist:");
        for (Movie obj : watchlist) {
            System.out.println("\nTitle: " + obj.getTitle() + "\nGenre: " + obj.getGenre()+"\n______________________________");
        }

        String searchName = "Interstellar";
        boolean found = false;

        System.out.println("\nSearching for: " + searchName);
        for (Movie obj : watchlist) {
            if (obj.getTitle().equalsIgnoreCase(searchName)) {
                System.out.println("Found! your movie : " + obj.getTitle() + " [" + obj.getGenre() + "]"+"\n______________________________");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Movie not found in your watchlist.");
        }
    }
}