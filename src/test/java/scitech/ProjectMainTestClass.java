package scitech;

import java.util.*;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author tiff2
 */
public class ProjectMainTestClass {
    private PatientStatistics patientStatistics;
    private TestPatientDataSource patientDatasource;
    
    @Before
    public void setup(){
        patientDatasource = new TestPatientDataSource();
        patientStatistics = new PatientStatistics(patientDatasource);
    }
    @Test
    public void testListofNames() throws Exception {
        patientDatasource.setFirstName("Iggy");
        patientDatasource.setLastName("Johnson");
        
        ArrayList <String> resultName = new ArrayList <>();
        resultName = patientStatistics.getListofNames();
        
        assertEquals("Did not receive expected name: " + resultName, "Iggy Johnson", resultName);
        
    }
    
    @Test
    public void testListofAges() throws Exception {
        patientDatasource.setAge(25);
        
        ArrayList <Integer> resultAge = new ArrayList <>();
        resultAge = patientStatistics.getListofAges();
        
        assertEquals("Did not receive expected age: " + resultAge, 25, resultAge);
        
    }
    
    @Test
    public void testListofHeights() throws Exception {
        patientDatasource.setHeight(160.0);
        
        ArrayList <Double> resultHeight = new ArrayList <>();
        resultHeight = patientStatistics.getListofHeights();
        
        assertEquals("Did not receive expected height: " + resultHeight, 160.0, resultHeight);
        
    }
    
        @Test
    public void testListofWeight() throws Exception {
        patientDatasource.setWeight(54.0);
        
        ArrayList <Double> resultWeight = new ArrayList <>();
        resultWeight = patientStatistics.getListofWeights();
        
        assertEquals("Did not receive expected weight: " + resultWeight, 54.0, resultWeight);
        
    }
    
        
    private class TestPatientDataSource implements PatientDataSource{

        private String firstname = "";
        private String lastname = "";
        private int age = 0;
        private double height = 0.0;
        private double weight = 0.0;
        private String name = "";
        
        public void setFirstName(String firstname){
            this.firstname = firstname;
        }
        
        public void setLastName(String lastname){
            this.lastname = lastname;
        }
        
        public void setAge(int age){
            this.age = age;
        }
        
        public void setHeight(double height){
            this.height = height;
        }
        
        public void setWeight(double weight){
            this.weight = weight;
        }
        
        public void setSearchPatient(String name){
            this.name = name;
        }
        
        @Override
        public String getFirstName(){
            return firstname;
        }
        
        @Override
        public String getLastName(){
            return lastname;
        }
        
        @Override
        public int getAge(){
            return age;
        }
        
        @Override
        public double getHeight(){
            return height;
        }
        
        @Override
        public double getWeight(){
            return weight;
        }
        
        @Override
        public String searchPatient(){
            return name;
        }

    }
    
}
    


