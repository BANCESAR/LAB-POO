package Lab3;

public class Circulo {
    private final double radio;

    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Método para calcular el área del círculo
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    // Método para obtener el valor del radio
    public double getRadio() {
        return radio;
    }
}

