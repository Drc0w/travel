package org.acme.travel.api.rest.reservation;

import org.acme.travel.domain.reservation.ReservationEntity;

public class ReservationFormDTO {
    private String hotel;
    private String chambre;
    private int nuits;
    private String date;
    private int montant;

    public ReservationFormDTO() {
    }
    public static ReservationEntity toEntity(ReservationFormDTO dto){
        return new ReservationEntity(0L,dto.getHotel(),dto.getChambre(),dto.getNuits(),dto.getDate(),0);
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getChambre() {
        return chambre;
    }

    public void setChambre(String chambre) {
        this.chambre = chambre;
    }

    public int getNuits() {
        return nuits;
    }

    public void setNuits(int nuits) {
        this.nuits = nuits;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public int getMontant() {
        return montant;
    }

    public void setMontant(int montant) {
        this.montant = montant;
    }
}
