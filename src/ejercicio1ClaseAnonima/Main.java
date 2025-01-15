package src.ejercicio1ClaseAnonima;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int num = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                Random rand = new Random();
                for (int i= num; i <= num2; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(rand.nextInt(1,1500));
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        t.start();
        System.out.println("El hilo se ha lanzado: ");


    }
}
