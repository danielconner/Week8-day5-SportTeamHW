package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "players")
public class Player extends StaffMember {

    private String position;
    private Team team;

    public Player() {
    }

    public Player(String name, int age, int salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    @Column(name = "position")
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
