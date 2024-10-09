package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestVilles {
    public static void main(String[] args) {
        // Créer une ArrayList de villes
        ArrayList<Ville> villes = new ArrayList<>(Arrays.asList(
                new Ville("Nice", 343000),
                new Ville("Carcassonne", 47800),
                new Ville("Narbonne", 53400),
                new Ville("Lyon", 484000),
                new Ville("Foix", 9700),
                new Ville("Pau", 77200),
                new Ville("Marseille", 850700),
                new Ville("Tarbes", 40600)
        ));

        // Afficher la ville la plus peuplée
        Ville villePlusPeuple = new Ville("",0);
        for(Ville v : villes){
            if(v.getNbHabitants()> villePlusPeuple.getNbHabitants()){
                villePlusPeuple.setNom(v.getNom());
                villePlusPeuple.setNbHabitants(v.getNbHabitants());
            }
        }
        System.out.println("Nom : "+villePlusPeuple.getNom() + " et son nombre d'habitants : " + villePlusPeuple.getNbHabitants());

        // Supprimer la ville la moins peuplée
        Ville villeMoinsPeuple = villes.get(0);
        for(Ville v : villes){
            if(v.getNbHabitants()< villeMoinsPeuple.getNbHabitants()){
                villeMoinsPeuple = v;
            }
        }
        villes.remove(villeMoinsPeuple);

        // Modification ville > 100000 habitants pour nom en Majuscule
        for (Ville v : villes){
            if(v.getNbHabitants()>100000){
                v.setNom(v.getNom().toUpperCase());
            }
        }

        // Affichage liste
        for (Ville v : villes){
            System.out.println("Nom : "+v.getNom()+" et nombre habitants : "+v.getNbHabitants());
        }
    }
}
