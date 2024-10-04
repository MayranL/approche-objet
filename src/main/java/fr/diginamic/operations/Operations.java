package fr.diginamic.operations;

public class Operations {

    public static double calcul(double a, double b, char operateur){
        switch (operateur){
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                if(b==0){
                    throw new IllegalArgumentException("Impossible de diviser par 0 !");
                }else{
                    return a/b;
                }
            default:
                throw new IllegalArgumentException("L'argument n'est pas valide !");
        }
    }
}
