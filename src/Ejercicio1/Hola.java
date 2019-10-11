package Ejercicio1;

public class Hola implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<10;i++) {
            try {
                Thread.sleep((long) (Math.random() * 3000));
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("Hola");
        }
    }
}