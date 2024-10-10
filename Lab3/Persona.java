package Lab3;

public class Persona {
    private String nombre;
    private int edad;
    private String correoElectronico;

    // Constructor
    public Persona(String nombre, int edad, String correoElectronico) {
        this.nombre = nombre;
        this.edad = edad;
        this.correoElectronico = correoElectronico;
    }

    // Métodos get y set para nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos get y set para edad
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }

    // Métodos get y set para correo electrónico
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        // Validación básica para correo electrónico
        if (correoElectronico.contains("@")) {
            this.correoElectronico = correoElectronico;
        } else {
            System.out.println("Correo electrónico no válido.");
        }
    }
}

