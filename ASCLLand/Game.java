/**
 * Client Code for ASCLLand Project, uses Player class
 * 
 * @author Alexis Scheerer
 * @version 1/29/16
 */
import java.util.*;
public class Game
{
    public static void main(String[] args){
        //first make both player objects
        Player playerA= new Player();
        Player playerB= new Player();
        //make scanner, take in rolls as input
        Scanner console= new Scanner(System.in);
        System.out.println("Enter moves");
        String gameRolls=console.nextLine();
        //pass rolls as parameter
        playerA.playGame(gameRolls, playerB);
        //print final outcome
        System.out.println("A-"+playerA+", B-"+playerB);
    }
}
