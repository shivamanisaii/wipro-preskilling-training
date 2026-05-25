package com.wipro.Day_eight;
interface Subscribers {
    void updates(String message);
}

class User1 implements Subscribers {
    String name;

    public User1(String name) {
        this.name = name;
    }

    public void updates(String message) {
        System.out.println(name + " - " + message);
    }
}

class User2 implements Subscribers {
    String name;

    public User2(String name) {
        this.name = name;
    }

    public void updates(String message) {
        System.out.println(name + " - " + message);
    }
}

class YoutubeApp {
    Subscribers users[];

    public YoutubeApp(Subscribers users[]) {
        this.users = users;
    }

    public void notifyUserService(String msg) {
        for (Subscribers user : users) {
            user.updates(msg);
        }
    }
}

