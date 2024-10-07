package fr.diginamic.banque.entites;

import fr.diginamic.operations.Operation;

public class Credit extends Operation {

    public Credit(String dateOperation, int montantOperation) {
        super(dateOperation, montantOperation);
    }

    @Override
    public String getType() {
        return "CREDIT";
    }
}
