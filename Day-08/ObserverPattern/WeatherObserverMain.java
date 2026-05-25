package com.wipro.Day_eight;
public class WeatherObserverMain {
    public static void main(String[] args) {
        
        WheatherDisplay device1 = new MobileApp("Shiva's iPhone");
        WheatherDisplay device2 = new LEDDisplay("Church Street");

        WheatherDisplay devices[] = { device1, device2};
        
        WeatherStation station = new WeatherStation(devices);
        
        station.notifyDisplays("Rain expected in 10 minutes!");
    }
}