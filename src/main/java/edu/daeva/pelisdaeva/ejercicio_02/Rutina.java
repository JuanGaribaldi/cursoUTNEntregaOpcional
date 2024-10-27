package edu.daeva.pelisdaeva.ejercicio_02;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "rutina")
public class Rutina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="deportista_id", referencedColumnName = "id")
    private Deportista deportista;

    @OneToMany(cascade = CascadeType.ALL)
    private List<DiaDeEntrenamiento> diasDeEntrenamiento;

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn(name = "rutina_anterior_id", referencedColumnName = "id")
    private Rutina rutinaAnterior;

    public Rutina() {
        this.diasDeEntrenamiento = new ArrayList<>();
    }

    public void agregarDiaDeEntrenamiento(DiaDeEntrenamiento diaDeEntrenamiento) {
        this.diasDeEntrenamiento.add(diaDeEntrenamiento);
    }
}
