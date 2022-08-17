package com.example.springboot.controllers;

import com.example.springboot.models.Movies;
import com.example.springboot.models.ResponseObject;
import com.example.springboot.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins ="http://localhost:3000")
@RestController
@RequestMapping(path = "/ap1/v1/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;
    @GetMapping("")
    List<Movies> getAllMovie() {
        return movieService.getAllMovie();
    }

    @GetMapping("/pages/{key}")
    Page<Movies> getAllMoviePage(Pageable pageable, @PathVariable("key") String key) {
        return movieService.getAllMoviePage(pageable,key);
    }
    @GetMapping("/")
    Page<Movies> getAllMovies(Pageable pageable) {
        return movieService.getAllMovies(pageable);
    }
     //findByID
    @GetMapping("/{id}")
    ResponseEntity<ResponseObject> finById(@PathVariable int id) {
        return ResponseEntity.status(HttpStatus.OK).body(movieService.findMovieById(id));
    }
    // insert
    @PostMapping("insert")
    ResponseEntity<ResponseObject> InsertMovie(@RequestBody Movies newMovie) {

        return  ResponseEntity.status(HttpStatus.OK).body(movieService.insertMovie(newMovie));
    }
    // update
    @PutMapping("/{id}")
    ResponseEntity<ResponseObject> UpdateMovie(@RequestBody Movies newMovie,@PathVariable int id) {
        return ResponseEntity.status(HttpStatus.OK).body(movieService.updateMovie(newMovie,id));

    }
    // delete
    @DeleteMapping("/{id}")
    ResponseEntity<ResponseObject> DeleteMovie(@PathVariable int id) {
        return ResponseEntity.status(HttpStatus.OK).body(movieService.deleteMovie(id));
    }
}
