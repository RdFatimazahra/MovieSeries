package com.model;

import jakarta.persistence.*;

@Entity
@Table(name = "films")
public class  Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMovie;

    @Column(nullable = false)
    private String titre;

    @Column(nullable = false, length = 1000)
    private String description;

    @Column(name = "dateSortie", nullable = false)
    private String dateSortie;

    @Column(nullable = false)
    private int duree;


    @Column(nullable = false)
    private String genre;

    @Column(nullable = false)
    private String realisateur;

    @Column(nullable = false)
    private String acteurs;

    @Column(nullable = false)
    private double note;

    // Getters and Setters
    public Long getId() {
        return idMovie;
    }

    public void setId(Long id) {
        this.idMovie = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(String dateSortie) {
        this.dateSortie = dateSortie;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public String getActeurs() {
        return acteurs;
    }

    public void setActeurs(String acteurs) {
        this.acteurs = acteurs;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }
}

