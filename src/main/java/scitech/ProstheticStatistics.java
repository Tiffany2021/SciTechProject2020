package scitech;
import java.util.*;
/**
 *
 * @author tiff2
 */

public class ProstheticStatistics {
    
    private ProstheticDataSource prostheticDataSource;
    
    private List <Double> Circumference = new ArrayList <>();
    private List <Double> Radius = new ArrayList <>();
    private List <String> Circumstances = new ArrayList <>();
    private List <String> SpecialMaterials = new ArrayList <>();
    private List <Boolean> HaveStump = new ArrayList <>();
    
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
        Double circumference = Circumference.get(indexOfProsthetic);
        Double radius = Radius.get(indexOfProsthetic);
        String circumstances = Circumstances.get(indexOfProsthetic);
        String specialMaterials = SpecialMaterials.get(indexOfProsthetic);
        Boolean haveStump = HaveStump.get(indexOfProsthetic);
        
        return String.format("Circumference: %f cm/n" +
                "Radius: %f cm/n" +
                "Circumstances: %s/n" +
                "Special Material needed: %s/n" +
                "Have Stump: %s" +
                circumference, radius, circumstances, specialMaterials, haveStump.toString());
        
    }
    
    
}
