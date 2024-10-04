package com.jpalomino.reto_tecnico.web.tipocambio.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Moneda {

    public Double monto;
    public String moneda_origen;
    public String moneda_destino;
    public Double monto_final;


}
