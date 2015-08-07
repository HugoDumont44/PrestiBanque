package com.prestibanque.view;

import com.prestibanque.model.Agence;
import com.prestibanque.model.Client;
import com.prestibanque.model.Conseiller;
import com.prestibanque.model.Gerant;
import com.prestibanque.repository.Fixture;

import java.util.List;
import java.util.Scanner;

/**
 * @author Spoilt
 */
public class MenuPrincipal {
    public static void main(String[] args) {
        boolean quitter = false;

        Agence bank = new Agence(123, "PrestiBanque", new Gerant("Dumont", "Hugo"));

        Fixture.generate(bank);

        while (!quitter) {
            switch (Menu()) {
                case 1:
                    menuGerant(bank);
                    break;
                case 2:
                    menuConseillers(bank);
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

    private static int Menu() {
        System.out.println("\n\nBienvenue dans le logiciel de gestion de banque");
        System.out.println("Choisissez un rôle : ");
        System.out.println("1. Gérant");
        System.out.println("2. Conseiller");
        System.out.println("3. Client");
        System.out.println("0. Quitter");
        return new Scanner(System.in).nextInt();
    }


    private static void menuGerant(Agence bank) {
        Scanner scanner = new Scanner(System.in);
        boolean quitter = false;

        System.out.println("Bienvenue " + bank.getManager() + ",");
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
        nom = scanner.nextLine();
        System.out.print("Prénom : ");
        prenom = scanner.nextLine();
        conseiller.ajoutClient(new Client(nom, prenom), maBanque.getListConseiller());
    }
}
