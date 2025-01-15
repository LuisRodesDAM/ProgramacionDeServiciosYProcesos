package src.ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de hilos: ");
        int numeroHilos = sc.nextInt();
        for (int i = 1; i <= numeroHilos; i++) {
            primos bp = new primos();
            Thread hilo = new Thread(bp);
            hilo.setName("Hilo " + i);
            hilo.start();
        }
    }
}
