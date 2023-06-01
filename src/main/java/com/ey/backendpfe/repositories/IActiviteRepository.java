package com.ey.backendpfe.repositories;

import com.ey.backendpfe.entities.Activite;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IActiviteRepository extends CrudRepository<Activite, Integer> {

    List<Activite> findAll();
    Activite findActiviteById(int id);
}
