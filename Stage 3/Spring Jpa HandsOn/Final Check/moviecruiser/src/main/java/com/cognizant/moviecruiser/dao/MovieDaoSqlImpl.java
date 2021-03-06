package com.cognizant.moviecruiser.dao;

import com.cognizant.moviecruiser.model.Movie;
import com.cognizant.moviecruiser.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieDaoSqlImpl implements MovieDao {

    @Autowired
    private MovieService movieService;

    public List<Movie> getMovieListAdmin() {
        return movieService.getMovieListAdmin();
    }

    public List<Movie> getMovieListCustomer() {
        return movieService.getMovieListCustomer();
    }

    public void modifyMovie(Movie movie) {
        movieService.modifyMovie(movie);
    }

    public Movie getMovie(long movieId) {
        return movieService.getMovie(movieId);
    }

    public void save(List<Movie> movies) {
        movieService.save(movies);
    }

}
