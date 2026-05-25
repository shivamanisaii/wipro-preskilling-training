package com.wipro.Day_eight;

interface WheatherDisplay {
    void updates(String message);
}

class MobileApp implements WheatherDisplay {
    String name;

    public MobileApp(String name) {
        this.name = name;
    }

    public void updates(String message) {
        System.out.println("Mobile App (" + name + ") - " + message);
    }
}

class LEDDisplay implements WheatherDisplay {
    String location;

    public LEDDisplay(String location) {
        this.location = location;
    }

    public void updates(String message) {
        System.out.println("LED Display at " + location + " - " + message);
    }
}

class WeatherStation {
    WheatherDisplay displays[];

    public WeatherStation(WheatherDisplay displays[]) {
        this.displays = displays;
    }

    public void notifyDisplays(String msg) {
        for (WheatherDisplay display : displays) {
            display.updates(msg);
        }
    }
}