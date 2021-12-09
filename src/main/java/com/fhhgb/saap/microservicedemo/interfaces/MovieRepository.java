package com.fhhgb.saap.microservicedemo.interfaces;

import com.fhhgb.saap.microservicedemo.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}