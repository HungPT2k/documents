package com.example.springboot.service;

import com.example.springboot.models.Movies;

import com.example.springboot.models.ResponseObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MovieService {
    List<Movies> getAllMovie();
    ResponseObject findMovieById(int id);
    ResponseObject findByMovieName2(String productName);
    ResponseObject insertMovie(Movies newProduct);
    ResponseObject updateMovie(Movies newProduct,int id);
    ResponseObject deleteMovie(int id);
    Page<Movies> getAllMovies(Pageable pageable);
    @Query("from Movies b where b.movieName=:keyword")
    Page<Movies> getAllMoviePage(Pageable pageable,@Param("keyword") String keyword);
}
