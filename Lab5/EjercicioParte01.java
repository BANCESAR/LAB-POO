package Lab5;

// Clase abstracta Forma
abstract class Forma {
    // Método abstracto para calcular el área
    abstract double calcularArea();
}

// Clase concreta Triangulo que hereda de Forma
class Triangulo extends Forma {
    private double base;
    private double altura;

    // Constructor
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Implementación del método calcularArea
    @Override
    double calcularArea() {
        return (base * altura) / 2;
    }
}

// Clase concreta Cuadrado que hereda de Forma
class Cuadrado extends Forma {
    private double lado;

    // Constructor
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    // Implementación del método calcularArea
    @Override
    double calcularArea() {
        return lado * lado;
    }
}

// Clase principal
public class EjercicioParte01 {
    public static void main(String[] args) {
        // Crear instancias de Triangulo y Cuadrado
        Forma triangulo = new Triangulo(5, 10); // Base 5, Altura 10
        Forma cuadrado = new Cuadrado(4); // Lado 4

        // Calcular y mostrar áreas
        System.out.println("Área del Triángulo: " + triangulo.calcularArea());
        System.out.println("Área del Cuadrado: " + cuadrado.calcularArea());
    }
}

