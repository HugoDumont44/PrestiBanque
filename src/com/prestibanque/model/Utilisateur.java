package com.prestibanque.model;

public class Utilisateur {

	/*ATTRIBUTS*/
	private String nom;
	private String prenom;
	
	
	/*CONSTRUCTEUR*/
	public Utilisateur(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	
	/*METHODES D'ACCES AUX ATTRIBUTS*/
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
}
