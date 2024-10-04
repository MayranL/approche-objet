package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {

        Personne personneSansAdresse = new Personne("Nom","Prenom");


        AdressePostale adresse1 = new AdressePostale(1,"Rue de la tour",00000,"Paris");
        Personne personne1 = new Personne("Nom1", "Prenom1",adresse1);

        AdressePostale adresse2 = new AdressePostale(2,"Rue de la tour",00000,"Paris");
        Personne personne2 = new Personne("Nom2", "Prenom2",adresse2);
    }
}
