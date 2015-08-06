package com.prestibanque.model;

public class Agence extends Banque {

	/*ATTRIBUTS*/
	private int identification;
	private String nomAgence;
	private String dateCreation;
	private Gerant manager;
	
	
	/*CONSTRUCTEUR*/
	public Agence(int identification, String nomAgence, String dateCreation, Gerant man) {
		this.identification = identification;
		this.nomAgence = nomAgence;
		this.dateCreation = dateCreation;
		this.manager = man;
	}
	public Agence(int identification, String nomAgence, Gerant man) {
		this(identification, nomAgence, "l'an de grâce 500 av JC", man);
	}
	
	
	/*METHODES D'ACCES AUX ATTRIBUTS*/
	public int getIdentification() {
		return identification;
	}
	public void setIdentification(int identification) {
		this.identification = identification;
	}
	public String getNomAgence() {
		return nomAgence;
	}
	public void setNomAgence(String nomAgence) {
		this.nomAgence = nomAgence;
	}
	public String getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Gerant getManager() {
		return manager;
	}
	public void setManager(Gerant manager) {
		this.manager = manager;
	}
	
	
	/*COMPORTEMENTS DE LA CLASSE*/
	public String demandeAudit (){
		return "Super banque";
	}
	
}
