package com.prestibanque.service;

/**
 * @author Spoilt
 */
public class Suppression {
    private int id;

    public Suppression(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Suppression setId(int id) {
        this.id = id;
        return this;
    }
}
