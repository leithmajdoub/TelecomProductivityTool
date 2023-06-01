package com.ey.backendpfe.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Activite implements Serializable {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    // Nombre d'employés permettant de générer la UnitPerformance
    @Column(name = "nbEmployees")
    private Integer nbEmployees;
    
    // Performance de l'unité (Input activité)
    @Column(name = "unitPerformance")
    private float unitPerformance;

    // Nom du Driver de productivité
    @Column(name = "driverProductivite")
    private String driverProductivite;

    // Valeur du driver productivité après son calcul
    @Column(name = "valeurDriverProductivite")
    private float valueDriverProductivite;

    // Valeur min Benchmark du Driver de Productivité
    @Column(name = "minValueBenchmarkDriverProductivite")
    private float minValueBenchmarkDriverProductivite;

    // Valeur max Benchmark du Driver de Productivité
    @Column(name = "maxValueBenchmarkDriverProductivite")
    private float maxValueBenchmarkDriverProductivite;

    // Position du driver de productivité par rapport au Benchmark
    @Column(name = "positionningAgainstBenchmark")
    @Enumerated(EnumType.STRING)
    private PositionningAgainstBenchmark positionningAgainstBenchmark;

    @ManyToOne
    Departement departement;

}

