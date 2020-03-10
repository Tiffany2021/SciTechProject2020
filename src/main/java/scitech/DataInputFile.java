package scitech;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author tiff2
 */
public class DataInputFile {

    private final String firstName;

    DataInputFile(String FirstName){
        this.firstName = FirstName;
        
    }
    
    private void saveDataInput(){

        try{
            File newFile = new File("C:\\Users\\bluel\\projects\\SciTechProject2020\\DataSheet.txt");
            BufferedWriter out = new BufferedWriter(new FileWriter(newFile));     
            out.write("Name: " + firstName);
            
        
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
