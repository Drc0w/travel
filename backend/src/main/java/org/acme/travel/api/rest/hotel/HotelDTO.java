package org.acme.travel.api.rest.hotel;

import org.acme.travel.domain.hotel.HotelEntity;

public class HotelDTO {
    private HotelEntity sub;

    public HotelDTO(HotelEntity sub) {
        this.sub = sub;
    }
    public int getId(){
        return this.sub.getId();
    }
    public String getNom(){
        return this.sub.getNom();
    }
    public static HotelDTO map(HotelEntity entity){
        return new HotelDTO(entity);
    }
}
