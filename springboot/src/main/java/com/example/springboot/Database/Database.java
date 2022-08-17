package com.example.springboot.Database;

import com.example.springboot.models.Movies;
//import com.example.springboot.models.Product;
import com.example.springboot.models.Users;
import com.example.springboot.models.Zoom;
import com.example.springboot.repositories.MovieRepository;
//import com.example.springboot.repositories.ProductRepository;


import com.example.springboot.repositories.UserRepository;
import com.example.springboot.repositories.ZoomRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration // chạy đầu tiên

public class Database {
    private static final Logger logger=  LoggerFactory.getLogger(Database.class);
//    @Bean
//    CommandLineRunner initDatabase(ZoomRepository zoomRepository){
//        return args -> {
//            Zoom productA =new Zoom(1,"101",3,4,"j");
//            Zoom productB =new Zoom("102",2);
//        logger.info("insert data"+zoomRepository.save(productA));
//            logger.info("insert data"+ zoomRepository.save(productB));
//        };
//    }
//    @Bean
//    CommandLineRunner initDatabase2(UserRepository userRepository){
//        return args -> {
//            Users userA =new Users("ThaoTT","14062000","Trinh Thao","thao123@gmail.com","14/6","Hanoi");
//            Users userB =new Users("NamNv","14152001","Nguyen Nam","nam213@gmail.com","14/5","Nghe An");
//            logger.info("insert data"+userRepository.save(userA));
//            logger.info("insert data"+ userRepository.save(userB));
//        };
//    }
//    @Bean
//    CommandLineRunner initDatabase3(MovieRepository movieRepository){
//        return args -> {
//            for( int i=0 ; i< 20 ; i++) {
//                Movies movieA = new Movies("Harry Potter 4"+i, "https://youtu.be/VyHV0BRtdxo", "https://bilutv.link/film/20673/poster.jpg", "Action", "Phim noi ve gia dinh phep thuat", "12/9/2001");
//
//                logger.info("insert data" + movieRepository.save(movieA));
//            }
//        };
//    }
}
