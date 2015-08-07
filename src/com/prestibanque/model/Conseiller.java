package com.prestibanque.model;

import java.util.ArrayList;
import java.util.List;

public class Conseiller extends Utilisateur {

	/*ATTRIBUTS*/
	Gerant manager;
	Agence agence;
	List<Client> listClient = new ArrayList<>();
	
	
	/*CONSTRUCTEUR*/
	public Conseiller(String nom, String prenom){
		super(nom, prenom);
	}

	/*METHODES D'ACCES AUX ATTRIBUTS*/
	public Gerant getManager() {
		return manager;
	}
	public void setManager(Gerant manager) {
		this.manager = manager;
	}
	public Agence getAgence() {
		return agence;
	}
	public void setAgence(Agence agence) {
		this.agence = agence;
	}
	
	
	/*COMPORTEMENTS DE LA CLASSE*/
	public void ajoutClient(Client client){
		listClient.add(client);
	}
	public List<Client> listeClient(){
		return listClient;
	}
	public int nombreClient(){
		return listClient.size();
	}

    @Override
    public String toString() {
        return this.getPrenom() + " " + this.getNom();
    }
}
