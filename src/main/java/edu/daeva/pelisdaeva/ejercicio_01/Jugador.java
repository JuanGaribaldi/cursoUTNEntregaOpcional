package edu.daeva.pelisdaeva.ejercicio_01;


import edu.daeva.pelisdaeva.ejercicio_01.personajes.Personaje;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name="jugador")
public class Jugador {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column
  private String nombre;

  @Column
  private String apellido;

  @Column
  private LocalDate fechaAlta;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name="personaje_id",referencedColumnName = "id")
  private Personaje personaje;

  public Jugador() {
    this.fechaAlta = LocalDate.now();
  }

  public void cambiarPersonaje(Personaje personaje) {
    this.personaje = personaje;
  }
}
