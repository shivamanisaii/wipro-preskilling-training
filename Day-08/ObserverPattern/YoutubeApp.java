public class YoutubeApp {

    public static void main(String[] args) {

        Subscribers user1 = new User1("Shiva");

        Subscribers user2 = new User1("Sahith");

        Subscribers users[] = { user1, user2 };

        YoutubeChannel app = new YoutubeChannel(users);

        app.notifyUserService("New video uploaded!");
    }
}

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

class YoutubeChannel {

    Subscribers users[];

    public YoutubeChannel(Subscribers users[]) {

        this.users = users;
    }

    public void notifyUserService(String msg) {

        for(Subscribers user : users) {

            user.updates(msg);
        }
    }
}