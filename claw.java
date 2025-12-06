/*
* Name: Group Team Project
* Purpose: Creating a claw ride class that extends from the park class
* that sets the user up to ride the claw and asks for user feedback on the ride
* Programmer: Sham Nemer
* Date: 12 / 07 / 2025
*/
 
// Creating claw class that extends from park class
public class claw extends park {
    // Defining variables
    private int heightOffGround;
    private int numOfLaps;
    private boolean musicOn;
    private boolean isUpsideDown;
    public double pukeFactor = 0.0;
    // Creating constructor
    public claw(int maxRiders, String nameOfRide, double ticketCost, double rideDuration, int attendants, double utilityCostPerHour, double hoursPerDay, double speed, int heightOffGround, int numOfLaps, boolean musicOn, boolean isUpsideDown) {
        super(maxRiders, nameOfRide, ticketCost, rideDuration, attendants, utilityCostPerHour, hoursPerDay, speed);
        this.heightOffGround = heightOffGround;
        this.numOfLaps = numOfLaps;
        this.musicOn = musicOn;
        this.isUpsideDown = isUpsideDown;
    }
    // Creating all the getters and setters
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
    // Creating ride outcome method
    @Override
    public String rideOutcome(int ridesTaken) {
    String outcome;
    // If else statement to determine ride outcome based on puke factor
    if (pukeFactor >= 20) {
        outcome = "You swung on The Claw for " + numOfLaps + " cycles. "
                + "The ride tossed you around and… you puked! Yikes...\n";
    } else {
        outcome = "You swung on The Claw for " + numOfLaps + " cycles. "
                + "You survived the chaos!\n";
    }
    // Adding ASCII art to the outcome
    outcome += getAsciiArt();
    
    return outcome;
    }
 
    // Creating ride art method
    private String getAsciiArt() {
    return
          "            .................. . .  .........            \n" +
          "              ...=**==::::::::-+**###+:........            \n" +
          "           .. .:+######**#++#*+#####+-:=*#*-.... .         \n" +
          "           .-##*++:#-+#+*#**#*+#+:#=.***##+:=#+...         \n" +
          "        . .*++-*####*+=----=+*########*-*=.###=:#: . .     \n" +
          "        ..:+*#+:........-............=######.-###:=..      \n" +
          "       ...*#:. ...-..-..-..-..=..-........=*##*:#*#:.      \n" +
          "        ..*.:  ..=. -..-:.:...=. -...+..-....:+##*-#+.     \n" +
          "        ..#=...:....- .=..=...=..-...+..=.:..:..=#*=#:     \n" +
          "       .. :#..+.+..-...:..=...=..-.. =. =.:..:. ..*#=:     \n" +
          "        ..:.**.::..-..:..:.-+*####*=.-..-..:.::....+#.     \n" +
          "        :: .-.=#-.=...-..=-#########*:. :..:..-=. ==+      \n" +
          "    . .:-..=..+####=:.####-#########*...:..= .=...=*..     \n" +
          "     .-=..+..*####:.-#####+#########*-###*.+..-:*#:-.      \n" +
          "    :*####...:.-*#:..*..=:-#########*+####**#**:+..=.      \n" +
          "    :+###*..:*=:=.. .-..-.-#########***+=*:*###=-. :.      \n" +
          "    ....::.+####-. .--:-:.=########**::..=.#####:: .:.     \n" +
          "    .......:=*##+..-####:*############...-.::....####.     \n" +
          "           ........*####:*############.###-. ...-####*...  \n" +
          "           . . . ........*############.####.....:*+=-:...  \n" +
          "                      ...*############.......              \n" +
          "                      ...*############.......              \n" +
          "                      ...*############..                   \n" +
          "                      ...*############.                    \n" +
          "                      ...*############..                   \n" +
          "        .. ............::*############::............ . ..  \n" +
          "       .-*###########################################*=..  \n" +
          "       .*####+===++******############*******++===+*####.   \n" +
          "       .*##############################################..  \n" +
          "       ..+*#########################################*+-..  \n" +
          "       ..................................................  \n";
}
 
 
   
    // Creating puke factor method
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