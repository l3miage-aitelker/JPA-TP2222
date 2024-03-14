package fr.uga.l3miage.tp2.exo3.models;

import java.util.Date;

import javax.persistence.*
@Entity
public class CommandeEntity {
    @Id
    private Long id;

    private Date date;

    private double montantTotal;

    @OneToMany
    private Set<ProduitEntity> produits;

    @ManyToOne
    private ClientEntity client;
}
