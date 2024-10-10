package Lab5;

// Interfaz Movible
interface Movible {
    void moverse(); // Método abstracto para moverse
}

// Clase Coche que implementa la interfaz Movible
class Coche implements Movible {
    @Override
    public void moverse() {
        System.out.println("El coche se mueve por la carretera.");
    }
}

// Clase Avion que implementa la interfaz Movible
class Avion implements Movible {
    @Override
    public void moverse() {
        System.out.println("El avión vuela en el aire.");
    }
}

// Clase principal
public class EjercicioParte02 {
    public static void main(String[] args) {
        // Crear instancias de Coche y Avion
        Movible coche = new Coche();
        Movible avion = new Avion();

        // Llamar al método moverse
        coche.moverse();
        avion.moverse();
    }
}
