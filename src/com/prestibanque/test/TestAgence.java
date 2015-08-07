package com.prestibanque.test;

import com.prestibanque.model.Agence;
import com.prestibanque.model.Client;
import com.prestibanque.model.Conseiller;
import com.prestibanque.model.Gerant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestAgence {

    public static void main(String[] args) {
        // TODO 1) Déclaration des variables
        Agence maBanque;
        Gerant man1, man2;
        Conseiller con1, con2, con3;
        List<Conseiller> listeConseillers = new ArrayList<>();
        List<Gerant> listeGerants = new ArrayList<>();
        boolean quitter = false;

        // TODO 2) Instanciation
        man1 = new Gerant("La frite", "Robert");
        man2 = new Gerant("WTF", "Jean Paul");
        con1 = new Conseiller("Le dinosaure", "Jean Marie");
        con2 = new Conseiller("Le poulpe", "Paul");
        con3 = new Conseiller("El apero", "Jojo");
        maBanque = new Agence(156, "PrestiBank", man1);

        // TODO 3) Utilisation
        maBanque.ajoutConseiller(con1);
        maBanque.ajoutConseiller(con2);
        maBanque.ajoutConseiller(con3);
        listeGerants.add(man1);
        listeGerants.add(man2);
        listeConseillers.add(con1);
        listeConseillers.add(con2);
        listeConseillers.add(con3);

        while (!quitter) {
            switch (MenuPrincipal()) {
                case 1:
                    menuGerants(listeGerants);
                    break;
                case 2:
                    menuConseillers(maBanque);
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

    private static void menuConseillers(Agence maBanque) {
        int i;
        Scanner scanner = new Scanner(System.in);
        int input;
        boolean quitter = false;

        while (!quitter) {
            System.out.println("\n\nChoisissez votre compte :");
            for (i = 0; i < maBanque.getListConseiller().size(); i++) {
                Conseiller conseiller = maBanque.getListConseiller().get(i);
                System.out.println((maBanque.getListConseiller().indexOf(conseiller) + 1) + ". " + conseiller);
            }
            System.out.println("0. Quitter");

            switch (input = scanner.nextInt()) {
                case 0:
                    quitter = true;
                    break;
                default:
                    if (input <= maBanque.getListConseiller().size() && input > 0) {
                        menuConseiller(maBanque, maBanque.getListConseiller().get(input - 1));
                    }
            }
        }
    }

    private static void menuConseiller(Agence maBanque, Conseiller conseiller) {
        Scanner scanner = new Scanner(System.in);
        boolean quitter = false;

        while (!quitter) {
            System.out.println("\n\nBienvenue " + conseiller + ",");
            System.out.println("Vos clients : " + conseiller.listeClient());
            System.out.println("Choisissez une action :");
            System.out.println("1. Ajouter un client");
            System.out.println("0. Quitter");

            switch (scanner.nextInt()) {
                case 1:
                    ajouterClient(maBanque, conseiller);
                    break;
                case 0:
                    quitter = true;
                    break;
            }
        }
    }

    private static void ajouterClient(Agence maBanque, Conseiller conseiller) {
        String nom;
        String prenom;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nom : ");
        nom = scanner.next();
        System.out.print("Prénom : ");
        prenom = scanner.next();
        conseiller.ajoutClient(new Client(nom, prenom), maBanque.getListConseiller());
    }


    private static void menuGerants(List<Gerant> listeGerants) {
        int i;
        Scanner scanner = new Scanner(System.in);
        int input;
        boolean quitter = false;

        while (!quitter) {
            System.out.println("\n\nChoisissez votre compte :");
            for (i = 0; i < listeGerants.size(); i++) {
                Gerant gerant = listeGerants.get(i);
                System.out.println((listeGerants.indexOf(gerant) + 1) + ". " + gerant);
            }
            System.out.println("0. Quitter");

            switch (input = scanner.nextInt()) {
                case 0:
                    quitter = true;
                    break;
                default:
                    if (input <= listeGerants.size() && input > 0) {
                        menuGerant(listeGerants.get(input - 1));
                    }
            }
        }
    }

    private static void menuGerant(Gerant gerant) {
        Scanner scanner = new Scanner(System.in);
        boolean quitter = false;

        System.out.println("Bienvenue " + gerant + ",");
        System.out.println("Choisissez une action :");
        System.out.println("1. Faire un audit");
        System.out.println("0. Quitter");

        while (!quitter) {
            switch (scanner.nextInt()) {
                case 1:
                    //audit()
                    break;
                case 0:
                    quitter = true;
                    break;
            }
        }
    }

    private static int MenuPrincipal() {
        System.out.println("\n\nBienvenue dans le logiciel de gestion de banque");
        System.out.println("Choisissez un rôle : ");
        System.out.println("1. Gérant");
        System.out.println("2. Conseiller");
        System.out.println("3. Client");
        System.out.println("0. Quitter");
        return new Scanner(System.in).nextInt();
    }

}
