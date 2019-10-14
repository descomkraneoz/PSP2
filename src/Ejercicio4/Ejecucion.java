package Ejercicio4;

import java.io.IOException;

public class Ejecucion implements Runnable {
    private String comando;
    private int tiempoDeEjecucion;

    public Ejecucion(String comando) {
        this.comando = comando;
    }

    public int getTiempoDeEjecucion() {
        return tiempoDeEjecucion;
    }

    @Override
    public void run() {
        try {
            //Cargo el comando en un proceso
            Process p = Runtime.getRuntime().exec(comando);
            System.out.println("Empieza la ejecución de " + comando);
            //Cálculo del tiempo que lleva ejecutándose
            while (p.isAlive()) {
                tiempoDeEjecucion++;
                Thread.sleep(1000);
            }
            //Fin de la ejecución.
            System.out.println("Acaba la ejecución de " + comando + " - Ha estado ejecutándose " + tiempoDeEjecucion + " segundos.");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }
}
