package com.example.springboot.controllers;

import com.example.springboot.models.Zoom;
import com.example.springboot.service.ZoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins ="http://localhost:3000")
@RestController
@RequestMapping(path = "/ap1/v1/zoom")
public class ZoomController {
    @Autowired
    private ZoomService zoomService;
    @GetMapping("")
    List<Zoom> getAllZoom(){
        return zoomService.getAllZoom();
    }
}
