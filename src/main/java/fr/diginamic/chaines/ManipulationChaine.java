package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

import java.util.Arrays;

public class ManipulationChaine {
    public static void main(String[] args) {
        String chaine = "Durand;Marcel;2 523.5";
        char premiereCaractere = chaine.charAt(0);
        System.out.println("Premier caractère : "+premiereCaractere);
        System.out.println("Longueur de la chaine : "+chaine.length());
        System.out.println("Index du premier ';' : "+chaine.indexOf(';'));

        int indexFin = chaine.indexOf((';'));
        String nom = chaine.substring(0,indexFin);
        System.out.println("Nom : "+nom);

        System.out.println("Nom en majuscule : "+nom.toUpperCase());

        System.out.println("Nom en minuscule : "+nom.toLowerCase());

        String[] tab = chaine.split(";");
        for(String mot : tab){
            System.out.print(mot + " ");
        }

        System.out.println("\nTableau entier : "+Arrays.toString(tab));

        //String nom = chaine.substring(0,indexFin);

        int indexPrenomFin = chaine.indexOf(';',indexFin+1);
        String prenom = chaine.substring(indexFin+1,indexPrenomFin);

        String salaireString = chaine.substring(indexPrenomFin+1);
        salaireString = salaireString.replace(" ", "");
        double salaireDouble = Double.parseDouble(salaireString);

        Salarie salaire = new Salarie(nom,prenom,salaireDouble);
        System.out.println(salaire.getNom()+ " "+ salaire.getPrenom()+ " "+ salaire.getSalaire());
    }
}
