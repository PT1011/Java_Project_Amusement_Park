/*
* Name: Group Team Project 
* Purpose: Creating a gravitron class for the gravitron ride that extends from the park class
* Programmer: Angel Carmichael
* Date: 12 / 07 / 2025
*/ 

public class gravitron extends park {
    private double gravityPull;
    private boolean isFlighingLights;
    private boolean isStationary;

    public void setGravityPull(double pull){
        gravityPull = pull;
    }

    public double getGravityPull(){
        return this.gravityPull;
    }

    public void setFlighingLights(boolean lights){
        isFlighingLights = lights;
    }

    public boolean getFlighingLights(){
        return this.isFlighingLights;
    }

    public void setIsStationary(boolean movement){
        isStationary = movement;
    }

    public boolean getIsStationary(){
        return this.isStationary;
    }

    @Override
    public String rideOutcome(int numOfLaps, double heightOffGround) {
        return "The Claw " + numOfLaps + " laps at a height of " + heightOffGround + " feet!";
    }   

    @Override
    public double calculatePukeFactor() {

        double pukeFactor = 0.0;

        // Base puke factor calculation based on height and laps
        pukeFactor += (heightOffGround / 10.0) * numOfLaps;

        // Increase puke factor if music is on
        if (!isStationary) {
            pukeFactor += 15.0;
        }

        // Increase puke factor significantly if the ride goes upside down
        if (isUpsideDown) {
            pukeFactor += 15.0;
        }

        return pukeFactor;
    }


}
