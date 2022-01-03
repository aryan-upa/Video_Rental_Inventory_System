package execution;

import definitions.VideoStore;

import java.util.Scanner;

public class VideoLauncher {

    private static final int ADD_VIDEO = 1;
    private static final int CHECK_OUT_VIDEO = 2;
    private static final int RETURN_VIDEO = 3;
    private static final int RECEIVE_RATING = 4;
    private static final int LIST_INVENTORY = 5;
    private static final int EXIT = 6;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int customerInput;
        VideoStore myVideoStore = new VideoStore();
        String videoName;
        int videoRating;
        do {
            System.out.println("MAIN MENU");
            System.out.println("=========");
            System.out.println("1. Add video : ");
            System.out.println("2. Check out video : ");
            System.out.println("3. Return video : ");
            System.out.println("4. Receive Rating : ");
            System.out.println("5. List Inventory : ");
            System.out.println("6. Exit : ");
            System.out.println("Enter your choice (1..6) : ");
            customerInput = sc.nextInt();

            switch (customerInput) {
                case ADD_VIDEO -> {
                    System.out.println("Enter the name of the video you want to add...");
                    sc.nextLine();
                    videoName = sc.nextLine();
                    myVideoStore.addVideo(videoName);
                }
                case CHECK_OUT_VIDEO -> {
                    System.out.println("Enter the name of the video you want to add...");
                    sc.nextLine();
                    videoName = sc.nextLine();
                    myVideoStore.doCheckOut(videoName);
                }
                case RETURN_VIDEO -> {
                    System.out.println("Enter the name of the video you want to return...");
                    sc.nextLine();
                    videoName = sc.nextLine();
                    myVideoStore.doReturn(videoName);
                }
                case RECEIVE_RATING -> {
                    System.out.println("Enter the name of the video whose rating you want to add...");
                    sc.nextLine();
                    videoName = sc.nextLine();
                    System.out.println("Enter the rating: ");
                    videoRating = sc.nextInt();
                    myVideoStore.recieveRating(videoName, videoRating);
                }
                case LIST_INVENTORY -> myVideoStore.listInventory();
                default -> System.out.println("This is an Invalid Input!");
            }
        } while (customerInput != 6);
        sc.close();

    }
}
