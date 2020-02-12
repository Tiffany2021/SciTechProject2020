package scitech;
import java.util.*;
/**
 *
 * @author tiff2
 */

public class PatientStatistics {
    
    private PatientDataSource patientDatasource;
    // COMMENT: This class uses ProstheticStatistics, so need to inject into the class (don't create in the class)
    private ProstheticStatistics prostheticStatistics;
    // COMMENT: Always make your class data private if possible
    private ArrayList <String> PatientName = new ArrayList <>();
    private ArrayList <Integer> PatientAge = new ArrayList <> ();
    private ArrayList <Double> PatientHeight = new ArrayList <> ();
    private ArrayList <Double> PatientWeight = new ArrayList <> ();

    // COMMENT: Updated constructor to inject ProstheticStatistics
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
        // COMMENT: This is the source of your bug. You were creating new instances of these classes, so not
        //          using the ones create in ProjectMainClass that had data in them.
//        ProstheticDataSource prostheticDatasource = new ProstheticScannerSource();
//        ProstheticStatistics prostheticStatistics = new ProstheticStatistics(prostheticDatasource);

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
