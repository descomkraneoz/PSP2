package Ejercicio6;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class AccesoFichero implements Runnable {
    private File fichero;
    private int limiteInferior;
    private int limiteSuperior;

    public AccesoFichero(File fichero, int limiteInferior, int limiteSuperior) {
        this.fichero = fichero;
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
    }


    public File getFichero() {
        return fichero;
    }

    private synchronized void escribeEnFichero() {
        try {
            Thread.sleep(1000);
            BufferedWriter bw = new BufferedWriter(new FileWriter(fichero, true));
            String contenido = "";
            for (int i = limiteInferior; i <= limiteSuperior; i++) {
                contenido += "" + i + " ";
            }
            bw.write(contenido);
            bw.newLine();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        escribeEnFichero();
    }
}
