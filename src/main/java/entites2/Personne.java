package entites2;

import entites.AdressePostale;

public class Personne {
    String modelNom;
    String modelPrenom;
    AdressePostale modelAdressePostale;

    public Personne(String nom, String prenom){
        modelNom = nom;
        modelPrenom = prenom;
    }

    public Personne(String nom, String prenom, AdressePostale adressePostale){
        modelNom = nom;
        modelPrenom = prenom;
        modelAdressePostale = adressePostale;
    }
}
