package edu.ucacue.facturacion.infraestructura.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ucacue.facturacion.modelo.persona;

public interface PersonaRepositorio extends JpaRepository<persona , Integer>{

}
