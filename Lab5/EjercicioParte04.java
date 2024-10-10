package Lab5;

// Clase base Vehiculo
class Vehiculo {
    protected String marca; // Marca del vehículo

    // Constructor
    public Vehiculo(String marca) {
        this.marca = marca;
    }

    // Método para mostrar información del vehículo
    public void mostrarInfo() {
        System.out.println("Marca del vehículo: " + marca);
    }
}

// Clase derivada Coche que hereda de Vehiculo
class Coche extends Vehiculo {
    private int numeroPuertas; // Número de puertas del coche

    // Constructor
    public Coche(String marca, int numeroPuertas) {
        super(marca); // Llamada al constructor de la clase base
        this.numeroPuertas = numeroPuertas;
    }

    // Método para mostrar información del coche
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llamar al método de la clase base
        System.out.println("Número de puertas: " + numeroPuertas);
    }
}

// Clase principal
public class EjercicioParte04 {
    public static void main(String[] args) {
        // Crear una instancia de Coche
        Coche coche = new Coche("Toyota", 4);

        // Mostrar información del coche
        coche.mostrarInfo();
    }
}
