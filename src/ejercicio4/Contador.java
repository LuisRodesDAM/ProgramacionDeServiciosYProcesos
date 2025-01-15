package src.ejercicio4;

public class Contador implements Runnable{
    private boolean ejecutar = true;
    private int aleatorio;
    public  Contador(int aleatorio) {
        this.aleatorio = aleatorio;
    }
    int contador = 0;
    @Override
    public void run() {
        while (ejecutar) {
            contador++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //if (contador <=5)
            System.out.println(contador);
        }
        System.out.println("Contador: " + contador + "Aleatorio: " + aleatorio);
        if (contador == aleatorio) {
            System.out.println("Has ganado!!!!!!!");
        } else {
            System.out.println("Has perdido el contador estaba en " + contador);
        }
    }
    public void detener () {
        ejecutar = false;
    }
}
