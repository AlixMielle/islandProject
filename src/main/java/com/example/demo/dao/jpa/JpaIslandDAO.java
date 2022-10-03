package com.example.demo.dao.jpa;

import com.example.demo.Entity.Island;
import com.example.demo.dao.IslandDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class JpaIslandDAO implements IslandDAO {

    @Override
    public List<Island> findAll() {
        List<Island> islands = new ArrayList<>();
        EntityManagerFactory emf = EMFManager.getEMF();
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            islands = em.createQuery("select i from Island i", Island.class)
                    //todo : finir de créer Island Entity
                    .getResultList();
            et.commit();
        } catch (RuntimeException re) {
            if (et.isActive())
                et.rollback();
        } finally {
            em.close();
        }
        return islands;
    }

    @Override
    public boolean create(Island island) {
        EntityManagerFactory emf = EMFManager.getEMF();
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            em.persist(island);
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
    public Optional<Island> findById(long idParam) {
        EntityManagerFactory emf = EMFManager.getEMF();
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        Island island = null;
        try {
            et.begin();
            island = em.find(Island.class, idParam);
            et.commit();
        } catch (RuntimeException re) {
            if (et.isActive())
                et.rollback();
        } finally {
            em.close();
        }
        return Optional.ofNullable(island);
    }

    @Override
    public boolean delete(long id) {
        EntityManagerFactory emf = EMFManager.getEMF();
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            Island island = em.find(Island.class, id);
            em.remove(island);
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
    public boolean edit(Island islandToEdit) {
        EntityManagerFactory emf = EMFManager.getEMF();
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            em.merge(islandToEdit);
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
