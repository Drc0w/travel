package org.acme.travel.domain.chambre;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ColChambreRepositoryImpl implements  ChambreRepository {

    private List<ChambreEntity> chambres;

    public ColChambreRepositoryImpl() {
        this.chambres= new ArrayList<>();
        this.chambres.add(new ChambreEntity(1,"Simple",100));
        this.chambres.add(new ChambreEntity(2,"Double",200));
        this.chambres.add(new ChambreEntity(3,"Triple",300));

    }

    @Override
    public List<ChambreEntity> findAll() {
        return this.chambres;
    }
}
