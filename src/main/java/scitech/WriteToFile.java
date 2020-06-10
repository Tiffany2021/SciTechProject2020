
package scitech;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.nio.charset.Charset;
/**
 *
 * @author tiff2
 */
public class WriteToFile {
    
    public static void main(String[] args){
        
        String name = "Unknown";
        String greeting = "Hey";
        
        if(args.length == 1){
            name = args[0];
        }
        else if(args.length == 2){
            name = args[0];
            greeting = args[1];
        }
        else if(args.length > 2){
            throw new RuntimeException("Too many arguments");
        }
        
        try{
            boolean append = true;
            
            File testFile = FileUtils.getFile("Desktop/ABCD.txt");
            FileUtils.write(testFile, greeting + ", " + name + "\n", Charset.forName("UTF-8"), append);
            
            
        
        }catch (Exception e){
            e.printStackTrace();
        }
        
    }
}
