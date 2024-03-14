package fr.uga.l3miage.tp2.exo2.models;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
// Nous avons décidé de prendre cette stratégie car c'est la plus lisible en ayant que les tables des deux classes enfant
public abstract class EmployeEntity {

    @Id
    private Long id;

    private String nom;

    private String email;

    private double salaire;
}
