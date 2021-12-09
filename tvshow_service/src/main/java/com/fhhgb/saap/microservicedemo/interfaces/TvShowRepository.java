package com.fhhgb.saap.microservicedemo.interfaces;

import com.fhhgb.saap.microservicedemo.models.TvShow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TvShowRepository extends JpaRepository<TvShow, Integer> {
}