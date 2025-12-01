package es.masanz.ut5.ejercicios.Ejer29GestionPedidos;

public enum EstadoPedido {

    RECIBIDO("El pedido ha sido recibido"),
    PREPARACION("El pedido está en preparación"),
    ENVIADO("El pedido ha sido enviado"),
    ENTREGADO("El pedido ha sido entregado"),
    CANCELADO("El pedido ha sido cancelado");

    private String estado;

    EstadoPedido(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
}
