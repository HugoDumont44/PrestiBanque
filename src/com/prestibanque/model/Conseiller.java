package com.prestibanque.model;

public class Conseiller extends Utilisateur {

	/*ATTRIBUTS*/
	private int nbClient;
	
	
	/*CONSTRUCTEUR*/
	public Conseiller(String nom, String prenom) {
		super(nom, prenom);
		this.nbClient = 0;
	}

}
