package entites;

public class AdressePostale {
    int modelNumeroRue;
    String modelLibelleRue;
    int modelCodePostal;
    String modelVille;

    public AdressePostale(int numeroRue, String libelleRue, int codePostal, String ville){
        modelNumeroRue = numeroRue;
        modelLibelleRue = libelleRue;
        modelCodePostal = codePostal;
        modelVille = ville;
    }
}
