package com.prestibanque.model;

public class Banque {

	/*ATTRIBUTS*/
	private int nbAgence;
	private String nomAgence;
	
	
	/*CONSTRUCTEUR*/
	public Banque() {
		this.nbAgence = 5;
		this.nomAgence = "PrestiBanque";
	}
	
	
	/*METHODES D'ACCES AUX ATTRIBUTS*/
	public int getNbAgence() {
		return nbAgence;
	}
	public void setNbAgence(int nbAgence) {
		this.nbAgence = nbAgence;
	}
	public String getNomAgence() {
		return nomAgence;
	}
	public void setNomAgence(String nomAgence) {
		this.nomAgence = nomAgence;
	}
	
}
