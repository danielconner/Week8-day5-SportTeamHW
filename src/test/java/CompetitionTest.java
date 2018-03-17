import models.Competition;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CompetitionTest {

    Competition competition;

    @Before
    public void setUp() throws Exception {
        competition = new Competition("Scottish Cup", "Big Trophy");
    }

    @Test
    public void canGetName() {
        assertEquals("Scottish Cup", competition.getName());
    }

    @Test
    public void canGetPrize() {
        assertEquals("Big Trophy", competition.getPrize());
    }
}
