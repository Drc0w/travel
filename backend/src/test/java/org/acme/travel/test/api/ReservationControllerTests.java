package org.acme.travel.test.api;

import org.acme.travel.api.rest.reservation.ReservationController;
import org.acme.travel.application.reservation.ReservationFacade;
import org.acme.travel.domain.reservation.ReservationEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ReservationController.class)
public class ReservationControllerTests {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private ReservationFacade facade;

    @Test
    void testGetReservations_shouldReturnJsonArray() throws  Exception{
        List<ReservationEntity> reservations= new ArrayList<>();
        reservations.add(new ReservationEntity(1L,"Ritz","Simple",1,"2022-03-03",100));
        reservations.add(new ReservationEntity(2L,"Platza","Double",2,"2022-03-03",200));
        reservations.add(new ReservationEntity(3L,"Hilton","Triple",3,"2022-03-03",300));
        when(this.facade.findAll()).thenReturn( reservations);

        mvc.perform(get("/api/reservations").accept(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk());

    }
}
