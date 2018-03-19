import db.DBHelper;
import models.FormationType;
import models.Manager;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ManagerDBTest {

    Manager manager1;

    @Before
    public void setUp() throws Exception {
        manager1 = new Manager("Brendan Rodgers", 48, 30000, FormationType.TIKITAKA);
        DBHelper.saveOrUpdate(manager1);
    }

    @Test
    public void canSave(){
        Manager found = DBHelper.find(Manager.class, manager1.getId());
        assertEquals("Brendan Rodgers", found.getName());
    }

    @Test
    public void canUpdate() {
        Manager found = DBHelper.find(Manager.class, manager1.getId());
        found.setAge(49);
        DBHelper.saveOrUpdate(found);
        found = DBHelper.find(Manager.class, found.getId());
        assertEquals(49, found.getAge());
    }

    @Test
    public void canDelete() {
        List<Manager> managers = DBHelper.getAll(Manager.class);
        assertEquals(1, managers.size());
        DBHelper.delete(manager1);
        List<Manager> managers2 = DBHelper.getAll(Manager.class);
        assertEquals(0, managers2.size());
    }
}
