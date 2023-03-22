package Ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class UnidadDisco implements Archivo {
    private List<Archivo> archivos = new ArrayList<>();

    public void addArchivo(Archivo archivo) {
        this.archivos.add(archivo);
    }

    public void removeArchivo(Archivo archivo) {
        this.archivos.remove(archivo);
    }

    @Override
    public int getNumeroPalabras() {
        int totalPalabras = 0;
        for (Archivo archivo : this.archivos) {
            totalPalabras += archivo.getNumeroPalabras();
        }
        return totalPalabras;
    }
}

