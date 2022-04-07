package org.acme.travel.domain.chambre;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JpaChambreDao extends CrudRepository<ChambreEntity,Long> {
    List<ChambreEntity> findAll();
}
