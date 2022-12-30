package adapterPattern;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "tere bina.mp3");
        audioPlayer.play("mp4", "dil kyun yeh mera.mp4");
        audioPlayer.play("vlc", "ajab si.vlc");
        audioPlayer.play("avi", "halka halka.avi");
    }
}