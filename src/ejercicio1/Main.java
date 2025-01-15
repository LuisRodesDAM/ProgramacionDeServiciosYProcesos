package src.ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int num = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        Contador c = new Contador(num, num2);
        Thread t = new Thread(c);
        t.start();
        System.out.println("El hilo se ha lanzado: ");


    }
}
