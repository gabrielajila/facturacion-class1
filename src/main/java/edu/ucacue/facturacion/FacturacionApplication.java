package edu.ucacue.facturacion;

import java.io.FileNotFoundException;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import edu.ucacue.facturacion.controlador.principal;

@SpringBootApplication

public class FacturacionApplication {

	public static void main(String[] args)  throws FileNotFoundException{
		//SpringApplication.run(FacturacionApplication.class, args);
		ConfigurableApplicationContext contexto = new SpringApplicationBuilder(FacturacionApplication.class)
				.headless(false)
				.web(WebApplicationType.NONE)
				.run(args);
		
		principal p= contexto.getBean(principal.class);
		p.insertarPersona();
	}

}
