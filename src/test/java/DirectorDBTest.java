import db.DBHelper;
import models.Director;
import models.Director;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class DirectorDBTest {

    Director director;

    @Before
    public void setUp() throws Exception {
        director = new Director("Peter Lawell", 55, 50000, 20000000);
        DBHelper.saveOrUpdate(director);
    }

    @Test
    public void canSave(){
        Director found = DBHelper.find(Director.class, director.getId());
        assertEquals("Peter Lawell", found.getName());
    }

    @Test
    public void canUpdate() {
        Director found = DBHelper.find(Director.class, director.getId());
        found.setAge(56);
        DBHelper.saveOrUpdate(found);
        found = DBHelper.find(Director.class, found.getId());
        assertEquals(56, found.getAge());
    }

    @Test
    public void canDelete() {
        List<Director> directors = DBHelper.getAll(Director.class);
        assertEquals(1, directors.size());
        DBHelper.delete(director);
        List<Director> directors2 = DBHelper.getAll(Director.class);
        assertEquals(0, directors2.size());
    }
}
