
/**
 * Client code that creates instances of drumkit
 * 
 * @author Alexis Scheerer
 * @version 1/21/16
 */
public class DrumKitTestDrive
{
    public static void main(String[] args){
        Drumkit d=new Drumkit();
        d.playSnare();
        d.snare=false;
        if(d.snare==true){
            d.playSnare();
        }
        d.playTopHat();
    }
}
