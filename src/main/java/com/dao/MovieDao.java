package com.dao;

import com.model.Movie;

public interface MovieDao {
    Movie ajouterMovie(Movie movie);
    void close(); // Ajouter la méthode close à l'interface
}
