package src.ejercicio5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        System.out.println("Indique frecuencia de segundos y procesos");
        Scanner sc = new Scanner(System.in);
        int segundos = sc.nextInt();
        sc.nextLine();
        Thread t = new Thread(() -> {
            PrintWriter pw = null;
            //int i =1;
            try {
                pw = new PrintWriter(new File("./Ficheros/ejercicio5"));
                while (!Thread.currentThread().isInterrupted()) {
                    //System.out.println("Debes tener " + i + "  frases");
                    //i++;
                    pw.println("Hola Mundo!!!!!!!!");
                    Thread.sleep(segundos*1000);
                }
                //pw.close();
            } catch (FileNotFoundException | InterruptedException e) {
                if(pw != null) {
                    System.out.println("Interrumpiendo HIlo!");
                    pw.close();
                }
                esperar(2);
                System.out.println("Hilo terminado.\nAdios!!!!!!!!!!");
            }

        });
        t.start();
        System.out.println("presiona enter para terminar");
        sc.nextLine();
        t.interrupt();
    }
    public static void esperar(int espera){
        try {
            Thread.sleep(espera * 500);
        } catch (Exception e) {
            System.out.println("Hemos tenido algo inesperado!!!!!!");
        }
    }
}
