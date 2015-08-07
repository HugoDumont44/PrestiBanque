package com.prestibanque.test;

import java.util.ArrayList;
import java.util.List;

import com.prestibanque.model.*;

public class TestConseiller {

	public static void main(String[] args) {
		
		// TODO 1) Déclaration des variables
		Agence maBanque;
		Gerant man;
		Conseiller con1, con2, con3;
		Client cli1, cli2, cli3, cli4, cli5, cli6, cli7, cli8, cli9, cli10, cli11;
		List<Client> listing;

        // TODO 2) Instanciation
		man = new Gerant("Dupont", "Jean Paul");
		maBanque = new Agence(15878, "PrestiBanque Nantes", man);
		con1 = new Conseiller("Baba", "Ali");
		con2 = new Conseiller("Dieu", "Je suis");
		con3 = new Conseiller("WTF", "Mais");
		cli1 = new Client("numero1", "client");
		cli2 = new Client("numero2", "client");
		cli3 = new Client("numero3", "client");
		cli4 = new Client("numero4", "client");
		cli5 = new Client("numero5", "client");
		cli6 = new Client("numero6", "client");
		cli7 = new Client("numero7", "client");
		cli8 = new Client("numero8", "client");
		cli9 = new Client("numero9", "client");
		cli10 = new Client("numero10", "client");
		cli11 = new Client("numero11", "client");
		

        // TODO 3) Utilisation
			//Affichage de la banque et des conseillers
			maBanque.ajoutConseiller(con1);
			maBanque.ajoutConseiller(con2);
			maBanque.ajoutConseiller(con3);
			afficheAgence(maBanque);
		
			//Affichage des clients par conseillers
			con1.ajoutClient(cli1, maBanque.getListConseiller());
			con1.ajoutClient(cli2, maBanque.getListConseiller());
			con1.ajoutClient(cli3, maBanque.getListConseiller());
			con1.ajoutClient(cli4, maBanque.getListConseiller());
			con1.ajoutClient(cli5, maBanque.getListConseiller());
			con1.ajoutClient(cli6, maBanque.getListConseiller());
			con1.ajoutClient(cli7, maBanque.getListConseiller());
			con1.ajoutClient(cli8, maBanque.getListConseiller());
			con1.ajoutClient(cli9, maBanque.getListConseiller());
			con1.ajoutClient(cli10, maBanque.getListConseiller());
			
			afficheClient(con1);
			afficheClient(con2);
			
			System.out.println("Ajout d'un nouveau client pour le conseiller 1");
			System.out.println("");
			con1.ajoutClient(cli11, maBanque.getListConseiller());
			
			afficheClient(con1);
			afficheClient(con2);
			afficheClient(con3);
		
	}
	
	
    public static void afficheClient(Conseiller conseil) {
        System.out.println("Le conseiller "+conseil.getPrenom() +" "+ conseil.getNom() +" s'occupe de "+conseil.nombreClient()+" clients : "); 
        for (Client client : conseil.listeClient()) {
               System.out.println(client.getPrenom() + " " + client.getNom());
        }
        System.out.println("");
    }
	
    
    public static void afficheAgence(Agence banque) {
        System.out.println(banque.name()); 
        System.out.println(banque.chef()); 
        System.out.println("Liste des conseillers de l'agence");
        for (Conseiller conseiller : banque.getListConseiller()) {
               System.out.println(conseiller.getPrenom()+" "+conseiller.getNom());
        }
        System.out.println("");
    }

}
