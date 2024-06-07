package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.dao.impl.SerieDaoImpl;


import com.model.Serie;

import java.util.Date;

public class SerieDaoTest {


    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        SerieDao serieDao = new SerieDaoImpl();
        SerieDao serieService=new SerieDaoImpl();
        Serie serie = new Serie();
        serie.setTitre("Test Serie");
        serie.setDescription("Description de la série");
        serie.setDateDebut(new Date());
        serie.setDateFin(new Date());
        serie.setNombreDeSaison(2);
        serie.setGenre("romantique");
        serie.setRealisateur("nadia");
        serie.setActeurs("Acteur Test");
        serie.setNote(8.5f);
        serie.setCreateur("Créateur Test");
        serie.setImage("");

        serieService.ajouterSerie(serie);
        System.out.println("Série ajoutée avec succès!");

        serieService.close();
        entityManager.close();
        entityManagerFactory.close();
    }


    }

