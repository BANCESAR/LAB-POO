package Lab5;

// Excepción para saldo insuficiente
class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}

// Excepción para límite de sobregiro excedido
class LimiteSobregiroExcedidoException extends Exception {
    public LimiteSobregiroExcedidoException(String mensaje) {
        super(mensaje);
    }
}

// Clase base CuentaBancaria
class CuentaBancaria {
    protected double saldo; // Saldo de la cuenta

    // Constructor
    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método para retirar dinero
    public void retirar(double cantidad) throws SaldoInsuficienteException {
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para retirar " + cantidad);
        }
        saldo -= cantidad;
        System.out.println("Retiro exitoso. Saldo restante: " + saldo);
    }

    // Método para consultar el saldo
    public double consultarSaldo() {
        return saldo;
    }
}

// Subclase CuentaCorriente
class CuentaCorriente extends CuentaBancaria {
    private double limiteSobregiro; // Límite de sobregiro permitido

    // Constructor
    public CuentaCorriente(double saldoInicial, double limiteSobregiro) {
        super(saldoInicial);
        this.limiteSobregiro = limiteSobregiro;
    }

    // Sobrescribiendo el método retirar
    @Override
    public void retirar(double cantidad) throws SaldoInsuficienteException, LimiteSobregiroExcedidoException {
        if (cantidad > saldo + limiteSobregiro) {
            throw new LimiteSobregiroExcedidoException("Límite de sobregiro excedido. No se puede retirar " + cantidad);
        }
        saldo -= cantidad;
        System.out.println("Retiro exitoso. Saldo restante: " + saldo);
    }
}

// Clase principal
public class EjercicioParte05 {
    public static void main(String[] args) {
        try {
            // Crear una cuenta bancaria
            CuentaBancaria cuenta = new CuentaBancaria(1000);
            cuenta.retirar(200); // Retiro exitoso
            cuenta.retirar(900); // Esto lanzará una excepción

        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Crear una cuenta corriente
            CuentaCorriente cuentaCorriente = new CuentaCorriente(500, 300);
            cuentaCorriente.retirar(600); // Esto lanzará una excepción de sobregiro
        } catch (LimiteSobregiroExcedidoException e) {
            System.out.println(e.getMessage());
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}

