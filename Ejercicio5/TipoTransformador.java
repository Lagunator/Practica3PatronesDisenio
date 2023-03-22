package Ejercicio5;

public class TipoTransformador implements IAplicacion{

    IPCApp app;

    public TipoTransformador(IPCApp app) {
        this.app = app;
    }

    @Override
    public void login() {
        app.iniciarSesion();
    }

    @Override
    public void logout() {
        app.cerrarSesion();
    }

    @Override
    public void reportes() {
        app.generacionDeDatos();
    }
}
