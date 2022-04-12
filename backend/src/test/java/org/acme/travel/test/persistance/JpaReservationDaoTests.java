package org.acme.travel.test.persistance;

import org.acme.travel.domain.reservation.JpaReservationDao;
import org.acme.travel.domain.reservation.ReservationEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import static org.assertj.core.api.Assertions.*;

@DataJpaTest
public class JpaReservationDaoTests {

    @Autowired
    private TestEntityManager em;
    @Autowired
    private JpaReservationDao sut;

    @Test
    public void testGetReservation_shouldReturnCorrectRecord(){
        this.em.persist(new ReservationEntity(null,"Ritz","DOUBLE",4,"2020-03-03",200));
        ReservationEntity entity=this.sut.findById(1L).get();
        assertThat(entity.getHotel()).isEqualTo("Ritz");
        assertThat(entity.getChambre()).isEqualTo("DOUBLE");

    }
}
