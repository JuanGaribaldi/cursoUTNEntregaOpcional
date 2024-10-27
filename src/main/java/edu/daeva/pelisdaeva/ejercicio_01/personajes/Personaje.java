package edu.daeva.pelisdaeva.ejercicio_01.personajes;


import edu.daeva.pelisdaeva.ejercicio_01.converters.ElementoDefensorConverter;
import edu.daeva.pelisdaeva.ejercicio_01.elementos.ElementoDefensor;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="tipo_personaje")
public abstract class Personaje {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Getter
  @ElementCollection
  @CollectionTable(name="ElementoDefensor")
  @Convert(converter = ElementoDefensorConverter.class)
  @Column(name="elemento")
  private List<ElementoDefensor> elementos;

  @Getter @Setter
  @Column
  private Integer estamina;

  @Getter @Setter
  @Column
  private Integer puntosDeVida;

  public Personaje(){
    this.elementos = new ArrayList<>();
  }

  public void atacar(Personaje personaje) {
  //todo
  }

  public void agregarElemento(ElementoDefensor elemento){
    this.elementos.add(elemento);
  }

}
