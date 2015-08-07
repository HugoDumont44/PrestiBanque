package com.prestibanque.test;

import com.prestibanque.model.Conseiller;
import com.prestibanque.model.Gerant;

import java.util.*;

public class TestAgence {

    public static void main(String[] args) {
        // TODO 1) Déclaration des variables
        Gerant man1, man2;
        Conseiller con1, con2, con3;
        List<Conseiller> listing = new ArrayList<>();
        List<Gerant> listeGerants = new ArrayList<>();
        boolean quitter = false;

        // TODO 2) Instanciation
        man1 = new Gerant("La frite", "Robert");
        man2 = new Gerant("WTF", "Jean Paul");
        con1 = new Conseiller("Le dinosaure", "Jean Marie");
        con2 = new Conseiller("Le poulpe", "Paul");
        con3 = new Conseiller("El apero", "Jojo");

        // TODO 3) Utilisation
        con1.setManager(man1);
        con2.setManager(man1);
        con3.setManager(man2);
        listeGerants.add(man1);
        listeGerants.add(man2);
        listing.add(con1);
        listing.add(con2);
        listing.add(con3);
        affiche(man1, listing);
        affiche(man2, listing);


        while (!quitter) {
            switch (afficheMenuPrincipal()) {
                case 1:
                    menuGerants(listeGerants);
                    break;
                case 2:
                    //Lister Conseillers
                    break;
                case 3:
                    //Lister Clients
                    break;
                case 0:
                    quitter = true;
                    break;
            }
        }
    }

    private static int menuGerants(List<Gerant> listeGerants) {
        int i;
        System.out.println("\n\nChoisissez votre compte :");
        for (i = 1; i < listeGerants.size(); i++) {
            Gerant gerant = listeGerants.get(i);
            System.out.println(listeGerants.indexOf(gerant) + ". " + gerant);
        }
        System.out.println("0. Quitter");

        return new Scanner(System.in).nextInt() - 1;
    }

    private static int afficheMenuPrincipal() {
        System.out.println("\n\nBienvenue dans le logiciel de gestion de banque");
        System.out.println("Choisissez un rôle : ");
        System.out.println("1. Gérant");
        System.out.println("2. Conseiller");
        System.out.println("3. Client");
        System.out.println("0. Quitter");
        return new Scanner(System.in).nextInt();
    }

    public static void affiche(Gerant manager, List<Conseiller> liste) {
        System.out.println("Le manager " + manager.getPrenom() + " " + manager.getNom() + " supervise les conseillers suivants :");
        for (Conseiller conseiller : liste) {
            if (conseiller.getManager().equals(manager)) {
                System.out.println(conseiller.getPrenom() + " " + conseiller.getNom());
            }
        }
    }


}
