package src.ejercicio3;

import java.util.Random;

public class Primos implements Runnable {
    @Override
    public void run() {
        Random rand = new Random();
        String nombre = Thread.currentThread().getName();
        int numAleatorio = rand.nextInt(50);
        System.out.println(nombre + " busca primos hasta " + numAleatorio);
        for (int i = 1; i < numAleatorio; i++) {
            if (esPrimo(i)) {
                System.out.println(nombre +" : Numero primo " + i);
                try {
                    Thread.sleep(rand.nextInt(500 , 1500));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
    public boolean esPrimo(int num) {
        boolean primo = true;
        if(num < 2) {
            primo = false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
            }
        }
        return primo;
    }
}
