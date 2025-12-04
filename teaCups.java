public class teaCups extends park {
    private int numOfCups;
    private int numOfLaps;
    private boolean cupSpin;

    public teaCups(int maxRiders, String nameOfRide, double ticketCost, double rideDuration, int attendants, double utilityCostPerHour, double hoursPerDay, double speed, int numOfCups, int numOfLaps, boolean cupSpin) {
        super(maxRiders, nameOfRide, ticketCost, rideDuration, attendants, utilityCostPerHour, hoursPerDay, speed);
        this.numOfCups = numOfCups;
        this.numOfLaps = numOfLaps;
        this.numOfLaps = numOfLaps;
    }

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
    public boolean getcupSpin() {
        return cupSpin;
    }
    public void setCupSpin(boolean cupSpin) {
        this.cupSpin = cupSpin; 
    }
    
    @Override
    public String rideOutcome() {
        return "You rode the Teacups " + numOfLaps + " times and there were " + numOfCups + " cups!";
    }   

    @Override
    public double calculatePukeFactor() {
        double pukeFactor = 0.0;

        // Base puke factor calculation based on height and laps
        pukeFactor += (numOfCups) * numOfLaps;

        // Increase puke factor if music is on
        if (cupSpin) {
            pukeFactor *= 6.0;
        }

        return pukeFactor;
    }

}


