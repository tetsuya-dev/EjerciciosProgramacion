package es.masanz.ut6.ejercicios.Ejer10InventarioRPG.dao;

import es.masanz.ut6.ejercicios.Ejer10InventarioRPG.model.Item;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class InventarioDAO {

    private static HashMap<String, Item> inventario;

    public static void agregarItem(Item item) {
        // TODO: Agregar al hashmap el item facilitado (check)
        inventario.put(item.getNombre(), item);
    }

    public static void perderItems(Item item) {
        // TODO: Eliminar del hashmap del item facilitado
        inventario.remove(item.getNombre());
    }

    public static void inicializarInventario() {
        // TODO: Crear el hashMap del inventario (check)
        inventario = new HashMap<>();
    }


    public static List<Item> obtenerItems() {

        return null;
    }
}
