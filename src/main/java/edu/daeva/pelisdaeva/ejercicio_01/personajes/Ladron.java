package edu.daeva.pelisdaeva.ejercicio_01.personajes;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue("ladron")
public class Ladron extends Personaje {

    @Column
    private Integer nivelSiniestro;

    @Column
    private Boolean tieneNavaja;

    public void atacar(Personaje personaje) {
        //TODO
    }
}
