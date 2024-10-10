package fr.diginamic.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class TestSetDouble{
    public static void main(String[] args) {
        HashSet<Double> set = new HashSet<>(Arrays.asList(1.5,8.25,-7.32,13.3,-12.45,48.5,0.01));

        set.forEach(System.out::println);

        // Rechercher le plus grand
        double max = 0;
        for(double s : set){
            if(max < s){
                max = s;
            }
        }
        System.out.println("valeur max : "+max);

        // Suppression le plus petit élément
        double min = max;
        for(double s : set){
            if(s<min){
                min = s;
            }
        }
        set.remove(min);

        System.out.println("Collection modifié : "+set);
    }
}
