package src.ejercicio8b;

public class Main {
    public static void main(String[] args) {
        Contenedor c = new Contenedor();
        ProductorCapsulas proCap = new ProductorCapsulas("Expresso", 9, c);
        EmpaquetarCapsulas empCap = new EmpaquetarCapsulas(c);
        Thread t = new Thread(proCap);
        t.start();
        Thread t2 = new Thread(empCap);
        t2.start();
    }
}
