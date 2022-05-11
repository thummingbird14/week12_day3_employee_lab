import org.junit.Before;
import org.junit.Test;
import staff.managment.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Fred Bloggs", "NP999999D", 50000, "Marketing");
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(500);
        assertEquals(50500, manager.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(500, manager.payBonus(), 0.0);
    }
}
