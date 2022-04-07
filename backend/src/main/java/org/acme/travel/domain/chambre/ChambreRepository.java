package org.acme.travel.domain.chambre;

import java.util.List;

public interface ChambreRepository {

    public List<ChambreEntity> findAll();
}
