package Lab4;

public class EjercicioParte2 {

    // Clase base Empleado
    public static class Empleado {
        protected String nombre;
        protected double salario;

        // Constructor
        public Empleado(String nombre, double salario) {
            this.nombre = nombre;
            this.salario = salario;
        }

        // Método para calcular el bono (10% del salario)
        public double calcularBono() {
            return salario * 0.10;
        }

        // Método para mostrar información del empleado
        public void mostrarInfo() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Salario: " + salario);
            System.out.println("Bono: " + calcularBono());
        }
    }

    // Clase derivada Gerente
    public static class Gerente extends Empleado {

        // Constructor
        public Gerente(String nombre, double salario) {
            super(nombre, salario);
        }

        // Sobrescribiendo el método calcularBono (15% del salario)
        @Override
        public double calcularBono() {
            return salario * 0.15;
        }

        // Método para mostrar información del gerente
        @Override
        public void mostrarInfo() {
            System.out.println("Nombre (Gerente): " + nombre);
            System.out.println("Salario: " + salario);
            System.out.println("Bono: " + calcularBono());
        }
    }

    // Clase principal
    public static void main(String[] args) {
        // Crear un objeto de la clase Empleado
        Empleado empleado = new Empleado("Juan Pérez", 3000);
        System.out.println("Información del Empleado:");
        empleado.mostrarInfo();
        
        System.out.println(); // Salto de línea para separar

        // Crear un objeto de la clase Gerente
        Gerente gerente = new Gerente("María López", 5000);
        System.out.println("Información del Gerente:");
        gerente.mostrarInfo();
    }
}

