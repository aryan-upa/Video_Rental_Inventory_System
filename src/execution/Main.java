package execution;

import definitions.Video;

public class Main {
    public static void main(String[] args) {
        Video video = new Video();
        System.out.println(
                "Video name : " + video.getVideoName()
                        + " has Rating : " + video.getRating()
                        + ", is video available : " + video.isCheckOut()
        );


    }
}
