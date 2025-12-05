import java.util.Scanner;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        // Put all the rides as objects and into a list to access them easier
        ArrayList<park> rideList = new ArrayList<>();
        rideList.add(new gravitron(20, "Gravitron", 5.00, 2.5, 4, 10.0, 8.0, 30.0, 1.2, true, true, 3));
        rideList.add(new claw(16, "Claw", 4.50, 3.0, 3, 8.0, 7.0, 25.0, 50, 4, true, false));
        rideList.add(new teaCups(20, "Teacups", 3.75, 4.0, 2, 6.0, 6.0, 15.0, 10, 5, true));
        rideList.add(new carousel(30, "Carousel", 2.50, 5.0, 1, 4.0, 5.0, 10.0, true, 20));

        System.out.println("Welcome to Group 2's Amusement Park Simulator!");
        System.out.println("Type 0 at any time to exit.\n");

        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("Choose a ride to inspect:");
            for (int i = 0; i < rideList.size(); i++) {
                park p = rideList.get(i);
                System.out.printf("%d. %s\n", i + 1, p.getNameOfRide());
            }
            System.out.println("0. Exit");
            System.out.print("Enter choice (0-" + rideList.size() + "): ");

            String line = scanner.nextLine().trim();
            if (line.equals("0")) {
                choice = 0;
                break;
            }

            try {
                choice = Integer.parseInt(line);
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input. Enter a number.");
                continue;
            }

            if (choice < 0 || choice > rideList.size()) {
                System.out.println("Invalid choice. Try again.");
                continue;
            }
            if (choice == 0) break;

            park selected = rideList.get(choice - 1);

            // If the selected ride is a carousel, allow user to pick an animal
            if (selected instanceof carousel) {
                carousel c = (carousel) selected;
                String[] animals = {"Horse", "Lion", "Tiger", "Bear", "Elephant"};

                System.out.println("\nChoose an animal to ride:");
                for (int i = 0; i < animals.length; i++) {
                    System.out.println((i + 1) + ". " + animals[i]);
                }
                System.out.print("Enter choice (1–5): ");

                String aStr = scanner.nextLine().trim();
                try {
                    int aChoice = Integer.parseInt(aStr);
                    if (aChoice >= 1 && aChoice <= animals.length) {
                        c.setChosenAnimal(animals[aChoice - 1]);
                        System.out.println("Animal selected: " + animals[aChoice - 1]);
                    } else {
                        System.out.println("Invalid choice. Keeping default animal.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Keeping default animal.");
                }
            }

            System.out.println("\n--- " + selected.getNameOfRide() + " ---");
            // Display outcome with 1 lap as default
            System.out.println("Outcome: " + selected.rideOutcome(1));
            System.out.printf("Puke Factor: %.2f\n", selected.calculatePukeFactor());
            System.out.printf("Attendents : %d\n", selected.getAttendants());
            System.out.printf("Daily Revenue: $%.2f\n", selected.calculateDailyRevenue());
            System.out.printf("Daily Cost: $%.2f\n", selected.calculateDailyCost());
            System.out.printf("Daily Profit: $%.2f\n\n", selected.calculateDailyProfit());

            // Interactive Options
            System.out.println("Options:");
            System.out.println("1 = Change ride duration");
            System.out.println("2 = Change speed");
            System.out.println("3 = Ride this attraction");
            System.out.println("4 = Back to main menu");
            System.out.print("Enter option: ");

            String opt = scanner.nextLine().trim();

            if (opt.equals("1")) {
                System.out.print("\nEnter new ride duration (minutes): ");
                String dStr = scanner.nextLine().trim();
                try {
                    double newDuration = Double.parseDouble(dStr);
                    selected.setRideDuration(newDuration);
                    System.out.println("Ride duration updated.");
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number, duration not changed.");
                }

            } else if (opt.equals("2")) {
                System.out.print("\nEnter new speed (e.g. 8.0): ");
                String sStr = scanner.nextLine().trim();
                try {
                    double newSpeed = Double.parseDouble(sStr);
                    selected.setSpeed(newSpeed);
                    System.out.println("Speed updated.");
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number, speed not changed.");
                }

            } else if (opt.equals("3")) {
                // User rides the attraction
                System.out.print("\nHow many times would you like to ride it? ");
                String rStr = scanner.nextLine().trim();
                try {
                    int ridesTaken = Integer.parseInt(rStr);

                    if (ridesTaken <= 0) {
                        System.out.println("Number must be greater than 0.");
                    } else {
                        double totalTime = ridesTaken * selected.getRideDuration();
                        double totalCost = ridesTaken * selected.getTicketCost();

                        // Pass ridesTaken to rideOutcome()
                        System.out.println(selected.rideOutcome(ridesTaken));
                        System.out.printf("Total ride time: %.2f minutes\n", totalTime);
                        System.out.printf("Total money spent: $%.2f\n", totalCost);

                        if (selected.calculatePukeFactor() > 20 && ridesTaken > 2) {
                            System.out.println("You threw up bru ");
                        } else {
                            System.out.println("You handled it like a champ! ");
                        }
                    }

                } catch (NumberFormatException e) {
                    System.out.println("\nInvalid number. Ride canceled.");
                }

            } else if (opt.equals("4")) {
                // Back to menu
            }

            System.out.println();
        }

        System.out.println("\nThanks for visiting the Amusement Park! Goodbye.");
        scanner.close();
    }
}
