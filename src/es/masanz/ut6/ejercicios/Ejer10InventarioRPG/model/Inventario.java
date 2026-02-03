package es.masanz.ut6.ejercicios.Ejer10InventarioRPG.model;

import java.util.HashMap;
import java.util.Map;

public class Inventario {

    Map<String, Item> inventario = new HashMap<>();

    public Map<String, Item> getInventario() {
        return inventario;
    }

    public void setInventario(Map<String, Item> inventario) {
        this.inventario = inventario;
    }
}
