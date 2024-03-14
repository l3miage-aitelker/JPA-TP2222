package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.*

@Entity
public class ProduitEntity {
    @Id
    private Long id;

    private String nom;

    private double prix;

    private int quatite;

    @ManyToOne
    private CategorieDeProduitEntity categorie;
}
