package com.prestibanque.service;

import java.util.Iterator;
import java.util.List;

import com.prestibanque.model.Client;
import com.prestibanque.model.Conseiller;

public class MethodeGestion {

	/*CONSTRUCTEUR*/
	public MethodeGestion() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	/*COMPORTEMENTS DE LA CLASSE*/
	public void ajoutClient (Client client, List<Conseiller> listConseil, List<Client> listClient){
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
		
}
