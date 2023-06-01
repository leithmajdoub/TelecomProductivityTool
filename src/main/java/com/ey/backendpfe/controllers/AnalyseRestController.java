package com.ey.backendpfe.controllers;

import com.ey.backendpfe.entities.Activite;
import com.ey.backendpfe.entities.Analyse;
import com.ey.backendpfe.repositories.IAnalyseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/analyse")
public class AnalyseRestController {

    @Autowired
    IAnalyseRepository analyseRepository;

    @GetMapping("/listanalyses")
    public List<Analyse> getAllAnalyses() {
        return analyseRepository.findAll();
    }

    @GetMapping("/findanalyse")
    @ResponseBody
    public Analyse findAnalyse(@RequestParam("idAnalyse") int idAnalyse) {
        return analyseRepository.findAnalyseById(idAnalyse);
    }

    @PostMapping("/addanalyse")
    @ResponseBody
    public Analyse addAnalyse(Analyse analyse) {
        return analyseRepository.save(analyse);
    }

    @PutMapping("/updateanalyse")
    @ResponseBody
    public Analyse updateAnalyse(@RequestBody Analyse analyse) {
        return analyseRepository.save(analyse);
    }

    @DeleteMapping("/deleteanalyse")
    @ResponseBody
    public void deleteAnalyse(@RequestParam("idAnalyse") int idAnalyse) {
        analyseRepository.deleteById(idAnalyse);
    }
}
