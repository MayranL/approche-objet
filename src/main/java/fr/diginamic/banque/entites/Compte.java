package fr.diginamic.banque.entites;

public class Compte {
    private int numeroCompte;
    private int soldeCompte;

    // Constructeur
    public Compte(int numeroCompte, int soldeCompte){
        this.numeroCompte = numeroCompte;
        this.soldeCompte = soldeCompte;
    }

    public String toString(){
        return "Numero de compte : "+ numeroCompte + " et le solde : " + soldeCompte;
    }
}
