package com.dao;

import com.model.Movie;

import java.util.List;

public interface MovieDao {
    Movie ajouterMovie(Movie movie);
    List<Movie> getAllMovies();
    Movie modifierMovie(Movie movie);
    Movie getMovieById(Long id);
    void supprimerMovie(Long id);
    void close(); // Ajouter la méthode close à l'interface
}
