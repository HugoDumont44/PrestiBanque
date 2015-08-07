package com.prestibanque.repository;

import com.prestibanque.model.Agence;
import com.prestibanque.model.Client;
import com.prestibanque.model.Conseiller;
import com.prestibanque.model.Gerant;

/**
 * @author Spoilt
 */
public class Fixture {
    public static void generate(Agence bank) {
        Gerant man;
        Conseiller con1, con2, con3;
        Client cli1, cli2, cli3;

        con1 = new Conseiller("Baba", "Ali");
        con2 = new Conseiller("Dieu", "Je suis");
        con3 = new Conseiller("WTF", "Mais");
        cli1 = new Client("numero1", "client");
        cli2 = new Client("numero2", "client");
        cli3 = new Client("numero3", "client");

        bank.ajoutConseiller(con1);
        bank.ajoutConseiller(con2);
        bank.ajoutConseiller(con3);

        con1.ajoutClient(cli1, bank.getListConseiller());
        con2.ajoutClient(cli2, bank.getListConseiller());
        con3.ajoutClient(cli3, bank.getListConseiller());
    }
}
