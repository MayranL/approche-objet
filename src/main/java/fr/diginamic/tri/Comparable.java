package fr.diginamic.tri;

public interface Comparable<Ville> {
    // Implémentation de compareTo pour trier par nom ou nb d'habitants
    public int compareTo(Ville ville);

    // Implémentation de compareTo pour trier par nb d'habitants
    //public int compareTo(Ville ville);
}
