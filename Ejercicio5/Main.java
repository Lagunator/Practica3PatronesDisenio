package Ejercicio5;

public class Main {
    public static void main(String[] args){
        TipoTransformador webApp = new TipoTransformador(new TipoWeb("1.1.2"));
        TipoTransformador escritorioApp = new TipoTransformador(new TipoEscritorio("1.0.0"));
        TipoAndroid androidApp = new TipoAndroid("2.3.2");
        TipoIOS iosApp = new TipoIOS("2.3.0");
        TipoWindowsPhone windowsApp = new TipoWindowsPhone("2.0.0");

        iosApp.reportes();

        System.out.println();

        escritorioApp.reportes();
    }
}
