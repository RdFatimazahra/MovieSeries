package com.dao;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import com.model.Movie;

public class MovieDaoTest {


        public static void main(String[] args) {
            MovieDao movieDao = new MovieDao();

            Movie movie = new Movie();
            movie.setTitre("Test Movie");
            movie.setDescription("This is a test movie");
            movie.setDateSortie("2022-01-01");
            movie.setDuree(120);
            movie.setGenre("Action");
            movie.setRealisateur("John Doe");
            movie.setActeurs("Tom Hanks, Julia Roberts");
            movie.setNote(8.5);
            movie.setImage("https://img.freepik.com/vecteurs-libre/affiche-professionnelle-film-suspense_742173-3470.jpg?size=338&ext=jpg&ga=GA1.1.44546679.1716595200&semt=ais_user");

            movieDao.ajouterMovie(movie);

            movieDao.close();

        }
    }