package Ejercicio3;

public class ContarRapido implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(1500);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
