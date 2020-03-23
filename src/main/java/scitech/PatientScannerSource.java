package scitech;
import java.text.*;
import java.util.*;
/**
 *
 * @author tiff2
 */

public class PatientScannerSource implements PatientDataSource{
    
    public static String FIRSTNAME_PROMPT = "Enter the patient's first name: ";
    public static String LASTNAME_PROMPT = "Enter the patient's last name: ";
    public static String AGE_PROMPT = "Enter the patient's age: ";
    public static String HEIGHT_PROMPT = "Enter the patient's height in centimeters: ";
    public static String WEIGHT_PROMPT = "Enter the patient's weight in kilograms: ";
    public static String SEARCH_FirstNAME_PROMPT = "Enter the first name of the patient needed: ";
    public static String SEARCH_LastNAME_PROMPT = "Enter the last name of the patient needed: ";
    
    Scanner PatientInfo = new Scanner(System.in);

    @Override
    public  String getFirstName(){
        System.out.println(FIRSTNAME_PROMPT);
        return PatientInfo.next();
    }
    
    @Override
    public String getLastName(){
        System.out.println(LASTNAME_PROMPT);
        return PatientInfo.next();
    }
    
    @Override
    public int getAge(){
        System.out.println(AGE_PROMPT);
        return PatientInfo.nextInt();
    }
    
    @Override
    public double getHeight(){
        System.out.println(HEIGHT_PROMPT);
        return PatientInfo.nextDouble();
    }
    
    @Override
    public double getWeight(){
        System.out.println(WEIGHT_PROMPT);
        return PatientInfo.nextDouble();
    }
    
//    @Override
//    public String searchPatient(){
//        System.out.println(SEARCH_FirstNAME_PROMPT);
//        String FirstName = PatientInfo.next();
//        System.out.println(SEARCH_LastNAME_PROMPT);
//        String LastName = PatientInfo.next();
//        return FirstName + " " + LastName;
//    }
//    
}
