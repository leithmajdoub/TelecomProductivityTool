package com.ey.backendpfe.controllers;

import com.ey.backendpfe.entities.Departement;
import com.ey.backendpfe.repositories.IDepartementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departement")
public class DepartementRestController {

    @Autowired
    IDepartementRepository departementRepository;

    @GetMapping("/listdepartements")
    public List<Departement> getAllDepartements() { return departementRepository.findAll(); }

    @GetMapping("/finddepartement")
    @ResponseBody
    public Departement findDepartement(@RequestParam("idDepartement") int idDepartement) {
        return departementRepository.findDepartementById(idDepartement);
    }

    @PostMapping("/adddepartement")
    @ResponseBody
    public Departement addDepartement(Departement departement) {
        return departementRepository.save(departement);
    }

    @PutMapping("/updatedepartement")
    @ResponseBody
    public Departement updateDepartement(@RequestBody Departement departement){
        return departementRepository.save(departement);
    }

    @DeleteMapping("/deletedepartement")
    @ResponseBody
    public void deleteDepartement(@RequestParam("idDepartement") int idDepartement) {
        departementRepository.deleteById(idDepartement);
    }
}
