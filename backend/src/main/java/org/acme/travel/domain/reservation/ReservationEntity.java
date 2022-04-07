package org.acme.travel.domain.reservation;

public class ReservationEntity {
    private int id;
    private String hotel;
    private String chambre;
    private int nuits;
    private String date;
    private int montant;

    public ReservationEntity() {
    }

    public ReservationEntity(int id, String hotel, String chambre, int nuits, String date,int montant) {
        this.id = id;
        this.hotel = hotel;
        this.chambre = chambre;
        this.nuits = nuits;
        this.date = date;
        this.montant=montant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
