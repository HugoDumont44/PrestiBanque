package com.prestibanque.model;

/**
 * @author Spoilt
 */
public class CompteBancaire {
    private int id;
    private double solde;
    private String dateOuverture;

    public CompteBancaire(int id, double solde, String dateOuverture) {
        this.id = id;
        this.solde = solde;
        this.dateOuverture = dateOuverture;
    }

    public int getId() {
        return id;
    }

    public CompteBancaire setId(int id) {
        this.id = id;
        return this;
    }

    public double getSolde() {
        return solde;
    }

    public CompteBancaire setSolde(double solde) {
        this.solde = solde;
        return this;
    }

    public String getDateOuverture() {
        return dateOuverture;
    }

    public CompteBancaire setDateOuverture(String dateOuverture) {
        this.dateOuverture = dateOuverture;
        return this;
    }
}
