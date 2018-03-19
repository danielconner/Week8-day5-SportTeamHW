import db.DBHelper;
import models.*;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PlayerDBTest {

    Player player;
    Team team;
    Manager manager;
    Director director;
    Competition competition;

    @Before
    public void setUp() throws Exception {
        competition = new Competition("Scottish Cup", "Big Trophy");
        DBHelper.saveOrUpdate(competition);
        manager = new Manager("Brendan Rodgers", 48, 30000, FormationType.TIKITAKA);
        DBHelper.saveOrUpdate(manager);
        director = new Director("Peter Lawell", 55, 50000, 20000000);
        DBHelper.saveOrUpdate(director);
        team = new Team("Celtic", manager, director, "Green/White", 67, true, competition);
        DBHelper.saveOrUpdate(team);
        player = new Player("Moussa Dembele", 24, 15000, "Striker", team);
        DBHelper.saveOrUpdate(player);
    }

    @Test
    public void canSave(){
        Player found = DBHelper.find(Player.class, player.getId());
        assertEquals("Moussa Dembele", found.getName());
    }

    @Test
    public void canUpdate() {
        Player found = DBHelper.find(Player.class, player.getId());
        found.setAge(21);
        DBHelper.saveOrUpdate(found);
        found = DBHelper.find(Player.class, found.getId());
        assertEquals(21, found.getAge());
    }

    @Test
    public void canDelete() {
        List<Player> players = DBHelper.getAll(Player.class);
        assertEquals(1, players.size());
        DBHelper.delete(player);
        List<Player> players2 = DBHelper.getAll(Player.class);
        assertEquals(0, players2.size());
    }
}
