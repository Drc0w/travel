package org.acme.travel.application.chambre;

import org.acme.travel.domain.chambre.ChambreEntity;
import org.acme.travel.domain.chambre.ChambreRepository;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ChambreFacade {

    private final ChambreRepository repository;

    public ChambreFacade(ChambreRepository repository) {
        this.repository = repository;
    }

    public List<ChambreEntity> findAll(){
        return this.repository.findAll();
    }
}
