package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.model.Serie;
import com.service.SerieService;

@Controller
public class SerieController {

    private SerieService serieService;

    public SerieController(SerieService serieService) {
        this.serieService = serieService;
    }

    @GetMapping("/ajouterSerie")
    public String afficherFormulaireAjoutSerie(Model model) {
        model.addAttribute("serie", new Serie());
        return "ajouterSerie";
    }

    @PostMapping("/ajouterSerie")
    public String ajouterSerie(@ModelAttribute("serie") Serie serie) {
        serieService.ajouterSerie(serie);
        return "redirect:/listeSeries";
    }
}
