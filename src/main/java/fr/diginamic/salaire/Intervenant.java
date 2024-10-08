package fr.diginamic.salaire;

public abstract class Intervenant {
    private String nom;
    private String prenom;

    public Intervenant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public abstract double getSalaire();

    public String afficherDonnees(){
        return "Nom : "+this.nom+ " et son prénom : "+this.prenom;
    }
}
