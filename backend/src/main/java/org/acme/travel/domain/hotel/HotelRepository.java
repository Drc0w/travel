package org.acme.travel.domain.hotel;

import org.springframework.stereotype.Repository;

import java.util.List;

public interface HotelRepository {

    public List<HotelEntity> findAll();
}
