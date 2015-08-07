package com.prestibanque.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
		if (listClient.size() < 10){
			listClient.add(client);
		}
		else {
			for (Iterator<Conseiller> iterator = listConseil.iterator();iterator.hasNext();){
				Conseiller conseil = iterator.next();
				if (conseil.listeClient().size() < 10){
					conseil.ajoutClient(client, listConseil);
					break;
				}
			}
		}	
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
