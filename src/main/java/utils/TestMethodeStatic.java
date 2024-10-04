package utils;

public class TestMethodeStatic {
    public static void main(String[] args) {

        // Transformer un numéro String en int
        String chaine = "12";
        int chaineEnEntier = Integer.parseInt(chaine);
        System.out.println(chaineEnEntier);


        // Trouver le int max entre 2 int
        int a = 17;
        int b = 9;
        int max = Integer.max(b,a);
        System.out.println(max);
    }
}
