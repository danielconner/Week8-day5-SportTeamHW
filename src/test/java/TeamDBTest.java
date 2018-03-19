import db.DBHelper;
import models.*;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TeamDBTest {


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
        team = new Team("Celtic", manager, director, "Green/White",68 ,true, competition);
        DBHelper.saveOrUpdate(team);
    }

    @Test
    public void canSave(){
        Team found = DBHelper.find(Team.class, team.getId());
        assertEquals("Celtic", found.getName());
    }

    @Test
    public void canUpdate() {
        Team found = DBHelper.find(Team.class, team.getId());
        found.setLeaguePoints(71);
        DBHelper.saveOrUpdate(found);
        found = DBHelper.find(Team.class, found.getId());
        assertEquals(71, found.getLeaguePoints());
    }

    @Test
    public void canDelete() {
        List<Team> teams = DBHelper.getAll(Team.class);
        assertEquals(1, teams.size());
        DBHelper.delete(team);
        List<Team> teams2 = DBHelper.getAll(Team.class);
        assertEquals(0, teams2.size());
    }
}
