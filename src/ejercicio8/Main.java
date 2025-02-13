package src.ejercicio8;

import src.ejercicio8b.Contenedor;
import src.ejercicio8b.EmpaquetarCapsulas;
import src.ejercicio8b.ProductorCapsulas;

public class Main {
    public static void main(String[] args) {
        src.ejercicio8b.Contenedor c = new Contenedor();
        src.ejercicio8b.ProductorCapsulas proCap = new ProductorCapsulas("Expresso", 9, c);
        src.ejercicio8b.EmpaquetarCapsulas empCap = new EmpaquetarCapsulas(c);
        Thread t = new Thread(proCap);
        t.start();
        Thread t2 = new Thread(empCap);
        t2.start();
    }
}
