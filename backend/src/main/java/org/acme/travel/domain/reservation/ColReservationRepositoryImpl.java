package org.acme.travel.domain.reservation;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ColReservationRepositoryImpl implements  ReservationRepository{

    private List<ReservationEntity> reservations;

    public ColReservationRepositoryImpl() {
        this.reservations= new ArrayList<>();
        this.reservations.add(new ReservationEntity(1,"Ritz","Simple",1,"2022-03-03",100));
        this.reservations.add(new ReservationEntity(1,"Platza","Double",2,"2022-03-03",200));
        this.reservations.add(new ReservationEntity(1,"Hilton","Triple",3,"2022-03-03",300));
    }

    @Override
    public List<ReservationEntity> findAll() {
        return this.reservations;
    }
}
