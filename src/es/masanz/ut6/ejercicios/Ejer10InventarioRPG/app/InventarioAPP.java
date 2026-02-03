package es.masanz.ut6.ejercicios.Ejer10InventarioRPG.app;

import es.masanz.ut6.ejercicios.Ejer10InventarioRPG.dao.InventarioDAO;
import es.masanz.ut6.ejercicios.Ejer10InventarioRPG.gui.InventarioGUI;
import es.masanz.ut6.ejercicios.Ejer10InventarioRPG.model.Item;

import java.util.ArrayList;
import java.util.List;

import static es.masanz.ut6.ejercicios.Ejer10InventarioRPG.dao.InventarioDAO.obtenerItems;

public class InventarioAPP {

    private int ciclos;
    public static final String[] NOMBRE_ITEMS = {
            "Espada de Hierro",
            "Poción de Vida",
            "Escudo de Madera",
            "Amuleto de Maná",
            "Daga de Cobre"
    };

    public InventarioAPP(int ciclos) {
        this.ciclos = ciclos;
    }

    public void jugar(){
        InventarioDAO.inicializarInventario();
        for (int i = 0; i < ciclos; i++) {
            irDeAventura();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void irDeAventura(){
        agregarItems();
        perderItems();
        mostrarInventario();
    }

    private void mostrarInventario() {
        InventarioGUI.mostrarMensaje("\n"+"*".repeat(29));
        InventarioGUI.mostrarMensaje("\n"+"*  Mostrando inventario:   *");
        InventarioGUI.mostrarMensaje("\n"+"*".repeat(29));
        List<Item> items = InventarioDAO.obtenerItems();
        for (Item item : items) {
            InventarioGUI.mostrarItem(item);
        }
    }

    private void agregarItems() {
        Item itemRandom = generarItem();
        InventarioGUI.mostrarMensaje("\n"+"*".repeat(29));
        InventarioGUI.mostrarMensaje("Item encontrado");
        InventarioGUI.mostrarMensaje("\n"+"*".repeat(29));
        InventarioGUI.mostrarItem(itemRandom);
        InventarioDAO.agregarItem(itemRandom);
    }

    private void perderItems() {
        // TODO: Obtener item de inventario y restarlo
        Item item = new Item();
        InventarioGUI.mostrarMensaje("Item perdido");
        InventarioGUI.mostrarItem(item);
        InventarioDAO.perderItems(item);
    }

    private Item generarItem() {

        // TODO: Generar un item alatorio con una cantidad aleatoria
        String nombre = NOMBRE_ITEMS[(int)(Math.random()* NOMBRE_ITEMS.length)];
        Item item = new Item();
        return item;
    }
}
