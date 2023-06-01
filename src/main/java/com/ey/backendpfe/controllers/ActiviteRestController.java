package com.ey.backendpfe.controllers;

import com.ey.backendpfe.entities.Activite;
import com.ey.backendpfe.repositories.IActiviteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/activite")
public class ActiviteRestController {

    @Autowired
    IActiviteRepository activiteRepository;

    @GetMapping("/listactivites")
    public List<Activite> getAllActivites() { return activiteRepository.findAll(); }

    @GetMapping("/findactivite")
    @ResponseBody
    public Activite findActivite(@RequestParam("idActivite") int idActivite) {
        return activiteRepository.findActiviteById(idActivite);
    }

    @PostMapping("/addactivite")
    @ResponseBody
    public Activite addActivite(Activite activite) {
        return activiteRepository.save(activite);
    }

    @PutMapping("/updateactivite")
    @ResponseBody
    public Activite updateActivite(@RequestBody Activite activite){
        return activiteRepository.save(activite);
    }

    @DeleteMapping("/deleteactivite")
    @ResponseBody
    public void deleteActivite(@RequestParam("idActivite") int idActivite) {
        activiteRepository.deleteById(idActivite);
    }
}
