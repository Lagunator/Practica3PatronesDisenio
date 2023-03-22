package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario(22, "Paul", "hahahaha");
        Usuario usuario2 = new Usuario(7, "Nicolas", "contraseña");
        Usuario usuario3 = new Usuario(31, "Miquel", "nosequeponer");
        Usuario usuario4 = new Usuario(111, "Daniel", "");

        ServidorProxy servidorProxy = new ServidorProxy();

        servidorProxy.servidorUsuario(usuario1);
        servidorProxy.servidorUsuario(usuario2);
        servidorProxy.servidorUsuario(usuario3);
        servidorProxy.servidorUsuario(usuario4);


    }
}

