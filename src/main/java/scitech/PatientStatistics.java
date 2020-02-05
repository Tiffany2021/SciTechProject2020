package scitech;
import java.util.*;
import java.util.Scanner;
/**
 *
 * @author tiff2
 */

public class PatientStatistics {
    
    private PatientDataSource patientDatasource;
    ArrayList <String> PatientNames = new ArrayList <>();
    ArrayList <Integer> PatientAge = new ArrayList <> ();
    ArrayList <Double> PatientHeight = new ArrayList <> ();
    ArrayList <Double> PatientWeight = new ArrayList <> ();
    Scanner affirmative = new Scanner(System.in);
    
    public PatientStatistics(PatientDataSource patientDatasource){
        this.patientDatasource = patientDatasource;
    }
    
    public void buildArrayList (){
        String endstatement = null;
        do{
            PatientNames.add(patientDatasource.getFirstName() + " " + patientDatasource.getLastName());
            PatientAge.add(patientDatasource.getAge());
            PatientHeight.add(patientDatasource.getHeight());
            PatientWeight.add(patientDatasource.getWeight());
            System.out.println("Do you wish to add another patient? Yes or No?");
            endstatement = affirmative.next();
            System.out.println();
        }while(endstatement.equals("Yes")|| endstatement.equals("yes"));
       
        for(int i = 0; i < PatientNames.size(); i++){
            System.out.println("Patient's Name: " + PatientNames.get(i));
            System.out.println("Patient's Age: " + PatientAge.get(i));
            System.out.println("Patient's Height: " + PatientHeight.get(i));
            System.out.println("Patient's Weight: " + PatientWeight.get(i));
            System.out.println();
        }

    }
    
    

}
