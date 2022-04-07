package org.acme.travel.domain.chambre;

import javax.persistence.*;

@Entity
@Table(name = "CHAMBES")
public class ChambreEntity {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable = false)
    private String category;
    @Column(nullable = false)
    private int prix;

    public ChambreEntity() {
    }

    public ChambreEntity(Long id, String category, int prix) {
        this.id = id;
        this.category = category;
        this.prix = prix;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
}
