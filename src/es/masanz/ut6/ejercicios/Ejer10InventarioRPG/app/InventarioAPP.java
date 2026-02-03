package es.masanz.ut6.ejercicios.Ejer10InventarioRPG.app;

import es.masanz.ut6.ejercicios.Ejer10InventarioRPG.dao.InventarioDAO;
import es.masanz.ut6.ejercicios.Ejer10InventarioRPG.gui.InventarioGUI;
import es.masanz.ut6.ejercicios.Ejer10InventarioRPG.model.Item;

import java.util.ArrayList;
import java.util.List;

import static es.masanz.ut6.ejercicios.Ejer10InventarioRPG.dao.InventarioDAO.obtenerItems;

public class InventarioAPP {

    private int ciclos;

    public InventarioAPP(int ciclos) {
        this.ciclos = ciclos;
    }

    public void jugar(){
        InventarioDAO.inicializarInventario();
        for (int i = 0; i < ciclos; i++) {
            irDeAventura();
        }
    }

    public void irDeAventura(){
        agregarItems();
        perderItems();
        mostrarInventario();
    }

    private void mostrarInventario() {
        List<Item> items = InventarioDAO.obtenerItems();
        for (Item item : items) {
            InventarioGUI.mostrarItem(item);
        }
    }

    private void agregarItems() {
        Item itemRandom = generarItem();
        InventarioGUI.mostrarItem(itemRandom);
        InventarioDAO.agregarItem(itemRandom);
    }

    private void perderItems() {
        // TODO: Obtener item de inventario y restarlo
        Item item = new Item();
        InventarioGUI.mostrarItem(item);
        InventarioDAO.perderItems(item);
    }

    private Item generarItem() {
        // TODO: Generar un item alatorio con una cantidad aleatoria
        Item item = new Item();
        return item;
    }
}
