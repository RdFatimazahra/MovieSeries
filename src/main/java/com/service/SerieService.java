package com.service;



import com.dao.SerieDao;
import com.dao.impl.SerieDaoImpl;

import com.model.Serie;

public class SerieService {

    private final SerieDaoImpl SerieService;
    private SerieDao serieDao;

    public SerieService() {
        this.SerieService= new SerieDaoImpl(); // Vous pouvez utiliser une injection de dépendances ici
    }

    public Serie ajouterSerie(Serie serie) {
        SerieDao serieDao = null;
        return serieDao.ajouterSerie(serie);
    }

    // Autres méthodes de service à implémenter
}
