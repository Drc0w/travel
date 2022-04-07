package org.acme.travel.api.rest.reservation;

import org.acme.travel.domain.reservation.ReservationEntity;

public class ReservationDTO {
    private ReservationEntity entity;


    public ReservationDTO(ReservationEntity entity) {
        this.entity = entity;
    }
    public static ReservationDTO map(ReservationEntity entity){
        return new ReservationDTO(entity);
    }
    public Long getId(){
        return this.entity.getId();
    }
    public String getHotel(){
        return this.entity.getHotel();
    }
    public String getChambre(){
        return this.entity.getChambre();
    }
    public String getDate(){
        return this.entity.getDate();
    }
    public int getNuits(){
        return this.entity.getNuits();
    }
    public int getMontant(){
        return this.entity.getMontant();
    }
}
