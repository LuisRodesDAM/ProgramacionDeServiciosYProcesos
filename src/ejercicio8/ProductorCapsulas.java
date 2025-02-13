package src.ejercicio8;

import src.ejercicio8b.Capsula;
import src.ejercicio8b.Contenedor;

import java.util.Random;

public class ProductorCapsulas implements Runnable {
    private boolean ejecutando = true;
    public void detener() {
        ejecutando = false;
    }
    private String variedadCafe;
    private int intensidad;
    private src.ejercicio8b.Contenedor contenedor;
    public ProductorCapsulas(String variedadCafe, int intensidad, Contenedor contenedor) {
        this.variedadCafe = variedadCafe;
        this.intensidad = intensidad;
        this.contenedor = contenedor;

    }
    @Override
    public void run() {
        Random random = new Random();
        while (ejecutando) {
            src.ejercicio8b.Capsula c = new Capsula(variedadCafe, intensidad);
            synchronized (contenedor) {
                contenedor.anyadirCapsula(c);
                System.out.println("Productor: Capsula Añadida.Total de Capsulas " + contenedor.totalCapsulas());
                if(contenedor.totalCapsulas()>= 6){
                    contenedor.notify();
                }
            }

            try {
                Thread.sleep(random.nextInt(500, 1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
