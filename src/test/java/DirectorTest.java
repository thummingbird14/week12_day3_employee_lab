import org.junit.Before;
import org.junit.Test;
import staff.managment.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    
    Director director;
    
    @Before
    public void before(){
        director = new Director("John Smith", "NP333333S", 100000, "Finance", 5000000);
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(500);
        assertEquals(100500, director.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1000, director.payBonus(), 0.0);
    }
}
