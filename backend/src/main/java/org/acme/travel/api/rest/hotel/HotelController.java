package org.acme.travel.api.rest.hotel;

import org.acme.travel.application.hotel.HotelFacade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class HotelController {

    private final HotelFacade facade;

    public HotelController(HotelFacade facade) {
        this.facade = facade;
    }

    @RequestMapping(method = RequestMethod.GET ,path = "api/hotels")
    public ResponseEntity<List<HotelDTO>> findAll(){
        return ResponseEntity.ok(
           this.facade.findAll().stream()
                   .map(entity->HotelDTO.map(entity))
                   .collect(Collectors.toList())
        );
    }
}
