package com.dao.impl;

import com.dao.MovieDao;
import com.model.Movie;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class MovieDaoImpl implements MovieDao {

    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public MovieDaoImpl() {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("test");
        this.entityManager = this.entityManagerFactory.createEntityManager();
    }

    public MovieDaoImpl(jakarta.persistence.EntityManagerFactory entityManagerFactory, jakarta.persistence.EntityManager entityManager) {
    }

    @Override
    public Movie ajouterMovie(Movie movie) {
        entityManager.getTransaction().begin();
        entityManager.persist(movie);
        entityManager.getTransaction().commit();
        return movie;
    }

    @Override
    public List<Movie> getAllMovies() {
//        System.out.println(entityManager.createQuery("SELECT m FROM Movie m", Movie.class).getResultList());
        return entityManager.createQuery("SELECT m FROM Movie m", Movie.class).getResultList();
    }

    @Override
    public void supprimerMovie(Long id) {
        entityManager.getTransaction().begin();
        Movie movie = entityManager.find(Movie.class, id);
        if (movie != null) {
            entityManager.remove(movie);
        }
        entityManager.getTransaction().commit();
    }


    public Movie getMovieById(Long id) {
        return entityManager.find(Movie.class, id);
    }

    @Override
    public Movie modifierMovie(Movie movie) {
        entityManager.getTransaction().begin();
        Movie updatedMovie = entityManager.merge(movie);
        entityManager.getTransaction().commit();
        return updatedMovie;
    }

    // Autres méthodes CRUD à implémenter

    public void close() {
        entityManager.close();
        entityManagerFactory.close();
    }
}
