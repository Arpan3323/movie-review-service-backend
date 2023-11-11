package com.isitwatchable.watchable;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    //Autowired annotation is used to inject the dependency automatically, thus not requiring to write new keyword everytime.
    @Autowired
    private MovieRepository movieRepository;
    
    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> singleMovie(String imdbId) {
        return movieRepository.findByImdbId(imdbId);
    }
}
