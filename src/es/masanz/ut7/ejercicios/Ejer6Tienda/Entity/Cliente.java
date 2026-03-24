package es.masanz.ut7.ejercicios.Ejer6Tienda.Entity;

import es.masanz.ut7.ejercicios.Ejer6Tienda.Base.Producto;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nombre;
    private double dinero;
    private List<Producto> productosComprados;

    public Cliente(String nombre, double dinero) {
        this.nombre = nombre;
        this.dinero = dinero;
        productosComprados = new ArrayList<>();
    }

    public void comprar(Producto p){
        if (p.getPrecio() < dinero){
            productosComprados.add(p);
            dinero = dinero - p.getPrecio();
        }
    }
}
