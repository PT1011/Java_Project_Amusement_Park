/**
 * Name: Parth Thite
 * Date: 12/4/2025
 * Purpose: The carasoul is a ride that extends
 */

public class carasoul extends park {

    private int numOfLaps;
    private boolean musicOn;
    private String[] musicGenre;
    private String[] typeOfAnimals;

    public carasoul(int maxRiders, String nameOfRide, double ticketCost, double rideDuration, int attendants, double utilityCostPerHour, double hoursPerDay, double speed, boolean musicOn) {
        super(maxRiders, nameOfRide, ticketCost, rideDuration, attendants, utilityCostPerHour, hoursPerDay, speed);
        this.musicGenre = musicGenre;
        this.numOfLaps = numOfLaps;
        this.musicOn = musicOn;
        this.typeOfAnimals = typeOfAnimals;
    }

    public double calculatePukeFactor() {

    }

    public String rideOutcome() {

    }

    public void setNumOfLaps() {
        this.numOfLaps = numOfLaps;
    }

    public 

}
