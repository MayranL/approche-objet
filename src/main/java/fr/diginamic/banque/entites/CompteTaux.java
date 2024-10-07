package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
    private double tauxRemuneration;

    public CompteTaux(int numeroCompte, int soldeCompte, double tauxRemuneration) {
        super(numeroCompte, soldeCompte);
        this.tauxRemuneration = tauxRemuneration;
    }

    public String toString(){
        return super.toString()+" et le taux de rémunération : "+tauxRemuneration;
    }
}
