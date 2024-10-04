package com.jpalomino.reto_tecnico.web.tipocambio.services;


import com.jpalomino.reto_tecnico.web.tipocambio.entities.Moneda;

public interface MonedaService {

    Moneda obtenerTipoCambio(String apiKey, String monedaBase, String monedaDestino , Double monto);

    // List<Item> findAll();
    // Optional<Item> findById(Long id);
    // Product save (Product product);
    // Product update (Product product, Long id);
    // void delete (Long id);

}
