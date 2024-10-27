package edu.daeva.pelisdaeva.ejercicio_02;

import edu.daeva.pelisdaeva.ejercicio_01.converters.ElementoDefensorConverter;
import edu.daeva.pelisdaeva.ejercicio_02.converters.MotivacionConverter;
import edu.daeva.pelisdaeva.ejercicio_02.motivaciones.Motivacion;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "deportista")
public class Deportista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String nombre;

    @Column
    private String apellido;

    @ElementCollection
    @CollectionTable(name="contacto")
    @Column(name="contactos")
    private List<String> contactos;

    @CollectionTable(name="Motivacion")
    @Convert(converter = MotivacionConverter.class)
    @Column(name = "motivacion_principal")
    private Motivacion motivacionPrincipal;

    @Column
    private Double pesoInicialEnKilos;

    public void agregarContacto(String contacto) {
        contactos.add(contacto);
    }

    public Deportista() {
        this.contactos = new ArrayList<>();
    }

}
