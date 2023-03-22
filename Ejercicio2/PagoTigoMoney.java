package Ejercicio2;

public class PagoTigoMoney implements Pago {
    @Override
    public double realizarPago(double precio) {
        return precio * 0.98;
    }
}
