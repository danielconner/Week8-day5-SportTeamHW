import db.DBHelper;
import models.Competition;
import models.Competition;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CompetitionDBTest {


    Competition competition;

    @Before
    public void setUp() throws Exception {
        competition = new Competition("Scottish Cup", "Big Trophy");
        DBHelper.saveOrUpdate(competition);
    }

    @Test
    public void canSave(){
        Competition found = DBHelper.find(Competition.class, competition.getId());
        assertEquals("Scottish Cup", found.getName());
    }

    @Test
    public void canUpdate() {
        Competition found = DBHelper.find(Competition.class, competition.getId());
        found.setPrize("Small Trophy");
        DBHelper.saveOrUpdate(found);
        found = DBHelper.find(Competition.class, found.getId());
        assertEquals("Small Trophy", found.getPrize());
    }

    @Test
    public void canDelete() {
        List<Competition> comps = DBHelper.getAll(Competition.class);
        assertEquals(1, comps.size());
        DBHelper.delete(competition);
        List<Competition> comps2 = DBHelper.getAll(Competition.class);
        assertEquals(0, comps2.size());
    }
}
