package com.example.demo.dao.jpa;

import com.example.demo.Entity.Country;
import com.example.demo.dao.CountryDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

import java.util.List;
import java.util.Optional;

public class JpaCountryDAO implements CountryDAO {

    @Override
    public List<Country> findAll() {
        List<Country> countries = null;
        EntityManagerFactory emf = EMFManager.getEMF();
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            countries = em.createQuery("select c from Country c", Country.class)
                    .getResultList();
            et.commit();
        } catch (RuntimeException re) {
            if (et.isActive())
                et.rollback();
        } finally {
            em.close();
        }
        return countries;
    }

    @Override
    public boolean create(Country country) {
        EntityManagerFactory emf = EMFManager.getEMF();
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            em.persist(country);
            et.commit();
            return true;
        } catch (RuntimeException re) {
            if (et.isActive())
                et.rollback();
        } finally {
            em.close();
        }
        return false;
    }

    @Override
    public Optional<Country> findById(long idParam) {
        EntityManagerFactory emf = EMFManager.getEMF();
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        Country country = null;
        try {
            et.begin();
            country = em.find(Country.class, idParam);
            et.commit();
        } catch (RuntimeException re) {
            if (et.isActive())
                et.rollback();
        } finally {
            em.close();
        }
        return Optional.ofNullable(country);
    }

    @Override
    public boolean delete(long id) {
        EntityManagerFactory emf = EMFManager.getEMF();
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            Country country = em.find(Country.class, id);
            em.remove(country);
            et.commit();
            return true;
        } catch (RuntimeException re) {
            if (et.isActive())
                et.rollback();
        } finally {
            em.close();
        }
        return false;
    }

    @Override
    public boolean edit(Country countryToEdit) {
        EntityManagerFactory emf = EMFManager.getEMF();
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            em.merge(countryToEdit);
            et.commit();
            return true;
        } catch (RuntimeException re) {
            if (et.isActive())
                et.rollback();
        } finally {
            em.close();
        }
        return false;
    }
}
