package com.jpalomino.reto_tecnico.web.tipocambio.services;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jpalomino.reto_tecnico.web.tipocambio.client.TipoCambioFeignClient;
import com.jpalomino.reto_tecnico.web.tipocambio.entities.Moneda;

@Service
public class MonedaServiceImpl implements MonedaService {

    @Autowired
    TipoCambioFeignClient tipoCambioFeignClient;

    @Override
    public Moneda obtenerTipoCambio(String apiKey, String monedaBase, String monedaDestino, Double monto) {
        Moneda moneda = new Moneda(monto, monedaBase, monedaDestino, null);
        ResponseEntity<Map<String, Object>> response = tipoCambioFeignClient.getTipoCambio(apiKey, monedaBase,
                monedaDestino);
        if (response.getStatusCode().is2xxSuccessful()) {
            Map<String, Object> responseBody = response.getBody();
            if (responseBody != null) {
                Object conversionRateObj = responseBody.get("conversion_rate");
                if (conversionRateObj instanceof Number) {
                    Double conversionRate = ((Number) conversionRateObj).doubleValue();
                    Double montoFinal = monto * conversionRate;
                    moneda.setMonto_final(montoFinal);
                }
            }
        } else {
            throw new RuntimeException("Error al obtener el tipo de cambio");
        }

        return moneda;
    }

    // {
    // "result": "success",
    // "documentation": "https://www.exchangerate-api.com/docs",
    // "terms_of_use": "https://www.exchangerate-api.com/terms",
    // "time_last_update_unix": 1727827201,
    // "time_last_update_utc": "Wed, 02 Oct 2024 00:00:01 +0000",
    // "time_next_update_unix": 1727913601,
    // "time_next_update_utc": "Thu, 03 Oct 2024 00:00:01 +0000",
    // "base_code": "USD",
    // "target_code": "PEN",
    // "conversion_rate": 3.7133
    // }

}
