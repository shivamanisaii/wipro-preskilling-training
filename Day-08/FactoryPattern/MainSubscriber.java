package com.wipro.Day_eight;

public class MainSubscriber{
    public static void main(String[] args) {
        Subscribers user1 = new User1("Shiva Mani Sai");
        Subscribers user2 = new User1("Harshini");

        Subscribers users[] = { user1, user2 };
        YoutubeApp app = new YoutubeApp(users);
        
        app.notifyUserService("Check out the new video ");
    }
}