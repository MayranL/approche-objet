package fr.diginamic.listes;

import java.util.ArrayList;

public class FusionListe {
    public static void main(String[] args) {
        // Exercice 2 :
        ArrayList<String> liste1 = new ArrayList<String>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");

        ArrayList<String> liste2 = new ArrayList<String>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");

        //TODO Développements à réaliser ci-dessous
        ArrayList<String> liste3 = new ArrayList<>();
        liste3.addAll(liste1);
        liste3.addAll(liste2);

        liste3.forEach(l-> System.out.println(l));
    }
}
