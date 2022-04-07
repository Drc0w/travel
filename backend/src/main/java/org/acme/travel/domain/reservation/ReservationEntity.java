package org.acme.travel.domain.reservation;

import javax.persistence.*;

@Entity
@Table(name = "RESERVATIONS")
public class ReservationEntity {
    @Id @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String hotel;
    @Column(nullable = false)
    private String chambre;
    @Column(nullable = false)
    private int nuits;
    @Column(nullable = false)
    private String date;
    private int montant;

    public ReservationEntity() {
    }

    public ReservationEntity(Long id, String hotel, String chambre, int nuits, String date,int montant) {
        this.id = id;
        this.hotel = hotel;
        this.chambre = chambre;
        this.nuits = nuits;
        this.date = date;
        this.montant=montant;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
