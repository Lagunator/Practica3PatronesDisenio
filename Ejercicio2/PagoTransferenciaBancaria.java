package Ejercicio2;

public class PagoTransferenciaBancaria implements Pago {
    @Override
    public double realizarPago(double precio) {
        return precio * 0.95;
    }
}
