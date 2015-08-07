package com.prestibanque.model;

public class Gerant extends Utilisateur {

	/*CONSTRUCTEUR*/
	public Gerant(String nom, String prenom) {
		super(nom, prenom);
	}

    @Override
    public String toString() {
        return getPrenom() + " " + getNom();
    }
}
