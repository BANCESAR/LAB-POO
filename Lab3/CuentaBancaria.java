package Lab3;

public class CuentaBancaria {
    public String numeroCuenta;
    private double saldo;
    protected String titular;

    // Constructor
    public CuentaBancaria(String numeroCuenta, double saldo, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

    // Método para depositar dinero
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("La cantidad a depositar debe ser positiva.");
        }
    }

    // Método para retirar dinero
    public void retirar(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("Fondos insuficientes.");
        } else if (cantidad > 0) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("La cantidad a retirar debe ser positiva.");
        }
    }

    // Método para consultar saldo (internamente)
    private double getSaldo() {
        return saldo;
    }
}

