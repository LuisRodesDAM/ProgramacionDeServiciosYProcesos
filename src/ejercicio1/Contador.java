package src.ejercicio1;

import java.util.Random;

public class Contador implements Runnable {
    private int numero1;
    private int numero2;
    public Contador(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    @Override
    public void run() {
        Random rand = new Random();
        for (int i= numero1; i <= numero2; i++) {
            System.out.println(i);
            try {
                Thread.sleep(rand.nextInt(1,1500));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
