package execution;

import java.util.Scanner;

public class VideoLauncher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int customerInput;
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
        } while (customerInput != 6);
        sc.close();

    }
}
