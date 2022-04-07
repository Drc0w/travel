package org.acme.travel.domain.hotel;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Profile("dev")
public class ColHotelRepositoryImpl implements HotelRepository{

    private List<HotelEntity> hotels ;

    public ColHotelRepositoryImpl() {
        this.hotels= new ArrayList<>();
        this.hotels.add(new HotelEntity(1L,"Ritz"));
        this.hotels.add(new HotelEntity(2L,"Platza"));
        this.hotels.add(new HotelEntity(3L,"Hilton"));

    }

    @Override
    public List<HotelEntity> findAll() {
        return this.hotels;
    }
}
