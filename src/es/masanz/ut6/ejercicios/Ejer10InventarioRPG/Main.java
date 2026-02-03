package es.masanz.ut6.ejercicios.Ejer10InventarioRPG;

import es.masanz.ut6.ejercicios.Ejer10InventarioRPG.app.InventarioAPP;
import es.masanz.ut6.ejercicios.Ejer10InventarioRPG.model.Item;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        InventarioAPP aventura = new InventarioAPP(3);
        aventura.jugar();

    }
}
