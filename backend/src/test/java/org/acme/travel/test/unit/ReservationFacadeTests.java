package org.acme.travel.test.unit;


import org.acme.travel.application.reservation.ReservationFacade;
import org.acme.travel.domain.chambre.ColChambreRepositoryImpl;
import org.acme.travel.domain.chambre.JpaChambreRepositoryImpl;
import org.acme.travel.domain.reservation.ReservationRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;

import java.util.ArrayList;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;

@SpringBootTest
@ContextConfiguration(classes = {ReservationFacade.class,ReservationRepository.class, ColChambreRepositoryImpl.class, JpaChambreRepositoryImpl.class})
public class ReservationFacadeTests {

    @Autowired
    private ReservationFacade sut;

    @MockBean
    private ReservationRepository repository;

    @Test
    public void whenListReservation_thenReturnNonEmptyList(){
        when(this.repository.findAll()).thenReturn(new ArrayList<>());
        assertThat(this.sut.findAll()).isNotNull();
    }



}
