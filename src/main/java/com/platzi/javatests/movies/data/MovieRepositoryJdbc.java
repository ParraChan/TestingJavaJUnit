package com.platzi.javatests.movies.data;

import com.platzi.javatests.movies.model.Movie;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Collection;

public class MovieRepositoryJdbc implements MovieRepository {

    private JdbcTemplate jdbcTemplate;

    public MovieRepositoryJdbc(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Movie findById(long id) {
        return null;
    }

    @Override
    public Collection<Movie> findAll() {
        return null;
    }

    @Override
    public void saveOrUpdate(Movie movie) {

    }
}
