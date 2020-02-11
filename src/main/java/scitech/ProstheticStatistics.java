package scitech;
import java.util.*;
/**
 *
 * @author tiff2
 */

public class ProstheticStatistics {
    
    private ProstheticDataSource prostheticDataSource;
    ArrayList <Double> Circumference = new ArrayList <>();
    ArrayList <Double> Radius = new ArrayList <>();
    ArrayList <String> Circumstances = new ArrayList <>();
    ArrayList <String> SpecialMaterials = new ArrayList <>();
    ArrayList <Boolean> HaveStump = new ArrayList <>();
    
    public ProstheticStatistics(ProstheticDataSource prostheticDataSource){
        this.prostheticDataSource = prostheticDataSource;
    }
    
    public void buildProstheticArrayList(){
        
        double circumference = prostheticDataSource.getCircumference();
        Circumference.add(circumference);
        Radius.add(circumference/(2*Math.PI));
        Circumstances.add(prostheticDataSource.getCircumstances());
        SpecialMaterials.add(prostheticDataSource.getSpecialMaterials());
        HaveStump.add(prostheticDataSource.getHaveStump());
        
    }
    
    public String SearchProsthetic(int indexOfProsthetic){
        
        return "Circumference: " + Circumference.get(indexOfProsthetic) + "cm" + "/n" +
                "Radius: " + Radius.get(indexOfProsthetic) + "cm" + "/n" +
                "Circumstances: " + Circumstances.get(indexOfProsthetic) + "/n" +
                "Special Material needed: " + SpecialMaterials.get(indexOfProsthetic) + "/n" +
                "Have Stump: " + HaveStump.get(indexOfProsthetic);
        
    }
    
    
}
