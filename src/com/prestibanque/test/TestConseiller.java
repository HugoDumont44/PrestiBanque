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
		Client cli1, cli2, cli3;
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
		listing = new ArrayList<Client>();

        // TODO 3) Utilisation
		maBanque.ajoutConseiller(con1);
		maBanque.ajoutConseiller(con2);
		maBanque.ajoutConseiller(con3);
		afficheAgence(maBanque);
		
		con1.setManager(man);
		/*con2.setManager(man);
		con3.setManager(man);*/
		cli1.setConseil(con1);
		cli2.setConseil(con1);
		cli3.setConseil(con1);
		listing = con1.listeClient();
		
		affiche(con1, listing);
		
	}
	
	
    public static void affiche(Conseiller conseil, List<Client> liste) {
        System.out.println("Le conseiller "+conseil.getPrenom() +" "+ conseil.getNom() +" s'occupe de "+conseil.nombreClient()+" clients : "); 
        for (Client client : liste) {
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
