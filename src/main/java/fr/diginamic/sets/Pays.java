package fr.diginamic.sets;

public class Pays {
    private String nom;
    private int nbHabitants;
    private double pibParHabitant;

    public Pays(String nom, int nbHabitants, double pibParHabitant) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
        this.pibParHabitant = pibParHabitant;
    }

    public String getNom() {
        return nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    public double getPibParHabitant() {
        return pibParHabitant;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbHabitants(int nbHabitants) {
        this.nbHabitants = nbHabitants;
    }

    public void setPibParHabitant(double pibParHabitant) {
        this.pibParHabitant = pibParHabitant;
    }
}
