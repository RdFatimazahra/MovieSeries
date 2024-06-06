package com.dao;

import com.model.Movie;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class MovieDao {

    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public MovieDao() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("test");
        this.entityManager = this.entityManagerFactory.createEntityManager();
    }

    public Movie ajouterMovie(Movie movie) {
        entityManager.getTransaction().begin();
        entityManager.persist(movie);
        entityManager.getTransaction().commit();
        return movie;
    }

    public void close() {
        entityManager.close();
        entityManagerFactory.close();
    }
}