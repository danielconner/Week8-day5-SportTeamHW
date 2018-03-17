package models;

public class Manager extends StaffMember {

    private FormationType prefferedFormationType;
    private Team team;

    public Manager() {
    }

    public Manager(String name, int age, int salary, FormationType type) {
        super(name, age, salary);
        this.prefferedFormationType = type;
    }

    public String prefferedFormationType() {
        return this.prefferedFormationType.getFormation();
    }

    public void setType(FormationType type) {
        this.prefferedFormationType = type;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
