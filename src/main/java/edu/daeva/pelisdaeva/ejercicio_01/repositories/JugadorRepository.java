package edu.daeva.pelisdaeva.ejercicio_01.repositories;

import edu.daeva.pelisdaeva.ejercicio_01.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JugadorRepository extends CrudRepository<Jugador, Long> {

}
