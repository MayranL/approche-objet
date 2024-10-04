package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
    public static void main(String[] args) {
        double[] tab1= {2.4,2.8,17.2,23.1};
        double[] tab2= {2.4,2.8,1.2,3.1,4.2};
        CalculMoyenne calculMoyenne1 = new CalculMoyenne(tab1,tab1.length);
        CalculMoyenne calculMoyenne2 = new CalculMoyenne(tab2,tab2.length);
        System.out.println("Moyenne 1 : "+calculMoyenne1.calculMoyenne());
        System.out.print("Moyenne 2 : "+calculMoyenne2.calculMoyenne());
    }
}
