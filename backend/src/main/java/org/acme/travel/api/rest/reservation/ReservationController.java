package org.acme.travel.api.rest.reservation;

import org.acme.travel.application.reservation.ReservationFacade;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ReservationController {
    private final ReservationFacade facade;
    
    public ReservationController(ReservationFacade facade) {
        this.facade = facade;
    }
    @RequestMapping(method = RequestMethod.GET,path = "api/reservations")
    public ResponseEntity<List<ReservationDTO>> findAll(){
        return ResponseEntity.ok(
                this.facade.findAll().stream()
                .map(entity->ReservationDTO.map(entity))
                .collect(Collectors.toList())
        );
    }

    @RequestMapping(method = RequestMethod.POST, path = "api/reservations", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> save(@RequestBody  ReservationFormDTO dto){
        this.facade.save(ReservationFormDTO.toEntity(dto));
        return ResponseEntity.ok("Réservation approuvée");
        
    }
}
