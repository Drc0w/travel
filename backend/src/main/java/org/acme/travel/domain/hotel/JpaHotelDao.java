package org.acme.travel.domain.hotel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JpaHotelDao extends CrudRepository<HotelEntity,Long> {
    public List<HotelEntity> findAll();
}
