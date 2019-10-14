package Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        //Programas que el usuario va a abrir
        args = new String[]{"calc.exe", "notepad.exe", "mspaint.exe"};

        try {
            List<Thread> listaHilos = new ArrayList<>();
            //Lleno la lista de hilos con ejecuciones de los argumentos que pasa el usuario.
            for (String arg : args) {
                listaHilos.add(new Thread(new Ejecucion(arg)));
            }
            //Empiezo todas las ejecuciones.
            System.out.println("Empezando todos los hilos.");
            for (Thread t : listaHilos) {
                t.start();
            }
            //Compruebo que hilos están en ejecución cada medio segundo
            while (!listaHilos.isEmpty()) {
                List<Thread> hilosMuertos = new ArrayList<>();
                for (Thread t : listaHilos) {
                    if (!t.isAlive()) {
                        hilosMuertos.add(t);
                    }
                }
                listaHilos.removeAll(hilosMuertos);
                Thread.sleep(500);
            }
            //Si llego aquí todos los hilos estan muertos, por lo que acaba el programa.
            System.out.println("Fin de la ejecución de todos los hilos.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
