package com.wipro.Day_eight;

class EmailNotification implements Notification {
    public void sendNotification(String message) {
        System.out.println("Sending Email: " + message);
    }
}

class SMSNotification implements Notification {
    public void sendNotification(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

class PushNotification implements Notification {
    public void sendNotification(String message) {
        System.out.println("Sending Notification: " + message);
    }
}