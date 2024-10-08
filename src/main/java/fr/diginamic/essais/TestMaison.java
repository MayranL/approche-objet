package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {
    public static void main(String[] args) {
        Maison maison = new Maison();

        // Ajout de pièces
        maison.ajouterPiece(new Chambre(20, 1));
        maison.ajouterPiece(new Cuisine(15, 0));
        maison.ajouterPiece(new Salon(30, 1));
        maison.ajouterPiece(new SalleDeBain(10, 0));
        maison.ajouterPiece(new WC(5, 0));

        // Affichage des superficies
        System.out.println("Superficie totale: " + maison.superficieTotale());
        System.out.println("Superficie RDC: " + maison.superficieEtage(0));
        System.out.println("Superficie des chambres: " + maison.superficieTypePiece(Chambre.class));
        System.out.println("Nombre de chambres: " + maison.nombrePiecesType(Chambre.class));

        // Test avec null
        try {
            maison.ajouterPiece(null);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Test avec superficie négative
        try {
            maison.ajouterPiece(new Chambre(-10, 1));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
