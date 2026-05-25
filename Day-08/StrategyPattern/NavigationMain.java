package com.wipro.Day_eight;

public class NavigationMain {
    public static void main(String[] args) {
        NavigationContext googleMaps = new NavigationContext();

        System.out.println(" User selects Fastest" );
        googleMaps.setRouteStrategy(new FastestRoute());
        googleMaps.navigate("Hyderabad", "Bangalore");

        System.out.println("\n User changes to Avoid Tolls");
        googleMaps.setRouteStrategy(new AvoidTollsRoute());
        googleMaps.navigate("Hyderabad", "Bangalore");
        
        System.out.println("\n User changes to Shortest Route");
        googleMaps.setRouteStrategy(new ShortestRoute());
        googleMaps.navigate("Hyderabad", "Bangalore");
    }
}
