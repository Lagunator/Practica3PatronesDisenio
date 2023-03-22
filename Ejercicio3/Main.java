package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Archivo archivo1 = new ArchivoBase(100);
        Archivo archivo2 = new ArchivoBase(200);
        Archivo archivo3 = new ArchivoBase(300);
        Archivo archivo4 = new ArchivoBase(400);

        Folder folder1 = new Folder();
        folder1.addArchivo(archivo1);
        folder1.addArchivo(archivo2);

        Folder folder2 = new Folder();
        folder2.addArchivo(folder1);
        folder2.addArchivo(archivo3);

        UnidadDisco unidadDisco = new UnidadDisco();
        unidadDisco.addArchivo(folder2);
        unidadDisco.addArchivo(archivo4);

        int numeroPalabrasFolder = folder2.getNumeroPalabras();
        int numeroPalabrasUnidadDisco = unidadDisco.getNumeroPalabras();

        System.out.println("Número de palabras en el folder: " + numeroPalabrasFolder);
        System.out.println("Número de palabras en la unidad de disco: " + numeroPalabrasUnidadDisco);
    }
}

