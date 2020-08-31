package execution;

import definitions.Video;

public class Main {
    public static void main(String[] args) {
        Video video = new Video();
        video.setVideoName("Baahubali: The Begining");
        video.setRating(5);
        video.setCheckOut(false);
        System.out.println(
                "Video Name: " + video.getVideoName() + "," +
                        "Video Rating: " + video.getRating() + "," +
                        "Is Video Available: " + video.isCheckOut() + "."
        );
    }
}
