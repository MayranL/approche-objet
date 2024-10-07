package fr.diginamic.essais;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.operations.Operation;

import java.util.Objects;

public class TestOperation {
    public static void main(String[] args) {
        Debit debit1 = new Debit("07/10",10);
        Debit debit2 = new Debit("08/10",20);
        Credit credit1 = new Credit("09/10",10);
        Credit credit2 = new Credit("12/10",50);
        Operation[] tabOperation = {debit1,debit2,credit1,credit2};

        int montantGlobal = 0;

        for(Operation value: tabOperation){
            System.out.println("Date Opération : "+value.getDateOperation()+" et montant : "+value.getMontantOperation() + " type : "+value.getType());
            if(Objects.equals(value.getType(), "DEBIT")){
                montantGlobal += value.getMontantOperation();
            } else if (Objects.equals(value.getType(), "CREDIT")) {
                montantGlobal -= value.getMontantOperation();
            }
        };

        System.out.println("Le montant global est : "+montantGlobal);
    }
}
