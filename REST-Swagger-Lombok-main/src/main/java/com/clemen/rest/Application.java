package com.clemen.rest;


import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.clemen.rest.entities.Cliente;
import com.clemen.rest.services.impl.ClienteServiceImpl;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext context  = SpringApplication.run(Application.class, args);
		ClienteServiceImpl service = context.getBean(ClienteServiceImpl.class);

		Cliente cliente = new Cliente(null,"Alberto", "Suarez", LocalDate.now(),"49038788E");
		Cliente cliente1 = new Cliente(null,"Enrique", "Rojas", LocalDate.now(),"49038583X");

		service.crearCliente(cliente);
		service.crearCliente(cliente1);


	}


}
