package com.example.springboot.serviceiml;

import com.example.springboot.models.Zoom;
import com.example.springboot.repositories.ZoomRepository;
import com.example.springboot.service.ZoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ZoomServiceIml implements ZoomService {
    @Autowired
   private ZoomRepository zoomRepository;
    @Override
    public List<Zoom> getAllZoom() {
        return zoomRepository.findAll();
    }
}
