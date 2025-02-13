package src.ejercicio8;

import src.ejercicio8b.Contenedor;

public class EmpaquetarCapsulas implements Runnable {
    private src.ejercicio8b.Contenedor contenedor;
    private boolean ejecutar = true;
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
            }
        }

    }
}
