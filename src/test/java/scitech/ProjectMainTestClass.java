package scitech;

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
    
//    @Test
//    public void testbuildArrayList() throws Exception {
//        patientDatasource.setName("Iggy");
//        patientDatasource.setAge(25);

//        String result = greeter.sayHappyBirthday();

//        assertEquals("Did not receive expected greeting: " + result, "Happy Birthday, Iggy! You are 25 years old!", result);
//    }
    
    
}
