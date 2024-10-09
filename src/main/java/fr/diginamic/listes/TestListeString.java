package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestListeString {
    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<>(Arrays.asList
                ("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));

        String villeMax = liste.get(0);
        for(String l : liste){
            if(l.length()>villeMax.length()){
                villeMax = l;
            }
        }
        System.out.println(villeMax);

        Iterator<String> iterator = liste.iterator();
        ArrayList<String> villesMajuscules = new ArrayList<>();

        while (iterator.hasNext()){
            String nomVille = iterator.next();
            villesMajuscules.add(nomVille.toUpperCase());
        }
        villesMajuscules.forEach(System.out::println);

        Iterator<String> iterator2 = liste.iterator();

        while (iterator2.hasNext()){
            String nomVille = iterator2.next();
            if(nomVille.charAt(0)=='N'){
                iterator2.remove();
            }
        }

        liste.forEach(System.out::println);
        System.out.println("aa");
    }
}
