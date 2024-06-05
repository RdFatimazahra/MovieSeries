package com.controller;

import com.model.Movie;
import com.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public String getAllMovies(Model model) {
        List<Movie> movies = movieService.getAllMovies();
        model.addAttribute("movies", movies);
        return "movies/list"; // Assuming you have a JSP file named list.jsp under movies folder
    }

    @GetMapping("/{id}")
    public String getMovieById(@PathVariable Long id, Model model) {
        Movie movie = movieService.getMovieById(id);
        model.addAttribute("movie", movie);
        return "movies/detail"; // Assuming you have a JSP file named detail.jsp under movies folder
    }

    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("movie", new Movie());
        return "movies/form"; // Assuming you have a JSP file named form.jsp under movies folder
    }

    @PostMapping
    public String saveMovie(@ModelAttribute Movie movie) {
        movieService.saveMovie(movie);
        return "redirect:/movies";
    }

    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable Long id, Model model) {
        Movie movie = movieService.getMovieById(id);
        model.addAttribute("movie", movie);
        return "movies/form"; // Assuming you have a JSP file named form.jsp under movies folder
    }

    @PostMapping("/{id}")
    public String updateMovie(@PathVariable Long id, @ModelAttribute Movie movie) {
        movie.setId(id);
        movieService.updateMovie(movie);
        return "redirect:/movies";
    }

    @GetMapping("/delete/{id}")
    public String deleteMovie(@PathVariable Long id) {
        movieService.deleteMovie(id);
        return "redirect:/movies";
    }
}
