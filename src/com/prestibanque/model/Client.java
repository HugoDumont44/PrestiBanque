package com.prestibanque.model;

/**
 * @author Spoilt
 */
public class Client extends Utilisateur {
	
	/*ATTRIBUTS*/
    private String adresse;
    private String ville;
    private String codePostal;
    private String telephone;

    
    /*CONSTRUCTEUR*/
    public Client(String nom, String prenom, String adresse, String ville, String codePostal, String telephone) {
        super(nom, prenom);
        this.adresse = adresse;
        this.ville = ville;
        this.codePostal = codePostal;
        this.telephone = telephone;
    }
    public Client(String nom, String prenom) {
        super(nom, prenom);
        this.adresse = "ma super adresse";
        this.ville = "la city";
        this.codePostal = "le 9 3";
        this.telephone = "SOS";
    }


    
    /*METHODES D'ACCES AUX ATTRIBUTS*/
    public String getAdresse() {
        return adresse;
    }
    public Client setAdresse(String adresse) {
        this.adresse = adresse;
        return this;
    }
    public String getVille() {
        return ville;
    }
    public Client setVille(String ville) {
        this.ville = ville;
        return this;
    }
    public String getCodePostal() {
        return codePostal;
    }
    public Client setCodePostal(String codePostal) {
        this.codePostal = codePostal;
        return this;
    }
    public String getTelephone() {
        return telephone;
    }
    public Client setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }
    
}
