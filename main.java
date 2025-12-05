import java.util.Scanner;
import java.util.ArrayList;

public class main{
    public static void main(String[] args) {
        // put all the rides as objects and into a list to access them easier
        ArrayList<park> rideList = new ArrayList<>();
        rideList.add(new gravitron( 20,"Gravitron", 5.00, 2.5, 4, 10.0, 8.0, 30.0, 1.2, true, true, 3));
        rideList.add(new claw(16, "Claw", 4.50, 3.0, 3, 8.0, 7.0, 25.0, 50, 4, true, false));
        rideList.add(new teaCups(20, "Teacups", 3.75, 4.0, 2, 6.0, 6.0, 15.0, 10, 5, true));
        rideList.add(new carousel(20, "Carousel", 4.00, 5.0, 2, 7.0, 5.0, 10.0, true));   

        // User input to choose which ride they want to do or exit
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 5) {
            System.out.println("Choose a ride to view details (type number not name):");
            System.out.println("1. Claw");
            System.out.println("2. Teacups");
            System.out.println("3. Gravitron");
            System.out.println("4. Carousel");
            System.out.println("5. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Display Claw ride details
                    break;
                case 2:
                    // Display Teacups ride details
                    break;
                case 3:
                    // Display Gravitron ride details
                    gravitron ride = (gravitron)rideList.get(1);
                    System.out.println("The number of laps for theis ride is" + ride.getNumOfLaps());
                    
                    break;
                case 4:
                    // Display Carousel ride details
                    
                    break;
                case 5:
                    System.out.println("Exiting the park thank you so much for attending!");
                    break;
                default:
                    System.out.println("Please, choose a number from 1-5.");
            }
        }
        scanner.close();    



    }
}