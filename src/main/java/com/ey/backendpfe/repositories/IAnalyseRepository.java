package com.ey.backendpfe.repositories;

import com.ey.backendpfe.entities.Analyse;
import com.ey.backendpfe.entities.Utilisateur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAnalyseRepository extends CrudRepository<Analyse, Integer> {
    List<Analyse> findAll();
    Analyse findAnalyseById(int id);
}
