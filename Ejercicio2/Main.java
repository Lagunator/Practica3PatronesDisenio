package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Pago pagoEfectivo = new PagoEfectivo();
        Pago pagoTransferencia = new PagoTransferenciaBancaria();
        Pago pagoTigoMoney = new PagoTigoMoney();
        Pago pagoAppEmpresa = new PagoAppEmpresa();

        Instalacion instalacionElectrica = new Instalacion("Electricidad", 1000, pagoEfectivo);
        Instalacion instalacionAgua = new Instalacion("Agua", 2000, pagoTransferencia);
        Instalacion instalacionAlcantarillado = new Instalacion("Alcantarillado", 3000, pagoTigoMoney);
        Instalacion instalacionTelefono = new Instalacion("Teléfono", 4000, pagoAppEmpresa);

        instalacionElectrica.realizarPago();
        instalacionAgua.realizarPago();
        instalacionAlcantarillado.realizarPago();
        instalacionTelefono.realizarPago();
    }
}

