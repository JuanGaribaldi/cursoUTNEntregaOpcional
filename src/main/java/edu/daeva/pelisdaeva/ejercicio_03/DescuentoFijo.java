package edu.daeva.pelisdaeva.ejercicio_03;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@DiscriminatorValue("descuento_fijo")
public class DescuentoFijo extends Decorado {

    @Column
    private String nombre;

    @Column
    private Double valor;

    public Double precio() {
        return this.producto.precio() - this.valor;
    }

    public DescuentoFijo() {

    }
}
