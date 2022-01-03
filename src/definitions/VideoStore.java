package definitions;

import java.util.Arrays;

public class VideoStore {

    /**
     * An array to store the videos object.
     */
    private Video[] store;

    // Constructor
    public VideoStore() {
        this.store = new Video[5];
    }

    // Getter
    public Video[] getStore() {
        return store.clone();
    }

    // Setter
    public void setStore(Video[] store) {
        this.store = store;
    }

    // toString()
    @Override
    public String toString() {
        return Arrays.toString(store);
    }

    // equals() and hashcode()
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

}
