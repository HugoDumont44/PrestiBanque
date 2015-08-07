package com.prestibanque.model;

import java.util.ArrayList;
import java.util.List;

public class Agence extends Banque {

	/*ATTRIBUTS*/
	private int identification;
	private String nomAgence;
	private String dateCreation;
	private Gerant manager;
	private List<Conseiller> listConseiller = new ArrayList<Conseiller>();
	
	
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
	public List<Conseiller> getListConseiller() {
		return listConseiller;
	}
	public void setListConseiller(List<Conseiller> listConseiller) {
		this.listConseiller = listConseiller;
	}
	
	
	/*COMPORTEMENTS DE LA CLASSE*/
	public String name(){
		return "La banque "+this.getNomAgence()+" ["+this.getIdentification()+"] créée le "+this.getDateCreation();
	}
	public String chef(){
		return "Dont le manager est : "+this.getManager().getPrenom()+" "+this.getManager().getNom();
	}
	public String demandeAudit (){
		return "Super banque";
	}
	public void ajoutConseiller (Conseiller conseil){
		listConseiller.add(conseil);
	}
	
}
