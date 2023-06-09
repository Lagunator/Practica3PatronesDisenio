package Ejercicio5;

public class TipoWeb implements IPCApp{

    private String build;

    public TipoWeb(String build) {
        this.build = build;
    }

    @Override
    public void iniciarSesion() {
        System.out.println("Iniciando Sesion en Web");
    }

    @Override
    public void cerrarSesion() {
        System.out.println("Cerrando Sesion en Web");
    }

    @Override
    public void generacionDeDatos() {
        System.out.println("Generando datos en Web");
        System.out.println("Version del build: "+build);
    }
}
