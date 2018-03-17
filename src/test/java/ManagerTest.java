import models.FormationType;
import models.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void setUp() throws Exception {
        manager = new Manager("Brendan Rodgers", 48, 30000, FormationType.TIKITAKA);
    }

    @Test
    public void canGetName() {
        assertEquals("Brendan Rodgers", manager.getName());
    }

    @Test
    public void canGetAge() {
        assertEquals(48, manager.getAge());
    }

    @Test
    public void canGetSalary() {
        assertEquals(30000, manager.getSalary());
    }

    @Test
    public void canGetPrefferedFormation() {
        assertEquals("433", manager.prefferedFormationType());
    }
}
