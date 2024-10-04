package com.jpalomino.reto_tecnico.web.tipocambio.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jpalomino.reto_tecnico.web.tipocambio.entities.Moneda;
import com.jpalomino.reto_tecnico.web.tipocambio.services.MonedaService;


@RestController
public class MonedaRestController {

    private final MonedaService monedaService;

    public MonedaRestController(MonedaService monedaService) {
        this.monedaService = monedaService;
    }

    @PostMapping("/tipo-cambio")
    public ResponseEntity<Moneda> obtenerTipoCambio(@RequestParam String apiKey,
                                                 @RequestParam String monedaBase,
                                                 @RequestParam String monedaDestino,
                                                 @RequestBody Moneda moneda) {
        Double monto = moneda.getMonto();
        return ResponseEntity.ok(monedaService.obtenerTipoCambio(apiKey, monedaBase, monedaDestino,monto));
    }

}
