package com.prestibanque.service;

/**
 * @author Spoilt
 */
public class Simulation {
    private int duree; //en mois ?

    public Simulation(int duree) {
        this.duree = duree;
    }

    public int getDuree() {
        return duree;
    }

    public Simulation setDuree(int duree) {
        this.duree = duree;
        return this;
    }
}
