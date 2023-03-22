package Ejercicio2;

public class Instalacion {
    private String tipo;
    private double precio;
    private Pago pago;

    public Instalacion(String tipo, double precio, Pago pago) {
        this.tipo = tipo;
        this.precio = precio;
        this.pago = pago;
    }

    public void realizarPago() {
        double precioFinal = this.pago.realizarPago(this.precio);
        System.out.println("El precio final de la instalación de " + this.tipo + " es: " + precioFinal);
    }
}
