package edu.daeva.pelisdaeva.ejercicio_03;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Entity
@DiscriminatorValue("producto_combo")
public class Combo extends Producto {

    @Getter
    @ManyToMany
    @JoinTable(name = "combo_x_producto"
            ,  joinColumns = @JoinColumn(name = "combo_id")
            ,  inverseJoinColumns = @JoinColumn(name = "producto_id"))
    private List<Producto> productos;

    public Combo(){
        this.productos = new ArrayList<Producto>();
    }

    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }

    public Double precio(){
        return this.productos.stream().mapToDouble(p-> p.precio()).sum();
    }
}
