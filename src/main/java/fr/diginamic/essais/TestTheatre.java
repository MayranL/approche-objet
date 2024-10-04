package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("ElTheatre",120,112,1120);

        theatre.inscrire(3,12);
        theatre.inscrire(3,12);
        theatre.inscrire(3,12);// Ne fonctionne plus vu qu'il reste seulement 2 places
        theatre.inscrire(2,12);// Fonctionne vu qu'il reste 2 places

        theatre.afficherClientInscrit();
        theatre.afficherRecette();
    }
}
