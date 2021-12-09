package com.fhhgb.saap.microservicedemo.controllers;

import com.fhhgb.saap.microservicedemo.interfaces.MovieRepository;
import com.fhhgb.saap.microservicedemo.models.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Controller
@RequestMapping(path = "/movie")
public class MovieController {

    private final MovieRepository movieRepository;

    @Autowired
    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping(path = "/getAll")
    public @ResponseBody Iterable<Movie> getAll() {
        return movieRepository.findAll();
    }

    @GetMapping(path = "getById")
    public @ResponseBody Movie getById(@RequestParam(defaultValue = "1") int id) {
        Optional<Movie> movie = movieRepository.findById(id);
        if (movie.isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No Movie with this Id!");
        else
            return movie.get();
    }
}
