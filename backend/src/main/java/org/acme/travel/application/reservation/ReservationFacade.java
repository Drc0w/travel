package org.acme.travel.application.reservation;

import org.acme.travel.domain.reservation.ReservationEntity;
import org.acme.travel.domain.reservation.ReservationRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ReservationFacade {

    private final ReservationRepository repository;

    public ReservationFacade(ReservationRepository repository) {
        this.repository = repository;
    }

    public List<ReservationEntity> findAll(){
        return this.repository.findAll();
    }
    public void save(ReservationEntity entity){
        this.repository.save(entity);
    }
}
