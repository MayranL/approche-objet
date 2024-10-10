package fr.diginamic.listes;

import fr.diginamic.tri.Comparable;

public class Ville implements Comparable<Ville> {
    private String nom;
    private int nbHabitants;

    public Ville(String nom, int nbHabitants) {
        this.nom = nom;
        this.nbHabitants = nbHabitants;
    }

    public String getNom() {
        return nom;
    }

    public int getNbHabitants() {
        return nbHabitants;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // Implémentation de compareTo pour trier par nb d'habitants
    /*@Override
    public int compareTo(Ville autreVille) {
        return Integer.compare(this.nbHabitants, autreVille.nbHabitants);
    }*/

    //  Implémentation de compareTo pour trier par nom
    @Override
    public int compareTo(Ville autreVille) {
        return this.nom.compareTo(autreVille.nom);
    }


    public void setNbHabitants(int nbHabitants) {
        this.nbHabitants = nbHabitants;
    }
}
