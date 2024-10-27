package edu.daeva.pelisdaeva;

import edu.daeva.pelisdaeva.ejercicio_01.Jugador;
import edu.daeva.pelisdaeva.ejercicio_01.elementos.Arco;
import edu.daeva.pelisdaeva.ejercicio_01.elementos.Escudo;
import edu.daeva.pelisdaeva.ejercicio_01.elementos.Espada;
import edu.daeva.pelisdaeva.ejercicio_01.personajes.Mago;
import edu.daeva.pelisdaeva.ejercicio_01.repositories.JugadorRepository;
import edu.daeva.pelisdaeva.ejercicio_01.repositories.PersonajeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class Ejercicio01Test {

    @Autowired
    private JugadorRepository jugadorRepository;

    @Autowired
    private PersonajeRepository personajeRepository;

    @Test
    public void testGuardarJugador() {
        Arco arco = new Arco();
        Espada espada = new Espada();
        Escudo escudo = new Escudo();

        //elementoDefensivoRepository.saveAll(Arrays.asList(arco, espada, escudo));

        Mago mago = new Mago();
        mago.setNivelDeMagia(10);
        mago.setTieneAlas(true);
        mago.setEstamina(500);
        mago.setPuntosDeVida(100000);
        mago.agregarElemento(escudo);
        mago.agregarElemento(espada);
        mago.agregarElemento(arco);

        Jugador JugadorNacho = new Jugador();
        JugadorNacho.setApellido("Villa");
        JugadorNacho.setNombre("Nacho");
        JugadorNacho.setPersonaje(mago);


        jugadorRepository.save(JugadorNacho);


    }
}

