package com.jpalomino.reto_tecnico.web.tipocambio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
@EnableFeignClients
public class TipocambioApplication {

	public static void main(String[] args) {
		SpringApplication.run(TipocambioApplication.class, args);
	}

}
