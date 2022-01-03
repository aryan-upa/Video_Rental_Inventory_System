package definitions;


import java.util.Objects;

/**
 * This is the Video class, it holds the basic fields of a video object and their respective methods.
 *
 * @author : Aryan Upadhyay
 */
public class Video {

    /**
     * The name of the Video
     */
    private String videoName;

    /**
     * The rating of the Video.
     */
    private int rating;

    /**
     * The checkOut status of the Video.
     */
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
     * This method returns the checkOut status.
     *
     * @return checkOut Status.
     */
    public boolean isCheckOut() {
        return checkOut;
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
     * This method will allow the customer to rent a video.
     */
    public void doCheckOut() {
        System.out.println("Thank you for renting.");
    }

    /**
     * This method allows the customer to return the video.
     */
    public void doReturn() {
        System.out.println("Thank you for returning " + getVideoName() + " .");
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

    /**
     * Non-Parameterized constructor.
     * Sets default values of the
     * videoName : No-Name
     * rating : 0
     * checkOut : false
     */
    public Video() {
        this.videoName = "No-Name";
        this.rating = 0;
        this.checkOut = false;
    }

    /**
     * Parameterized Constructor Method : Sets the videoName, Rating, checkOut status according to the input parameters.
     *
     * @param videoName : The name of the Video.
     * @param rating    : The rating of the Video.
     * @param checkOut  : The checkOut status of the video.
     */
    public Video(String videoName, int rating, boolean checkOut) {
        this.videoName = videoName;
        this.rating = rating;
        this.checkOut = checkOut;
    }

    /**
     * Parameterized Constructor Method : Sets the videoName according to the parameter.
     * Sets Rating = 3, checkOut = false.
     *
     * @param videoName : Name of the video.
     */
    public Video(String videoName) {
        this.videoName = videoName;
        rating = 3;
        checkOut = false;
    }

    /**
     * This method provides ease in printing the details of the object of the class.
     * The println() method implicitly calls the toString method, and by defining this here we help, in printing the
     * fields of the object by just printing the object.
     *
     * @return : The details of the object [videoName, rating, checkOut].
     */
    @Override
    public String toString() {
        return "Video{" +
                "videoName='" + videoName + '\'' +
                ", rating=" + rating +
                ", checkOut=" + checkOut +
                '}';
    }

    /**
     * This method helps in comparing two instances of the Video class.
     *
     * @param o : Another object of the reference type.
     * @return : Boolean value whether the objects are same or not.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Video video = (Video) o;
        return getRating() == video.getRating() && isCheckOut() == video.isCheckOut() && Objects.equals(getVideoName(), video.getVideoName());
    }

    /**
     * This method returns the hashcode of the fields in the video class.
     *
     * @return : Integer value of the hashes.
     */
    @Override
    public int hashCode() {
        return Objects.hash(getVideoName(), getRating(), isCheckOut());
    }


}
