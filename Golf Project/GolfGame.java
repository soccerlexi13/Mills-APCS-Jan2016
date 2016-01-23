
/**
 * Client code that creates a GolfScoreCard instance
 * 
 * @author Alexis Scheerer
 * @version 1/22/16
 */
import java.util.*;
public class GolfGame
{
    public static void main(String[] args){
        Scanner scoreGetter=new Scanner(System.in);
        GolfScoreCard player1=new GolfScoreCard();
        for(int i=1; i<=4; i++){
            System.out.println("Please enter the next round's par followed by score");
            int par=scoreGetter.nextInt();
            int score=scoreGetter.nextInt();
            player1.addScore(par, score);
            System.out.println(player1.holeOutcome(par, score));
        }
        System.out.println(player1.gameOutcome());
    }
}
