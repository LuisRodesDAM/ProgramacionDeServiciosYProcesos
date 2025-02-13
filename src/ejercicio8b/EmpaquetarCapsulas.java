package src.ejercicio8b;

import java.util.Random;

public class EmpaquetarCapsulas implements Runnable {
    private Contenedor contenedor;
    private boolean ejecutar = true;
    Random rand = new Random();
    public EmpaquetarCapsulas(Contenedor contenedor) {
        this.contenedor = contenedor;
    }
    @Override
    public void run() {
        while (ejecutar) {
            synchronized (contenedor) {
                while(contenedor.totalCapsulas() < 6){
                    try {
                        System.out.println("No hay suficientes Capsulas");
                        contenedor.wait();
                        System.out.println("Ya hay suficientes Capsulas");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("Empaquetador: creando Caja");
                contenedor.eliminarCapsulas();
                try {
                    Thread.sleep(rand.nextInt(1000,3000));
                    System.out.println("Empaquetador: Caja Creada");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
