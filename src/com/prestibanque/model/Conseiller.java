package com.prestibanque.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.prestibanque.service.MethodeGestion;

public class Conseiller extends Utilisateur {

	/*ATTRIBUTS*/
	Agence agence;
	List<Client> listClient = new ArrayList<>();
	
	
	/*CONSTRUCTEUR*/
	public Conseiller(String nom, String prenom){
		super(nom, prenom);
	}

	/*METHODES D'ACCES AUX ATTRIBUTS*/
	public Agence getAgence() {
		return agence;
	}
	public void setAgence(Agence agence) {
		this.agence = agence;
	}


	/*COMPORTEMENTS DE LA CLASSE*/
	public void ajoutClient(Client client, List<Conseiller> listConseil){
		MethodeGestion gestion = new MethodeGestion();
		gestion.ajoutClient(client, listConseil, listClient);
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
