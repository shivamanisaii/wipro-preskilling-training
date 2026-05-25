package Day-04.InterfacePrograms;

public class Camera {

    public static void main(String[] args) {

        Cameraa cam = new Smartphone();
        MusicPlayer mus = new Smartphone();

        cam.takePhoto();
        mus.playMusic();
    }
}

interface Cameraa {

    void takePhoto();
}

interface MusicPlayer {

    void playMusic();
}

class Smartphone implements Cameraa, MusicPlayer {

    public void playMusic() {
        System.out.println("Music is playing");
    }

    public void takePhoto() {
        System.out.println("Photo is Captured");
    }
}
