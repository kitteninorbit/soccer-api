package com.kitteninorbit.soccerapi.controller;

import com.kitteninorbit.soccerapi.model.Match;
import com.kitteninorbit.soccerapi.repository.MatchRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/matches")
public class MatchController {

    private final MatchRepository matchRepository;

    public MatchController(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    @GetMapping
    public List<Match> getAllMatches() {
        return matchRepository.findAllByOrderByMatchDatetimeAsc();
    }
}
