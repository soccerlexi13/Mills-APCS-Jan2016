package activity3;

/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Alexis Scheerer
 * @version January 14, 2016
 */
public class StringExplorer
{

    public static void main(String[] args)
    {
        String sample = "The quick brown fox jumped over the lazy dog.";
        
        //  Demonstrate the indexOf method.
        int position = sample.indexOf("quick");
        System.out.println ("sample.indexOf(\"quick\") = " + position);
        
        //  Demonstrate the toLowerCase method.
        String lowerCase = sample.toLowerCase();
        System.out.println ("sample.toLowerCase() = " + lowerCase);
        System.out.println ("After toLowerCase(), sample = " + sample);
        
        //  Try other methods here:
        int notFoundPsn = sample.indexOf("slow");
        System.out.println("sample.indexOf(\"slow\") = " + notFoundPsn);
        int indexOfSecPar= sample.indexOf("quick", 13);
        System.out.println("sample.indexOf(\"quick\", 13) = " + indexOfSecPar);
        indexOfSecPar= sample.indexOf("quick", 2);
        System.out.println("sample.indexOf(\"quick\", 2) = " + indexOfSecPar);
    }

}
