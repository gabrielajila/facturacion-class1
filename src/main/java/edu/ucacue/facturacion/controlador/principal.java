package edu.ucacue.facturacion.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import edu.ucacue.facturacion.infraestructura.repositorio.PersonaRepositorio;
import edu.ucacue.facturacion.modelo.persona;

@Controller

public class principal {
	@Autowired
	PersonaRepositorio personaRepositorio;
	
	public principal() {
		
		
	}
	
	

	public void insertarPersona() {
		persona p1=new persona(1, "Gabriela", "Ajila", "64565","653425243231");
		personaRepositorio.save(p1);
		
	}

}
