package edu.daeva.pelisdaeva.ejercicio_01.personajes;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue("mago")
public class Mago extends Personaje {

  @Column
  private Integer nivelDeMagia;

  @Column
  private Boolean tieneAlas;

  public void atacar(Personaje personaje) {
 //TODO
  }


}
