package org.acme.travel.domain.chambre;

public class ChambreEntity {
    private int id;
    private String category;
    private int prix;

    public ChambreEntity() {
    }

    public ChambreEntity(int id, String category, int prix) {
        this.id = id;
        this.category = category;
        this.prix = prix;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
