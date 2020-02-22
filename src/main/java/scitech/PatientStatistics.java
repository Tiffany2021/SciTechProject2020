package scitech;
import java.util.*;
/**
 *
 * @author tiff2
 */

public class PatientStatistics {
    
    private PatientDataSource patientDatasource;
    private ProstheticStatistics prostheticStatistics;
    
    private ArrayList <String> PatientName = new ArrayList <>();
    private ArrayList <Integer> PatientAge = new ArrayList <> ();
    private ArrayList <Double> PatientHeight = new ArrayList <> ();
    private ArrayList <Double> PatientWeight = new ArrayList <> ();
    
    
    public PatientStatistics(PatientDataSource patientDatasource, ProstheticStatistics prostheticStatistics){
        this.patientDatasource = patientDatasource;
        this.prostheticStatistics = prostheticStatistics;
    }
    
    public void buildPatientArrayList (){

            PatientName.add(patientDatasource.getFirstName() + " " + patientDatasource.getLastName());
            PatientAge.add(patientDatasource.getAge());
            PatientHeight.add(patientDatasource.getHeight());
            PatientWeight.add(patientDatasource.getWeight());

    }
    
    public String SearchPatient(){
        
        String nameNeeded = patientDatasource.searchPatient();
        
        for(int i = 0; i < PatientName.size(); i++){
            if((PatientName.get(i)).equals(nameNeeded)){
                prostheticStatistics.SearchProsthetic(i);
                return "Name: " + PatientName.get(i) + "\n" +
                        "Age: " + PatientAge.get(i) + "\n" +
                        "Height: " + PatientHeight.get(i) + "cm" + "\n" +
                        "Weight: " + PatientWeight.get(i) + "kg" + "\n";
                
            }
        }
        
        return "This patient does not exist in the directory.";

    }
    
}
