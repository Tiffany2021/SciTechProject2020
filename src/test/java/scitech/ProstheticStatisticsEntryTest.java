package scitech;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author tiff2
 */
public class ProstheticStatisticsEntryTest {
    private static ProstheticStatisticsEntry stat;
            
    double circumference = ProstheticStatisticsEntry.Circumference();
    
    @BeforeClass
    public static void setup(){
        stat = new ProstheticStatisticsEntry();
    }
    
    @Test
    public void testSayHello() throws Exception {
        double result = stat.Circumference();
        
        assertEquals("Did not receive expected measurement: " + result, circumference, result);
    }
    
}
