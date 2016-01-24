/**
 * Class defining object for Golf Project
 * 
 * @author Alexis Scheerer 
 * @version 1/22/16
 */
public class GolfScoreCard
{
    int totalScore, totalPar;
    public String holeOutcome(int par, int score){ //finds result of current hole
        totalPar+=par;
        totalScore+=score; //add this round's score and par to the total
        int comparison=par-score;
        if(comparison<0){ //if negative, it will be over par
            if (comparison==-1){
                return("bogey");
            }
            else if(comparison==-2){
                return("double bogey");
            }
            else{
                return(Math.abs(comparison)+" over par");
            }
        }
        else if (comparison>0){ //if positive, it will be under par
            if(comparison==1){
                return("birdie");
            }
            else if(comparison==2){
                return("eagle");
            }
            else{
                return(comparison+" below par");
            }
        }
        else{ //or else it is 0, so par
            return("par");
        }
    }
    public String gameOutcome(){ //returns final outcome of game
        int gameDif=totalPar-totalScore;
        if(gameDif>0){ //if positive, it will be under par
            return(gameDif + " below par");
        }
        else if(gameDif<0){ //if negative, it will be over par
            return(Math.abs(gameDif) + " over par");
        }
        else{ //or else it is 0, so par
            return("par");
        }
    }
}
