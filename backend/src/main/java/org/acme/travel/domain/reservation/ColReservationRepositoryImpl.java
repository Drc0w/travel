package org.acme.travel.domain.reservation;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Profile("dev")
public class ColReservationRepositoryImpl implements  ReservationRepository{

    private List<ReservationEntity> reservations;

    public ColReservationRepositoryImpl() {
        this.reservations= new ArrayList<>();
        this.reservations.add(new ReservationEntity(1L,"Ritz","Simple",1,"2022-03-03",100));
        this.reservations.add(new ReservationEntity(2L,"Platza","Double",2,"2022-03-03",200));
        this.reservations.add(new ReservationEntity(3L,"Hilton","Triple",3,"2022-03-03",300));
    }

    @Override
    public void save(ReservationEntity entity) {
        entity.setId(this.reservations.size()+1L);
        this.reservations.add(entity);

    }

    @Override
    public List<ReservationEntity> findAll() {
        return this.reservations;
    }
}
