package scitech;

import java.util.Scanner;

public class ProstheticStatisticsEntry{
    
    public static double circumference;
    
    
    public static void main(String[] args) {


    }
    
    public static void Measurements(){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the measured CIRCUMFERENCE: ");
        circumference = scanner.nextDouble();
        

    }
    
    public static double Circumference() {
        return circumference;
    }

}