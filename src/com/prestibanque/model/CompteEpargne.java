package com.prestibanque.model;

/**
 * @author Spoilt
 */
public class CompteEpargne extends CompteBancaire{
	
	/*ATTRIBUT*/
    private double taux = 3;

    
    /*CONSTRUCTEUR*/
    public CompteEpargne(int id, double solde, String dateOuverture, double taux) {
        super(id, solde, dateOuverture);
        this.taux = taux;
    }

    
    /*METHODES D'ACCES AUX ATTRIBUTS*/
    public double getTaux() {
        return taux;
    }
    public CompteEpargne setTaux(double taux) {
        this.taux = taux;
        return this;
    }
    
}
