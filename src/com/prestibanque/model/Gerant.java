package com.prestibanque.model;

public class Gerant extends Conseiller {

	/*CONSTRUCTEUR*/
	public Gerant(String nom, String prenom) {
		super(nom, prenom);
	}

	@Override
	public String toString() {
		return this.getPrenom() + " " + this.getNom();
	}
}
