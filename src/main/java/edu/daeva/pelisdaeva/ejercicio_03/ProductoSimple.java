package edu.daeva.pelisdaeva.ejercicio_03;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue("producto_simple")
public class ProductoSimple extends Producto {

    @Column
    private Double precio;

    @Column
    private Integer stock;

    public Double precio() {
        return this.precio;
    }

    public Integer stock() {
        return this.stock;
    }

    public ProductoSimple() {

    }

}
