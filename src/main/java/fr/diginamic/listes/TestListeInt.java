package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Arrays;

public class TestListeInt {
    public static void main(String[] args) {
        ArrayList<Integer> listeEntier = new ArrayList<>(Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5));
        listeEntier.forEach(System.out::println);
        System.out.println(listeEntier.size());
        System.out.println("valeur max : " + listeEntier.stream().max(Integer::compare).orElseThrow());

        int min = listeEntier.stream().min(Integer::compare).orElseThrow();
        listeEntier.remove(Integer.valueOf(min));
        System.out.println(min);

        for(int i =0;i<listeEntier.size();i++){
            if(listeEntier.get(i)<0){
                listeEntier.set(i,-listeEntier.get(i));
            }
        }
        listeEntier.forEach(System.out::println);
    }
}