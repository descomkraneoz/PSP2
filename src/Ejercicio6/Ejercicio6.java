package Ejercicio6;

import java.io.File;

public class Ejercicio6 {
    public static void main(String[] args) {
        try {
            File f = new File("Prueba.txt");
            if (!f.exists()) {
                f.createNewFile();
            }
            Thread t1 = new Thread(new AccesoFichero(f, 1, 10));
            Thread t2 = new Thread(new AccesoFichero(f, 11, 20));
            Thread t3 = new Thread(new AccesoFichero(f, 21, 30));
            /*Las prioridades funcionan unicamente cuando solo esta disponible un hilo.
             * Por defecto intenta usar todos los hilos disponibles. En mi caso, por ejemplo,
             * tiene asignados 16 hilos, por lo que intenta aprovecharlos todos. Si cambio esto
             * a través del administrador de tareas -> detalles -> selecciono el proceso del IDE -> click derecho
             * -> establecer afinidad -> y le asigno un único "procesador", funciona correctamente.
             * */
            t2.setPriority(Thread.NORM_PRIORITY);
            t2.start();
            t3.setPriority(Thread.MIN_PRIORITY);
            t3.start();
            t1.setPriority(Thread.MAX_PRIORITY);
            t1.start();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
