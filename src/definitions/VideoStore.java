package definitions;

import java.util.Arrays;

public class VideoStore {

    /**
     * An array to store the videos object.
     */
    private Video[] store;

    /**
     * Defines the size of the Video store array.
     */
    private int storeSize;

    {
        storeSize = 5;
    }

    public VideoStore() {
        this.store = new Video[storeSize];
        for (int i = 0; i < store.length; i++) {
            store[i] = new Video();
        }
    }

    public VideoStore(int storeSize) {
        this.store = new Video[storeSize];
        for (int i = 0; i < store.length; i++) {
            store[i] = new Video();
        }
    }

    public Video[] getStore() {
        return store.clone();
    }

    public int getStoreSize() {
        return storeSize;
    }

    public void setStore(Video[] store) {
        this.store = store;
    }

    public void setStoreSize(int storeSize) {
        this.storeSize = storeSize;
    }

    @Override
    public String toString() {
        return Arrays.toString(store);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoStore that = (VideoStore) o;
        return Arrays.equals(getStore(), that.getStore());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getStore());
    }

    /**
     * This method will allow us to add a new Video to our store.
     *
     * @param name : The name of the new video to be added to the store.
     */
    public void addVideo(String name) {
        System.out.println("\"" + name + "\" is now added to the store.");
    }

    /**
     * This method will allow a customer to rent a video.
     *
     * @param name : The name of the video that the customer wants to rent.
     */
    public void doCheckOut(String name) {
        System.out.println("Thank you for renting \"" + name + "\"");
    }

    /**
     * This method allows the customer to return a video that they rented.
     *
     * @param name : Name of the video that they returned.
     */
    public void doReturn(String name) {
        System.out.println("Thank you for returning the \"" + name + "\" video.");
    }

    /**
     * This method will allow us to set a new rating for a video.
     *
     * @param name   : The name of the video for which we need to receive the rating.
     * @param rating : The rating we need to give to the video.
     */
    public void recieveRating(String name, int rating) {
        System.out.println("The new rating of \"" + name + "\" is now " + rating + " .");
    }

    /**
     * This method will print all the elements of the 'store' array.
     */
    public void listInventory() {
        for (Video video : this.store) {
            System.out.println(video);
        }
    }

}
