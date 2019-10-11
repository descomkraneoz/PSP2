package Ejercicio2;

public class ContarAtras implements Runnable {
    private int limite;

    public ContarAtras(int limite){
        this.limite=limite;
    }
    @Override
    public void run() {
        for (int i=limite;i>=0;i--) {
            try {
                Thread.sleep((long) (Math.random() * 1000));
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
