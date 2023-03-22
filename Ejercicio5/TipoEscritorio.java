package Ejercicio5;

public class TipoEscritorio implements IPCApp{
    private String build;

    public TipoEscritorio(String build) {
        this.build = build;
    }

    @Override
    public void iniciarSesion() {
        System.out.println("Iniciando Sesion en Escritorio");
    }

    @Override
    public void cerrarSesion() {
        System.out.println("Cerrando Sesion en Escritorio");
    }

    @Override
    public void generacionDeDatos() {
        System.out.println("Generando datos en Escritorio");
        System.out.println("Version del build: "+build);
    }
}
