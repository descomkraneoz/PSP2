package Ejercicio3;

public class Ejercicio3 {
    public static void main(String[] args) {
        ContarNormal cn = new ContarNormal();
        ContarRapido cr = new ContarRapido();
        Thread threadCN = new Thread(cn);
        Thread threadCR = new Thread(cr);
        threadCN.start();
        threadCR.start();
    }
}
