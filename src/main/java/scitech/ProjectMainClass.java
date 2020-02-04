package scitech;

import java.util.Scanner;

public class ProjectMainClass{
    
    public static void main(String[] args) {
        
        
        ProstheticStatisticsEntry ProstheticStatisticsEntry = new ProstheticStatisticsEntry();
        ProstheticStatisticsEntry.dataCircumferenceEntry();
        
        PatientStatisticsEntry PatientStatisticsEntry = new PatientStatisticsEntry();
        Scanner patientinfo = new Scanner(System.in);
        String endstatement = null;

        do{
            System.out.println("Enter patient's name: ");
            String name = patientinfo.nextLine();
            
            System.out.println("Enter patient's age: ");
            int age = patientinfo.nextInt();
            
            PatientStatisticsEntry.PatientInfo(name, age);
            
            System.out.println("Enter 'End' to quit.");
            endstatement = patientinfo.nextLine();
            
            
        }while(endstatement == "End"|| endstatement.equals("end"));

    }

}