package com.ey.backendpfe.controllers;

import com.ey.backendpfe.entities.Unite;
import com.ey.backendpfe.repositories.IUniteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/unite")
public class UniteRestController {

    @Autowired
    IUniteRepository uniteRepository;

    @GetMapping("/listunites")
    public List<Unite> getAllUnites() { return uniteRepository.findAll(); }

    @GetMapping("/findunite")
    @ResponseBody
    public Unite findUnite(@RequestParam("idUnite") int idUnite) {
        return uniteRepository.findUniteById(idUnite);
    }

    @PostMapping("/addunite")
    @ResponseBody
    public Unite addUnite(Unite unite) {
        return (Unite) uniteRepository.save(unite);
    }

    @PutMapping("/updateunite")
    @ResponseBody
    public Unite updateUnite(@RequestBody Unite unite){
        return (Unite) uniteRepository.save(unite);
    }

    @DeleteMapping("/deleteunite")
    @ResponseBody
    public void deleteUnite(@RequestParam("idUnite") int idUnite) {
        uniteRepository.deleteById(idUnite);
    }
}
