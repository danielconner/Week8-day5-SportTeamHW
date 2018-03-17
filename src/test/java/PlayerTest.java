import models.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PlayerTest {

    Player player;
    Team team;
    Manager manager;
    Director director;
    Competition competition;

    @Before
    public void setUp() throws Exception {
        competition = new Competition("Scottish Cup", "Big Trophy");
        manager = new Manager("Brendan Rodgers", 48, 30000, FormationType.TIKITAKA);
        director = new Director("Peter Lawell", 55, 50000, 20000000);
        team = new Team("Celtic", manager, director, "Green/White", true, competition);
        player = new Player("Moussa Dembele", 24, 15000, "Striker", team);
    }

    @Test
    public void canGetName() {
        assertEquals("Moussa Dembele", player.getName());
    }

    @Test
    public void canGetAge() {
        assertEquals(24, player.getAge());
    }

    @Test
    public void canGetSalary() {
        assertEquals(15000, player.getSalary());
    }

    @Test
    public void canGetPosition() {
        assertEquals("Striker", player.getPosition());
    }
}
