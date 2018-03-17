package models;

import javax.persistence.*;

@Entity
@Table(name = "players")
public class Player extends StaffMember {

    private String position;
    private Team team;

    public Player() {
    }

    public Player(String name, int age, int salary, String position, Team team) {
        super(name, age, salary);
        this.position = position;
        this.team = team;
    }

    @Column(name = "position")
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @ManyToOne
    @JoinColumn(name = "team_id", nullable = false)
    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
