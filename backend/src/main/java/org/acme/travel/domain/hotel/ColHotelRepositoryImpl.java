package org.acme.travel.domain.hotel;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ColHotelRepositoryImpl implements HotelRepository{

    private List<HotelEntity> hotels ;

    public ColHotelRepositoryImpl() {
        this.hotels= new ArrayList<>();
        this.hotels.add(new HotelEntity(1,"Ritz"));
        this.hotels.add(new HotelEntity(2,"Platza"));
        this.hotels.add(new HotelEntity(3,"Hilton"));

    }

    @Override
    public List<HotelEntity> findAll() {
        return this.hotels;
    }
}
