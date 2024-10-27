package edu.daeva.pelisdaeva.ejercicio_02;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "dia_de_entrenamiento")
public class DiaDeEntrenamiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Getter
    @ManyToMany
    @JoinTable(name = "dia_de_entrenamiento_x_ejercicio"
            ,  joinColumns = @JoinColumn(name = "dia_de_entrenamiento_id")
            ,  inverseJoinColumns = @JoinColumn(name = "ejercicio_id"))
    private List<Ejercicio> ejercicios;

    @Column
    private Integer numero; // representa el orden en la duracion de la rutina.

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn(name = "siguiente_dia_id", referencedColumnName = "id")
    private DiaDeEntrenamiento siguienteDia;

    public DiaDeEntrenamiento() {
        this.ejercicios = new ArrayList<>();
    }

    public void agregarEjercicio(Ejercicio ejercicio) {
        this.ejercicios.add(ejercicio);
    }
}
