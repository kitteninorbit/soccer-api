package com.kitteninorbit.soccerapi.repository;

import com.kitteninorbit.soccerapi.model.Competition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompetitionRepository extends JpaRepository<Competition, Long> {
}
