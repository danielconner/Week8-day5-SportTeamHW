import db.DBHelper;
import models.*;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Competition competition = new Competition("Scottish Cup", "Big Trophy");
        DBHelper.saveOrUpdate(competition);

        Manager manager= new Manager("Brendan Rodgers", 48, 30000, FormationType.TIKITAKA);
        DBHelper.saveOrUpdate(manager);

        Director director = new Director("Peter Lawell", 55, 50000, 20000000);
        DBHelper.saveOrUpdate(director);

        Team team = new Team("Celtic", manager, director, "Green/White", true, competition);
        DBHelper.saveOrUpdate(team);

        Player player1 = new Player("Moussa Dembele", 24, 15000, "Striker", team);
        DBHelper.saveOrUpdate(player1);
        Player player2 = new Player("Paddy Roberts", 21, 10000, "Winger", team);
        DBHelper.saveOrUpdate(player2);
        Player player3 = new Player("Scott Brown", 32, 8000, "Midfielder", team);
        DBHelper.saveOrUpdate(player3);
        Player player4 = new Player("Kieran Tierney", 19, 4000, "Defenders", team);
        DBHelper.saveOrUpdate(player4);
        Player player5 = new Player("Craig Gordon", 33, 7000, "GoalKeeper", team);
        DBHelper.saveOrUpdate(player5);

        player5.setPosition("Bench");
        DBHelper.saveOrUpdate(player5);

        DBHelper.delete(player2);

        List<Player> players = DBHelper.getAll(Player.class);
        List<Manager> managers = DBHelper.getAll(Manager.class);
        List<Director> directors = DBHelper.getAll(Director.class);
        List<Competition> competitions = DBHelper.getAll(Competition.class);
        List<Team> teams = DBHelper.getAll(Team.class);

        List<Player> playersByTeam = DBHelper.getPlayersByTeam(team);
        List<Team> teamsInCompetition = DBHelper.getTeamsInComp(competition);
    }
}
