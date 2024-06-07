package com.dao.impl;

import com.dao.SerieDao;
import com.model.Serie;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SerieDaoImpl implements SerieDao {

    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public SerieDaoImpl() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("test");
        this.entityManager = this.entityManagerFactory.createEntityManager();
    }

    public SerieDaoImpl(jakarta.persistence.EntityManagerFactory entityManagerFactory, jakarta.persistence.EntityManager entityManager) {
    }

    public Serie ajouterSerie(Serie serie) {
        entityManager.getTransaction().begin();
        entityManager.persist(serie);
        entityManager.getTransaction().commit();
        return serie;
    }

    // Autres méthodes CRUD à implémenter

    public void close() {
        entityManager.close();
        entityManagerFactory.close();
    }
}
