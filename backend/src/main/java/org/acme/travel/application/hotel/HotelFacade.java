package org.acme.travel.application.hotel;

import org.acme.travel.domain.hotel.HotelEntity;
import org.acme.travel.domain.hotel.HotelRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HotelFacade {

    private final HotelRepository repository;

    public HotelFacade(HotelRepository repository) {
        this.repository = repository;
    }

    public List<HotelEntity> findAll(){
        return this.repository.findAll();
    }
}
