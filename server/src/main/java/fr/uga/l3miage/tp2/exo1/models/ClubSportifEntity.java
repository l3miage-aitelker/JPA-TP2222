package fr.uga.l3miage.tp2.exo1.models;

import javax.persistence.*;
@Entity
public class ClubSportifEntity {
    @Id
    private Long id;

    private String nom;

    private String description;

    @ManyToMany
    private Set<EtudiantEntity> etudiants;
}
