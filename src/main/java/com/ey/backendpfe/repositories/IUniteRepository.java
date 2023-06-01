package com.ey.backendpfe.repositories;

import com.ey.backendpfe.entities.Unite;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUniteRepository<x> extends CrudRepository<Unite, Integer> {
    List<Unite> findAll();
    Unite findUniteById(int id);

}
