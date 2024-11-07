package Ejercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: " );
        int num = sc.nextInt();
        System.out.println("Introduce el segundo número: ");
        int num2 =sc.nextInt();
        System.out.println("Los Numeros introducidos son : " +num + " y " + num2 + ".");
        Contador c = new Contador(num,num2);
        Thread t = new Thread(c);
        t.start();
        System.out.println("El hilo se ha lanzado.");
    }
}
