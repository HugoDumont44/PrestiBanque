package com.prestibanque.model;

/**
 * @author Spoilt
 */
public class CompteCourant extends CompteBancaire {
	
	/*ATTRIBUT*/
    private double decouvertMax = 1000;

    
    /*CONSTRUCTEUR*/
    public CompteCourant(int id, double solde, String dateOuverture, double decouvertMax) {
        super(id, solde, dateOuverture);
        this.decouvertMax = decouvertMax;
    }

    
    /*METHODES D'ACCES AUX ATTRIBUTS*/
    public double getDecouvertMax() {
        return decouvertMax;
    }

    public CompteCourant setDecouvertMax(double decouvertMax) {
        this.decouvertMax = decouvertMax;
        return this;
    }
    
}
