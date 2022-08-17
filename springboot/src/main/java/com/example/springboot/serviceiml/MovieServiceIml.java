package com.example.springboot.serviceiml;

import com.example.springboot.models.Movies;
import com.example.springboot.models.ResponseObject;
import com.example.springboot.repositories.MovieRepository;
import com.example.springboot.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceIml implements MovieService {
    @Autowired
    private MovieRepository movieRepository;
    @Override
    public List<Movies> getAllMovie() {
        return movieRepository.findAll();
    }

    @Override
    public ResponseObject findMovieById(int id) {
        Optional<Movies> foundMovie = movieRepository.findById(id);// Optional : có thể null
        if (foundMovie.isPresent()) { // check null
            return new ResponseObject("ok", "Query movies successfully", foundMovie);
        } else {
            return new ResponseObject("Eros", "Not found id= " + id, "");

        }
    }

    @Override
    public ResponseObject findByMovieName2(String movieName) {
        List<Movies> foundMovie=movieRepository.findByMovieName(movieName);
        if(foundMovie.size()==0){
            return new ResponseObject("Fail", "Name Movie is not already","");
        }
        else {
            return     new ResponseObject("ok", "Find Movie successfully", foundMovie);
        }

    }

    @Override
    public ResponseObject insertMovie(Movies newMovie) {
        List<Movies> foundMovie=movieRepository.findByMovieName(newMovie.getMovieName());
        String name = newMovie.getMovieName();
        String trailer = newMovie.getMovieTrailer();
        Date date = newMovie.getDateRelease();
        String poster = newMovie.getMoviePoster();
        String type = newMovie.getMovieType();
        if (name.isEmpty() || trailer.isEmpty() || poster.isEmpty() || type.isEmpty() || date.toString().isEmpty())
        {
            return new ResponseObject("Fail", "Data is empty","");
        }
        else if(foundMovie.size()>0){
            return new ResponseObject("Fail", "Name Movie is already","");
        }
        else {
            return     new ResponseObject("ok", "Insert Movie successfully", movieRepository.save(newMovie));
        }
    }

    @Override
    public ResponseObject updateMovie(Movies newMovie, int id) {
        Movies updateMovie= movieRepository.findById(id).map(movies -> {
            movies.setMovieName(newMovie.getMovieName());
            movies.setMoviePoster(newMovie.getMoviePoster());
            movies.setMovieType(newMovie.getMovieType());
            movies.setMovieTrailer(newMovie.getMovieTrailer());
            movies.setDateRelease(newMovie.getDateRelease());
            movies.setMovieDetail(newMovie.getMovieDetail());
            return movieRepository.save(movies);
        }).orElseGet(()->{
            newMovie.setMovieId(id);
            return movieRepository.save(newMovie);}
        );


        return new ResponseObject("Ok", "Update User is successfully",updateMovie);
    }

    @Override
    public ResponseObject deleteMovie(int id) {
        boolean movie = movieRepository.existsById(id);
        if(movie){
            movieRepository.deleteById(id);
            return new ResponseObject("ok", "Product is  deleted", "");
        }
        return new ResponseObject("Fail", "Product is  not already", "");
    }

    @Override
    public Page<Movies> getAllMovies(Pageable pageable) {
        return movieRepository.findAll(pageable);
    }


    @Override
    public Page<Movies> getAllMoviePage(Pageable pageable, String keyword) {
        return movieRepository.findAll(pageable,keyword);
    }

}
