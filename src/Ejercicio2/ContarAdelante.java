package Ejercicio2;

public class ContarAdelante implements Runnable{
    private int limite;
    public ContarAdelante(int limite){
        this.limite=limite;
    }
    @Override
    public void run() {
        for (int i=0;i<=limite;i++) {
            try {
                Thread.sleep((long) (Math.random() * 1000));
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}