package org.acme.travel.domain.reservation;

import java.util.List;

public interface ReservationRepository {

    public List<ReservationEntity> findAll();
}
