package src.ejercicio8;

import src.ejercicio8b.Capsula;

import java.util.ArrayList;

public class Contenedor {
    private ArrayList<src.ejercicio8b.Capsula> capsulas = new ArrayList<>();
    public void anyadirCapsula(Capsula c) {
        capsulas.add(c);
    }
    public int totalCapsulas() {
        return capsulas.size();
    }
    public void eliminarCapsulas() {
        for(int i = 0; i <=5; i++) {
            capsulas.removeFirst();
        }
    }
}
