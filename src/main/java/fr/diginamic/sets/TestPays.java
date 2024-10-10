package fr.diginamic.sets;

import java.util.HashSet;

public class TestPays {
    public static void main(String[] args) {
        // Créer un HashSet de Pays
        HashSet<Pays> paysSet = new HashSet<>();

        // Ajouter les pays avec leurs informations
        paysSet.add(new Pays("USA", 331002651, 63000));
        paysSet.add(new Pays("France", 65273511, 40000));
        paysSet.add(new Pays("Allemagne", 83783942, 46000));
        paysSet.add(new Pays("UK", 67886011, 42000));
        paysSet.add(new Pays("Italie", 60244639, 35000));
        paysSet.add(new Pays("Japon", 126476461, 40000));
        paysSet.add(new Pays("Chine", 1439323776, 10000));
        paysSet.add(new Pays("Russie", 145912025, 11000));
        paysSet.add(new Pays("Inde", 1380004385, 2200));

        // Trouver le PIB total le plus bas
        double pibMin = Double.MAX_VALUE; // PIB minimum initial
        Pays paysMinPib = null; // Pays avec le PIB le plus bas

        for (Pays p : paysSet) {
            double pibTotal = p.getPibParHabitant()*p.getNbHabitants();
            if (pibTotal < pibMin) {
                pibMin = pibTotal; // Mettre à jour le PIB minimum
                paysMinPib = p; // Enregistrer le pays correspondant
            }
        }

        // Mettre le nom du pays avec le PIB le plus bas en majuscules
        if (paysMinPib != null) {
            paysMinPib.setNom(paysMinPib.getNom().toUpperCase());
        }

        // Afficher le contenu du HashSet après modification
        System.out.println("Contenu du HashSet après modification :");
        for (Pays p : paysSet) {
            System.out.println(p.getNom());
        }
    }
}

