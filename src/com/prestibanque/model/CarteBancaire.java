package com.prestibanque.model;

/**
 * @author Spoilt
 */
public class CarteBancaire {
	
	/*ATTRIBUTS*/
    private String numero;
    private String dateValidite;
    private int cryptogramme;

    
    /*CONSTRUCTEUR*/
    public CarteBancaire(String numero, String dateValidite, int cryptogramme) {
        this.numero = numero;
        this.dateValidite = dateValidite;
        this.cryptogramme = cryptogramme;
    }

    
    /*METHODES D'ACCES AUX ATTRIBUTS*/
    public String getNumero() {
        return numero;
    }
    public CarteBancaire setNumero(String numero) {
        this.numero = numero;
        return this;
    }
    public String getDateValidite() {
        return dateValidite;
    }
    public CarteBancaire setDateValidite(String dateValidite) {
        this.dateValidite = dateValidite;
        return this;
    } 
    public int getCryptogramme() {
        return cryptogramme;
    }
    public CarteBancaire setCryptogramme(int cryptogramme) {
        this.cryptogramme = cryptogramme;
        return this;
    }
    
}
