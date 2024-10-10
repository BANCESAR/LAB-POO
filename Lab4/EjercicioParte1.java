package Lab4;

public class EjercicioParte1 {

    // Clase base Vehiculo
    public static class Vehiculo {
        protected String marca;
        protected String modelo;

        // Constructor
        public Vehiculo(String marca, String modelo) {
            this.marca = marca;
            this.modelo = modelo;
        }

        // Método para mostrar información del vehículo
        public void mostrarInfo() {
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
        }
    }

    // Clase derivada VehiculoMotorizado
    public static class VehiculoMotorizado extends Vehiculo {
        protected double capacidadMotor; // En litros

        // Constructor
        public VehiculoMotorizado(String marca, String modelo, double capacidadMotor) {
            super(marca, modelo);
            this.capacidadMotor = capacidadMotor;
        }

        // Método para mostrar información del vehículo motorizado
        @Override
        public void mostrarInfo() {
            super.mostrarInfo();
            System.out.println("Capacidad del motor: " + capacidadMotor + " L");
        }
    }

    // Clase derivada final Coche
    public static class Coche extends VehiculoMotorizado {
        private int numeroPuertas;

        // Constructor
        public Coche(String marca, String modelo, double capacidadMotor, int numeroPuertas) {
            super(marca, modelo, capacidadMotor);
            this.numeroPuertas = numeroPuertas;
        }

        // Método para mostrar información del coche
        @Override
        public void mostrarInfo() {
            super.mostrarInfo();
            System.out.println("Número de puertas: " + numeroPuertas);
        }
    }

    // Clase derivada final Motocicleta
    public static class Motocicleta extends VehiculoMotorizado {
        private boolean tieneSidecar;

        // Constructor
        public Motocicleta(String marca, String modelo, double capacidadMotor, boolean tieneSidecar) {
            super(marca, modelo, capacidadMotor);
            this.tieneSidecar = tieneSidecar;
        }

        // Método para mostrar información de la motocicleta
        @Override
        public void mostrarInfo() {
            super.mostrarInfo();
            System.out.println("¿Tiene sidecar?: " + (tieneSidecar ? "Sí" : "No"));
        }
    }

    // Clase principal
    public static void main(String[] args) {
        // Crear un objeto de la clase Coche
        Coche coche = new Coche("Toyota", "Corolla", 1.8, 4);
        System.out.println("Información del Coche:");
        coche.mostrarInfo();

        System.out.println(); // Salto de línea para separar

        // Crear un objeto de la clase Motocicleta
        Motocicleta moto = new Motocicleta("Honda", "CBR", 0.6, false);
        System.out.println("Información de la Motocicleta:");
        moto.mostrarInfo();
    }
}
