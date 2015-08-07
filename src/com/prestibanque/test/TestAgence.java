package com.prestibanque.test;

import com.prestibanque.model.Client;
import com.prestibanque.model.Conseiller;
import com.prestibanque.model.Gerant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestAgence {

    public static void main(String[] args) {
        // TODO 1) Déclaration des variables
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

        // TODO 3) Utilisation
        con1.setManager(man1);
        con2.setManager(man1);
        con3.setManager(man2);
        listeGerants.add(man1);
        listeGerants.add(man2);
        listeConseillers.add(con1);
        listeConseillers.add(con2);
        listeConseillers.add(con3);
        affiche(man1, listeConseillers);
        affiche(man2, listeConseillers);


        while (!quitter) {
            switch (MenuPrincipal()) {
                case 1:
                    menuGerants(listeGerants);
                    break;
                case 2:
                    menuConseillers(listeConseillers);
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

    private static void menuConseillers(List<Conseiller> listeConseillers) {
        int i;
        Scanner scanner = new Scanner(System.in);
        int input;
        boolean quitter = false;

        while (!quitter) {
            System.out.println("\n\nChoisissez votre compte :");
            for (i = 0; i < listeConseillers.size(); i++) {
                Conseiller conseiller = listeConseillers.get(i);
                System.out.println((listeConseillers.indexOf(conseiller) + 1) + ". " + conseiller);
            }
            System.out.println("0. Quitter");

            switch (input = scanner.nextInt()) {
                case 0:
                    quitter = true;
                    break;
                default:
                    if (input <= listeConseillers.size() && input > 0) {
                        menuConseiller(listeConseillers.get(input - 1));
                    }
            }
        }
    }

    private static void menuConseiller(Conseiller conseiller) {
        Scanner scanner = new Scanner(System.in);
        boolean quitter = false;

        System.out.println("Bienvenue " + conseiller + ",");
        System.out.println("Choisissez une action :");
        System.out.println("0. Quitter");

        while (!quitter) {
            switch (scanner.nextInt()) {
                case 1:
                    break;
                case 0:
                    quitter = true;
                    break;
            }
        }
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

    public static void affiche(Gerant manager, List<Conseiller> liste) {
        System.out.println("Le manager " + manager.getPrenom() + " " + manager.getNom() + " supervise les conseillers suivants :");
        for (Conseiller conseiller : liste) {
            if (conseiller.getManager().equals(manager)) {
                System.out.println(conseiller.getPrenom() + " " + conseiller.getNom());
            }
        }
    }


}
