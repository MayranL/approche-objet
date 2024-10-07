package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte = new Compte(15,1000);
        System.out.println(compte);
        CompteTaux compteTaux = new CompteTaux(13,12000,1.4);

        Compte[] tabCompte = {compte,compteTaux};

        for(Compte value : tabCompte){
            System.out.println(value.toString());
        }
    }
}
