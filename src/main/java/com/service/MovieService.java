package com.service;

import com.dao.MovieDao;
import com.dao.impl.MovieDaoImpl;
import com.model.Movie;

import java.util.List;

public class MovieService {

    private MovieDao movieDao;

    public MovieService() {
        this.movieDao = new MovieDaoImpl(); // Vous pouvez utiliser une injection de dépendances ici
    }

    public Movie ajouterMovie(Movie movie) {
        return movieDao.ajouterMovie(movie);
    }

    public List<Movie> getAllMovies() {
        return movieDao.getAllMovies();
    }

    public void supprimerMovie(Long id) {
        movieDao.supprimerMovie(id);
    }

    public Movie getMovieById(Long id) {
        return movieDao.getMovieById(id);
    }


    public Movie modifierMovie(Movie movie) {
        return movieDao.modifierMovie(movie);
    }


    // Autres méthodes de service à implémenter
}
