package models;

import javax.persistence.*;

@Entity
@Table(name = "managers")
public class Manager extends StaffMember {

    private FormationType prefferedFormationType;
    private Team team;

    public Manager() {
    }

    public Manager(String name, int age, int salary, FormationType type) {
        super(name, age, salary);
        this.prefferedFormationType = type;
    }

    @Column(name = "formation")
    public String prefferedFormationType() {
        return this.prefferedFormationType.getFormation();
    }

    public void setType(FormationType type) {
        this.prefferedFormationType = type;
    }

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "manager")
    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
