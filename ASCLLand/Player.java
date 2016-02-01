
/**
 * Defines Player object for the ASCLLand game
 * 
 * @author Alexis Scheerer
 * @version 1/29/16
 */
public class Player
{
    private int currentPos;
    public Player(){
        currentPos=0; //initial position is 0, no need for getPos because only
        //used in this class
    }
    public String toString(){
        if (currentPos==0){
            return("START"); //if 0 string is START when return
        }
        else if(currentPos>=40){
            return("END"); //if at end or past, string is END
        }
        return(Integer.toString(currentPos)); //if not at start or end, return pos
    }
    public void playGame(String gameRolls, Player playerB){
        boolean isATurn=true; //variable to make changing turns easier
        for (int i=0; i<=gameRolls.length(); i+=2){
            String nextMove=gameRolls.substring(i,i+1);
            int spacesToMove=Integer.parseInt(nextMove, 10);
            if(isATurn){ //checks if a or b, then moves for that person
                this.moveSteps(spacesToMove, playerB);
                isATurn=false;
            }
            else{
                playerB.moveSteps(spacesToMove, this);
                isATurn=true;
            }
            if(this.currentPos>=40 || playerB.currentPos>=40){
                break; //if someone has won the game, break before moving again
            }
        }
    }
    private void moveSteps(int steps, Player otherPlayer){
        if(steps==6 || steps==4){ //game rule: if 6 or 4, subtract
            if (currentPos-steps<0){ //make sure doesn't end on - space
                toStart();
            }
            else{
                currentPos-=steps;
            }
        }
        else{
            currentPos+=steps;
        }
        if (this.currentPos==otherPlayer.currentPos){
            otherPlayer.toStart(); //rule: if land on other, other goes to start
        }
    }
    private void toStart(){ //clearer when player goes to start
        currentPos=0;
    }
}
