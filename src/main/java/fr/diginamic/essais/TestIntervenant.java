package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {
    public static void main(String[] args) {
        Salarie salaire = new Salarie("Mayran","Loïc",2000);
        Pigiste pigiste = new Pigiste("Mayran2","Ludo",17,92.3);

        System.out.println(salaire.getSalaire());
        System.out.println(pigiste.getSalaire());

        System.out.println(salaire.afficherDonnees());
        System.out.println(pigiste.afficherDonnees());
    }
}
