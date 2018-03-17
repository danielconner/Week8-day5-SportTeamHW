import models.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void setUp() throws Exception {
        director = new Director("Peter Lawell", 55, 50000, 20000000);
    }

    @Test
    public void canGetName() {
        assertEquals("Peter Lawell", director.getName());
    }

    @Test
    public void canGetAge() {
        assertEquals(55, director.getAge());
    }

    @Test
    public void canGetSalary() {
        assertEquals(50000, director.getSalary());
    }

    @Test
    public void canGetBudget() {
        assertEquals(20000000, director.getBudget());
    }
}
