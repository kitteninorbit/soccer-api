package com.kitteninorbit.soccerapi.controller;

import com.kitteninorbit.soccerapi.model.Broadcast;
import com.kitteninorbit.soccerapi.repository.BroadcastRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "https://jogo-delas.vercel.app")
@RestController
@RequestMapping("/api/broadcasts")
public class BroadcastController {

    private final BroadcastRepository broadcastRepository;

    public BroadcastController(BroadcastRepository broadcastRepository) {
        this.broadcastRepository = broadcastRepository;
    }

    @GetMapping
    public List<Broadcast> getAllBroadcasts() {
        return broadcastRepository.findAll();
    }
}