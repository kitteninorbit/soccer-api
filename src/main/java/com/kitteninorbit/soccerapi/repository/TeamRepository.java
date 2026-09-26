package com.kitteninorbit.soccerapi.repository;

import com.kitteninorbit.soccerapi.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
