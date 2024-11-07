package Ejercicio1;

import java.util.Random;

public class Contador implements Runnable {
    private int n1;
    private int n2;
    public Contador(int n1 , int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    @Override
    public void run() {
        Random rand = new Random();
        for (int i = n1; i < n2; i++) {
            System.out.println(i);
            try {
                    Thread.sleep(rand.nextInt(1000));
            }catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
