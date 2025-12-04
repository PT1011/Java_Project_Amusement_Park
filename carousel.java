/**
 * Name: Parth Thite
 * Date: 12/4/2025
 * Purpose: The carasoul is a ride that extends
 */

public class carousel extends park {

    private int numOfLaps;
    private boolean musicOn;
    private String[] musicGenre = {"Pop", "Rock", "Classical", "Jazz", "Country"};
    private String[] typeOfAnimals = {"Horse", "Lion", "Tiger", "Bear", "Elephant"};

    public carousel(int maxRiders, String nameOfRide, double ticketCost, double rideDuration, int attendants, double utilityCostPerHour, double hoursPerDay, double speed, boolean musicOn) {
        super(maxRiders, nameOfRide, ticketCost, rideDuration, attendants, utilityCostPerHour, hoursPerDay, speed);
        this.musicGenre = musicGenre;
        this.numOfLaps = numOfLaps;
        this.musicOn = musicOn;
        this.typeOfAnimals = typeOfAnimals;
    }

    @Override
    public double calculatePukeFactor() {
        double pukeFactor = 0.0;

        // Base puke factor calculation based on speed and laps
        pukeFactor += (speed) * numOfLaps;

        // Increase puke factor if music is on
        if (musicOn = true) {
            pukeFactor *= 1.5;
        }

        return pukeFactor;
    }

    @Override
    public String rideOutcome() {
        return "You rode the Teacups " + numOfLaps + " times and there were " + numOfCups + " cups!";
    }

    public void setNumOfLaps() {
        this.numOfLaps = numOfLaps;
    }

    public int getNumOfLaps() {
        return numOfLaps;
    }



}
