package es.masanz.ut4.Ejercicio34;

public class Biblioteca {

    public int librosDisponibles;
    public int librosPrestados;
    public int visitantes;

    public Biblioteca() {
        // TODO 01: Inicializar librosDisponibles con el valor facilitado
        //  y librosPrestados y visitantes a 0
        this.librosDisponibles = librosDisponibles;
        this.librosPrestados = 0;
        this.visitantes = 0;
    }

    public boolean prestarLibro() {
        // TODO 02: Comprobar si hay libros disponibles
        //  Si hay, disminuir librosDisponibles y aumentar librosPrestados
        if (librosDisponibles <= 0){
            return false;
        } else {
            librosDisponibles--;
            librosPrestados++;
            return true;
        }
    }

    public void devolverLibro() {
        // TODO 03: Si los hay, disminuir librosPrestados y aumentar librosDisponibles
        if (librosPrestados>0) {
            librosPrestados--;
            librosDisponibles++;
        }
    }

    public void recibirVisitante() {
        // TODO 04: Aumentar contador de visitantes
        //  Posiblemente prestar un libro (un 15% de los visitantes suelen llevarse un libro)
        visitantes += 1;
        int probabilidad = (int) (Math.random() * 100) + 1; // 1..=100

        if (probabilidad <= 15){ // 15%
            prestarLibro();
        }
    }

    public void mostrarEstado() {
        // TODO 05: Mostrar libros disponibles, prestados y visitantes
        System.out.println("NºLibros disponibles: "+ librosDisponibles);
        System.out.println("NºLibros prestados: "+librosPrestados);
        System.out.println("NºVisitantes: "+visitantes);
    }

    public void simularDia() {
        // TODO 06: Bucle de varias horas (iteraciones) donde se reciben visitantes,
        //  se actualizar el estado y se devuelven los libros prestados
        for (int i = 0; i < 10; i++) {
            recibirVisitante();
            mostrarEstado();
            devolverLibro();
        }
    }
}
