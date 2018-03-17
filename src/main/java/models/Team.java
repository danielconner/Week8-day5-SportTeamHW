package models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "teams")
public class Team {

    private int id;
    private String name;
    private Manager manager;
    private Director director;
    private String colours;
    private Boolean inComp;
    private Set<Player> players;
    private Competition competition;

    public Team() {
    }

    public Team(String name, Manager manager, Director director, String colours, Boolean inComp, Competition competition) {
        this.name = name;
        this.manager = manager;
        this.director = director;
        this.colours = colours;
        this.inComp = inComp;
        this.competition = competition;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToOne(fetch = FetchType.EAGER)
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @OneToOne(fetch = FetchType.EAGER)
    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @Column(name = "colours")
    public String getColours() {
        return colours;
    }

    public void setColours(String colours) {
        this.colours = colours;
    }

    @Column(name = "in_competition")
    public Boolean getInComp() {
        return inComp;
    }

    public void setInComp(Boolean inComp) {
        this.inComp = inComp;
    }

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "team")
    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }

    @ManyToOne
    @JoinColumn(name = "competitions_id", nullable = false)
    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }
}
