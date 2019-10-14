package Ejercicio5;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class AccesoFichero implements Runnable {
    private File fichero;
    private int limiteInferior;
    private int limiteSuperior;
    private int posicion;

    public AccesoFichero(File fichero, int limiteInferior, int limiteSuperior, int posicion) {
        this.fichero = fichero;
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
        this.posicion = posicion;
    }


    public File getFichero() {
        return fichero;
    }

    private synchronized void escribeEnFichero() {
        try {
            Thread.sleep(posicion * 500);
            System.out.println("Empezando escritura de fichero numero:" + posicion);
            BufferedWriter bw = new BufferedWriter(new FileWriter(fichero, true));
            String contenido = "";
            for (int i = limiteInferior; i <= limiteSuperior; i++) {
                contenido += "" + i + " ";
            }
            bw.write(contenido);
            bw.newLine();
            bw.close();
            System.out.println("Escritura de fichero finalizada");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        escribeEnFichero();
    }
}
