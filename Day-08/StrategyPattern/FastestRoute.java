package com.wipro.Day_eight;

class FastestRoute implements RouteStrategy {
    public void buildRoute(String start, String end) {
        System.out.println("Calculating Fastest Route from " + start + " to " + end + " (Considering Traffic)");
    }
}

class ShortestRoute implements RouteStrategy {
    public void buildRoute(String start, String end) {
        System.out.println("Calculating Shortest Route from " + start + " to " + end + " (Minimum Distance)");
    }
}

class AvoidTollsRoute implements RouteStrategy {
    public void buildRoute(String start, String end) {
        System.out.println("Calculating Route from " + start + " to " + end + " (Avoiding all Toll Plazas)");
    }
}