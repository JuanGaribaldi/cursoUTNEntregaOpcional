package edu.daeva.pelisdaeva.ejercicio_01.repositories;

import edu.daeva.pelisdaeva.ejercicio_01.personajes.Personaje;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonajeRepository extends CrudRepository<Personaje, Integer> {
}
