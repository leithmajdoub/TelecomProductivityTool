package com.ey.backendpfe.repositories;

import com.ey.backendpfe.entities.Utilisateur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUtilisateurRepository extends CrudRepository<Utilisateur, Integer> {

    List<Utilisateur> findAll();
    Utilisateur findUtilisateurById(int id);
}
