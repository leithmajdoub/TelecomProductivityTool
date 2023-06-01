package com.ey.backendpfe.services;

import com.ey.backendpfe.entities.Activite;
import com.ey.backendpfe.entities.PositionningAgainstBenchmark;
import com.ey.backendpfe.repositories.IActiviteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActiviteServiceImpl implements ActiviteService{

    @Autowired
    IActiviteRepository activiteRepository;

    @Override
    public void calculValeurDriverProductivite(Activite activite){
        float valDriverProd = activite.getUnitPerformance() / activite.getNbEmployees();
        activite.setValueDriverProductivite(valDriverProd);
    }

    // Mesurer la position du driver de productivité de l'activité par rapport au Benchmark
    @Override
    public void mesurePositionning(Activite activite) {
        if (activite.getValueDriverProductivite() < activite.getMinValueBenchmarkDriverProductivite()) {
            activite.setPositionningAgainstBenchmark(PositionningAgainstBenchmark.LOW);
        } else if (activite.getValueDriverProductivite() > activite.getMinValueBenchmarkDriverProductivite()) {
            activite.setPositionningAgainstBenchmark(PositionningAgainstBenchmark.HIGH);
        } else {
            activite.setPositionningAgainstBenchmark(PositionningAgainstBenchmark.IDEAL);
        }
    }
}
