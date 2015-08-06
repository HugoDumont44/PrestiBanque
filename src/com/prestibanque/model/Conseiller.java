package com.prestibanque.model;

public class Conseiller extends Utilisateur {

	/*ATTRIBUTS*/
	private int nbClient;
	Gerant manager;
	
	
	/*CONSTRUCTEUR*/
	public Conseiller(String nom, String prenom){
		super(nom, prenom);
		this.nbClient = 0;
	}


	/*METHODES D'ACCES AUX ATTRIBUTS*/
	public int getNbClient() {
		return nbClient;
	}
	public void setNbClient(int nbClient) {
		this.nbClient = nbClient;
	}
	public Gerant getManager() {
		return manager;
	}
	public void setManager(Gerant manager) {
		this.manager = manager;
	}
	
}
