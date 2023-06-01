package com.ey.backendpfe.services;

import com.ey.backendpfe.entities.Activite;

public interface ActiviteService {
    void calculValeurDriverProductivite(Activite activite);
    void mesurePositionning(Activite activite);
}
