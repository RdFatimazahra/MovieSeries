package com.service;

import com.dao.MovieDao;
import com.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieDao movieDao;

    public List<Movie> getAllMovies() {
        return movieDao.findAll();
    }

    public Movie getMovieById(Long id) {
        return movieDao.findById(id);
    }

    public void saveMovie(Movie movie) {
        movieDao.save(movie);
    }

    public void updateMovie(Movie movie) {
        movieDao.update(movie);
    }

    public void deleteMovie(Long id) {
        movieDao.delete(id);
    }
}
