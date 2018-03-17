import models.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PlayerTest {

    Player player;

    @Before
    public void setUp() throws Exception {
        player = new Player("Moussa Dembele", 24, 15000, "Striker");
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
