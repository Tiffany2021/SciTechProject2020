package scitech;

import java.util.*;
import java.lang.*;
import java.io.*;

/**
 *
 * @author tiff2
 */
public class DataInputFile {

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
