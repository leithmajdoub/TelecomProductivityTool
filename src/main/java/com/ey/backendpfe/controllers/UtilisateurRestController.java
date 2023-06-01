package com.ey.backendpfe.controllers;


import com.ey.backendpfe.entities.Utilisateur;
import com.ey.backendpfe.repositories.IUtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/utilisateur")
public class UtilisateurRestController {

    @Autowired
    IUtilisateurRepository utilisateurRepository;

    @GetMapping("/listutilisateurs")
    public List<Utilisateur> getAllUtilisateurs() { return utilisateurRepository.findAll(); }

    @GetMapping("/findutilisateur")
    @ResponseBody
    public Utilisateur findUtilisateur(@RequestParam("idUtilisateur") int idUtilisateur) {
        return utilisateurRepository.findUtilisateurById(idUtilisateur);
    }

    @PostMapping("/addutilisateur")
    @ResponseBody
    public Utilisateur addUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @PutMapping("/updateutilisateur")
    @ResponseBody
    public Utilisateur updateUtilisateur(@RequestBody Utilisateur utilisateur){
        return utilisateurRepository.save(utilisateur);
    }

    @DeleteMapping("/deleteutilisateur")
    @ResponseBody
    public void deleteUtilisateur(@RequestParam("idUtilisateur") int idUtilisateur) {
        utilisateurRepository.deleteById(idUtilisateur);
    }
}
