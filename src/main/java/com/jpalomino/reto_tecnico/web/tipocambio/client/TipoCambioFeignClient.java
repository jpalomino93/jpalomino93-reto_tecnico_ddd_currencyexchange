package com.jpalomino.reto_tecnico.web.tipocambio.client;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "tipoCambio", url = "https://v6.exchangerate-api.com")
public interface TipoCambioFeignClient {


     @GetMapping("/v6/{apiKey}/pair/{monedaBase}/{monedaDestino}")
     ResponseEntity<Map<String, Object>> getTipoCambio(@PathVariable String apiKey,
                                                       @PathVariable String monedaBase,
                                                       @PathVariable String monedaDestino);
     

}
