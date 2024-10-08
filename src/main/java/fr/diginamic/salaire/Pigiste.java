package fr.diginamic.salaire;

public class Pigiste extends Intervenant{
    private int nbJours;
    private double remunerationJour;
    public Pigiste(String nom, String prenom, int nbJours, double remunerationJour) {
        super(nom, prenom);
        this.nbJours = nbJours;
        this.remunerationJour = remunerationJour;
    }

    @Override
    public double getSalaire() {
        return this.nbJours*this.remunerationJour;
    }


    @Override
    public String afficherDonnees() {
        return super.afficherDonnees()+" montant : "+getSalaire()+" son statut est un indépendant";
    }
}
