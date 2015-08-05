package com.prestibanque.model;

/**
 * @author Spoilt
 */
public class CompteCourant extends CompteBancaire {
    private double decouvertMax = 1000;

    public CompteCourant(int id, double solde, String dateOuverture, double decouvertMax) {
        super(id, solde, dateOuverture);
        this.decouvertMax = decouvertMax;
    }

    public double getDecouvertMax() {
        return decouvertMax;
    }

    public CompteCourant setDecouvertMax(double decouvertMax) {
        this.decouvertMax = decouvertMax;
        return this;
    }
}
