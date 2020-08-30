package execution;

import definitions.Video;

public class Main {
    public static void main(String[] args) {
        Video video = new Video();
        System.out.println(
                "Video Name: " + video.getVideoName() + "," +
                        "Video Rating: " + video.getRating() + "," +
                        "Is Video Available: " + video.isCheckOut() + "."
        );
    }
}
