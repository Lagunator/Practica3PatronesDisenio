package Ejercicio5;

public class TipoIOS implements IAplicacion{

    private String build;

    public TipoIOS(String build) {
        this.build = build;
    }

    @Override
    public void login() {
        System.out.println("Estamos haciendo login en IOS");
    }

    @Override
    public void logout() {
        System.out.println("Estamos haciendo logout en IOS");
    }

    @Override
    public void reportes() {
        System.out.println("Sacando reporte en IOS");
        System.out.println("Version del build: "+build);
    }
}
