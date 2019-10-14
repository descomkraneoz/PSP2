package Ejercicio3;

public class ContarNormal implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
