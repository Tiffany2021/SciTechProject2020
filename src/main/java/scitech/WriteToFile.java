
package scitech;
import org.apache.commons.io.FileUtils;
import java.io.File;
/**
 *
 * @author tiff2
 */
public class WriteToFile {
    
    public static void main(String[] args){
        
        String name = "Unknown";
        
        if(args.length > 0){
            name = args[0];
        }
        
        try{
            
            File testFile = FileUtils.getFile("Desktop/ABCD.txt");
            FileUtils.write(testFile, "Hello again, " + name);
        
        }catch (Exception e){
            e.printStackTrace();
        }
        
    }
}
