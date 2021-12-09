package com.fhhgb.saap.microservicedemo.models;

import javax.persistence.*;

@Entity
public class TvShow {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer showId;

    private String title;

    private String description;

    private int episodes;

    private String image_link;

    private int genre;

    public Integer getMovieId() {
        return showId;
    }

    public void setMovieId(Integer movieId) {
        this.showId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public String getImage_link() {
        return image_link;
    }

    public void setImage_link(String image_link) {
        this.image_link = image_link;
    }

    public int getGenre() {
        return genre;
    }

    public void setGenre(int genre) {
        this.genre = genre;
    }
}
