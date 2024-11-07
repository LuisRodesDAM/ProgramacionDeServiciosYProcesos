package Ejercicio1A;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: " );
        int num = sc.nextInt();
        System.out.println("Introduce el segundo número: ");
        int num2 =sc.nextInt();
        System.out.println("Los Numeros introducidos son : " +num + " y " + num2 + ".");

        Thread t = new Thread(new Runnable() {
            public void run() {
                Random rand = new Random();
                for (int i = num; i < num2; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(rand.nextInt(1000));
                    }catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        t.start();
        System.out.println("El hilo se ha lanzado.");
    }
}
