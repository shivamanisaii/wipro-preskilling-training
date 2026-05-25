package com.wipro.Day_eight;

public class NavigationContext {
    private RouteStrategy strategy;

    public void setRouteStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void navigate(String start, String end) {
        if (strategy != null) {
            strategy.buildRoute(start, end);
        } else {
            System.out.println("Please select a routing preference first.");
        }
    }
}