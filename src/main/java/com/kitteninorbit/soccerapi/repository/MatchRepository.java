package com.kitteninorbit.soccerapi.repository;

import com.kitteninorbit.soccerapi.model.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface MatchRepository extends JpaRepository<Match, Long> {
    List<Match> findAllByOrderByMatchDatetimeAsc();
}
