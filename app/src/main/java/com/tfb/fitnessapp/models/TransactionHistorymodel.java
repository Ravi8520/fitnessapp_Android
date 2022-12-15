package com.tfb.fitnessapp.models;

public class TransactionHistorymodel {

    private String transactionNote;
    private String accNumber;

    public TransactionHistorymodel(String transactionNote, String accNumber) {
        this.transactionNote = transactionNote;
        this.accNumber = accNumber;
    }

    public String getTransactionNote() {
        return transactionNote;
    }

    public void setTransactionNote(String transactionNote) {
        this.transactionNote = transactionNote;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }
}
