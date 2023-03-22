package Ejercicio2;

public class PagoAppEmpresa implements Pago {
    @Override
    public double realizarPago(double precio) {
        return precio * 0.90;
    }
}
