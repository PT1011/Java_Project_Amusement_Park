/**
 * Programmer: Lucas Campbell
 * Date: 12/4/2025
 * Purpose: The teacup is a ride that extends the park class and includes things such as number of laps and whether 
 * the cups are spinning.
 */

public class teaCups extends park {
    private int numOfCups;
    private int numOfLaps;
    private boolean cupSpin;
 
    public teaCups(int maxRiders, String nameOfRide, double ticketCost, double rideDuration, int attendants, double utilityCostPerHour, double hoursPerDay, double speed, int numOfCups, int numOfLaps, boolean cupSpin) {
        super(maxRiders, nameOfRide, ticketCost, rideDuration, attendants, utilityCostPerHour, hoursPerDay, speed);
        this.numOfCups = numOfCups;
        this.numOfLaps = numOfLaps;
        this.cupSpin = cupSpin;
    }
    //setters and getters
    public int numOfCups() {
        return numOfCups;
    }
    public void setnumOfCups(int numOfCups) {
        this.numOfCups = numOfCups;
    }
    public int getNumOfLaps() {
        return numOfLaps;
    }
    public void setNumOfLaps(int numOfLaps) {
        this.numOfLaps = numOfLaps;
    }
    public boolean getCupSpin() {
        return cupSpin;
    }
    public void setCupSpin(boolean cupSpin) {
        this.cupSpin = cupSpin;
    }
    // The summary of the outcome and prints the asci art
   @Override
    public String rideOutcome(int ridesTaken) {
        String outcome = 
            "You rode the Teacups " + ridesTaken +
            " times and there were " + numOfCups + " cups!\n";

        outcome += getAsciiArt();
        return outcome;
    }
 
    private String getAsciiArt() {
    return
          "                                     %.                                   \n" +
          "                                    %                                     \n" +
          "                                   *=#                                    \n" +
          "                                   %.#                                    \n" +
          "                                  #. .%                                  \n" +
          "                                .#%    #.                                \n" +
          "                                 %=%   %                                 \n" +
          "                                  %%%%%                                  \n" +
          "                                  .%%%.                                  \n" +
          "                                  #%%%#                                  \n" +
          "                                  %%%%%                                  \n" +
          "                                  %###%                                  \n" +
          "                                  %##%%                                  \n" +
          "      ##################.        .=%#%=:        .##################  .   \n" +
          "=%   #%................ +        % +#+ #        +  ..   ...   ....%%   %= \n" +
          "#.    %%%%%%%%%%%%%%%%%%+       .#+ # *#        +%%%%%%%%%%%%%%%%%%.    # \n" +
          "#     % .##...##  .##*  +       %.%.#.%.%.      +  *%#   ##. .##  %.    # \n" +
          ".#.   % # .#.#..%.%..%.:-      =+.#.#.#.+=      -:.%..%.# .#.%. #.%.  .# \n" +
          " .%%  %=.  . . .   .. .#.    .#..%..#..% .#.     %  ..           =%  %%. \n" +
          "   .. .*#%%%%%%%%%%%%##.    %#  %*  #  *% .##.   .%%%%%%%%%%%%%%#*.  .   \n" +
          "         %%%%%%%%%%%#. ..#%.   #    #   .#..  %%. . #%%%%%%%%%%%.        \n" +
          "      .%#.......#%.......=##.......%%%.......#%-.......%%.......##.      \n" +
          "      .# #% #.#   .# -  #   .#.%.#%   %#.%.%.  .#. -.%.  .%.# %# %.      \n" +
          "      .#.. %#.      .##.     ..%%       %%........%%   ....:%%   #.      \n";
 
}
 
 
    @Override
    // Calculates puke factor based on cups, laps, speed, and spin
    public double calculatePukeFactor() {
        double pukeFactor = 0.0;
 
        pukeFactor += numOfCups * 0.5;
        pukeFactor += numOfLaps * 1.2;
        pukeFactor += getSpeed() * 0.3;
 
        if (cupSpin) {
            pukeFactor *= 1.5;
        }
 
        return pukeFactor;
    }
 
}


