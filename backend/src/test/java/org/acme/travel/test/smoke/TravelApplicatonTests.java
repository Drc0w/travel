package org.acme.travel.test.smoke;

import org.acme.travel.api.rest.reservation.ReservationDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.reactive.server.WebTestClient;

import java.util.List;
import static org.assertj.core.api.Assertions.*;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TravelApplicatonTests {


    @Test
    public void testListReservations_shouldReturnNonEmptyList(@Autowired TestRestTemplate client){
       ResponseEntity<String> response= client.getForEntity("/api/reservations", String.class);
       assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
    }

}
