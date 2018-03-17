package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "directors")
public class Director extends StaffMember{

    private int budget;
    private Team team;

    public Director() {
    }

    public Director(String name, int age, int salary, int budget) {
        super(name, age, salary);
        this.budget = budget;
    }

    @Column(name = "budget")
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
