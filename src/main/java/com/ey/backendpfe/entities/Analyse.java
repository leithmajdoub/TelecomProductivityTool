package com.ey.backendpfe.entities;

import jakarta.persistence.*;
import jdk.jshell.execution.Util;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Analyse implements Serializable {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "codeMission")
    private int codeMission;

    @Column(name = "date")
    private Date date;

    @OneToOne
    private Unite unite;

    @OneToOne
    private Utilisateur utilisateur;

}
