package fr.diginamic.banque.entites;

import fr.diginamic.operations.Operation;

public class Debit extends Operation {
    public Debit(String dateOperation, int montantOperation) {
        super(dateOperation, montantOperation);
    }

    @Override
    public String getType() {
        return "DEBIT";
    }
}
