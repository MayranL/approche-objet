package fr.diginamic.maison;

public abstract class Piece {
    private double superficie;
    private int etage;

    public Piece(double superficie, int etage) {
        if (superficie <= 0) {
            throw new IllegalArgumentException("La superficie doit être positive.");
        }
        if (etage < 0) {
            throw new IllegalArgumentException("L'étage ne peut pas être négatif.");
        }
        this.superficie = superficie;
        this.etage = etage;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public int getEtage() {
        return etage;
    }

    public void setEtage(int etage) {
        this.etage = etage;
    }
}
