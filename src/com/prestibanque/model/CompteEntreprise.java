package com.prestibanque.model;

/**
 * @author Spoilt
 */
public class CompteEntreprise extends CompteCourant {
	
	/*CONSTRUCTEUR*/
    public CompteEntreprise(int id, double solde, String dateOuverture, double decouvertMax) {
        super(id, solde, dateOuverture, decouvertMax = 5000);
    }
    
}
