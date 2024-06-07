package com.dao;

import com.model.Serie;

public interface SerieDao {
    Serie ajouterSerie(Serie serie);
    void close();
}
