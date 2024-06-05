package com.dao.impl;

import com.dao.MovieDao;
import com.model.Movie;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class MovieDaoImpl implements MovieDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void save(Movie movie) {
        entityManager.persist(movie);
    }

    @Override
    public void update(Movie movie) {
        entityManager.merge(movie);
    }

    @Override
    public void delete(Long id) {
        Movie movie = entityManager.find(Movie.class, id);
        if (movie != null) {
            entityManager.remove(movie);
        }
    }

    @Override
    public Movie findById(Long id) {
        return entityManager.find(Movie.class, id);
    }

    @Override
    public List<Movie> findAll() {
        TypedQuery<Movie> query = entityManager.createQuery("SELECT m FROM Movie m", Movie.class);
        return query.getResultList();
    }
}
