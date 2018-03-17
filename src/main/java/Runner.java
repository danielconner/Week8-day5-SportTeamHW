import db.DBHelper;
import models.Director;
import models.FormationType;
import models.Manager;
import models.Player;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Player player1 = new Player("Moussa Dembele", 24, 15000, "Striker");
        Player player2 = new Player("Paddy Roberts", 21, 10000, "Winger");
        Player player3 = new Player("Scott Brown", 32, 8000, "Midfielder");
        Player player4 = new Player("Kieran Tierney", 19, 4000, "Defenders");
        Player player5 = new Player("Craig Gordon", 33, 7000, "GoalKeeper");
        DBHelper.saveOrUpdate(player1);
        DBHelper.saveOrUpdate(player2);
        DBHelper.saveOrUpdate(player3);
        DBHelper.saveOrUpdate(player4);
        DBHelper.saveOrUpdate(player5);

        Manager manager= new Manager("Brendan Rodgers", 48, 30000, FormationType.TIKITAKA);
        DBHelper.saveOrUpdate(manager);

        Director director = new Director("Peter Lawell", 55, 50000, 20000000);
        DBHelper.saveOrUpdate(director);

        List<Player> players = DBHelper.getAll(Player.class);
        List<Manager> managers = DBHelper.getAll(Manager.class);
        List<Director> directors = DBHelper.getAll(Director.class);
    }
}
