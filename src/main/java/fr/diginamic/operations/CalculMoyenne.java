package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {
    private double[] tab;
    private double taille;

    public CalculMoyenne(double[] tab, double taille){
        this.tab = tab;
        this.taille = taille;
    }

    public void ajout(double doubleAjouter){
        if(taille==tab.length){
            tab = Arrays.copyOf(tab,tab.length+1);
        }
        tab[tab.length-1]=doubleAjouter;
        taille++;
    }

    public double calculMoyenne(){
        double moyenne = 0;
        for(double value : this.tab){
            moyenne += value;
        }
        return moyenne = Operations.calcul(moyenne,taille,'/');
    }

}
