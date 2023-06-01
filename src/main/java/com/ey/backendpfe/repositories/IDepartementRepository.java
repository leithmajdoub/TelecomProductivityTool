package com.ey.backendpfe.repositories;

import com.ey.backendpfe.entities.Departement;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDepartementRepository extends CrudRepository<Departement, Integer> {
    List<Departement> findAll();
    Departement findDepartementById(int id);
}
