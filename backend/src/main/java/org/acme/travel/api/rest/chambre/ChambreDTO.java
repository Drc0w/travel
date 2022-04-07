package org.acme.travel.api.rest.chambre;

import org.acme.travel.domain.chambre.ChambreEntity;

public class ChambreDTO {

    private ChambreEntity sub;

    public ChambreDTO(ChambreEntity sub) {
        this.sub = sub;
    }
    public static ChambreDTO map(ChambreEntity entity){
        return new ChambreDTO(entity);
    }
    public Long getId(){
        return this.sub.getId();
    }
    public String getCategorie(){
        return this.sub.getCategory();
    }
    public int getPrix(){
        return this.sub.getPrix();
    }

}
