package com.api.parkingcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ParkingControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingControlApplication.class, args);
	}

	@GetMapping("/")
	public String index(){
		return "Olá, mundo!";
	}

	@GetMapping("/index2")
	public Double index2() {
		return 10.50;
	}

	@GetMapping("index3")
	public Double calcularSome() {
		double resultadoSoma = 10.50 + 11.50;
		return resultadoSoma;
	}

}
