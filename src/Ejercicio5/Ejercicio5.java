package Ejercicio5;

import java.io.File;

public class Ejercicio5 {
    public static void main(String[] args) {
        try {
            File f = new File("Prueba.txt");
            if (!f.exists()) {
                f.createNewFile();
            }
            Thread t1 = new Thread(new AccesoFichero(f, 11, 20, 1));
            Thread t2 = new Thread(new AccesoFichero(f, 21, 30, 2));
            Thread t3 = new Thread(new AccesoFichero(f, 1, 10, 3));
            t1.start();
            t2.start();
            t3.start();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}