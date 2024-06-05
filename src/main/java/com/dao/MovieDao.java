package com.dao;

import com.model.Movie;
import java.util.List;

public interface MovieDao {
    void save(Movie movie);
    void update(Movie movie);
    void delete(Long id);
    Movie findById(Long id);
    List<Movie> findAll();
}
