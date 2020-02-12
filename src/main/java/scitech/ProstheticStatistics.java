package scitech;
import java.util.*;
/**
 *
 * @author tiff2
 */

public class ProstheticStatistics {
    
    private ProstheticDataSource prostheticDataSource;
    // COMMENT: Make your internal data private if possible.
    //          Also, when possible, make the data type of the variable as generic as possible. An ArrayList is a List,
    //          so declare the variable as a List. There are some exceptions to this rule, but this should always be
    //          your starting tactic.
    private List<Double> Circumference = new ArrayList <>();
    private List<Double> Radius = new ArrayList <>();
    private List<String> Circumstances = new ArrayList <>();
    private List<String> SpecialMaterials = new ArrayList <>();
    private List<Boolean> HaveStump = new ArrayList <>();
    
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

        // COMMENT: Try not to do too much work on one line, makes it harder to figure out where an error is.
        //          In this case, I am getting each variable on a separate line, then using String.format(...) to create
        //          the output. This method on String is very powerful and one of my favorites. Next time we talk, let's
        //          review how to use it. But the important thing is getting each variable on a separate line.
        Double circumference = Circumference.get(indexOfProsthetic);
        Double radius = Radius.get(indexOfProsthetic);
        String circumstances = Circumstances.get(indexOfProsthetic);
        String specialMaterials = SpecialMaterials.get(indexOfProsthetic);
        Boolean haveStump = HaveStump.get(indexOfProsthetic);

        return String.format("Circumference: %f cm/n" +
                "Radius: %f cm/n" +
                "Circumstances: %s/n" +
                "Special Material needed: %s/n" +
                "Have Stump: %s",
                circumference, radius, circumstances, specialMaterials, haveStump.toString());
    }
    
    
}
