package fr.diginamic.entites;

public class Theatre {
    private String nom;
    private int capaciteMax;
    private int clientInscrit;
    private double recetteTotale;


    public Theatre(String nom, int capaciteMax, int clientInscrit, double recetteTotale) {
        this.nom = nom;
        this.capaciteMax = capaciteMax;
        this.clientInscrit = clientInscrit;
        this.recetteTotale = recetteTotale;
    }

    // Méthode qui permet d'inscrire nbClient si il reste assez de places
    public void inscrire(int nbClient,double prixPlace){
        if(capaciteMax<clientInscrit+nbClient){
            System.out.println("Plus assez de places !");
        }else{
            System.out.println("Il y a assez de places pour "+nbClient+" clients.");
            clientInscrit += nbClient;
            recetteTotale += nbClient*prixPlace;
            System.out.println("Cela coutera "+(nbClient*prixPlace)+"€ aux nouveaux clients !");
        }
    }

    // Méthode qui permet d'afficher le nombre de client inscrit
    public void afficherClientInscrit(){
        System.out.println("Il y a actuellement "+clientInscrit+" inscrits.");
    }

    // Méthode qui permet d'afficher la recette totale
    public void afficherRecette(){
        System.out.println("La recette est de : "+recetteTotale+"€ !");
    }
}
