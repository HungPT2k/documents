package com.example.springboot.repositories;

import com.example.springboot.models.Movies;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movies,Integer> {
    List<Movies> findByMovieName(String movieName);
    @Query("from Movies b where b.movieName=:keyword")
    Page<Movies> findAll(Pageable pageable, String keyword);
}
