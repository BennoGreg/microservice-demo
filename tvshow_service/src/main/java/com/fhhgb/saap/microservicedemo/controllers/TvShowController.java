package com.fhhgb.saap.microservicedemo.controllers;

import com.fhhgb.saap.microservicedemo.interfaces.TvShowRepository;
import com.fhhgb.saap.microservicedemo.models.TvShow;
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
@RequestMapping(path = "/show")
public class TvShowController {

    private final TvShowRepository tvShowRepository;

    @Autowired
    public TvShowController(TvShowRepository movieRepository) {
        this.tvShowRepository = movieRepository;
    }

    @GetMapping(path = "/getAll")
    public @ResponseBody Iterable<TvShow> getAll() {
        return tvShowRepository.findAll();
    }

    @GetMapping(path = "getById")
    public @ResponseBody
    TvShow getById(@RequestParam(defaultValue = "1") int id) {
        Optional<TvShow> show = tvShowRepository.findById(id);
        if (show.isEmpty())
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No TvShow with this Id!");
        else
            return show.get();
    }
}
