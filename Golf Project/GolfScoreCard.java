
/**
 * Class defining object for Golf Project
 * 
 * @author Alexis Scheerer 
 * @version 1/22/16
 */
public class GolfScoreCard
{
    int totalScore, totalPar;
    public void addScore(int par, int score){
        totalPar+=par;
        totalScore+=score;
    }
    public String holeOutcome(int par, int score){
        int comparison=par-score;
        if(comparison<0){
            if (comparison==-1){
                return("bogey");
            }
            else if(comparison==-2){
                return("double bogey");
            }
            else{
                return(comparison+" above par");
            }
        }
        else if (comparison>0){
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
        else{
            return("par");
        }
    }
    public String gameOutcome(){
        return(holeOutcome(totalPar, totalScore));
    }
}
