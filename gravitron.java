/*
* Name: Group Team Project 
* Purpose: Creating a Gravitron class for the Gravitron ride that extends from the park class
* Programmer: Angel Carmichael
* Date: 12 / 07 / 2025
*/ 

import java.util.*;
 
public class gravitron extends park {
    private double gravityPull = 10.0;
    private boolean isFlashingLights = true;
    private boolean isStationary = true;
    private int numOfLaps = 5;
    public double pukeFactor = 0.0;
 
    public gravitron(int maxRiders, String nameOfRide, double ticketCost, double rideDuration, int attendants, double utilityCostPerHour, double hoursPerDay, double speed, double gravityPull, boolean isFlashingLights, boolean isStationary, int numOfLaps){
        super(maxRiders, nameOfRide, ticketCost, rideDuration, attendants, utilityCostPerHour, hoursPerDay, speed);
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
 
    public void setNumOfLaps(int laps){
        numOfLaps = laps;
    }
 
    public int getNumOfLaps(){
        return this.numOfLaps;
    }
 
   @Override
    public String rideOutcome(int ridesTaken) {
        String outcome;
 
        if (pukeFactor >= 20) {
            outcome = "You did " + numOfLaps + " spins on the Gravitron. "
                + "You held on tight and… you puked! Yikes...\n";
        } else {
            outcome = "You did " + numOfLaps + " spins on the Gravitron. "
                + "You held on tight and survived!\n";
        }
 
    // Add Gravitron ASCII art
    outcome += getAsciiArt();
 
    return outcome;
}
 
 
    private String getAsciiArt() {
    return "      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                 \n" +
"                @@                                     @@                \n" +
"              @@@                                       @@@              \n" +
"             @@@     @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@    @@@             \n" +
"            @@     @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@     @@            \n" +
"          @@@     @@@   @                       @   @@@     @@@          \n" +
"         @@@     @@                                   @@     @@@         \n" +
"        @@     @@@                                     @@@     @@        \n" +
"      @@@     @@@      @@@@@@  @@@@@@@@@@@@@@@@@@@      @@@     @@@      \n" +
"     @@@     @@@     @@@                         @@@     @@@     @@@     \n" +
"    @@      @@      @@@   @@@   @@@   @@@   @@@   @@@      @@      @@    \n" +
"  @@@     @@@      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@      @@@     @@@  \n" +
" @@@     @@@       @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@       @@@     @@@ \n" +
"@@   @    @@       @@@                             @@@       @@    @   @@\n" +
"@@   @@    @@       @@@   @@@  @@@     @@@  @@@   @@@       @@    @@   @@\n" +
"@@          @@       @@@   @@   @@     @@   @@   @@@       @@          @@\n" +
"@@           @@       @@    @@  @@@   @@@  @@             @@           @@\n" +
"@@   @@@@@@@  @@       @@    @   @@   @@   @    @@       @@  @@@@@@@   @@\n" +
"    @@@   @@   @@       @@                     @@       @@   @@   @@@  @@\n" +
"@@  @@@   @@    @@      @@@@@@@@@@@@@@@@@@@@@@@@@      @@    @@   @@@  @@\n" +
"@@   @@@@@@@     @@     @@@                   @@@     @@     @@@@@@@   @@\n" +
"@@                @@    @@@       @@@@@       @@@    @@                @@\n" +
"@@                 @@@  @@@       @@ @@       @@@  @@@                 @@\n" +
"@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n";
}
 
 
 
 
    @Override
    public double calculatePukeFactor() {
        // base puke factor
        double pukeFactor = 5.0;
 
        // Increase puke factor significantly if the ride moves
        if (!isStationary) {
            pukeFactor += 15.0;
        }
 
        // Increase puke factor significantly if the rides lights flash
        if (isFlashingLights) {
            pukeFactor += 15.0;
        }
        // Increase puke factor significantly if the ride iss both moves and the lights flash
        if (isFlashingLights && !isStationary) {
            pukeFactor += 25.0;
        }
 
        return pukeFactor;
    }
 
 
}