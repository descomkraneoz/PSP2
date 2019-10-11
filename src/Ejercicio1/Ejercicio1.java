package Ejercicio1;

public class Ejercicio1 {
    public static void main(String[] args) {
        Hola hola = new Hola();
        Adios adios = new Adios();
        Thread threadHola = new Thread(hola);
        Thread threadAdios = new Thread(adios);
        threadHola.start();
        threadAdios.start();
    }
}
