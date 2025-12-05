/**
 * Name: Group Team Project 
 * Programmer: Parth Thite
 * Date: 12/4/2025
 * Purpose: The carousel is a ride that extends the park class and includes things such as number of laps and whether music is 
 * on or not. I also included arrays for music genre and type of animals on the carousel.
 */

public class carousel extends park {

    // Fefining variables 
    private int numOfLaps;
    public double pukeFactor = 0.0;
    private boolean musicOn;
    private String[] musicGenre = {"Pop", "Rock", "Classical", "Jazz", "Country"};
    private String[] typeOfAnimals = {"Horse", "Lion", "Tiger", "Bear", "Elephant"};

    // Making constructor
    public carousel(int maxRiders, String nameOfRide, double ticketCost, double rideDuration, int attendants, double utilityCostPerHour, double hoursPerDay, double speed, boolean musicOn) {
        super(maxRiders, nameOfRide, ticketCost, rideDuration, attendants, utilityCostPerHour, hoursPerDay, speed);
        this.musicGenre = musicGenre;
        this.numOfLaps = numOfLaps;
        this.musicOn = musicOn;
        this.typeOfAnimals = typeOfAnimals;
    }

    // Defining methods 
    @Override
    public double calculatePukeFactor() {

        // Base puke factor calculation based on speed and laps
        pukeFactor += (getSpeed()) * numOfLaps;

        // Increase puke factor if music is on
        if (musicOn = true) {
            pukeFactor *= 1.5;
        }

        return pukeFactor;
    }

    @Override
    public String rideOutcome() {
        if (pukeFactor >= 20)  {
            return "You rode the Carousel " + numOfLaps + " times. " + " You rode the " + typeOfAnimals + " and you piked! Yuck...";
        }
        
        else {
            return  "You rode the Carousel " + numOfLaps + " times. " + " You rode the " + typeOfAnimals;
        }

    }   

    public void setNumOfLaps() {
        this.numOfLaps = numOfLaps;
    }

    public int getNumOfLaps() {
        return numOfLaps;
    }



}
