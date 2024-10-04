package entites2;

import entites.AdressePostale;

public class Personne {
    private String nom;
    private String prenom;
    private AdressePostale adressePostale;

    // Constructeur
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personne(String nom, String prenom, AdressePostale adressePostale) {
        this.nom = nom;
        this.prenom = prenom;
        this.adressePostale = adressePostale;
    }

    // Méthode pour afficher le nom et le prénom
    public void afficherNomComplet() {
        String nomEnMajuscules = nom.toUpperCase();
        System.out.println(prenom + " " + nomEnMajuscules);
    }

    // Méthode pour modifier le nom
    public void setNom(String nom) {
        this.nom = nom;
    }

    // Méthode pour modifier le prénom
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    // Méthode pour modifier l'adresse postale
    public void setAdressePostale(AdressePostale adressePostale) {
        this.adressePostale = adressePostale;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public AdressePostale getAdressePostale() {
        return adressePostale;
    }
}

