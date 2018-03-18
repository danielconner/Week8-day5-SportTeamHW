import db.DBHelper;
import models.FormationType;
import models.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerDBTest {

    Manager manager;

    @Before
    public void setUp() throws Exception {
        manager = new Manager("Brendan Rodgers", 48, 30000, FormationType.TIKITAKA);
    }

    @Test
    public void canSave(){
        Manager found = DBHelper.find(Manager.class, manager.getId());
        assertEquals("Brendan Rodgers", found.getName());
    }

    @Test
    public void canUpdate() {
        Manager found = DBHelper.find(Manager.class, manager.getId());
        found.setAge(49);
        DBHelper.saveOrUpdate(found);
        found = DBHelper.find(Manager.class, found.getId());
        assertEquals(49, found.getAge());
    }

}
