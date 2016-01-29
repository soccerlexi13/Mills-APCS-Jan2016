
/**
 * Defines Player object for the ASCLLand game
 * 
 * @author Alexis Scheerer
 * @version 1/29/16
 */
public class Player
{
    private int currentPos;
    private String name;
    public Player(String username){
        currentPos=0;
        name=username;
    }
    public String toString(){
        if (currentPos==0){
            return(name+"-START");
        }
        else if(currentPos>=40){
            return(name+"-END");
        }
        return(name+"-"+currentPos);
    }
    public void moveSteps(int steps, Player otherPlayer){
        if(steps==6 || steps==4){
            if (currentPos-steps<0){
                toStart();
            }
            else{
                currentPos-=steps;
            }
        }
        else{
            currentPos+=steps;
        }
        if (this.currentPos==otherPlayer.getLocation()){
            otherPlayer.toStart();
        }
    }
    public void toStart(){
        currentPos=0;
    }
    public int getLocation(){
        return(currentPos);
    }
}
