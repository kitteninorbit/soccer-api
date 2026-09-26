package com.kitteninorbit.soccerapi.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "teams")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String logoUrl;

    @Column(name = "instagram_url", columnDefinition = "TEXT")
    private String instagramUrl;
}
