package models;

import java.util.Set;

public class Team {

    private int id;
    private String name;
    private Manager manager;
    private Director director;
    private String colours;
    private Boolean inComp;
    private Set<Player> players;

    public Team() {
    }

    public Team(String name, Manager manager, Director director, String colours, Boolean inComp) {
        this.name = name;
        this.manager = manager;
        this.director = director;
        this.colours = colours;
        this.inComp = inComp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public String getColours() {
        return colours;
    }

    public void setColours(String colours) {
        this.colours = colours;
    }

    public Boolean getInComp() {
        return inComp;
    }

    public void setInComp(Boolean inComp) {
        this.inComp = inComp;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Player> players) {
        this.players = players;
    }
}
