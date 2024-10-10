package Lab5;

// Clase base Persona
class Persona {
    // Método para saludar
    public void saludar() {
        System.out.println("Hola, soy una persona.");
    }
}

// Clase derivada Estudiante que hereda de Persona
class Estudiante extends Persona {
    private String nombre;

    // Constructor
    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    // Sobrescribiendo el método saludar
    @Override
    public void saludar() {
        System.out.println("Hola, soy el estudiante " + nombre + ".");
    }

    // Sobrecargando el método saludar
    public void saludar(String otraPersona) {
        System.out.println("Hola " + otraPersona + ", soy el estudiante " + nombre + ".");
    }
}

// Clase principal
public class EjercicioParte03 {
    public static void main(String[] args) {
        // Crear una instancia de Persona
        Persona persona = new Persona();
        persona.saludar();

        // Crear una instancia de Estudiante
        Estudiante estudiante = new Estudiante("Juan");
        estudiante.saludar(); // Saludo genérico del estudiante
        estudiante.saludar("Ana"); // Saludo a otra persona
    }
}

