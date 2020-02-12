package scitech;

import java.util.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author tiff2
 */
public class ProjectMainTestClass {
    // COMMENT: These objects will be used to create a ProstheticStatistics that can be injected in PatientStatistics
    private TestProstheticDateSource prostheticDatasource;
    private ProstheticStatistics prostheticStatistics;
    private PatientStatistics patientStatistics;
    private TestPatientDataSource patientDatasource;

    @Before
    public void setup(){
        prostheticDatasource = new TestProstheticDateSource();
        prostheticStatistics = new ProstheticStatistics(prostheticDatasource);

        patientDatasource = new TestPatientDataSource();
        patientStatistics = new PatientStatistics(patientDatasource, prostheticStatistics);
    }

    // COMMENT: I changed the name of this test to indicate it is a negative test, that is it tests a failure case.
    @Test
    public void TestSearchPatientFails() throws Exception{
        String result = patientStatistics.SearchPatient();
        
        assertEquals("Did not receive expected statement: " + result, "This patient does not exist in the directory.", result);
    }

    // COMMENT: Added a positive test. This is an important test to have in your code. You want to make sure the code
    //          does what you think it does.
    //
    //          Since the result is a large string, note how I test the important parts of the string rather than test
    //          the entire string. This makes it easier to see if one value is being reported incorrectly.
    @Test
    public void TestSearchPatientSucceeds() throws Exception{

        patientDatasource.setFirstName("King");
        patientDatasource.setLastName("Midas");
        patientDatasource.setAge(57);
        patientDatasource.setHeight(170);
        patientDatasource.setWeight(122);

        prostheticDatasource.setCircumference(21.0);
        prostheticDatasource.setCircumstances("Amputation");
        prostheticDatasource.setSpecialMaterials("Gold");
        prostheticDatasource.setHaveStump(true);

        patientStatistics.buildPatientArrayList();

        prostheticStatistics.buildProstheticArrayList();

        String result = patientStatistics.SearchPatient();

        assertTrue("Invalid name: " + result, result.contains("Name: King Midas"));
        assertTrue("Invalid age: " + result, result.contains("Age: 57"));
        assertTrue("Invalid height: " + result, result.contains("Height: 170.0cm"));
        assertTrue("Invalid weight: " + result, result.contains("Weight: 122.0kg"));
    }

    // COMMENT: Added another test data source, since we need to create a ProstheticStatistics to inject into the
    //          PatientStatistics object.
    private class TestProstheticDateSource implements ProstheticDataSource {

        private Double circumference;
        private String circumstances;
        private String specialMaterials;
        private Boolean haveStump;

        public void setCircumference(Double circumference) { this.circumference = circumference; }

        public void setCircumstances(String circumstances) { this.circumstances = circumstances; }

        public void setSpecialMaterials(String specialMaterials) { this.specialMaterials = specialMaterials; }

        public void setHaveStump(Boolean haveStump) { this.haveStump = haveStump; }

        @Override
        public double getCircumference() {
            return circumference;
        }

        @Override
        public String getCircumstances() {
            return circumstances;
        }

        @Override
        public String getSpecialMaterials() {
            return specialMaterials;
        }

        @Override
        public boolean getHaveStump() {
            return haveStump;
        }
    }

    private class TestPatientDataSource implements PatientDataSource {

        private String firstname = "";
        private String lastname = "";
        private int age = 0;
        private double height = 0.0;
        private double weight = 0.0;

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

        // COMMENT: I think this should be called getFullName. It could be used for things other than as a search string.
        //          Note that rather than injecting the full name, I construct it here based on the first and last name.
        @Override
        public String searchPatient(){
            return firstname + " " + lastname;
        }
    }
    
}
    


