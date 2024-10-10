package fr.diginamic.sets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class TestSetString {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(
                Arrays.asList
                        ("USA","France","Allemagne","UK","Italie","Japon","Chine","Russie","Inde"));

        String paysMax = "";
        for(String ville : set){
            if(ville.length()>paysMax.length()){
                paysMax = ville;
            }
        }

        set.remove(paysMax);

        set.forEach(System.out::println);
    }
}
