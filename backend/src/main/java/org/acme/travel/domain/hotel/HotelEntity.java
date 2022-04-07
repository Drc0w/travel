package org.acme.travel.domain.hotel;



import javax.persistence.*;

@Entity
@Table(name = "HOTELS")
public class HotelEntity {

    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String nom;

    public HotelEntity() {
    }

    public HotelEntity(Long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
