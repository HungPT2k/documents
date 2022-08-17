package com.example.springboot.repositories;

import com.example.springboot.models.Zoom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZoomRepository extends JpaRepository<Zoom,Integer> {

}
