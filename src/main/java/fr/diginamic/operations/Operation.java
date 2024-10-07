package fr.diginamic.operations;

public abstract class Operation {
    protected String dateOperation;
    protected int montantOperation;

    public Operation(String dateOperation, int montantOperation) {
        this.dateOperation = dateOperation;
        this.montantOperation = montantOperation;
    }

    public String getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(String dateOperation) {
        this.dateOperation = dateOperation;
    }

    public int getMontantOperation() {
        return montantOperation;
    }

    public void setMontantOperation(int montantOperation) {
        this.montantOperation = montantOperation;
    }

    public abstract String getType();

}
