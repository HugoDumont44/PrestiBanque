package com.prestibanque.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.prestibanque.model.*;

public class TestAgence {
	
	public static void main(String[] args) {
		// TODO 1) Déclaration des variables
		Gerant man1, man2;
		Conseiller con1, con2, con3;
		List<Conseiller> listing = new ArrayList<>();
		
		// TODO 2) Instanciation
		man1 = new Gerant( "La frite", "Robert");
		man2 = new Gerant("WTF", "Jean Paul");
		con1 = new Conseiller("Le dinosaure", "Jean Marie");
		con2 = new Conseiller("Le poulpe", "Paul");
		con3 = new Conseiller("El apero ?", "Jojo");
		
		// TODO 3) Utilisation
		con1.setManager(man1);
		con2.setManager(man1);
		con3.setManager(man2);
		listing.add(con1);
		listing.add(con2);
		listing.add(con3);
		affiche(man1, listing);
		affiche(man2, listing);
		
	}
	
	public static void affiche(Gerant manager, List<Conseiller> liste){
		System.out.println("Le manager "+manager.getPrenom()+" "+manager.getNom()+" supervise les conseillers suivants :");
		for (Iterator<Conseiller> iterator = liste.iterator();iterator.hasNext();){
			Conseiller conseiller = iterator.next();
			if(conseiller.getManager().equals(manager)){
				System.out.println(conseiller.getPrenom()+" "+conseiller.getNom());
			}
		}
	}
	
}
