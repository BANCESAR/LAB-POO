package Lab1_2;

public class Empleado {
    private String nombre;
    private double salario;
    private String departamento;

    // Constructor
    public Empleado(String nombre, double salario, String departamento) {
        this.nombre = nombre;
        this.salario = salario;
        this.departamento = departamento;
    }

    // Método para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Método para obtener el salario (si fuera necesario dentro de la clase)
    private double getSalario() {
        return salario;
    }

    // Método para obtener el departamento
    public String getDepartamento() {
        return departamento;
    }
}

