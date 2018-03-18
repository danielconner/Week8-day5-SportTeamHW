import db.DBHelper;
import models.*;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Competition competition = new Competition("Scottish Cup", "Big Trophy");
        DBHelper.saveOrUpdate(competition);

        Manager manager1= new Manager("Brendan Rodgers", 48, 30000, FormationType.TIKITAKA);
        DBHelper.saveOrUpdate(manager1);
        Manager manager2 = new Manager("Graeme Murty", 45, 10000, FormationType.POSSESION);
        DBHelper.saveOrUpdate(manager2);
        Manager manager3 = new Manager("Derek MacInnes", 41, 5000, FormationType.ATTACK);
        DBHelper.saveOrUpdate(manager3);


        Director director1 = new Director("Peter Lawell", 55, 50000, 20000000);
        DBHelper.saveOrUpdate(director1);
        Director director2 = new Director("Dave King", 60, 30000, 1000000);
        DBHelper.saveOrUpdate(director2);
        Director director3 = new Director("Steve Thompson",39 ,2000 , 300000);
        DBHelper.saveOrUpdate(director3);

        Team team1 = new Team("Celtic", manager1, director1, "Green/White",78 , true, competition);
        DBHelper.saveOrUpdate(team1);
        Team team2 = new Team("Rangers", manager2, director2, "Blue", 56, true, competition);
        DBHelper.saveOrUpdate(team2);
        Team team3 = new Team("Aberdeen", manager3, director3, "Red", 65, true, competition);
        DBHelper.saveOrUpdate(team3);

        Player player1 = new Player("Moussa Dembele", 24, 15000, "Striker", team1);
        DBHelper.saveOrUpdate(player1);
        Player player2 = new Player("Paddy Roberts", 21, 10000, "Winger", team1);
        DBHelper.saveOrUpdate(player2);
        Player player3 = new Player("Scott Brown", 32, 8000, "Midfielder", team1);
        DBHelper.saveOrUpdate(player3);
        Player player4 = new Player("Kieran Tierney", 19, 4000, "Defenders", team1);
        DBHelper.saveOrUpdate(player4);
        Player player5 = new Player("Craig Gordon", 33, 7000, "GoalKeeper", team1);
        DBHelper.saveOrUpdate(player5);

        player5.setPosition("Bench");
        DBHelper.saveOrUpdate(player5);

        DBHelper.delete(player2);

        List<Player> players = DBHelper.getAll(Player.class);
        List<Manager> managers = DBHelper.getAll(Manager.class);
        List<Director> directors = DBHelper.getAll(Director.class);
        List<Competition> competitions = DBHelper.getAll(Competition.class);
        List<Team> teams = DBHelper.getAll(Team.class);

        List<Player> playersByTeam = DBHelper.getPlayersByTeam(team1);
        List<Team> teamsInCompetition = DBHelper.getTeamsInComp(competition);

        List<Team> sortByLeaguePoints = DBHelper.sortByLeaguePoints();
    }
}
