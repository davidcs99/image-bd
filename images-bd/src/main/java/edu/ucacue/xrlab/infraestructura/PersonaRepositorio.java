package edu.ucacue.xrlab.infraestructura;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ucacue.xrlab.modelo.Persona;

public interface PersonaRepositorio extends JpaRepository<Persona, Integer>{

}
