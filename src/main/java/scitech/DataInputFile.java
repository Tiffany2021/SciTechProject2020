package scitech;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.nio.charset.Charset;
/**
 *
 * @author tiff2
 */
public class DataInputFile {

    public static void main(String args[]){
        
        String firstName = "Unknown";
        String lastName = "Unknown";
        String age = "N/A";
        
        
    }
    private final String firstName;
    private final String lastName;
    private final int age;
    private double height;
    private double weight;
    private PatientDataSource patientDataSource;
    private File file;
    private Formatter x;
    
    DataInputFile(PatientDataSource patientDataSource){
        this.firstName = patientDataSource.getFirstName();
        this.lastName = patientDataSource.getLastName();
        this.age = patientDataSource.getAge();
        this.height = patientDataSource.getHeight();
        this.weight = patientDataSource.getWeight();
        
    }
    
    public void saveDataInput(){

        try{
            x = new Formatter("DataSheet.txt");
        }catch(Exception e){
            e.printStackTrace();
        }
        x.format("Name: %s %s", firstName, lastName);
        x.close();
    }
}
