package com.kitteninorbit.soccerapi.controller;

import com.kitteninorbit.soccerapi.model.Competition;
import com.kitteninorbit.soccerapi.repository.CompetitionRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "https://jogo-delas.vercel.app")
@RestController
@RequestMapping("/api/competitions")
public class CompetitionController {

    private final CompetitionRepository competitionRepository;

    public CompetitionController(CompetitionRepository competitionRepository) {
        this.competitionRepository = competitionRepository;
    }

    @GetMapping
    public List<Competition> getAllCompetitions() {
        return competitionRepository.findAll();
    }
}
