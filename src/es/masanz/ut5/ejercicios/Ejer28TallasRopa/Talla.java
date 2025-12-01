package es.masanz.ut5.ejercicios.Ejer28TallasRopa;

public enum Talla {

    S("Pequeña"),
    M("Mediana"),
    L("Grande"),
    XL("Extra Grande"),
    XXL("Doble Extra Grande");

    private final String descripcion;

    Talla(String texto) {
        this.descripcion = texto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "Talla"+name()+" - Descripcion: "+descripcion;
    }
}
