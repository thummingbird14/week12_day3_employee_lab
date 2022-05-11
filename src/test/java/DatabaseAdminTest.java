import org.junit.Before;
import org.junit.Test;
import staff.techstaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    
    DatabaseAdmin databaseAdmin;
    
    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Fiona Jone", "NP888888R", 35000);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(500);
        assertEquals(35500, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canPayBonus(){
        assertEquals(350, databaseAdmin.payBonus(), 0.0);
    }
}
