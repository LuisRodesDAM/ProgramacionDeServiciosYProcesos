package src.ejercicio4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int aleatorio = rand.nextInt(10, 20);
        Scanner sc = new Scanner(System.in);
        System.out.println("Pulsa enter cuando creas que el contador ha llegado a " + aleatorio);
        //acordarse de crear el hilo y arrqancarlo
        Contador c = new Contador(aleatorio);
        Thread t = new Thread(c);
        t.start();
        sc.nextLine();
        c.detener();
    }
}
