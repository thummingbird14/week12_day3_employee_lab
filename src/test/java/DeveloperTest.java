import org.junit.Before;
import org.junit.Test;
import staff.techstaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    
    Developer developer;
    
    @Before
    public void before(){
        developer = new Developer("Tanya Purcell", "NP111111D", 40000);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(500);
        assertEquals(40500, developer.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(400, developer.payBonus(), 0.0);
    }
}
