package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.*
@Entity
public class ClientEntity {

    @Id
    private Long id;

    private String nom;

    private String email;

    @OneToMany
    private Set<CommandeEntity> commandes;
}
