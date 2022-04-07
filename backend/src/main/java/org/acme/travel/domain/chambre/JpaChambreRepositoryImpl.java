package org.acme.travel.domain.chambre;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Profile("local")
public class JpaChambreRepositoryImpl implements  ChambreRepository {
    private final JpaChambreDao dao;

    public JpaChambreRepositoryImpl(JpaChambreDao dao) {
        this.dao = dao;
    }

    @Override
    public List<ChambreEntity> findAll() {
        return this.dao.findAll();
    }
}
