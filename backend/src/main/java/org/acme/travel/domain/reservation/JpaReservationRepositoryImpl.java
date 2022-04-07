package org.acme.travel.domain.reservation;

import org.hibernate.annotations.Polymorphism;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Profile("local")
public class JpaReservationRepositoryImpl implements  ReservationRepository{
    private final JpaReservationDao dao;

    public JpaReservationRepositoryImpl(JpaReservationDao dao) {
        this.dao = dao;
    }

    @Override
    public List<ReservationEntity> findAll() {
        return this.dao.findAll();
    }

    @Override
    public void save(ReservationEntity entity) {
         this.dao.save(entity);
    }
}
