/*
* Name: Group Team Project 
* Purpose: Creating a gravitron class for the gravitron ride that extends from the park class
* Programmer: Angel Carmichael
* Date: 12 / 07 / 2025
*/ 
import java.util.*;

public class gravitron extends park {
    private double gravityPull = 10.0;
    private boolean isFlashingLights = true;
    private boolean isStationary = true;
    private int numOfLaps = 5;

    gravitron(){}

    gravitron(double gravityPull, boolean isFlashingLights, boolean isStationary, int numOfLaps){
        gravityPull = this.gravityPull;
        isFlashingLights = this.isFlashingLights;
        isStationary = this.isStationary;
        numOfLaps = this.numOfLaps;
    }

    public void setGravityPull(double pull){
        gravityPull = pull;
    }

    public double getGravityPull(){
        return this.gravityPull;
    }

    public void setisFlashingLights(boolean lights){
        isFlashingLights = lights;
    }

    public boolean getisFlashingLights(){
        return this.isFlashingLights;
    }

    public void setIsStationary(boolean movement){
        isStationary = movement;
    }

    public boolean getIsStationary(){
        return this.isStationary;
    }

    public void setnumOfLaps(int laps){
        numOfLaps = laps;
    }

    public int getnumOfLaps(){
        return this.numOfLaps;
    }

    @Override
    public String rideOutcome() {
        return "The Claw " + numOfLaps + "laps!!";
    }   

    @Override
    public double calculatePukeFactor() {

        double pukeFactor = 5.0;

        // Increase puke factor if music is on
        if (!isStationary) {
            pukeFactor += 25.0;
        }

        // Increase puke factor significantly if the ride goes upside down
        if (isFlashingLights) {
            pukeFactor += 15.0;
        }

        if (isFlashingLights && !isStationary) {
            pukeFactor += 15.0;
        }

        return pukeFactor;
    }


}
