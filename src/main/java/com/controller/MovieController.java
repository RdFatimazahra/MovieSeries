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

    @GetMapping("/create")
    public String showAddMovieForm() {
        return "addMovie"; // This returns the name of the JSP file: addMovie.jsp
    }

    @PostMapping("/add")
    public String addMovie(
            @RequestParam("titre") String titre,
            @RequestParam("description") String description,
            @RequestParam("dateSortie") String dateSortie,
            @RequestParam("duree") int duree,
            @RequestParam("genre") String genre,
            @RequestParam("realisateur") String realisateur,
            @RequestParam("acteurs") String acteurs,
            @RequestParam("note") double note,
            @RequestParam("image") String image,
            Model model) {

        Movie movie = new Movie();
        movie.setTitre(titre);
        movie.setDescription(description);
        movie.setDateSortie(dateSortie);
        movie.setDuree(duree);
        movie.setGenre(genre);
        movie.setRealisateur(realisateur);
        movie.setActeurs(acteurs);
        movie.setNote(note);
        movie.setImage(image);

        movieService.ajouterMovie(movie);

        model.addAttribute("message", "Film ajouté avec succès");
        return "redirect:/movies/create";
    }
    @GetMapping("/list")
    public String listMovies(Model model) {
        List<Movie> movies = movieService.getAllMovies();
        model.addAttribute("movies", movies);
        return "listMovies"; // Assurez-vous que le nom du fichier JSP est "listMovies.jsp"
    }
    @PostMapping("/deleteMovie")
    public String deleteMovie(@RequestParam("id") Long id) {
        movieService.supprimerMovie(id);
        return "redirect:/movies/list";
    }

    @GetMapping("/edit/{id}")
    public String showEditMovieForm(@PathVariable Long id, Model model) {
        Movie movie = movieService.getMovieById(id);
        model.addAttribute("movie", movie);
        return "editMovie";
    }

    @PostMapping("/edit")
    public String editMovie(@ModelAttribute Movie movie) {
        movieService.modifierMovie(movie);
        return "redirect:/movies/list";
    }

}
