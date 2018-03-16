package models;

public enum FormationType {

    ATTACK("424"),
    POSSESION("451"),
    TIKITAKA("433"),
    DEFENCESIVE("541");

    private final String formation;

    FormationType(String formation) {
        this.formation = formation;
    }

    public String getFormation() {
        return formation;
    }
}
