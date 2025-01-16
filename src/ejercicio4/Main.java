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
        /*Se debe llamar al metodo join del hilo por si ejecuta la comprobacion y el hilo
        todavia no se ha parado t.join() e igual nos pide meterlo en try
        variante de programa, nos traemos el if de la clase
        int contador = c.getContador(); asi nos traemos contador de la clase
        if (contador == aleatorio) {
            System.out.println("Has ganado!!!!!!!");
        } else {
            System.out.println("Has perdido el contador estaba en " + contador);
        }
         */
    }
}
