package com.gsd.movieapi.service;

import com.gsd.movieapi.entity.Movie;
import com.gsd.movieapi.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> movie(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
