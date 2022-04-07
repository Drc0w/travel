package org.acme.travel.domain.hotel;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Profile("local")
public class JpaHotelRepositoryImpl implements  HotelRepository{
    private final JpaHotelDao dao;

    public JpaHotelRepositoryImpl(JpaHotelDao dao) {
        this.dao = dao;
    }

    @Override
    public List<HotelEntity> findAll() {
        return this.dao.findAll();
    }
}
