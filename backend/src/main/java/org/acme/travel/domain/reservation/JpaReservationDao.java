package org.acme.travel.domain.reservation;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JpaReservationDao extends CrudRepository<ReservationEntity,Long> {
    List<ReservationEntity> findAll();
    ReservationEntity save(ReservationEntity entity);
}
