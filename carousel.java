/**
 * Name: Group Team Project 
 * Programmer: Parth Thite
 * Date: 12/4/2025
 * Purpose: The carousel is a ride that extends the park class and includes things such as number of laps and whether music is 
 * on or not. I also included arrays for music genre and type of animals on the carousel.
 */

public class carousel extends park {

    // Defining variables
    private String chosenAnimal;  
    private int numOfLaps;
    public double pukeFactor = 0.0;
    private boolean musicOn;
    private String[] musicGenre = {"Pop", "Rock", "Classical", "Jazz", "Country"};
    private String[] typeOfAnimals = {"Horse", "Lion", "Tiger", "Bear", "Elephant"};

    // Making constructor
    public carousel(int maxRiders, String nameOfRide, double ticketCost, double rideDuration, int attendants, 
    double utilityCostPerHour, double hoursPerDay, double speed, boolean musicOn, int numOfLaps) {
    super(maxRiders, nameOfRide, ticketCost, rideDuration, attendants, utilityCostPerHour, hoursPerDay, speed);

    this.musicOn = musicOn;
    this.numOfLaps = numOfLaps;
    this.chosenAnimal = "Horse"; // default if user never picks
}


    // Creating methods 
   @Override
    public double calculatePukeFactor() {
        double pukeFactor = (getSpeed() * numOfLaps) / 10.0; // divide to reduce impact

        if (musicOn) {
            pukeFactor *= 1.2; // smaller multiplier
        }

        return pukeFactor;
    }

    // Ride outcome method 
    @Override
    public String rideOutcome(int ridesTaken) {
        // Build outcome string using ridesTaken and chosenAnimal 
        String outcome = "You did " + ridesTaken + " laps on the Carousel. "
                    + "You rode the " + chosenAnimal + "!\n";

        // Add ASCII art
        outcome += getAsciiArt();

        return outcome;
    }

    // Getters and Setters
    public void setChosenAnimal(String animal) {
        this.chosenAnimal = animal;
    }

    public String getChosenAnimal() {
        return chosenAnimal;
    }
   
    public void setNumOfLaps() {
        this.numOfLaps = numOfLaps;
    }

    public int getNumOfLaps() {
        return numOfLaps;
    }

    // Method to return ASCII art based on chosen animal
    private String getAsciiArt() {
    switch (chosenAnimal.toLowerCase()) {

        case "horse":
        return "             ______/``'``'-.\n" +
               "           (_   6  \\    .^\n" +
               "         __ `'.__,  |    `'-.\n" +
               "        /_ \\  /    /      :`^'\n" +
               "      /`/_` \\/    /       .'\n" +
               "      \"/  `'-     |.-'`^. `.\n" +
               "      / .`-._     \\   `'^^^\n" +
               "    /`/'    \\      \\\n" +
               "    \"\"       \\      `.\n" +
               "              `\\      `.\n" +
               "                `\\/     \\-'-.-\n" +
               "                 /     /`.  `-.\n" +
               "                (    /'   )  .^\n" +
               "                 \\  \\\\  .'^. `.\n" +
               "                  \\ > >  `` `. )\n" +
               "                  // /       .`\n" +
               "                /`/\n" +
               "                \"\"\n";


        case "lion":
        return "    \\|\\||\n" +
               "  -' ||||/\n" +
               " /7   |||||/\n" +
               "/    |||||||/`-.____________\n" +
               "\\-' |||||||||               `-._\n" +
               " -|||||||||||               |` -`.\n" +
               "   ||||||               \\   |   `\\\\\n" +
               "    |||||\\  \\______...---\\_  \\    \\\\\n" +
               "       |  \\  \\           | \\  |    ``-.__--.\n" +
               "       |  |\\  \\         / / | |       ``---'\n" +
               "     _/  /_/  /      __/ / _| |\n" +
               "    (,__/(,__/      (,__/ (,__/\n";


        case "tiger":
        return "                          __,,,,_\n" +
            "          _ __..-;''`--/'/ /.',-`-.\n" +
            "      (`/' ` |  \\ \\ \\\\ / / / / .-'/`,_\n" +
            "     /'`\\ \\   |  \\ | \\| // // / -.,/_,'-,\n" +
            "    /<7' ;  \\ \\  | ; ||/ /| | \\/    |`-/,/-.,_,/')\n" +
            "   /  _.-, `,-\\,__|  _-| / \\ \\/|_/  |    '-/.;.\\'\n" +
            "   `-`  f/ ;      / __/ \\__ `/ |__/ |\n" +
            "        `-'      |  -| =|\\_  \\  |-' |\n" +
            "              __/   /_..-' `  ),'  //\n" +
            "            ((__.-'((___..-'' \\__.'\n";

        case "bear":
        return "     (()__(()\n" +
            "        /       \\\n" +
            "       ( /    \\  \\\n" +
            "        \\ o o    /\n" +
            "        (_()_)__/ \\\n" +
            "       / _,==.____ \\\n" +
            "      (   |--|      )\n" +
            "      /\\_.|__|'-.__/\\_\n" +
            "     / (        /     \\\n" +
            "     \\  \\      (      /\n" +
            "      )  '._____)    /\n" +
            "   (((____.--(((____/mrf\n";

        case "elephant":
        return "      __\n" +
               "    '. \\\n" +
               "     '- \\\n" +
               "      / /_         .---.\n" +
               "     / | \\\\,./--.//    )\n" +
               "     |  \\\\//        )/  /\n" +
               "      \\\\  ' ^ ^    /    )____.----..  6\n" +
               "       '.____.    .___/            \\._)\n" +
               "          .\\/ .                      )\n" +
               "           '\\\\                       /\n" +
               "           _/ \\\\/    ).        )    (\n" +
               "          /#  .!    |        /\\\\    /\n" +
               "          \\\\  C// #  /'-----''/ #  /\n" +
               "       .   'C/ |    |    |   |    |mrf  ,\n" +
               "       \\), .. .'OOO-'. ..'OOO'OOO-'. ..\\),( \n";


        default:
            return "(no ASCII available)";
    }
}




}
