package scitech;
import java.util.Scanner;
/**
 *
 * @author tiff2
 */
public class ProstheticScannerSource implements ProstheticDataSource{

    public static String CIRCUMFERENCE_PROMPT = "Enter the circumference in centimeters: ";
    public static String CIRCUMSTANCES_PROMPT = "Enter the circumstance: ";
    public static String SPECIAL_MATERIALS_PROMPT = "Enter the materials needed due to circumstances: ";
    public static String HAVESTUMP_PROMPT = "Does the patient have a stump? true or false? : ";
    
    Scanner ProstheticInfo = new Scanner (System.in);
    
    @Override
    public double getCircumference() {
        System.out.println(CIRCUMFERENCE_PROMPT);
        return ProstheticInfo.nextDouble();
    }
    
    @Override
    public String getCircumstances(){
        System.out.println(CIRCUMSTANCES_PROMPT);
        return ProstheticInfo.next();
    }

    @Override
    public String getSpecialMaterials() {
        System.out.println(SPECIAL_MATERIALS_PROMPT);
        return ProstheticInfo.next();
    }

    @Override
    public boolean getHaveStump() {
        System.out.println(HAVESTUMP_PROMPT);
        return ProstheticInfo.nextBoolean();
    }
    
    
    
}
