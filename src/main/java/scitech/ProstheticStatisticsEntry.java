package scitech;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author tiff2
 */
public class ProstheticStatisticsEntry {
    
    Scanner stat = new Scanner(System.in);
    ArrayList<Double> CircumferenceData = new ArrayList();
    
    ProstheticStatisticsEntry(){
        
    }
    
    public void dataCircumferenceEntry(){
        
        System.out.println("Enter the circumference: ");
        double circumference = stat.nextDouble();
        
        CircumferenceData.add(circumference);
        
        for(double datapoints : CircumferenceData){
            System.out.println("Circumference: " + datapoints);
        }
    }
}
