package com.controller;

import com.model.Movie;
import com.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
}
