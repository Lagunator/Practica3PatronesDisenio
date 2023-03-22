package Ejercicio3;

public class ArchivoBase implements Archivo {
    private int numeroPalabras;

    public ArchivoBase(int numeroPalabras) {
        this.numeroPalabras = numeroPalabras;
    }

    @Override
    public int getNumeroPalabras() {
        return this.numeroPalabras;
    }
}

