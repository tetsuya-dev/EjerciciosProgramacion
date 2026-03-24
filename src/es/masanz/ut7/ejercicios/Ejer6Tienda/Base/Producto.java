package es.masanz.ut7.ejercicios.Ejer6Tienda.Base;

public abstract class Producto {

    protected String nombre;
    protected double precio;
    protected String marca;

    public Producto(String nombre, double precio, String marca) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
    }

    public abstract String getDescripcion();

    public double aplicarDescuento(double porcentaje){
        double newPrecio = precio - (precio * porcentaje);
        return newPrecio;
    }

    public double getPrecio() {
        return precio;
    }
}
