package scitech;
import java.util.*;
import java.util.Scanner;
/**
 *
 * @author tiff2
 */

public class PatientStatistics {
    
    private PatientDataSource patientDatasource;
    ArrayList <String> PatientName = new ArrayList <>();
    ArrayList <Integer> PatientAge = new ArrayList <> ();
    ArrayList <Double> PatientHeight = new ArrayList <> ();
    ArrayList <Double> PatientWeight = new ArrayList <> ();
    Scanner affirmative = new Scanner(System.in);
    
    public PatientStatistics(PatientDataSource patientDatasource){
        this.patientDatasource = patientDatasource;
    }
    
    public String buildArrayList (){
        String endstatement = null;
        do{
            PatientName.add(patientDatasource.getFirstName() + " " + patientDatasource.getLastName());
            PatientAge.add(patientDatasource.getAge());
            PatientHeight.add(patientDatasource.getHeight());
            PatientWeight.add(patientDatasource.getWeight());
            System.out.println("Do you wish to add another patient? Yes or No?");
            endstatement = affirmative.next();
            System.out.println();
        }while(endstatement.equals("Yes")|| endstatement.equals("yes"));
        
        String nameNeeded = patientDatasource.searchPatient();
        
        for(int i = 0; i < PatientName.size(); i++){
            if((PatientName.get(i)).equals(nameNeeded)){
                return "Name: " + PatientName.get(i) + "\n" +
                        "Age: " + PatientAge.get(i) + "\n" +
                        "Height: " + PatientHeight.get(i) + "\n" +
                        "Weight: " + PatientWeight.get(i) + "\n";
            }
        }
        
        return "That patient does not have a entry in the database.";
        
        
       
    }
    
    public ArrayList getListofNames(){
        return PatientName;
    }
    
    public ArrayList getListofAges(){
        return PatientAge;
    }
    
    public ArrayList getListofHeights(){
        return PatientHeight;
    }
    
    public ArrayList getListofWeights(){
        return PatientWeight;
    }

}
