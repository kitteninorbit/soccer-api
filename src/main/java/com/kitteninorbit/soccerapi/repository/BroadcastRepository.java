package com.kitteninorbit.soccerapi.repository;

import com.kitteninorbit.soccerapi.model.Broadcast;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BroadcastRepository extends JpaRepository<Broadcast, Long> {
}
