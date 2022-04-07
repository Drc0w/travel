package org.acme.travel.domain.chambre;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Profile("dev")
public class ColChambreRepositoryImpl implements  ChambreRepository {

    private List<ChambreEntity> chambres;

    public ColChambreRepositoryImpl() {
        this.chambres= new ArrayList<>();
        this.chambres.add(new ChambreEntity(1L,"Simple",100));
        this.chambres.add(new ChambreEntity(2L,"Double",200));
        this.chambres.add(new ChambreEntity(3L,"Triple",300));

    }

    @Override
    public List<ChambreEntity> findAll() {
        return this.chambres;
    }
}
