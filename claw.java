/*
* Name: Group Team Project 
* Purpose: Creating a claw ride class that extends from the park class 
* that sets the user up to ride the claw and asks for user feedback on the ride
* Programmer: Sham Nemer
* Date: 12 / 07 / 2025
*/ 

public class claw extends park {
    private int heightOffGround;
    private int numOfLaps;
    private boolean musicOn;
    private boolean isUpsideDown;

    public claw(int maxRiders, String nameOfRide, double ticketCost, double rideDuration, int attendants, double utilityCostPerHour, double hoursPerDay, double speed, int heightOffGround, int numOfLaps, boolean musicOn, boolean isUpsideDown) {
        super(maxRiders, nameOfRide, ticketCost, rideDuration, attendants, utilityCostPerHour, hoursPerDay, speed);
        this.heightOffGround = heightOffGround;
        this.numOfLaps = numOfLaps;
        this.musicOn = musicOn;
        this.isUpsideDown = isUpsideDown;
    }

    public int getHeightOffGround() {
        return heightOffGround;
    }
    public void setHeightOffGround(int heightOffGround) {
        this.heightOffGround = heightOffGround;
    }
    public int getNumOfLaps() {
        return numOfLaps;
    }
    public void setNumOfLaps(int numOfLaps) {
        this.numOfLaps = numOfLaps;
    }
    public boolean isMusicOn() {
        return musicOn;
    }
    public void setMusicOn(boolean musicOn) {
        this.musicOn = musicOn; 
    }
    public boolean isUpsideDown() {
        return isUpsideDown;
    }
    public void setUpsideDown(boolean isUpsideDown) {
        this.isUpsideDown = isUpsideDown;
    }
    
    @Override
    public String rideOutcome() {
        return "The Claw " + numOfLaps + " laps at a height of " + heightOffGround + " feet!";
    }   

    @Override
    public double calculatePukeFactor() {

        double pukeFactor = 0.0;

        // Base puke factor calculation based on height and laps
        pukeFactor += (heightOffGround / 10.0) * numOfLaps;

        // Increase puke factor if music is on
        if (musicOn) {
            pukeFactor -= 5.0;
        }

        // Increase puke factor significantly if the ride goes upside down
        if (isUpsideDown) {
            pukeFactor += 15.0;
        }

        return pukeFactor;
    }

}
