
import models.Director;
import models.FormationType;
import models.Manager;
import models.Team;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TeamTest {

    Team team;
    Manager manager;
    Director director;

    @Before
    public void setUp() throws Exception {
        manager = new Manager("Brendan Rodgers", 48, 30000, FormationType.TIKITAKA);
        director = new Director("Peter Lawell", 55, 50000, 20000000);
        team = new Team("Celtic", manager, director, "Green/White", true);
    }

    @Test
    public void canGetName() {
        assertEquals("Celtic", team.getName());
    }

    @Test
    public void canGetManager() {
        assertEquals("Brendan Rodgers", manager.getName());
    }


    @Test
    public void canGetDirector() {
        assertEquals("Peter Lawell", director.getName());
    }

    @Test
    public void canGetColours() {
        assertEquals("Green/White", team.getColours());
    }

    @Test
    public void canCheckStillInComp(){
        assertTrue("true", team.getInComp());
    }
}
