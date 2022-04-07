package org.acme.travel.api.rest.chambre;

import org.acme.travel.application.chambre.ChambreFacade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ChambreController {

    private final ChambreFacade facade;

    public ChambreController(ChambreFacade facade) {
        this.facade = facade;
    }

    @RequestMapping(method = RequestMethod.GET,path = "/api/chambres")
    public ResponseEntity<List<ChambreDTO>> findAll(){
        return ResponseEntity.ok(
                this.facade.findAll().stream()
                .map(entity->ChambreDTO.map(entity))
                .collect(Collectors.toList())
        );
    }
}
