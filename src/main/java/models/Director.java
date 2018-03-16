package models;

public class Director extends StaffMember{

    private int budget;
    private Team team;

    public Director() {
    }

    public Director(String name, int age, int salary, int budget, Team team) {
        super(name, age, salary);
        this.budget = budget;
        this.team = team;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
