package es.masanz.ut5.ejercicios.Ejer29GestionPedidos;

import java.util.Scanner;

public class Pedido {



    private int id;
    private String cliente;
    private EstadoPedido estado;
    private EstadoPedido[] estadoPedidos = EstadoPedido.values();

    public Pedido(int id, String cliente, EstadoPedido estado) {
        this.id = id;
        this.cliente = cliente;
        this.estado = estado;
    }

    public void mostrarEstados(){
        for (EstadoPedido estadoPedido : estadoPedidos) {
            System.out.println(estadoPedido);
        }
    }

    public void actualizarEstado(EstadoPedido nuevoEstado){
        mostrarEstados();
        estado = nuevoEstado;
    }

    public void establecerEstado(Pedido pedido){
        int n = (int)(Math.random()*EstadoPedido.values().length);

        // pedido.estado = EstadoPedido[n];
    }

    public void mostrarDetalles(){
        System.out.println("ID: "+id+" | Ciente: "+cliente+" | Estado: "+estado);
    }
}
