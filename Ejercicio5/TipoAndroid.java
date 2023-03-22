package Ejercicio5;

public class TipoAndroid implements IAplicacion{

    private String build;

    public TipoAndroid(String build) {
        this.build = build;
    }

    @Override
    public void login() {
        System.out.println("Estamos haciendo login en Android");
    }

    @Override
    public void logout() {
        System.out.println("Estamos haciendo logout en Android");
    }

    @Override
    public void reportes() {
        System.out.println("Sacando reporte en Android");
        System.out.println("Version del build: "+build);
    }
}
