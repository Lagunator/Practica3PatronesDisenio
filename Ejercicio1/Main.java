package Ejercicio1;

public class Main {
    public static void main(String[] args){
        Personaje p1 = new Caballero("DrMasacre", "Espada");
        p1 = new DarArma(p1, "Arco");
        p1 = new DarEscudo(p1);
        p1 = new DarResistencia(p1);

        p1.applyModifier();
    }
}
