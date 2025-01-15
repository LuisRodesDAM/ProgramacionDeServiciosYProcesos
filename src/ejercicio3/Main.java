package src.ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Thread> hilos = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el numero de hilos: ");
        int numeroHilos = sc.nextInt();
        for (int i = 1; i <= numeroHilos; i++) {
            Primos bp = new Primos();
            Thread hilo = new Thread(bp);
            hilos.add(hilo);
            hilo.setName("Hilo " + i);
            hilo.start();
        }
        boolean quedanHilos = true;
        while (quedanHilos) {
            quedanHilos = false;
            for(Thread hilo : hilos) {
                System.out.println(hilo.threadId() + " "  +hilo.getName() + " "+ hilo.getState());
                if(hilo.isAlive()) {
                    quedanHilos = true;
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
