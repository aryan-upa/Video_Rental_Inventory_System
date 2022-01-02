package definitions;

public class Video {
    private String videoName;
    private int rating;
    private boolean checkOut;

    /**
     * This method returns the name of the video.
     *
     * @return The name of the video.
     */
    public String getVideoName() {
        return videoName;
    }

    /**
     * This method returns the Rating of the video.
     *
     * @return Video Rating
     */
    public int getRating() {
        return rating;
    }

    /**
     * This method sets the rating of the video.
     *
     * @param rating : The rating of the video.
     */
    public void setRating(int rating) {
        this.rating = rating;
    }

    /**
     * This method returns the checkOut status.
     *
     * @return checkOut Status.
     */
    public boolean isCheckOut() {
        return checkOut;
    }

    /**
     * This method the Checkout Status of the video.
     *
     * @param checkOut : The checkout status of the video.
     */
    public void setCheckOut(boolean checkOut) {
        this.checkOut = checkOut;
    }

    /**
     * This method sets the Video Name of the file.
     *
     * @param videoName : The name of the video.
     */
    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }


}
