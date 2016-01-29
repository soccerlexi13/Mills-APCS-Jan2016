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
        Player playerA= new Player("A");
        Player playerB= new Player("B");
        Scanner console= new Scanner(System.in);
        System.out.println("Enter moves");
        String gameRolls=console.nextLine();
        boolean isATurn=true;
        for (int i=0; i<=gameRolls.length(); i+=2){
            //int commaIndex=gameRolls.indexOf(",");'
            String nextMove=gameRolls.substring(i,i+1);
            int spacesToMove=Integer.parseInt(nextMove, 10);
            System.out.println(spacesToMove);
            if(isATurn){
                playerA.moveSteps(spacesToMove, playerB);
                isATurn=false;
            }
            else{
                playerB.moveSteps(spacesToMove, playerA);
                isATurn=true;
            }
            System.out.println(playerA+" and "+playerB);
            if(playerA.getLocation()>=40 || playerB.getLocation()>=40){
                break;
            }
        }
        System.out.println(playerA+", "+playerB);
    }
}
