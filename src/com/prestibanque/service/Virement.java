package com.prestibanque.service;

/**
 * @author Spoilt
 */
public class Virement {
    private int idCompteDebit;
    private int idCompteCredit;
    private double somme;

    public Virement(int idCompteDebit, int idCompteCredit, double somme) {
        this.idCompteDebit = idCompteDebit;
        this.idCompteCredit = idCompteCredit;
        this.somme = somme;
    }



    public int getIdCompteDebit() {
        return idCompteDebit;
    }

    public Virement setIdCompteDebit(int idCompteDebit) {
        this.idCompteDebit = idCompteDebit;
        return this;
    }

    public int getIdCompteCredit() {
        return idCompteCredit;
    }

    public Virement setIdCompteCredit(int idCompteCredit) {
        this.idCompteCredit = idCompteCredit;
        return this;
    }

    public double getSomme() {
        return somme;
    }

    public Virement setSomme(double somme) {
        this.somme = somme;
        return this;
    }
}
