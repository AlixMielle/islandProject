package com.example.demo.dao.jpa;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class EMFManager {
    private static EntityManagerFactory EMF_SINGLETON = null;

    private EMFManager() {
        //avoid instantiation
    }

    public static EntityManagerFactory getEMF() {
        if (EMF_SINGLETON == null) {
            try {
                EMF_SINGLETON = Persistence.createEntityManagerFactory("PU");
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println("Connexion impossible");
            }
        }
        return EMF_SINGLETON;
    }

    public static void closeEMF() {
        try {
            EMF_SINGLETON.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
