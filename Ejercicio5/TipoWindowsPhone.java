package Ejercicio5;

public class TipoWindowsPhone implements IAplicacion{

    private String build;

    public TipoWindowsPhone(String build) {
        this.build = build;
    }

    @Override
    public void login() {
        System.out.println("Estamos haciendo login en Windows Phone");
    }

    @Override
    public void logout() {
        System.out.println("Estamos haciendo logout en Windows Phone");
    }

    @Override
    public void reportes() {
        System.out.println("Sacando reporte en Windows Phone");
        System.out.println("Version del build: "+build);
    }
}
