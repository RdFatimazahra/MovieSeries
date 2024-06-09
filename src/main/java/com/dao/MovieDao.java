package com.dao;

import com.model.Movie;

import java.util.List;

public interface MovieDao {
    Movie ajouterMovie(Movie movie);
    List<Movie> getAllMovies();
    Movie modifierMovie(Movie movie);

    void close(); // Ajouter la méthode close à l'interface
}
