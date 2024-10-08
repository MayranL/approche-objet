package fr.diginamic.salaire;

public class Salarie extends Intervenant{
    private double montantSalaire;

    public Salarie(String nom, String prenom, double montantSalaire) {
        super(nom, prenom);
        this.montantSalaire = montantSalaire;
    }

    @Override
    public double getSalaire() {
        return this.montantSalaire;
    }

    @Override
    public String afficherDonnees() {
        return super.afficherDonnees()+" montant : "+getSalaire()+" son statut est CDI ou CDD";
    }
}
