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
            if (contador <=5)
                System.out.println(contador);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Contador: " + contador + " - Aleatorio: " + aleatorio);
        if (contador == aleatorio) {
            System.out.println("Has ganado!!!!!!!");
        } else {
            System.out.println("Has perdido el contador estaba en " + contador);
        }
        /*variante de programa, si nos llevamos el if
         ttodo lo relaccionado hay que borrarlo de aqui
         y el contructor y demas tambien y pasar contador con el
         metodo get
         pblic int getContador(){return contador;}
         */
    }
    public void detener () {
        ejecutar = false;
    }
}
